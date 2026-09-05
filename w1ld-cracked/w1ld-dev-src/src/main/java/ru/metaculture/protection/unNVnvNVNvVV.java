package ru.metaculture.protection;

import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import org.wild.module.api.Module;

public final class unNVnvNVNvVV {
   private static final double UuUVuuUu = 1.0E-6;
   private final unNVnvNVNvVV.NVnVnNnN C00OOC00oO;
   private final Module uUnuvNvvNU;
   private final nvUuvVvuuN vVvUvVVuuNvV;
   private final String uNNnnnuuuN;
   private final String nuUnNvnuUu;
   private final Object VVuuUN;
   private final String vNUvnnVnUvu;
   private Object uVUuuVnNVU;
   private Object vuuuNvNuv;
   private int nvUVNnuu;
   private vvVUVuVvnnVN UuuNnUvUuv;
   private int nUUVuvU;
   private vvVUVuVvnnVN UnUNVVVNuv;
   private boolean vNVuvnUUnuUn;
   private boolean UvnvNVnnnnNU;

   private unNVnvNVNvVV(
      unNVnvNVNvVV.NVnVnNnN var1,
      Module var2,
      nvUuvVvuuN var3,
      String var4,
      String var5,
      Object var6,
      String var7,
      Object var8,
      Object var9,
      int var10,
      vvVUVuVvnnVN var11
   ) {
      this.C00OOC00oO = Objects.requireNonNull(var1, "targetType");
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = var3;
      this.uNNnnnuuuN = var4 == null ? "" : var4;
      this.nuUnNvnuUu = var5 == null ? "" : var5;
      this.VVuuUN = var6;
      this.vNUvnnVnUvu = var7 == null ? "" : var7;
      this.uVUuuVnNVU = var8;
      this.vuuuNvNuv = var9;
      this.nvUVNnuu = var10;
      this.UuuNnUvUuv = Objects.requireNonNull(var11, "mode");
      this.nUUVuvU = var10;
      this.UnUNVVVNuv = var11;
      this.vNVuvnUUnuUn = var10 == -1;
      this.UvnvNVnnnnNU = this.vNVuvnUUnuUn;
   }

   public static unNVnvNVNvVV UuUVuuUu(Module var0) {
      Objects.requireNonNull(var0, "module");
      int var1 = var0.uNNnnnuuuN > 0 ? var0.uNNnnnuuuN : -1;
      return new unNVnvNVNvVV(
         unNVnvNVNvVV.NVnVnNnN.MODULE,
         var0,
         null,
         var0.vVvUvVVuuNvV,
         var0.vuuuNvNuv,
         var0.nuUnNvnuUu,
         "Modules toggle state is controlled by the mode.",
         null,
         null,
         var1,
         vvVUVuVvnnVN.TOGGLE
      );
   }

   public static unNVnvNVNvVV UuUVuuUu(Module var0, nvUuvVvuuN var1, Object var2, Object var3, int var4, vvVUVuVvnnVN var5) {
      Objects.requireNonNull(var0, "module");
      Objects.requireNonNull(var1, "setting");
      return new unNVnvNVNvVV(unNVnvNVNvVV.NVnVnNnN.SETTING, var0, var1, var1.UuUVuuUu, var0.vVvUvVVuuNvV, var2, "", var3, var3, var4, var5);
   }

   public unNVnvNVNvVV.NVnVnNnN UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public Module C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public nvUuvVvuuN uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public String vVvUvVVuuNvV() {
      return this.uNNnnnuuuN;
   }

   public String uNNnnnuuuN() {
      return this.nuUnNvnuUu;
   }

   public Object nuUnNvnuUu() {
      return this.VVuuUN;
   }

   public String VVuuUN() {
      return this.vNUvnnVnUvu;
   }

   public Object vNUvnnVnUvu() {
      return !this.UuuNnUvUuv() ? null : this.uVUuuVnNVU;
   }

   public void UuUVuuUu(Object var1) {
      this.UvUvUNuvNU();
      this.uVUuuVnNVU = this.uUnuvNvvNU(var1);
      this.vNVuvnUUnuUn = false;
   }

   public int uVUuuVnNVU() {
      return this.nvUVNnuu;
   }

   public void UuUVuuUu(int var1) {
      if (var1 == -1 || var1 >= 32 && var1 <= 348) {
         this.nvUVNnuu = var1;
         if (var1 != -1) {
            this.vNVuvnUUnuUn = false;
         }
      } else {
         throw new IllegalArgumentException("keyCode must be GLFW.GLFW_KEY_UNKNOWN or a valid GLFW key constant");
      }
   }

