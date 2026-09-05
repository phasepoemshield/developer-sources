/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 *  de.maxhenkel.voicechat.api.opus.OpusEncoderMode
 *  de.maxhenkel.voicechat.config.ServerConfig$Codec
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  de.maxhenkel.voicechat.natives.OpusManager
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 *  javax.annotation.Nullable
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.opus.OpusEncoder;
import de.maxhenkel.voicechat.api.opus.OpusEncoderMode;
import de.maxhenkel.voicechat.config.ServerConfig;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.natives.OpusManager;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.AudioRecorder;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.client.MicrophoneException;
import de.maxhenkel.voicechat.voice.client.MicrophoneProcessor;
import de.maxhenkel.voicechat.voice.client.PTTMicrophoneProcessor;
import de.maxhenkel.voicechat.voice.client.PositionalAudioUtils;
import de.maxhenkel.voicechat.voice.client.VoiceMicrophoneProcessor;
import de.maxhenkel.voicechat.voice.client.microphone.Microphone;
import de.maxhenkel.voicechat.voice.client.microphone.MicrophoneManager;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import de.maxhenkel.voicechat.voice.common.Utils;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import minecraft.class06202;

public class MicThread
extends Thread {
    @Nullable
    private final ClientVoicechat client;
    @Nullable
    private final ClientVoicechatConnection connection;
    @Nullable
    private Microphone mic;
    @Nullable
    private MicrophoneException microphoneError;
    private boolean running;
    private boolean microphoneLocked;
    private final OpusEncoder encoder;
    private MicrophoneProcessor microphoneProcessor;
    private final Consumer<MicrophoneException> onError;
    private boolean hasSentAudio;
    private final AtomicLong sequenceNumber = new AtomicLong();
    private volatile boolean stopPacketSent = true;

    public MicThread(@Nullable ClientVoicechat clientVoicechat, @Nullable ClientVoicechatConnection clientVoicechatConnection, Consumer<MicrophoneException> consumer) {
        this.client = clientVoicechat;
        this.connection = clientVoicechatConnection;
        this.onError = consumer;
        this.running = true;
        this.encoder = OpusManager.createEncoder((OpusEncoderMode)(clientVoicechatConnection == null ? ServerConfig.Codec.VOIP.getMode() : clientVoicechatConnection.getData().getCodec().getMode()));
        this.microphoneProcessor = this.createMicrophoneProcessor();
        this.setDaemon(true);
        this.setName("MicrophoneThread");
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
    }

    @Override
    public void run() {
        Microphone microphone = this.getMic();
        if (microphone == null) {
            return;
        }
        while (this.running) {
            MicrophoneActivationType microphoneActivationType = (MicrophoneActivationType)((Object)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get());
            if (!microphoneActivationType.equals((Object)this.microphoneProcessor.getActivationType())) {
                this.microphoneProcessor.close();
                this.microphoneProcessor = this.createMicrophoneProcessor();
            }
            if (this.connection != null) {
                this.connection.checkTimeout();
                if (!this.running) break;
            }
            if (this.microphoneLocked || ClientManager.getPlayerStateManager().isDisabled()) {
                this.flushIfNeeded();
                if (!this.microphoneLocked && ClientManager.getPlayerStateManager().isDisabled()) {
                    this.microphoneProcessor.reset();
                    if (microphone.isStarted()) {
                        microphone.stop();
                    }
                }
                Utils.sleep(10);
                continue;
            }
            short[] sArray = this.pollProcessedAudio(false);
            if (sArray == null) continue;
            if (!this.microphoneProcessor.shouldTransmitAudio()) {
                sArray = null;
            }
            this.sendAudio(sArray, this.microphoneProcessor.isWhispering());
        }
    }

    private void flush() {
        this.sendStopPacket();
        if (!this.encoder.isClosed()) {
            this.encoder.resetState();
        }
        if (this.client == null) {
            return;
        }
        AudioRecorder audioRecorder = this.client.getRecorder();
        if (audioRecorder == null) {
            return;
        }
        audioRecorder.flushChunkThreaded(class06202.Nq().Ny().y());
    }

    public void close() {
        if (!this.running) {
            return;
        }
        this.running = false;
        if (Thread.currentThread() != this) {
            try {
                this.join(100L);
            }
            catch (InterruptedException interruptedException) {
                Voicechat.LOGGER.error("Interrupted while waiting for mic thread to close", new Object[]{interruptedException});
            }
        }
        if (this.mic != null) {
            this.mic.close();
        }
        this.encoder.close();
        this.microphoneProcessor.close();
        this.flush();
    }

    private MicrophoneProcessor createMicrophoneProcessor() {
        MicrophoneActivationType microphoneActivationType = (MicrophoneActivationType)((Object)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get());
        if (MicrophoneActivationType.VOICE.equals((Object)microphoneActivationType)) {
            return new VoiceMicrophoneProcessor();
        }
        return new PTTMicrophoneProcessor();
    }

    public boolean isWhispering() {
        return this.microphoneProcessor.isWhispering();
    }

    public boolean isTalking() {
        return !this.microphoneLocked && this.microphoneProcessor.shouldTransmitAudio();
    }

    public boolean isClosed() {
        return !this.running;
    }

    public void getError(Consumer<MicrophoneException> consumer) {
        if (this.microphoneError != null) {
            consumer.accept(this.microphoneError);
        }
    }

    @Nullable
    public short[] pollProcessedAudio(boolean bl) {
        short[] sArray = this.pollMic();
        if (sArray == null) {
            return null;
        }
        this.microphoneProcessor.process(sArray, bl);
        return sArray;
    }

    private void sendStopPacket() {
        if (this.stopPacketSent) {
            return;
        }
        if (this.connection == null || !this.connection.isInitialized()) {
            return;
        }
        this.connection.sendToServer(new NetworkMessage(new MicPacket(new byte[0], false, this.sequenceNumber.getAndIncrement())));
        this.stopPacketSent = true;
    }

    private void sendAudioPacket(short[] sArray, boolean bl) {
        if (this.connection != null && this.connection.isInitialized()) {
            byte[] byArray = this.encoder.encode(sArray);
            this.connection.sendToServer(new NetworkMessage(new MicPacket(byArray, bl, this.sequenceNumber.getAndIncrement())));
            this.stopPacketSent = false;
        }
        try {
            if (this.client != null && this.client.getRecorder() != null) {
                this.client.getRecorder().appendChunk(class06202.Nq().Ny().y(), System.currentTimeMillis(), PositionalAudioUtils.convertToStereo(sArray));
            }
        }
        catch (IOException iOException) {
            Voicechat.LOGGER.error("Failed to record audio", new Object[]{iOException});
            this.client.setRecording(false);
        }
    }

    private void flushIfNeeded() {
        if (!this.hasSentAudio) {
            return;
        }
        this.flush();
        this.hasSentAudio = false;
    }

    @Nullable
    public short[] pollMic() {
        Microphone microphone = this.getMic();
        if (microphone == null) {
            throw new IllegalStateException("No microphone available");
        }
        if (!microphone.isStarted()) {
            microphone.start();
        }
        if (microphone.available() < 960) {
            Utils.sleep(5);
            return null;
        }
        return microphone.read();
    }

    private void sendAudio(@Nullable short[] sArray, boolean bl) {
        short[] sArray2 = ClientPluginManager.instance().onMergeClientSound(sArray);
        if (sArray2 == null) {
            this.flushIfNeeded();
            return;
        }
        short[] sArray3 = ClientPluginManager.instance().onClientSound(sArray2, bl);
        if (sArray3 == null) {
            this.flushIfNeeded();
            return;
        }
        this.sendAudioPacket(sArray3, bl);
        this.hasSentAudio = true;
    }

    @Nullable
    private Microphone getMic() {
        if (!this.running) {
            return null;
        }
        if (this.mic == null) {
            try {
                this.mic = MicrophoneManager.createMicrophone();
                class06202.Nq().execute(ClientManager.instance()::checkMicrophonePermissions);
            }
            catch (MicrophoneException microphoneException) {
                this.onError.accept(microphoneException);
                this.microphoneError = microphoneException;
                this.running = false;
                return null;
            }
        }
        return this.mic;
    }

    public void setMicrophoneLocked(boolean bl) {
        this.microphoneLocked = bl;
        this.microphoneProcessor.reset();
    }

    public boolean shouldTransmitAudio() {
        return this.microphoneProcessor.shouldTransmitAudio();
    }
}

