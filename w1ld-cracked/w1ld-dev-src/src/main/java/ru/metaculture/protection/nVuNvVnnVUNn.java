package ru.metaculture.protection;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

final class nVuNvVnnVUNn {
   private static final DateTimeFormatter UuUVuuUu = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

   Path UuUVuuUu(vVnvuVuVvnun var1, int var2, int var3, int var4) throws Exception {
      ByteArrayOutputStream var5 = new ByteArrayOutputStream(2048);

      try (DataOutputStream var6 = new DataOutputStream(var5)) {
         var6.writeInt(1465077328);
         var6.writeInt(1);
         this.UuUVuuUu(var6);
         this.UuUVuuUu(var6, var1, var2, var3, var4);
         this.C00OOC00oO(var6);
         this.uUnuvNvvNU(var6);
         this.UuUVuuUu(var6, var1);
         this.vVvUvVVuuNvV(var6);
         this.uNNnnnuuuN(var6);
      }

      byte[] var11 = NvvuunnVUV.UuUVuuUu(var5.toByteArray());
      Path var7 = this.UuUVuuUu();
      Path var8 = var7.resolve(var1.UuUVuuUu(var2) + "-" + UuUVuuUu.format(LocalDateTime.now()) + ".wildsnap");
      Files.write(var8, var11, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
      return var8;
   }

   Path UuUVuuUu() throws Exception {
      Path var1 = Path.of(System.getProperty("user.dir", "."), "wild", "debug", "snapshots");
      Files.createDirectories(var1);
      return var1;
   }

   private void UuUVuuUu(DataOutputStream var1) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(256);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF("wild-1.21.8-1787661348375");
         var3.writeUTF("1.21.8");
         var3.writeUTF("stable");
      }

      UuUVuuUu(var1, 1, var2.toByteArray());
   }

   private void UuUVuuUu(DataOutputStream var1, vVnvuVuVvnun var2, int var3, int var4, int var5) throws Exception {
      ByteArrayOutputStream var6 = new ByteArrayOutputStream(128);

      try (DataOutputStream var7 = new DataOutputStream(var6)) {
         var7.writeInt(var3);
         var7.writeInt(var4);
         var7.writeInt(var5);
         var7.writeLong(var2.NVNnnvnuunNv());
         var7.writeLong(var2.uVunuUNVVUUV());
         var7.writeInt(var2.UNnVVNvvnVvU());
      }

      UuUVuuUu(var1, 2, var6.toByteArray());
   }

   private void C00OOC00oO(DataOutputStream var1) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(64);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         UVUuvNVUuVvN.UuUVuuUu(var3);
      }

      UuUVuuUu(var1, 3, var2.toByteArray());
   }

   private void uUnuvNvvNU(DataOutputStream var1) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(96);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         VNNUUvuV.UuUVuuUu(var3);
      }

      UuUVuuUu(var1, 4, var2.toByteArray());
   }

   private void UuUVuuUu(DataOutputStream var1, vVnvuVuVvnun var2) throws Exception {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream(1024);

      try (DataOutputStream var4 = new DataOutputStream(var3)) {
         var2.UuUVuuUu(var4);
      }

      UuUVuuUu(var1, 5, var3.toByteArray());
   }

   private void vVvUvVVuuNvV(DataOutputStream var1) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(256);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF(UuUVuuUu("os.name"));
         var3.writeUTF(UuUVuuUu("os.arch"));
         var3.writeUTF(UuUVuuUu("java.version"));
         var3.writeUTF(UuUVuuUu("java.vm.name"));
      }

      UuUVuuUu(var1, 6, var2.toByteArray());
   }

   private void uNNnnnuuuN(DataOutputStream var1) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(128);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF("inject-only-runtime");
         var3.writeUTF("no-lvt-runtime");
      }

      UuUVuuUu(var1, 7, var2.toByteArray());
   }

   private static String UuUVuuUu(String var0) {
      String var1 = System.getProperty(var0, "unknown");
      return var1 != null && !var1.isBlank() ? var1.replace('\n', ' ').replace('\r', ' ').trim() : "unknown";
   }

   private static void UuUVuuUu(DataOutputStream var0, int var1, byte[] var2) throws Exception {
      var0.writeShort(var1);
      var0.writeInt(var2.length);
      var0.write(var2);
   }
}