   public vvVUVuVvnnVN vuuuNvNuv() {
      return this.UuuNnUvUuv;
   }

   public void UuUVuuUu(vvVUVuVvnnVN var1) {
      this.UuuNnUvUuv = Objects.requireNonNull(var1, "mode");
   }

   public boolean nvUVNnuu() {
      return this.C00OOC00oO == unNVnvNVNvVV.NVnVnNnN.MODULE;
   }

   public boolean UuuNnUvUuv() {
      return this.C00OOC00oO == unNVnvNVNvVV.NVnVnNnN.SETTING;
   }

   public boolean nUUVuvU() {
      return this.C00OOC00oO == unNVnvNVNvVV.NVnVnNnN.SETTING && this.vVvUvVVuuNvV != null
         ? this.vVvUvVVuuNvV instanceof nNUuNvVn || this.vVvUvVVuuNvV instanceof UvNnUnuNUUU || this.vVvUvVVuuNvV instanceof nuunVnvU
         : false;
   }

   public boolean UnUNVVVNuv() {
      return !this.vNUvnnVnUvu.isBlank();
   }

   public boolean vNVuvnUUnuUn() {
      return this.nvUVNnuu != this.nUUVuvU || this.UuuNnUvUuv != this.UnUNVVVNuv || this.vNVuvnUUnuUn != this.UvnvNVnnnnNU || this.UvnvNVnnnnNU();
   }

   public boolean UvnvNVnnnnNU() {
      return this.UuuNnUvUuv() && this.vVvUvVVuuNvV != null ? !UuUVuuUu(this.vVvUvVVuuNvV, this.uVUuuVnNVU, this.vuuuNvNuv) : false;
   }

   public void uVUVnuvnuVuv() {
      this.UvUvUNuvNU();
      this.vNVuvnUUnuUn = this.UvnvNVnnnnNU;
   }

   public void NVNnnvnuunNv() {
      this.uVunuUNVVUUV();
   }

   public void uVunuUNVVUUV() {
      this.nUUVuvU = this.nvUVNnuu;
      this.UnUNVVVNuv = this.UuuNnUvUuv;
      this.UvnvNVnnnnNU = this.vNVuvnUUnuUn;
      if (this.UuuNnUvUuv() && this.vVvUvVVuuNvV != null) {
         this.vuuuNvNuv = C00OOC00oO(this.vVvUvVVuuNvV, this.uVUuuVnNVU);
      }
   }

   public void UNnVVNvvnVvU() {
      this.nvUVNnuu = this.nUUVuvU;
      this.UuuNnUvUuv = this.UnUNVVVNuv;
      this.vNVuvnUUnuUn = this.UvnvNVnnnnNU;
      if (this.UuuNnUvUuv()) {
         ;
      }
   }

   public void uNnUnnuNUnNu() {
      this.nvUVNnuu = -1;
      this.vNVuvnUUnuUn = true;
      if (this.UuuNnUvUuv()) {
         ;
      }
   }

   public boolean NnUuNNU() {
      return this.vNVuvnUUnuUn;
   }

   public Object nNvNUVU() {
      this.UvUvUNuvNU();
      return C00OOC00oO(this.vVvUvVVuuNvV, this.uVUuuVnNVU);
   }

   public void C00OOC00oO(Object var1) {
      this.UvUvUNuvNU();
      this.uVUuuVnNVU = this.uUnuvNvvNU(Objects.requireNonNull(var1, "value"));
      this.vNVuvnUUnuUn = false;
   }

   public String UnUNuUU() {
      return this.uUnuvNvvNU != null ? this.uUnuvNvvNU.vVvUvVVuuNvV : "";
   }

   public String uUVuVvuNUvnu() {
      return this.vVvUvVVuuNvV != null ? this.vVvUvVVuuNvV.UuUVuuUu : "";
   }

   private void UvUvUNuvNU() {
      if (!this.UuuNnUvUuv()) {
         throw new IllegalStateException("Operation only supported for setting targets");
      } else if (this.vVvUvVVuuNvV == null) {
         throw new IllegalStateException("Setting context is not available");
      }
   }

