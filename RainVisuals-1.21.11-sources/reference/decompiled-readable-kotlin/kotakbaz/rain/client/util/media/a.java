package kotakbaz.rain.client.util.media;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import oxxxde.ضك;

// $VF: Compiled from heavy
public final class a {
   private static volatile String trackTitle = "null";
   private static final AtomicBoolean REFRESH_IN_FLIGHT = new AtomicBoolean(false);
   private static volatile NativeImageBackedTexture texture = null;
   private static volatile String lastTrackTitle = "null";
   private static volatile String durationTime = "00:00";
   private static volatile int textureWidth = 0;
   private static final Identifier TRACK_TEXTURE_ID = Identifier.of("rain", "media/current_track_art");
   private static volatile boolean active = false;
   private static final String MEDIA_INFO_ENABLED_PROPERTY = "rain.media.enabled";
   private static volatile boolean plaing = false;
   private static volatile String artist = "null";
   private static volatile Identifier textureId = null;
   private static volatile int textureHeight = 0;
   private static volatile String trackTime = "00:00";
   private static final ExecutorService MEDIA_EXECUTOR = Executors.newSingleThreadExecutor(task -> {
      Thread thread = new Thread(task, "Rain-MediaUtil");
      thread.setDaemon(true);
      return thread;
   });
   private static final boolean MEDIA_INFO_ENABLED = resolveMediaInfoEnabled();
   private static volatile long duration = 0L;
   private static volatile long position = 0L;

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
      if (texture != null || textureId != null || textureWidth != 0 || textureHeight != 0) {
         textureId = null;
         textureWidth = 0;
         textureHeight = 0;
         clearTexture();
      }
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
      if (MEDIA_INFO_ENABLED) {
         MEDIA_EXECUTOR.execute(() -> {
            try {
               List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
               IMediaSession session = selectSession(sessions);
               if (session != null) {
                  session.previous();
               }
            } catch (Exception var2) {
            }
         });
      }
   }

   private a() {
   }

   public static String getArtist() {
      return artist;
   }

   private static void uploadArtwork(BufferedImage image) {
      if (ضك.getMc() != null && ضك.getMc().getTextureManager() != null) {
         try {
            NativeImage nativeImage = toNativeImage(image);
            int width = image.getWidth();
            int height = image.getHeight();
            ضك.getMc().execute(() -> {
               try {
                  NativeImageBackedTexture newTexture = new NativeImageBackedTexture(() -> "media_artwork", nativeImage);
                  ضك.getMc().getTextureManager().registerTexture(TRACK_TEXTURE_ID, newTexture);
                  texture = newTexture;
                  textureId = TRACK_TEXTURE_ID;
                  textureWidth = width;
                  textureHeight = height;
               } catch (Exception var4x) {
                  nativeImage.close();
               }
            });
         } catch (Exception var4) {
         }
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
      if (ضك.getMc() != null && ضك.getMc().getTextureManager() != null) {
         ضك.getMc().execute(() -> {
            ضك.getMc().getTextureManager().destroyTexture(TRACK_TEXTURE_ID);
            texture = null;
            textureId = null;
            textureWidth = 0;
            textureHeight = 0;
         });
      } else {
         texture = null;
         textureId = null;
         textureWidth = 0;
         textureHeight = 0;
      }
   }

   public static void updateTrackInfo() {
      if (!MEDIA_INFO_ENABLED) {
         resetMediaState();
      } else if (REFRESH_IN_FLIGHT.compareAndSet(false, true)) {
         MEDIA_EXECUTOR.execute(() -> {
            try {
               List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
               IMediaSession session = selectSession(sessions);
               active = session != null;
               if (session != null) {
                  MediaInfo media = session.getMedia();
                  String newTitle = normalizeMetadata(media.getTitle());
                  boolean play = media.getPlaying();
                  String newArtist = normalizeMetadata(media.getArtist());
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
                        uploadArtwork(artwork);
                     }
                  } else if (titleChanged) {
                     clearTexture();
                  }

                  long posMin = position / 60L;
                  long posSec = position % 60L;
                  long durMin = duration / 60L;
                  long durSec = duration % 60L;
                  trackTime = posMin + ":" + (posSec < 10L ? "0" : "") + posSec;
                  durationTime = durMin + ":" + (durSec < 10L ? "0" : "") + durSec;
               } else {
                  resetMediaState();
               }
            } catch (Exception var19) {
            } finally {
               REFRESH_IN_FLIGHT.set(false);
            }
         });
      }
   }

   public static Identifier getTextureId() {
      return textureId;
   }

   public static void playpauseTrack() {
      if (MEDIA_INFO_ENABLED) {
         MEDIA_EXECUTOR.execute(() -> {
            try {
               List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
               IMediaSession session = selectSession(sessions);
               if (session != null) {
                  session.playPause();
               }
            } catch (Exception var2) {
            }
         });
      }
   }

   public static void nextTrack() {
      if (MEDIA_INFO_ENABLED) {
         MEDIA_EXECUTOR.execute(() -> {
            try {
               List<IMediaSession> sessions = MediaPlayerInfo.Instance.getMediaSessions();
               IMediaSession session = selectSession(sessions);
               if (session != null) {
                  session.next();
               }
            } catch (Exception var2) {
            }
         });
      }
   }

   private static IMediaSession selectSession(List<IMediaSession> sessions) {
      IMediaSession bestSession = null;
      int bestScore = Integer.MIN_VALUE;

      for (IMediaSession session : sessions) {
         if (session != null) {
            try {
               MediaInfo media = session.getMedia();
               if (media != null) {
                  int score = 0;
                  if (media.getPlaying()) {
                     score += 4;
                  }

                  if (normalizeMetadata(media.getTitle()) != null) {
                     score += 2;
                  }

                  if (normalizeMetadata(media.getArtist()) != null) {
                     score++;
                  }

                  if (score > bestScore) {
                     bestScore = score;
                     bestSession = session;
                  }
               }
            } catch (Exception var7) {
            }
         }
      }

      return bestSession;
   }

   private static NativeImage toNativeImage(BufferedImage image) {
      NativeImage nativeImage = new NativeImage(image.getWidth(), image.getHeight(), false);

      for (int x = 0; x < image.getWidth(); x++) {
         for (int y = 0; y < image.getHeight(); y++) {
            int argb = image.getRGB(x, y);
            int a = argb >>> 24 & 0xFF;
            int r = argb >>> 16 & 0xFF;
            int g = argb >>> 8 & 0xFF;
            int b = argb & 0xFF;
            int abgr = a << 24 | b << 16 | g << 8 | r;
            nativeImage.setColor(x, y, abgr);
         }
      }

      return nativeImage;
   }

   private static boolean resolveMediaInfoEnabled() {
      String configured = System.getProperty("rain.media.enabled");
      if (configured != null) {
         return Boolean.parseBoolean(configured);
      }

      String osName = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
      return osName.contains("win");
   }

   public static float getProgress() {
      return active && duration != 0L ? (float)position / (float)duration : 0.0F;
   }

   public static boolean getPlaing() {
      return plaing;
   }

   private static String normalizeMetadata(String value) {
      if (value == null) {
         return null;
      } else {
         String normalized = value.trim();
         if (normalized.isEmpty()) {
            return null;
         } else {
            return "null".equalsIgnoreCase(normalized) ? null : normalized;
         }
      }
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
