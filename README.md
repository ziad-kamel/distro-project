# Distributed Systems Final Project

Flooding-based Distributed File Sharing System

## Usage

1. Clone the repo:

    ```bash
    git clone https://github.com/ziad-kamel/distro-project.git
    ```

2. Navigate to the project directory:

    ```bash 
    cd distro-project
    ```

3. Run a device:

    ```bash
    java main.MainProgram
    ```

4. Select the device ID (e.g. `1` for Bob, `2` for Claire, `3` for Emily)

5. Select the network interface to use

6. Repeat steps 3-5 for each device, using different IDs

7. On each device:

    - Enter `1` to connect to the overlay network

    - Enter `2` to send a neighbor request

    - Enter IP and port of an existing device to connect to

8. You can now search for files using flooding by entering `3` on any device

## Notes

- The code is precompiled for JDK 17. To recompile:

    ```
    javac -cp "<project directory>" main/MainProgram.java 
    ```

- Cipher.exe is required on Windows for encryption. See [Microsoft Docs](https://support.microsoft.com/en-us/topic/cipher-exe-security-tool-for-the-encrypting-file-system-56c85edd-85cf-ac07-f2f7-ca2d35dab7e4)