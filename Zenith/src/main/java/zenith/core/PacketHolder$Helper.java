package zenith;

import net.minecraft.network.packet.Packet;

final class Fakelag$II1Il11l111II11IIl  {
   private final Packet<?> IIIlIllI1l1Il111IIII;
   private final net.minecraft.util.math.Vec3d ll1IIIIIIl11l;
   private final long l111IIlIl1l1;

   private Fakelag$II1Il11l111II11IIl(Packet<?> Packet, net.minecraft.util.math.Vec3d Vec3d) {
      this(Packet, Vec3d, System.currentTimeMillis());
   }

   private Fakelag$II1Il11l111II11IIl(Packet<?> Packet, net.minecraft.util.math.Vec3d Vec3d, long i) {
      this.IIIlIllI1l1Il111IIII = Packet;
      this.ll1IIIIIIl11l = Vec3d;
      this.l111IIlIl1l1 = i;
   }

   public Packet<?> lII1IIIIllI1lIlIllllIIII1I() {
      return this.IIIlIllI1l1Il111IIII;
   }

   public net.minecraft.util.math.Vec3d I1II1lIl1I1Il1() {
      return this.ll1IIIIIIl11l;
   }

   public long IlIllII1I1I1l1lI111IIlI() {
      return this.l111IIlIl1l1;
   }
}
