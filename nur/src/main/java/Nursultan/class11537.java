package Nursultan;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11537 extends class11488 implements class11531 {
   public Object N_0;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   private void M() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_0 = false;
      }
   }

   public class11537(String var1, int var2) {
      super(var1, var2, class09378.NUKER);
      this.M();
   }

   static {
      Z();
   }

   private Nuker B() {
      return class11938.u().b();
   }

   private static void Z() {
      y_0 = null;
   }

   public class11537 N(boolean var1) {
      this.M();
      this.N_0 = var1;
      return this;
   }

   @Override
   public boolean y() {
      this.M();
      return (Boolean)this.N_0;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      Set<class00891> var3 = this.B().m();
      int var4 = var2.unpackArrayHeader();
      HashSet var5 = new HashSet(var4);

      for (int var6 = 0; var6 < var4; var6++) {
         try {
            String var7 = var2.unpackString();
            class01894 var8 = class01894.L(var7);
            if (var8 != null && class04206.i.u(var8)) {
               var5.add((class00891)class04206.i.N(var8));
            } else {
               ((Logger)y_0).warn("Unknown block id '{}' in {}, skipped", var7, this.u());
            }
         } catch (Exception var9) {
            ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", var6, this.u(), var9.getMessage());
         }
      }

      var3.removeIf(var1x -> !var5.contains(var1x));
      var3.addAll(var5);
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      Set<class00891> var2 = this.B().m();
      var1.packArrayHeader(var2.size());

      for (class00891 var4 : var2) {
         var1.packString(class04206.i.y(var4).toString());
      }
   }

   @Override
   public boolean d_() {
      return this.B().m().isEmpty();
   }
}
