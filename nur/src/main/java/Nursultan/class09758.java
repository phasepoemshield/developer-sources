package Nursultan;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class class09758 {
   private static final int N = 1095123249;
   private static final int y = 2;

   private class09758() {
   }

   static void N(Path var0, long var1, class09734 var3, class09752 var4, class09726 var5) throws IOException {
      int var6 = var3.y().N();

      try (DataOutputStream var7 = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(var0)))) {
         var7.writeInt(1095123249);
         var7.writeInt(2);
         var7.writeLong(var1);
         var7.writeInt(var3.y().ordinal());
         var7.writeDouble(var3.L());
         var7.writeDouble(var3.u());
         var7.writeDouble(var3.M());
         var7.writeInt(var6);
         int var8 = var4.N();
         var7.writeInt(var8);
         byte[] var9 = null;

         for (int var10 = 0; var10 < var8; var10++) {
            var7.writeInt(var4.u(var10));
            var7.writeFloat(var4.i(var10));
            var7.writeFloat(var4.R(var10));
            var7.writeFloat(var4.M(var10));
            var7.writeFloat(var4.B(var10));
            var7.writeFloat(var4.Z(var10));
            int var11 = var4.E(var10);
            int var12 = var4.W(var10);
            var7.writeInt(var11);
            var7.writeInt(var12);
            if (var11 > 0 && var12 > 0) {
               int var13 = var11 * var12 * var6;
               if (var9 == null || var9.length < var13) {
                  var9 = new byte[var13];
               }

               var5.N(var4.z(var10), var4.U(var10), var11, var12, var9);
               var7.write(var9, 0, var13);
            }
         }
      }
   }

   static class09746 N(Path var0) {
      if (var0 != null && Files.isReadable(var0)) {
         try {
            class09746 var29;
            try (DataInputStream var1 = new DataInputStream(new BufferedInputStream(Files.newInputStream(var0)))) {
               if (var1.readInt() != 1095123249 || var1.readInt() != 2) {
                  return null;
               }

               long var2 = var1.readLong();
               int var4 = var1.readInt();
               double var5 = var1.readDouble();
               double var7 = var1.readDouble();
               double var9 = var1.readDouble();
               int var11 = var1.readInt();
               int var12 = var1.readInt();
               if (var12 < 0) {
                  return null;
               }

               int[] var13 = new int[var12];
               class09761[] var14 = new class09761[var12];

               for (int var15 = 0; var15 < var12; var15++) {
                  var13[var15] = var1.readInt();
                  float var16 = var1.readFloat();
                  float var17 = var1.readFloat();
                  float var18 = var1.readFloat();
                  float var19 = var1.readFloat();
                  float var20 = var1.readFloat();
                  int var21 = var1.readInt();
                  int var22 = var1.readInt();
                  byte[] var23;
                  if (var21 > 0 && var22 > 0) {
                     var23 = new byte[var21 * var22 * var11];
                     var1.readFully(var23);
                  } else {
                     var23 = new byte[0];
                  }

                  var14[var15] = new class09761(var23, var21, var22, var11, (double)var16, (double)var17, (double)var18, (double)var19, (double)var20);
               }

               var29 = new class09746(var2, var4, var5, var7, var9, var11, var13, var14);
            }

            return var29;
         } catch (IOException var26) {
            System.err.println("[FontAtlas] ignoring unreadable atlas cache " + var0 + ": " + var26);
            return null;
         }
      } else {
         return null;
      }
   }
}
