/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.integration.freecam.FreecamMode
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.voice.client.GroupPlayerIconOrientation
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  de.maxhenkel.voicechat.voice.client.speaker.AudioType
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.configbuilder.ConfigBuilder;
import de.maxhenkel.voicechat.configbuilder.MigratableConfig;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.DoubleConfigEntry;
import de.maxhenkel.voicechat.integration.freecam.FreecamMode;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.GroupPlayerIconOrientation;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.client.speaker.AudioType;

public class ClientConfig {
    private static final int CONFIG_VERSION = 1;
    public ConfigEntry<Integer> configVersion;
    public ConfigEntry<Boolean> onboardingFinished;
    public DoubleConfigEntry voiceChatVolume;
    public ConfigEntry<Double> voiceActivationThreshold;
    public ConfigEntry<Boolean> vad;
    public ConfigEntry<Double> microphoneGain;
    public ConfigEntry<Boolean> agc;
    public ConfigEntry<MicrophoneActivationType> microphoneActivationType;
    public ConfigEntry<Integer> outputBufferSize;
    public ConfigEntry<Integer> audioPacketThreshold;
    public ConfigEntry<Integer> voiceDeactivationDelay;
    public ConfigEntry<Integer> pttDeactivationDelay;
    public ConfigEntry<String> microphone;
    public ConfigEntry<String> speaker;
    public ConfigEntry<Boolean> muted;
    public ConfigEntry<Boolean> disabled;
    public ConfigEntry<Boolean> hideIcons;
    public ConfigEntry<Boolean> showNametagIcons;
    public ConfigEntry<Boolean> showHudIcons;
    public ConfigEntry<Boolean> showGroupHud;
    public ConfigEntry<Boolean> showOwnGroupIcon;
    public ConfigEntry<Double> groupHudIconScale;
    public ConfigEntry<GroupPlayerIconOrientation> groupPlayerIconOrientation;
    public ConfigEntry<Integer> groupPlayerIconPosX;
    public ConfigEntry<Integer> groupPlayerIconPosY;
    public ConfigEntry<Integer> hudIconPosX;
    public ConfigEntry<Integer> hudIconPosY;
    public ConfigEntry<Double> hudIconScale;
    public ConfigEntry<String> recordingDestination;
    public ConfigEntry<Integer> recordingQuality;
    public ConfigEntry<Boolean> denoiser;
    public ConfigEntry<Boolean> runLocalServer;
    public ConfigEntry<Boolean> javaMicrophoneImplementation;
    public ConfigEntry<Boolean> macosCheckMicrophonePermission;
    public ConfigEntry<Boolean> showFakePlayersDisconnected;
    public ConfigEntry<Boolean> offlinePlayerVolumeAdjustment;
    public ConfigEntry<AudioType> audioType;
    public ConfigEntry<Boolean> useNatives;
    public ConfigEntry<FreecamMode> freecamMode;
    public ConfigEntry<Boolean> muteOnJoin;

