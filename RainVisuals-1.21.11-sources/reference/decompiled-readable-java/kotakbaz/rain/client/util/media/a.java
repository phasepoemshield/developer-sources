/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.util.Identifier
 */
package kotakbaz.rain.client.util.media;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import oxxxde.\u0636\u0643;

public final class a {
    private static volatile String trackTitle;
    private static final AtomicBoolean REFRESH_IN_FLIGHT;
    private static volatile NativeImageBackedTexture texture;
    private static volatile String lastTrackTitle;
    private static volatile String durationTime;
    private static volatile int textureWidth;
    private static final Identifier TRACK_TEXTURE_ID;
    private static volatile boolean active;
    private static final String MEDIA_INFO_ENABLED_PROPERTY = "rain.media.enabled";
    private static volatile boolean plaing;
    private static volatile String artist;
    private static volatile Identifier textureId;
    private static volatile int textureHeight;
    private static volatile String trackTime;
    private static final ExecutorService MEDIA_EXECUTOR;
    private static final boolean MEDIA_INFO_ENABLED;
    private static volatile long duration;
    private static volatile long position;

    private static void resetMediaState() {
        trackTitle = "null";
        lastTrackTitle = null;
        artist = "null";
        trackTime = "00:00";
        durationTime = "00:00";
        plaing = false;
        active = false;
        position = 0L;
        duration = 0L;
        if (texture == null && textureId == null && textureWidth == 0 && textureHeight == 0) {
            return;
        }
        textureId = null;
        textureWidth = 0;
        textureHeight = 0;
        a.clearTexture();
    }

    public static String getTrackTime() {
        return trackTime;
    }

    public static long getPosition() {
        return position;
    }

    public static long getDuration() {
        return duration;
    }

