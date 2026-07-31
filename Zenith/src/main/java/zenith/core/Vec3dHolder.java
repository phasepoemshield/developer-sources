package zenith;

import zenith.hud.*;

public class Vec3dHolder implements IGetSize {
   private net.minecraft.util.math.Vec3d l1l111I11I1I;
   private net.minecraft.util.math.Vec3d I1I111ll;
   private net.minecraft.util.math.Vec3d l1l1IIl11IIl1lIlI1Il1lIIl1I1l1;
   private int I11l1l1lIlIll1l;
   private int lll1lIl1I1II11llllIl1llllllI;
   private int Il11IIlll1111Il1;
   private final int I11IlllIIlII1Il1I1I1II1lIIl;
   private final float lIlIllIIlII11l1ll1;
   private final ByteBufferHolder l11lll1lllI1l1I;
   private final String llllI1ll111I1l1lI1Ill11;
   private float lI11lI11I111I;
   private final float l111l1l1llIl1ll1lIl111111l;
   private boolean I11II1ll1I1lll1l;
   private static final net.minecraft.client.MinecraftClient I1II1l1l1ll1I1II1l = net.minecraft.client.MinecraftClient.getInstance();

   public Vec3dHolder(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, ByteBufferHolder il1iliilli1l1iill, String s, float f1, float f2
   ) {
      this.l1l111I11I1I = Vec3dx;
      this.I1I111ll = Vec3dx;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
      this.I11l1l1lIlIll1l = 0;
      this.lll1lIl1I1II11llllIl1llllllI = 0;
      this.I11IlllIIlII1Il1I1I1II1lIIl = i;
      this.lIlIllIIlII11l1ll1 = f;
      this.l11lll1lllI1l1I = il1iliilli1l1iill;
      this.llllI1ll111I1l1lI1Ill11 = s;
      this.lI11lI11I111I = f1;
      this.l111l1l1llIl1ll1lIl111111l = f2;
      this.I11II1ll1I1lll1l = false;
   }

   public void Coordinates() {
      this.I11l1l1lIlIll1l++;
      this.I1I111ll = this.l1l111I11I1I;
      this.Il11IIlll1111Il1 = this.lll1lIl1I1II11llllIl1llllllI;
      if (this.I11II1ll1I1lll1l) {
         this.lll1lIl1I1II11llllIl1llllllI++;
      } else if (I1II1l1l1ll1I1II1l.world != null) {
         float f = this.lIlIllIIlII11l1ll1 / 2.0F;
         double d0 = this.l1l111I11I1I.x;
         double d1 = this.l1l111I11I1I.y;
         double d2 = this.l1l111I11I1I.z;
         net.minecraft.util.math.Vec3d Vec3d = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1;
         net.minecraft.util.math.Box Boxxx = new net.minecraft.util.math.Box(
            d0 - (double)f,
            d1 - (double)(f * 2.0F) + Vec3d.y,
            d2 - (double)f,
            d0 + (double)f,
            d1 + (double)f + Vec3d.y,
            d2 + (double)f
         );
         if (!I1II1l1l1ll1I1II1l.world.isSpaceEmpty(null, Boxxx)) {
            if (Vec3d.y < 0.0) {
               this.I11II1ll1I1lll1l = true;
            }

            Vec3d = new net.minecraft.util.math.Vec3d(Vec3d.x, 0.0, Vec3d.z);
         } else {
            d1 += Vec3d.y;
         }

         net.minecraft.util.math.Box Boxx = new net.minecraft.util.math.Box(
            d0 - (double)f + Vec3d.x, d1 - (double)f, d2 - (double)f, d0 + (double)f + Vec3d.x, d1 + (double)f, d2 + (double)f
         );
         if (!I1II1l1l1ll1I1II1l.world.isSpaceEmpty(null, Boxx)) {
            Vec3d = new net.minecraft.util.math.Vec3d(0.0, Vec3d.y, Vec3d.z);
         } else {
            d0 += Vec3d.x;
         }

         net.minecraft.util.math.Box Boxxx = new net.minecraft.util.math.Box(
            d0 - (double)f, d1 - (double)f, d2 - (double)f + Vec3d.z, d0 + (double)f, d1 + (double)f, d2 + (double)f + Vec3d.z
         );
         if (!I1II1l1l1ll1I1II1l.world.isSpaceEmpty(null, Boxxx)) {
            Vec3d = new net.minecraft.util.math.Vec3d(Vec3d.x, Vec3d.y, 0.0);
         } else {
            d2 += Vec3d.z;
         }

         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
         this.l1l111I11I1I = new net.minecraft.util.math.Vec3d(d0, d1, d2);
         if (this.I11II1ll1I1lll1l) {
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
         }
      }
   }

