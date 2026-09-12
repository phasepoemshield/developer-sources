package Nursultan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableValue;

public class class11516 extends class11488 {
   public static Object N_0 = LogManager.getLogger(String.class);

   public class11516(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      B();
   }

   private static void B() {
      N_0 = null;
   }

   private static List<class11536<?>> y(class11882 var0) {
      ArrayList var1 = new ArrayList();

      for (class11536<?> var3 : var0.w().values()) {
         if (var3.c_() && !var3.N()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   @Override
   public void N(int var1, MessageUnpacker var2) throws IOException {
      int var3 = var2.unpackArrayHeader();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.unpackArrayHeader();
         String var5 = var2.unpackString();
         boolean var6 = var2.unpackBoolean();
         int var7 = var2.unpackArrayHeader();
         class11882 var8 = class11938.n().N(var5).orElse(null);
         if (var8 == null) {
            ((Logger)N_0).warn("Unknown autobuy item '{}' in {}, skipped", var5, this.u());
         } else {
            var8.N(var6);
         }

         for (int var9 = 0; var9 < var7; var9++) {
            var2.unpackArrayHeader();
            String var10 = var2.unpackString();
            ImmutableValue var11 = var2.unpackValue();
            if (var8 != null) {
               class11536 var12 = var8.L(var10);
               if (var12 == null) {
                  ((Logger)N_0).warn("Unknown autobuy setting '{}' for '{}' in {}, skipped", var10, var5, this.u());
               } else {
                  try {
                     class11530.N(var12, var11);
                  } catch (Exception var14) {
                     ((Logger)N_0).warn("Skipped corrupt autobuy setting '{}' in {}: {}", var10, this.u(), var14.getMessage());
                  }
               }
            }
         }
      }
   }

   @Override
   public void N(MessageBufferPacker var1) throws IOException {
      List<class11882> var2 = class11938.n().L().filter(class11516::N).toList();
      var1.packArrayHeader(var2.size());

      for (class11882 var4 : var2) {
         List<class11536<?>> var5 = y(var4);
         var1.packArrayHeader(3);
         var1.packString(var4.L().N());
         var1.packBoolean(var4.M());
         var1.packArrayHeader(var5.size());

         for (class11536<?> var7 : var5) {
            var1.packArrayHeader(2);
            var1.packString(var7.P().N());
            class11530.N(var1, var7);
         }
      }
   }

   private static boolean N(class11882 var0) {
      return var0.M() || var0.w().values().stream().anyMatch(class11536::c_);
   }

   @Override
   public boolean d_() {
      return class11938.n().L().noneMatch(class11516::N);
   }
}
