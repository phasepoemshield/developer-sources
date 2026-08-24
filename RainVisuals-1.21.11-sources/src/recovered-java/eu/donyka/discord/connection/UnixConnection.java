/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.connection;

import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.connection.BaseConnection;
import eu.donyka.discord.connection.unix.IUnixBackend;
import eu.donyka.discord.connection.unix.JUnixBackend;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

class UnixConnection
extends BaseConnection {
    private IUnixBackend unixBackend = new JUnixBackend();

    @Override
    void close() {
        if (!this.isOpen()) {
            return;
        }
        try {
            this.unixBackend.closePipe();
        }
        catch (IOException iOException) {
            // empty catch block
        }
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
            int available = this.unixBackend.getAvailable();
            if (available < length) {
                return false;
            }
            byte[] buf = new byte[length];
            int read = this.unixBackend.read(buf);
            if (read != length) {
                throw new IOException("Read less data than supplied. Expected: " + length + ". Got: " + read);
            }
            ByteBuffer buffer = ByteBuffer.wrap(buf);
            buffer.rewind();
            buffer.get(bytes, 0, length);
            return true;
        }
        catch (Exception exception) {
            this.close();
            return false;
        }
    }

    private String getTempPath() {
        String temp = System.getenv("XDG_RUNTIME_DIR");
        temp = temp != null ? temp : System.getenv("TMPDIR");
        temp = temp != null ? temp : System.getenv("TMP");
        temp = temp != null ? temp : System.getenv("TEMP");
        temp = temp != null ? temp : "/tmp";
        return temp;
    }

    /*
     * WARNING - void declaration
     */
    private String getAdditionalPaths() {
        String[] stringArray = new String[2];
        stringArray[0] = "/snap.discord";
        stringArray[1] = "/app/com.discordapp.Discord";
        String[] unixFolderPaths = stringArray;
        String path = this.getTempPath();
        String[] stringArray2 = unixFolderPaths;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            void var7_7;
            String s = stringArray2[i];
            File f = new File(path, s);
            if (!f.exists() || !f.isDirectory() || f.list() == null || f.list().length <= 0) continue;
            return var7_7.getAbsolutePath();
        }
        return null;
    }

    @Override
    public void registerSteamGame(String applicationId, String steamId) {
        this.register(applicationId, "xdg-open steam://rungameid/" + steamId);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void register(String applicationId, String command) {
        String home = System.getenv("HOME");
        if (home == null) {
            throw new RuntimeException("Unable to find user HOME directory");
        }
        if (command == null) {
            try {
                command = Files.readSymbolicLink(Paths.get("/proc/self/exe", new String[0])).toString();
            }
            catch (Exception ex) {
                throw new RuntimeException("Unable to get current exe path from /proc/self/exe", ex);
            }
        }
        String desktopFile = "[Desktop Entry]\nName=Game " + applicationId + "\nExec=" + command + " %%u\nType=Application\nNoDisplay=true\nCategories=Discord;Games;\nMimeType=x-scheme-handler/discord-" + applicationId + ";\n";
        String desktopFileName = "/discord-" + applicationId + ".desktop";
        String desktopFilePath = home + "/.local";
        if (!this.mkdir(desktopFilePath)) {
            throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
        }
        if (!this.mkdir(desktopFilePath = desktopFilePath + "/share")) {
            throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
        }
        if (!this.mkdir(desktopFilePath = desktopFilePath + "/applications")) {
            throw new RuntimeException("Failed to create directory '" + desktopFilePath + "'");
        }
        desktopFilePath = desktopFilePath + desktopFileName;
        try {
            FileWriter fileWriter = new FileWriter(desktopFilePath);
            Throwable throwable = null;
            try {
                fileWriter.write(desktopFile);
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                if (fileWriter != null) {
                    if (throwable != null) {
                        try {
                            fileWriter.close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                    } else {
                        fileWriter.close();
                    }
                }
            }
        }
        catch (Exception ex) {
            throw new RuntimeException("Failed to write desktop info into '" + desktopFilePath + "'");
        }
        String xdgMimeCommand = "xdg-mime default discord-" + applicationId + ".desktop x-scheme-handler/discord-" + applicationId;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(xdgMimeCommand.split(" "));
            processBuilder.environment();
            int result = processBuilder.start().waitFor();
            if (result < 0) {
                throw new Exception("xdg-mime returned " + result);
            }
        }
        catch (Exception ex) {
            void var8_11;
            throw new RuntimeException("Failed to register mime handler", (Throwable)var8_11);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean mkdir(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) return true;
        }
        if (!file.mkdir()) return false;
        return true;
    }

    UnixConnection(DiscordRPC rpc) {
        super(rpc);
    }

    @Override
    boolean isOpen() {
        return this.unixBackend != null && this.unixBackend.isConnected();
    }

    /*
     * WARNING - void declaration
     */
    private boolean tryOpenConnection(String pipeName) {
        int i = 0;
        while (i < 10) {
            void var2_2;
            try {
                Object[] objectArray = new Object[1];
                objectArray[0] = i;
                File test = new File(String.format(pipeName, objectArray));
                if (test.exists()) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = i;
                    this.unixBackend.openPipe(String.format(pipeName, objectArray2));
                    return true;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++var2_2;
        }
        return false;
    }

    @Override
    boolean open() throws NoDiscordClientException, PipeAccessDenied {
        String pipeName = this.getTempPath() + "/discord-ipc-%s";
        if (this.isOpen()) {
            throw new IllegalStateException("Connection is already opened");
        }
        if (this.tryOpenConnection(pipeName)) {
            return true;
        }
        String nextPath = this.getAdditionalPaths();
        if (nextPath != null) {
            if (!nextPath.isEmpty()) {
                if (this.tryOpenConnection(nextPath + "/discord-ipc-%s")) {
                    return true;
                }
            }
        }
        throw new NoDiscordClientException();
    }

    @Override
    boolean write(byte[] bytes) {
        if (!this.isOpen()) {
            return false;
        }
        try {
            this.unixBackend.write(bytes);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

