package zenith;

import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

class I1lIIIll1lIIl1IllllIlIll11$EventBus {
   double l1I1l1lIlIl1l1IlI1l11l;
   double I1lllI11lI1I11Il1Il11I11;
   double III1ll11Il;
   double lIl1III1ll1llII11I111IlII;
   double ll1l1111ll1l;
   double l1lllI1lI1lllIll1Ill11IlI;
   double I1Il1I1lIl11;
   double lIlII1lIl1IIIl1l;
   double IlI1lII1I1Illl11llII1l1l111l;
   long I1lIIl1I1l11l1IlIIII11lIlIll1;
   float lIllll1Ill1l11IIllll1l11II = 0.0F;
   float I1lIl11l1I1IIIl11lIlI = 0.0F;
   float I1111I1lllIllI11lI11Il1I = 0.0F;

   public I1lIIIll1lIIl1IllllIlIll11$EventBus(double d0, double d1, double d2) {
      this.l1I1l1lIlIl1l1IlI1l11l = d0;
      this.I1lllI11lI1I11Il1Il11I11 = d1;
      this.III1ll11Il = d2;
      this.lIl1III1ll1llII11I111IlII = d0;
      this.ll1l1111ll1l = d1;
      this.l1lllI1lI1lllIll1Ill11IlI = d2;
      this.I1Il1I1lIl11 = 0.0;
      this.lIlII1lIl1IIIl1l = (double)((float)(-doubleHolder_3.EventImpl_21(0.0, 0.1)));
      this.IlI1lII1I1Illl11llII1l1l111l = 0.0;
      this.I1lIIl1I1l11l1IlIIII11lIlIll1 = System.currentTimeMillis();
      this.lIl1III1ll1llII11I111IlII = d0;
      this.ll1l1111ll1l = d1;
      this.l1lllI1lI1lllIll1Ill11IlI = d2;
   }

   public long I1lll1IlllI1l1IlIl11ll11() {
      return this.I1lIIl1I1l11l1IlIIII11lIlIll1;
   }

   public boolean lII1lIlI11l1IIl111I1l1I1Illll() {
      this.lIl1III1ll1llII11I111IlII = this.l1I1l1lIlIl1l1IlI1l11l;
      this.ll1l1111ll1l = this.I1lllI11lI1I11Il1Il11I11;
      this.l1lllI1lI1lllIll1Ill11IlI = this.III1ll11Il;
      this.l1I1l1lIlIl1l1IlI1l11l = this.l1I1l1lIlIl1l1IlI1l11l + this.I1Il1I1lIl11;
      this.I1lllI11lI1I11Il1Il11I11 = this.I1lllI11lI1I11Il1Il11I11 + this.lIlII1lIl1IIIl1l;
      this.III1ll11Il = this.III1ll11Il + this.IlI1lII1I1Illl11llII1l1l111l;
      return System.currentTimeMillis() - this.I1lll1IlllI1l1IlIl11ll11() > 250L;
   }

   public void StringHolder_8(MatrixStack MatrixStack, float f, float f1, net.minecraft.client.render.BufferBuilder BufferBuilder) {
      try {
         float f2 = 1.0F;
         float f3 = 0.03F;
         Camera Camera = ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
         double d0 = HashMapHolder.byteHolder_2(this.lIl1III1ll1llII11I111IlII, this.l1I1l1lIlIl1l1IlI1l11l, (double)ListHolder_2.Interface())
            - ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos().x;
         double d1 = HashMapHolder.byteHolder_2(this.ll1l1111ll1l, this.I1lllI11lI1I11Il1Il11I11, (double)ListHolder_2.Interface())
            - ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos().y;
         double d2 = HashMapHolder.byteHolder_2(this.l1lllI1lI1lllIll1Ill11IlI, this.III1ll11Il, (double)ListHolder_2.Interface())
            - ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos().z;
         MatrixStack MatrixStack = new MatrixStack();
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(Camera.getYaw() + 180.0F));
         MatrixStack.translate(d0, d1, d2);
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Camera.getYaw()));
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         long i = System.currentTimeMillis() - this.I1lIIl1I1l11l1IlIIII11lIlIll1;
         long j = 200L;
         float f4 = (float)i / (float)j;
         float f5;
         if (f4 < 0.2F) {
            f5 = f4 / 0.2F;
         } else if (f4 > 0.8F) {
            f5 = (1.0F - f4) / 0.2F;
         } else {
            f5 = 1.0F;
         }

         f5 = Math.max(0.0F, Math.min(f5, 1.0F));
         int k = PatternHolder.EventBus(
            ZenithClient.getInstance()
               .floatHolder_3()
               .getClientColor(90)
               .StringHolder_8(ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I, f)
               .lllIlll1Ill111l111Il11II11lII(),
            f5 * f1
         );
         if (f1 == 0.0F) {
            this.I1lIIl1I1l11l1IlIIII11lIlIll1 = System.currentTimeMillis() - 260L;
         }

         HashMapHolder.EventTarget(matrix4f, BufferBuilder, -f3 / 2.0F, -f3 / 2.0F, f3, f3, k);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }
}