    public static void previousTrack() {
        if (!MEDIA_INFO_ENABLED) {
            return;
        }
        MEDIA_EXECUTOR.execute(() -> {
            try {
                List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession session = a.selectSession(sessions);
                if (session != null) {
                    session.previous();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }

    private a() {
    }

    public static String getArtist() {
        return artist;
    }

    private static void uploadArtwork(BufferedImage image) {
        if (\u0636\u0643.getMc() == null || \u0636\u0643.getMc().getTextureManager() == null) {
            return;
        }
        try {
            NativeImage nativeImage = a.toNativeImage(image);
            int width = image.getWidth();
            int height = image.getHeight();
            \u0636\u0643.getMc().execute(() -> {
                try {
                    NativeImageBackedTexture newTexture = new NativeImageBackedTexture(() -> "media_artwork", nativeImage);
                    \u0636\u0643.getMc().getTextureManager().registerTexture(TRACK_TEXTURE_ID, (AbstractTexture)newTexture);
                    texture = newTexture;
                    textureId = TRACK_TEXTURE_ID;
                    textureWidth = width;
                    textureHeight = height;
                }
                catch (Exception ignored) {
                    NativeImage nativeImage2;
                    nativeImage2.close();
                }
            });
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static int getTextureWidth() {
        return textureWidth;
    }

    public static int getTextureHeight() {
        return textureHeight;
    }

    public static String getDurationTime() {
        return durationTime;
    }

    private static void clearTexture() {
        block3: {
            block2: {
                if (\u0636\u0643.getMc() == null) break block2;
                if (\u0636\u0643.getMc().getTextureManager() != null) break block3;
            }
            texture = null;
            textureId = null;
            textureWidth = 0;
            textureHeight = 0;
            return;
        }
        \u0636\u0643.getMc().execute(() -> {
            \u0636\u0643.getMc().getTextureManager().destroyTexture(TRACK_TEXTURE_ID);
            texture = null;
            textureId = null;
            textureWidth = 0;
            textureHeight = 0;
        });
    }

    public static void updateTrackInfo() {
        if (!MEDIA_INFO_ENABLED) {
            a.resetMediaState();
            return;
        }
        if (!REFRESH_IN_FLIGHT.compareAndSet(false, true)) {
            return;
        }
        MEDIA_EXECUTOR.execute(() -> {
            block8: {
                try {
                    List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
                    IMediaSession session = a.selectSession(sessions);
                    active = session != null;
                    if (session != null) {
                        void var14_12;
                        MediaInfo media = session.getMedia();
                        String newTitle = a.normalizeMetadata(media.getTitle());
                        boolean play = media.getPlaying();
                        String newArtist = a.normalizeMetadata(media.getArtist());
                        BufferedImage artwork = media.getArtwork();
                        position = Math.max(0L, media.getPosition());
                        duration = Math.max(0L, media.getDuration());
                        plaing = play;
                        trackTitle = newTitle != null ? newTitle : "null";
                        artist = newArtist != null ? newArtist : "null";
                        boolean titleChanged = !Objects.equals(newTitle, lastTrackTitle);
                        lastTrackTitle = newTitle;
                        if (artwork != null) {
                            if (titleChanged || texture == null) {
                                a.uploadArtwork(artwork);
                            }
                        } else if (titleChanged) {
                            a.clearTexture();
                        }
                        long posMin = position / 60L;
                        long posSec = position % 60L;
                        long durMin = duration / 60L;
                        long durSec = duration % 60L;
                        trackTime = posMin + ":" + (posSec < 10L ? "0" : "") + posSec;
                        durationTime = durMin + ":" + (durSec < 10L ? "0" : "") + (long)var14_12;
                        break block8;
                    }
                    a.resetMediaState();
                }
                catch (Exception exception) {
                    REFRESH_IN_FLIGHT.set(false);
                }
                catch (Throwable throwable) {
                    REFRESH_IN_FLIGHT.set(false);
                    throw throwable;
                }
            }
            REFRESH_IN_FLIGHT.set(false);
        });
    }

    public static Identifier getTextureId() {
        return textureId;
    }

    public static void playpauseTrack() {
        if (!MEDIA_INFO_ENABLED) {
            return;
        }
        MEDIA_EXECUTOR.execute(() -> {
            try {
                List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession session = a.selectSession(sessions);
                if (session != null) {
                    session.playPause();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }

    public static void nextTrack() {
        if (!MEDIA_INFO_ENABLED) {
            return;
        }
        MEDIA_EXECUTOR.execute(() -> {
            try {
                List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
                IMediaSession session = a.selectSession(sessions);
                if (session != null) {
                    session.next();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    private static IMediaSession selectSession(List<IMediaSession> sessions) {
        void var1_1;
        IMediaSession bestSession = null;
        int bestScore = Integer.MIN_VALUE;
        Iterator<IMediaSession> iterator2 = sessions.iterator();
        while (iterator2.hasNext()) {
            IMediaSession session = iterator2.next();
            if (session == null) continue;
            try {
                MediaInfo media = session.getMedia();
                if (media == null) continue;
                int score = 0;
                if (media.getPlaying()) {
                    score += 4;
                }
                if (a.normalizeMetadata(media.getTitle()) != null) {
                    score += 2;
                }
                if (a.normalizeMetadata(media.getArtist()) != null) {
                    ++score;
                }
                if (score <= bestScore) continue;
                bestScore = score;
                bestSession = session;
            }
            catch (Exception exception) {}
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    private static NativeImage toNativeImage(BufferedImage image) {
        void var1_1;
        NativeImage nativeImage = new NativeImage(image.getWidth(), image.getHeight(), false);
        int x = 0;
        while (x < image.getWidth()) {
            void var2_2;
            int y = 0;
            while (y < image.getHeight()) {
                void var3_3;
                void var9_9;
                int argb = image.getRGB(x, y);
                int a2 = argb >>> 24 & 0xFF;
                int r = argb >>> 16 & 0xFF;
                int g = argb >>> 8 & 0xFF;
                int b2 = argb & 0xFF;
                int abgr = a2 << 24 | b2 << 16 | g << 8 | r;
                nativeImage.setColor(x, y, (int)var9_9);
                ++var3_3;
            }
            ++var2_2;
        }
        return var1_1;
    }

    private static boolean resolveMediaInfoEnabled() {
        String configured = System.getProperty(MEDIA_INFO_ENABLED_PROPERTY);
        if (configured != null) {
            return Boolean.parseBoolean(configured);
        }
        String osName = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        return osName.contains("win");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float getProgress() {
        if (!active) return 0.0f;
        if (duration == 0L) return 0.0f;
        float f = (float)position / (float)duration;
        return f;
    }

    public static boolean getPlaing() {
        return plaing;
    }

    /*
     * WARNING - void declaration
     */
    private static String normalizeMetadata(String value) {
        void var1_1;
        if (value == null) {
            return null;
        }
        String normalized = value.trim();
        if (normalized.isEmpty()) {
            return null;
        }
        if ("null".equalsIgnoreCase(normalized)) {
            return null;
        }
        return var1_1;
    }

    static {
        MEDIA_INFO_ENABLED = a.resolveMediaInfoEnabled();
        TRACK_TEXTURE_ID = Identifier.of((String)"rain", (String)"media/current_track_art");
        MEDIA_EXECUTOR = Executors.newSingleThreadExecutor(task -> {
            void var1_1;
            Thread thread2 = new Thread(task, "Rain-MediaUtil");
            thread2.setDaemon(true);
            return var1_1;
        });
        REFRESH_IN_FLIGHT = new AtomicBoolean(false);
        texture = null;
        textureId = null;
        textureWidth = 0;
        textureHeight = 0;
        trackTitle = "null";
        lastTrackTitle = "null";
        artist = "null";
        trackTime = "00:00";
        durationTime = "00:00";
        position = 0L;
        duration = 0L;
        active = false;
        plaing = false;
    }

    public static String getTrackTitle() {
        return trackTitle;
    }

    public static String getLastTrackTitle() {
        return lastTrackTitle;
    }

    public static NativeImageBackedTexture getTexture() {
        return texture;
    }

    public static boolean isActive() {
        return active;
    }
}

