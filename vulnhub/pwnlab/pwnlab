# PwnLab
- **Name**: PwnLab: init
- **Date release**: 1 Aug 2016
- **Author**: [Claor](https://www.vulnhub.com/author/claor,331/)
- **Series**: [PwnLab](https://www.vulnhub.com/series/pwnlab,92/)


# **Description**

Wellcome to "PwnLab: init", my first Boot2Root virtual machine. Meant to be easy, I hope you enjoy it and maybe learn something. The purpose of this CTF is to get root and read de flag.

Can contact me at: claor@pwnlab.net or on Twitter: @Chronicoder

- Difficulty: Low
- Flag: /root/flag.txt

~~~
──(hack㉿you)-[~/vulnhub]
└─$ nmap 192.168.78.171 -sV --min-rate 1000
Starting Nmap 7.93 ( https://nmap.org ) at 2022-11-17 14:36 EST
Nmap scan report for 192.168.78.171
Host is up (0.0010s latency).
Not shown: 997 closed tcp ports (conn-refused)
PORT     STATE SERVICE VERSION
80/tcp   open  http    Apache httpd 2.4.10 ((Debian))
111/tcp  open  rpcbind 2-4 (RPC #100000)
3306/tcp open  mysql   MySQL 5.5.47-0+deb8u1

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 13.62 seconds
~~~

~~~
┌──(hack㉿you)-[~/vulnhub]
└─$ sudo nmap -sC -vv -sV -Pn 192.168.78.1 -oN nmap_result.txt
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times may be slower.
Starting Nmap 7.93 ( https://nmap.org ) at 2022-11-17 12:04 EST
NSE: Loaded 155 scripts for scanning.
NSE: Script Pre-scanning.
NSE: Starting runlevel 1 (of 3) scan.
Initiating NSE at 12:04
Completed NSE at 12:04, 0.00s elapsed
NSE: Starting runlevel 2 (of 3) scan.
Initiating NSE at 12:04
Completed NSE at 12:04, 0.00s elapsed
NSE: Starting runlevel 3 (of 3) scan.
Initiating NSE at 12:04
Completed NSE at 12:04, 0.00s elapsed
Initiating ARP Ping Scan at 12:04
Scanning 192.168.78.1 [1 port]
Completed ARP Ping Scan at 12:04, 0.07s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 12:04
Completed Parallel DNS resolution of 1 host. at 12:04, 0.60s elapsed
Initiating SYN Stealth Scan at 12:04
Scanning 192.168.78.1 [1000 ports]
Discovered open port 443/tcp on 192.168.78.1
Discovered open port 445/tcp on 192.168.78.1
Discovered open port 80/tcp on 192.168.78.1
Discovered open port 135/tcp on 192.168.78.1
Discovered open port 139/tcp on 192.168.78.1
Discovered open port 912/tcp on 192.168.78.1
Discovered open port 902/tcp on 192.168.78.1
Discovered open port 5357/tcp on 192.168.78.1
Completed SYN Stealth Scan at 12:04, 4.51s elapsed (1000 total ports)
Initiating Service scan at 12:04
Scanning 8 services on 192.168.78.1
Completed Service scan at 12:04, 12.28s elapsed (8 services on 1 host)
NSE: Script scanning 192.168.78.1.
NSE: Starting runlevel 1 (of 3) scan.
Initiating NSE at 12:04
NSE Timing: About 99.91% done; ETC: 12:05 (0:00:00 remaining)
Completed NSE at 12:05, 40.06s elapsed
NSE: Starting runlevel 2 (of 3) scan.
Initiating NSE at 12:05
Completed NSE at 12:05, 1.34s elapsed
NSE: Starting runlevel 3 (of 3) scan.
Initiating NSE at 12:05
Completed NSE at 12:05, 0.00s elapsed
Nmap scan report for 192.168.78.1
Host is up, received arp-response (0.00029s latency).
Scanned at 2022-11-17 12:04:41 EST for 58s
Not shown: 992 filtered tcp ports (no-response)
PORT     STATE SERVICE         REASON          VERSION
80/tcp   open  http            syn-ack ttl 128 Apache httpd 2.4.52 ((Win64) OpenSSL/1.1.1m PHP/8.1.2)
| http-title: Welcome to XAMPP
|_Requested resource was http://192.168.78.1/dashboard/
|_http-server-header: Apache/2.4.52 (Win64) OpenSSL/1.1.1m PHP/8.1.2
|_http-favicon: Unknown favicon MD5: 56F7C04657931F2D0B79371B2D6E9820
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
135/tcp  open  msrpc           syn-ack ttl 128 Microsoft Windows RPC
139/tcp  open  netbios-ssn     syn-ack ttl 128 Microsoft Windows netbios-ssn
443/tcp  open  ssl/http        syn-ack ttl 128 Apache httpd 2.4.52 ((Win64) OpenSSL/1.1.1m PHP/8.1.2)
| ssl-cert: Subject: commonName=localhost
| Issuer: commonName=localhost
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2009-11-10T23:48:47
| Not valid after:  2019-11-08T23:48:47
| MD5:   a0a44cc99e84b26f9e639f9ed229dee0
| SHA-1: b0238c547a905bfa119c4e8baccaeacf36491ff6
| -----BEGIN CERTIFICATE-----
| MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
| b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
| VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
| 7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
| J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
| gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
| gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
| aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
| vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
|_-----END CERTIFICATE-----
|_http-server-header: Apache/2.4.52 (Win64) OpenSSL/1.1.1m PHP/8.1.2
|_http-favicon: Unknown favicon MD5: 6EB4A43CB64C97F76562AF703893C8FD
| tls-alpn: 
|_  http/1.1
|_ssl-date: TLS randomness does not represent time
| http-title: Welcome to XAMPP
|_Requested resource was https://192.168.78.1/dashboard/
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
445/tcp  open  microsoft-ds?   syn-ack ttl 128
902/tcp  open  ssl/vmware-auth syn-ack ttl 128 VMware Authentication Daemon 1.10 (Uses VNC, SOAP)
912/tcp  open  vmware-auth     syn-ack ttl 128 VMware Authentication Daemon 1.0 (Uses VNC, SOAP)
5357/tcp open  http            syn-ack ttl 128 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Service Unavailable
MAC Address: 00:50:56:C0:00:08 (VMware)
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: -1h59m22s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 53960/tcp): CLEAN (Timeout)
|   Check 2 (port 46463/tcp): CLEAN (Timeout)
|   Check 3 (port 56450/udp): CLEAN (Timeout)
|   Check 4 (port 47117/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-time: 
|   date: 2022-11-17T15:05:37
|_  start_date: N/A
| nbstat: NetBIOS name: DESKTOP-8LPR33O, NetBIOS user: <unknown>, NetBIOS MAC: 005056c00008 (VMware)
| Names:
|   DESKTOP-8LPR33O<00>  Flags: <unique><active>
|   WORKGROUP<00>        Flags: <group><active>
|   DESKTOP-8LPR33O<20>  Flags: <unique><active>
| Statistics:
|   005056c000080000000000000000000000
|   0000000000000000000000000000000000
|_  0000000000000000000000000000
| smb2-security-mode: 
|   311: 
|_    Message signing enabled but not required

NSE: Script Post-scanning.
NSE: Starting runlevel 1 (of 3) scan.
Initiating NSE at 12:05
Completed NSE at 12:05, 0.00s elapsed
NSE: Starting runlevel 2 (of 3) scan.
Initiating NSE at 12:05
Completed NSE at 12:05, 0.00s elapsed
NSE: Starting runlevel 3 (of 3) scan.
Initiating NSE at 12:05
Completed NSE at 12:05, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 59.55 seconds
           Raw packets sent: 1994 (87.720KB) | Rcvd: 10 (424B)
~~~
~~~
┌──(hack㉿you)-[~/vulnhub]
└─$ nikto -h http://192.168.78.1
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.78.1
+ Target Hostname:    192.168.78.1
+ Target Port:        80
+ Start Time:         2022-11-17 12:20:55 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.4.52 (Win64) OpenSSL/1.1.1m PHP/8.1.2
+ Retrieved x-powered-by header: PHP/8.1.2
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ Root page / redirects to: http://192.168.78.1/dashboard/
+ OSVDB-877: HTTP TRACE method is active, suggesting the host is vulnerable to XST
+ OSVDB-3268: /img/: Directory indexing found.
+ OSVDB-3092: /img/: This might be interesting...
+ OSVDB-3268: /icons/: Directory indexing found.
+ OSVDB-3233: /icons/README: Apache default file found.
+ 8724 requests: 0 error(s) and 9 item(s) reported on remote host
+ End Time:           2022-11-17 12:22:38 (GMT-5) (103 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested


      *********************************************************************
      Portions of the server's headers (PHP/8.1.2 Apache/2.4.52) are not in
      the Nikto 2.1.6 database or are newer than the known string. Would you like
      to submit this information (*no server specific data*) to CIRT.net
      for a Nikto update (or you may email to sullo@cirt.net) (y/n)? y

+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The site uses SSL and the Strict-Transport-Security HTTP header is not defined.
+ The site uses SSL and Expect-CT header is not present.
- Sent updated info to cirt.net -- Thank you!
~~~

~[](image)
