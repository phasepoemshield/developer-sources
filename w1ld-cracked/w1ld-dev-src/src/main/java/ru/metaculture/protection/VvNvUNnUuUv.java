package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class VvNvUNnUuUv {
   private static final int UuUVuuUu = 1;
   private static final int C00OOC00oO = 256;
   private static final long uUnuvNvvNU = 350L;
   private static final Pattern vVvUvVVuuNvV = Pattern.compile("[A-Za-z0-9_]{1,16}");
   private static final Gson uNNnnnuuuN = new GsonBuilder().setPrettyPrinting().create();
   private static final Object nuUnNvnuUu = new Object();
   private static final Object VVuuUN = new Object();
   private static final ScheduledExecutorService vNUvnnVnUvu = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-Bot-Profiles");
      var1.setDaemon(true);
      return var1;
   });
   private static ScheduledFuture<?> uVUuuVnNVU;
   private static boolean vuuuNvNuv;
   private static boolean nvUVNnuu;
   private static boolean UuuNnUvUuv;

   private VvNvUNnUuUv() {
   }

   public static void UuUVuuUu() {
      Path var0 = nuUnNvnuUu();
      boolean var1 = Files.isRegularFile(var0) || Files.isRegularFile(C00OOC00oO(var0));
      List var2 = UuUVuuUu(var0);
      boolean var3 = false;
      if (var2 == null) {
         var2 = UuUVuuUu(C00OOC00oO(var0));
         var3 = var2 != null;
      }

      if (var2 == null) {
         synchronized (nuUnNvnuUu) {
            UuuNnUvUuv = !var1;
         }
      } else {
         synchronized (nuUnNvnuUu) {
            UuuNnUvUuv = true;
         }

         for (VvNvUNnUuUv.NVnVnNnN var5 : var2) {
            nnVNNuuVUVn.UuUVuuUu(var5.nickname(), var5.address());
         }

         if (var3) {
            C00OOC00oO();
         }
      }
   }

   public static void C00OOC00oO() {
      synchronized (nuUnNvnuUu) {
         if (!nvUVNnuu) {
            UuuNnUvUuv = true;
            vuuuNvNuv = true;
            if (uVUuuVnNVU != null) {
               uVUuuVnNVU.cancel(false);
            }

            uVUuuVnNVU = vNUvnnVnUvu.schedule(VvNvUNnUuUv::vVvUvVVuuNvV, 350L, TimeUnit.MILLISECONDS);
         }
      }
   }

   public static void uUnuvNvvNU() {
      boolean var0;
      synchronized (nuUnNvnuUu) {
         if (nvUVNnuu) {
            return;
         }

         nvUVNnuu = true;
         var0 = UuuNnUvUuv;
         vuuuNvNuv = false;
         if (uVUuuVnNVU != null) {
            uVUuuVnNVU.cancel(false);
            uVUuuVnNVU = null;
         }
      }

      if (var0) {
         uNNnnnuuuN();
      }

      vNUvnnVnUvu.shutdown();

      try {
         vNUvnnVnUvu.awaitTermination(1L, TimeUnit.SECONDS);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
      }
   }

   private static void vVvUvVVuuNvV() {
      synchronized (nuUnNvnuUu) {
         if (nvUVNnuu || !vuuuNvNuv) {
            uVUuuVnNVU = null;
            return;
         }

         vuuuNvNuv = false;
         uVUuuVnNVU = null;
      }

      boolean var5 = uNNnnnuuuN();
      synchronized (nuUnNvnuUu) {
         if (!var5) {
            vuuuNvNuv = true;
         }

         if (!nvUVNnuu && vuuuNvNuv && uVUuuVnNVU == null) {
            uVUuuVnNVU = vNUvnnVnUvu.schedule(VvNvUNnUuUv::vVvUvVVuuNvV, 350L, TimeUnit.MILLISECONDS);
         }
      }
   }

   private static boolean uNNnnnuuuN() {
      synchronized (VVuuUN) {
         JsonObject var1 = new JsonObject();
         var1.addProperty("format", "wild-bot-profiles");
         var1.addProperty("version", 1);
         JsonArray var2 = new JsonArray();

         for (nnVNNuuVUVn.NVnVnNnN var4 : nnVNNuuVUVn.C00OOC00oO()) {
            if (var4.name() != null && var4.address() != null && !var4.address().isBlank()) {
               JsonObject var5 = new JsonObject();
               var5.addProperty("nickname", var4.name());
               var5.addProperty("address", var4.address());
               var2.add(var5);
            }
         }

         var1.add("profiles", var2);

         boolean var10000;
         try {
            UuUVuuUu(nuUnNvnuUu(), uNNnnnuuuN.toJson(var1).getBytes(StandardCharsets.UTF_8));
            var10000 = true;
         } catch (Throwable var7) {
            System.out.println("[BotProfiles] Save failed: " + var7.getMessage());
            return false;
         }

         return var10000;
      }
   }

   private static List<VvNvUNnUuUv.NVnVnNnN> UuUVuuUu(Path var0) {
      if (var0 != null && Files.isRegularFile(var0)) {
         try {
            ArrayList var5;
            try (BufferedReader var1 = Files.newBufferedReader(var0, StandardCharsets.UTF_8)) {
               JsonElement var2 = JsonParser.parseReader(var1);
               if (!var2.isJsonObject()) {
                  return null;
               }

               JsonObject var3 = var2.getAsJsonObject();
               JsonElement var4 = var3.get("profiles");
               if (var4 != null && var4.isJsonArray()) {
                  var5 = new ArrayList();
                  HashSet var6 = new HashSet();

                  for (JsonElement var8 : var4.getAsJsonArray()) {
                     if (var5.size() < 256 && var8.isJsonObject()) {
                        JsonObject var9 = var8.getAsJsonObject();
                        String var10 = UuUVuuUu(var9, "nickname").trim();
                        String var11 = UuUVuuUu(var9, "address").trim();
                        String var12 = var10.toLowerCase(Locale.ROOT);
                        if (vVvUvVVuuNvV.matcher(var10).matches() && !var11.isEmpty() && var11.length() <= 255 && var6.add(var12)) {
                           var5.add(new VvNvUNnUuUv.NVnVnNnN(var10, var11));
                        }
                     }
                  }

                  return List.copyOf(var5);
               }

               var5 = null;
            }

            return var5;
         } catch (Throwable var15) {
            System.out.println("[BotProfiles] Load failed for " + var0.getFileName() + ": " + var15.getMessage());
            return null;
         }
      } else {
         return null;
      }
   }

   private static String UuUVuuUu(JsonObject var0, String var1) {
      try {
         JsonElement var2 = var0.get(var1);
         return var2 != null && !var2.isJsonNull() ? var2.getAsString() : "";
      } catch (Throwable var3) {
         return "";
      }
   }

   private static Path nuUnNvnuUu() {
      File var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu
         : ru.metaculture.protection.NVnVnNnN.C00OOC00oO();
      return new File(var0, "bots.json").toPath();
   }

   private static Path C00OOC00oO(Path var0) {
      return var0.resolveSibling(var0.getFileName() + ".bak");
   }

   private static void UuUVuuUu(Path var0, byte[] var1) throws Exception {
      Path var2 = var0.getParent();
      if (var2 != null) {
         Files.createDirectories(var2);
      }

      Path var3 = var0.resolveSibling(var0.getFileName() + ".tmp");

      try (FileChannel var4 = FileChannel.open(var3, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)) {
         ByteBuffer var5 = ByteBuffer.wrap(var1);

         while (var5.hasRemaining()) {
            var4.write(var5);
         }

         var4.force(true);
      }

      try {
         Files.move(var3, var0, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var9) {
         Files.move(var3, var0, StandardCopyOption.REPLACE_EXISTING);
      }

      try {
         Files.copy(var0, C00OOC00oO(var0), StandardCopyOption.REPLACE_EXISTING);
      } catch (Throwable var8) {
      }
   }

   record NVnVnNnN(String nickname, String address) {
   }
}
