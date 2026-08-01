package zenith;

import net.minecraft.network.packet.Packet;

final class Blink$II1Il11l111II11IIl  {
   private final Packet<?> IlI111l11II1;
   private final net.minecraft.util.math.Vec3d I1II1II1IIIIl1lI1llIll1;

   private Blink$II1Il11l111II11IIl(Packet<?> Packet, net.minecraft.util.math.Vec3d Vec3d) {
      this.IlI111l11II1 = Packet;
      this.I1II1II1IIIIl1lI1llIll1 = Vec3d;
   }

   public Packet<?> lII1IIIIllI1lIlIllllIIII1I() {
      return this.IlI111l11II1;
   }

   public net.minecraft.util.math.Vec3d I1II1lIl1I1Il1() {
      return this.I1II1II1IIIIl1lI1llIll1;
   }
}
