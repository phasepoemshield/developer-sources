package ru.metaculture.protection;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

final class O00000000OOO00 {
   private static final DateTimeFormatter O00000000 = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

   Path O00000000(O00000000OO0OO o00000000OO0OO, int i, int j, int k) throws Exception {
      ByteArrayOutputStream var5 = new ByteArrayOutputStream(2048);

      try (DataOutputStream var6 = new DataOutputStream(var5)) {
         var6.writeInt(1465077328);
         var6.writeInt(1);
         this.O00000000(var6);
         this.O00000000(var6, o00000000OO0OO, i, j, k);
         this.O000000000(var6);
         this.O0000000000(var6);
         this.O00000000(var6, o00000000OO0OO);
         this.O00000000000(var6);
         this.O000000000000(var6);
      }

      byte[] var11 = O00000000OOO0.O00000000(var5.toByteArray());
      Path var7 = this.O00000000();
      Path var8 = var7.resolve(o00000000OO0OO.O00000000(i) + "-" + O00000000.format(LocalDateTime.now()) + ".wildsnap");
      Files.write(var8, var11, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
      return var8;
   }

   Path O00000000() throws Exception {
      Path var1 = Path.of(System.getProperty("user.dir", "."), "wild", "debug", "snapshots");
      Files.createDirectories(var1);
      return var1;
   }

   private void O00000000(DataOutputStream dataOutputStream) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(256);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF("wild-1.21.8-1783538716222");
         var3.writeUTF("1.21.8");
         var3.writeUTF("stable");
      }

      O00000000(dataOutputStream, 1, var2.toByteArray());
   }

   private void O00000000(DataOutputStream dataOutputStream, O00000000OO0OO o00000000OO0OO, int i, int j, int k) throws Exception {
      ByteArrayOutputStream var6 = new ByteArrayOutputStream(128);

      try (DataOutputStream var7 = new DataOutputStream(var6)) {
         var7.writeInt(i);
         var7.writeInt(j);
         var7.writeInt(k);
         var7.writeLong(o00000000OO0OO.O000000000O());
         var7.writeLong(o00000000OO0OO.O000000000O0());
         var7.writeInt(o00000000OO0OO.O000000000O00());
      }

      O00000000(dataOutputStream, 2, var6.toByteArray());
   }

   private void O000000000(DataOutputStream dataOutputStream) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(64);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         O00000000OO0.O00000000(var3);
      }

      O00000000(dataOutputStream, 3, var2.toByteArray());
   }

   private void O0000000000(DataOutputStream dataOutputStream) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(96);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         O00000000OO00.O00000000(var3);
      }

      O00000000(dataOutputStream, 4, var2.toByteArray());
   }

   private void O00000000(DataOutputStream dataOutputStream, O00000000OO0OO o00000000OO0OO) throws Exception {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream(1024);

      try (DataOutputStream var4 = new DataOutputStream(var3)) {
         o00000000OO0OO.O00000000(var4);
      }

      O00000000(dataOutputStream, 5, var3.toByteArray());
   }

   private void O00000000000(DataOutputStream dataOutputStream) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(256);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF(O00000000("os.name"));
         var3.writeUTF(O00000000("os.arch"));
         var3.writeUTF(O00000000("java.version"));
         var3.writeUTF(O00000000("java.vm.name"));
      }

      O00000000(dataOutputStream, 6, var2.toByteArray());
   }

   private void O000000000000(DataOutputStream dataOutputStream) throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(128);

      try (DataOutputStream var3 = new DataOutputStream(var2)) {
         var3.writeUTF("inject-only-runtime");
         var3.writeUTF("no-lvt-runtime");
      }

      O00000000(dataOutputStream, 7, var2.toByteArray());
   }

   private static String O00000000(String string) {
      String var1 = System.getProperty(string, "unknown");
      return var1 != null && !var1.isBlank() ? var1.replace('\n', ' ').replace('\r', ' ').trim() : "unknown";
   }

   private static void O00000000(DataOutputStream dataOutputStream, int i, byte[] bs) throws Exception {
      dataOutputStream.writeShort(i);
      dataOutputStream.writeInt(bs.length);
      dataOutputStream.write(bs);
   }
}