   private Object uUnuvNvvNU(Object var1) {
      Objects.requireNonNull(var1, "value");
      if (this.vVvUvVVuuNvV instanceof vvNnnUNnVvn) {
         if (var1 instanceof Boolean var3) {
            return var3;
         } else if (var1 instanceof Number var2) {
            return var2.doubleValue() != 0.0;
         } else {
            throw new IllegalArgumentException("Target value must be boolean-compatible");
         }
      } else if (this.vVvUvVVuuNvV instanceof nNUuNvVn) {
         return this.vVvUvVVuuNvV(var1);
      } else if (this.vVvUvVVuuNvV instanceof UvNnUnuNUUU) {
         return this.uNNnnnuuuN(var1);
      } else if (this.vVvUvVVuuNvV instanceof nuunVnvU) {
         return this.nuUnNvnuUu(var1);
      } else if (this.vVvUvVVuuNvV instanceof VnnUvVNuNuVv) {
         return this.VVuuUN(var1);
      } else {
         return var1 instanceof String ? var1 : var1.toString();
      }
   }

   private Object vVvUvVVuuNvV(Object var1) {
      if (this.vVvUvVVuuNvV instanceof nNUuNvVn var2) {
         if (var1 instanceof Number var12) {
            double var4 = var12.doubleValue();
            if (!Double.isNaN(var4) && !Double.isInfinite(var4)) {
               double var6 = Math.min(Math.max(var4, (double)var2.uNNnnnuuuN), (double)var2.nuUnNvnuUu);
               double var8 = Math.round((var6 - var2.uNNnnnuuuN) / var2.VVuuUN);
               double var10 = var2.uNNnnnuuuN + var8 * var2.VVuuUN;
               if (var10 < var2.uNNnnnuuuN) {
                  var10 = var2.uNNnnnuuuN;
               } else if (var10 > var2.nuUnNvnuUu) {
                  var10 = var2.nuUnNvnuUu;
               }

               return var10;
            } else {
               throw new IllegalArgumentException("Target value must be a finite number");
            }
         } else {
            throw new IllegalArgumentException("Target value must be numeric");
         }
      } else {
         throw new IllegalStateException("Setting is not a SliderSetting");
      }
   }

   private Object uNNnnnuuuN(Object var1) {
      if (this.vVvUvVVuuNvV instanceof UvNnUnuNUUU var2) {
         String var4 = var1.toString();
         if (var2.vVvUvVVuuNvV != null && var2.vVvUvVVuuNvV.contains(var4)) {
            return var4;
         } else {
            throw new IllegalArgumentException("Unsupported option '" + var4 + "'");
         }
      } else {
         throw new IllegalStateException("Setting is not a ModeSetting");
      }
   }

   private Object nuUnNvnuUu(Object var1) {
      if (!(this.vVvUvVVuuNvV instanceof nuunVnvU var2)) {
         throw new IllegalStateException("Setting is not a ListSetting");
      } else {
         var2.uUnuvNvvNU();
         if (!(var1 instanceof Collection var8)) {
            throw new IllegalArgumentException("Target value must be a collection");
         } else {
            LinkedHashSet var4 = new LinkedHashSet();

            for (Object var6 : var8) {
               if (var6 != null) {
                  String var7 = var6.toString();
                  if (var2.vVvUvVVuuNvV == null || !var2.vVvUvVVuuNvV.contains(var7)) {
                     throw new IllegalArgumentException("Unsupported option '" + var7 + "'");
                  }

                  var4.add(var7);
               }
            }

            return var4;
         }
      }
   }

   private Object VVuuUN(Object var1) {
      if (this.vVvUvVVuuNvV instanceof VnnUvVNuNuVv var2) {
         if (var1 instanceof NUvuNUvvUvvN var10) {
            return var10;
         } else if (var1 instanceof Number var9) {
            return NUvuNUvvUvvN.UuUVuuUu(var9.intValue());
         } else if (var1 instanceof String var8) {
            try {
               String var4 = var8.startsWith("#") ? var8.substring(1) : var8;
               int var5 = (int)Long.parseUnsignedLong(var4, 16);
               int var6 = var4.length() > 6 ? var5 : 0xFF000000 | var5;
               return NUvuNUvvUvvN.UuUVuuUu(var6);
            } catch (NumberFormatException var7) {
               throw new IllegalArgumentException("Invalid colour string: " + var8, var7);
            }
         } else {
            return NUvuNUvvUvvN.UuUVuuUu(var2.uNNnnnuuuN(), var2.nUUVuvU, var2.UnUNVVVNuv, var2.vNVuvnUUnuUn);
         }
      } else {
         throw new IllegalStateException("Setting is not a HueSetting");
      }
   }

