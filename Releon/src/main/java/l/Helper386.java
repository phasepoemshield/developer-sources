package l;

import net.minecraft.network.packet.Packet;

public class Helper386 extends Event3 {
   private Packet<?> packet;
   private Helper385 type;

   public boolean method3894() {
      return this.type.equals(Helper385.SEND);
   }

   public Packet<?> method3895() {
      return this.packet;
   }

   public Helper385 method3896() {
      return this.type;
   }

   public void method3897(Packet<?> var1) {
      this.packet = var1;
   }

   public void method3898(Helper385 var1) {
      this.type = var1;
   }

   public Helper386(Packet<?> var1, Helper385 var2) {
      this.packet = var1;
      this.type = var2;
   }
}
