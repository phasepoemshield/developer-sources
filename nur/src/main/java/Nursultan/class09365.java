package Nursultan;

import minecraft.class00381;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00638;
import minecraft.class07878;

public record class09365<T extends class00638>(T listener, class00381<T> packet) {
   public class00381<T> L() {
      return this.packet;
   }

   public T y() {
      return this.listener;
   }

   public void N() {
      if (this.listener.method_52413(this.packet)) {
         try {
            this.packet.method_65081(this.listener);
         } catch (Exception var2) {
            if (var2 instanceof class07878 && ((class07878)var2).getCause() instanceof OutOfMemoryError) {
               throw class00417.N(var2, this.packet, this.listener);
            }

            this.listener.method_59807(this.packet, var2);
         }
      } else {
         class00458.N.debug("Ignoring packet due to disconnection: {}", this.packet);
      }
   }
}
