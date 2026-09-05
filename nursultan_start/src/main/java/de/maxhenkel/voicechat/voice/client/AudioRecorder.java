/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.mp3.Mp3Encoder
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  de.maxhenkel.voicechat.natives.LameManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04771
 *  minecraft.class06202
 *  minecraft.class06541
 *  org.apache.commons.io.FileUtils
 */
package de.maxhenkel.voicechat.voice.client;

import com.mojang.authlib.GameProfile;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.mp3.Mp3Encoder;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.natives.LameManager;
import de.maxhenkel.voicechat.voice.client.AudioRecorder$AudioChunk;
import de.maxhenkel.voicechat.voice.client.AudioRecorder$EncoderData;
import de.maxhenkel.voicechat.voice.client.ChatUtils;
import de.maxhenkel.voicechat.voice.common.NamedThreadPoolFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04771;
import minecraft.class06202;
import minecraft.class06541;
import org.apache.commons.io.FileUtils;

public class AudioRecorder {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
    private static final int MP3_BITRATE = 320;
    private final long timestamp;
    private final Path location;
    private final GameProfile ownProfile;
    private final Map<UUID, AudioRecorder$AudioChunk> chunks;
    private final Map<UUID, AudioRecorder$EncoderData> encoders;
    final AudioFormat stereoFormat;
    private final ExecutorService threadPool;

    public static AudioRecorder create() {
        long l = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        String string = (String)VoicechatClient.CLIENT_CONFIG.recordingDestination.get();
        Path path = string.trim().isEmpty() ? CommonCompatibilityManager.INSTANCE.getGameDirectory().resolve("voicechat_recordings").resolve(FORMAT.format(calendar.getTime())) : Paths.get(string, new String[0]).resolve(FORMAT.format(calendar.getTime()));
        return new AudioRecorder(path, l);
    }

    public long getStartTime() {
        return this.timestamp;
    }

