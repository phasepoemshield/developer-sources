package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_310;
import org.wild.module.api.Module;

public final class VUUnUVuNvvuU {
   static final uNNnVuNunvU UuUVuuUu = uNNnVuNunvU.UuUVuuUu(2.2F, 0.72F);
   private static final uNNnVuNunvU C00OOC00oO = uNNnVuNunvU.UuUVuuUu(1.9F, 0.68F);
   private static final float uUnuvNvvNU = 16.0F;
   private static final float vVvUvVVuuNvV = 8.0F;
   private static final float uNNnnnuuuN = 8.0F;
   private static final float nuUnNvnuUu = 0.001F;
   private static final long VVuuUN = 1200000000L;
   private final uNuuunuNvuN vNUvnnVnUvu;
   private final uNuuunuNvuN uVUuuVnNVU;
   private final uNuuunuNvuN vuuuNvNuv;
   private final uNuuunuNvuN nvUVNnuu;
   private final uNuuunuNvuN UuuNnUvUuv;
   private final uNuuunuNvuN nUUVuvU;
   private final uNuuunuNvuN UnUNVVVNuv;
   private final VVNnvnNuvuVu vNVuvnUUnuUn;
   private unNVnvNVNvVV UvnvNVnnnnNU;
   private CCO0oCC0Oo.NVnVnNnN uVUVnuvnuVuv;
   private CCO0oCC0Oo.nvnNNunvv NVNnnvnuunNv = new CCO0oCC0Oo.nvnNNunvv(0.0F, 0.0F, 0.0F, 0.0F);
   private VNVnNUnuUU uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU = Float.NaN;
   private float nNvNUVU = Float.NaN;
   private float UnUNuUU = 1.0F;
   private boolean uUVuVvuNUvnu;
   private boolean UvUvUNuvNU;
   private boolean c0oOOCcCoC0;
   private long VVnVNnunVvu;
   private double unNNVVNnvvV = -1.0;
   private double NuunnvnN = -1.0;

