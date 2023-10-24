# MalBuster

![tryhackme.com - © TryHackMe](https://tryhackme-images.s3.amazonaws.com/room-icons/1eed0879e2fa89505b457358edb98700.png)

## Room Info
You are tasked to analyse unknown malware samples detected by your SOC team.


> **Name**
>
> 🔗 [Blue](https://tryhackme.com/room/blue)
>
> ![](.gitbook/assets/blue.jpg)
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
~~~~
23
~~~~

2. What is the MD5 hash of malbuster_1?
~~~
4348da65e4aeae6472c7f97d6dd8ad8f

## Flags

* In the `meterpreter` session

```bash
cd C:\\
dir
cat flag1.txt
```



<details>

<summary>Reveal Flag1: 🚩</summary>



`flag{access_the_machine}`



<img src=".gitbook/assets/image-20230316143237356.png" alt="" data-size="original">

</details>



```bash
cd C:/Windows/System32/config
cat flag2.txt
```






<details>

<summary>Reveal Flag2: 🚩</summary>



`flag{sam_database_elevated_access}`



<img src=".gitbook/assets/image-20230316143502259.png" alt="" data-size="original">

</details>



```bash
cd C:\\Users\\
dir
cd Jon
cd Documents
cat flag3.txt
```



<details>

<summary>Reveal Flag3: 🚩</summary>



`flag{admin_documents_can_be_valuable}`



<img src=".gitbook/assets/image-20230316143807868.png" alt="" data-size="original">

</details>


***
