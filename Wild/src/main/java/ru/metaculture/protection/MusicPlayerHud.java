package ru.metaculture.protection;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

@O0000000OOO0(
   O00000000 = "MusicPlayer",
   O000000000 = "w"
)
public final class MusicPlayerHud extends HudElement {
   private static final MusicPlayerHud O00000000 = new MusicPlayerHud();
   private static final String O000000000OO0 = "Ожидание...";
   private static final String O000000000OO00 = "Нет данных";
   private static final long O000000000OO0O = 160L;
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static final ExecutorService O000000000OOO0 = Executors.newSingleThreadExecutor(runnable -> {
      Thread var1 = new Thread(runnable, "Wild-Media-Fetch");
      var1.setDaemon(true);
      return var1;
   });
   private volatile String O000000000OOOO = "Ожидание...";
   private volatile String O00000000O = "Нет данных";
   private volatile boolean O00000000O0 = false;
   private volatile double O00000000O00 = 0.0;
   private volatile long O00000000O000 = 0L;
   private volatile long O00000000O0000 = 0L;
   private volatile long O00000000O000O = 0L;
   private volatile long O00000000O00O = 10000000L;
   private volatile long O00000000O00O0 = 0L;
   private volatile boolean O00000000O00OO = false;
   private volatile double O00000000O0O = 0.0;
   private final O0000O00O0OO O00000000O0O0 = new O0000O00O0OO();
   private volatile float O00000000O0O00 = 0.0F;
   private volatile float O00000000O0O0O = 0.0F;
   private volatile float O00000000O0OO = 0.0F;
   private volatile float O00000000O0OO0 = 0.0F;
   private volatile byte[] O00000000O0OOO = null;
   private volatile int O00000000OO = 0;
   private volatile boolean O00000000OO0 = false;
   private int O00000000OO00 = Integer.MIN_VALUE;
   private int O00000000OO000 = -1;
   private Identifier O00000000OO00O = null;
   private volatile int O00000000OO0O = 0;
   private volatile int O00000000OO0O0 = 0;
   private MediaPlayerInfo O00000000OO0OO;
   private long O00000000OOO = 0L;
   private static boolean O00000000OOO0 = false;
   private final AtomicBoolean O00000000OOO00 = new AtomicBoolean(false);
   private final AtomicReference<MusicPlayerHud.W151> O00000000OOO0O = new AtomicReference<>();
   private final O0000O00O0OO O00000000OOOO = new O0000O00O0OO();