    public ClientConfig(ConfigBuilder configBuilder) {
        configBuilder.header(String.format("%s client config v%s", CommonCompatibilityManager.INSTANCE.getModName(), CommonCompatibilityManager.INSTANCE.getModVersion()));
        this.configVersion = configBuilder.integerEntry("config_version", (Integer)1, "The config version - Used for migration", "WARNING: DO NOT CHANGE THIS VALUE");
        this.onboardingFinished = configBuilder.booleanEntry("onboarding_finished", false, "If the voice chat onboarding process has been finished");
        this.voiceChatVolume = configBuilder.doubleEntry("voice_chat_volume", (Double)1.0, 0.0, 3.0, "The voice chat volume");
        this.voiceActivationThreshold = configBuilder.doubleEntry("voice_activation_threshold", (Double)-50.0, -127.0, 0.0, "The threshold for the voice activation method (in dB)");
        this.vad = configBuilder.booleanEntry("voice_activity_detection", true, "If automatic voice detection should be used");
        this.microphoneGain = configBuilder.doubleEntry("microphone_gain", (Double)0.0, -40.0, 24.0, "The voice chat microphone gain");
        this.agc = configBuilder.booleanEntry("automatic_gain_control", true, "Enable automatic gain control");
        this.microphoneActivationType = configBuilder.enumEntry("microphone_activation_type", MicrophoneActivationType.PTT, "The microphone activation method", "Valid values are 'PTT' and 'VOICE'");
        this.outputBufferSize = configBuilder.integerEntry("output_buffer_size", (Integer)5, 1, 16, "The size of the audio output buffer (in packets)", "Higher values mean a higher latency but less crackling", "Increase this value if you have an unstable internet connection");
        this.audioPacketThreshold = configBuilder.integerEntry("audio_packet_threshold", (Integer)3, 0, 16, "The maximum number of audio packets that should be held back if a packet arrives out of order or is dropped", "This prevents audio packets that are only slightly out of order from being discarded", "Set this to 0 to disable");
        this.voiceDeactivationDelay = configBuilder.integerEntry("voice_deactivation_delay", (Integer)25, 0, 100, "The time it takes for the microphone to deactivate when using voice activation", "A value of 1 means 20 milliseconds, 2=40 ms, 3=60 ms, and so on");
        this.pttDeactivationDelay = configBuilder.integerEntry("ptt_deactivation_delay", (Integer)5, 0, 100, "The time it takes for the microphone to deactivate when using push to talk", "A value of 1 means 20 milliseconds, 2=40 ms, 3=60 ms, and so on");
        this.microphone = configBuilder.stringEntry("microphone", "", "The microphone used by the voice chat", "Leave blank to use the default device");
        this.speaker = configBuilder.stringEntry("speaker", "", "The speaker used by the voice chat", "Leave blank to use the default device");
        this.muted = configBuilder.booleanEntry("muted", true, "If the microphone is muted (only relevant for the voice activation method)");
        this.disabled = configBuilder.booleanEntry("disabled", false, "If the voice chat is disabled (both sound and microphone off)");
        this.hideIcons = configBuilder.booleanEntry("hide_icons", false, "If the voice chat HUD, group chat HUD, and other in-game icons should be hidden");
        this.showNametagIcons = configBuilder.booleanEntry("show_nametag_icons", true, "If the voice chat icons next to player names should be visible");
        this.showHudIcons = configBuilder.booleanEntry("show_hud_icons", true, "If the voice chat icons on the HUD should be visible");
        this.showGroupHud = configBuilder.booleanEntry("show_group_hud", true, "If the group chat HUD should be visible");
        this.showOwnGroupIcon = configBuilder.booleanEntry("show_own_group_icon", true, "If your own player icon should be displayed in the group chat HUD when you are in a group");
        this.groupHudIconScale = configBuilder.doubleEntry("group_hud_icon_scale", (Double)2.0, 0.01, 10.0, "The scale of the player icons in the group chat HUD");
        this.groupPlayerIconOrientation = configBuilder.enumEntry("group_player_icon_orientation", GroupPlayerIconOrientation.VERTICAL, "The orientation of the player icons in the group chat HUD", "Valid values are 'VERTICAL' and 'HORIZONTAL'");
        this.groupPlayerIconPosX = configBuilder.integerEntry("group_player_icon_pos_x", (Integer)4, Integer.MIN_VALUE, Integer.MAX_VALUE, "The X position of the player icons in the group chat HUD", "Negative values mean anchoring to the right instead");
        this.groupPlayerIconPosY = configBuilder.integerEntry("group_player_icon_pos_y", (Integer)4, Integer.MIN_VALUE, Integer.MAX_VALUE, "The Y position of the player icons in the group chat HUD", "Negative values mean anchoring to the bottom instead");
        this.hudIconPosX = configBuilder.integerEntry("hud_icon_pos_x", (Integer)16, Integer.MIN_VALUE, Integer.MAX_VALUE, "The X position of the icons in the voice chat HUD", "Negative values mean anchoring to the right instead");
        this.hudIconPosY = configBuilder.integerEntry("hud_icon_pos_y", (Integer)-16, Integer.MIN_VALUE, Integer.MAX_VALUE, "The Y position of the icons in the voice chat HUD", "Negative values mean anchoring to the bottom instead");
        this.hudIconScale = configBuilder.doubleEntry("hud_icon_scale", (Double)1.0, 0.01, 10.0, "The scale of the icons in the voice chat HUD, such as microphone or connection status");
        this.recordingDestination = configBuilder.stringEntry("recording_destination", "", "The location where recordings should be saved", "Leave blank to use the default location");
        this.recordingQuality = configBuilder.integerEntry("recording_quality", (Integer)2, 0, 9, "The quality of the recorded voice chat audio", "0 = highest quality, 9 = lowest quality");
        this.denoiser = configBuilder.booleanEntry("denoiser", true, "If noise suppression should be enabled");
        this.runLocalServer = configBuilder.booleanEntry("run_local_server", true, "If the voice chat should work in singleplayer or in worlds shared over LAN");
        this.javaMicrophoneImplementation = configBuilder.booleanEntry("java_microphone_implementation", false, "Whether to use the Java implementation of microphone capture instead of OpenAL", "Note that having this set to false doesn't necessarily mean the mod will use OpenAL - Some operating systems or Minecraft versions might not support it properly");
        this.macosCheckMicrophonePermission = configBuilder.booleanEntry("macos_check_microphone_permission", true, "If the mod should check for microphone permissions (macOS only)");
        this.showFakePlayersDisconnected = configBuilder.booleanEntry("show_fake_players_disconnected", false, "If fake players should have the disconnected icon above their head");
        this.offlinePlayerVolumeAdjustment = configBuilder.booleanEntry("offline_player_volume_adjustment", false, "If the volume adjustment interface should also display offline players");
        this.audioType = configBuilder.enumEntry("audio_type", AudioType.NORMAL, "The 3D audio type", "Valid values are 'NORMAL', 'REDUCED', and 'OFF'");
        this.useNatives = configBuilder.booleanEntry("use_natives", true, "If the mod should load native libraries on the client", "When disabled, the Java Opus implementation will be used instead, automatic gain control won't be available, noise suppression won't be available, and you won't be able to record the voice chat audio");
        this.freecamMode = configBuilder.enumEntry("freecam_mode", FreecamMode.CAMERA, "How listening to other players should work when using freecam mods", "Valid values are 'CAMERA' and 'PLAYER'", "CAMERA: You will hear the voice chat around your camera. Whether you will still be able to hear the voice chat when the camera is far away from your character depends on the voice chat broadcast range of the server", "PLAYER: You will hear the voice chat around your character no matter where your camera is");
        this.muteOnJoin = configBuilder.booleanEntry("mute_on_join", false, "If enabled, you will be automatically muted when joining a world");
    }

    private static void migrateFrom0To1(MigratableConfig migratableConfig) {
        Voicechat.LOGGER.info("Migrating config from version 0 to 1", new Object[0]);
        migratableConfig.set("config_version", "1");
        migratableConfig.set("denoiser", "true");
        migratableConfig.set("voice_activation_threshold", "-50");
        migratableConfig.set("onboarding_finished", "false");
    }

    public static void migrate(MigratableConfig migratableConfig) {
        String string = migratableConfig.get("config_version");
        int n = 0;
        if (string != null) {
            try {
                n = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (n == 0) {
            ClientConfig.migrateFrom0To1(migratableConfig);
            n = 1;
        }
    }
}

