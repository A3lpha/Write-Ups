# MalBuster

![tryhackme.com - © TryHackMe](https://tryhackme-images.s3.amazonaws.com/room-icons/1eed0879e2fa89505b457358edb98700.png)

## Room Info
You are tasked to analyse unknown malware samples detected by your SOC team.


> **Name**
>
> [malbuster](https://tryhackme.com/room/malbuster)
>
> 
>
> **Description**
>
# Investigation Platform

If you prefer REMnux, you may use the machine attached to this task by accessing it via the split-screen view.

Else, start the machine from the previous task to spin up the FLARE VM.

In addition, you can find the malware samples provided by the SOC team at ```/home/ubuntu/Desktop/Samples.``` 

The machine will start in a split-screen view. In case the VM is not visible, use the blue Show Split View button at the top-right of the page.

WE ADVISE YOU NOT TO DOWNLOAD THE MALWARE SAMPLES TO YOUR HOST.

Good luck!﻿.*
>

Task 1 No Needed Answer

Task 2  Challenge Questions

Based on the ARCHITECTURE of the binary, is malbuster_1 a 32-bit or a 64-bit application? (32-bit/64-bit)

![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/architecture.png)

2. What is the MD5 hash of malbuster_1?
~~~
4348da65e4aeae6472c7f97d6dd8ad8f
~~~
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/md5.png)

3. Using the hash, what is the number of detections of malbuster_1 in VirusTotal?

![](2111)

4. Based on VirusTotal detection, what is the malware signature of malbuster_2 according to Avira?
~~~~
HEUR/AGEN.1202219
~~~~
5. malbuster_2 imports the function _CorExeMain. From which DLL file does it import this function?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2014_58_06-Window.png)
6. Based on the VS_VERSION_INFO header, what is the original name of malbuster_2?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_16_39-Window.png)
7. Using the hash of malbuster_3, what is its malware signature based on abuse.ch?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2014_39_47-Window.png)
8. Using the hash of malbuster_4, what is its malware signature based on abuse.ch?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2014_41_01-Window.png)
9. What is the message found in the DOS_STUB of malbuster_4?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2014_56_21-Window.png)
10. malbuster_4 imports the function ShellExecuteA. From which DLL file does it import this function?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_03_02-Window.png)
11. Using capa, how many anti-VM instructions were identified in malbuster_1?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_02_26-Window.png)
12. Using capa, which binary can log keystrokes?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/keystrokes.png)
13. Using capa, what is the MITRE ID of the DISCOVERY technique used by malbuster_4?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_16_39-Window.png)
14. Which binary contains the string GodMode?  
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_24_11-Window.png)

16. Which binary contains the string Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)?
![](https://github.com/A3lpha/Write-Ups/blob/main/TryHackMe/MalBuster/MalBuster/2023-10-24%2015_20_46-Window.png)



***
