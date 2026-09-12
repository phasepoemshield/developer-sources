package Nursultan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11511 extends class11488 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11511(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      Z();
   }

   private static void Z() {
      N_0 = null;
   }

   private BlockESP y() {
      return class11938.u().N();
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      Collection<class11025> var2 = this.y().m();
      var1.packArrayHeader(var2.size());

      for (class11025 var4 : var2) {
         var1.packString(class04206.i.y(var4.N()).toString());
         var1.packInt(var4.y());
      }
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();
      ArrayList var4 = new ArrayList(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         try {
            String var6 = var2.unpackString();
            int var7 = var2.unpackInt();
            class01894 var8 = class01894.L(var6);
            if (var8 != null && class04206.i.u(var8)) {
               var4.add(new class11025((class00891)class04206.i.N(var8), var7));
            } else {
               ((Logger)N_0).warn("Unknown block id '{}' in {}, skipped", var6, this.u());
            }
         } catch (Exception var9) {
            ((Logger)N_0).warn("Skipped corrupt record #{} in {}: {}", var5, this.u(), var9.getMessage());
         }
      }

      this.y().y(var4);
   }

   @Override
   public boolean d_() {
      return this.y().m().isEmpty();
   }
}
