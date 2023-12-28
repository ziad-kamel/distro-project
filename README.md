# distro-project
Flooding-based Distributed File Sharing System

# Run

+ clone the rebo `copy below command`

    ```
    git clone https://github.com/ziad-kamel/distro-project.git
    ```
+ open a terminal and navigate to project directory `distro-project`

+ run a device with below command

    ```
    java project_main_src.MainProgram
    ```

+ select the device id `1 => Bob` `2 => Claire` `3 => Emily`

+ select the network card to work on, eg. `1 => 127.0.0.1`

+ run other two devices with same last four steps

+ enter `1` on second terminal to Connect to overlay network for each device

+ enter `2` to send neighbour request in Connection Overlay

+ enter the port of the first on the seceond device

+ enter the ip address of the first on the seceond device

+ repeat last three steps on the third device terminal but use the port and ip of the second device

## Now you can start using your distributed file sharing system!

+ enter `3` on any device to start the flooding search for a file

+ enter name of the file needed to search for, wait for it to search and read the file

# Note
1. The cloned code is Already Compiled with `jdk 17`, if you want to recomplie it run below steps:
    + from terminal move to the project directory
    + run :
        ```
        javac -cp "<put the absolute path of the project directory>" project_main_src/MainProgram.java
        ```
2. You need to setup `Cipher.exe` [check this for windows](https://support.microsoft.com/en-au/topic/cipher-exe-security-tool-for-the-encrypting-file-system-56c85edd-85cf-ac07-f2f7-ca2d35dab7e4)