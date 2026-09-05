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

public final class vnvnuNuUVn {
   private static final vnvnuNuUVn UuUVuuUu = new vnvnuNuUVn();
   private static final int C00OOC00oO = 8;
   private final LinkedHashSet<String> uUnuvNvvNU = new LinkedHashSet<>();
   private final ArrayList<String> vVvUvVVuuNvV = new ArrayList<>();
   private boolean uNNnnnuuuN;

   private vnvnuNuUVn() {
   }

   public static vnvnuNuUVn UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized Set<String> C00OOC00oO() {
      this.uNNnnnuuuN();
      return new LinkedHashSet<>(this.uUnuvNvvNU);
   }

   public synchronized List<String> uUnuvNvvNU() {
      this.uNNnnnuuuN();
      return new ArrayList<>(this.vVvUvVVuuNvV);
   }

   public synchronized boolean UuUVuuUu(String var1) {
      this.uNNnnnuuuN();
      return var1 != null && this.uUnuvNvvNU.contains(var1);
   }

   public synchronized void C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.uNNnnnuuuN();
         if (!this.uUnuvNvvNU.remove(var1)) {
            this.uUnuvNvvNU.add(var1);
         }

         this.nuUnNvnuUu();
      }
   }

   public synchronized void uUnuvNvvNU(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.uNNnnnuuuN();
         this.vVvUvVVuuNvV.remove(var1);
         this.vVvUvVVuuNvV.add(0, var1);

         while (this.vVvUvVVuuNvV.size() > 8) {
            this.vVvUvVVuuNvV.remove(this.vVvUvVVuuNvV.size() - 1);
         }

         this.nuUnNvnuUu();
      }
   }

   private File vVvUvVVuuNvV() {
      return new File(lllilIiI11l.UuUVuuUu().vVvUvVVuuNvV(), "library.json");
   }

   private void uNNnnnuuuN() {
      if (!this.uNNnnnuuuN) {
         this.uNNnnnuuuN = true;

         try {
            File var1 = this.vVvUvVVuuNvV();
            if (!var1.isFile()) {
               return;
            }

            JSONObject var2 = new JSONObject(new String(Files.readAllBytes(var1.toPath()), StandardCharsets.UTF_8));
            JSONArray var3 = var2.optJSONArray("favorites");
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length(); var4++) {
                  String var5 = var3.optString(var4, "");
                  if (!var5.isBlank()) {
                     this.uUnuvNvvNU.add(var5);
                  }
               }
            }

            JSONArray var8 = var2.optJSONArray("recents");
            if (var8 != null) {
               for (int var9 = 0; var9 < var8.length() && this.vVvUvVVuuNvV.size() < 8; var9++) {
                  String var6 = var8.optString(var9, "");
                  if (!var6.isBlank() && !this.vVvUvVVuuNvV.contains(var6)) {
                     this.vVvUvVVuuNvV.add(var6);
                  }
               }
            }
         } catch (Throwable var7) {
         }
      }
   }

   private void nuUnNvnuUu() {
      try {
         JSONObject var1 = new JSONObject();
         var1.put("favorites", new JSONArray(this.uUnuvNvvNU));
         var1.put("recents", new JSONArray(this.vVvUvVVuuNvV));
         Files.write(this.vVvUvVVuuNvV().toPath(), var1.toString(2).getBytes(StandardCharsets.UTF_8));
      } catch (Throwable var2) {
      }
   }
}