   private static Object UuUVuuUu(nvUuvVvuuN var0, Object var1) {
      if (var0 instanceof vvNnnUNnVvn) {
         return UuUVuuUu(null, var1, var0);
      } else if (var0 instanceof nNUuNvVn) {
         return UuUVuuUu(null, var0, var1);
      } else if (var0 instanceof UvNnUnuNUUU) {
         return C00OOC00oO(null, var0, var1);
      } else if (var0 instanceof nuunVnvU) {
         return vVvUvVVuuNvV(null, var0, var1);
      } else {
         return var0 instanceof VnnUvVNuNuVv ? uNNnnnuuuN(null, var0, var1) : var1;
      }
   }

   private static Object UuUVuuUu(JsonElement var0, Object var1, nvUuvVvuuN var2) {
      boolean var3 = var1 instanceof Boolean var4 ? var4 : Boolean.FALSE;
      if (var0 != null && var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isBoolean()) {
         var3 = var0.getAsBoolean();
      }

      return var3;
   }

   private static Object UuUVuuUu(JsonElement var0, nvUuvVvuuN var1, Object var2) {
      if (var1 instanceof nNUuNvVn var3) {
         double var4 = var2 instanceof Number var6 ? var6.doubleValue() : var3.vVvUvVVuuNvV;
         if (var0 != null && var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
            var4 = var0.getAsDouble();
         }

         double var12 = Math.min(Math.max(var4, (double)var3.uNNnnnuuuN), (double)var3.nuUnNvnuUu);
         double var8 = Math.round((var12 - var3.uNNnnnuuuN) / var3.VVuuUN);
         double var10 = var3.uNNnnnuuuN + var8 * var3.VVuuUN;
         if (var10 < var3.uNNnnnuuuN) {
            var10 = var3.uNNnnnuuuN;
         } else if (var10 > var3.nuUnNvnuUu) {
            var10 = var3.nuUnNvnuUu;
         }

         return var10;
      } else {
         throw new IllegalStateException("Setting is not a SliderSetting");
      }
   }

   private static Object C00OOC00oO(JsonElement var0, nvUuvVvuuN var1, Object var2) {
      if (var1 instanceof UvNnUnuNUUU var3) {
         String var4 = var2 instanceof String var5 ? var5 : (var3.uNNnnnuuuN != null ? var3.uNNnnnuuuN : "");
         if (var0 != null && var0.isJsonPrimitive()) {
            var4 = var0.getAsString();
         }

         if (var3.vVvUvVVuuNvV == null || !var3.vVvUvVVuuNvV.contains(var4)) {
            var4 = var3.uNNnnnuuuN != null ? var3.uNNnnnuuuN : "";
         }

         return var4;
      } else {
         throw new IllegalStateException("Setting is not a ModeSetting");
      }
   }

   private static Object uUnuvNvvNU(JsonElement var0, nvUuvVvuuN var1, Object var2) {
      String var3 = var2 instanceof String var4 ? var4 : "";
      if (var0 != null && var0.isJsonPrimitive()) {
         var3 = var0.getAsString();
      }

      return var3;
   }

   private static Object vVvUvVVuuNvV(JsonElement var0, nvUuvVvuuN var1, Object var2) {
      if (!(var1 instanceof nuunVnvU var3)) {
         throw new IllegalStateException("Setting is not a ListSetting");
      } else {
         var3.uUnuvNvvNU();
         LinkedHashSet var4 = new LinkedHashSet();
         if (var0 != null && var0.isJsonArray()) {
            for (JsonElement var7 : var0.getAsJsonArray()) {
               if (var7.isJsonPrimitive()) {
                  String var8 = var7.getAsString();
                  if (var3.vVvUvVVuuNvV != null && var3.vVvUvVVuuNvV.contains(var8)) {
                     var4.add(var8);
                  }
               }
            }
         }

         return var4;
      }
   }

   private static Object uNNnnnuuuN(JsonElement var0, nvUuvVvuuN var1, Object var2) {
      if (var1 instanceof VnnUvVNuNuVv var3) {
         NUvuNUvvUvvN var4;
         if (var2 instanceof NUvuNUvvUvvN var5) {
            var4 = var5;
         } else if (var2 instanceof Number var6) {
            var4 = NUvuNUvvUvvN.UuUVuuUu(var6.intValue());
         } else if (var2 instanceof String var7) {
            try {
               String var8 = var7.startsWith("#") ? var7.substring(1) : var7;
               int var9 = (int)Long.parseUnsignedLong(var8, 16);
               int var10 = var8.length() > 6 ? var9 : 0xFF000000 | var9;
               var4 = NUvuNUvvUvvN.UuUVuuUu(var10);
            } catch (NumberFormatException var11) {
               var4 = NUvuNUvvUvvN.UuUVuuUu(var3.uNNnnnuuuN(), var3.nUUVuvU, var3.UnUNVVVNuv, var3.vNVuvnUUnuUn);
            }
         } else {
            var4 = NUvuNUvvUvvN.UuUVuuUu(var3.uNNnnnuuuN(), var3.nUUVuvU, var3.UnUNVVVNuv, var3.vNVuvnUUnuUn);
         }

         return var4;
      } else {
         throw new IllegalStateException("Setting is not a HueSetting");
      }
   }

