package zenith;

import java.lang.ref.WeakReference;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class MinecraftClientHolder extends SetColorHandler_2 {
   private static final net.minecraft.client.MinecraftClient l1lIIIlIllIlII1IIIlII1l1l1 = net.minecraft.client.MinecraftClient.getInstance();
   private double I1lII1l11l1lII1l1lIIl11111I11;
   private double IIllII1lII1l11IIlI1111;
   private double lI111ll1llIIlI11lllI;
   private WeakReference<Entity> lI1llIlllIIlIl1II;
   private float lI1IlIIIII1Il1lI11IIllllI;
   private float I111I1l1I1lI111;
   private boolean lI1l1111III1Il11IIIIl;
   private static final float llI1llII11lI1IllllllIIl1 = 0.3F;
   private static final float l11IlIIIlIlIl1llIIl1lll1l1I = 0.2F;

   public MinecraftClientHolder(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, ByteBufferHolder il1iliilli1l1iill, String s, float f1, float f2
   ) {
      super(Vec3dx, Vec3d, i, f, il1iliilli1l1iill, s, f1, f2);
   }

   public void StringHolder_8(Entity Entity, float f, float f1) {
      this.lI1llIlllIIlIl1II = new WeakReference<>(Entity);
      this.lI1IlIIIII1Il1lI11IIllllI = f;
      this.I111I1l1I1lI111 = f1;
      net.minecraft.util.math.Vec3d Vec3d = Entity.getPos();
      this.I1lII1l11l1lII1l1lIIl11111I11 = Math.atan2(this.l1l111I11I1I.z - Vec3d.z, this.l1l111I11I1I.x - Vec3d.x);
      this.IIllII1lII1l11IIlI1111 = Math.sqrt(
         Math.pow(this.l1l111I11I1I.x - Vec3d.x, 2.0) + Math.pow(this.l1l111I11I1I.z - Vec3d.z, 2.0)
      );
      this.lI111ll1llIIlI11lllI = this.l1l111I11I1I.y - Vec3d.y;
   }

   public void EventBus(net.minecraft.util.math.Vec3d Vec3d, int i) {
      this.lIlIIIIIl1 = this.ll1IIIllIlI1ll;
      this.longHolder_7(Vec3d);
      if (this.ll1IIIllIlI1ll > 0) {
         this.I1I111ll = this.l1l111I11I1I;
         float f = 1.0F - (float)this.ll1IIIllIlI1ll / (float)this.I1lI111IIlIl;
         switch (i) {
            case 1:
               this.ZenithInternal121(f);
               break;
            case 2:
               this.IllIIlIl11llIIlIIl1();
               break;
            default:
               this.III1ll11Il();
         }

         this.l11Il1IlllIllI();
      }
   }

   private void III1ll11Il() {
      this.l1l111I11I1I = this.l1l111I11I1I.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x * 0.98,
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y * 0.98 - 3.0E-4,
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z * 0.98
      );
      if (l1lIIIlIllIlII1IIIlII1l1l1.world != null) {
         BlockPos BlockPos = BlockPos.ofFloored(this.l1l111I11I1I.x, this.l1l111I11I1I.y - 0.1, this.l1l111I11I1I.z);
         if (!l1lIIIlIllIlII1IIIlII1l1l1.world.getBlockState(BlockPos).isAir()) {
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x / 1.1,
               -this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y / 1.1,
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z / 1.1
            );
         }
      }

      if (this.l1l111I11I1I.y <= (double)l1lIIIlIllIlII1IIIlII1l1l1.world.getBottomY()) {
         this.ll1IIIllIlI1ll = 0;
      }
   }

   private void ZenithInternal121(float f) {
      float f1 = (float)Math.sin((double)f * Math.PI);
      f1 = 0.3F + f1 * 1.2F;
      this.l1l111I11I1I = this.l1l111I11I1I.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply((double)f1));
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.96);
   }

   private void IllIIlIl11llIIlIIl1() {
      float f = 1.0F - (float)this.ll1IIIllIlI1ll / (float)this.I1lI111IIlIl;
      Entity Entity = this.lI1llIlllIIlIl1II != null ? this.lI1llIlllIIlIl1II.get() : null;
      if (Entity != null && !Entity.isRemoved()) {
         if (!(f > 0.5F) && !this.lI1l1111III1Il11IIIIl) {
            this.I1lII1l11l1lII1l1lIIl11111I11 = this.I1lII1l11l1lII1l1lIIl11111I11 + (double)this.lI1IlIIIII1Il1lI11IIllllI / 10.0;
            this.IIllII1lII1l11IIlI1111 = this.IIllII1lII1l11IIlI1111 + (double)this.I111I1l1I1lI111 / 100.0;
            double d0 = Entity.getX();
            double d1 = Entity.getZ();
            double d2 = Entity.getY();
            double d3 = d0 + Math.cos(this.I1lII1l11l1lII1l1lIIl11111I11) * this.IIllII1lII1l11IIlI1111;
            double d4 = d1 + Math.sin(this.I1lII1l11l1lII1l1lIIl11111I11) * this.IIllII1lII1l11IIlI1111;
            double d5 = d2 + this.lI111ll1llIIlI11lllI + (double)this.IIIII1I1II1llII * 0.1;
            if (f < 0.3F) {
               this.l1l111I11I1I = new net.minecraft.util.math.Vec3d(d3, d5, d4);
            } else {
               float f1 = (f - 0.3F) / 0.2F;
               f1 = f1 * f1 * (3.0F - 2.0F * f1);
               if (this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.equals(net.minecraft.util.math.Vec3d.ZERO)) {
                  this.lIll1l1II1I1Il11111lII();
               }

               net.minecraft.util.math.Vec3d Vec3d = this.l1l111I11I1I.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x * 0.98,
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y * 0.98 - 3.0E-4,
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z * 0.98
               );
               this.l1l111I11I1I = new net.minecraft.util.math.Vec3d(
                  MathHelper.lerp((double)f1, d3, Vec3d.x),
                  MathHelper.lerp((double)f1, d5, Vec3d.y),
                  MathHelper.lerp((double)f1, d4, Vec3d.z)
               );
            }
         } else {
            if (!this.lI1l1111III1Il11IIIIl) {
               this.lI1l1111III1Il11IIIIl = true;
               this.lIll1l1II1I1Il11111lII();
            }

            this.III1ll11Il();
         }
      } else {
         if (!this.lI1l1111III1Il11IIIIl) {
            this.lI1l1111III1Il11IIIIl = true;
            this.lIll1l1II1I1Il11111lII();
         }

         this.III1ll11Il();
      }
   }

   private void lIll1l1II1I1Il11111lII() {
      double d0 = -Math.sin(this.I1lII1l11l1lII1l1lIIl11111I11) * (double)this.lI1IlIIIII1Il1lI11IIllllI * 0.02;
      double d1 = Math.cos(this.I1lII1l11l1lII1l1lIIl11111I11) * (double)this.lI1IlIIIII1Il1lI11IIllllI * 0.02;
      double d2 = Math.cos(this.I1lII1l11l1lII1l1lIIl11111I11) * (double)this.I111I1l1I1lI111 * 0.005;
      double d3 = Math.sin(this.I1lII1l11l1lII1l1lIIl11111I11) * (double)this.I111I1l1I1lI111 * 0.005;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
         d0 + d2 + (Math.random() - 0.5) * 0.02, 0.015 + Math.random() * 0.025, d1 + d3 + (Math.random() - 0.5) * 0.02
      );
   }

   @Override
   public float lI1lI1llIlll1Il1lII1I1l() {
      return this.GetPayloadLengthHandler(1.0F);
   }

   @Override
   public float GetPayloadLengthHandler(float f) {
      float f1 = this.FilterInputStreamImpl(f);
      if (f1 < 0.1F) {
         return f1 / 0.1F;
      } else {
         float f2 = 0.5F;
         if (!this.lI1l1111III1Il11IIIIl && !(f1 > f2)) {
            return 1.0F;
         } else {
            float f3 = (f1 - f2) / (1.0F - f2);
            return 1.0F - f3 * f3;
         }
      }
   }
}