    public AudioRecorder(Path path, long l) {
        this.timestamp = l;
        this.location = path;
        path.toFile().mkdirs();
        this.chunks = new ConcurrentHashMap<UUID, AudioRecorder$AudioChunk>();
        this.encoders = new ConcurrentHashMap<UUID, AudioRecorder$EncoderData>();
        class04771 class047712 = class06202.Nq().Ny();
        this.ownProfile = new GameProfile(class047712.y(), class047712.L());
        this.stereoFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 48000.0f, 16, 2, 4, 48000.0f, false);
        this.threadPool = Executors.newSingleThreadExecutor(NamedThreadPoolFactory.create("AudioRecorderThread"));
    }

    private void flush() throws IOException {
        for (Map.Entry<UUID, AudioRecorder$AudioChunk> entry : this.chunks.entrySet()) {
            this.writeChunk(entry.getKey(), entry.getValue());
        }
    }

    public Path getLocation() {
        return this.location;
    }

    public void close() {
        if (this.threadPool.isShutdown()) {
            throw new IllegalStateException("Recorder already closed");
        }
        this.threadPool.shutdown();
    }

    private void save() {
        this.threadPool.execute(() -> {
            this.send((class00392)class00392.L((String)"message.voicechat.processing_recording_session"));
            try {
                IOException iOException = null;
                this.sendProgress(0.0f);
                try {
                    this.flush();
                    this.sendProgress(0.5f);
                }
                catch (IOException iOException2) {
                    iOException = iOException2;
                }
                for (AudioRecorder$EncoderData audioRecorder$EncoderData : this.encoders.values()) {
                    if (audioRecorder$EncoderData.encoder != null) {
                        try {
                            audioRecorder$EncoderData.encoder.close();
                        }
                        catch (IOException iOException3) {
                            iOException = iOException3;
                        }
                        continue;
                    }
                    iOException = new IOException("Failed to load mp3 encoder");
                }
                if (iOException != null) {
                    throw iOException;
                }
                this.sendProgress(1.0f);
                this.send((class00392)class00392.N((String)"message.voicechat.save_session", (Object[])new Object[]{class00392.y((String)this.location.normalize().toString()).N(new class06541[]{class06541.field_1080, class06541.field_1073}).N(class004052 -> class004052.N((class00395)new class00401((class00392)class00392.L((String)"message.voicechat.open_folder"))).N((class00647)new class00623(this.location.normalize().toString())))}));
            }
            catch (Exception exception) {
                Voicechat.LOGGER.error("Failed to save recording session", new Object[]{exception});
                this.send((class00392)class00392.N((String)"message.voicechat.save_session_failed", (Object[])new Object[]{exception.getMessage()}));
            }
        });
    }

    private AudioRecorder$AudioChunk getChunk(UUID uUID, long l) {
        if (!this.chunks.containsKey(uUID)) {
            AudioRecorder$AudioChunk audioRecorder$AudioChunk = new AudioRecorder$AudioChunk(this, l);
            this.chunks.put(uUID, audioRecorder$AudioChunk);
            return audioRecorder$AudioChunk;
        }
        return this.chunks.get(uUID);
    }

    private void send(class00392 class003922) {
        class06202 class062022 = class06202.Nq();
        class04453 class044532 = (class04453)class062022.T_4;
        if (class044532 != null && (class03448)class062022.T_3 != null) {
            class062022.execute(() -> ChatUtils.sendPlayerMessage(class003922));
        } else {
            Voicechat.LOGGER.info("{}", new Object[]{class003922.getString()});
        }
    }

    public String getDuration(long l) {
        long l2 = l - this.timestamp;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(":mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return l2 / 3600000L + simpleDateFormat.format(new Date(l2));
    }

    public String getDuration() {
        return this.getDuration(System.currentTimeMillis());
    }

    public String getStorage(long l) {
        long l2 = (l - this.timestamp) / 1000L;
        long l3 = l2 * 320L * 1000L / 8L * (long)this.getRecordedPlayerCount();
        return FileUtils.byteCountToDisplaySize((long)l3);
    }

    public String getStorage() {
        return this.getStorage(System.currentTimeMillis());
    }

    public void flushChunkThreaded(UUID uUID) {
        AudioRecorder$AudioChunk audioRecorder$AudioChunk = this.getAndRemoveChunk(uUID);
        if (audioRecorder$AudioChunk == null) {
            return;
        }
        this.threadPool.execute(() -> {
            try {
                this.writeChunk(uUID, audioRecorder$AudioChunk);
            }
            catch (IOException iOException) {
                Voicechat.LOGGER.error("Failed to save audio chunk for {}", new Object[]{uUID, iOException});
            }
        });
    }

    private int getAudioTimeMillis(int n) {
        return n / this.stereoFormat.getChannels() / this.getSamplesPerMs();
    }

    public void saveAndClose() {
        this.save();
        this.close();
    }

    @Nullable
    private AudioRecorder$AudioChunk getAndRemoveChunk(UUID uUID) {
        return this.chunks.remove(uUID);
    }

    private int getSamplesPerMs() {
        return (int)this.stereoFormat.getSampleRate() / 1000;
    }

    private void sendProgress(float f) {
        this.send((class00392)class00392.N((String)"message.voicechat.processing_progress", (Object[])new Object[]{class00392.y((String)String.valueOf((int)(f * 100.0f))).N(class06541.field_1080)}));
    }

    public void appendChunk(UUID uUID, long l, short[] sArray) throws IOException {
        Object object;
        if (sArray.length <= 0) {
            this.flushChunkThreaded(uUID);
            return;
        }
        if (!this.encoders.containsKey(uUID)) {
            object = LameManager.createEncoder((AudioFormat)this.stereoFormat, (int)320, (int)((Integer)VoicechatClient.CLIENT_CONFIG.recordingQuality.get()), (OutputStream)Files.newOutputStream(this.location.resolve(this.lookupName(uUID) + ".mp3"), StandardOpenOption.CREATE_NEW));
            this.encoders.put(uUID, new AudioRecorder$EncoderData((Mp3Encoder)object, this.timestamp));
            if (object == null) {
                throw new IOException("Failed to load mp3 encoder");
            }
        }
        object = this.getChunk(uUID, l);
        long l2 = l - ((AudioRecorder$AudioChunk)object).endTimestamp;
        long l3 = (long)((Integer)VoicechatClient.CLIENT_CONFIG.outputBufferSize.get()).intValue() * 20L;
        if (l2 < l3 && ((AudioRecorder$AudioChunk)object).getDuration() < 60000L) {
            ((AudioRecorder$AudioChunk)object).add(sArray, l);
        } else {
            this.flushChunkThreaded(uUID);
            object = this.getChunk(uUID, l);
            ((AudioRecorder$AudioChunk)object).add(sArray, l);
        }
    }

    private String lookupName(UUID uUID) {
        if (uUID.equals(this.ownProfile.id())) {
            return this.ownProfile.name();
        }
        String string = VoicechatClient.USERNAME_CACHE.getUsername(uUID);
        if (string == null) {
            return "system-" + String.valueOf(uUID);
        }
        return string;
    }

    private void writeChunk(UUID uUID, AudioRecorder$AudioChunk audioRecorder$AudioChunk) throws IOException {
        short[] sArray;
        AudioRecorder$EncoderData audioRecorder$EncoderData = this.encoders.get(uUID);
        if (audioRecorder$EncoderData == null) {
            Voicechat.LOGGER.error("Failed to find recording data for {}", new Object[]{uUID});
            return;
        }
        if (audioRecorder$EncoderData.encoder == null) {
            return;
        }
        long l = audioRecorder$AudioChunk.timestamp - audioRecorder$EncoderData.lastTimestamp;
        if (l < -100L) {
            Voicechat.LOGGER.warn("Audio snippet {} overlaps more than 100ms with previous snippet.", new Object[]{audioRecorder$AudioChunk.timestamp});
            return;
        }
        if (l < -20L) {
            Voicechat.LOGGER.warn("Audio {} overlaps with previous snippet.", new Object[]{audioRecorder$AudioChunk.timestamp});
        }
        if (l < 0L) {
            l = 0L;
        }
        int n = (int)(l * (long)this.getSamplesPerMs() * (long)this.stereoFormat.getChannels());
        int n2 = (int)this.stereoFormat.getSampleRate() * this.stereoFormat.getChannels() * 10;
        int n3 = 0;
        if (n > n2) {
            sArray = new short[n2];
            while (n3 + n2 < n) {
                audioRecorder$EncoderData.encoder.encode(sArray);
                n3 += n2;
            }
        }
        sArray = new short[n - n3];
        audioRecorder$EncoderData.encoder.encode(sArray);
        short[] sArray2 = audioRecorder$AudioChunk.getData();
        audioRecorder$EncoderData.encoder.encode(sArray2);
        audioRecorder$EncoderData.lastTimestamp = audioRecorder$AudioChunk.timestamp + (long)this.getAudioTimeMillis(sArray2.length);
    }

    public int getRecordedPlayerCount() {
        return this.encoders.size();
    }
}