   @Override
   public boolean ll1IlIIll11II11II1111() {
      return this.I11l1l1lIlIll1l >= this.I11IlllIIlII1Il1I1I1II1lIIl * 2 || this.lll1lIl1I1II11llllIl1llllllI >= this.I11IlllIIlII1Il1I1I1II1lIIl;
   }

   @Override
   public float lI1lI1llIlll1Il1lII1I1l() {
      return this.GetPayloadLengthHandler(1.0F);
   }

   @Override
   public float GetPayloadLengthHandler(float f) {
      if (!this.I11II1ll1I1lll1l) {
         return 1.0F;
      } else {
         float f1 = (float)this.Il11IIlll1111Il1 + (float)(this.lll1lIl1I1II11llllIl1llllllI - this.Il11IIlll1111Il1) * f;
         return 1.0F - f1 / (float)this.I11IlllIIlII1Il1I1I1II1lIIl;
      }
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

   public int I1II1Il1l1ll11IlIII1IIl1IlIlI() {
      return this.I11l1l1lIlIll1l;
   }

   public int l1lIl1IIlII11lIlII11IlII() {
      return this.lll1lIl1I1II11llllIl1llllllI;
   }

   public int lIIIlll11ll1l() {
      return this.Il11IIlll1111Il1;
   }

   public int IlII1I1llIllIl1IIl() {
      return this.I11IlllIIlII1Il1I1I1II1lIIl;
   }

   @Override
   public float getSize() {
      return this.lIlIllIIlII11l1ll1;
   }

   @Override
   public ByteBufferHolder l1IllIl1l1llIlI11I11Il1l1l1lI1() {
      return this.l11lll1lllI1l1I;
   }

   @Override
   public String Il1111l11l11I11lIIl1I11() {
      return this.llllI1ll111I1l1lI1Ill11;
   }

   @Override
   public float I1l1l1I1I11llII11l() {
      return this.lI11lI11I111I;
   }

   public float l1IIl1IIl1lIlll() {
      return this.l111l1l1llIl1ll1lIl111111l;
   }

   public boolean lllIll1IlIIII11llll() {
      return this.I11II1ll1I1lll1l;
   }

   public void EventBus(net.minecraft.util.math.Vec3d Vec3d) {
      this.l1l111I11I1I = Vec3d;
   }

   public void HostnameVerifierImpl(net.minecraft.util.math.Vec3d Vec3d) {
      this.I1I111ll = Vec3d;
   }

   public void longHolder_4(net.minecraft.util.math.Vec3d Vec3d) {
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
   }

   public void EventImpl_7(int i) {
      this.I11l1l1lIlIll1l = i;
   }

   public void ZenithInternal031(int i) {
      this.lll1lIl1I1II11llllIl1llllllI = i;
   }

   public void EventImpl_11(int i) {
      this.Il11IIlll1111Il1 = i;
   }

   public void ZenithInternal123(float f) {
      this.lI11lI11I111I = f;
   }

   public void ZenithInternal148(boolean flag) {
      this.I11II1ll1I1lll1l = flag;
   }
}