   private static Collection<?> vNUvnnVnUvu(Object var0) {
      return (Collection<?>)(var0 instanceof Collection var1 ? var1 : List.of());
   }

   private static Object C00OOC00oO(nvUuvVvuuN var0, Object var1) {
      if (var0 == null || var1 == null) {
         return var1;
      } else if (var0 instanceof vvNnnUNnVvn) {
         return Boolean.TRUE.equals(var1);
      } else if (var0 instanceof nNUuNvVn) {
         return ((Number)var1).doubleValue();
      } else if (var0 instanceof UvNnUnuNUUU || var0 instanceof NVuVVUNUvV) {
         return var1.toString();
      } else if (var0 instanceof nuunVnvU) {
         LinkedHashSet var2 = new LinkedHashSet();
         if (var1 instanceof Collection) {
            for (Object var5 : (Collection)var1) {
               if (var5 != null) {
                  var2.add(var5.toString());
               }
            }
         }

         return var2;
      } else {
         return var0 instanceof VnnUvVNuNuVv ? uVUuuVnNVU(var1) : var1;
      }
   }

   private static boolean UuUVuuUu(nvUuvVvuuN var0, Object var1, Object var2) {
      if (var1 == var2) {
         return true;
      } else if (var1 == null || var2 == null) {
         return false;
      } else if (var0 instanceof vvNnnUNnVvn || var0 instanceof UvNnUnuNUUU || var0 instanceof NVuVVUNUvV) {
         return Objects.equals(var1, var2);
      } else if (var0 instanceof nNUuNvVn) {
         return Math.abs(((Number)var1).doubleValue() - ((Number)var2).doubleValue()) <= 1.0E-6;
      } else if (var0 instanceof nuunVnvU) {
         if (!(var1 instanceof Collection var7 && var2 instanceof Collection var10)) {
            return false;
         } else {
            return var7.size() != var10.size() ? false : new LinkedHashSet<>(UuUVuuUu(var7)).equals(new LinkedHashSet<>(UuUVuuUu(var10)));
         }
      } else if (var0 instanceof VnnUvVNuNuVv) {
         if (var1 instanceof NUvuNUvvUvvN var3 && var2 instanceof NUvuNUvvUvvN var9) {
            return var3.equals(var9);
         } else if (var1 instanceof Number var5 && var2 instanceof Number var8) {
            return var5.intValue() == var8.intValue();
         } else {
            return var1 instanceof String var6 && var2 instanceof String var4 ? var6.equalsIgnoreCase(var4) : false;
         }
      } else {
         return Objects.equals(var1, var2);
      }
   }

   private static List<String> UuUVuuUu(Collection<?> var0) {
      ArrayList var1 = new ArrayList(var0.size());

      for (Object var3 : var0) {
         if (var3 != null) {
            var1.add(var3.toString());
         }
      }

      return var1;
   }

   private static NUvuNUvvUvvN uVUuuVnNVU(Object var0) {
      if (var0 instanceof NUvuNUvvUvvN var7) {
         return NUvuNUvvUvvN.UuUVuuUu(var7.UuUVuuUu(), var7.C00OOC00oO(), var7.uUnuvNvvNU(), var7.vVvUvVVuuNvV());
      } else if (var0 instanceof Number var6) {
         return NUvuNUvvUvvN.UuUVuuUu(var6.intValue());
      } else if (var0 instanceof String var1) {
         try {
            String var2 = var1.startsWith("#") ? var1.substring(1) : var1;
            int var3 = (int)Long.parseUnsignedLong(var2, 16);
            int var4 = var2.length() > 6 ? var3 : 0xFF000000 | var3;
            return NUvuNUvvUvvN.UuUVuuUu(var4);
         } catch (NumberFormatException var5) {
            throw new IllegalArgumentException("Invalid colour string: " + var1, var5);
         }
      } else {
         throw new IllegalArgumentException("Unsupported colour value type: " + var0.getClass().getName());
      }
   }

   public static enum NVnVnNnN {
      MODULE,
      SETTING;
   }
}
