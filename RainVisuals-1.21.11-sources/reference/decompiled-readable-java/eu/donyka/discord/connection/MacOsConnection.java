/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.connection;

import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.connection.UnixConnection;
import java.io.File;
import java.io.FileWriter;

class MacOsConnection
extends UnixConnection {
    @Override
    public void register(String applicationId, String command) {
        try {
            if (command != null) {
                this.registerCommand(applicationId, command);
            }
        }
        catch (Exception ex) {
            throw new RuntimeException("Failed to register command", ex);
        }
    }

    MacOsConnection(DiscordRPC rpc) {
        super(rpc);
    }

    @Override
    public void registerSteamGame(String applicationId, String steamId) {
        this.register(applicationId, "steam://rungameid/" + steamId);
    }

    private void registerCommand(String applicationId, String command) {
        String home = System.getenv("HOME");
        if (home == null) {
            throw new RuntimeException("Unable to find user HOME directory");
        }
        String path = home + "/Library/Application Support/discord";
        if (!this.mkdir(path)) {
            throw new RuntimeException("Failed to create directory '" + path + "'");
        }
        if (!this.mkdir(path = path + "/games")) {
            throw new RuntimeException("Failed to create directory '" + path + "'");
        }
        path = path + "/" + applicationId + ".json";
        try {
            FileWriter fileWriter = new FileWriter(path);
            Throwable throwable = null;
            try {
                fileWriter.write("{\"command\": \"" + command + "\"}");
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
            throw new RuntimeException("Failed to write game info into '" + path + "'");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    boolean mkdir(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) return true;
        }
        if (!file.mkdir()) return false;
        return true;
    }
}

