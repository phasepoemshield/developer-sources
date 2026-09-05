/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 *  de.maxhenkel.voicechat.integration.freecam.FreecamUtil
 *  de.maxhenkel.voicechat.natives.OpusManager
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 *  minecraft.class00734
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08036
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import de.maxhenkel.voicechat.integration.freecam.FreecamUtil;
import de.maxhenkel.voicechat.natives.OpusManager;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.AudioPacketBuffer;
import de.maxhenkel.voicechat.voice.client.AudioRecorder;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.InitializationData;
import de.maxhenkel.voicechat.voice.client.PositionalAudioUtils;
import de.maxhenkel.voicechat.voice.client.speaker.Speaker;
import de.maxhenkel.voicechat.voice.client.speaker.SpeakerManager;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.SoundPacket;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import minecraft.class00734;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;

public class AudioChannel
extends Thread {
    private final class06202 minecraft;
    private final ClientVoicechat client;
    private final InitializationData initializationData;
    private final UUID uuid;
    private final BlockingQueue<SoundPacket<?>> queue;
    private final AudioPacketBuffer packetBuffer;
    private long lastPacketTime;
    private Speaker speaker;
    private boolean stopped;
    private final OpusDecoder decoder;
    private long lastSequenceNumber;
    private long lostPackets;

    public AudioChannel(ClientVoicechat clientVoicechat, InitializationData initializationData, UUID uUID) {
        this.client = clientVoicechat;
        this.initializationData = initializationData;
        this.uuid = uUID;
        this.queue = new LinkedBlockingQueue();
        this.packetBuffer = new AudioPacketBuffer((Integer)VoicechatClient.CLIENT_CONFIG.audioPacketThreshold.get());
        this.lastPacketTime = System.currentTimeMillis();
        this.stopped = false;
        this.decoder = OpusManager.createDecoder();
        this.lastSequenceNumber = -1L;
        this.minecraft = class06202.Nq();
        this.setDaemon(true);
        this.setName("AudioChannelThread-" + uUID.toString());
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
        Voicechat.LOGGER.info("Creating audio channel {}", new Object[]{uUID});
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block25: {
            block26: {
                try {
                    if (this.client.getSoundManager() == null) {
                        throw new IllegalStateException("Started audio channel without sound manager");
                    }
                    this.speaker = SpeakerManager.createSpeaker(this.client.getSoundManager(), this.uuid);
                    while (!this.stopped) {
                        Object object;
                        if (ClientManager.getPlayerStateManager().isDisabled()) {
                            this.closeAndKill();
                            if (this.speaker != null) {
                                this.flushRecording();
                                this.speaker.close();
                            }
                            break block25;
                        }
                        SoundPacket<?> soundPacket = this.packetBuffer.poll(this.queue);
                        if (soundPacket == null) continue;
                        this.lastPacketTime = System.currentTimeMillis();
                        if (!soundPacket.isFromClientAudioChannel() && this.lastSequenceNumber >= 0L && soundPacket.getSequenceNumber() <= this.lastSequenceNumber || (class03448)this.minecraft.T_3 == null || (class04453)this.minecraft.T_4 == null) continue;
                        if (soundPacket.getData().length == 0) {
                            if (soundPacket instanceof PlayerSoundPacket) {
                                PlayerSoundPacket playerSoundPacket = (PlayerSoundPacket)soundPacket;
                                ClientPluginManager.instance().onReceiveEntityClientSound(this.uuid, playerSoundPacket.getSender(), new short[0], playerSoundPacket.isWhispering(), playerSoundPacket.getDistance());
                            } else if (soundPacket instanceof LocationSoundPacket) {
                                object = (LocationSoundPacket)soundPacket;
                                ClientPluginManager.instance().onReceiveLocationalClientSound(this.uuid, new short[0], ((LocationSoundPacket)object).getLocation(), ((LocationSoundPacket)object).getDistance());
                            } else if (soundPacket instanceof GroupSoundPacket) {
                                ClientPluginManager.instance().onReceiveStaticClientSound(this.uuid, new short[0]);
                            }
                            this.lastSequenceNumber = -1L;
                            this.packetBuffer.clear();
                            this.flushRecording();
                            this.decoder.resetState();
                            this.client.getTalkCache().updateLevel(this.uuid, soundPacket.getCategory(), false, new short[0]);
                            continue;
                        }
                        if (soundPacket.isFromClientAudioChannel()) {
                            this.writeToSpeaker(soundPacket, AudioUtils.bytesToShorts(soundPacket.getData()));
                            continue;
                        }
                        int n = 0;
                        if (this.lastSequenceNumber >= 0L) {
                            n = (int)(soundPacket.getSequenceNumber() - (this.lastSequenceNumber + 1L));
                            if (n > 0) {
                                this.lostPackets += (long)n;
                            }
                            if (n > (Integer)VoicechatClient.CLIENT_CONFIG.outputBufferSize.get()) {
                                Voicechat.LOGGER.debug("Skipping compensation for {} packets", new Object[]{n});
                                n = 0;
                                this.decoder.resetState();
                                this.flushRecording();
                            } else if (n > 0) {
                                Voicechat.LOGGER.debug("Compensating {} packet(s) ", new Object[]{n});
                            }
                        }
                        this.lastSequenceNumber = soundPacket.getSequenceNumber();
                        for (Object object2 : object = (Object)this.decoder.decode(soundPacket.getData(), n + 1)) {
                            this.writeToSpeaker(soundPacket, (short[])object2);
                        }
                    }
                    if (this.speaker == null) break block26;
                    this.flushRecording();
                    this.speaker.close();
                }
                catch (InterruptedException interruptedException) {
                    if (this.speaker != null) {
                        this.flushRecording();
                        this.speaker.close();
                    }
                    this.decoder.close();
                    Voicechat.LOGGER.info("Closed audio channel {}", new Object[]{this.uuid});
                    return;
                }
                catch (Throwable throwable) {
                    block27: {
                        try {
                            Voicechat.LOGGER.error("Audio channel error", new Object[]{throwable});
                            if (this.speaker == null) break block27;
                            this.flushRecording();
                            this.speaker.close();
                        }
                        catch (Throwable throwable2) {
                            if (this.speaker != null) {
                                this.flushRecording();
                                this.speaker.close();
                            }
                            this.decoder.close();
                            Voicechat.LOGGER.info("Closed audio channel {}", new Object[]{this.uuid});
                            throw throwable2;
                        }
                    }
                    this.decoder.close();
                    Voicechat.LOGGER.info("Closed audio channel {}", new Object[]{this.uuid});
                    return;
                }
            }
            this.decoder.close();
            Voicechat.LOGGER.info("Closed audio channel {}", new Object[]{this.uuid});
            return;
        }
        this.decoder.close();
        Voicechat.LOGGER.info("Closed audio channel {}", new Object[]{this.uuid});
    }

    public BlockingQueue<SoundPacket<?>> getQueue() {
        return this.queue;
    }

    public boolean isClosed() {
        return this.stopped;
    }

    public long getLostPackets() {
        return this.lostPackets;
    }

    public AudioPacketBuffer getPacketBuffer() {
        return this.packetBuffer;
    }

    private void appendRecording(Supplier<short[]> supplier) {
        if (this.client.getRecorder() != null) {
            try {
                this.client.getRecorder().appendChunk(this.uuid, System.currentTimeMillis(), supplier.get());
            }
            catch (IOException iOException) {
                Voicechat.LOGGER.error("Failed to record audio", new Object[]{iOException});
                this.client.setRecording(false);
            }
        }
    }

    private void writeToSpeaker(SoundPacket<?> soundPacket, short[] sArray) {
        String string = soundPacket.getCategory();
        float f = VoicechatClient.USERNAME_CACHE.has(this.uuid) ? (float)VoicechatClient.PLAYER_VOLUME_CONFIG.getVolume((Object)this.uuid) : (string != null ? (float)VoicechatClient.CATEGORY_VOLUME_CONFIG.getVolume((Object)string) : (float)VoicechatClient.CATEGORY_VOLUME_CONFIG.getVolume((Object)"other"));
        float f2 = ((Double)VoicechatClient.CLIENT_CONFIG.voiceChatVolume.get()).floatValue() * f;
        if (soundPacket instanceof GroupSoundPacket) {
            short[] sArray2 = ClientPluginManager.instance().onReceiveStaticClientSound(this.uuid, sArray);
            this.speaker.play(sArray2, f2, soundPacket.getCategory());
            this.client.getTalkCache().updateLevel(this.uuid, string, false, sArray2);
            this.appendRecording(() -> PositionalAudioUtils.convertToStereo(sArray2));
        } else if (soundPacket instanceof PlayerSoundPacket) {
            class06889 class068892;
            Object object;
            PlayerSoundPacket playerSoundPacket = (PlayerSoundPacket)soundPacket;
            class08036 class080362 = ((class03448)this.minecraft.T_3).N(playerSoundPacket.getSender());
            if (class080362 == null) {
                object = ((class03386)this.minecraft.i_5).s().y();
                class068892 = new class00734(object.M - (double)playerSoundPacket.getDistance() - 1.0, object.B - (double)playerSoundPacket.getDistance() - 1.0, object.Z - (double)playerSoundPacket.getDistance() - 1.0, object.M + (double)playerSoundPacket.getDistance() + 1.0, object.B + (double)playerSoundPacket.getDistance() + 1.0, object.Z + (double)playerSoundPacket.getDistance() + 1.0);
                class080362 = ((class03448)this.minecraft.T_3).method_8333((class07049)null, (class00734)class068892, class070492 -> class070492.method_5667().equals(playerSoundPacket.getSender())).stream().findAny().orElse(null);
                if (class080362 == null) {
                    return;
                }
            }
            if (class080362 == this.minecraft.F()) {
                object = ClientPluginManager.instance().onReceiveStaticClientSound(this.uuid, sArray);
                this.speaker.play((short[])object, f2, playerSoundPacket.getCategory());
                this.client.getTalkCache().updateLevel(this.uuid, string, playerSoundPacket.isWhispering(), (short[])object);
                this.appendRecording(() -> AudioChannel.lambda$writeToSpeaker$2((short[])object));
                return;
            }
            float f3 = 1.0f;
            if (class080362 instanceof class07438) {
                f3 = Math.min(Math.max((20.0f - (float)((class07438)class080362).fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue()) / 20.0f, 0.0f), 1.0f);
            }
            f2 *= f3;
            class068892 = class080362.method_33571();
            short[] sArray3 = ClientPluginManager.instance().onReceiveEntityClientSound(this.uuid, playerSoundPacket.getSender(), sArray, playerSoundPacket.isWhispering(), playerSoundPacket.getDistance());
            if (FreecamUtil.getDistanceTo((class06889)class068892) > (double)playerSoundPacket.getDistance() + 1.0) {
                return;
            }
            float f4 = FreecamUtil.getDistanceVolume((float)playerSoundPacket.getDistance(), (class06889)class068892);
            if (FreecamUtil.isFreecamEnabled()) {
                this.speaker.play(sArray3, f2 *= f4, playerSoundPacket.getCategory());
                if (f4 > 0.0f) {
                    this.client.getTalkCache().updateLevel(playerSoundPacket.getSender(), string, playerSoundPacket.isWhispering(), sArray3);
                }
                float f5 = f2;
                this.appendRecording(() -> PositionalAudioUtils.convertToStereo(sArray3, f5));
                return;
            }
            this.speaker.play(sArray3, f2, class068892, playerSoundPacket.getCategory(), playerSoundPacket.getDistance());
            if (f4 > 0.0f) {
                this.client.getTalkCache().updateLevel(playerSoundPacket.getSender(), string, playerSoundPacket.isWhispering(), sArray3);
            }
            float f6 = f3;
            this.appendRecording(() -> PositionalAudioUtils.convertToStereoForRecording(playerSoundPacket.getDistance(), class068892, sArray3, f6));
        } else if (soundPacket instanceof LocationSoundPacket) {
            LocationSoundPacket locationSoundPacket = (LocationSoundPacket)soundPacket;
            short[] sArray4 = ClientPluginManager.instance().onReceiveLocationalClientSound(this.uuid, sArray, locationSoundPacket.getLocation(), locationSoundPacket.getDistance());
            if (FreecamUtil.getDistanceTo((class06889)locationSoundPacket.getLocation()) > (double)locationSoundPacket.getDistance() + 1.0) {
                return;
            }
            this.speaker.play(sArray4, f2, locationSoundPacket.getLocation(), locationSoundPacket.getCategory(), locationSoundPacket.getDistance());
            this.client.getTalkCache().updateLevel(this.uuid, string, false, sArray4);
            this.appendRecording(() -> PositionalAudioUtils.convertToStereoForRecording(locationSoundPacket.getDistance(), locationSoundPacket.getLocation(), sArray4));
        }
    }

    public void closeAndKill() {
        Voicechat.LOGGER.info("Closing audio channel {}", new Object[]{this.uuid});
        this.stopped = true;
        this.queue.clear();
        if (Thread.currentThread() == this) {
            return;
        }
        this.interrupt();
        try {
            this.join();
        }
        catch (InterruptedException interruptedException) {
            Voicechat.LOGGER.error("Interrupted while waiting for audio channel to close", new Object[]{interruptedException});
        }
    }

    private void flushRecording() {
        AudioRecorder audioRecorder = this.client.getRecorder();
        if (audioRecorder == null) {
            return;
        }
        audioRecorder.flushChunkThreaded(this.uuid);
    }

    public boolean canKill() {
        return System.currentTimeMillis() - this.lastPacketTime > 30000L;
    }

    public void addToQueue(SoundPacket<?> soundPacket) {
        this.queue.add(soundPacket);
    }

    private static /* synthetic */ short[] lambda$writeToSpeaker$2(short[] sArray) {
        return PositionalAudioUtils.convertToStereo(sArray);
    }

    public UUID getChannelId() {
        return this.uuid;
    }

    public Speaker getSpeaker() {
        return this.speaker;
    }
}