   private MusicPlayerHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static MusicPlayerHud O000000000() {
      return O00000000;
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   public static void O0000000000OO0() {
      O000000000OOO0.shutdownNow();
      O00000000.O00000000OOO0O.set(null);
      O00000000.O00000000OOO00.set(false);
   }

   public void O000000000(RenderManager o0000O00OO0O0) {
      if (MinecraftAccessor.a_.player != null) {
         O000000000OOO.O00000000();
         O000000000OOO.O00000000(1.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var2 = O000000000OOO.O000000000000();
         if (!(var2 <= 0.01F)) {
            float var3 = O00000OO000O.O00000000().O000000000000O();
            float var4 = O00000OO000O.O00000000().O00000000000O();
            boolean var5 = O00000OO000O.O00000000().O00000000000OO();
            boolean var6 = O00000OO000O.O00000000().O00000000000O0();
            if (var5
               && this.O00000000O0OO > 0.0F
               && this.O00000000(var3, var4, this.O00000000O0O00 - 4.0F, this.O00000000O0O0O, this.O00000000O0OO + 8.0F, this.O00000000O0OO0)) {
               this.O00000000O00OO = true;
            }

            if (this.O00000000O00OO) {
               O00000OO000O.O00000000().O000000000();
            }

            this.O0000000000OOO();
            this.O000000000O0();
            this.O000000000O00();
            float var7 = 7.0F;
            float var8 = 5.0F;
            float var9 = 160.0F;
            float var10 = 26.0F;
            float var11 = 24.0F;
            float var12 = var9 + var7 * 2.0F;
            float var13 = var7 + var9 + var8 + var10 + var8 + var11 + var7;
            O00000OO000O.W219 var14 = O00000OO000O.O00000000().O00000000("HUD_MusicPlayer", 10.0F, 10.0F, var12, var13);
            float var15 = var14.O000000000;
            float var16 = var14.O0000000000;
            float var17 = var14.O00000000000;
            float var18 = var14.O000000000000;
            float var19 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            float var20 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
            if (var17 > 1.0F && var18 > 1.0F) {
               var15 = Math.max(2.0F, Math.min(var15, var19 - var17 - 2.0F));
               var16 = Math.max(2.0F, Math.min(var16, var20 - var18 - 2.0F));
            }

            this.O00000000(var15, var16, var17, var18);
            float var21 = var17 / Math.max(1.0F, var12);
            float var22 = var18 / Math.max(1.0F, var13);
            float var23 = Math.min(var21, var22);
            float var24 = var7 * var21;
            float var25 = var7 * var22;
            float var26 = var8 * var22;
            float var27 = var9 * var21;
            float var28 = var9 * var22;
            float var29 = var10 * var22;
            float var30 = var11 * var22;
            float var31 = var2 * this.O000000000O0.O0000000000();
            float var32 = this.O00000000000OO(var31);
            int var33 = (int)(255.0F * var31);
            int var34 = this.O00000000(var31);
            int var35 = this.O000000000(var31);
            int var36 = this.O0000000000(var31);
            int var37 = this.O00000000000(var31);
            int var38 = this.O000000000000(var31);
            int var39 = this.O0000000000000(var31);
            int var40 = this.O000000000000O(var31);
            int var41 = this.O000000000O000.O0000000000().equals("Светлый") ? var40 : O0000O000OO000.O0000000000(255, 255, 255, var33);
            boolean var42 = this.O0000000000O();
            float var43 = 14.0F;
            this.O00000000(o0000O00OO0O0, var15, var16, var17, var18, var43, var31);
            float var44 = var15 + var24;
            float var45 = var16 + var25;
            if (var42) {
               this.O000000000(o0000O00OO0O0, var44, var45, var27, var28, 11.0F, var31);
            }

            o0000O00OO0O0.O00000000(var44, var45, var27, var28, 11.0F, 11.0F, 4.0F, 4.0F);
            if (this.O00000000OO00O != null) {
               int var46 = O00000000(this.O00000000OO00O);
               if (var46 > 0) {
                  float var47 = 0.0F;
                  float var48 = 0.0F;
                  float var49 = 1.0F;
                  float var50 = 1.0F;
                  if (this.O00000000OO0O > 0 && this.O00000000OO0O0 > 0) {
                     if (this.O00000000OO0O > this.O00000000OO0O0) {
                        float var51 = (float)this.O00000000OO0O0 / this.O00000000OO0O;
                        float var52 = (1.0F - var51) / 2.0F;
                        var47 = var52;
                        var49 = 1.0F - var52;
                     } else if (this.O00000000OO0O0 > this.O00000000OO0O) {
                        float var83 = (float)this.O00000000OO0O / this.O00000000OO0O0;
                        float var85 = (1.0F - var83) / 2.0F;
                        var48 = var85;
                        var50 = 1.0F - var85;
                     }
                  }

                  o0000O00OO0O0.O00000000(var46, var44, var45, var27, var28, var47, var48, var49, var50);
               } else if (!var42) {
                  o0000O00OO0O0.O00000000(var44, var45, var27, var28, 0.0F, var35);
               }
            } else if (!var42) {
               o0000O00OO0O0.O00000000(var44, var45, var27, var28, 0.0F, var35);
            }

            float var78 = 90.0F * var22;
            float var79 = var45 + var28 - var78;
            o0000O00OO0O0.O000000000(
               var44,
               var79,
               var27,
               var78,
               11.0F,
               11.0F,
               4.0F,
               4.0F,
               O0000O000OO000.O0000000000(0, 0, 0, 0),
               O0000O000OO000.O0000000000(0, 0, 0, (int)(220.0F * var32))
            );
            float var80 = 26.0F * var23;
            float var81 = 22.0F * var23;
            float var82 = var45 + var28 - 32.0F * var22;
            float var84 = var27 - 16.0F * var21;
            this.O00000000(
               o0000O00OO0O0,
               FontRegistry.O00000000000,
               this.O000000000OOOO,
               var44 + 10.0F * var21,
               var82,
               var80,
               var38,
               var79,
               var78,
               var84,
               var44 + var27 / 2.0F
            );
            this.O00000000(
               o0000O00OO0O0,
               FontRegistry.O00000000,
               this.O00000000O,
               var44 + 10.0F * var21,
               var82 + 15.0F * var22,
               var81,
               var39,
               var79,
               var78,
               var84,
               var44 + var27 / 2.0F
            );
            o0000O00OO0O0.O0000000000000();
            float var86 = var45 + var28 + var26;
            if (var42) {
               this.O000000000(o0000O00OO0O0, var44, var86, var27, var29, 7.0F, var31);
            } else {
               o0000O00OO0O0.O00000000(var44, var86, var27, var29, 4.0F, 4.0F, 4.0F, 4.0F, var36);
               if (this.O000000000000()) {
                  o0000O00OO0O0.O00000000(var44, var86, var27, var29, 4.0F, var37, 1.0F);
               }
            }

            float var53 = 20.0F * var23;
            float var54 = var44 + var27 / 2.0F;
            float var55 = var86 + var29 / 2.0F + 4.0F * var22;
            String var56 = this.O00000000O0 ? "x" : "p";
            String var57 = "z";
            String var58 = "c";
            float var59 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, var56, var53).O00000000;
            float var60 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, var57, var53).O00000000;
            float var61 = TextMeasureCache.O00000000(FontRegistry.O00000000000O, var58, var53).O00000000;
            float var62 = 22.0F * var21;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var54 - var62 - var60 / 2.0F, var55, var53, var57, var41);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var54 - var59 / 2.0F, var55, var53, var56, var41);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var54 + var62 - var61 / 2.0F, var55, var53, var58, var41);
            if (var5 && !this.O00000000O00OO) {
               float var63 = 24.0F * var21;
               if (this.O00000000(var3, var4, var54 - var62 - var63 / 2.0F, var86, var63, var29)) {
                  if (O0000O000OOO0.O00000000000()) {
                     O0000O000OOO0.O0000000000();
                  }
               } else if (this.O00000000(var3, var4, var54 - var63 / 2.0F, var86, var63, var29)) {
                  if (O0000O000OOO0.O00000000000()) {
                     O0000O000OOO0.O00000000();
                  }
               } else if (this.O00000000(var3, var4, var54 + var62 - var63 / 2.0F, var86, var63, var29) && O0000O000OOO0.O00000000000()) {
                  O0000O000OOO0.O000000000();
               }
            }