   private static uNuuunuNvuN vNUvnnVnUvu() {
      uNuuunuNvuN var0 = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), C00OOC00oO, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      var0.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
      return var0;
   }

   VUUnUVuNvvuU(uNuuunuNvuN var1) {
      this.vNUvnnVnUvu = Objects.requireNonNull(var1, "visibilityAnimator");
      this.uVUuuVnNVU = vNUvnnVnUvu();
      this.vuuuNvNuv = vNUvnnVnUvu();
      this.nvUVNnuu = vNUvnnVnUvu();
      this.UuuNnUvUuv = vNUvnnVnUvu();
      this.nUUVuvU = vNUvnnVnUvu();
      this.UnUNVVVNuv = vNUvnnVnUvu();
      this.vNVuvnUUnuUn = new VVNnvnNuvuVu(16.0F, 8.0F, 8.0F);
   }

   private void uVUuuVnNVU() {
      this.uVunuUNVVUUV = null;
      if (this.UvnvNVnnnnNU != null && this.UvnvNVnnnnNU.UuuNnUvUuv()) {
         nvUuvVvuuN var1 = this.UvnvNVnnnnNU.uUnuvNvvNU();
         if (var1 instanceof vvNnnUNnVvn var2) {
            this.uVunuUNVVUUV = new nvUUnNNnn(this.UvnvNVnnnnNU, var2);
         } else if (var1 instanceof nNUuNvVn var3) {
            this.uVunuUNVVUUV = new UUuuVUuvuV(this.UvnvNVnnnnNU, var3);
         } else if (var1 instanceof UvNnUnuNUUU var4) {
            this.uVunuUNVVUUV = new NvvUnVuUvU(this.UvnvNVnnnnNU, var4);
         } else if (var1 instanceof nuunVnvU var5) {
            this.uVunuUNVVUUV = new nUnNNnvN(this.UvnvNVnnnnNU, var5);
         }
      }
   }

   private float vuuuNvNuv() {
      return this.uVunuUNVVUUV == null ? 0.0F : Math.max(0.0F, this.uVunuUNVVUUV.uNNnnnuuuN());
   }

   private void nvUVNnuu() {
      if (this.uVunuUNVVUUV != null && this.uVUVnuvnuVuv != null) {
         CCO0oCC0Oo.nvnNNunvv var1 = this.uVUVnuvnuVuv.valueContent();
         if (!(var1.vVvUvVVuuNvV() <= 0.0F)) {
            this.uVunuUNVVUUV.UuUVuuUu(var1);
         }
      }
   }

   private boolean C00OOC00oO(double var1, double var3, int var5) {
      if (this.uVunuUNVVUUV == null) {
         return false;
      } else if (this.uVunuUNVVUUV.VVuuUN()) {
         return this.uVunuUNVVUUV.UuUVuuUu(var1, var3, var5) ? true : true;
      } else {
         return this.uVUVnuvnuVuv != null && this.uVUVnuvnuVuv.valueContent().UuUVuuUu(var1, var3) ? this.uVunuUNVVUUV.UuUVuuUu(var1, var3, var5) : false;
      }
   }

   private boolean C00OOC00oO(double var1, double var3, double var5, double var7) {
      if (this.uVunuUNVVUUV == null) {
         return false;
      } else if (this.uVunuUNVVUUV.VVuuUN()) {
         return this.uVunuUNVVUUV.UuUVuuUu(var1, var3, var5, var7) ? true : true;
      } else {
         return this.uVUVnuvnuVuv != null && this.uVUVnuvnuVuv.valueContent().UuUVuuUu(var1, var3) ? this.uVunuUNVVUUV.UuUVuuUu(var1, var3, var5, var7) : false;
      }
   }

   public static VUUnUVuNvvuU UuUVuuUu() {
      return VUUnUVuNvvuU.NVnVnNnN.UuUVuuUu;
   }

   public synchronized void UuUVuuUu(Module var1, double var2, double var4, int var6, int var7) {
      Objects.requireNonNull(var1, "module");
      unNVnvNVNvVV var8 = unNVnvNVNvVV.UuUVuuUu(var1);
      this.UuUVuuUu(var8, var2, var4, var6, var7);
   }

   public synchronized void UuUVuuUu(Module var1, nvUuvVvuuN var2, double var3, double var5, Object var7) {
      class_310 var8 = class_310.method_1551();
      int var9 = 1;
      int var10 = 1;
      if (var8 != null && var8.method_22683() != null) {
         var9 = Math.max(1, var8.method_22683().method_4489());
         var10 = Math.max(1, var8.method_22683().method_4506());
      }

      this.UuUVuuUu(var1, var2, var3, var5, var9, var10, var7);
   }

   public synchronized void UuUVuuUu(Module var1, nvUuvVvuuN var2, double var3, double var5, int var7, int var8, Object var9) {
      Objects.requireNonNull(var1, "module");
      Objects.requireNonNull(var2, "setting");
      Object var10 = var9 != null ? var9 : UuUVuuUu(var2);
      Object var11 = C00OOC00oO(var2);
      byte var12 = -1;
      int var13 = Math.max(1, var7);
      int var14 = Math.max(1, var8);
      unNVnvNVNvVV var15 = unNVnvNVNvVV.UuUVuuUu(var1, var2, var10, var11, var12, vvVUVuVvnnVN.TOGGLE);
      this.UuUVuuUu(var15, var3, var5, var13, var14);
   }

   private void UuUVuuUu(unNVnvNVNvVV var1, double var2, double var4, int var6, int var7) {
      this.UvnvNVnnnnNU = Objects.requireNonNull(var1, "newModel");
      this.uUVuVvuNUvnu = false;
      this.c0oOOCcCoC0 = false;
      this.VVnVNnunVvu = 0L;
      this.UvUvUNuvNU = false;
      VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(false);
      this.uVUuuVnNVU();
      CCO0oCC0Oo.NVnVnNnN var8 = CCO0oCC0Oo.UuUVuuUu(this.UvnvNVnnnnNU, 0.0F, 0.0F, this.vuuuNvNuv());
      float var9 = var8.bounds().uUnuvNvvNU();
      float var10 = var8.bounds().vVvUvVVuuNvV();
      this.NnUuNNU = UuUVuuUu(var2);
      this.nNvNUVU = UuUVuuUu(var4);
      this.UnUNuUU = this.uVunuUNVVUUV();
      this.UuUVuuUu(var9, var10, var6, var7);
      this.uVUVnuvnuVuv = CCO0oCC0Oo.UuUVuuUu(this.UvnvNVnnnnNU, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.vuuuNvNuv());
      this.NVNnnvnuunNv = this.uVUVnuvnuVuv.field();
      this.nvUVNnuu();
      this.UnUNVVVNuv();
      this.uVUVnuvnuVuv();
      this.UnUNVVVNuv.uUnuvNvvNU(1.0F);
      this.vNUvnnVnUvu.uUnuvNvvNU(1.0F);
   }

   private static Object UuUVuuUu(nvUuvVvuuN var0) {
      if (var0 instanceof vvNnnUNnVvn) {
         return ((vvNnnUNnVvn)var0).uUnuvNvvNU();
      } else if (var0 instanceof UvNnUnuNUUU) {
         return ((UvNnUnuNUUU)var0).uNNnnnuuuN;
      } else if (var0 instanceof nNUuNvVn) {
         return (double)((nNUuNvVn)var0).vVvUvVVuuNvV;
      } else if (var0 instanceof nuunVnvU) {
         return new LinkedHashSet<>(((nuunVnvU)var0).VVuuUN);
      } else {
         return var0 instanceof VnnUvVNuNuVv var1 ? NUvuNUvvUvvN.UuUVuuUu(var1.uNNnnnuuuN(), var1.nUUVuvU, var1.UnUNVVVNuv, var1.vNVuvnUUnuUn) : null;
      }
   }

   private static Object C00OOC00oO(nvUuvVvuuN var0) {
      if (var0 instanceof vvNnnUNnVvn) {
         return Boolean.FALSE;
      } else if (var0 instanceof UvNnUnuNUUU) {
         return ((UvNnUnuNUUU)var0).uNNnnnuuuN != null ? ((UvNnUnuNUUU)var0).uNNnnnuuuN : "";
      } else if (var0 instanceof nNUuNvVn) {
         return (double)((nNUuNvVn)var0).vVvUvVVuuNvV;
      } else if (var0 instanceof nuunVnvU) {
         return new LinkedHashSet<>(((nuunVnvU)var0).VVuuUN);
      } else {
         return var0 instanceof VnnUvVNuNuVv var1 ? NUvuNUvvUvvN.UuUVuuUu(var1.uNNnnnuuuN(), var1.nUUVuvU, var1.UnUNVVVNuv, var1.vNVuvnUUnuUn) : null;
      }
   }

   private static JsonElement UuUVuuUu(nvUuvVvuuN var0, Object var1) {
      if (var0 instanceof vvNnnUNnVvn) {
         return new JsonPrimitive(C00OOC00oO(var0, var1));
      } else if (var0 instanceof nNUuNvVn) {
         return new JsonPrimitive(UuUVuuUu((nNUuNvVn)var0, var1));
      } else if (var0 instanceof UvNnUnuNUUU) {
         return new JsonPrimitive(UuUVuuUu((UvNnUnuNUUU)var0, var1));
      } else if (var0 instanceof nuunVnvU) {
         return UuUVuuUu((nuunVnvU)var0, var1);
      } else {
         return (JsonElement)(var0 instanceof VnnUvVNuNuVv ? uUnuvNvvNU(var0, var1) : new JsonPrimitive(var1 != null ? var1.toString() : ""));
      }
   }

   private static boolean C00OOC00oO(nvUuvVvuuN var0, Object var1) {
      if (var1 instanceof Boolean var3) {
         return var3;
      } else if (var1 instanceof Number var2) {
         return var2.doubleValue() != 0.0;
      } else {
         return var0 instanceof vvNnnUNnVvn ? ((vvNnnUNnVvn)var0).uUnuvNvvNU() : false;
      }
   }

   private static JsonElement uUnuvNvvNU(nvUuvVvuuN var0, Object var1) {
      if (var0 instanceof VnnUvVNuNuVv var2) {
         NUvuNUvvUvvN var3;
         if (var1 instanceof NUvuNUvvUvvN var4) {
            var3 = var4;
         } else if (var1 instanceof Number var5) {
            var3 = NUvuNUvvUvvN.UuUVuuUu(var5.intValue());
         } else if (var1 instanceof String var6) {
            try {
               String var7 = var6.startsWith("#") ? var6.substring(1) : var6;
               int var8 = (int)Long.parseUnsignedLong(var7, 16);
               int var9 = var7.length() > 6 ? var8 : 0xFF000000 | var8;
               var3 = NUvuNUvvUvvN.UuUVuuUu(var9);
            } catch (NumberFormatException var10) {
               var3 = NUvuNUvvUvvN.UuUVuuUu(var2.uNNnnnuuuN(), var2.nUUVuvU, var2.UnUNVVVNuv, var2.vNVuvnUUnuUn);
            }
         } else {
            var3 = NUvuNUvvUvvN.UuUVuuUu(var2.uNNnnnuuuN(), var2.nUUVuvU, var2.UnUNVVVNuv, var2.vNVuvnUUnuUn);
         }

         return new JsonPrimitive(var3.nuUnNvnuUu());
      } else {
         throw new IllegalStateException("Expected HueSetting for colour type");
      }
   }

   private static double UuUVuuUu(nNUuNvVn var0, Object var1) {
      double var2;
      if (var1 instanceof Number var4) {
         var2 = var4.doubleValue();
      } else {
         var2 = var0.vVvUvVVuuNvV;
      }

      if (!Double.isFinite(var2)) {
         var2 = var0.vVvUvVVuuNvV;
      }

      double var16 = var0.uNNnnnuuuN;
      double var6 = var0.nuUnNvnuUu;
      double var8 = var0.VVuuUN;
      if (!Double.isFinite(var8) || var8 <= 0.0) {
         var8 = 1.0;
      }

      double var10 = Math.min(Math.max(var2, var16), var6);
      double var12 = Math.round((var10 - var16) / var8);
      double var14 = var16 + var12 * var8;
      if (var14 < var16) {
         var14 = var16;
      } else if (var14 > var6) {
         var14 = var6;
      }

      return var14;
   }

   private static String UuUVuuUu(UvNnUnuNUUU var0, Object var1) {
      String var2 = var1 != null ? var1.toString() : null;
      if (var2 == null || var2.isBlank() || var0.vVvUvVVuuNvV != null && !var0.vVvUvVVuuNvV.contains(var2)) {
         var2 = var0.uNNnnnuuuN != null ? var0.uNNnnnuuuN : "";
      }

      return var2;
   }

   private static String vVvUvVVuuNvV(nvUuvVvuuN var0, Object var1) {
      Object var2 = var1 != null ? var1 : "";
      return var2 == null ? "" : var2.toString();
   }

   private static JsonElement UuUVuuUu(nuunVnvU var0, Object var1) {
      var0.uUnuvNvvNU();
      Object var2;
      if (var1 instanceof Collection var3) {
         var2 = var3;
      } else {
         var2 = var0.VVuuUN != null ? var0.VVuuUN : List.of();
      }

      LinkedHashSet var7 = new LinkedHashSet();
      if (var2 != null) {
         for (Object var5 : var2) {
            if (var5 != null) {
               String var6 = var5.toString();
               if (var0.vVvUvVVuuNvV != null && var0.vVvUvVVuuNvV.contains(var6)) {
                  var7.add(var6);
               }
            }
         }
      }

      if (var7.isEmpty() && var0.VVuuUN != null) {
         var7.addAll(var0.VVuuUN);
      }

      JsonArray var8 = new JsonArray();

      for (String var10 : var7) {
         var8.add(var10);
      }

      return var8;
   }

   private void UuUVuuUu(float var1, float var2, int var3, int var4) {
      VVNnvnNuvuVu.NVnVnNnN var5 = this.vNVuvnUUnuUn.UuUVuuUu(this.NnUuNNU, this.nNvNUVU, var1, var2, var3, var4, this.UnUNuUU);
      this.UNnVVNvvnVvU = var5.x();
      this.uNnUnnuNUnNu = var5.y();
   }

   public synchronized boolean UuUVuuUu(double var1, double var3, int var5) {
      if (!this.nUUVuvU()) {
         return false;
      } else if (this.uVUVnuvnuVuv == null) {
         return false;
      } else if (this.C00OOC00oO(var1, var3, var5)) {
         return true;
      } else {
         boolean var6 = this.uVUVnuvnuVuv.bounds().UuUVuuUu(var1, var3);
         if (!var6) {
            this.C00OOC00oO();
            return true;
         } else if (var5 == 0) {
            if (this.NVNnnvnuunNv.UuUVuuUu(var1, var3)) {
               if (this.uUVuVvuNUvnu) {
                  this.UvnvNVnnnnNU();
               } else {
                  this.vNVuvnUUnuUn();
               }

               return true;
            } else if (this.uVUVnuvnuVuv.toggleButton().UuUVuuUu(var1, var3)) {
               this.UuUVuuUu(vvVUVuVvnnVN.TOGGLE);
               return true;
            } else if (this.uVUVnuvnuVuv.holdButton().UuUVuuUu(var1, var3)) {
               this.UuUVuuUu(vvVUVuVvnnVN.HOLD);
               return true;
            } else {
               this.C00OOC00oO();
               return true;
            }
         } else if (var5 == 1) {
            this.C00OOC00oO();
            return true;
         } else {
            return var6;
         }
      }
   }

   public synchronized boolean UuUVuuUu(double var1, double var3, double var5, double var7) {
      if (!this.nUUVuvU()) {
         return false;
      } else {
         return this.C00OOC00oO(var1, var3, var5, var7) ? true : true;
      }
   }

   public synchronized boolean UuUVuuUu(vNuUUUVVunnV var1) {
      Objects.requireNonNull(var1, "event");
      return this.vVvUvVVuuNvV();
   }

   public synchronized boolean UuUVuuUu(int var1, int var2, int var3, int var4) {
      if (!this.nUUVuvU()) {
         return false;
      } else if (!this.uUVuVvuNUvnu) {
         int var5 = UuuNnUvUuv();
         return var5 != -1 && var1 == var5 ? false : this.UvnvNVnnnnNU != null;
      } else if (var3 != 1) {
         return true;
      } else if (var1 == 261 || var1 == 259 || var1 == 256) {
         this.UvnvNVnnnnNU.uNnUnnuNUnNu();
         this.c0oOOCcCoC0 = false;
         this.VVnVNnunVvu = 0L;
         this.UvnvNVnnnnNU();
         this.VVuuUN();
         return true;
      } else if (var1 == -1) {
         return true;
      } else if (this.UuUVuuUu(var1)) {
         this.c0oOOCcCoC0 = true;
         this.VVnVNnunVvu = System.nanoTime();
         return true;
      } else {
         this.UvnvNVnnnnNU.UuUVuuUu(var1);
         this.c0oOOCcCoC0 = false;
         this.VVnVNnunVvu = 0L;
         this.UvnvNVnnnnNU();
         this.VVuuUN();
         return true;
      }
   }

   private static int UuuNnUvUuv() {
      Menu var0 = Menu.vNVuvnUUnuUn();
      if (var0 == null) {
         return 344;
      } else {
         return var0.uNNnnnuuuN > 0 ? var0.uNNnnnuuuN : 344;
      }
   }

   public synchronized void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, int var3, int var4, float var5) {
      Objects.requireNonNull(var1, "renderer");
      Objects.requireNonNull(var2, "defaultFont");
      if (this.UvnvNVnnnnNU == null) {
         if (this.UvUvUNuvNU && this.vNUvnnVnUvu.UuUVuuUu() <= 0.001F) {
            this.NVNnnvnuunNv();
         }
      } else {
         this.UuUVuuUu(var3, var4);
         float var6 = C00OOC00oO(this.vNUvnnVnUvu.UuUVuuUu());
         if (var6 <= 0.001F && this.vNUvnnVnUvu.uUnuvNvvNU() <= 0.0F) {
            if (this.UvUvUNuvNU) {
               this.NVNnnvnuunNv();
            }
         } else {
            float var7 = this.vuuuNvNuv();
            if (this.uVUVnuvnuVuv == null || Math.abs(this.uVUVnuvnuVuv.valueBlock().vVvUvVVuuNvV() - var7) > 0.001F) {
               this.uVUVnuvnuVuv = CCO0oCC0Oo.UuUVuuUu(this.UvnvNVnnnnNU, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, var7);
               this.nvUVNnuu();
            }

            if (this.uVunuUNVVUUV != null) {
               this.uVunuUNVVUUV.nuUnNvnuUu();
            }

            String var8;
            if (this.uUVuVvuNUvnu) {
               var8 = "Press a key";
            } else {
               int var9 = this.UvnvNVnnnnNU.uVUuuVnNVU();
               if (var9 == -1) {
                  var8 = "None";
               } else {
                  var8 = C00OOC00oO(var9);
               }
            }

            this.NVNnnvnuunNv = CCO0oCC0Oo.UuUVuuUu(this.uVUVnuvnuVuv, var1, var8);
            boolean var21 = this.NVNnnvnuunNv.UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
            boolean var10 = this.uVUVnuvnuVuv.toggleButton().UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
            boolean var11 = this.uVUVnuvnuVuv.holdButton().UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
            this.UuUVuuUu(var21, var10, var11);
            float var12 = this.uVUuuVnNVU.UuUVuuUu();
            float var13 = this.vuuuNvNuv.UuUVuuUu();
            float var14 = this.nvUVNnuu.UuUVuuUu();
            boolean var15 = this.c0oOOCcCoC0 && System.nanoTime() - this.VVnVNnunVvu <= 1200000000L;
            String var16 = "";
            if (var15) {
               var16 = "";
            }

            float var17 = this.UuuNnUvUuv.UuUVuuUu();
            float var18 = this.nUUVuvU.UuUVuuUu();
            float var19 = this.UnUNVVVNuv.UuUVuuUu() * var5;
            CCO0oCC0Oo.VvunVVUvUNnv var20 = new CCO0oCC0Oo.VvunVVUvUNnv(
               var6,
               var19,
               this.uUVuVvuNUvnu,
               var21,
               var10,
               var11,
               var12,
               var13,
               var14,
               var17,
               var18,
               this.UvnvNVnnnnNU.vuuuNvNuv(),
               var8,
               var16,
               this.uVUVnuvnuVuv.valueBlock().vVvUvVVuuNvV(),
               this.uVUVnuvnuVuv.valueLabelBaseline(),
               this.NVNnnvnuunNv
            );
            CCO0oCC0Oo.UuUVuuUu(var1, var2, this.UvnvNVnnnnNU, this.uVUVnuvnuVuv, var20);
            if (this.uVunuUNVVUUV != null) {
               this.uVunuUNVVUUV.UuUVuuUu(var1, var6, 1.0F);
               this.uVunuUNVVUUV.C00OOC00oO(var1, var6, 1.0F);
            }

            if (!var15) {
               this.c0oOOCcCoC0 = false;
            }
         }
      }
   }

   public synchronized void UuUVuuUu(double var1, double var3) {
      this.unNNVVNnvvV = var1;
      this.NuunnvnN = var3;
      if (this.uVunuUNVVUUV != null) {
         this.uVunuUNVVUUV.UuUVuuUu(var1, var3);
      }
   }

   public synchronized void C00OOC00oO() {
      if (this.UvnvNVnnnnNU != null || !(this.vNUvnnVnUvu.UuUVuuUu() <= 0.001F)) {
         if (this.UvnvNVnnnnNU != null) {
            this.VVuuUN();
         }

         this.UvnvNVnnnnNU();
         this.UuUVuuUu(false, false, false);
         this.UnUNVVVNuv.uUnuvNvvNU(0.0F);
         this.vNUvnnVnUvu.uUnuvNvvNU(0.0F);
         this.UvUvUNuvNU = true;
      }
   }

   public synchronized void uUnuvNvvNU() {
      if (this.UvnvNVnnnnNU != null || !(this.vNUvnnVnUvu.UuUVuuUu() <= 0.001F)) {
         if (this.UvnvNVnnnnNU != null) {
            this.VVuuUN();
         }

         this.UvnvNVnnnnNU();
         this.UuUVuuUu(false, false, false);
         this.UnUNVVVNuv.C00OOC00oO(0.0F);
         this.vNUvnnVnUvu.C00OOC00oO(0.0F);
         this.NVNnnvnuunNv();
      }
   }

   public synchronized boolean vVvUvVVuuNvV() {
      return this.UvnvNVnnnnNU != null ? true : this.vNUvnnVnUvu.UuUVuuUu() > 0.001F;
   }

   public synchronized boolean uNNnnnuuuN() {
      return this.UvnvNVnnnnNU != null;
   }

   public synchronized CCO0oCC0Oo.NVnVnNnN nuUnNvnuUu() {
      return this.uVUVnuvnuVuv;
   }

   public synchronized CCO0oCC0Oo.VvunVVUvUNnv UuUVuuUu(float var1) {
      if (this.UvnvNVnnnnNU != null && this.uVUVnuvnuVuv != null) {
         float var2 = C00OOC00oO(this.vNUvnnVnUvu.UuUVuuUu());
         boolean var3 = this.NVNnnvnuunNv.UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
         boolean var4 = this.uVUVnuvnuVuv.toggleButton().UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
         boolean var5 = this.uVUVnuvnuVuv.holdButton().UuUVuuUu(this.unNNVVNnvvV, this.NuunnvnN);
         float var6 = this.uVUuuVnNVU.UuUVuuUu();
         float var7 = this.vuuuNvNuv.UuUVuuUu();
         float var8 = this.nvUVNnuu.UuUVuuUu();
         String var9;
         if (this.uUVuVvuNUvnu) {
            var9 = "Press a key";
         } else {
            int var10 = this.UvnvNVnnnnNU.uVUuuVnNVU();
            if (var10 == -1) {
               var9 = "None";
            } else {
               var9 = C00OOC00oO(var10);
            }
         }

         boolean var15 = this.c0oOOCcCoC0 && System.nanoTime() - this.VVnVNnunVvu <= 1200000000L;
         String var11 = "";
         if (var15) {
            var11 = "";
         }

         float var12 = this.UuuNnUvUuv.UuUVuuUu();
         float var13 = this.nUUVuvU.UuUVuuUu();
         float var14 = this.UnUNVVVNuv.UuUVuuUu() * var1;
         return new CCO0oCC0Oo.VvunVVUvUNnv(
            var2,
            var14,
            this.uUVuVvuNUvnu,
            var3,
            var4,
            var5,
            var6,
            var7,
            var8,
            var12,
            var13,
            this.UvnvNVnnnnNU.vuuuNvNuv(),
            var9,
            var11,
            this.uVUVnuvnuVuv.valueBlock().vVvUvVVuuNvV(),
            this.uVUVnuvnuVuv.valueLabelBaseline(),
            this.NVNnnvnuunNv
         );
      } else {
         return null;
      }
   }

   public synchronized void VVuuUN() {
      if (this.UvnvNVnnnnNU != null) {
         if (this.UvnvNVnnnnNU.vNVuvnUUnuUn()) {
            VnVvnNNuVuUu var1 = VnVvnNNuVuUu.UuUVuuUu();
            if (this.UvnvNVnnnnNU.nvUVNnuu()) {
               Module var2 = this.UvnvNVnnnnNU.C00OOC00oO();
               if (var2 != null) {
                  var1.UuUVuuUu(var2, this.UvnvNVnnnnNU.uVUuuVnNVU(), this.UvnvNVnnnnNU.vuuuNvNuv());
               }
            } else if (this.UvnvNVnnnnNU.UuuNnUvUuv()) {
               Module var5 = this.UvnvNVnnnnNU.C00OOC00oO();
               nvUuvVvuuN var3 = this.UvnvNVnnnnNU.uUnuvNvvNU();
               if (var5 != null && var3 != null) {
                  if (this.UvnvNVnnnnNU.NnUuNNU()) {
                     var1.UuUVuuUu(var5.vVvUvVVuuNvV, var3.UuUVuuUu);
                  } else {
                     Object var4 = this.UvnvNVnnnnNU.vNUvnnVnUvu();
                     if (var4 != null) {
                        uNNnnnuuuN(var3, var4);
                        var1.UuUVuuUu(var5, var3, this.UvnvNVnnnnNU.vuuuNvNuv(), this.UvnvNVnnnnNU.uVUuuVnNVU(), var4);
                     }
                  }
               }
            }

            this.UvnvNVnnnnNU.uVunuUNVVUUV();
         }
      }
   }

   private boolean nUUVuvU() {
      return this.UvnvNVnnnnNU != null ? true : this.vNUvnnVnUvu.UuUVuuUu() > 0.001F && this.uVUVnuvnuVuv != null;
   }

   private void UuUVuuUu(int var1, int var2) {
      if (this.UvnvNVnnnnNU != null && this.uVUVnuvnuVuv != null) {
         float var3 = this.UNnVVNvvnVvU;
         float var4 = this.uNnUnnuNUnNu;
         this.UnUNuUU = this.uVunuUNVVUUV();
         this.UuUVuuUu(this.uVUVnuvnuVuv.bounds().uUnuvNvvNU(), this.uVUVnuvnuVuv.bounds().vVvUvVVuuNvV(), var1, var2);
         if (this.UNnVVNvvnVvU != var3 || this.uNnUnnuNUnNu != var4) {
            this.uVUVnuvnuVuv = CCO0oCC0Oo.UuUVuuUu(this.UvnvNVnnnnNU, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.vuuuNvNuv());
            this.NVNnnvnuunNv = this.uVUVnuvnuVuv.field();
            this.nvUVNnuu();
         }
      }
   }

   private void UnUNVVVNuv() {
      this.uVUuuVnNVU.uUnuvNvvNU(0.0F);
      this.vuuuNvNuv.uUnuvNvvNU(0.0F);
      this.nvUVNnuu.uUnuvNvvNU(0.0F);
      this.UnUNVVVNuv.uUnuvNvvNU(0.0F);
      this.uVUuuVnNVU.C00OOC00oO(0.0F);
      this.vuuuNvNuv.C00OOC00oO(0.0F);
      this.nvUVNnuu.C00OOC00oO(0.0F);
      this.UnUNVVVNuv.C00OOC00oO(0.0F);
   }

   private void UuUVuuUu(boolean var1, boolean var2, boolean var3) {
      this.uVUuuVnNVU.uUnuvNvvNU(var1 ? 1.0F : 0.0F);
      this.vuuuNvNuv.uUnuvNvvNU(var2 ? 1.0F : 0.0F);
      this.nvUVNnuu.uUnuvNvvNU(var3 ? 1.0F : 0.0F);
   }

   private void vNVuvnUUnuUn() {
      this.uUVuVvuNUvnu = true;
      this.c0oOOCcCoC0 = false;
      this.VVnVNnunVvu = 0L;
      VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(true);
   }

   private void UvnvNVnnnnNU() {
      if (this.uUVuVvuNUvnu) {
         this.uUVuVvuNUvnu = false;
         VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(false);
      }
   }

   private void UuUVuuUu(vvVUVuVvnnVN var1) {
      if (this.UvnvNVnnnnNU != null && var1 != null) {
         this.UvnvNVnnnnNU.UuUVuuUu(var1);
         this.uVUVnuvnuVuv();
         this.VVuuUN();
      }
   }

   private void uVUVnuvnuVuv() {
      if (this.UvnvNVnnnnNU != null) {
         this.UuuNnUvUuv.uUnuvNvvNU(this.UvnvNVnnnnNU.vuuuNvNuv() == vvVUVuVvnnVN.TOGGLE ? 1.0F : 0.0F);
         this.nUUVuvU.uUnuvNvvNU(this.UvnvNVnnnnNU.vuuuNvNuv() == vvVUVuVvnnVN.HOLD ? 1.0F : 0.0F);
      }
   }

   private boolean UuUVuuUu(int var1) {
      return false;
   }

   private void NVNnnvnuunNv() {
      this.UvnvNVnnnnNU = null;
      this.uVUVnuvnuVuv = null;
      this.NVNnnvnuunNv = new CCO0oCC0Oo.nvnNNunvv(0.0F, 0.0F, 0.0F, 0.0F);
      this.uVunuUNVVUUV = null;
      this.UvUvUNuvNU = false;
      this.c0oOOCcCoC0 = false;
      this.VVnVNnunVvu = 0L;
      this.NnUuNNU = Float.NaN;
      this.nNvNUVU = Float.NaN;
      this.UnUNuUU = 1.0F;
      this.UnUNVVVNuv();
   }

   private float uVunuUNVVUUV() {
      float var1 = 1.0F;
      if (!Float.isFinite(var1)) {
         return 1.0F;
      } else {
         return var1 <= 0.001F ? 1.0F : var1;
      }
   }

   private static float UuUVuuUu(double var0) {
      if (!Double.isFinite(var0)) {
         return Float.NaN;
      } else if (var0 > Float.MAX_VALUE) {
         return Float.MAX_VALUE;
      } else {
         return var0 < -Float.MAX_VALUE ? -Float.MAX_VALUE : (float)var0;
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   private static float C00OOC00oO(float var0) {
      if (var0 <= 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 1.0F ? 1.0F : var0;
      }
   }

   private static String C00OOC00oO(int var0) {
      if (var0 == -1) {
         return "None";
      } else if (var0 >= 65 && var0 <= 90) {
         return String.valueOf((char)(65 + (var0 - 65)));
      } else {
         return var0 >= 48 && var0 <= 57 ? String.valueOf((char)(48 + (var0 - 48))) : "Key " + var0;
      }
   }

   private static void uNNnnnuuuN(nvUuvVvuuN var0, Object var1) {
      if (var0 instanceof vvNnnUNnVvn && var1 instanceof Boolean) {
         ((vvNnnUNnVvn)var0).C00OOC00oO((Boolean)var1);
      } else if (var0 instanceof UvNnUnuNUUU && var1 instanceof String) {
         ((UvNnUnuNUUU)var0).uNNnnnuuuN = (String)var1;
         if (((UvNnUnuNUUU)var0).vVvUvVVuuNvV != null && ((UvNnUnuNUUU)var0).vVvUvVVuuNvV.contains((String)var1)) {
            ((UvNnUnuNUUU)var0).vNUvnnVnUvu = ((UvNnUnuNUUU)var0).vVvUvVVuuNvV.indexOf((String)var1);
         }
      } else if (var0 instanceof nNUuNvVn && var1 instanceof Number) {
         double var4 = ((Number)var1).doubleValue();
         ((nNUuNvVn)var0).vVvUvVVuuNvV = (float)Math.max((double)((nNUuNvVn)var0).uNNnnnuuuN, Math.min((double)((nNUuNvVn)var0).nuUnNvnuUu, var4));
      } else if (var0 instanceof nuunVnvU && var1 instanceof Collection) {
         ((nuunVnvU)var0).VVuuUN = new ArrayList<>((Collection<? extends String>)var1);
      } else if (var0 instanceof VnnUvVNuNuVv && var1 instanceof NUvuNUvvUvvN var2) {
         VnnUvVNuNuVv var3 = (VnnUvVNuNuVv)var0;
         var3.UuUVuuUu(var2.UuUVuuUu());
         var3.nUUVuvU = var2.C00OOC00oO();
         var3.UnUNVVVNuv = var2.uUnuvNvvNU();
         var3.vNVuvnUUnuUn = var2.vVvUvVVuuNvV();
      }
   }

   static final class NVnVnNnN {
      static final VUUnUVuNvvuU UuUVuuUu = new VUUnUVuNvvuU(UuUVuuUu());

      private NVnVnNnN() {
      }

      private static uNuuunuNvuN UuUVuuUu() {
         uNuuunuNvuN var0 = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), VUUnUVuNvvuU.UuUVuuUu, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
         var0.UuUVuuUu(unnvUnnn.uUnuvNvvNU);
         return var0;
      }
   }
}
