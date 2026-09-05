/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent$Post
 *  de.maxhenkel.voicechat.api.events.OpenALSoundEvent$Pre
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 *  javax.annotation.Nullable
 *  minecraft.class03386
 *  minecraft.class05363
 *  minecraft.class06202
 *  minecraft.class06889
 *  org.joml.Vector3fc
 *  org.lwjgl.openal.AL11
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.events.OpenALSoundEvent;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.ClientUtils;
import de.maxhenkel.voicechat.voice.client.SoundManager;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import de.maxhenkel.voicechat.voice.common.NamedThreadPoolFactory;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Vector3fc;
import org.lwjgl.openal.AL11;

public abstract class ALSpeakerBase
implements Speaker {
    protected final class06202 mc = class06202.Nq();
    protected final SoundManager soundManager;
    protected final int sampleRate;
    protected int bufferSize;
    protected int bufferSampleSize;
    protected int source;
    protected volatile int bufferIndex;
    protected final int[] buffers;
    protected final ExecutorService executor;
    @Nullable
    protected UUID audioChannelId;

    protected abstract int getFormat();

    public ALSpeakerBase(SoundManager soundManager, int n, int n2, @Nullable UUID uUID) {
        this.soundManager = soundManager;
        this.sampleRate = n;
        this.bufferSize = n2;
        this.bufferSampleSize = n2;
        this.audioChannelId = uUID;
        this.buffers = new int[32];
        String string = uUID == null ? "SoundSourceThread" : "SoundSourceThread-%s".formatted(new Object[]{uUID});
        this.executor = Executors.newSingleThreadExecutor(NamedThreadPoolFactory.create(string));
    }

    protected short[] convert(short[] sArray, @Nullable class06889 class068892) {
        return sArray;
    }

    @Override
    public void close() {
        this.runInContext(this::closeSync);
    }

    @Override
    public void open() throws SpeakerException {
        this.runInContext(this::openSync);
    }

    public void fetchQueuedBuffersAsync(Consumer<Integer> consumer) {
        this.runInContext(() -> {
            if (this.isStoppedSync()) {
                consumer.accept(-1);
                return;
            }
            consumer.accept(this.getQueuedBuffersSync());
        });
    }

    protected int getQueuedBuffersSync() {
        int n = AL11.alGetSourcei((int)this.source, (int)4117);
        SoundManager.checkAlError();
        return n;
    }

    protected void removeProcessedBuffersSync() {
        int n = AL11.alGetSourcei((int)this.source, (int)4118);
        SoundManager.checkAlError();
        for (int i = 0; i < n; ++i) {
            AL11.alSourceUnqueueBuffers((int)this.source);
            SoundManager.checkAlError();
        }
    }

    protected int getBufferSize() {
        return (Integer)VoicechatClient.CLIENT_CONFIG.outputBufferSize.get();
    }

    protected void setPositionSync(@Nullable class06889 class068892, float f) {
        class05363 class053632 = ((class03386)this.mc.i_5).s();
        class06889 class068893 = class053632.y();
        Vector3fc vector3fc = class053632.m();
        Vector3fc vector3fc2 = class053632.P();
        AL11.alListener3f((int)4100, (float)((float)class068893.M), (float)((float)class068893.B), (float)((float)class068893.Z));
        SoundManager.checkAlError();
        AL11.alListenerfv((int)4111, (float[])new float[]{vector3fc.x(), vector3fc.y(), vector3fc.z(), vector3fc2.x(), vector3fc2.y(), vector3fc2.z()});
        SoundManager.checkAlError();
        if (class068892 != null) {
            this.linearAttenuation(f);
            AL11.alSourcei((int)this.source, (int)514, (int)0);
            SoundManager.checkAlError();
            AL11.alSource3f((int)this.source, (int)4100, (float)((float)class068892.M), (float)((float)class068892.B), (float)((float)class068892.Z));
            SoundManager.checkAlError();
        } else {
            this.linearAttenuation(48.0f);
            AL11.alSourcei((int)this.source, (int)514, (int)1);
            SoundManager.checkAlError();
            AL11.alSource3f((int)this.source, (int)4100, (float)0.0f, (float)0.0f, (float)0.0f);
            SoundManager.checkAlError();
        }
    }

    protected void linearAttenuation(float f) {
        AL11.alDistanceModel((int)53251);
        SoundManager.checkAlError();
        AL11.alSourcef((int)this.source, (int)4131, (float)f);
        SoundManager.checkAlError();
        AL11.alSourcef((int)this.source, (int)4128, (float)(f / 2.0f));
        SoundManager.checkAlError();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean isStoppedSync() {
        if (this.getStateSync() == 4113) return true;
        if (this.getStateSync() == 4116) return true;
        if (this.getQueuedBuffersSync() > 0) return false;
        return true;
    }

    protected int getStateSync() {
        int n = AL11.alGetSourcei((int)this.source, (int)4112);
        SoundManager.checkAlError();
        return n;
    }

    public void checkBufferEmpty(Runnable runnable) {
        this.runInContext(() -> {
            if (this.getStateSync() == 4116 || this.getQueuedBuffersSync() <= 0) {
                runnable.run();
            }
        });
    }

    protected float getVolume(float f, @Nullable class06889 class068892, float f2) {
        return f;
    }

    public void runInContext(Runnable runnable) {
        if (this.executor.isShutdown()) {
            return;
        }
        this.soundManager.runInContext(this.executor, runnable);
    }

    protected boolean hasValidSourceSync() {
        boolean bl = AL11.alIsSource((int)this.source);
        SoundManager.checkAlError();
        return bl;
    }

    protected void closeSync() {
        if (this.hasValidSourceSync()) {
            if (this.getStateSync() == 4114) {
                AL11.alSourceStop((int)this.source);
                SoundManager.checkAlError();
            }
            AL11.alDeleteSources((int)this.source);
            SoundManager.checkAlError();
            AL11.alDeleteBuffers((int[])this.buffers);
            SoundManager.checkAlError();
        }
        this.source = 0;
        this.executor.shutdown();
    }

    protected void writeSync(short[] sArray, float f, @Nullable class06889 class068892, @Nullable String string, float f2) {
        ClientPluginManager.instance().onALSound(this.source, this.audioChannelId, class068892, string, OpenALSoundEvent.Pre.class);
        this.setPositionSync(class068892, f2);
        ClientPluginManager.instance().onALSound(this.source, this.audioChannelId, class068892, string, OpenALSoundEvent.class);
        AL11.alSourcef((int)this.source, (int)4110, (float)this.soundManager.getMaxGain());
        SoundManager.checkAlError();
        AL11.alSourcef((int)this.source, (int)4106, (float)this.getVolume(f, class068892, f2));
        SoundManager.checkAlError();
        AL11.alListenerf((int)4106, (float)1.0f);
        SoundManager.checkAlError();
        int n = this.getQueuedBuffersSync();
        if (n >= this.buffers.length) {
            Voicechat.LOGGER.warn("Full playback buffer: {}/{}", new Object[]{n, this.buffers.length});
            int n2 = AL11.alGetSourcei((int)this.source, (int)4133);
            SoundManager.checkAlError();
            int n3 = n - this.getBufferSize();
            AL11.alSourcei((int)this.source, (int)4133, (int)(n2 + n3 * this.bufferSampleSize));
            SoundManager.checkAlError();
            this.removeProcessedBuffersSync();
        }
        AL11.alBufferData((int)this.buffers[this.bufferIndex], (int)this.getFormat(), (short[])this.convert(sArray, class068892), (int)this.sampleRate);
        SoundManager.checkAlError();
        AL11.alSourceQueueBuffers((int)this.source, (int)this.buffers[this.bufferIndex]);
        SoundManager.checkAlError();
        this.bufferIndex = (this.bufferIndex + 1) % this.buffers.length;
        ClientPluginManager.instance().onALSound(this.source, this.audioChannelId, class068892, string, OpenALSoundEvent.Post.class);
    }

    protected void openSync() {
        if (this.hasValidSourceSync()) {
            return;
        }
        this.source = AL11.alGenSources();
        SoundManager.checkAlError();
        AL11.alSourcei((int)this.source, (int)4103, (int)0);
        SoundManager.checkAlError();
        AL11.alDistanceModel((int)53251);
        SoundManager.checkAlError();
        AL11.alSourcef((int)this.source, (int)4131, (float)ClientUtils.getDefaultDistanceClient());
        SoundManager.checkAlError();
        AL11.alSourcef((int)this.source, (int)4128, (float)0.0f);
        SoundManager.checkAlError();
        AL11.alGenBuffers((int[])this.buffers);
        SoundManager.checkAlError();
    }

    @Override
    public void play(short[] sArray, float f, @Nullable class06889 class068892, @Nullable String string, float f2) {
        this.runInContext(() -> {
            this.removeProcessedBuffersSync();
            boolean bl = this.isStoppedSync();
            if (bl) {
                Voicechat.LOGGER.debug("Filling playback buffer {}", new Object[]{this.audioChannelId});
                for (int i = 0; i < this.getBufferSize(); ++i) {
                    this.writeSync(new short[this.bufferSize], 1.0f, class068892, string, f2);
                }
            }
            this.writeSync(sArray, f, class068892, string, f2);
            if (bl) {
                AL11.alSourcePlay((int)this.source);
                SoundManager.checkAlError();
            }
        });
    }
}

