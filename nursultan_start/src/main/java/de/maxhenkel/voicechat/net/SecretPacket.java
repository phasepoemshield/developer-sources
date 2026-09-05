/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.config.ServerConfig
 *  de.maxhenkel.voicechat.config.ServerConfig$Codec
 *  de.maxhenkel.voicechat.voice.common.Secret
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.config.ServerConfig;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.plugins.PluginManager;
import de.maxhenkel.voicechat.voice.common.Secret;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class04770;

public class SecretPacket
implements Packet<SecretPacket> {
    public static final class01666<SecretPacket> SECRET = new class01666(class01894.N((String)"voicechat", (String)"secret"));
    private Secret secret;
    private int serverPort;
    private UUID playerUUID;
    private ServerConfig.Codec codec;
    private int mtuSize;
    private double voiceChatDistance;
    private int keepAlive;
    private boolean groupsEnabled;
    private String voiceHost;
    private boolean allowRecording;

    public int getKeepAlive() {
        return this.keepAlive;
    }

    public SecretPacket() {
    }

    public SecretPacket(class04770 class047702, Secret secret, int n, ServerConfig serverConfig) {
        this.secret = secret;
        this.serverPort = n;
        this.playerUUID = class047702.method_5667();
        this.codec = (ServerConfig.Codec)serverConfig.voiceChatCodec.get();
        this.mtuSize = (Integer)serverConfig.voiceChatMtuSize.get();
        this.voiceChatDistance = (Double)serverConfig.voiceChatDistance.get();
        this.keepAlive = (Integer)serverConfig.keepAlive.get();
        this.groupsEnabled = (Boolean)serverConfig.groupsEnabled.get();
        this.voiceHost = PluginManager.instance().getVoiceHost(class047702, (String)serverConfig.voiceHost.get());
        this.allowRecording = (Boolean)serverConfig.allowRecording.get();
    }

    @Override
    public void toBytes(class00667 class006672) {
        this.secret.toBytes((ByteBuf)class006672);
        class006672.writeInt(this.serverPort);
        class006672.N(this.playerUUID);
        class006672.writeByte(this.codec.ordinal());
        class006672.writeInt(this.mtuSize);
        class006672.writeDouble(this.voiceChatDistance);
        class006672.writeInt(this.keepAlive);
        class006672.writeBoolean(this.groupsEnabled);
        class006672.N(this.voiceHost);
        class006672.writeBoolean(this.allowRecording);
    }

    @Override
    public class01666<SecretPacket> method_56479() {
        return SECRET;
    }

    public ServerConfig.Codec getCodec() {
        return this.codec;
    }

    @Override
    public SecretPacket fromBytes(class00667 class006672) {
        this.secret = Secret.fromBytes((ByteBuf)class006672);
        this.serverPort = class006672.readInt();
        this.playerUUID = class006672.m();
        this.codec = ServerConfig.Codec.values()[class006672.readByte()];
        this.mtuSize = class006672.readInt();
        this.voiceChatDistance = class006672.readDouble();
        this.keepAlive = class006672.readInt();
        this.groupsEnabled = class006672.readBoolean();
        this.voiceHost = class006672.u(Short.MAX_VALUE);
        this.allowRecording = class006672.readBoolean();
        return this;
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

    public String getVoiceHost() {
        return this.voiceHost;
    }

    public UUID getPlayerUUID() {
        return this.playerUUID;
    }

    public Secret getSecret() {
        return this.secret;
    }

    public int getMtuSize() {
        return this.mtuSize;
    }
}

