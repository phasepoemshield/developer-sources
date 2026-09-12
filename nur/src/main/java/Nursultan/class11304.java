package Nursultan;

import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public class class11304 {
   private void L(MessageUnpacker var1) throws IOException {
      int var2 = var1.unpackArrayHeader();

      for (int var3 = 0; var3 < var2; var3++) {
         this.N(var1);
      }
   }

   static {
      N();
   }

   private void u() {
      for (class11067 var2 : class11938.u().NN()) {
         var2.N(false);
         var2.N(class12002.UNKNOWN, 0, class09045.TOGGLE, true);

         for (class11536<?> var4 : var2.w().values()) {
            this.N(var4);
         }
      }
   }

   private void y(MessageUnpacker var1) throws IOException {
      int var2 = var1.unpackArrayHeader();

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.unpackArrayHeader();
         String var5 = var1.unpackString();
         String var6 = var1.unpackString();
         boolean var7 = var1.unpackBoolean();
         int var8 = var1.unpackInt();
         var1.unpackValue();
         int var9 = var4 >= 6 ? var1.unpackInt() : 0;
         class11938.b().N(var5).ifPresent(var4x -> var4x.N(class12002.y(var8), var9, class09045.N(var6), var7));
      }
   }

   private void N(class11536<?> var1) {
      var1.s();

      for (class11536<?> var3 : var1.w().values()) {
         this.N(var3);
      }
   }

   private void N(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      String var2 = var1.unpackString();
      boolean var3 = var1.unpackBoolean();
      var1.unpackValue();
      ImmutableValue var4 = var1.unpackValue();
      class11938.u().N(var2).ifPresent(var3x -> {
         try {
            if (var3) {
               var3x.N(true);
            }
         } catch (Exception var5) {
         }

         if (!var4.isNilValue()) {
            this.N(var3x, var4.asArrayValue());
         }
      });
   }

   public void N(byte[] var1) throws IllegalStateException {
      if (var1 != null && var1.length != 0) {
         byte[] var2 = class11509.N(var1);
         this.u();

         try {
            MessageUnpacker var3 = MessagePack.newDefaultUnpacker(var2);

            try {
               int var4 = var3.unpackArrayHeader();
               var3.unpackInt();
               this.L(var3);
               if (var4 >= 3) {
                  this.y(var3);
               }
            } catch (Throwable var7) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var6) {
                     var7.addSuppressed(var6);
                  }
               }

               throw var7;
            }

            if (var3 != null) {
               var3.close();
            }
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to deserialize preset (v1)", var8);
         }
      }
   }

   private void N(class11512 var1, ArrayValue var2) {
      Iterator<Value> var3 = var2.iterator();

      while (var3.hasNext()) {
         ArrayValue var5 = var3.next().asArrayValue();
         String var6 = var5.get(0).asStringValue().asString();
         Value var7 = var5.get(1);
         Value var8 = var5.get(2);
         this.N(var1, var6).ifPresent(var3x -> {
            try {
               class11530.N((class11536<?>)var3x, var7);
            } catch (Exception var5x) {
            }

            if (!var8.isNilValue()) {
               this.N(var3x, var8.asArrayValue());
            }
         });
      }
   }

   private static void N() {
   }

   private Optional<class11536<?>> N(class11512 var1, String var2) {
      for (class11536<?> var4 : var1.w().values()) {
         if (var4.P().N().equals(var2)) {
            return Optional.of(var4);
         }

         Optional<class11536<?>> var5 = this.N(var4, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