            float var87 = var86 + var29 + var26;
            if (var42) {
               this.O000000000(o0000O00OO0O0, var44, var87, var27, var30, 8.0F, var31);
            } else {
               o0000O00OO0O0.O00000000(var44, var87, var27, var30, 4.0F, 4.0F, 11.0F, 11.0F, var36);
            }

            float var64 = 20.0F * var23;
            String var65 = this.O00000000(this.O00000000O0000);
            float var66 = TextMeasureCache.O00000000(FontRegistry.O00000000, var65, var64).O00000000;
            float var67 = 10.0F * var21;
            float var68 = 8.0F * var21;
            float var69 = var44 + var67 + var66 + var68;
            float var70 = var27 - var67 * 2.0F - var66 * 2.0F - var68 * 2.0F;
            this.O00000000O0O00 = var69;
            this.O00000000O0O0O = var87;
            this.O00000000O0OO = var70;
            this.O00000000O0OO0 = var30;
            long var71 = this.O00000000O000;
            boolean var73 = this.O00000000(var3, var4, var69 - 4.0F * var21, var87, var70 + 8.0F * var21, var30);
            if (this.O00000000O00OO) {
               this.O00000000O0O = Math.max(0.0, Math.min(1.0, (double)((var3 - var69) / Math.max(1.0F, var70))));
               var71 = (long)(this.O00000000O0O * this.O00000000O0000);
               if (!var6) {
                  this.O00000000O00OO = false;
                  if (this.O00000000O0000 > 0L && O0000O000OOO0.O00000000000()) {
                     long var74 = (long)((double)var71 / this.O00000000O00O * 1000.0);
                     O0000O000OOO0.O00000000(var74);
                     this.O00000000O000 = var71;
                     this.O00000000O00O0 = System.currentTimeMillis();
                     this.O00000000O000O = System.currentTimeMillis();
                  }
               }
            } else if (this.O00000000O0 && this.O00000000O0000 > 0L) {
               long var88 = System.currentTimeMillis() - this.O00000000O000O;
               long var76 = (long)(var88 * (this.O00000000O00O / 1000.0));
               var71 += Math.max(0L, var76);
               if (var71 > this.O00000000O0000) {
                  var71 = this.O00000000O0000;
               }
            }

