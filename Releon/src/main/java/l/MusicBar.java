package l;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import fat.releon.Releon;
import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class MusicBar extends Helper119 {
   private static final float WIDTH = 100.0F;
   private static final float HEIGHT = 35.0F;
   private static final int ARTWORK_SIZE = 1;
   private static final long VOLUME_POLL_INTERVAL_MS = 2000L;
   private static final float VOLUME_TRACK_X_OFFSET = 9.0F;
   private static final float VOLUME_TRACK_Y_OFFSET = 4.5F;
   private static final float VOLUME_TRACK_WIDTH = 3.0F;
   private static final float VOLUME_TRACK_HEIGHT = 25.0F;
   private static final float VOLUME_HIT_WIDTH = 12.0F;
   private static final float VOLUME_HIT_HEIGHT = 29.0F;
   private static final float CONTROLS_Y_OFFSET = 20.0F;
   private static final float CONTROL_SPACING = 11.0F;
   private static final float CONTROL_HIT_HALF_SIZE = 5.0F;
   private static final MediaInfo EMPTY_MEDIA = new MediaInfo("No track", "No artist", new byte[0], 0L, 0L, false);
   private static final boolean MEDIA_POLLING_DISABLED = Boolean.parseBoolean(System.getProperty("rich.media.polling.disabled", "false"));
   private final AtomicBoolean polling = new AtomicBoolean(false);
   private final AtomicBoolean volumePolling = new AtomicBoolean(false);
   private final ThreadPoolExecutor executor;
   private volatile MediaInfo mediaInfo = EMPTY_MEDIA;
   private volatile long lastMediaUpdate;
   private volatile IMediaSession session;
   private volatile String sessionOwner = "";
   private volatile float appVolume = 1.0F;
   private volatile boolean appVolumeLoaded;
   private volatile boolean appVolumeUnavailable;
   private volatile long lastVolumePollAt;
   private long lastPollAt;
   private volatile double livePositionSeconds;
   private volatile long livePositionUpdatedAt;
   private float smoothDurationWidth = 1.0F;
   private String cachedTitleRaw = "";
   private String cachedArtistRaw = "";
   private String lastTrackKey = "";
   private boolean iconPulseWasPlaying;
   private long iconPulseStartedAt;
   private float smoothedIconAlpha = 100.0F;
   private volatile boolean uiPlaying;
   private volatile boolean playbackStateInitialized;
   private volatile boolean playbackOverrideActive;
   private volatile boolean disabledAfterError;
   private int runtimeErrors;

   public MusicBar() {
      super("Music Bar", 20, 20, 100, 35, true);
      ThreadFactory var1 = var0 -> {
         Thread var1x = new Thread(var0, "Releon-MediaPlayer");
         var1x.setDaemon(true);
         return var1x;
      };
      this.executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(8), var1, new DiscardPolicy());
   }

   @Override
   public boolean method307() {
      if (this.disabledAfterError) {
         return false;
      } else {
         try {
            return System.currentTimeMillis() - this.lastMediaUpdate < 2500L || Helper38.method548(mc.currentScreen);
         } catch (Throwable var2) {
            this.method3120();
            return false;
         }
      }
   }

   @Override
   public void method308() {
      if (!this.disabledAfterError && !this.method3107() && mc.player != null) {
         Hud var1 = Hud.method1824();
         if (var1 != null && var1.isState() && var1.interfaceSettings.method2588(this.getName())) {
            long var2 = System.currentTimeMillis();
            if (var2 - this.lastPollAt >= 350L) {
               this.lastPollAt = var2;
               if (this.polling.compareAndSet(false, true)) {
                  try {
                     this.executor.execute(() -> {
                        try {
                           this.method3090();
                           this.method3091();
                        } catch (Throwable var5x) {
                           this.method3120();
                        } finally {
                           this.polling.set(false);
                        }
                     });
                  } catch (Throwable var5) {
                     this.polling.set(false);
                     this.method3120();
                  }
               }
            }
         }
      }
   }

   @Override
   public void method310(DrawContext var1) {
      if (!this.disabledAfterError) {
         try {
            MatrixStack var2 = var1.getMatrices();
            float var3 = this.method981();
            float var4 = this.method982();
            this.method975(100);
            this.method976(35);
            MediaInfo var5 = this.mediaInfo != null ? this.mediaInfo : EMPTY_MEDIA;
            byte var6 = 81;
            int var7 = this.method3111(var5);
            int var8 = this.method3112(var5, var7);
            int var9 = Math.round((float)var8 / var7 * var6);
            this.smoothDurationWidth = MathHelper.clamp(this.smoothDurationWidth + (var9 - this.smoothDurationWidth) * 0.2F, 1.0F, (float)var6);
            boolean var10 = this.method3118();
            Helper12.method361(var2, var3, var4, 100.0F, 35.0F, 4.0F, 190, -15724528, Helper133.method1162());
            if (!Hud.method1824().method1838()) {
               rectangle.method677(
                  Helper80.method841(var2, var3, var4, 100.0, 35.0).method826(4.0F).method823(new Color(13, 14, 16, 224).getRGB()).method840()
               );
            }

            this.method3093(var2, var3 + 6.0F, var4 + 6.0F, var10);
            Helper175 var11 = Helper103.method927(12, Helper101.BOLD);
            Helper175 var12 = Helper103.method927(10, Helper101.DEFAULT);
            Helper175 var13 = Helper103.method927(10, Helper101.DEFAULT);
            this.method3097();
            float var14 = var3 + 1.0F + 13.0F;
            float var15 = 100.0F - (var14 - var3) - 8.0F;
            this.method3094(var2, var11, this.cachedTitleRaw, var14 - 9.5F, var4 + 5.5F, var15 + 4.0F, -1, 0.85F, 12.0F);
            this.method3094(var2, var12, this.cachedArtistRaw, var14 - 10.0F, var4 + 15.0F, var15, new Color(145, 145, 145, 255).getRGB(), 0.65F, 9.0F);
            String var16 = this.method3104(var8);
            String var17 = this.method3104(var7);
            var13.method1474(var2, var16, var14 - 10.0F, var4 + 23.0F, -1);
            var13.method1474(var2, var17, var3 + 100.0F - var13.method1479(var17) - 7.0F, var4 + 23.0F, -1);
            float var18 = var14 - 10.0F;
            float var19 = var4 + 35.0F - 7.0F;
            rectangle.method677(Helper80.method841(var2, var18, var19, var6 + 8, 2.0).method826(1.0F).method823(-14342875).method840());
            this.method3092(var2, var18, var19, this.smoothDurationWidth, 2.0F);
            float var20 = var4 + 20.0F;
            float var21 = var18 + var6 * 0.5F;
            Helper175 var22 = Helper103.method927(17, Helper101.ICONS);
            var22.method1477(var2, "O", var21 - 11.0F + 5.0F, var20, new Color(255, 255, 255, 255).getRGB());
            var22.method1477(var2, var10 ? "I" : "H", var21 + 5.0F, var20, new Color(255, 255, 255, 255).getRGB());
            var22.method1477(var2, "P", var21 + 11.0F + 5.0F, var20, new Color(255, 255, 255, 255).getRGB());
         } catch (Throwable var23) {
            this.method3120();
         }
      }
   }

   @Override
   public boolean method557(double var1, double var3, int var5) {
      if (!this.disabledAfterError && var5 == 0 && this.method307()) {
         IMediaSession var6 = this.session;
         float var7 = this.method981();
         float var8 = this.method982();
         if (var6 != null) {
            byte var9 = 81;
            float var10 = var7 + 1.0F + 5.0F;
            float var11 = var10 + var9 * 0.5F;
            float var12 = var8 + 20.0F;
            if (this.method3101(var1, var3, var11 - 11.0F, var12)) {
               this.method3099(var6::previous);
               return true;
            }

            if (this.method3101(var1, var3, var11, var12)) {
               this.method3098(var6);
               return true;
            }

            if (this.method3101(var1, var3, var11 + 11.0F, var12)) {
               this.method3099(var6::next);
               return true;
            }
         }

         return super.method557(var1, var3, var5);
      } else {
         return false;
      }
   }

   private void method3090() {
      if (!this.disabledAfterError && !this.method3107()) {
         try {
            List<dev.redstones.mediaplayerinfo.IMediaSession> var1 = MediaPlayerInfo.Instance.getMediaSessions();
            if (var1 == null || var1.isEmpty()) {
               this.session = null;
               this.sessionOwner = "";
               return;
            }

            IMediaSession var2 = var1.stream()
               .filter(var0 -> var0 != null && var0.getMedia() != null)
               .max(
                  Comparator.<IMediaSession>comparingInt(var1x -> this.method3119(var1x.getMedia()) ? 1 : 0)
                     .thenComparingInt(var1x -> this.method3108(this.method3109(var1x.getMedia())).isEmpty() ? 0 : 1)
                     .thenComparingInt(var1x -> this.method3108(this.method3110(var1x.getMedia())).isEmpty() ? 0 : 1)
                     .thenComparingLong(var1x -> this.method3111(var1x.getMedia()))
               )
               .orElse(null);
            this.session = var2;
            if (var2 == null) {
               this.sessionOwner = "";
               return;
            }

            String var3 = this.method3108(var2.getOwner());
            if (!var3.equalsIgnoreCase(this.sessionOwner)) {
               this.sessionOwner = var3;
               this.appVolumeLoaded = false;
               this.appVolumeUnavailable = false;
               this.lastVolumePollAt = 0L;
            }

            MediaInfo var4 = var2.getMedia();
            String var5 = this.method3109(var4);
            String var6 = this.method3110(var4);
            if (var5.isEmpty() && var6.isEmpty()) {
               return;
            }

            String var7 = this.method3109(var4) + "\n" + this.method3110(var4);
            if (!var7.equals(this.lastTrackKey)) {
               this.livePositionSeconds = this.method3116(var4, this.method3111(var4));
               this.livePositionUpdatedAt = System.currentTimeMillis();
               this.smoothDurationWidth = 1.0F;
               this.lastTrackKey = var7;
            }

            this.method3117(var4);
            this.mediaInfo = var4;
            this.lastMediaUpdate = System.currentTimeMillis();
            this.method3114(var4);
         } catch (Throwable var8) {
            this.session = null;
            this.sessionOwner = "";
            this.mediaInfo = EMPTY_MEDIA;
            this.method3120();
         }
      }
   }

   private void method3091() {
      String var1 = this.sessionOwner;
      if (!this.disabledAfterError && !this.appVolumeUnavailable && Helper67.method745() && !var1.isBlank()) {
         long var2 = System.currentTimeMillis();
         if (!this.appVolumeLoaded || var2 - this.lastVolumePollAt >= 2000L) {
            if (this.volumePolling.compareAndSet(false, true)) {
               try {
                  Float var4 = Helper67.method746(var1);
                  if (var4 != null) {
                     this.appVolume = MathHelper.clamp(var4, 0.0F, 1.0F);
                     this.appVolumeLoaded = true;
                     this.lastVolumePollAt = var2;
                     return;
                  }

                  this.appVolumeUnavailable = true;
               } finally {
                  this.volumePolling.set(false);
               }
            }
         }
      }
   }

   private void method3092(MatrixStack var1, float var2, float var3, float var4, float var5) {
      if (!(var4 <= 0.0F)) {
         int var6 = Helper133.method1162();
         rectangle.method677(Helper80.method841(var1, var2, var3, var4, var5).method826(1.0F).method823(var6).method840());
      }
   }

   private void method3093(MatrixStack var1, float var2, float var3, boolean var4) {
   }

   private void method3094(MatrixStack var1, Helper175 var2, String var3, float var4, float var5, float var6, int var7, float var8, float var9) {
      if (var3 != null && !var3.isEmpty()) {
         Helper140 var10 = Releon.method71().method30();
         float var11 = var2.method1479(var3);
         float var12 = this.method3095(var11, var6, var8);
         var10.method1209(var1.peek().getPositionMatrix(), var4, var5 - 4.0F, var6, var9 + 7.0F);
         var2.method1474(var1, var3, var4 - var12, var5, var7);
         var10.method1210();
      }
   }

   private float method3095(float var1, float var2, float var3) {
      float var4 = var1 - var2;
      if (var4 <= 1.0F) {
         return 0.0F;
      } else {
         double var5 = 0.9;
         double var7 = Math.max(1.4, var4 / 22.0);
         double var9 = var5 + var7 + var5 + var7;
         double var11 = System.currentTimeMillis() / 1000.0 * var3 % var9;
         if (var11 < var5) {
            return 0.0F;
         } else {
            var11 -= var5;
            if (var11 < var7) {
               return (float)(var4 * this.method3096(var11 / var7));
            } else {
               var11 -= var7;
               if (var11 < var5) {
                  return var4;
               } else {
                  var11 -= var5;
                  return (float)(var4 * (1.0 - this.method3096(var11 / var7)));
               }
            }
         }
      }
   }

   private double method3096(double var1) {
      double var3 = MathHelper.clamp(var1, 0.0, 1.0);
      return var3 * var3 * (3.0 - 2.0 * var3);
   }

   private void method3097() {
      MediaInfo var1 = this.mediaInfo != null ? this.mediaInfo : EMPTY_MEDIA;
      String var2 = this.method3109(var1);
      String var3 = this.method3110(var1);
      if (!var2.equals(this.cachedTitleRaw) || !var3.equals(this.cachedArtistRaw)) {
         this.cachedTitleRaw = var2;
         this.cachedArtistRaw = var3;
      }
   }

   private void method3098(IMediaSession var1) {
      MediaInfo var2 = this.mediaInfo != null ? this.mediaInfo : EMPTY_MEDIA;
      int var3 = this.method3111(var2);
      long var4 = System.currentTimeMillis();
      boolean var6 = !this.method3118();
      this.livePositionSeconds = this.method3113(var3);
      this.livePositionUpdatedAt = var4;
      this.uiPlaying = var6;
      this.playbackStateInitialized = true;
      this.playbackOverrideActive = true;
      this.method3100(var6 ? var1::play : var1::pause, false);
   }

   private void method3099(Helper310 var1) {
      this.playbackOverrideActive = false;
      this.method3100(var1, true);
   }

   private void method3100(Helper310 var1, boolean var2) {
      try {
         this.executor.execute(() -> {
            try {
               var1.run();
               if (var2) {
                  this.lastTrackKey = "";
                  this.smoothDurationWidth = 1.0F;
               }

               Thread.sleep(150L);
               this.method3090();
            } catch (Throwable var4x) {
               this.method3120();
            }
         });
      } catch (Throwable var4) {
         this.method3120();
      }
   }

   private boolean method3101(double var1, double var3, float var5, float var6) {
      return var1 >= var5 - 5.0F && var1 <= var5 + 5.0F && var3 >= var6 - 5.0F && var3 <= var6 + 5.0F;
   }

   private boolean method3102(double var1, double var3, float var5, float var6, float var7, float var8) {
      return var1 >= var5 && var1 <= var5 + var7 && var3 >= var6 && var3 <= var6 + var8;
   }

   private void method3103(double var1, float var3) {
      String var4 = this.sessionOwner;
      if (!var4.isBlank()) {
         float var5 = (float)((var1 - (var3 + 4.5F)) / 25.0);
         float var6 = MathHelper.clamp(1.0F - var5, 0.0F, 1.0F);
         this.appVolume = var6;
         this.appVolumeLoaded = true;
         this.appVolumeUnavailable = false;
         this.lastVolumePollAt = System.currentTimeMillis();

         try {
            this.executor.execute(() -> {
               try {
                  boolean var3x = Helper67.method747(var4, var6);
                  if (!var3x) {
                     this.appVolumeUnavailable = true;
                     return;
                  }

                  Float var4x = Helper67.method746(var4);
                  if (var4x != null) {
                     this.appVolume = MathHelper.clamp(var4x, 0.0F, 1.0F);
                     this.lastVolumePollAt = System.currentTimeMillis();
                  }
               } catch (Throwable var5x) {
                  this.appVolumeUnavailable = true;
               }
            });
         } catch (Throwable var8) {
            this.appVolumeUnavailable = true;
         }
      }
   }

   private String method3104(int var1) {
      int var2 = Math.max(0, var1) / 60;
      int var3 = Math.max(0, var1) % 60;
      return String.format("%02d:%02d", var2, var3);
   }

   private int method3105(int var1, int var2) {
      int var3 = var1 & 16777215;
      int var4 = MathHelper.clamp(var2, 0, 255);
      return var4 << 24 | var3;
   }

   private int method3106(boolean var1) {
      long var2 = System.currentTimeMillis();
      if (var1 != this.iconPulseWasPlaying) {
         this.iconPulseWasPlaying = var1;
         this.iconPulseStartedAt = var2;
      }

      float var4;
      if (!var1) {
         var4 = 100.0F;
      } else {
         long var5 = Math.max(0L, var2 - this.iconPulseStartedAt);
         double var7 = var5 % 1800L / 1800.0 * (Math.PI * 2);
         double var9 = Math.sin(var7 - (Math.PI / 2));
         float var11 = 150.0F;
         float var12 = 50.0F;
         var4 = var11 + (float)(var12 * var9);
      }

      this.smoothedIconAlpha = this.smoothedIconAlpha + (var4 - this.smoothedIconAlpha) * 0.14F;
      if (Math.abs(var4 - this.smoothedIconAlpha) < 0.5F) {
         this.smoothedIconAlpha = var4;
      }

      return MathHelper.clamp(Math.round(this.smoothedIconAlpha), 0, 255);
   }

   private boolean method3107() {
      return MEDIA_POLLING_DISABLED || this.disabledAfterError;
   }

   private String method3108(String var1) {
      return var1 == null ? "" : var1;
   }

   private String method3109(MediaInfo var1) {
      try {
         return this.method3108(var1 == null ? null : var1.getTitle());
      } catch (Throwable var3) {
         return "";
      }
   }

   private String method3110(MediaInfo var1) {
      try {
         return this.method3108(var1 == null ? null : var1.getArtist());
      } catch (Throwable var3) {
         return "";
      }
   }

   private int method3111(MediaInfo var1) {
      try {
         double var2 = var1 == null ? 0.0 : var1.getDuration();
         double var4 = var1 == null ? 0.0 : var1.getPosition();
         return Math.max(1, (int)Math.round(this.method3115(var2, var4)));
      } catch (Throwable var6) {
         return 1;
      }
   }

   private int method3112(MediaInfo var1, int var2) {
      try {
         return MathHelper.clamp((int)Math.floor(this.method3113(var2)), 0, Math.max(1, var2));
      } catch (Throwable var4) {
         return 0;
      }
   }

   private double method3113(int var1) {
      double var2 = this.livePositionSeconds;
      if (this.method3118()) {
         var2 += Math.max(0L, System.currentTimeMillis() - this.livePositionUpdatedAt) / 1000.0;
      }

      return MathHelper.clamp(var2, 0.0, Math.max(1.0, (double)var1));
   }

   private void method3114(MediaInfo var1) {
      int var2 = this.method3111(var1);
      double var3 = this.method3116(var1, var2);
      long var5 = System.currentTimeMillis();
      if (!this.method3118()) {
         this.livePositionUpdatedAt = var5;
      } else {
         double var7 = this.livePositionSeconds + Math.max(0L, var5 - this.livePositionUpdatedAt) / 1000.0;
         if (this.livePositionUpdatedAt == 0L || Math.abs(var3 - var7) > 2.0) {
            this.livePositionSeconds = var3;
            this.livePositionUpdatedAt = var5;
         }
      }
   }

   private double method3115(double var1, double var3) {
      return var1 > 1000.0 ? var1 / 1000.0 : var1;
   }

   private double method3116(MediaInfo var1, int var2) {
      if (var1 == null) {
         return 0.0;
      } else {
         double var3 = var1.getPosition();
         double var5 = var1.getDuration();
         if (var5 > 1000.0) {
            var3 /= 1000.0;
         } else if (var3 > var5 && var3 / 1000.0 <= var2) {
            var3 /= 1000.0;
         }

         return MathHelper.clamp(var3, 0.0, Math.max(1.0, (double)var2));
      }
   }

   private void method3117(MediaInfo var1) {
      boolean var2 = this.method3119(var1);
      if (!this.playbackStateInitialized) {
         this.uiPlaying = var2;
         this.playbackStateInitialized = true;
      } else {
         if (this.playbackOverrideActive) {
            if (var2 != this.uiPlaying) {
               return;
            }

            this.playbackOverrideActive = false;
         }

         if (this.uiPlaying != var2) {
            long var3 = System.currentTimeMillis();
            if (this.uiPlaying) {
               this.livePositionSeconds = this.method3113(this.method3111(var1));
            } else {
               this.livePositionSeconds = this.method3116(var1, this.method3111(var1));
            }

            this.livePositionUpdatedAt = var3;
            this.uiPlaying = var2;
         }
      }
   }

   private boolean method3118() {
      return this.playbackStateInitialized ? this.uiPlaying : this.method3119(this.mediaInfo);
   }

   private boolean method3119(MediaInfo var1) {
      try {
         return var1 != null && var1.getPlaying();
      } catch (Throwable var3) {
         return false;
      }
   }

   private void method3120() {
      this.runtimeErrors++;
      this.session = null;
      this.mediaInfo = EMPTY_MEDIA;
      if (this.runtimeErrors >= 3) {
         this.disabledAfterError = true;
      }
   }
}
