// Module: RotationRecorder
// Category: combat
// Original class: Rotationrecorder
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(
   name = "RotationRecorder",
   category = Category.COMBAT,
   description = "Records rotation data for ML training"
)
public final class Rotationrecorder extends Module {
   public static final Rotationrecorder llI11I1ll11IlI = new Rotationrecorder();
   private static final int III11IllIIIIlII1Il1IIlI = 37;
   private static final int I11Ill1I1I1llll11Il1I1I = 2;
   private static final long III1lI11Ill111lIl1l1IIlI = 128L;
   private static final float lII1llI111II1lllI = 50.0F;
   private static final float lI1lIIIl1IlIl1I = 176.0F;
   private static final float llI1lII1lllI1l = 8.0F;
   private static final float lll11l11111l1l1 = 8.0F;
   private static final float I1I11l1l11 = 20.0F;
   private static final float IIlIIIl1lI1l = 0.18F;
   private static final float lI11lI1lI1I11IllI1 = 0.055F;
   private static final float lI111I1l1ll11Ill111IIIIl = 0.08F;
   private static final float IlllIII11II11Il11 = 0.14F;
   private static final Path lIl1I1I111llll11 = Path.of("rotation_recordings", "rotation_dataset_v2.csv");
   private BufferedWriter I1llI111I1IlIIlIlIII1lI1;
   private boolean Ill1I1IIl1l1lIIIlll11I1I1lll1 = false;
   private long lIl1IlI111 = 0L;
   private int ll1IlIl1IIIIl11l = 0;
   private LivingEntity I1I1l1llIl1lI = null;
   private boolean lIlll111lIlll1l1l111lI1lI1 = false;
   private float IIIlllllI1II1IIIll11I1 = 0.0F;
   private float IIl11Il1II = 0.0F;
   private float I1IIlI1l11IllIl = 0.0F;
   private float IIIIIlllIIlI1llIIIl11 = 0.0F;
   private float llI11lIl1lIII11 = 0.0F;
   private float l1I1ll1llIIIIllIIllIl1I = 0.0F;
   private boolean l111l1lI1ll = false;
   private float lI11IIIl111lI1IIII1lIIII = 0.0F;
   private float III11I1lI1I = 0.0F;
   private float IIll1I111 = 0.0F;
   private float llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
   private float ll1lIIIIIl1 = 0.0F;
   private float I1II1III1lII11lII = 0.0F;
   private float[] llIIlI111lII = null;
   private Rotationrecorder$II1Il11l111II11IIl I1lIIl1lI1IlI11I1llIll11 = null;

   private Rotationrecorder() {
   }