            this.O00000000O00 = this.O00000000O0000 > 0L ? (double)var71 / this.O00000000O0000 : 0.0;
            String var89 = this.O00000000(var71);
            float var75 = var87 + var30 / 2.0F + 3.0F * var22;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var44 + var67, var75, var64, var89, var39);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var44 + var27 - var67 - var66, var75, var64, var65, var39);
            this.O00000000O0O0.O00000000();
            this.O00000000O0O0.O00000000(!var73 && !this.O00000000O00OO ? 0.0 : 1.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
            float var90 = 4.0F * var22 + 4.0F * var22 * this.O00000000O0O0.O000000000000();
            float var77 = var87 + (var30 - var90) / 2.0F;
            this.O00000000OOOO.O00000000();
            this.O00000000OOOO.O00000000((float)this.O00000000O00, this.O00000000O00OO ? 0.05F : 0.2F, O0000O00O0OO0O.O0000000000000, false);
            if (var42) {
               this.O000000000(o0000O00OO0O0, var69, var77, var70, var90, var90 / 2.0F, var31);
            } else {
               o0000O00OO0O0.O00000000(var69, var77, var70, var90, var90 / 2.0F, O0000O000OO000.O0000000000(100, 100, 100, (int)(80.0F * var32)));
            }

            o0000O00OO0O0.O00000000(var69, var77, var70 * this.O00000000OOOO.O000000000000(), var90, var90 / 2.0F, var40);
            O00000OO000O.O00000000().O00000000(var14);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var15,
               var16,
               var17,
               var18,
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight(),
               var14.O000000000000O,
               O00000OO000O.O00000000().O000000000000O(),
               O00000OO000O.O00000000().O00000000000O(),
               O00000OO000O.O00000000().O00000000000OO(),
               O00000OO000O.O00000000().O00000000000O0()
            );
         }
      }
   }

   private boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private String O00000000(long l) {
      if (l <= 0L) {
         return "0:00";
      } else {
         long var3 = l / this.O00000000O00O;
         long var5 = var3 % 60L;
         return var3 / 60L + (var5 < 10L ? ":0" : ":") + var5;
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, String string, float f, float g, float h, int i, float j, float k, float l, float m
   ) {
      float var12 = TextMeasureCache.O00000000(o0000O0O00O00O, string, h).O00000000;
      if (var12 <= l) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, m - var12 / 2.0F, g, h, string, i);
      } else {
         float var13 = var12 - l;
         long var14 = 8000L;
         float var16 = (float)(System.currentTimeMillis() % var14) / (float)var14;
         float var17 = var16 < 0.2F
            ? 0.0F
            : (
               var16 < 0.45F
                  ? this.O0000000000O0((var16 - 0.2F) / 0.3F)
                  : (var16 < 0.7F ? 1.0F : (var16 < 0.95F ? 1.0F - this.O0000000000O0((var16 - 0.7F) / 0.25F) : 0.0F))
            );
         o0000O00OO0O0.O00000000(f, j, l, k, 0.0F, 0.0F, 0.0F, 0.0F);
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f - var13 * var17, g, h, string, i);
         o0000O00OO0O0.O0000000000000();
      }
   }

   private float O0000000000O0(float f) {
      float var2 = 2.0F;
      float var3 = var2 + 1.0F;
      float var4 = f - 1.0F;
      return 1.0F + var3 * var4 * var4 * var4 + var2 * var4 * var4;
   }

   private void O0000000000OOO() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.O00000000OOO >= 160L) {
         this.O00000000OOO = var1;
         if (this.O00000000OOO00.compareAndSet(false, true)) {
            O000000000OOO0.execute(() -> {
               boolean var5 = false /* VF: Semaphore variable */;

               label49: {
                  try {
                     var5 = true;
                     this.O00000000(this.O000000000O());
                     var5 = false;
                     break label49;
                  } catch (Throwable var6) {
                     if (!O00000000OOO0) {
                        O00000000OOO0 = true;
                     }

                     this.O00000000(MusicPlayerHud.W151.empty());
                     var5 = false;
                  } finally {
                     if (var5) {
                        this.O00000000OOO00.set(false);
                     }
                  }

                  this.O00000000OOO00.set(false);
                  return;
               }

               this.O00000000OOO00.set(false);
            });
         }
      }
   }

   private MusicPlayerHud.W151 O000000000O() {
      if (this.O00000000OO0OO == null) {
         this.O00000000OO0OO = MediaPlayerInfo.INSTANCE;
      }

      List var1 = this.O00000000OO0OO.getMediaSessions();
      if (var1 != null && !var1.isEmpty()) {
         MediaInfo var2 = null;

         for (IMediaSession var4 : (List<IMediaSession>)var1) {
            if (var4 != null) {
               MediaInfo var5 = var4.getMedia();
               if (var5 != null && this.O00000000(var5)) {
                  if (var2 == null) {
                     var2 = var5;
                  }

                  if (var5.isPlaying()) {
                     var2 = var5;
                     break;
                  }
               }
            }
         }

         return var2 == null ? MusicPlayerHud.W151.empty() : MusicPlayerHud.W151.from(var2);
      } else {
         return MusicPlayerHud.W151.empty();
      }
   }

   private void O00000000(MusicPlayerHud.W151 o00000000) {
      this.O00000000OOO0O.set(o00000000);
      if (MinecraftAccessor.a_ != null) {
         MinecraftAccessor.a_.execute(this::O000000000O0);
      }
   }

   private void O000000000O0() {
      MusicPlayerHud.W151 var1 = this.O00000000OOO0O.getAndSet(null);
      if (var1 != null) {
         if (!var1.available()) {
            this.O000000000O000();
         } else {
            this.O000000000OOOO = var1.title();
            this.O00000000O = var1.artist();
            this.O00000000O0 = var1.playing();
            if (!this.O00000000O00OO && System.currentTimeMillis() - this.O00000000O00O0 > 2000L) {
               this.O00000000O000 = var1.position();
            }

            this.O00000000O0000 = var1.duration();
            this.O00000000O000O = System.currentTimeMillis();
            if (this.O00000000O0000 > 360000000L) {
               this.O00000000O00O = 10000000L;
            } else if (this.O00000000O0000 > 100000L) {
               this.O00000000O00O = 1000L;
            } else {
               this.O00000000O00O = 1L;
            }

            this.O00000000(var1.thumbnail());
         }
      }
   }

   private void O00000000(byte[] bs) {
      if (bs != null && bs.length > 0) {
         int var2 = Arrays.hashCode(bs);
         if (var2 != this.O00000000OO || this.O00000000O0OOO == null || this.O00000000O0OOO.length != bs.length) {
            this.O00000000O0OOO = Arrays.copyOf(bs, bs.length);
            this.O00000000OO = var2;
            this.O00000000OO0 = true;
         }
      } else if (this.O00000000O0OOO != null || this.O00000000OO != 0) {
         this.O00000000O0OOO = null;
         this.O00000000OO = 0;
         this.O00000000OO0 = true;
      }
   }

   private void O000000000O00() {
      byte[] var1 = this.O00000000O0OOO;
      int var2 = this.O00000000OO;
      boolean var3 = this.O00000000OO0;
      if (var1 == null) {
         if (var3) {
            this.O00000000OO0 = false;
            this.O00000000OO00 = Integer.MIN_VALUE;
            this.O00000000OO000 = -1;
            this.O00000000OO0O = 0;
            this.O00000000OO0O0 = 0;
            if (this.O00000000OO00O != null) {
               MinecraftAccessor.a_.getTextureManager().destroyTexture(this.O00000000OO00O);
               this.O00000000OO00O = null;
            }
         }
      } else if (var3 || var2 != this.O00000000OO00 || var1.length != this.O00000000OO000) {
         try {
            this.O00000000OO0 = false;
            this.O00000000OO00 = var2;
            this.O00000000OO000 = var1.length;
            NativeImage var4 = NativeImage.read(new ByteArrayInputStream(var1));
            this.O00000000OO0O = var4.getWidth();
            this.O00000000OO0O0 = var4.getHeight();
            if (this.O00000000OO00O != null) {
               MinecraftAccessor.a_.getTextureManager().destroyTexture(this.O00000000OO00O);
            }

            NativeImageBackedTexture var5 = new NativeImageBackedTexture(() -> "media_cover", var4);
            this.O00000000OO00O = Identifier.of("wild", "media_cover_" + System.nanoTime());
            MinecraftAccessor.a_.getTextureManager().registerTexture(this.O00000000OO00O, var5);
         } catch (Exception var6) {
         }
      }
   }

   private void O000000000O000() {
      this.O000000000OOOO = "Ожидание...";
      this.O00000000O = "Нет данных";
      this.O00000000O0 = false;
      this.O00000000O00 = 0.0;
      this.O00000000O000 = 0L;
      this.O00000000O0000 = 0L;
      this.O00000000O000O = System.currentTimeMillis();
      if (this.O00000000O0OOO != null || this.O00000000OO != 0) {
         this.O00000000O0OOO = null;
         this.O00000000OO = 0;
         this.O00000000OO0 = true;
      }
   }

   private boolean O00000000(MediaInfo mediaInfo) {
      if (mediaInfo == null) {
         return false;
      } else {
         String var2 = mediaInfo.getTitle();
         String var3 = mediaInfo.getArtist();
         return var2 != null && !var2.isBlank()
            || var3 != null && !var3.isBlank()
            || mediaInfo.getDuration() > 0L
            || mediaInfo.getPosition() > 0L
            || mediaInfo.isPlaying();
      }
   }

   private static int O00000000(Identifier identifier) {
      if (MinecraftAccessor.a_ == null) {
         return -1;
      } else {
         AbstractTexture var1 = MinecraftAccessor.a_.getTextureManager().getTexture(identifier);
         return var1 != null && var1.getGlTexture() instanceof GlTexture var2 ? var2.getGlId() : -1;
      }
   }

   record W151(boolean available, String title, String artist, long position, long duration, boolean playing, byte[] thumbnail) {
      W151(boolean available, String title, String artist, long position, long duration, boolean playing, byte[] thumbnail) {
         title = title != null && !title.isBlank() ? title : "Ожидание...";
         artist = artist != null && !artist.isBlank() ? artist : "Нет данных";
         position = Math.max(0L, position);
         duration = Math.max(0L, duration);
         thumbnail = thumbnail != null && thumbnail.length != 0 ? Arrays.copyOf(thumbnail, thumbnail.length) : null;
         this.available = available;
         this.title = title;
         this.artist = artist;
         this.position = position;
         this.duration = duration;
         this.playing = playing;
         this.thumbnail = thumbnail;
      }

      static MusicPlayerHud.W151 empty() {
         return new MusicPlayerHud.W151(false, "Ожидание...", "Нет данных", 0L, 0L, false, null);
      }

      static MusicPlayerHud.W151 from(MediaInfo mediaInfo) {
         return new MusicPlayerHud.W151(
            true,
            mediaInfo.getTitle(),
            mediaInfo.getArtist(),
            mediaInfo.getPosition(),
            mediaInfo.getDuration(),
            mediaInfo.isPlaying(),
            mediaInfo.getArtworkPng()
         );
      }

      public byte[] thumbnail() {
         return this.thumbnail == null ? null : Arrays.copyOf(this.thumbnail, this.thumbnail.length);
      }
   }
}
