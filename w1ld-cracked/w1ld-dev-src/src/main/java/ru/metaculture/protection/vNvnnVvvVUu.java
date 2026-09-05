package ru.metaculture.protection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class vNvnnVvvVUu {
   private static final Map<String, nNvnvuvVuUVU> uVUuuVnNVU = new HashMap<>();
   private static final Map<String, nUVnuvUu> vuuuNvNuv = new HashMap<>();
   private static final Map<String, vNvnnVvvVUu.NVnVnNnN> nvUVNnuu = new LinkedHashMap<>();
   private static vnuUvuuNVNUU UuuNnUvUuv;
   private static boolean nUUVuvU = false;
   private static boolean UnUNVVVNuv = false;
   private static long vNVuvnUUnuUn;
   public static nUVnuvUu UuUVuuUu;
   public static nUVnuvUu C00OOC00oO;
   public static nUVnuvUu uUnuvNvvNU;
   public static nUVnuvUu vVvUvVVuuNvV;
   public static nUVnuvUu uNNnnnuuuN;
   public static nUVnuvUu nuUnNvnuUu;
   public static nUVnuvUu VVuuUN;
   public static nUVnuvUu vNUvnnVnUvu;

   private vNvnnVvvVUu() {
   }

   public static synchronized void UuUVuuUu(vnuUvuuNVNUU var0, UnVNvNnU var1) {
      UuUVuuUu(var0);
      Objects.requireNonNull(var1, "renderer");
      if (!UnUNVVVNuv) {
         var1.UuUVuuUu(UuUVuuUu, UuUVuuUu(UuUVuuUu));
         var1.UuUVuuUu(C00OOC00oO, UuUVuuUu(C00OOC00oO));
         var1.UuUVuuUu(uUnuvNvvNU, UuUVuuUu(uUnuvNvvNU));
         var1.UuUVuuUu(vVvUvVVuuNvV, UuUVuuUu(vVvUvVVuuNvV));
         var1.UuUVuuUu(uNNnnnuuuN, UuUVuuUu(uNNnnnuuuN));
         var1.UuUVuuUu(nuUnNvnuUu, UuUVuuUu(nuUnNvnuUu));
         var1.UuUVuuUu(VVuuUN, UuUVuuUu(VVuuUN));
         var1.UuUVuuUu(vNUvnnVnUvu, UuUVuuUu(vNUvnnVnUvu));
         UnUNVVVNuv = true;
      }
   }

   public static synchronized nUVnuvUu UuUVuuUu(String var0, String var1, String var2) {
      uNNnnnuuuN();
      Objects.requireNonNull(var0, "id");
      Objects.requireNonNull(var1, "jsonResourcePath");
      Objects.requireNonNull(var2, "textureResourcePath");
      if (uVUuuVnNVU.containsKey(var0)) {
         throw new IllegalStateException("Font already registered: " + var0);
      } else {
         nNvnvuvVuUVU var3 = nNvnvuvVuUVU.UuUVuuUu(UuuNnUvUuv, var1, var2);
         uVUuuVnNVU.put(var0, var3);
         nvUVNnuu.put(var0, new vNvnnVvvVUu.NVnVnNnN(var1, var2));
         nUVnuvUu var4 = new nUVnuvUu(var0);
         vuuuNvNuv.put(var0, var4);
         return var4;
      }
   }

   public static synchronized void UuUVuuUu() {
      if (nUUVuvU && UuuNnUvUuv != null) {
         for (Entry var1 : nvUVNnuu.entrySet()) {
            String var2 = (String)var1.getKey();
            nNvnvuvVuUVU var3 = uVUuuVnNVU.get(var2);
            if (var3 != null) {
               var3.UuUVuuUu(UuuNnUvUuv);
            } else {
               try {
                  vNvnnVvvVUu.NVnVnNnN var4 = (vNvnnVvvVUu.NVnVnNnN)var1.getValue();
                  nNvnvuvVuUVU var5 = nNvnvuvVuUVU.UuUVuuUu(UuuNnUvUuv, var4.json, var4.texture);
                  uVUuuVnNVU.put(var2, var5);
               } catch (Throwable var6) {
               }
            }
         }
      }
   }

   public static synchronized void C00OOC00oO() {
      if (nUUVuvU && UuuNnUvUuv != null) {
         long var0 = System.currentTimeMillis();
         if (var0 - vNVuvnUUnuUn >= 1000L) {
            vNVuvnUUnuUn = var0;

            for (nNvnvuvVuUVU var3 : uVUuuVnNVU.values()) {
               if (var3 != null && !var3.C00OOC00oO()) {
                  var3.UuUVuuUu(UuuNnUvUuv);
               }
            }
         }
      }
   }

   public static synchronized VuuUvnvnuu UuUVuuUu(nUVnuvUu var0) {
      uNNnnnuuuN();
      nNvnvuvVuUVU var1 = C00OOC00oO(var0);
      return new VuuUvnvnuu(UuuNnUvUuv, var1);
   }

   public static synchronized float UuUVuuUu(nUVnuvUu var0, int var1, float var2) {
      uNNnnnuuuN();
      if (var0 != null && !(var2 <= 0.0F)) {
         nNvnvuvVuUVU var3 = C00OOC00oO(var0);
         nNvnvuvVuUVU.NVnVnNnN var4 = var3.UuUVuuUu(var1);
         if (var4 != null && var4.C00OOC00oO) {
            float var5 = Math.max(1.0E-6F, var3.nuUnNvnuUu());
            float var6 = var2 / var5;
            return NvUNUVUNvu.UuUVuuUu(var4.nuUnNvnuUu, var4.vVvUvVVuuNvV, var6);
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public static synchronized float C00OOC00oO(nUVnuvUu var0, int var1, float var2) {
      uNNnnnuuuN();
      if (var0 != null && !(var2 <= 0.0F)) {
         nNvnvuvVuUVU var3 = C00OOC00oO(var0);
         nNvnvuvVuUVU.NVnVnNnN var4 = var3.UuUVuuUu(var1);
         if (var4 != null && var4.C00OOC00oO) {
            float var5 = Math.max(1.0E-6F, var3.nuUnNvnuUu());
            float var6 = var2 / var5;
            return NvUNUVUNvu.UuUVuuUu(var4.uUnuvNvvNU, var4.uNNnnnuuuN, var6);
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public static synchronized nUVnuvUu UuUVuuUu(String var0) {
      uNNnnnuuuN();
      nUVnuvUu var1 = vuuuNvNuv.get(var0);
      if (var1 == null) {
         throw new IllegalArgumentException("Font not registered: " + var0);
      } else {
         return var1;
      }
   }

   public static synchronized nUVnuvUu uUnuvNvvNU() {
      uNNnnnuuuN();
      return vNUvnnVnUvu;
   }

   static synchronized nNvnvuvVuUVU C00OOC00oO(nUVnuvUu var0) {
      uNNnnnuuuN();
      nNvnvuvVuUVU var1 = uVUuuVnNVU.get(var0.UuUVuuUu);
      if (var1 == null) {
         throw new IllegalStateException("Font not registered: " + var0.UuUVuuUu);
      } else {
         return var1;
      }
   }

   private static void UuUVuuUu(vnuUvuuNVNUU var0) {
      Objects.requireNonNull(var0, "backend");
      if (nUUVuvU) {
         if (UuuNnUvUuv != var0) {
            throw new IllegalStateException("FontRegistry already initialized with a different backend instance");
         }
      } else {
         UuuNnUvUuv = var0;
         nUUVuvU = true;
         vVvUvVVuuNvV();
      }
   }

   private static void vVvUvVVuuNvV() {
      UuUVuuUu = UuUVuuUu("inter_medium", "assets/wild/fonts/medium.json", "assets/wild/fonts/medium.png");
      C00OOC00oO = UuUVuuUu("inter_medium_ext", "assets/wild/fonts/Inter_Medium.json", "assets/wild/fonts/Inter_Medium.png");
      uUnuvNvvNU = UuUVuuUu("icons", "assets/wild/fonts/icons.json", "assets/wild/fonts/icons.png");
      vVvUvVVuuNvV = UuUVuuUu("inter_semibold", "assets/wild/fonts/semibold.json", "assets/wild/fonts/semibold.png");
      uNNnnnuuuN = UuUVuuUu("new_ico", "assets/wild/fonts/new_ico.json", "assets/wild/fonts/new_ico.png");
      nuUnNvnuUu = UuUVuuUu("notifff", "assets/wild/fonts/notifff.json", "assets/wild/fonts/notifff.png");
      VVuuUN = UuUVuuUu("waypoints", "assets/wild/fonts/waypoint_icons.json", "assets/wild/fonts/waypoint_icons.png");
      vNUvnnVnUvu = UuUVuuUu("wild", "assets/wild/fonts/wild.json", "assets/wild/fonts/wildICO.png");
   }

   private static void uNNnnnuuuN() {
      if (!nUUVuvU || UuuNnUvUuv == null) {
         throw new IllegalStateException("FontRegistry.initialize(backend, renderer) must be called before use");
      }
   }

   record NVnVnNnN(String json, String texture) {
   }
}
