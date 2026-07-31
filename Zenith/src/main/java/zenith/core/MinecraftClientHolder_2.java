package zenith;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.util.math.BlockPos;

public class MinecraftClientHolder_2 extends SetColorHandler_2 {
   private static final net.minecraft.client.MinecraftClient IlI1IIII111I1I1IlllII11111I = net.minecraft.client.MinecraftClient.getInstance();
   private static final int lI1lI11Ill = 10;
   private final net.minecraft.util.math.Vec3d I11llllIII1lIllIl1Il11;
   private float lll1I1l1l111ll = 1.0F;

   public MinecraftClientHolder_2(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, ByteBufferHolder il1iliilli1l1iill, String s, float f1, float f2
   ) {
      super(Vec3dx, Vec3d, i, f, il1iliilli1l1iill, s, f1, f2);
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      double d0 = Math.toRadians(threadlocalrandom.nextDouble() * 80.0);
      double d1 = threadlocalrandom.nextDouble() * Math.PI * 2.0;
      double d2 = Math.sin(d0);
      double d3 = -Math.cos(d0);
      this.I11llllIII1lIllIl1Il11 = new net.minecraft.util.math.Vec3d(Math.cos(d1) * d2, d3, Math.sin(d1) * d2).normalize();
   }

   public void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, boolean flag, float f) {
      this.lIlIIIIIl1 = this.ll1IIIllIlI1ll;
      this.longHolder_7(Vec3dxx);
      if (this.ll1IIIllIlI1ll > 0) {
         this.I1I111ll = this.l1l111I11I1I;
         net.minecraft.util.math.Vec3d Vec3dx = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply((double)f);
         if (IlI1IIII111I1I1IlllII11111I.world != null) {
            int i = -1;
            net.minecraft.util.math.Vec3d Vec3dxx = this.l1l111I11I1I;

            for (int j = 1; j <= 10; j++) {
               Vec3dxx = Vec3dxx.add(Vec3dx);
               if (!IlI1IIII111I1I1IlllII11111I.world.getBlockState(BlockPos.ofFloored(Vec3dxx)).isAir()) {
                  i = j;
                  break;
               }
            }

            if (i > 0) {
               float f2 = (float)i / 10.0F;
               this.lll1I1l1l111ll = f2 * f2;
               if (i <= 1) {
                  this.ll1IIIllIlI1ll = 0;
                  return;
               }
            } else {
               this.lll1I1l1l111ll = Math.min(this.lll1I1l1l111ll + 0.1F, 1.0F);
            }
         }

         this.l1l111I11I1I = this.l1l111I11I1I.add(Vec3dx);
         if (flag) {
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.9);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x * 0.85,
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y - 0.008,
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z * 0.85
            );
            if (this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y < -0.5) {
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x, -0.5, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z
               );
            }

            if (this.l1l111I11I1I.y <= (double)IlI1IIII111I1I1IlllII11111I.world.getBottomY()) {
               this.ll1IIIllIlI1ll = 0;
            }
         } else {
            float f1 = 1.0F - (float)this.ll1IIIllIlI1ll / (float)this.I1lI111IIlIl;
            if (f1 < 0.7F) {
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.995);
            } else {
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.92);
            }

            if (this.l1l111I11I1I.y <= (double)IlI1IIII111I1I1IlllII11111I.world.getBottomY() || this.l1l111I11I1I.y > 320.0) {
               this.ll1IIIllIlI1ll = 0;
            }
         }

         this.l11Il1IlllIllI();
      }
   }

   @Override
   public float lI1lI1llIlll1Il1lII1I1l() {
      return this.GetPayloadLengthHandler(1.0F);
   }

   @Override
   public float GetPayloadLengthHandler(float f) {
      float f1 = this.FilterInputStreamImpl(f);
      float f2;
      if (f1 < 0.1F) {
         f2 = f1 / 0.1F;
      } else if (f1 > 0.7F) {
         f2 = 1.0F - (f1 - 0.7F) / 0.3F;
      } else {
         f2 = 1.0F;
      }

      return f2 * this.lll1I1l1l111ll;
   }
}
