/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.config.ServerConfig$Codec
 *  de.maxhenkel.voicechat.net.SecretPacket
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.config.ServerConfig;
import de.maxhenkel.voicechat.net.SecretPacket;
import de.maxhenkel.voicechat.voice.client.InitializationData$HostData;
import de.maxhenkel.voicechat.voice.common.Secret;
import java.net.URI;
import java.util.UUID;

public class InitializationData {
    private final String serverIP;
    private final int serverPort;
    private final UUID playerUUID;
    private final Secret secret;
    private final ServerConfig.Codec codec;
    private final int mtuSize;
    private final double voiceChatDistance;
    private final int keepAlive;
    private final boolean groupsEnabled;
    private final boolean allowRecording;

    public int getKeepAlive() {
        return this.keepAlive;
    }

    public InitializationData(String string, SecretPacket secretPacket) {
        InitializationData$HostData initializationData$HostData = InitializationData.parseAddress(secretPacket.getVoiceHost(), string, secretPacket.getServerPort());
        this.serverIP = initializationData$HostData.ip;
        this.serverPort = initializationData$HostData.port;
        this.playerUUID = secretPacket.getPlayerUUID();
        this.secret = secretPacket.getSecret();
        this.codec = secretPacket.getCodec();
        this.mtuSize = secretPacket.getMtuSize();
        this.voiceChatDistance = secretPacket.getVoiceChatDistance();
        this.keepAlive = secretPacket.getKeepAlive();
        this.groupsEnabled = secretPacket.groupsEnabled();
        this.allowRecording = secretPacket.allowRecording();
    }

    public String getServerIP() {
        return this.serverIP;
    }

    public ServerConfig.Codec getCodec() {
        return this.codec;
    }

    public double getVoiceChatDistance() {
        return this.voiceChatDistance;
    }

    public boolean groupsEnabled() {
        return this.groupsEnabled;
    }

    public boolean allowRecording() {
        return this.allowRecording;
    }

    public int getServerPort() {
        return this.serverPort;
    }

    public UUID getPlayerUUID() {
        return this.playerUUID;
    }

    private static InitializationData$HostData parseAddress(String string, String string2, int n) {
        String string3 = string2;
        int n2 = n;
        if (string.isEmpty()) {
            return new InitializationData$HostData(string3, n2);
        }
        try {
            int n3 = Integer.parseInt(string);
            if (n3 <= 0 || n3 > 65535) {
                Voicechat.LOGGER.warn("Invalid voice host port: {}", new Object[]{n3});
            } else {
                n2 = n3;
            }
        }
        catch (NumberFormatException numberFormatException) {
            try {
                URI uRI = new URI("voicechat://" + string);
                String string4 = uRI.getHost();
                int n4 = uRI.getPort();
                if (string4 != null) {
                    string3 = string4;
                }
                if (n4 > 0) {
                    n2 = n4;
                }
            }
            catch (Exception exception) {
                Voicechat.LOGGER.warn("Failed to parse voice host", new Object[]{exception});
            }
        }
        return new InitializationData$HostData(string3, n2);
    }

    public Secret getSecret() {
        return this.secret;
    }

    public int getMtuSize() {
        return this.mtuSize;
    }
}

