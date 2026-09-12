package Nursultan;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;

public class class11325 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4 = ((Path)class11518.N_0).resolve("presets");

   private static byte[] L(UUID var0) {
      byte[] var1 = new byte[16];
      long var2 = var0.getMostSignificantBits();
      long var4 = var0.getLeastSignificantBits();

      for (int var6 = 0; var6 < 8; var6++) {
         var1[var6] = (byte)((int)(var2 >>> 8 * (7 - var6)));
         var1[8 + var6] = (byte)((int)(var4 >>> 8 * (7 - var6)));
      }

      return var1;
   }

   public Collection<class11290> L() {
      return List.copyOf(((Map)this.N_1).values());
   }

   public class11325() {
      this.U();
      this.N_0 = ((Path)y_4).resolve(String.valueOf(((class11472)class11938.L_2).M()));
      this.N_1 = new LinkedHashMap();
      this.N_2 = new AtomicLong();
   }

   static {
      z();
   }

   private void U() {
   }

   private static void z() {
      y_0 = null;
      y_1 = 50;
      y_2 = 1;
      y_3 = ".preset";
      y_4 = null;
   }

   public void u() {
      if (Files.isDirectory((Path)this.N_0)) {
         try (DirectoryStream<Path> var1 = Files.newDirectoryStream((Path)this.N_0, "*.preset")) {
            for (Path var3 : var1) {
               class11290 var4 = this.N(var3);
               if (var4 != null) {
                  ((Map)this.N_1).put(var4.u(), var4);
               }
            }
         } catch (IOException var7) {
            ((Logger)y_0).error("Failed to enumerate preset directory", var7);
         }
      }
   }

   public int y() {
      return ((Map)this.N_1).size();
   }

   public void y(UUID var1) {
      if (((Map)this.N_1).remove(var1) != null) {
         ((AtomicLong)this.N_2).incrementAndGet();
      }

      Path var2 = ((Path)this.N_0).resolve(var1 + ".preset");

      try {
         Files.deleteIfExists(var2);
      } catch (IOException var4) {
         ((Logger)y_0).error("Failed to delete preset file {}", var1, var4);
      }
   }

   private static UUID N(byte[] var0) {
      long var1 = 0L;
      long var3 = 0L;

      for (int var5 = 0; var5 < 8; var5++) {
         var1 = var1 << 8 | (long)var0[var5] & 255L;
         var3 = var3 << 8 | (long)var0[8 + var5] & 255L;
      }

      return new UUID(var1, var3);
   }

   public Optional<class11290> N(long var1) {
      return var1 <= 0L ? Optional.empty() : ((Map)this.N_1).values().stream().filter(var2 -> var2.Z() == var1).findFirst();
   }

   public void N(class11290 var1) {
      Path var2 = ((Path)this.N_0).resolve(var1.u() + ".preset");
      Path var3 = ((Path)this.N_0).resolve(var1.u() + ".preset." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.N_0);
         class11290 var4 = this.N(var1, var2);
         MessageBufferPacker var6 = MessagePack.newDefaultBufferPacker();

         byte[] var5;
         try {
            this.N(var6, var4);
            var5 = var6.toByteArray();
         } catch (Throwable var20) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var19) {
                  var20.addSuppressed(var19);
               }
            }

            throw var20;
         }

         if (var6 != null) {
            var6.close();
         }

         Files.write(var3, class11498.N(var5), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
         Files.move(var3, var2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
         ((Map)this.N_1).put(var4.u(), var4);
         ((AtomicLong)this.N_2).incrementAndGet();
      } catch (IOException var21) {
         ((Logger)y_0).error("Failed to save preset {}", var1.u(), var21);
      } finally {
         try {
            Files.deleteIfExists(var3);
         } catch (IOException var18) {
         }
      }
   }

   private class11290 N(Path var1) {
      try {
         byte[] var2 = Files.readAllBytes(var1);
         MessageUnpacker var4 = MessagePack.newDefaultUnpacker(class11498.N(var2));

         class11290 var5;
         try {
            var5 = this.N(var4);
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }

         return var5;
      } catch (Exception var9) {
         ((Logger)y_0).warn("Skipped unreadable preset file {}: {}", var1.getFileName(), var9.getMessage());
         return null;
      }
   }

   private void N(MessageBufferPacker var1, class11290 var2) throws IOException {
      var1.packArrayHeader(3);
      var1.packInt(1);
      var1.packArrayHeader(10);
      var1.packBinaryHeader(16);
      var1.writePayload(L(var2.u()));
      var1.packLong(var2.Z());
      var1.packString(var2.i());
      var1.packString(var2.z());
      var1.packLong(var2.B());
      var1.packLong(var2.y());
      var1.packLong(var2.R());
      var1.packString(var2.M().N());
      var1.packInt(var2.L());
      var1.packBoolean(var2.N());
      if (var2.N() && var2.U() != null) {
         var1.packBinaryHeader(var2.U().length);
         var1.writePayload(var2.U());
      } else {
         var1.packBinaryHeader(0);
      }
   }

   public long N() {
      return ((AtomicLong)this.N_2).get();
   }

   private class11290 N(class11290 var1, Path var2) {
      if (!var1.N() && var1.U() == null && Files.exists(var2)) {
         class11290 var3 = this.N(var2);
         if (var3 != null && var3.N() && var3.U() != null) {
            if (!var3.u().equals(var1.u())) {
               return var1;
            } else if (var3.R() != var1.R() && !var3.E()) {
               return var1;
            } else {
               var1.N(var3.L());
               var1.N(var3.U());
               var1.N(true);
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public Optional<class11290> N(UUID var1) {
      return Optional.ofNullable((class11290)((Map)this.N_1).get(var1));
   }

   private class11290 N(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      int var2 = var1.unpackInt();
      if (var2 != 1) {
         ((Logger)y_0).warn("Unknown preset file schema version {}", var2);
         return null;
      } else {
         ArrayValue var4 = var1.unpackValue().asArrayValue();
         UUID var5 = N(var4.get(0).asBinaryValue().asByteArray());
         long var6 = var4.get(1).asIntegerValue().asLong();
         String var8 = var4.get(2).asStringValue().asString();
         String var9 = var4.get(3).asStringValue().asString();
         long var10 = var4.get(4).asIntegerValue().asLong();
         long var12 = var4.get(5).asIntegerValue().asLong();
         long var14 = var4.get(6).asIntegerValue().asLong();
         class11296 var16 = class11296.N(var4.get(7).asStringValue().asString());
         if (var16 == null) {
            return null;
         } else {
            int var17 = var4.get(8).asIntegerValue().asInt();
            boolean var18 = var4.get(9).asBooleanValue().getBoolean();
            byte[] var20 = var1.unpackValue().asBinaryValue().asByteArray();
            if (!var18 || var20.length == 0) {
               var20 = null;
               var18 = false;
            }

            return new class11290(var5, var6, var8, var9, var10, var12, var14, var16, var17, var18, var20);
         }
      }
   }
}
