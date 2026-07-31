package zenith;

import zenith.hud.*;

public class Vec3dHolder$Helper_2 {
   private final net.minecraft.util.math.Vec3d I1ll11Ill1l;
   private final net.minecraft.util.math.Vec3d I11I11111lIl1;
   private final ByteBufferHolder Il1lIl1lIIlllIlIl11;
   private int ll1IIIllIlI1ll;
   private static final int II1l1l1lI1111 = 20;

   public Vec3dHolder$Helper_2(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.I1ll11Ill1l = Vec3dx;
      this.I11I11111lIl1 = Vec3d;
      this.Il1lIl1lIIlllIlIl11 = il1iliilli1l1iill;
      this.ll1IIIllIlI1ll = 20;
   }

   public void Coordinates() {
      this.ll1IIIllIlI1ll--;
   }

   public boolean ll1IlIIll11II11II1111() {
      return this.ll1IIIllIlI1ll <= 0;
   }

   public float lI1lI1llIlll1Il1lII1I1l() {
      return (float)this.ll1IIIllIlI1ll / 20.0F;
   }

   public net.minecraft.util.math.Vec3d l1I1l1lIlIl1l1IlI1l11l() {
      return this.I1ll11Ill1l;
   }

   public net.minecraft.util.math.Vec3d I1lllI11lI1I11Il1Il11I11() {
      return this.I11I11111lIl1;
   }

   public ByteBufferHolder l1IllIl1l1llIlI11I11Il1l1l1lI1() {
      return this.Il1lIl1lIIlllIlIl11;
   }

   public int I1l11I1lllI1I1l1I1Ill1I1Il() {
      return this.ll1IIIllIlI1ll;
   }
}