   @Override
   public void onEnable() {
      this.l1I1l11llIIlIIl111l1lllI1I();
      this.lIl1I1Il11llIl1();
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.lII111IlIl1l1l();
      this.I11IlIIlI11l111lIIlIl1lIl();
      this.l1I1l11llIIlIIl111l1lllI1I();
      TextHolder.EventImpl_27("RotationRecorder: saved " + this.ll1IlIl1IIIIl11l + " rows");
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (ii1l11il1i1i.Swinganimation() instanceof PlayerPositionLookS2CPacket) {
            this.lII111IlIl1l1l();
            this.l1I1l11llIIlIIl111l1lllI1I();
         }
      }
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (!l11I1I1ll1Illll1I1l1111l1II.isPaused() && l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         LivingEntity LivingEntity = this.II1111lII1llllIl111Il1111();
         net.minecraft.util.math.Box Box = this.Event(LivingEntity);
         if (Box == null) {
            this.I1l1lII1ll11II1lll11l1l1I();
         } else {
            if (LivingEntity != this.I1I1l1llIl1lI) {
               this.I1l1lII1ll11II1lll11l1l1I();
               this.I1I1l1llIl1lI = LivingEntity;
               this.I1lIIl1lI1IlI11I1llIll11 = new Rotationrecorder$II1Il11l111II11IIl(this);
            }

            float f = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
            float f1 = l11I1I1ll1Illll1I1l1111l1II.player.getPitch();
            floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(f, f1);
            if (!this.lIlll111lIlll1l1l111lI1lI1) {
               this.IIIlllllI1II1IIIll11I1 = f;
               this.IIl11Il1II = f1;
               this.lIlll111lIlll1l1l111lI1lI1 = true;
               this.llIIlI111lII = null;
            } else {
               float f2 = MathHelper.wrapDegrees(f - this.IIIlllllI1II1IIIll11I1);
               float f3 = f1 - this.IIl11Il1II;
               float[] afloat = this.StringHolder_8(il1ll111liili1ll11liil, l11I1I1ll1Illll1I1l1111l1II.player.getEyePos(), Box, f2, f3);
               if (afloat == null) {
                  this.IIIlllllI1II1IIIll11I1 = f;
                  this.IIl11Il1II = f1;
               } else {
                  if (this.llIIlI111lII != null) {
                     Rotationrecorder$EventBus llii111111$l1i1illlili = new Rotationrecorder$EventBus(
                        this.llIIlI111lII, new float[]{f2, f3}, System.currentTimeMillis(), l11I1I1ll1Illll1I1l1111l1II.player.age
                     );
                     if (this.I1lIIl1lI1IlI11I1llIll11 != null) {
                        this.I1lIIl1lI1IlI11I1llIll11.EventTarget(llii111111$l1i1illlili);
                     } else {
                        this.StringHolder_8(llii111111$l1i1illlili);
                     }
                  }

                  this.llIIlI111lII = (float[])afloat.clone();
                  this.IIIlllllI1II1IIIll11I1 = f;
                  this.IIl11Il1II = f1;
               }
            }
         }
      } else {
         this.I1l1lII1ll11II1lll11l1l1I();
      }
   }

   private float[] StringHolder_8(
      floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, float f, float f1
   ) {
      net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[]{
         new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.minZ),
         new net.minecraft.util.math.Vec3d(Box.minX, Box.minY, Box.maxZ),
         new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.minZ),
         new net.minecraft.util.math.Vec3d(Box.minX, Box.maxY, Box.maxZ),
         new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.minZ),
         new net.minecraft.util.math.Vec3d(Box.maxX, Box.minY, Box.maxZ),
         new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.minZ),
         new net.minecraft.util.math.Vec3d(Box.maxX, Box.maxY, Box.maxZ)
      };
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         (Box.minX + Box.maxX) * 0.5,
         (Box.minY + Box.maxY) * 0.5,
         (Box.minZ + Box.maxZ) * 0.5
      );
      floatHolder_6 il1ll111liili1ll11liil1 = this.StringHolder_8(Vec3d, Vec3dx);
      floatHolder_9 li11l1lilili1lx = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil1);
      float f2 = li11l1lilili1lx.IlI1ll1l11IlllI111lIlIll111llI();
      float f3 = li11l1lilili1lx.I1II1IlI1I1ll1l1I11I1ll1();
      if (this.isFinite(f2) && this.isFinite(f3)) {
         float f4 = Float.MAX_VALUE;
         float f5 = -Float.MAX_VALUE;
         float f6 = Float.MAX_VALUE;
         float f7 = -Float.MAX_VALUE;

         for (net.minecraft.util.math.Vec3d Vec3dxx : aVec3d) {
            floatHolder_6 il1ll111liili1ll11liil2 = this.StringHolder_8(Vec3d, Vec3dxx);
            floatHolder_9 li11l1lilili1lx = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil2);
            float f8 = li11l1lilili1lx.IlI1ll1l11IlllI111lIlIll111llI();
            float f9 = li11l1lilili1lx.I1II1IlI1I1ll1l1I11I1ll1();
            if (this.isFinite(f8) && this.isFinite(f9)) {
               f8 = EventBus(f8, f2);
               f4 = Math.min(f4, f8);
               f5 = Math.max(f5, f8);
               f6 = Math.min(f6, f9);
               f7 = Math.max(f7, f9);
            }
         }

         if (f4 == Float.MAX_VALUE) {
            f4 = f2;
            f5 = f2;
            f6 = f3;
            f7 = f3;
         }

         f2 = EventBus(f2, f2);
         float f31 = f5 - f4;
         float f32 = f7 - f6;
         float f33 = (float)Vec3d.distanceTo(Vec3dx);
         boolean flag = f4 <= 0.0F && f5 >= 0.0F;
         boolean flag1 = f6 <= 0.0F && f7 >= 0.0F;
         float f34 = 0.0F;
         if (flag && Math.abs(f31) > 1.0E-6F) {
            f34 = MathHelper.clamp((0.0F - f4) / f31, 0.0F, 1.0F);
         }

         float f35 = 0.0F;
         if (flag1 && Math.abs(f32) > 1.0E-6F) {
            f35 = MathHelper.clamp((0.0F - f6) / f32, 0.0F, 1.0F);
         }

         boolean flag2 = flag && flag1;
         this.lI11IIIl111lI1IIII1lIIII = flag2 ? MathHelper.clamp(this.lI11IIIl111lI1IIII1lIIII + 1.0F, 0.0F, 50.0F) : 0.0F;
         this.III11I1lI1I = flag2 ? 0.0F : Math.min(this.III11I1lI1I + 1.0F, 8.0F);
         float f10 = f - this.I1IIlI1l11IllIl;
         float f11 = f1 - this.IIIIIlllIIlI1llIIIl11;
         float f12 = f10 - this.llI11lIl1lIII11;
         float f13 = f11 - this.l1I1ll1llIIIIllIIllIl1I;
         float f14 = this.llIIlI111lII != null ? this.llIIlI111lII[0] : f2;
         float f15 = this.llIIlI111lII != null ? this.llIIlI111lII[1] : f3;
         float f16 = this.llIIlI111lII != null ? this.llIIlI111lII[10] : f33;
         float f17 = MathHelper.wrapDegrees(f2 - f14);
         float f18 = f3 - f15;
         float f19 = f33 - f16;
         float f20 = f2 / Math.max(Math.abs(f31), 0.1F);
         float f21 = f3 / Math.max(Math.abs(f32), 0.1F);
         float f22 = (float)Math.sqrt((double)(f2 * f2 + f3 * f3));
         float f23 = (float)Math.atan2((double)f3, (double)f2);
         float f24 = (float)Math.sin((double)f23);
         float f25 = (float)Math.cos((double)f23);
         this.StringHolder_8(f31, f32, f, f1, flag2);
         float f26 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.forward() ? 1.0F : 0.0F;
         float f27 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.backward() ? 1.0F : 0.0F;
         float f28 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.left() ? 1.0F : 0.0F;
         float f29 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.right() ? 1.0F : 0.0F;
         float f30 = l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.jump() ? 1.0F : 0.0F;
         if (flag2) {
            this.IIll1I111 = MathHelper.clamp(this.l111l1lI1ll ? this.IIll1I111 + 1.0F : 1.0F, 0.0F, 176.0F);
            this.llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
         } else {
            this.IIll1I111 = 0.0F;
            this.llI11I1IlIl1I1l1l1ll1lIlI = MathHelper.clamp(this.l111l1lI1ll ? 1.0F : this.llI11I1IlIl1I1l1l1ll1lIlI + 1.0F, 0.0F, 8.0F);
         }

         float[] afloat = new float[]{
            f2,
            f3,
            f4,
            f5,
            f6,
            f7,
            f31,
            f32,
            f34,
            f35,
            f33,
            f17,
            f18,
            f19,
            flag2 ? 1.0F : 0.0F,
            this.lI11IIIl111lI1IIII1lIIII,
            this.III11I1lI1I,
            f,
            f1,
            f10,
            f11,
            f20,
            f21,
            f12,
            f13,
            f22,
            f24,
            f25,
            this.IIll1I111,
            this.llI11I1IlIl1I1l1l1ll1lIlI,
            this.ll1lIIIIIl1,
            this.I1II1III1lII11lII,
            f26,
            f27,
            f28,
            f29,
            f30
         };
         if (!this.byteHolder_2(afloat)) {
            return null;
         } else {
            this.I1IIlI1l11IllIl = f;
            this.IIIIIlllIIlI1llIIIl11 = f1;
            this.llI11lIl1lIII11 = f10;
            this.l1I1ll1llIIIIllIIllIl1I = f11;
            this.l111l1lI1ll = flag2;
            return afloat;
         }
      } else {
         return null;
      }
   }

   private floatHolder_6 StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      return ZenithInternal131.ZenithInternal070(Vec3d.subtract(Vec3dx));
   }

   private LivingEntity II1111lII1llllIl111Il1111() {
      LivingEntity LivingEntity = Triggerbot.l1lIIII11lI1Il1111IllII1II1lI.lI1IIllII11I();
      return LivingEntity != null && LivingEntity.isAlive() ? LivingEntity : null;
   }

   private void StringHolder_8(float f, float f1, float f2, float f3, boolean flag) {
      float f4 = Math.max(Math.abs(f) * 0.4F, 0.25F);
      float f5 = Math.max(Math.abs(f1) * 0.4F, 0.18F);
      float f6 = (float)Math.sqrt((double)(this.ZenithInternal101(f2 / f4) + this.ZenithInternal101(f3 / f5)));
      f6 = Math.min(f6, 1.5F);
      if (f6 > 0.18F) {
         this.I1II1III1lII11lII = Math.min(this.I1II1III1lII11lII + 1.0F, 20.0F);
         this.ll1lIIIIIl1 = Math.min(this.ll1lIIIIIl1 + f6 * 0.055F, 1.0F);
      } else {
         this.I1II1III1lII11lII = Math.max(this.I1II1III1lII11lII - 2.0F, 0.0F);
         float f7 = flag ? 0.14F : 0.08F;
         this.ll1lIIIIIl1 = Math.max(this.ll1lIIIIIl1 - f7, 0.0F);
      }
   }

   private float ZenithInternal101(float f) {
      return f * f;
   }

   private net.minecraft.util.math.Box Event(LivingEntity LivingEntity) {
      return LivingEntity == null ? null : LivingEntity.getBoundingBox();
   }

   private void StringHolder_8(Rotationrecorder$EventBus llii111111$l1i1illlili) {
      this.I1lIIl1lI1IlI11I1llIll11 = new Rotationrecorder$II1Il11l111II11IIl(this);
      this.I1lIIl1lI1IlI11I1llIll11.EventTarget(llii111111$l1i1illlili);
   }

   private void lIlll1lIIIlI11lI1IlllllIlII() {
      if (this.I1lIIl1lI1IlI11I1llIll11 != null) {
         this.I1lIIl1lI1IlI11I1llIll11.I1lIlI1lI11I1lIIII();
      }
   }

   private void lII111IlIl1l1l() {
      if (this.I1lIIl1lI1IlI11I1llIll11 != null) {
         this.I1lIIl1lI1IlI11I1llIll11.lIl11l1I1lllI1I1l();
         this.lIlll1lIIIlI11lI1IlllllIlII();
      }
   }

   private void I1l1lII1ll11II1lll11l1l1I() {
      this.lII111IlIl1l1l();
      this.l1I1l11llIIlIIl111l1lllI1I();
   }

   private void l1I1l11llIIlIIl111l1lllI1I() {
      this.I1I1l1llIl1lI = null;
      this.lIlll111lIlll1l1l111lI1lI1 = false;
      this.IIIlllllI1II1IIIll11I1 = 0.0F;
      this.IIl11Il1II = 0.0F;
      this.I1IIlI1l11IllIl = 0.0F;
      this.IIIIIlllIIlI1llIIIl11 = 0.0F;
      this.llI11lIl1lIII11 = 0.0F;
      this.l1I1ll1llIIIIllIIllIl1I = 0.0F;
      this.l111l1lI1ll = false;
      this.lI11IIIl111lI1IIII1lIIII = 0.0F;
      this.III11I1lI1I = 0.0F;
      this.IIll1I111 = 0.0F;
      this.llI11I1IlIl1I1l1l1ll1lIlI = 0.0F;
      this.ll1lIIIIIl1 = 0.0F;
      this.I1II1III1lII11lII = 0.0F;
      this.llIIlI111lII = null;
      this.I1lIIl1lI1IlI11I1llIll11 = null;
   }

   private void lIl1I1Il11llIl1() {
      this.Ill1I1IIl1l1lIIIlll11I1I1lll1 = false;
      this.lIl1IlI111 = 0L;
      this.ll1IlIl1IIIIl11l = 0;

      try {
         Files.createDirectories(lIl1I1I111llll11.getParent());
         this.I1llI111I1IlIIlIlIII1lI1 = Files.newBufferedWriter(lIl1I1I111llll11, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      } catch (IOException ioexception) {
         this.I1llI111I1IlIIlIlIII1lI1 = null;
         this.Ill1I1IIl1l1lIIIlll11I1I1lll1 = true;
         System.err.println("[RotationRecorder] Failed to open dataset writer: " + ioexception.getMessage());
      }
   }

   private void I11IlIIlI11l111lIIlIl1lIl() {
      if (this.I1llI111I1IlIIlIlIII1lI1 != null) {
         try {
            this.I1llI111I1IlIIlIlIII1lI1.flush();
            this.I1llI111I1IlIIlIlIII1lI1.close();
         } catch (IOException ioexception) {
         } finally {
            this.I1llI111I1IlIIlIlIII1lI1 = null;
         }
      }
   }

   private void StringHolder_8(long i, Rotationrecorder$EventBus llii111111$l1i1illlili) {
      if (this.I1llI111I1IlIIlIlIII1lI1 != null && !this.Ill1I1IIl1l1lIIIlll11I1I1lll1) {
         float[] afloat = llii111111$l1i1illlili.Il1IIl11I1Il1l1II1III1;
         float[] afloat1 = llii111111$l1i1illlili.IlllIllllII;
         if (afloat != null && afloat1 != null && afloat.length == 37 && afloat1.length == 2) {
            if (this.byteHolder_2(afloat) && this.byteHolder_2(afloat1)) {
               try {
                  StringBuilder stringbuilder = new StringBuilder(512);
                  stringbuilder.append(i).append(',');
                  stringbuilder.append(llii111111$l1i1illlili.llllIll1l11l11I1l11l11).append(',');
                  stringbuilder.append(llii111111$l1i1illlili.llIl11llllIllIIll1lll1I1l);

                  for (float f : afloat) {
                     stringbuilder.append(',').append(f);
                  }

                  stringbuilder.append(',').append(afloat1[0]).append(',').append(afloat1[1]);
                  this.I1llI111I1IlIIlIlIII1lI1.write(stringbuilder.toString());
                  this.I1llI111I1IlIIlIlIII1lI1.newLine();
                  this.lIl1IlI111++;
                  this.ll1IlIl1IIIIl11l++;
                  if (this.lIl1IlI111 % 128L == 0L) {
                     this.I1llI111I1IlIIlIlIII1lI1.flush();
                  }
               } catch (IOException ioexception) {
                  this.Ill1I1IIl1l1lIIIlll11I1I1lll1 = true;
               }
            }
         }
      }
   }

   private static float EventBus(float f, float f1) {
      while (f - f1 > 180.0F) {
         f -= 360.0F;
      }

      while (f - f1 < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   private boolean byteHolder_2(float[] afloat) {
      for (float f : afloat) {
         if (!this.isFinite(f)) {
            return false;
         }
      }

      return true;
   }

   private boolean isFinite(float f) {
      return !Float.isNaN(f) && !Float.isInfinite(f);
   }

   private boolean EventBus(Rotationrecorder$EventBus llii111111$l1i1illlili) {
      return llii111111$l1i1illlili != null && llii111111$l1i1illlili.IlllIllllII != null && llii111111$l1i1illlili.IlllIllllII.length == 2
         ? llii111111$l1i1illlili.IlllIllllII[0] == 0.0F && llii111111$l1i1illlili.IlllIllllII[1] == 0.0F
         : false;
   }
}
