/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.voicechat.config.ServerConfig$Codec;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;

public class ServerConfig {
    public ConfigEntry<Integer> voiceChatPort;
    public ConfigEntry<String> voiceChatBindAddress;
    public ConfigEntry<Double> voiceChatDistance;
    public ConfigEntry<Double> whisperDistance;
    public ConfigEntry<ServerConfig$Codec> voiceChatCodec;
    public ConfigEntry<Integer> voiceChatMtuSize;
    public ConfigEntry<Integer> tcpRateLimit;
    public ConfigEntry<Integer> keepAlive;
    public ConfigEntry<Boolean> groupsEnabled;
    public ConfigEntry<String> voiceHost;
    public ConfigEntry<Boolean> allowRecording;
    public ConfigEntry<Boolean> spectatorInteraction;
    public ConfigEntry<Boolean> spectatorPlayerPossession;
    public ConfigEntry<Boolean> forceVoiceChat;
    public ConfigEntry<Integer> loginTimeout;
    public ConfigEntry<Double> broadcastRange;
    public ConfigEntry<Boolean> allowPings;
    public ConfigEntry<Boolean> useNatives;

    public ServerConfig(ConfigBuilder configBuilder) {
        configBuilder.header(String.format("%s server config v%s", CommonCompatibilityManager.INSTANCE.getModName(), CommonCompatibilityManager.INSTANCE.getModVersion()));
        this.voiceChatPort = configBuilder.integerEntry("port", (Integer)24454, -1, 65535, "The port number to use for the voice chat communication.", "Audio packets are always transmitted via the UDP protocol on the port number", "specified here, independently of other networking used for the game server.", "Set this to '-1' to use the same port number that is used by the Minecraft server.", "However, it is strongly recommended NOT to use the same port number because UDP on", "it is also used by default for the server query. Doing so may crash the server!");
        this.voiceChatBindAddress = configBuilder.stringEntry("bind_address", "", "The server IP address to bind the voice chat to", "Leave blank to use the 'server-ip' property from the 'server.properties' config file", "To bind to the wildcard IP address, use '*'");
        this.voiceChatDistance = configBuilder.doubleEntry("max_voice_distance", (Double)48.0, 1.0, 1000000.0, "The distance to which the voice can be heard");
        this.whisperDistance = configBuilder.doubleEntry("whisper_distance", (Double)24.0, 1.0, 1000000.0, "The distance to which the voice can be heard when whispering");
        this.voiceChatCodec = configBuilder.enumEntry("codec", ServerConfig$Codec.VOIP, "The Opus codec", "Valid values are 'VOIP', 'AUDIO', and 'RESTRICTED_LOWDELAY'");
        this.voiceChatMtuSize = configBuilder.integerEntry("mtu_size", (Integer)1024, 256, 2048, "The maximum size that audio packets are allowed to have (in bytes)", "Set this to a lower value if audio packets don't arrive");
        this.tcpRateLimit = configBuilder.integerEntry("tcp_rate_limit", (Integer)16, -1, 1024, "The maximum number of packets a player can send per second", "Set this to -1 to disable the rate limit - This must be greater than 0 in all other cases", "This only applies to voice chat packets that are sent through Minecrafts networking", "This affects actions like opening/joining/leaving voice chat groups or general state changes like disabling/enabling the voice chat");
        this.keepAlive = configBuilder.integerEntry("keep_alive", (Integer)1000, 1000, Integer.MAX_VALUE, "The frequency at which keep-alive packets are sent (in milliseconds)", "Setting this to a higher value may result in timeouts");
        this.groupsEnabled = configBuilder.booleanEntry("enable_groups", true, "If group chats are allowed");
        this.voiceHost = configBuilder.stringEntry("voice_host", "", "The hostname that clients should use to connect to the voice chat", "This may also include a port, e.g. 'example.com:24454' or just a port, e.g. '24454'", "Do NOT change this value if you don't know what you're doing");
        this.allowRecording = configBuilder.booleanEntry("allow_recording", true, "If players are allowed to record the voice chat audio");
        this.spectatorInteraction = configBuilder.booleanEntry("spectator_interaction", false, "If spectators are allowed to talk to other players");
        this.spectatorPlayerPossession = configBuilder.booleanEntry("spectator_player_possession", false, "If spectators can talk to players they are spectating");
        this.forceVoiceChat = configBuilder.booleanEntry("force_voice_chat", false, "If players without the voice chat mod should be kicked from the server");
        this.loginTimeout = configBuilder.integerEntry("login_timeout", (Integer)10000, 100, Integer.MAX_VALUE, "The amount of time the server should wait to check if a player has the mod installed (in milliseconds)", "Only relevant when 'force_voice_chat' is set to 'true'");
        this.broadcastRange = configBuilder.doubleEntry("broadcast_range", (Double)-1.0, -1.0, (Double)Double.MAX_VALUE, "The range in which the voice chat should broadcast audio", "A value less than 0 means 'max_voice_distance'");
        this.allowPings = configBuilder.booleanEntry("allow_pings", true, "If the voice chat server should reply to external pings");
        this.useNatives = configBuilder.booleanEntry("use_natives", true, "If the mod should load native libraries on dedicated servers", "This is mostly relevant for voice chat addons");
    }
}

