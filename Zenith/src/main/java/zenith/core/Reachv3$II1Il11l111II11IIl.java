package zenith;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;

public class Reachv3$II1Il11l111II11IIl {
   private final Packet<?> Il1IIl1II1I1Il11l1lIIll11;
   private final long I1lIIl1I1l11l1IlIIII11lIlIll1;
   private final net.minecraft.util.math.Vec3d lIlI1ll1I1lIIII1;
   private boolean Il1I1111Illll1IIII;

   public Packet<?> l1l111ll1111lII() {
      return this.Il1IIl1II1I1Il11l1lIIll11;
   }

   public long I1lll1IlllI1l1IlIl11ll11() {
      return this.I1lIIl1I1l11l1IlIIII11lIlIll1;
   }

   public net.minecraft.util.math.Vec3d IllIIlIIll1l1lIIl1IIl() {
      return this.lIlI1ll1I1lIIII1;
   }

   public boolean llIII11llIIl111Illl1IIIII() {
      return this.Il1I1111Illll1IIII;
   }

   public void booleanHolder_2(boolean flag) {
      this.Il1I1111Illll1IIII = flag;
   }

   public Reachv3$II1Il11l111II11IIl(Packet<?> Packet, net.minecraft.util.math.Vec3d Vec3d) {
      this.Il1IIl1II1I1Il11l1lIIll11 = Packet;
      this.I1lIIl1I1l11l1IlIIII11lIlIll1 = System.currentTimeMillis();
      this.lIlI1ll1I1lIIII1 = Vec3d;
      this.Il1I1111Illll1IIII = false;
   }

   public Packet<ClientPlayPacketListener> Swinganimation() {
      return (Packet<ClientPlayPacketListener>)this.Il1IIl1II1I1Il11l1lIIll11;
   }
}
