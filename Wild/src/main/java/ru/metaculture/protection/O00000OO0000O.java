package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class O00000OO0000O {
   private static final Gson O00000000 = new GsonBuilder().setPrettyPrinting().create();
   private static final O00000OO0000O O000000000 = new O00000OO0000O();
   private final List<O00000OO0000O.W210> O0000000000 = new ArrayList<>();
   private boolean O00000000000;

   private O00000OO0000O() {
   }

   public static O00000OO0000O O00000000() {
      return O000000000;
   }

   public synchronized List<O00000OO0000O.W210> O000000000() {
      this.O0000000000();
      return List.copyOf(this.O0000000000);
   }

   public synchronized O00000OO0000O.W210 O00000000(String string, O000000OO00 o000000OO00) {
      this.O0000000000();
      String var3 = O00000000000(string);
      if (!var3.isEmpty() && o000000OO00 != null) {
         long var4 = System.currentTimeMillis();
         O00000OO0000O.W210 var6 = new O00000OO0000O.W210(UUID.randomUUID().toString(), var3, o000000OO00.O000000000000(), var4, var4);
         this.O0000000000.add(0, var6);
         this.O00000000000();
         return var6;
      } else {
         return null;
      }
   }

   public synchronized O00000OO0000O.W210 O00000000(String string, String string2, O000000OO00 o000000OO00) {
      this.O0000000000();
      String var4 = O00000000000(string2);
      if (string != null && !var4.isEmpty() && o000000OO00 != null) {
         for (int var5 = 0; var5 < this.O0000000000.size(); var5++) {
            O00000OO0000O.W210 var6 = this.O0000000000.get(var5);
            if (var6.id().equals(string)) {
               O00000OO0000O.W210 var7 = new O00000OO0000O.W210(var6.id(), var4, o000000OO00.O000000000000(), var6.createdAt(), System.currentTimeMillis());
               this.O0000000000.set(var5, var7);
               this.O000000000000();
               this.O00000000000();
               return var7;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public synchronized boolean O00000000(String string) {
      O00000OO0000O.W210 var2 = this.O0000000000(string);
      return var2 != null && O000000OO00.O000000000(var2.key());
   }

   public synchronized boolean O000000000(String string) {
      this.O0000000000();
      boolean var2 = this.O0000000000.removeIf(o00000000 -> o00000000.id().equals(string));
      if (var2) {
         this.O00000000000();
      }

      return var2;
   }

   public synchronized O00000OO0000O.W210 O0000000000(String string) {
      this.O0000000000();
      if (string == null) {
         return null;
      } else {
         for (O00000OO0000O.W210 var3 : this.O0000000000) {
            if (var3.id().equals(string)) {
               return var3;
            }
         }

         return null;
      }
   }

   private void O0000000000() {
      if (!this.O00000000000) {
         File var1 = O0000000000000();
         if (var1 != null) {
            this.O00000000000 = true;
            if (var1.isFile()) {
               try {
                  String var2 = Files.readString(var1.toPath(), StandardCharsets.UTF_8);
                  O00000OO0000O.W211 var3 = (O00000OO0000O.W211)O00000000.fromJson(var2, O00000OO0000O.W211.class);
                  if (var3 == null || var3.presets == null) {
                     return;
                  }

                  for (O00000OO0000O.W210 var5 : var3.presets) {
                     O00000OO0000O.W210 var6 = O00000000(var5);
                     if (var6 != null && this.O0000000000.stream().noneMatch(o000000002 -> o000000002.id().equals(var6.id()))) {
                        this.O0000000000.add(var6);
                     }
                  }

                  this.O000000000000();
               } catch (Throwable var7) {
               }
            }
         }
      }
   }

   private void O00000000000() {
      File var1 = O0000000000000();
      if (var1 != null) {
         try {
            File var2 = var1.getParentFile();
            if (var2 != null) {
               Files.createDirectories(var2.toPath());
            }

            Files.writeString(var1.toPath(), O00000000.toJson(new O00000OO0000O.W211(1, this.O0000000000)), StandardCharsets.UTF_8);
         } catch (Throwable var3) {
         }
      }
   }

   private void O000000000000() {
      this.O0000000000.sort(Comparator.comparingLong(O00000OO0000O.W210::updatedAt).reversed());
   }

   private static O00000OO0000O.W210 O00000000(O00000OO0000O.W210 o00000000) {
      if (o00000000 != null && o00000000.key() != null && !o00000000.key().isBlank()) {
         String var1 = O00000000000(o00000000.name());
         if (var1.isEmpty()) {
            return null;
         } else {
            String var2 = o00000000.id() != null && !o00000000.id().isBlank() ? o00000000.id() : UUID.randomUUID().toString();
            long var3 = Math.max(0L, o00000000.createdAt());
            long var5 = Math.max(var3, o00000000.updatedAt());
            return new O00000OO0000O.W210(var2, var1, o00000000.key().trim(), var3, var5);
         }
      } else {
         return null;
      }
   }

   private static String O00000000000(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.replaceAll("\\p{Cntrl}", "").trim().replaceAll("\\s{2,}", " ");
         return var1.length() > 40 ? var1.substring(0, 40).trim() : var1;
      }
   }

   private static File O0000000000000() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? new File(WildClient.O00000000.O0000000000000, "custom-rotation-presets.json")
         : null;
   }

   public record W210(String id, String name, String key, long createdAt, long updatedAt) {
   }

   record W211(int version, List<O00000OO0000O.W210> presets) {
   }
}
