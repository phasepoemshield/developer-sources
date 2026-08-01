package zenith;

import net.minecraft.network.packet.Packet;

public class PacketHolder extends EventImpl_33 {
   private final ZenithInternal036$Helper lI11l1IIl1II11l11lI11;
   private Packet<?> lll1lI1I1l1l;

   public boolean Shaderfog() {
      return this.Shaderhand() == ZenithInternal036$Helper.l1lIII1l1I;
   }

   public boolean longHolder_8() {
      return this.Shaderhand() == ZenithInternal036$Helper.lII1lllIlllIllII;
   }

   public ZenithInternal036$Helper Shaderhand() {
      return this.lI11l1IIl1II11l11lI11;
   }

   public Packet<?> Swinganimation() {
      return this.lll1lI1I1l1l;
   }

   public void StringHolder_8(Packet<?> Packet) {
      this.lll1lI1I1l1l = Packet;
   }

   public PacketHolder(ZenithInternal036$Helper ii1l11il1i1i$ii1il11l111ii11iil, Packet<?> Packet) {
      this.lI11l1IIl1II11l11lI11 = ii1l11il1i1i$ii1il11l111ii11iil;
      this.lll1lI1I1l1l = Packet;
   }
}
