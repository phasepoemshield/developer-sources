package zenith;

public abstract class SetColorHandler_2 implements IGetSize {
   protected net.minecraft.util.math.Vec3d l1l111I11I1I;
   protected net.minecraft.util.math.Vec3d I1I111ll;
   protected net.minecraft.util.math.Vec3d l1l1IIl11IIl1lIlI1Il1lIIl1I1l1;
   protected int ll1IIIllIlI1ll;
   protected int lIlIIIIIl1;
   protected final int I1lI111IIlIl;
   protected final float IIIII1I1II1llII;
   protected ByteBufferHolder lIIlIllIl11ll;
   protected final String I11lI1l1llIIlIIIl1ll;
   protected float lI11lI11I111I;
   protected final float Ill1II1lI1Il11IIIIIl1I1lllI;

   protected SetColorHandler_2(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, ByteBufferHolder il1iliilli1l1iill, String s, float f1, float f2
   ) {
      this.l1l111I11I1I = Vec3dx;
      this.I1I111ll = Vec3dx;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = Vec3d;
      this.ll1IIIllIlI1ll = i;
      this.lIlIIIIIl1 = i;
      this.I1lI111IIlIl = i;
      this.IIIII1I1II1llII = f;
      this.lIIlIllIl11ll = il1iliilli1l1iill;
      this.I11lI1l1llIIlIIIl1ll = s;
      this.lI11lI11I111I = f1;
      this.Ill1II1lI1Il11IIIIIl1I1lllI = f2;
   }

   @Override
   public boolean ll1IlIIll11II11II1111() {
      return this.ll1IIIllIlI1ll <= 0;
   }

   protected void l11Il1IlllIllI() {
      this.lI11lI11I111I = this.lI11lI11I111I + this.Ill1II1lI1Il11IIIIIl1I1lllI;
   }

   protected float FilterInputStreamImpl(float f) {
      float f1 = (float)this.lIlIIIIIl1 + (float)(this.ll1IIIllIlI1ll - this.lIlIIIIIl1) * f;
      return 1.0F - f1 / (float)this.I1lI111IIlIl;
   }

   protected void longHolder_7(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = this.l1l111I11I1I.distanceTo(Vec3d);
      this.ll1IIIllIlI1ll -= d0 > 64.0 ? 8 : 1;
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

   public int I1l11I1lllI1I1l1I1Ill1I1Il() {
      return this.ll1IIIllIlI1ll;
   }

   public int IlIlI1llII1IIlII1IIlIlIllIII() {
      return this.lIlIIIIIl1;
   }

   public int IllllllIl1Il() {
      return this.I1lI111IIlIl;
   }

   @Override
   public float getSize() {
      return this.IIIII1I1II1llII;
   }

   @Override
   public ByteBufferHolder l1IllIl1l1llIlI11I11Il1l1l1lI1() {
      return this.lIIlIllIl11ll;
   }

   @Override
   public String Il1111l11l11I11lIIl1I11() {
      return this.I11lI1l1llIIlIIIl1ll;
   }

   @Override
   public float I1l1l1I1I11llII11l() {
      return this.lI11lI11I111I;
   }

   public float l1IIl1IIl1lIlll() {
      return this.Ill1II1lI1Il11IIIIIl1I1lllI;
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

   public void EventImpl_6(int i) {
      this.ll1IIIllIlI1ll = i;
   }

   public void ZenithInternal139(int i) {
      this.lIlIIIIIl1 = i;
   }

   public void setColor(ByteBufferHolder il1iliilli1l1iill) {
      this.lIIlIllIl11ll = il1iliilli1l1iill;
   }

   public void ZenithInternal123(float f) {
      this.lI11lI11I111I = f;
   }
}
