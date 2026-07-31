package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

public class SetColorHandler implements IGetSize {
   private net.minecraft.util.math.Vec3d l1l111I11I1I;
   private net.minecraft.util.math.Vec3d I1I111ll;
   private net.minecraft.util.math.Vec3d l1l1IIl11IIl1lIlI1Il1lIIl1I1l1;
   private net.minecraft.util.math.Vec3d llll11IIII;
   private int ll1IIIllIlI1ll;
   private int lIlIIIIIl1;
   private final int ll1IllllIl111lI1l1II1IlIII;
   private final float l11IIllIIl1l;
   private ByteBufferHolder lIIlIllIl11ll;
   private final List<Vec3dHolder$Helper_2> I11111lI1IlIllll11l11l11I11I = new ArrayList<>();
   private static final int lI1llI1llll111IIIIlll1 = 15;
   private int ll111lI1III11 = -1;
   private float lll1I1l1l111ll = 1.0F;

   public SetColorHandler(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.l1l111I11I1I = Vec3dx;
      this.I1I111ll = Vec3dx;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
      this.llll11IIII = Vec3d;
      this.ll1IIIllIlI1ll = i;
      this.lIlIIIIIl1 = i;
      this.ll1IllllIl111lI1l1II1IlIII = i;
      this.l11IIllIIl1l = f;
      this.lIIlIllIl11ll = il1iliilli1l1iill;
   }

   @Override
   public String Il1111l11l11I11lIIl1I11() {
      return "particle.texture.firefly";
   }

   @Override
   public float I1l1l1I1I11llII11l() {
      return 0.0F;
   }

   public void ZenithInternal045(net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.client.MinecraftClient MinecraftClient = net.minecraft.client.MinecraftClient.getInstance();
      this.lIlIIIIIl1 = this.ll1IIIllIlI1ll;
      double d0 = this.l1l111I11I1I.distanceTo(Vec3dxx);
      this.ll1IIIllIlI1ll -= d0 > 64.0 ? 8 : 1;
      if (this.ll1IIIllIlI1ll > 0) {
         net.minecraft.util.math.Vec3d Vec3dx = this.l1l111I11I1I;
         this.I1I111ll = this.l1l111I11I1I;
         float f = 1.0F - (float)this.ll1IIIllIlI1ll / (float)this.ll1IllllIl111lI1l1II1IlIII;
         if (f < 0.35F) {
            float f1 = 1.0F - (float)Math.pow((double)(1.0F - f / 0.35F), 3.0);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.llll11IIII.multiply((double)f1);
         } else if (f > 0.6F) {
            float f2 = 1.0F - (float)Math.pow((double)((f - 0.6F) / 0.4F), 3.0);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.92 + 0.08 * (double)f2);
         } else {
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(0.998);
         }

         if (MinecraftClient.world != null) {
            this.ll111lI1III11 = -1;
            net.minecraft.util.math.Vec3d Vec3dxx = this.l1l111I11I1I;

            for (int i = 1; i <= 15; i++) {
               Vec3dxx = Vec3dxx.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
               if (!MinecraftClient.world.getBlockState(BlockPos.ofFloored(Vec3dxx)).isAir()) {
                  this.ll111lI1III11 = i;
                  break;
               }
            }

            if (this.ll111lI1III11 > 0) {
               this.lll1I1l1l111ll = (float)this.ll111lI1III11 / 15.0F;
               this.lll1I1l1l111ll = this.lll1I1l1l111ll * this.lll1I1l1l111ll;
               if (this.ll111lI1III11 <= 1) {
                  this.ll1IIIllIlI1ll = 0;
                  return;
               }
            } else {
               this.lll1I1l1l111ll = Math.min(this.lll1I1l1l111ll + 0.1F, 1.0F);
            }
         }

         this.l1l111I11I1I = this.l1l111I11I1I.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
         this.I11111lI1IlIllll11l11l11I11I.add(new Vec3dHolder$Helper_2(Vec3dx, this.l1l111I11I1I, this.lIIlIllIl11ll));
         this.I11111lI1IlIllll11l11l11I11I.removeIf(iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil -> {
            iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil.Coordinates();
            return iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil.ll1IlIIll11II11II1111();
         });
      }
   }

   @Override
   public boolean ll1IlIIll11II11II1111() {
      return this.ll1IIIllIlI1ll <= 0;
   }

   @Override
   public float lI1lI1llIlll1Il1lII1I1l() {
      return this.GetPayloadLengthHandler(1.0F);
   }

   @Override
   public float GetPayloadLengthHandler(float f) {
      float f1 = (float)this.lIlIIIIIl1 + (float)(this.ll1IIIllIlI1ll - this.lIlIIIIIl1) * f;
      float f2 = f1 / (float)this.ll1IllllIl111lI1l1II1IlIII;
      return f2 * this.lll1I1l1l111ll;
   }

   public void byteHolder(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      this.I1I111ll = this.l1l111I11I1I;
      this.l1l111I11I1I = Vec3dx;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
      this.llll11IIII = Vec3d;
      this.I11111lI1IlIllll11l11l11I11I.add(new Vec3dHolder$Helper_2(this.I1I111ll, this.l1l111I11I1I, this.lIIlIllIl11ll));
      this.I11111lI1IlIllll11l11l11I11I.removeIf(iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil -> {
         iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil.Coordinates();
         return iliili1lliii1i1il1iilil1lil1li$ii1il11l111ii11iil.ll1IlIIll11II11II1111();
      });
   }

   public void I1I1IIII1I1II1lll11l1l1lIIlI1() {
      this.ll1IIIllIlI1ll = this.ll1IllllIl111lI1l1II1IlIII;
   }

   public void I1IllI1l1lIIII() {
      this.ll1IIIllIlI1ll = this.ll1IllllIl111lI1l1II1IlIII / 2;
   }

   @Override
   public net.minecraft.util.math.Vec3d Cameratweaks() {
      return this.l1l111I11I1I;
   }

   @Override
   public net.minecraft.util.math.Vec3d l11l1I1II11I1I1ll1l111II11I() {
      return this.I1I111ll;
   }

   public net.minecraft.util.math.Vec3d I1IIIlI11Il1() {
      return this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1;
   }

   public net.minecraft.util.math.Vec3d I11llllI1I1lIl1Ill1ll1IIII1() {
      return this.llll11IIII;
   }

   public int I1l11I1lllI1I1l1I1Ill1I1Il() {
      return this.ll1IIIllIlI1ll;
   }

   public int IlIlI1llII1IIlII1IIlIlIllIII() {
      return this.lIlIIIIIl1;
   }

   public int IllllllIl1Il() {
      return this.ll1IllllIl111lI1l1II1IlIII;
   }

   @Override
   public float getSize() {
      return this.l11IIllIIl1l;
   }

   @Override
   public ByteBufferHolder l1IllIl1l1llIlI11I11Il1l1l1lI1() {
      return this.lIIlIllIl11ll;
   }

   public List<Vec3dHolder$Helper_2> IIlIl1I1IIII1I() {
      return this.I11111lI1IlIllll11l11l11I11I;
   }

   public int ll11Il1II1III1lIll11ll11lIIl() {
      return this.ll111lI1III11;
   }

   public float l11llI1l1l11I1I11I() {
      return this.lll1I1l1l111ll;
   }

   public void longHolder_4(net.minecraft.util.math.Vec3d Vec3d) {
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
   }

   public void setColor(ByteBufferHolder il1iliilli1l1iill) {
      this.lIIlIllIl11ll = il1iliilli1l1iill;
   }
}
