┌──(alpha㉿sploit)-[~/blog]
└─$ ping blog.thm    
PING blog.thm (10.10.115.215) 56(84) bytes of data.
64 bytes from blog.thm (10.10.115.215): icmp_seq=1 ttl=63 time=593 ms
64 bytes from blog.thm (10.10.115.215): icmp_seq=2 ttl=63 time=484 ms
^Z
zsh: suspended  ping blog.thm
                                                                                                                                           
┌──(alpha㉿sploit)-[~/blog]
└─$ sudo nmap 10.10.115.215
Starting Nmap 7.94 ( https://nmap.org ) at 2023-10-03 11:28 EDT
Stats: 0:00:01 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 5.00% done; ETC: 11:29 (0:00:19 remaining)
Stats: 0:01:08 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 60.95% done; ETC: 11:30 (0:00:44 remaining)
Stats: 0:01:58 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 65.67% done; ETC: 11:31 (0:01:02 remaining)
Stats: 0:04:37 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 75.10% done; ETC: 11:34 (0:01:32 remaining)
Stats: 0:08:32 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 98.34% done; ETC: 11:37 (0:00:09 remaining)
Stats: 0:08:33 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 98.44% done; ETC: 11:37 (0:00:08 remaining)
Stats: 0:11:31 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 99.99% done; ETC: 11:40 (0:00:00 remaining)
Stats: 0:11:33 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 99.99% done; ETC: 11:40 (0:00:00 remaining)
Nmap scan report for blog.thm (10.10.115.215)
Host is up (0.18s latency).
Not shown: 996 closed tcp ports (reset)
PORT    STATE SERVICE
22/tcp  open  ssh
80/tcp  open  http
139/tcp open  netbios-ssn
445/tcp open  microsoft-ds

Nmap done: 1 IP address (1 host up) scanned in 718.09 seconds
                                                                                                                                           
┌──(alpha㉿sploit)-[~/blog]

