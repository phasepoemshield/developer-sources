/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.connection;

import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.connection.BaseConnection;
import eu.donyka.discord.connection.WinRegistry;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class WindowsConnection
extends BaseConnection {
    private RandomAccessFile pipe = null;
    private boolean opened = false;

    @Override
    void close() {
        if (!this.isOpen()) {
            return;
        }
        try {
            this.pipe.close();
        }
        catch (Exception exception) {
        }
        this.opened = false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    boolean open() throws NoDiscordClientException, PipeAccessDenied {
        String pipeName = "\\\\.\\pipe\\discord-ipc-%d";
        if (this.isOpen()) {
            throw new IllegalStateException("Connection is already opened");
        }
        int i = 0;
        while (i < 10) {
            void var2_2;
            Object[] objectArray = new Object[1];
            objectArray[0] = i;
            String pipePath = String.format(pipeName, objectArray);
            try {
                if (new File(pipePath).exists()) {
                    this.pipe = new RandomAccessFile(pipePath, "rw");
                    this.opened = true;
                    return true;
                }
            }
            catch (FileNotFoundException e) {
                if (e.getMessage() != null && e.getMessage().toLowerCase().contains("access is denied")) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = i;
                    throw new PipeAccessDenied("Cannot access pipe " + String.format(pipeName, objectArray2) + " due to permission errors. Ensure discord is NOT running in administrator mode!");
                }
            }
            catch (SecurityException securityException) {
                throw new PipeAccessDenied("Failed to open RPC Connection, with error Access Denied. Is Discord running in Administrator mode?");
            }
            ++var2_2;
        }
        throw new NoDiscordClientException();
    }

    @Override
    boolean read(byte[] bytes, int length) {
        if (bytes == null || bytes.length == 0) {
            return bytes != null;
        }
        if (!this.isOpen()) {
            return false;
        }
        try {
            long available = this.pipe.length() - this.pipe.getFilePointer();
            if (available < (long)length) {
                return false;
            }
            int read = this.pipe.read(bytes, 0, length);
            if (read != length) {
                throw new IOException("Read less data than supplied. Expected: " + length + ". Got: " + read);
            }
            return true;
        }
        catch (IOException iOException) {
            this.close();
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void register(String applicationId, String command) {
        String javaLibraryPath = System.getProperty("java.home");
        File javaExeFile = new File(javaLibraryPath.split(";")[0] + "/bin/java.exe");
        File javawExeFile = new File(javaLibraryPath.split(";")[0] + "/bin/javaw.exe");
        String javaExePath = javaExeFile.exists() ? javaExeFile.getAbsolutePath() : (javawExeFile.exists() ? javawExeFile.getAbsolutePath() : null);
        if (javaExePath == null) {
            throw new RuntimeException("Unable to find java path");
        }
        String openCommand = command != null ? command : javaExePath;
        String protocolName = "discord-" + applicationId;
        String protocolDescription = "URL:Run game " + applicationId + " protocol";
        String keyName = "Software\\Classes\\" + protocolName;
        String iconKeyName = keyName + "\\DefaultIcon";
        String commandKeyName = keyName + "\\DefaultIcon";
        try {
            WinRegistry.createKey(keyName);
            WinRegistry.writeStringValue(keyName, "", protocolDescription);
            WinRegistry.writeStringValue(keyName, "URL Protocol", "\u0000");
            WinRegistry.createKey(iconKeyName);
            WinRegistry.writeStringValue(iconKeyName, "", javaExePath);
            WinRegistry.createKey(commandKeyName);
            WinRegistry.writeStringValue(commandKeyName, "", openCommand);
        }
        catch (Exception ex) {
            void var13_13;
            throw new RuntimeException("Unable to modify Discord registry keys", (Throwable)var13_13);
        }
    }

    @Override
    boolean write(byte[] bytes) {
        if (!this.isOpen()) {
            return false;
        }
        try {
            this.pipe.write(bytes);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    WindowsConnection(DiscordRPC rpc) {
        super(rpc);
    }

    @Override
    boolean isOpen() {
        return this.opened;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void registerSteamGame(String applicationId, String steamId) {
        try {
            String steamPath = WinRegistry.readString();
            if (steamPath == null) {
                throw new RuntimeException("Steam exe path not found");
            }
            steamPath = steamPath.replaceAll("/", "\\");
            String command = "\"" + steamPath + "\" steam://rungameid/" + steamId;
            this.register(applicationId, command);
        }
        catch (Exception ex) {
            void var3_4;
            throw new RuntimeException("Unable to register Steam game", (Throwable)var3_4);
        }
    }
}

