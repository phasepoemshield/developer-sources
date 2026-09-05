/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.debug.CooldownTimer
 *  de.maxhenkel.voicechat.gui.onboarding.OnboardingManager
 *  de.maxhenkel.voicechat.natives.ClientNativeManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.debug.CooldownTimer;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.natives.ClientNativeManager;
import de.maxhenkel.voicechat.voice.client.AudioChannel;
import de.maxhenkel.voicechat.voice.client.AudioRecorder;
import de.maxhenkel.voicechat.voice.client.ChatUtils;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.client.InitializationData;
import de.maxhenkel.voicechat.voice.client.MicThread;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.TalkCache;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06541;

public class ClientVoicechat {
    @Nullable
    private SoundManager soundManager;
    private final Map<UUID, AudioChannel> audioChannels;
    private final TalkCache talkCache;
    @Nullable
    private MicThread micThread;
    @Nullable
    private ClientVoicechatConnection connection;
    @Nullable
    private InitializationData initializationData;
    @Nullable
    private AudioRecorder recorder;
    private long startTime = System.currentTimeMillis();

    @Nullable
    public ClientVoicechatConnection getConnection() {
        return this.connection;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public ClientVoicechat() {
        this.talkCache = new TalkCache();
        try {
            this.reloadSoundManager();
        }
        catch (SpeakerException speakerException) {
            Voicechat.LOGGER.error("Failed to start sound manager", new Object[]{speakerException});
            ChatUtils.sendModErrorMessage("message.voicechat.speaker_unavailable", speakerException);
        }
        this.audioChannels = new HashMap<UUID, AudioChannel>();
    }

    public void connect(InitializationData initializationData) throws Exception {
        this.initializationData = initializationData;
        Voicechat.LOGGER.info("Connecting to voice chat server: '{}:{}'", new Object[]{this.initializationData.getServerIP(), this.initializationData.getServerPort()});
        this.connection = new ClientVoicechatConnection(this, this.initializationData);
        this.connection.start();
        OnboardingManager.onConnecting();
        ClientNativeManager.onConnecting();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        Object object = this.audioChannels;
        synchronized (object) {
            Voicechat.LOGGER.info("Clearing audio channels", new Object[0]);
            this.audioChannels.forEach((uUID, audioChannel) -> audioChannel.closeAndKill());
            this.audioChannels.clear();
        }
        if (this.soundManager != null) {
            this.soundManager.close();
        }
        this.closeMicThread();
        if (this.connection != null) {
            this.connection.close();
            this.connection = null;
        }
        if (this.recorder != null) {
            object = this.recorder;
            this.recorder = null;
            ((AudioRecorder)object).saveAndClose();
        }
    }

    @Nullable
    public InitializationData getInitializationData() {
        return this.initializationData;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean closeAudioChannel(UUID uUID) {
        Map<UUID, AudioChannel> map = this.audioChannels;
        synchronized (map) {
            boolean bl;
            boolean bl2 = bl = this.audioChannels.remove(uUID) != null;
            if (bl) {
                Voicechat.LOGGER.debug("Removed audio channel of {} due to disconnection from voice chat", new Object[]{uUID});
            }
            return bl;
        }
    }

    @Nullable
    public SoundManager getSoundManager() {
        return this.soundManager;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void processSoundPacket(SoundPacket soundPacket) {
        if (this.connection == null) {
            return;
        }
        Map<UUID, AudioChannel> map = this.audioChannels;
        synchronized (map) {
            if (!ClientManager.getPlayerStateManager().isDisabled()) {
                AudioChannel audioChannel = this.audioChannels.get(soundPacket.getChannelId());
                if (audioChannel == null) {
                    try {
                        AudioChannel audioChannel2 = new AudioChannel(this, this.connection.getData(), soundPacket.getChannelId());
                        audioChannel2.addToQueue(soundPacket);
                        audioChannel2.start();
                        this.audioChannels.put(soundPacket.getChannelId(), audioChannel2);
                    }
                    catch (Exception exception) {
                        CooldownTimer.run((String)"playback_unavailable", () -> {
                            Voicechat.LOGGER.error("Failed to create audio channel", new Object[]{exception});
                            ChatUtils.sendModErrorMessage("message.voicechat.playback_unavailable", exception);
                        });
                    }
                } else {
                    audioChannel.addToQueue(soundPacket);
                }
            }
            this.audioChannels.values().stream().filter(AudioChannel::canKill).forEach(AudioChannel::closeAndKill);
            this.audioChannels.entrySet().removeIf(entry -> ((AudioChannel)entry.getValue()).isClosed());
        }
    }

    public Map<UUID, AudioChannel> getAudioChannels() {
        return this.audioChannels;
    }

    @Nullable
    public MicThread getMicThread() {
        return this.micThread;
    }

    public TalkCache getTalkCache() {
        return this.talkCache;
    }

    public void onVoiceChatConnected(ClientVoicechatConnection clientVoicechatConnection) {
        this.startMicThread(clientVoicechatConnection);
    }

    public void onVoiceChatDisconnected() {
        this.closeMicThread();
        if (this.connection != null) {
            this.connection.close();
            this.connection = null;
        }
    }

    @Nullable
    public AudioRecorder getRecorder() {
        return this.recorder;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void reloadAudio() {
        Voicechat.LOGGER.info("Reloading audio", new Object[0]);
        this.closeMicThread();
        Map<UUID, AudioChannel> map = this.audioChannels;
        synchronized (map) {
            Voicechat.LOGGER.info("Clearing audio channels", new Object[0]);
            this.audioChannels.forEach((uUID, audioChannel) -> audioChannel.closeAndKill());
            this.audioChannels.clear();
            try {
                Voicechat.LOGGER.info("Restarting sound manager", new Object[0]);
                this.reloadSoundManager();
            }
            catch (SpeakerException speakerException) {
                Voicechat.LOGGER.error("Failed to restart sound manager", new Object[]{speakerException});
            }
        }
        Voicechat.LOGGER.info("Starting microphone thread", new Object[0]);
        if (this.connection != null) {
            this.startMicThread(this.connection);
        }
    }

    public void reloadSoundManager() throws SpeakerException {
        if (this.soundManager != null) {
            this.soundManager.close();
            this.soundManager = null;
        }
        this.soundManager = SoundManager.create();
    }

    private void startMicThread(ClientVoicechatConnection clientVoicechatConnection) {
        if (this.micThread != null) {
            this.micThread.close();
        }
        this.micThread = new MicThread(this, clientVoicechatConnection, microphoneException -> {
            Voicechat.LOGGER.error("Failed to start microphone thread", new Object[]{microphoneException});
            ChatUtils.sendModErrorMessage("message.voicechat.microphone_unavailable", microphoneException);
        });
        this.micThread.start();
    }

    public boolean setRecording(boolean bl) {
        if (bl && !((Boolean)VoicechatClient.CLIENT_CONFIG.useNatives.get()).booleanValue()) {
            Voicechat.LOGGER.warn("Tried to start a recording with natives being disabled", new Object[0]);
            return false;
        }
        if (bl == (this.recorder != null)) {
            return false;
        }
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (bl) {
            if (this.connection == null || !this.connection.getData().allowRecording()) {
                if (class044532 != null) {
                    class044532.method_7353((class00392)class00392.L((String)"message.voicechat.recording_disabled"), true);
                }
                return false;
            }
            this.recorder = AudioRecorder.create();
            if (class044532 != null) {
                class044532.method_7353((class00392)class00392.L((String)"message.voicechat.recording_started").N(class06541.field_1079), true);
            }
            return true;
        }
        AudioRecorder audioRecorder = this.recorder;
        this.recorder = null;
        if (class044532 != null) {
            class044532.method_7353((class00392)class00392.L((String)"message.voicechat.recording_stopped").N(class06541.field_1079), true);
        }
        audioRecorder.saveAndClose();
        return true;
    }

    public void closeMicThread() {
        if (this.micThread != null) {
            Voicechat.LOGGER.info("Stopping microphone thread", new Object[0]);
            this.micThread.close();
            this.micThread = null;
        }
    }

    public boolean toggleRecording() {
        return this.setRecording(this.recorder == null);
    }
}

