package ru.metaculture.protection;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Locale;

public final class O0000O0O0O000 {
   private O0000O0O0O000() {
   }

   public static void main(String[] strings) throws Exception {
      if (strings.length < 2) {
         System.out.println("usage: WildSnapDecoder <x25519-private-der-b64-or-file> <snapshot.wildsnap>");
      } else {
         byte[] var1 = O00000000(strings[0]);
         byte[] var2 = Files.readAllBytes(Path.of(strings[1]));
         byte[] var3 = O00000000OOO0.O00000000(var2, var1);

         try (DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3))) {
            int var5 = var4.readInt();
            int var6 = var4.readInt();
            System.out.println("# WildSnap Report");
            System.out.println();
            System.out.println("- magic: 0x" + Integer.toHexString(var5));
            System.out.println("- version: " + var6);

            while (var4.available() > 0) {
               int var7 = Short.toUnsignedInt(var4.readShort());
               int var8 = var4.readInt();
               byte[] var9 = var4.readNBytes(var8);
               O00000000(var7, var9);
            }
         }
      }
   }

   private static byte[] O00000000(String string) throws Exception {
      Path var1 = Path.of(string);
      String var2 = Files.exists(var1) ? Files.readString(var1) : string;
      return Base64.getDecoder().decode(var2.replace("\n", "").replace("\r", "").trim());
   }

   private static void O00000000(int i, byte[] bs) throws Exception {
      try (DataInputStream var2 = new DataInputStream(new ByteArrayInputStream(bs))) {
         switch (i) {
            case 1:
               O00000000(var2);
               break;
            case 2:
               O000000000(var2);
               break;
            case 3:
               O0000000000(var2);
               break;
            case 4:
               O00000000000(var2);
               break;
            case 5:
               O000000000000(var2);
               break;
            case 6:
               O0000000000000(var2);
               break;
            case 7:
               O000000000000O(var2);
               break;
            default:
               System.out.println("- record[" + i + "]: " + O00000000(bs, Math.min(bs.length, 96)));
         }
      }
   }

   private static void O00000000(DataInputStream dataInputStream) throws Exception {
      System.out.println();
      System.out.println("## Build");
      System.out.println("- id: " + dataInputStream.readUTF());
      System.out.println("- version: " + dataInputStream.readUTF());
      System.out.println("- channel: " + dataInputStream.readUTF());
   }

   private static void O000000000(DataInputStream dataInputStream) throws Exception {
      int var1 = dataInputStream.readInt();
      int var2 = dataInputStream.readInt();
      int var3 = dataInputStream.readInt();
      long var4 = dataInputStream.readLong();
      long var6 = dataInputStream.readLong();
      int var8 = dataInputStream.readInt();
      System.out.println();
      System.out.println("## Core");
      System.out.println("- tracker: " + O00000000(var1));
      System.out.println("- code: " + O00000000OO0O.O00000000(var2));
      System.out.println("- detail: 0x" + Integer.toHexString(var3));
      System.out.println("- cfi: 0x" + Long.toUnsignedString(var4, 16));
      System.out.println("- frame: " + var6);
      System.out.println("- anomalyTotal: " + var8);
   }

   private static void O0000000000(DataInputStream dataInputStream) throws Exception {
      int var1 = dataInputStream.readInt();
      int var2 = dataInputStream.readInt();
      int var3 = dataInputStream.readInt();
      int var4 = dataInputStream.readInt();
      System.out.println();
      System.out.println("## GL");
      System.out.println("- currentProgram: " + var1);
      System.out.println("- activeTexture: " + var2);
      System.out.println("- texture2D: " + var3);
      System.out.println("- error: " + O00000000OO0.O00000000(var4));
   }

   private static void O00000000000(DataInputStream dataInputStream) throws Exception {
      long var1 = dataInputStream.readLong();
      boolean var3 = dataInputStream.readBoolean();
      System.out.println();
      System.out.println("## Matrix");
      System.out.println("- hash: 0x" + Long.toUnsignedString(var1, 16));
      System.out.println("- finite: " + var3);
      System.out.print("- modelView: [");

      for (int var4 = 0; var4 < 16; var4++) {
         if (var4 > 0) {
            System.out.print(", ");
         }

         System.out.print(dataInputStream.readFloat());
      }

      System.out.println("]");
   }

   private static void O000000000000(DataInputStream dataInputStream) throws Exception {
      int var1 = dataInputStream.readInt();
      System.out.println();
      System.out.println("## Anomalies");
      System.out.println("- count: " + var1);

      for (int var2 = 0; var2 < var1; var2++) {
         long var3 = dataInputStream.readLong();
         int var5 = dataInputStream.readInt();
         int var6 = dataInputStream.readInt();
         int var7 = dataInputStream.readInt();
         long var8 = dataInputStream.readLong();
         System.out
            .println(
               "- "
                  + O00000000(var5)
                  + " code="
                  + O00000000OO0O.O00000000(var6)
                  + " detail=0x"
                  + Integer.toHexString(var7)
                  + " nanos="
                  + var3
                  + " cfi=0x"
                  + Long.toUnsignedString(var8, 16)
            );
      }
   }

   private static void O0000000000000(DataInputStream dataInputStream) throws Exception {
      System.out.println();
      System.out.println("## Environment");
      System.out.println("- os.name: " + dataInputStream.readUTF());
      System.out.println("- os.arch: " + dataInputStream.readUTF());
      System.out.println("- java.version: " + dataInputStream.readUTF());
      System.out.println("- java.vm.name: " + dataInputStream.readUTF());
   }

   private static void O000000000000O(DataInputStream dataInputStream) throws Exception {
      System.out.println();
      System.out.println("## Mixin Audit");
      System.out.println("- policy: " + dataInputStream.readUTF());
      System.out.println("- locals: " + dataInputStream.readUTF());
   }

   private static String O00000000(int i) {
      String var1 = Integer.toUnsignedString(i, 16).toUpperCase(Locale.ROOT);
      return var1.length() >= 8 ? "WS-" + var1.substring(var1.length() - 8) : "WS-" + "00000000".substring(var1.length()) + var1;
   }

   private static String O00000000(byte[] bs, int i) {
      StringBuilder var2 = new StringBuilder(i * 2);

      for (int var3 = 0; var3 < i; var3++) {
         int var4 = bs[var3] & 255;
         if (var4 < 16) {
            var2.append('0');
         }

         var2.append(Integer.toHexString(var4));
      }

      return var2.toString();
   }
}
