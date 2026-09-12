package Nursultan;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;

public class class11514 extends class11488 implements class11531 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public boolean y_init;

   public class12023 L() {
      this.z();
      return (class12023)this.y_0;
   }

   public class11514(String var1, int var2) {
      super(var1, var2, class09378.CLIENT_SETTINGS);
      this.z();
      this.y_0 = class11938.B();
   }

   static {
      U();
   }

   private static void U() {
      N_0 = null;
   }

   private void z() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_1 = false;
      }
   }

   @Override
   public boolean y() {
      this.z();
      return (Boolean)this.y_1;
   }

   public class11514 N(boolean var1) {
      this.z();
      this.y_1 = var1;
      return this;
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      this.z();
      ArrayList var2 = new ArrayList();

      for (class11536<?> var4 : ((class12023)this.y_0).w().values()) {
         if (var4.c_() && !var4.N()) {
            var2.add(var4);
         }
      }

      var1.packArrayHeader(var2.size());

      for (class11536 var6 : var2) {
         var1.packArrayHeader(2);
         var1.packString(var6.P().N());
         class11530.N(var1, var6);
      }

      var1.packInt(((class11472)class11938.L_2).L());
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      this.z();
      int var3 = var2.unpackArrayHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.unpackArrayHeader();
         String var5 = var2.unpackString();
         ImmutableValue var6 = var2.unpackValue();
         class11536 var7 = ((class12023)this.y_0).L(var5);
         if (var7 == null) {
            ((Logger)N_0).warn("Unknown client setting '{}' in {}, skipped", var5, this.u());
         } else {
            try {
               class11530.N(var7, var6);
            } catch (Exception var9) {
               ((Logger)N_0).warn("Skipped corrupt client setting '{}' in {}: {}", var5, this.u(), var9.getMessage());
            }
         }
      }

      if (var2.hasNext()) {
         ((class11472)class11938.L_2).L(var2.unpackInt());
      }
   }

   @Override
   public boolean d_() {
      this.z();
      return ((class11472)class11938.L_2).L() == -1 && ((class12023)this.y_0).w().values().stream().noneMatch(class11536::c_);
   }
}
