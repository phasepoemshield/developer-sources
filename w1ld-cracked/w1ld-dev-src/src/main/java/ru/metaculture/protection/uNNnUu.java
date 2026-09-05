package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public final class uNNnUu {
   private static final uNNnUu UuUVuuUu = new uNNnUu();
   private final Map<VnuVUNUv, nuVVnvn> C00OOC00oO = new EnumMap<>(VnuVUNUv.class);
   private final Map<VnuVUNUv, NNnUUVVnuUV> uUnuvNvvNU = new EnumMap<>(VnuVUNUv.class);
   private final Map<VnuVUNUv, String> vVvUvVVuuNvV = new EnumMap<>(VnuVUNUv.class);
   private final Map<String, nuVVnvn> uNNnnnuuuN = new LinkedHashMap<>();
   private final Map<String, NNnUUVVnuUV> nuUnNvnuUu = new LinkedHashMap<>();
   private final Map<String, String> VVuuUN = new LinkedHashMap<>();
   private final Map<String, uNNnUu.nvnNNunvv> vNUvnnVnUvu = new LinkedHashMap<>();
   private final Map<String, uNNnUu.NVnVnNnN> uVUuuVnNVU = new LinkedHashMap<>();
   private final Map<VnuVUNUv, uNNnUu.NVnVnNnN> vuuuNvNuv = new EnumMap<>(VnuVUNUv.class);
   private final Map<VnuVUNUv, Map<String, float[]>> nvUVNnuu = new EnumMap<>(VnuVUNUv.class);
   private final Map<String, Map<String, float[]>> UuuNnUvUuv = new LinkedHashMap<>();
   private final List<Consumer<VnuVUNUv>> nUUVuvU = new CopyOnWriteArrayList<>();
   private final List<Consumer<String>> UnUNVVVNuv = new CopyOnWriteArrayList<>();
   private oo0OOO00o0O vNVuvnUUnuUn;

   private uNNnUu() {
   }

   public static uNNnUu UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized void UuUVuuUu(oo0OOO00o0O var1) {
      this.vNVuvnUUnuUn = var1;
   }

   public synchronized void UuUVuuUu(VnuVUNUv var1, nuVVnvn var2, NNnUUVVnuUV var3) {
      if (var1 != null && var2 != null && var3 != null) {
         this.C00OOC00oO.put(var1, var2);
         this.uUnuvNvvNU.put(var1, var3);
         this.vuuuNvNuv.put(var1, var3.ok() ? uNNnUu.NVnVnNnN.SAVED : uNNnUu.NVnVnNnN.FAILED);
         UuUVuuUu(this.nvUVNnuu.computeIfAbsent(var1, var0 -> new LinkedHashMap<>()), var3);

         try {
            this.vVvUvVVuuNvV.put(var1, VnnVNVNVUnnn.UuUVuuUu(var2));
         } catch (Throwable var5) {
         }

         this.nvUVNnuu(var1);
      }
   }

   public synchronized void UuUVuuUu(String var1, nuVVnvn var2, NNnUUVVnuUV var3) {
      this.UuUVuuUu(var1, var2, var3, UuUVuuUu(var2));
   }

   public synchronized void UuUVuuUu(String var1, nuVVnvn var2, NNnUUVVnuUV var3, uNNnUu.nvnNNunvv var4) {
      String var5 = vuuuNvNuv(var1);
      if (!var5.isBlank() && var2 != null && var3 != null) {
         this.uNNnnnuuuN.put(var5, var2);
         this.nuUnNvnuUu.put(var5, var3);
         this.vNUvnnVnUvu.put(var5, var4 == null ? uNNnUu.nvnNNunvv.USER : var4);
         this.uVUuuVnNVU.put(var5, var3.ok() ? uNNnUu.NVnVnNnN.SAVED : uNNnUu.NVnVnNnN.FAILED);
         UuUVuuUu(this.UuuNnUvUuv.computeIfAbsent(var5, var0 -> new LinkedHashMap<>()), var3);

         try {
            this.VVuuUN.put(var5, VnnVNVNVUnnn.UuUVuuUu(var2));
         } catch (Throwable var7) {
         }

         this.nvUVNnuu(var5);
      }
   }

   public void UuUVuuUu(Consumer<VnuVUNUv> var1) {
      if (var1 != null) {
         this.nUUVuvU.add(var1);
      }
   }

   public void C00OOC00oO(Consumer<String> var1) {
      if (var1 != null) {
         this.UnUNVVVNuv.add(var1);
      }
   }

   private void nvUVNnuu(VnuVUNUv var1) {
      for (Consumer var3 : this.nUUVuvU) {
         try {
            var3.accept(var1);
         } catch (Throwable var5) {
         }
      }
   }

   private void nvUVNnuu(String var1) {
      for (Consumer var3 : this.UnUNVVVNuv) {
         try {
            var3.accept(var1);
         } catch (Throwable var5) {
         }
      }
   }

   public synchronized void UuUVuuUu(VnuVUNUv var1) {
      this.C00OOC00oO.remove(var1);
      this.uUnuvNvvNU.remove(var1);
      this.vVvUvVVuuNvV.remove(var1);
      this.nvUVNnuu.remove(var1);
      this.vuuuNvNuv.remove(var1);
      this.nvUVNnuu(var1);
   }

   public synchronized void UuUVuuUu(String var1) {
      String var2 = vuuuNvNuv(var1);
      this.uNNnnnuuuN.remove(var2);
      this.nuUnNvnuUu.remove(var2);
      this.VVuuUN.remove(var2);
      this.vNUvnnVnUvu.remove(var2);
      this.uVUuuVnNVU.remove(var2);
      this.UuuNnUvUuv.remove(var2);
      uVvVnUU.UuUVuuUu().uUnuvNvvNU(var2);
      this.nvUVNnuu(var2);
   }

   public synchronized NNnUUVVnuUV C00OOC00oO(VnuVUNUv var1) {
      return this.uUnuvNvvNU.get(var1);
   }

   public synchronized NNnUUVVnuUV C00OOC00oO(String var1) {
      return this.nuUnNvnuUu.get(vuuuNvNuv(var1));
   }

   public synchronized nuVVnvn uUnuvNvvNU(VnuVUNUv var1) {
      return this.C00OOC00oO.get(var1);
   }

   public synchronized nuVVnvn uUnuvNvvNU(String var1) {
      return this.uNNnnnuuuN.get(vuuuNvNuv(var1));
   }

   public synchronized String vVvUvVVuuNvV(VnuVUNUv var1) {
      return this.vVvUvVVuuNvV.get(var1);
   }

   public synchronized String vVvUvVVuuNvV(String var1) {
      return this.VVuuUN.get(vuuuNvNuv(var1));
   }

   public synchronized boolean uNNnnnuuuN(VnuVUNUv var1) {
      return var1 != null && this.uUnuvNvvNU.containsKey(var1);
   }

   public synchronized boolean uNNnnnuuuN(String var1) {
      return this.nuUnNvnuUu.containsKey(vuuuNvNuv(var1));
   }

   public synchronized uNNnUu.nvnNNunvv nuUnNvnuUu(String var1) {
      return this.vNUvnnVnUvu.getOrDefault(vuuuNvNuv(var1), uNNnUu.nvnNNunvv.USER);
   }

   public synchronized uNNnUu.NVnVnNnN VVuuUN(String var1) {
      return this.uVUuuVnNVU.getOrDefault(vuuuNvNuv(var1), uNNnUu.NVnVnNnN.FAILED);
   }

   public synchronized uNNnUu.NVnVnNnN nuUnNvnuUu(VnuVUNUv var1) {
      return this.vuuuNvNuv.getOrDefault(var1, uNNnUu.NVnVnNnN.FAILED);
   }

   public synchronized List<ccCoCoOCocoo> VVuuUN(VnuVUNUv var1) {
      NNnUUVVnuUV var2 = var1 == null ? null : this.uUnuvNvvNU.get(var1);
      return var2 == null ? List.of() : var2.exposedUniforms();
   }

   public synchronized List<ccCoCoOCocoo> vNUvnnVnUvu(String var1) {
      NNnUUVVnuUV var2 = this.nuUnNvnuUu.get(vuuuNvNuv(var1));
      return var2 == null ? List.of() : var2.exposedUniforms();
   }

   public synchronized Map<String, float[]> vNUvnnVnUvu(VnuVUNUv var1) {
      return UuUVuuUu(this.nvUVNnuu.get(var1));
   }

   public synchronized Map<String, float[]> uVUuuVnNVU(String var1) {
      return UuUVuuUu(this.UuuNnUvUuv.get(vuuuNvNuv(var1)));
   }

   public synchronized void UuUVuuUu(VnuVUNUv var1, String var2, float var3) {
      if (var1 != null && Float.isFinite(var3)) {
         ccCoCoOCocoo var4 = UuUVuuUu(this.VVuuUN(var1), var2, ccCoCoOCocoo.NVnVnNnN.FLOAT);
         if (var4 != null) {
            this.nvUVNnuu.computeIfAbsent(var1, var0 -> new LinkedHashMap<>()).put(var4.uniformName(), new float[]{var3, 0.0F, 0.0F, 1.0F});
         }
      }
   }

   public synchronized void UuUVuuUu(String var1, String var2, float var3) {
      String var4 = vuuuNvNuv(var1);
      if (!var4.isBlank() && Float.isFinite(var3)) {
         ccCoCoOCocoo var5 = UuUVuuUu(this.vNUvnnVnUvu(var4), var2, ccCoCoOCocoo.NVnVnNnN.FLOAT);
         if (var5 != null) {
            this.UuuNnUvUuv.computeIfAbsent(var4, var0 -> new LinkedHashMap<>()).put(var5.uniformName(), new float[]{var3, 0.0F, 0.0F, 1.0F});
         }
      }
   }

   public synchronized void UuUVuuUu(VnuVUNUv var1, String var2, int var3) {
      if (var1 != null) {
         ccCoCoOCocoo var4 = UuUVuuUu(this.VVuuUN(var1), var2, ccCoCoOCocoo.NVnVnNnN.COLOR);
         if (var4 != null) {
            this.nvUVNnuu.computeIfAbsent(var1, var0 -> new LinkedHashMap<>()).put(var4.uniformName(), UuUVuuUu(var3));
         }
      }
   }

   public synchronized void UuUVuuUu(String var1, String var2, int var3) {
      String var4 = vuuuNvNuv(var1);
      if (!var4.isBlank()) {
         ccCoCoOCocoo var5 = UuUVuuUu(this.vNUvnnVnUvu(var4), var2, ccCoCoOCocoo.NVnVnNnN.COLOR);
         if (var5 != null) {
            this.UuuNnUvUuv.computeIfAbsent(var4, var0 -> new LinkedHashMap<>()).put(var5.uniformName(), UuUVuuUu(var3));
         }
      }
   }

   public synchronized List<String> C00OOC00oO() {
      ArrayList var1 = new ArrayList();

      for (String var3 : this.nuUnNvnuUu.keySet()) {
         if (!UuuNnUvUuv(var3)) {
            var1.add(var3);
         }
      }

      Collections.sort(var1);
      return var1;
   }

   public synchronized List<String> uVUuuVnNVU(VnuVUNUv var1) {
      VnuVUNUv var2 = var1 == null ? VnuVUNUv.PREVIEW_ONLY : var1;
      ArrayList var3 = new ArrayList();

      for (String var5 : this.nuUnNvnuUu.keySet()) {
         if (!UuuNnUvUuv(var5)) {
            nuVVnvn var6 = this.uNNnnnuuuN.get(var5);
            VnuVUNUv var7 = VnuVUNUv.UuUVuuUu(var6 == null ? null : var6.C00OOC00oO());
            if (var7 == var2) {
               var3.add(var5);
            }
         }
      }

      Collections.sort(var3);
      return var3;
   }

   public synchronized List<String> uUnuvNvvNU() {
      ArrayList var1 = new ArrayList();
      var1.add("None");
      var1.addAll(this.C00OOC00oO());
      return var1;
   }

   public synchronized List<String> vuuuNvNuv(VnuVUNUv var1) {
      ArrayList var2 = new ArrayList();
      var2.add("None");
      var2.addAll(this.uVUuuVnNVU(var1));
      return var2;
   }

   private static void UuUVuuUu(Map<String, float[]> var0, NNnUUVVnuUV var1) {
      if (var0 != null && var1 != null) {
         for (ccCoCoOCocoo var3 : var1.exposedUniforms()) {
            var0.putIfAbsent(var3.uniformName(), Arrays.copyOf(var3.defaults(), var3.defaults().length));
         }
      }
   }

   private static Map<String, float[]> UuUVuuUu(Map<String, float[]> var0) {
      if (var0 != null && !var0.isEmpty()) {
         HashMap var1 = new HashMap();

         for (Entry var3 : var0.entrySet()) {
            var1.put(
               (String)var3.getKey(),
               var3.getValue() == null ? new float[]{0.0F, 0.0F, 0.0F, 1.0F} : Arrays.copyOf((float[])var3.getValue(), ((float[])var3.getValue()).length)
            );
         }

         return var1;
      } else {
         return Map.of();
      }
   }

   private static ccCoCoOCocoo UuUVuuUu(List<ccCoCoOCocoo> var0, String var1, ccCoCoOCocoo.NVnVnNnN var2) {
      if (var0 != null && !var0.isEmpty() && var1 != null && !var1.isBlank()) {
         String var3 = vuuuNvNuv(var1);

         for (ccCoCoOCocoo var5 : var0) {
            if (var5.kind() == var2 && (vuuuNvNuv(var5.name()).equals(var3) || vuuuNvNuv(var5.uniformName()).equals(var3))) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static float[] UuUVuuUu(int var0) {
      return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >>> 24 & 0xFF) / 255.0F};
   }

   public static String vuuuNvNuv(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.trim().replaceAll("\\s+", " ");
         return var1.length() > 48 ? var1.substring(0, 48) : var1;
      }
   }

   private static boolean UuuNnUvUuv(String var0) {
      return var0 != null && var0.startsWith("__");
   }

   private static uNNnUu.nvnNNunvv UuUVuuUu(nuVVnvn var0) {
      if (var0 != null && var0.UuUVuuUu() != null) {
         String var1 = var0.UuUVuuUu().nuUnNvnuUu();
         if ("preset".equalsIgnoreCase(var1)) {
            return uNNnUu.nvnNNunvv.PRESET;
         } else if ("imported".equalsIgnoreCase(var1) || "shared".equalsIgnoreCase(var1)) {
            return uNNnUu.nvnNNunvv.IMPORTED;
         } else {
            return "runtime".equalsIgnoreCase(var1) ? uNNnUu.nvnNNunvv.RUNTIME : uNNnUu.nvnNNunvv.USER;
         }
      } else {
         return uNNnUu.nvnNNunvv.USER;
      }
   }

   public static enum NVnVnNnN {
      SAVED,
      DIRTY,
      FAILED,
      COMPILING;
   }

   public static enum nvnNNunvv {
      PRESET,
      USER,
      IMPORTED,
      RUNTIME;
   }
}
