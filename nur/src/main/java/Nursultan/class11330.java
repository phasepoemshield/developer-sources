package Nursultan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11330 {
   private static String[] u;
   public static Object N_0;

   private byte[] L(Iterable<class11067> var1) throws IOException {
      ArrayList var2 = new ArrayList();

      for (class11067 var4 : var1) {
         if (this.N(var4)) {
            var2.add(var4);
         }
      }

      List<class09173> var3 = this.y(var1);
      MessageBufferPacker var10 = MessagePack.newDefaultBufferPacker();

      byte[] var12;
      try {
         var10.packArrayHeader(3);
         var10.packInt(1);
         var10.packArrayHeader(var2.size());

         for (class11067 var6 : var2) {
            this.N(var10, var6);
         }

         var10.packArrayHeader(var3.size());

         for (class09173 var13 : var3) {
            this.N(var10, var13);
         }

         var12 = var10.toByteArray();
      } catch (Throwable var8) {
         if (var10 != null) {
            try {
               var10.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var10 != null) {
         var10.close();
      }

      return var12;
   }

   static {
      N();
      y();
      u();
   }

   private static void u() {
      N_0 = 1;
   }

   private static void y() {
      u = new String[1];
      u[0] = "Failed to serialize preset (v1)";
   }

   private List<class09173> y(Iterable<class11067> var1) {
      ArrayList var2 = new ArrayList();

      for (class11067 var4 : var1) {
         this.N(var2, var4.R());
         this.N(var4, var2);
      }

      return var2;
   }

   private void N(class11512 var1, List<class09173> var2) {
      for (class11536<?> var4 : var1.w().values()) {
         this.N(var4, var2);
      }
   }

   private void N(MessageBufferPacker var1, class11536<?> var2) throws IOException {
      List<class11536<?>> var3 = var2.w().values().stream().filter(this::N).toList();
      var1.packArrayHeader(3);
      var1.packString(var2.P().N());
      class11530.N(var1, var2);
      if (var3.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(var3.size());

         for (class11536<?> var5 : var3) {
            this.N(var1, var5);
         }
      }
   }

   private boolean N(class11067 var1) {
      if (var1.U()) {
         return true;
      } else {
         for (class11536<?> var3 : var1.w().values()) {
            if (this.N(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   private void N(MessageBufferPacker var1, class11067 var2) throws IOException {
      List<class11536<?>> var3 = var2.w().values().stream().filter(this::N).toList();
      var1.packArrayHeader(4);
      var1.packString(var2.N());
      var1.packBoolean(var2.U());
      var1.packNil();
      if (var3.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(var3.size());

         for (class11536<?> var5 : var3) {
            this.N(var1, var5);
         }
      }
   }

   private static void N() {
   }

   private void N(List<class09173> var1, class09173 var2) {
      if (!var2.B()) {
         var1.add(var2);
      }
   }

   private boolean N(class11536<?> var1) {
      if (var1.N()) {
         return false;
      } else if (var1.c_()) {
         return true;
      } else {
         for (class11536<?> var3 : var1.w().values()) {
            if (this.N(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   private void N(MessageBufferPacker var1, class09173 var2) throws IOException {
      var1.packArrayHeader(6);
      var1.packString(var2.L());
      var1.packString(var2.i().N());
      var1.packBoolean(var2.N());
      var1.packInt(var2.y().L());
      if (var2.R() == null) {
         var1.packNil();
      } else {
         var1.packString(var2.R());
      }

      var1.packInt(var2.Z());
   }

   public byte[] N(Iterable<class11067> var1) {
      try {
         byte[] var2 = this.L(var1);
         return class11509.y(var2);
      } catch (IOException var3) {
         throw new IllegalStateException(u[0], var3);
      }
   }
}
