package ru.metaculture.protection;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class O00000OOOOO {
   private static final O00000OOOOO O00000000 = new O00000OOOOO();
   private static final int O000000000 = 8;
   private final LinkedHashSet<String> O0000000000 = new LinkedHashSet<>();
   private final ArrayList<String> O00000000000 = new ArrayList<>();
   private boolean O000000000000;

   private O00000OOOOO() {
   }

   public static O00000OOOOO O00000000() {
      return O00000000;
   }

   public synchronized Set<String> O000000000() {
      this.O000000000000();
      return new LinkedHashSet<>(this.O0000000000);
   }

   public synchronized List<String> O0000000000() {
      this.O000000000000();
      return new ArrayList<>(this.O00000000000);
   }

   public synchronized boolean O00000000(String string) {
      this.O000000000000();
      return string != null && this.O0000000000.contains(string);
   }

   public synchronized void O000000000(String string) {
      if (string != null && !string.isBlank()) {
         this.O000000000000();
         if (!this.O0000000000.remove(string)) {
            this.O0000000000.add(string);
         }

         this.O0000000000000();
      }
   }

   public synchronized void O0000000000(String string) {
      if (string != null && !string.isBlank()) {
         this.O000000000000();
         this.O00000000000.remove(string);
         this.O00000000000.add(0, string);

         while (this.O00000000000.size() > 8) {
            this.O00000000000.remove(this.O00000000000.size() - 1);
         }

         this.O0000000000000();
      }
   }

   private File O00000000000() {
      return new File(O00000OOOOO000.O00000000().O00000000000(), "library.json");
   }

   private void O000000000000() {
      if (!this.O000000000000) {
         this.O000000000000 = true;

         try {
            File var1 = this.O00000000000();
            if (!var1.isFile()) {
               return;
            }

            JSONObject var2 = new JSONObject(new String(Files.readAllBytes(var1.toPath()), StandardCharsets.UTF_8));
            JSONArray var3 = var2.optJSONArray("favorites");
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length(); var4++) {
                  String var5 = var3.optString(var4, "");
                  if (!var5.isBlank()) {
                     this.O0000000000.add(var5);
                  }
               }
            }

            JSONArray var8 = var2.optJSONArray("recents");
            if (var8 != null) {
               for (int var9 = 0; var9 < var8.length() && this.O00000000000.size() < 8; var9++) {
                  String var6 = var8.optString(var9, "");
                  if (!var6.isBlank() && !this.O00000000000.contains(var6)) {
                     this.O00000000000.add(var6);
                  }
               }
            }
         } catch (Throwable var7) {
         }
      }
   }

   private void O0000000000000() {
      try {
         JSONObject var1 = new JSONObject();
         var1.put("favorites", new JSONArray(this.O0000000000));
         var1.put("recents", new JSONArray(this.O00000000000));
         Files.write(this.O00000000000().toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (Throwable var2) {
      }
   }
}
