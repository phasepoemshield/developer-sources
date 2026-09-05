package ru.metaculture.protection;

import java.util.List;
import net.minecraft.class_1041;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.lwjgl.opengl.GL11;

public final class UUnnuuNNvVV extends class_437 implements uNVUuVuNNUvn {
   private static final OO0OCoOC UuUVuuUu = OO0OCoOC.UuUVuuUu();
   private static final int C00OOC00oO = 14;
   private final class_437 uUnuvNvvNU;
   private final OoCO0O0oc0c vVvUvVVuuNvV = new OoCO0O0oc0c();
   private final UUnnuuNNvVV.VvunVVUvUNnv uNNnnnuuuN = new UUnnuuNNvVV.VvunVVUvUNnv("Host", false, 255, UUnnuuNNvVV.uunvUUVnuNn.HOST);
   private final UUnnuuNNvVV.VvunVVUvUNnv nuUnNvnuUu = new UUnnuuNNvVV.VvunVVUvUNnv("Port", false, 5, UUnnuuNNvVV.uunvUUVnuNn.PORT);
   private final UUnnuuNNvVV.VvunVVUvUNnv VVuuUN = new UUnnuuNNvVV.VvunVVUvUNnv("Username", false, 128, UUnnuuNNvVV.uunvUUVnuNn.TEXT);
   private final UUnnuuNNvVV.VvunVVUvUNnv vNUvnnVnUvu = new UUnnuuNNvVV.VvunVVUvUNnv("Password", true, 256, UUnnuuNNvVV.uunvUUVnuNn.SECRET);
   private final List<UUnnuuNNvVV.VvunVVUvUNnv> uVUuuVnNVU = List.of(this.uNNnnnuuuN, this.nuUnNvnuUu, this.VVuuUN, this.vNUvnnVnUvu);
   private final List<UUnnuuNNvVV.nvnNNunvv> vuuuNvNuv = List.of(
      new UUnnuuNNvVV.nvnNNunvv("Socks5", UUnnuuNNvVV.NVnVnNnN.TYPE),
      new UUnnuuNNvVV.nvnNNunvv("Enabled", UUnnuuNNvVV.NVnVnNnN.ENABLED),
      new UUnnuuNNvVV.nvnNNunvv("Paste", UUnnuuNNvVV.NVnVnNnN.PASTE),
      new UUnnuuNNvVV.nvnNNunvv("Test", UUnnuuNNvVV.NVnVnNnN.TEST),
      new UUnnuuNNvVV.nvnNNunvv("Save", UUnnuuNNvVV.NVnVnNnN.SAVE),
      new UUnnuuNNvVV.nvnNNunvv("Back", UUnnuuNNvVV.NVnVnNnN.BACK)
   );
   private final UUnnuuNNvVV.VUnuUnnuNvVu[] nvUVNnuu = new UUnnuuNNvVV.VUnuUnnuNvVu[14];
   private final VvVVnnNNNuV.VUuUUNnnuvuv UuuNnUvUuv = new VvVVnnNNNuV.VUuUUNnnuvuv(10, 14);
   private final VvuuVNVUn.NVnVnNnN nUUVuvU = new VvuuVNVUn.NVnVnNnN();
   private final VvuuVNVUn.NVnVnNnN UnUNVVVNuv = new VvuuVNVUn.NVnVnNnN();
   private final vVnuUUVvvnV vNVuvnUUnuUn = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private final vVnuUUVvvnV UvnvNVnnnnNU = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private long uVUVnuvnuVuv;
   private long NVNnnvnuunNv;
   private long uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private float nNvNUVU;
   private float UnUNuUU;
   private float uUVuVvuNUvnu;
   private float UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private float VVnVNnunVvu;
   private float unNNVVNnvvV;
   private float NuunnvnN;
   private boolean NVUunUNUN;
   private boolean UUVNuUNUvUnV;
   private boolean vuvnUnVnUNnV;
   private int nnuUVNUuvvVU;
   private int nVVUuvuNnUN;
   private int nNnVnUNVV = -6357021;
   private int nuunNvv = -11341636;
   private NvVNvUvunNNu uUVVvVVNvvn = NvVNvUvunNNu.AURORA;
   private boolean vvUVNVvvNUv;
   private boolean UuNnnVnuNNV;
   private boolean uUVvnUuNvvN;
   private String UUuUnNVNuuv = "Socks5";
   private String NVuNUuVnVUN = "Proxy disabled";
   private int NVuunNnvvvVu;

   public UUnnuuNNvVV(class_437 var1) {
      super(class_2561.method_43470("Proxy"));
      this.uUnuvNvvNU = var1;

      for (int var2 = 0; var2 < this.nvUVNnuu.length; var2++) {
         this.nvUVNnuu[var2] = new UUnnuuNNvVV.VUnuUnnuNvVu();
      }
   }

   protected void method_25426() {
      super.method_25426();
      this.uVUVnuvnuVuv = System.nanoTime();
      this.NVNnnvnuunNv = this.uVUVnuvnuVuv;
      this.uVunuUNVVUUV = this.uVUVnuvnuVuv;
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = false;
      this.vuvnUnVnUNnV = false;
      this.nnuUVNUuvvVU = 0;
      this.nVVUuvuNnUN = 0;
      this.vNVuvnUUnuUn.UuUVuuUu(0.0F);
      this.UvnvNVnnnnNU.UuUVuuUu(0.0F);
      if (!this.UuNnnVnuNNV) {
         nuVnVuunU.NVnVnNnN var1 = nuVnVuunU.uUnuvNvvNU();
         this.uUVvnUuNvvN = var1.enabled();
         this.UUuUnNVNuuv = nuVnVuunU.C00OOC00oO(var1.type());
         this.uNNnnnuuuN.nNvNUVU = var1.host();
         this.nuUnNvnuUu.nNvNUVU = var1.port();
         this.VVuuUN.nNvNUVU = var1.username();
         this.vNUvnnVnUvu.nNvNUVU = var1.password();

         for (UUnnuuNNvVV.VvunVVUvUNnv var3 : this.uVUuuVnNVU) {
            var3.UnUNuUU = var3.nNvNUVU.length();
         }

         this.NVuNUuVnVUN = this.uUVvnUuNvvN ? "Proxy enabled" : "Proxy disabled";
         this.UuNnnVnuNNV = true;
      }

      for (UUnnuuNNvVV.VvunVVUvUNnv var6 : this.uVUuuVnNVU) {
         var6.uNNnnnuuuN();
      }

      for (UUnnuuNNvVV.nvnNNunvv var7 : this.vuuuNvNuv) {
         var7.UuUVuuUu();
      }
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      this.UuUVuuUu(var2, var3, var4, false);
   }

   @Override
   public void UuUVuuUu(int var1, int var2, float var3) {
      this.UuUVuuUu(var1, var2, var3, true);
   }

   private void UuUVuuUu(int var1, int var2, float var3, boolean var4) {
      class_1041 var5 = this.field_22787 == null ? null : this.field_22787.method_22683();
      if (var5 != null && !var5.method_65966() && var5.method_4489() > 0 && var5.method_4506() > 0) {
         int var6 = var5.method_4489();
         int var7 = var5.method_4506();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.NVNnnvnuunNv) / 1.0E9F));
         this.NVNnnvnuunNv = var8;
         this.UNnVVNvvnVvU = (float)(var8 - this.uVUVnuvnuVuv) / 1.0E9F;
         if (this.UuUVuuUu(var5, var6, var7, var1, var2, var8)) {
            var10 = 0.001F;
         }

         this.uNNnnnuuuN();
         this.UuUVuuUu(var5, var1, var2, var10, var8);
         this.C00OOC00oO(var6, var7, var10);
         this.nuUnNvnuUu();
         float var11 = (this.uNnUnnuNUnNu / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.NnUuNNU / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.vNVuvnUUnuUn.UuUVuuUu(var11, var10);
         float var14 = this.UvnvNVnnnnNU.UuUVuuUu(var12, var10);
         this.UuUVuuUu(var6, var7, var13, var14, var10);
         int var15 = GL11.glGetInteger(36006);
         this.UuUVuuUu(var6, var7, var15, var13, var14, var8);
         if (var4) {
            VvuuVNVUn.C00OOC00oO(this.nUUVuvU);

            try {
               this.vVvUvVVuuNvV.UuUVuuUu(this.UuuNnUvUuv);
            } finally {
               VvuuVNVUn.uUnuvNvvNU(this.nUUVuvU);
            }

            this.UuUVuuUu(this.UuuNnUvUuv);
         }
      }
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25422() {
      return false;
   }

   public void method_25419() {
      this.UuUVuuUu(UUnnuuNNvVV.NVnVnNnN.BACK);
   }

   public void method_25432() {
      this.NVuunNnvvvVu++;
      this.vVvUvVVuuNvV.close();
      super.method_25432();
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (var5 == 0 && this.field_22787 != null && this.field_22787.method_22683() != null) {
         float var6 = this.UuUVuuUu(this.field_22787.method_22683(), var1);
         float var7 = this.C00OOC00oO(this.field_22787.method_22683(), var3);

         for (UUnnuuNNvVV.VvunVVUvUNnv var9 : this.uVUuuVnNVU) {
            if (var9.UuUVuuUu(var6, var7)) {
               this.UuUVuuUu(var9);
               var9.UuuNnUvUuv = 1.0F;
               return true;
            }
         }

         this.uUnuvNvvNU();

         for (UUnnuuNNvVV.nvnNNunvv var11 : this.vuuuNvNuv) {
            if (var11.UuUVuuUu(var6, var7)) {
               var11.UuuNnUvUuv = 1.0F;
               var11.nUUVuvU = 1.0F;
               this.UuUVuuUu(var11.UNnVVNvvnVvU);
               return true;
            }
         }

         return true;
      } else {
         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25400(char var1, int var2) {
      UUnnuuNNvVV.VvunVVUvUNnv var3 = this.vVvUvVVuuNvV();
      if (var3 == null) {
         return super.method_25400(var1, var2);
      } else {
         if (var1 >= ' ' && var1 != 127) {
            var3.C00OOC00oO(String.valueOf(var1));
         }

         return true;
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      boolean var4 = (var3 & 2) != 0 || (var3 & 8) != 0;
      UUnnuuNNvVV.VvunVVUvUNnv var5 = this.vVvUvVVuuNvV();
      if (var1 == 256) {
         if (var5 != null) {
            this.uUnuvNvvNU();
            return true;
         } else {
            this.UuUVuuUu(UUnnuuNNvVV.NVnVnNnN.BACK);
            return true;
         }
      } else if (var1 == 258) {
         this.UuUVuuUu((var3 & 1) != 0 ? -1 : 1);
         return true;
      } else if (var5 != null) {
         if (var4) {
            if (var1 == 65) {
               var5.UvUvUNuvNU = true;
               return true;
            }

            if (var1 == 67) {
               if (this.field_22787 != null && this.field_22787.field_1774 != null && var5.UvUvUNuvNU) {
                  this.field_22787.field_1774.method_1455(var5.nNvNUVU);
               }

               return true;
            }

            if (var1 == 86) {
               if (this.field_22787 != null && this.field_22787.field_1774 != null) {
                  var5.C00OOC00oO(this.field_22787.field_1774.method_1460());
               }

               return true;
            }
         }

         if (var1 == 259) {
            var5.C00OOC00oO();
            return true;
         } else if (var1 == 261) {
            var5.uUnuvNvvNU();
            return true;
         } else if (var1 == 263) {
            var5.UvUvUNuvNU = false;
            var5.UnUNuUU = UuUVuuUu(var5.UnUNuUU - 1, 0, var5.nNvNUVU.length());
            return true;
         } else if (var1 == 262) {
            var5.UvUvUNuvNU = false;
            var5.UnUNuUU = UuUVuuUu(var5.UnUNuUU + 1, 0, var5.nNvNUVU.length());
            return true;
         } else if (var1 == 268) {
            var5.UvUvUNuvNU = false;
            var5.UnUNuUU = 0;
            return true;
         } else if (var1 == 269) {
            var5.UvUvUNuvNU = false;
            var5.UnUNuUU = var5.nNvNUVU.length();
            return true;
         } else if (var1 != 257 && var1 != 335) {
            return true;
         } else {
            this.UuUVuuUu(UUnnuuNNvVV.NVnVnNnN.SAVE);
            return true;
         }
      } else if (var4 && var1 == 86) {
         this.UuUVuuUu(UUnnuuNNvVV.NVnVnNnN.PASTE);
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return super.method_25404(var1, var2, var3);
      } else {
         this.UuUVuuUu(UUnnuuNNvVV.NVnVnNnN.SAVE);
         return true;
      }
   }

   private void UuUVuuUu(UUnnuuNNvVV.NVnVnNnN var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var2 != null) {
         switch (var1) {
            case TYPE:
               this.UUuUnNVNuuv = "Socks5".equals(this.UUuUnNVNuuv) ? "Socks4" : "Socks5";
               this.NVuNUuVnVUN = this.UUuUnNVNuuv + " selected";
               break;
            case ENABLED:
               this.uUVvnUuNvvN = !this.uUVvnUuNvvN;
               if (this.uUVvnUuNvvN) {
                  this.NVuNUuVnVUN = "Proxy enabled";
               } else {
                  nuVnVuunU.UuUVuuUu(this.C00OOC00oO(false));
                  this.NVuNUuVnVUN = "Proxy disabled";
               }
               break;
            case PASTE:
               this.UuUVuuUu(var2);
               break;
            case TEST:
               this.C00OOC00oO(var2);
               break;
            case SAVE:
               this.UuUVuuUu(false);
               break;
            case BACK:
               var2.execute(() -> var2.method_1507(this.uUnuvNvvNU));
         }
      }
   }

   private void UuUVuuUu(class_310 var1) {
      String var2 = "";

      try {
         var2 = var1.field_1774 == null ? "" : var1.field_1774.method_1460();
      } catch (Throwable var4) {
      }

      nuVnVuunU.nvnNNunvv var3 = nuVnVuunU.UuUVuuUu(var2);
      if (!var3.host().isBlank() && !var3.port().isBlank()) {
         this.UUuUnNVNuuv = nuVnVuunU.C00OOC00oO(var3.type());
         this.uNNnnnuuuN.UuUVuuUu(var3.host());
         this.nuUnNvnuUu.UuUVuuUu(var3.port());
         this.VVuuUN.UuUVuuUu(var3.username());
         this.vNUvnnVnUvu.UuUVuuUu(var3.password());
         this.uUVvnUuNvvN = true;
         this.uUnuvNvvNU();
         this.NVuNUuVnVUN = "Proxy imported";
      } else {
         this.NVuNUuVnVUN = "Clipboard has no proxy";
      }
   }

   private void C00OOC00oO(class_310 var1) {
      this.C00OOC00oO();
      nuVnVuunU.NVnVnNnN var2 = this.C00OOC00oO(true);
      String var3 = nuVnVuunU.UuUVuuUu(var2, true);
      if (var3 != null) {
         this.NVuNUuVnVUN = var3;
      } else {
         int var4 = ++this.NVuunNnvvvVu;
         this.NVuNUuVnVUN = "Checking proxy...";
         nuVnVuunU.UuUVuuUu(var2, "mc.funtime.su", 25565, 8000).whenComplete((var4x, var5) -> var1.execute(() -> {
            if (var4 == this.NVuunNnvvvVu) {
               if (var5 != null) {
                  this.NVuNUuVnVUN = "Proxy failed: " + var5.getClass().getSimpleName();
               } else {
                  if (var4x.success()) {
                     this.uUVvnUuNvvN = true;
                     nuVnVuunU.UuUVuuUu(var2);
                     this.NVuNUuVnVUN = "Proxy OK and enabled: " + var4x.millis() + " ms";
                  } else {
                     this.NVuNUuVnVUN = "Proxy failed: " + var4x.message();
                  }
               }
            }
         }));
      }
   }

   private void UuUVuuUu(boolean var1) {
      this.C00OOC00oO();
      nuVnVuunU.NVnVnNnN var2 = this.C00OOC00oO(true);
      String var3 = nuVnVuunU.UuUVuuUu(var2, true);
      if (var3 != null) {
         this.NVuNUuVnVUN = var3;
      } else {
         this.uUVvnUuNvvN = true;
         nuVnVuunU.UuUVuuUu(var2);
         this.NVuNUuVnVUN = "Proxy saved and enabled";
         if (var1 && this.field_22787 != null) {
            this.field_22787.method_1507(this.uUnuvNvvNU);
         }
      }
   }

   private void C00OOC00oO() {
      String var1 = this.uNNnnnuuuN.nNvNUVU;
      nuVnVuunU.nvnNNunvv var2 = nuVnVuunU.UuUVuuUu(var1);
      if (!var2.host().isBlank()) {
         this.uNNnnnuuuN.UuUVuuUu(var2.host());
         if (!var2.port().isBlank()) {
            this.nuUnNvnuUu.UuUVuuUu(var2.port());
         }

         if (!var2.username().isBlank()) {
            this.VVuuUN.UuUVuuUu(var2.username());
         }

         if (!var2.password().isBlank()) {
            this.vNUvnnVnUvu.UuUVuuUu(var2.password());
         }

         this.UUuUnNVNuuv = nuVnVuunU.C00OOC00oO(var2.type());
      } else {
         nuVnVuunU.nvnNNunvv var3 = nuVnVuunU.UuUVuuUu(this.uNNnnnuuuN.nNvNUVU + ":" + this.nuUnNvnuUu.nNvNUVU);
         if (!var3.host().isBlank()) {
            this.uNNnnnuuuN.UuUVuuUu(var3.host());
         }
      }
   }

   private nuVnVuunU.NVnVnNnN C00OOC00oO(boolean var1) {
      return new nuVnVuunU.NVnVnNnN(var1, this.UUuUnNVNuuv, this.uNNnnnuuuN.nNvNUVU, this.nuUnNvnuUu.nNvNUVU, this.VVuuUN.nNvNUVU, this.vNUvnnVnUvu.nNvNUVU);
   }

   private void UuUVuuUu(UUnnuuNNvVV.VvunVVUvUNnv var1) {
      for (UUnnuuNNvVV.VvunVVUvUNnv var3 : this.uVUuuVnNVU) {
         var3.uUVuVvuNUvnu = var3 == var1;
         var3.UvUvUNuvNU = false;
         if (var3.uUVuVvuNUvnu) {
            var3.UnUNuUU = var3.nNvNUVU.length();
         }
      }
   }

   private void UuUVuuUu(int var1) {
      UUnnuuNNvVV.VvunVVUvUNnv var2 = this.vVvUvVVuuNvV();
      int var3 = var2 == null ? (var1 > 0 ? -1 : this.uVUuuVnNVU.size()) : this.uVUuuVnNVU.indexOf(var2);
      int var4 = Math.floorMod(var3 + var1, this.uVUuuVnNVU.size());
      this.UuUVuuUu(this.uVUuuVnNVU.get(var4));
   }

   private void uUnuvNvvNU() {
      for (UUnnuuNNvVV.VvunVVUvUNnv var2 : this.uVUuuVnNVU) {
         var2.uUVuVvuNUvnu = false;
         var2.UvUvUNuvNU = false;
      }
   }

   private UUnnuuNNvVV.VvunVVUvUNnv vVvUvVVuuNvV() {
      for (UUnnuuNNvVV.VvunVVUvUNnv var2 : this.uVUuuVnNVU) {
         if (var2.uUVuVvuNUvnu) {
            return var2;
         }
      }

      return null;
   }

   private void uNNnnnuuuN() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.AURORA;
      this.uUVVvVVNvvn = var1;
      this.vvUVNVvvNUv = UuUVuuUu.uUnuvNvvNU(var1);
      this.nNnVnUNVV = UuUVuuUu.vVvUvVVuuNvV(var1);
      this.nuunNvv = UuUVuuUu.uNNnnnuuuN(var1);
   }

   private boolean UuUVuuUu(class_1041 var1, int var2, int var3, int var4, int var5, long var6) {
      if (this.nnuUVNUuvvVU == var2 && this.nVVUuvuNnUN == var3) {
         return false;
      } else {
         this.nnuUVNUuvvVU = var2;
         this.nVVUuvuNnUN = var3;
         float var8 = C00OOC00oO(this.UuUVuuUu(var1, var4), 0.0F, (float)var2);
         float var9 = C00OOC00oO(this.C00OOC00oO(var1, var5), 0.0F, (float)var3);
         this.uNnUnnuNUnNu = this.uUVuVvuNUvnu = this.unNNVVNnvvV = var8;
         this.NnUuNNU = this.UvUvUNuvNU = this.NuunnvnN = var9;
         this.nNvNUVU = this.UnUNuUU = 0.0F;
         this.c0oOOCcCoC0 = this.VVnVNnunVvu = 0.0F;
         this.NVUunUNUN = true;
         this.UUVNuUNUvUnV = true;
         this.vuvnUnVnUNnV = true;
         this.uVunuUNVVUUV = var6;
         this.vNVuvnUUnuUn.UuUVuuUu(0.0F);
         this.UvnvNVnnnnNU.UuUVuuUu(0.0F);
         this.VVuuUN();
         this.UuUVuuUu(var8, var9, 0.12F);
         return true;
      }
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, float var4, long var5) {
      float var7 = this.UuUVuuUu(var1, var2);
      float var8 = this.C00OOC00oO(var1, var3);
      if (!this.NVUunUNUN) {
         this.uNnUnnuNUnNu = var7;
         this.NnUuNNU = var8;
         this.nNvNUVU = 0.0F;
         this.UnUNuUU = 0.0F;
         this.NVUunUNUN = true;
      } else {
         float var9 = var7 - this.uNnUnnuNUnNu;
         float var10 = var8 - this.NnUuNNU;
         float var11 = C00OOC00oO(var9, var10);
         if (var11 > 0.2F) {
            this.nNvNUVU = C00OOC00oO(var9 / Math.max(1.0F, (float)var1.method_4489()) / var4, -3.0F, 3.0F);
            this.UnUNuUU = C00OOC00oO(var10 / Math.max(1.0F, (float)var1.method_4506()) / var4, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, var4);
            this.nNvNUVU *= var12;
            this.UnUNuUU *= var12;
         }

         this.uNnUnnuNUnNu = var7;
         this.NnUuNNU = var8;
         if (var11 > 1.5F) {
            this.uVunuUNVVUUV = var5;
         }
      }
   }

   private void C00OOC00oO(int var1, int var2, float var3) {
      if (!this.UUVNuUNUvUnV) {
         this.uUVuVvuNUvnu = this.uNnUnnuNUnNu;
         this.UvUvUNuvNU = this.NnUuNNU;
         this.c0oOOCcCoC0 = 0.0F;
         this.VVnVNnunVvu = 0.0F;
         this.UUVNuUNUvUnV = true;
      } else {
         float var4 = this.uUVuVvuNUvnu;
         float var5 = this.UvUvUNuvNU;
         float var6 = C00OOC00oO(this.uNnUnnuNUnNu - this.uUVuVvuNUvnu, this.NnUuNNU - this.UvUvUNuvNU);
         float var7 = (1.0F - (float)Math.pow(3.5E-5F, var3)) * (0.72F + C00OOC00oO(var6 / 520.0F, 0.0F, 0.42F));
         this.uUVuVvuNUvnu = this.uUVuVvuNUvnu + (this.uNnUnnuNUnNu - this.uUVuVvuNUvnu) * C00OOC00oO(var7, 0.05F, 0.26F);
         this.UvUvUNuvNU = this.UvUvUNuvNU + (this.NnUuNNU - this.UvUvUNuvNU) * C00OOC00oO(var7, 0.05F, 0.26F);
         float var8 = C00OOC00oO((this.uUVuVvuNUvnu - var4) / Math.max(1.0F, (float)var1) / var3, -1.8F, 1.8F);
         float var9 = C00OOC00oO((this.UvUvUNuvNU - var5) / Math.max(1.0F, (float)var2) / var3, -1.8F, 1.8F);
         float var10 = 1.0F - (float)Math.pow(0.0025F, var3);
         this.c0oOOCcCoC0 = this.c0oOOCcCoC0 + (var8 - this.c0oOOCcCoC0) * var10;
         this.VVnVNnunVvu = this.VVnVNnunVvu + (var9 - this.VVnVNnunVvu) * var10;
      }
   }

   private void nuUnNvnuUu() {
      if (cCOo0cOcO.uUnuvNvvNU() && Menu.UuUVuuUu(Menu.NVuNUuVnVUN)) {
         if (!this.vuvnUnVnUNnV) {
            this.unNNVVNnvvV = this.uUVuVvuNUvnu;
            this.NuunnvnN = this.UvUvUNuvNU;
            this.vuvnUnVnUNnV = true;
            this.UuUVuuUu(this.uUVuVvuNUvnu, this.UvUvUNuvNU, 0.3F);
         } else {
            float var1 = C00OOC00oO(this.uUVuVvuNUvnu - this.unNNVVNnvvV, this.UvUvUNuvNU - this.NuunnvnN);
            if (var1 > 5.5F) {
               this.UuUVuuUu(this.uUVuVvuNUvnu, this.UvUvUNuvNU, C00OOC00oO(var1 / 190.0F, 0.1F, 0.48F));
               this.unNNVVNnvvV = this.uUVuVvuNUvnu;
               this.NuunnvnN = this.UvUvUNuvNU;
            }
         }
      }
   }

   private void VVuuUN() {
      for (UUnnuuNNvVV.VUnuUnnuNvVu var4 : this.nvUVNnuu) {
         var4.UuUVuuUu = 0.0F;
         var4.C00OOC00oO = 0.0F;
         var4.uUnuvNvvNU = -100.0F;
         var4.vVvUvVVuuNvV = 0.0F;
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.nvUVNnuu.length; var6++) {
         float var7 = this.UNnVVNvvnVvU - this.nvUVNnuu[var6].uUnuvNvvNU;
         if (this.nvUVNnuu[var6].vVvUvVVuuNvV <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.nvUVNnuu[var4].UuUVuuUu = var1;
      this.nvUVNnuu[var4].C00OOC00oO = var2;
      this.nvUVNnuu[var4].uUnuvNvvNU = this.UNnVVNvvnVvU;
      this.nvUVNnuu[var4].vVvUvVVuuNvV = var3;
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5) {
      float var6 = UuUVuuUu(var1, var2);
      boolean var7 = var1 < 980.0F * var6;
      float var8 = 46.0F * var6;
      float var9 = 18.0F * var6;
      float var10 = 16.0F * var6;
      float var11 = var7 ? C00OOC00oO(var1 * 0.68F, 300.0F * var6, 520.0F * var6) : C00OOC00oO(var1 * 0.2F, 280.0F * var6, 410.0F * var6);
      float var12 = var7 ? var11 : var11 * 2.0F + var10;
      float var13 = 42.0F * var6;
      float var14 = 10.0F * var6;
      float var15 = var7 ? (var12 - var14) * 0.5F : C00OOC00oO(var1 * 0.072F, 96.0F * var6, 128.0F * var6);
      int var16 = var7 ? 2 : 6;
      int var17 = var7 ? 3 : 1;
      float var18 = var16 * var15 + (var16 - 1) * var14;
      float var19 = var7 ? this.uVUuuVnNVU.size() * var8 + (this.uVUuuVnNVU.size() - 1) * var9 : var8 * 2.0F + var9;
      float var20 = var17 * var13 + (var17 - 1) * var14;
      float var21 = var19 + 34.0F * var6 + var20;
      float var22 = var1 * 0.5F + var3 * 1.35F * var6;
      float var23 = var2 * 0.305F + var4 * 0.92F * var6;
      if (var23 + var21 > var2 - 58.0F * var6) {
         var23 = var2 - var21 - 58.0F * var6;
      }

      var23 = Math.max(var2 * 0.21F, var23);
      float var24 = var22 - var12 * 0.5F;

      for (int var25 = 0; var25 < this.uVUuuVnNVU.size(); var25++) {
         UUnnuuNNvVV.VvunVVUvUNnv var26 = this.uVUuuVnNVU.get(var25);
         int var27 = var7 ? 0 : var25 % 2;
         int var28 = var7 ? var25 : var25 / 2;
         float var29 = var24 + var27 * (var11 + var10);
         float var30 = var23 + var28 * (var8 + var9);
         this.UuUVuuUu(var26, var29, var30, var11, var8, var8 * 0.5F, var5, var6);
      }

      float var32 = var22 - var18 * 0.5F;
      float var33 = var23 + var19 + 34.0F * var6;

      for (int var34 = 0; var34 < this.vuuuNvNuv.size(); var34++) {
         UUnnuuNNvVV.nvnNNunvv var35 = this.vuuuNvNuv.get(var34);
         int var36 = var34 % var16;
         int var37 = var34 / var16;
         var35.UuUVuuUu = this.C00OOC00oO(var35.UNnVVNvvnVvU);
         var35.uUnuvNvvNU = var32 + var36 * (var15 + var14);
         var35.vVvUvVVuuNvV = var33 + var37 * (var13 + var14);
         var35.VVuuUN = var15;
         var35.vNUvnnVnUvu = var13;
         var35.uVUuuVnNVU = var13 * 0.5F;
         var35.NVNnnvnuunNv = 46.0F * var6;
         var35.uVunuUNVVUUV = uUnuvNvvNU(C00OOC00oO((this.UNnVVNvvnVvU - 0.32F - var34 * 0.035F) / 0.76F, 0.0F, 1.0F));
         this.UuUVuuUu(var35, var5, var6);
      }
   }

   private void UuUVuuUu(UUnnuuNNvVV.VvunVVUvUNnv var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var1.uUnuvNvvNU = var2;
      var1.vVvUvVVuuNvV = var3;
      var1.VVuuUN = var4;
      var1.vNUvnnVnUvu = var5;
      var1.uVUuuVnNVU = var6;
      var1.NVNnnvnuunNv = 50.0F * var8;
      var1.uVunuUNVVUUV = uUnuvNvvNU(C00OOC00oO((this.UNnVVNvvnVvU - 0.22F - this.uVUuuVnNVU.indexOf(var1) * 0.04F) / 0.82F, 0.0F, 1.0F));
      this.UuUVuuUu(var1, var7, var8);
      var1.c0oOOCcCoC0 = var1.c0oOOCcCoC0 + ((var1.uUVuVvuNUvnu ? 1.0F : 0.0F) - var1.c0oOOCcCoC0) * (1.0F - (float)Math.pow(1.0E-4F, var7));
   }

   private void UuUVuuUu(UUnnuuNNvVV.nvUnvV var1, float var2, float var3) {
      float var4 = UuUVuuUu(this.uNnUnnuNUnNu, this.NnUuNNU, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV, var1.VVuuUN, var1.vNUvnnVnUvu, var1.uVUuuVnNVU);
      boolean var5 = var4 <= 0.0F;
      float var6 = 1.0F - uUnuvNvvNU(C00OOC00oO(Math.max(0.0F, var4) / Math.max(1.0F, 28.0F * var3), 0.0F, 1.0F));
      float var7 = var1 instanceof UUnnuuNNvVV.VvunVVUvUNnv var8 && var8.uUVuVvuNUvnu ? 0.52F : 0.0F;
      float var13 = Math.max(var5 ? Math.max(0.74F, var6) : var6 * 0.48F, var7);
      var1.vuuuNvNuv = var1.vuuuNvNuv + ((var5 ? 1.0F : 0.0F) - var1.vuuuNvNuv) * (1.0F - (float)Math.pow(1.0E-4F, var2));
      var1.nvUVNnuu = var1.nvUVNnuu + (var13 - var1.nvUVNnuu) * (1.0F - (float)Math.pow(1.4E-4F, var2));
      var1.UuuNnUvUuv = var1.UuuNnUvUuv + (0.0F - var1.UuuNnUvUuv) * (1.0F - (float)Math.pow(1.8E-5F, var2));
      var1.nUUVuvU = var1.nUUVuvU + (0.0F - var1.nUUVuvU) * (1.0F - (float)Math.pow(6.0E-6F, var2));
      float var9 = C00OOC00oO((this.uUVuVvuNUvnu - var1.uUnuvNvvNU) / Math.max(1.0F, var1.VVuuUN), 0.0F, 1.0F);
      float var10 = C00OOC00oO((this.UvUvUNuvNU - var1.vVvUvVVuuNvV) / Math.max(1.0F, var1.vNUvnnVnUvu), 0.0F, 1.0F);
      float var11 = 1.0F - (float)Math.pow(2.2E-4F, var2);
      var1.vNVuvnUUnuUn = var1.vNVuvnUUnuUn + (var9 - var1.vNVuvnUUnuUn) * var11;
      var1.UvnvNVnnnnNU = var1.UvnvNVnnnnNU + (var10 - var1.UvnvNVnnnnNU) * var11;
      float var12 = 1.0F + var1.nvUVNnuu * 0.04F - var1.UuuNnUvUuv * 0.065F + var7 * 0.018F;
      var1.UnUNVVVNuv = var1.C00OOC00oO.UuUVuuUu(var12, var2);
      var1.uNNnnnuuuN = var1.uUnuvNvvNU + (var1.vNVuvnUUnuUn - 0.5F) * 5.0F * var3 * var1.nvUVNnuu;
      var1.nuUnNvnuUu = var1.vVvUvVVuuNvV + (var1.UvnvNVnnnnNU - 0.5F) * 3.5F * var3 * var1.nvUVNnuu - var1.vuuuNvNuv * 1.2F * var3;
      var1.uVUVnuvnuVuv = C00OOC00oO(
         C00OOC00oO(this.c0oOOCcCoC0, this.VVnVNnunVvu) * 0.42F * var1.nvUVNnuu + Math.abs(var1.C00OOC00oO.C00OOC00oO()) * 0.04F, 0.0F, 1.0F
      );
   }

   private void UuUVuuUu(int var1, int var2, int var3, float var4, float var5, long var6) {
      float var8 = Math.max(0.0F, (float)(var6 - this.uVunuUNVVUUV) / 1.0E9F);
      float var9 = C00OOC00oO(C00OOC00oO(this.c0oOOCcCoC0, this.VVnVNnunVvu), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.28F), C00OOC00oO(var9 * 0.24F, 0.0F, 1.0F));
      float var11 = uUnuvNvvNU(C00OOC00oO(this.UNnVVNvvnVvU / 0.88F, 0.0F, 1.0F));
      float var12 = UuUVuuUu(var1, var2);
      float var13 = 0.0F;
      int var14 = 0;

      for (UUnnuuNNvVV.VvunVVUvUNnv var16 : this.uVUuuVnNVU) {
         this.UuUVuuUu(var14++, var16, var16.uVunuUNVVUUV);
         var13 = Math.max(var13, var16.nUUVuvU);
      }

      for (UUnnuuNNvVV.nvnNNunvv var20 : this.vuuuNvNuv) {
         this.UuUVuuUu(var14++, var20, var20.uVunuUNVVUUV);
         var13 = Math.max(var13, var20.nUUVuvU);
      }

      this.UuuNnUvUuv.uVUuuVnNVU(var14);

      for (int var19 = 0; var19 < 14; var19++) {
         UUnnuuNNvVV.VUnuUnnuNvVu var21 = this.nvUVNnuu[var19];
         float var17 = Math.max(0.0F, this.UNnVVNvvnVvU - var21.uUnuvNvvNU);
         this.UuuNnUvUuv
            .vuuuNvNuv(var19)
            .UuUVuuUu(
               var21.UuUVuuUu / Math.max(1.0F, (float)var1), var21.C00OOC00oO / Math.max(1.0F, (float)var2), var17, var17 > 3.1F ? 0.0F : var21.vVvUvVVuuNvV
            );
      }

      this.UuuNnUvUuv.vNUvnnVnUvu().UuUVuuUu(0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      this.UuuNnUvUuv.UuUVuuUu(var1, var2, var3, this.UNnVVNvvnVvU * 0.58F, this.UNnVVNvvnVvU * 0.58F);
      this.UuuNnUvUuv.UuUVuuUu(this.uUVuVvuNUvnu, this.UvUvUNuvNU, this.c0oOOCcCoC0 * 0.56F, this.VVnVNnunVvu * 0.56F, var9 * 0.56F, 0.0F);
      this.UuuNnUvUuv.UuUVuuUu(this.nNnVnUNVV, this.nuunNvv);
      this.UuuNnUvUuv.C00OOC00oO(-var4 * 8.0E-4F, -var5 * 6.2E-4F, var4 * 0.92F * var12, var5 * 0.78F * var12, var4 * 1.25F * var12, var5 * 1.05F * var12);
      this.UuuNnUvUuv.uUnuvNvvNU(var10 * 0.64F, var10 > 0.1F ? 0.86F : 0.74F, 0.0F, 0.0F, 0.56F + var11 * 0.24F, C00OOC00oO(var13, 0.0F, 1.0F));
      this.UuuNnUvUuv
         .UuUVuuUu(
            this.uUVVvVVNvvn == NvVNvUvunNNu.SAKURA_BREEZE,
            this.uUVVvVVNvvn == NvVNvUvunNNu.VERNAL_SOLSTICE,
            this.uUVVvVVNvvn == NvVNvUvunNNu.MIDNIGHT_AZURE,
            this.vvUVNVvvNUv
         );
   }

   private void UuUVuuUu(int var1, UUnnuuNNvVV.nvUnvV var2, float var3) {
      this.UuuNnUvUuv
         .UuUVuuUu(var1)
         .UuUVuuUu(
            var2.UuUVuuUu,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var2.vNUvnnVnUvu,
            var2.uVUuuVnNVU,
            var2.vuuuNvNuv,
            var2.nvUVNnuu,
            var2.UuuNnUvUuv,
            var3,
            var2.nUUVuvU,
            var2.NVNnnvnuunNv,
            var2.UnUNVVVNuv,
            var2.vNVuvnUUnuUn,
            var2.UvnvNVnnnnNU,
            var2.uVUVnuvnuVuv
         );
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      try {
         ru.metaculture.protection.NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var2 == null) {
            return;
         }

         VvuuVNVUn.C00OOC00oO(this.UnUNVVVNuv);

         try {
            var2.UuUVuuUu(var1.vuuuNvNuv(), var1.nvUVNnuu());
            float var3 = UuUVuuUu(var1.vuuuNvNuv(), var1.nvUVNnuu());
            float var4 = uUnuvNvvNU(C00OOC00oO(this.UNnVVNvvnVvU / 0.82F, 0.0F, 1.0F));
            float var5 = var1.vuuuNvNuv() * 0.5F + var1.vuvnUnVnUNnV() * 0.12F;
            float var6 = var1.nvUVNnuu() * 0.126F + var1.nnuUVNUuvvVU() * 0.08F;
            var2.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var5, var6, 40.0F * var3, "Proxy", this.UuUVuuUu(0.94F * var4), "c");
            var2.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu, var5, var6 + 30.0F * var3, 24.0F * var3, this.UUuUnNVNuuv + "  /  " + this.NVuNUuVnVUN, this.C00OOC00oO(0.52F * var4), "c"
            );

            for (UUnnuuNNvVV.VvunVVUvUNnv var8 : this.uVUuuVnNVU) {
               this.UuUVuuUu(var2, var8, var3);
            }

            for (UUnnuuNNvVV.nvnNNunvv var15 : this.vuuuNvNuv) {
               this.UuUVuuUu(var2, var15, var3);
            }

            this.UuUVuuUu(var2, var1, var3);
            var2.C00OOC00oO();
         } finally {
            VvuuVNVUn.uUnuvNvvNU(this.UnUNVVVNuv);
         }
      } catch (Throwable var13) {
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, VvVVnnNNNuV.VUuUUNnnuvuv var2, float var3) {
      String var4 = this.vNUvnnVnUvu();
      if (!var4.isBlank()) {
         float var5 = 25.0F * var3;
         float var6 = var2.vuuuNvNuv() * 0.5F;
         float var7 = var2.nvUVNnuu() - 30.0F * var3;
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var7, var5, var4, this.C00OOC00oO(0.4F * var2.vvUVNVvvNUv()), "c");
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, UUnnuuNNvVV.VvunVVUvUNnv var2, float var3) {
      float var4 = var2.uVunuUNVVUUV;
      String var5 = var2.UNnVVNvvnVvU ? "*".repeat(var2.nNvNUVU.length()) : var2.nNvNUVU;
      boolean var6 = var5.isBlank();
      float var7 = 22.0F * var3;
      float var8 = var2.uNNnnnuuuN + var7;
      float var9 = Math.max(8.0F * var3, var2.VVuuUN - var7 * 2.0F);
      float var10 = 25.0F * var3;
      boolean var11 = var6 && !var2.uUVuVvuNUvnu;
      String var12 = var11 ? var2.UuUVuuUu : var5;
      int var13 = var11 ? this.C00OOC00oO(0.42F * var4) : this.UuUVuuUu((0.78F + var2.c0oOOCcCoC0 * 0.18F) * var4);
      if (!var6 || var2.uUVuVvuNUvnu) {
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu,
            var2.uNNnnnuuuN + 18.0F * var3,
            var2.nuUnNvnuUu - 7.0F * var3,
            20.0F * var3,
            var2.UuUVuuUu,
            this.C00OOC00oO((0.3F + var2.c0oOOCcCoC0 * 0.28F) * var4)
         );
      }

      var1.UuUVuuUu(
         var8,
         var2.nuUnNvnuUu + 3.0F * var3,
         var9,
         var2.vNUvnnVnUvu - 6.0F * var3,
         var2.uVUuuVnNVU * 0.55F,
         var2.uVUuuVnNVU * 0.55F,
         var2.uVUuuVnNVU * 0.55F,
         var2.uVUuuVnNVU * 0.55F
      );
      if (!var12.isBlank()) {
         if (var11) {
            UuUVuuUu(var1, vNvnnVvvVUu.UuUVuuUu, var2.uNNnnnuuuN, var2.nuUnNvnuUu, var2.VVuuUN, var2.vNUvnnVnUvu, var10, var12, var13);
         } else {
            float var14 = UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var10, var2.nuUnNvnuUu, var2.vNUvnnVnUvu);
            if (var2.UvUvUNuvNU) {
               float var15 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12, var10).UuUVuuUu;
               var1.UuUVuuUu(
                  vVvUvVVuuNvV(var8 - var2.unNNVVNnvvV - 2.0F * var3),
                  var2.nuUnNvnuUu + var2.vNUvnnVnUvu * 0.25F,
                  var15 + 4.0F * var3,
                  var2.vNUvnnVnUvu * 0.5F,
                  2.0F * var3,
                  UuUVuuUu(0.25F, 0.55F, 0.95F, 0.45F * var4)
               );
            }

            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, vVvUvVVuuNvV(var8 - var2.unNNVVNnvvV), vVvUvVVuuNvV(var14), var10, var12, var13);
         }
      }

      if (var2.uUVuVvuNUvnu) {
         int var24 = UuUVuuUu(var2.UnUNuUU, 0, var5.length());
         String var25 = var5.substring(0, var24);
         float var16 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var25, var10).UuUVuuUu;
         if (var2.UvUvUNuvNU) {
            var16 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, var10).UuUVuuUu;
         }

         float var17 = var2.unNNVVNnvvV;
         float var18 = var9 - 9.0F * var3;
         if (var16 - var17 > var18) {
            var17 = var16 - var18;
         }

         if (var16 - var17 < 0.0F) {
            var17 = var16;
         }

         var17 = Math.max(0.0F, var17);
         var2.unNNVVNnvvV = var2.unNNVVNnvvV + (var17 - var2.unNNVVNnvvV) * 0.3F;
         var2.VVnVNnunVvu = var2.VVnVNnunVvu + (var16 - var2.VVnVNnunVvu) * 0.3F;
         float var19 = 0.54F + 0.46F * (float)Math.sin(this.UNnVVNvvnVvU * 5.4F);
         if (!var2.UvUvUNuvNU) {
            int var20 = UuUVuuUu(this.nuunNvv, this.nNnVnUNVV, var19, (0.42F + var19 * 0.36F) * var4);
            float var21 = var8 + var2.VVnVNnunVvu - var2.unNNVVNnvvV + 2.0F * var3;
            float var22 = 20.0F * var3;
            float var23 = var2.nuUnNvnuUu + (var2.vNUvnnVnUvu - var22) * 0.5F;
            var1.UuUVuuUu(vVvUvVVuuNvV(var21), vVvUvVVuuNvV(var23), Math.max(1.25F * var3, 1.0F), var22, 1.0F * var3, var20);
         }

         var1.UuUVuuUu(
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var2.vNUvnnVnUvu,
            var2.uVUuuVnNVU,
            UuUVuuUu(this.nuunNvv, this.nNnVnUNVV, var19, 0.24F * var4 * (0.35F + var2.c0oOOCcCoC0 * 0.65F)),
            1.0F * var3
         );
      }

      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(UnVNvNnU var1, UUnnuuNNvVV.nvnNNunvv var2, float var3) {
      float var4 = var2.uVunuUNVVUUV * 0.9F;
      String var5 = UuUVuuUu(var2.UuUVuuUu, var2.VVuuUN - 18.0F * var3, 24.0F * var3, vNvnnVvvVUu.UuUVuuUu);
      UuUVuuUu(var1, vNvnnVvvVUu.UuUVuuUu, var2.uNNnnnuuuN, var2.nuUnNvnuUu, var2.VVuuUN, var2.vNUvnnVnUvu, 24.0F * var3, var5, this.UuUVuuUu(var4));
   }

   private String C00OOC00oO(UUnnuuNNvVV.NVnVnNnN var1) {
      return switch (var1) {
         case TYPE -> this.UUuUnNVNuuv;
         case ENABLED -> this.uUVvnUuNvvN ? "Enabled" : "Disabled";
         case PASTE -> "Paste";
         case TEST -> "Test";
         case SAVE -> "Save";
         case BACK -> "Back";
      };
   }

   private String vNUvnnVnUvu() {
      String var1 = this.uNNnnnuuuN.nNvNUVU.trim();
      String var2 = this.nuUnNvnuUu.nNvNUVU.trim();
      if (var1.isBlank() || var2.isBlank()) {
         return "";
      } else {
         return "Socks5".equals(this.UUuUnNVNuuv) && !this.VVuuUN.nNvNUVU.isBlank()
            ? this.VVuuUN.nNvNUVU + ":" + "*".repeat(Math.min(10, this.vNUvnnVnUvu.nNvNUVU.length())) + "@" + var1 + ":" + var2
            : var1 + ":" + var2;
      }
   }

   private int UuUVuuUu(float var1) {
      return this.vvUVNVvvNUv ? UuUVuuUu(0.1F, 0.1F, 0.1F, var1) : UuUVuuUu(1.0F, 1.0F, 1.0F, var1);
   }

   private int C00OOC00oO(float var1) {
      return this.vvUVNVvvNUv ? UuUVuuUu(0.4F, 0.4F, 0.4F, var1) : UuUVuuUu(0.8F, 0.86F, 0.9F, var1);
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUVnuvUu var1, float var2, float var3, float var4, float var5, float var6, String var7, int var8) {
      String var9 = var7 == null ? "" : var7;
      float var10 = UnVNvNnU.UuUVuuUu(var1, var9, var6).UuUVuuUu;
      float var11 = vVvUvVVuuNvV(var2 + (var4 - var10) * 0.5F);
      float var12 = vVvUvVVuuNvV(UuUVuuUu(var1, var6, var3, var5));
      var0.UuUVuuUu(var1, var11, var12, var6, var9, var8);
   }

   private float UuUVuuUu(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4489() / Math.max(1.0, (double)var1.method_4486()));
   }

   private float C00OOC00oO(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4506() / Math.max(1.0, (double)var1.method_4502()));
   }

   private static float UuUVuuUu(nUVnuvUu var0, float var1, float var2, float var3) {
      try {
         return var2 + var3 * 0.5F + vNvnnVvvVUu.UuUVuuUu(var0, 72, var1 * 0.5F);
      } catch (Throwable var5) {
         return var2 + var3 * 0.5F + var1 * 0.18F;
      }
   }

   private static String UuUVuuUu(String var0, float var1, float var2, nUVnuvUu var3) {
      if (var0 == null) {
         return "";
      } else if (var1 <= 0.0F) {
         return "";
      } else if (UnVNvNnU.UuUVuuUu(var3, var0, var2).UuUVuuUu <= var1) {
         return var0;
      } else {
         String var4 = "...";
         if (UnVNvNnU.UuUVuuUu(var3, var4, var2).UuUVuuUu > var1) {
            return "";
         } else {
            int var5 = 1;
            int var6 = var0.length();
            int var7 = 1;

            while (var5 <= var6) {
               int var8 = var5 + var6 >>> 1;
               if (UnVNvNnU.UuUVuuUu(var3, var0.substring(0, var8) + var4, var2).UuUVuuUu <= var1) {
                  var7 = var8;
                  var5 = var8 + 1;
               } else {
                  var6 = var8 - 1;
               }
            }

            return var0.substring(0, var7) + var4;
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1) {
      return C00OOC00oO(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.16F, 0.72F, 1.34F);
   }

   static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var2 + var4 * 0.5F;
      float var8 = var3 + var5 * 0.5F;
      float var9 = var4 * 0.5F - var6;
      float var10 = var5 * 0.5F - var6;
      float var11 = Math.abs(var0 - var7) - var9;
      float var12 = Math.abs(var1 - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - var6;
   }

   private static float C00OOC00oO(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static float uUnuvNvvNU(float var0) {
      float var1 = C00OOC00oO(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   static int UuUVuuUu(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float vVvUvVVuuNvV(float var0) {
      return Math.round(var0);
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      int var4 = Math.round(C00OOC00oO(var0, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(C00OOC00oO(var1, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(C00OOC00oO(var2, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(C00OOC00oO(var3, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int UuUVuuUu(int var0, int var1, float var2, float var3) {
      float var4 = C00OOC00oO(var2, 0.0F, 1.0F);
      int var5 = VnVnuUn.vVvUvVVuuNvV(var0, var1, var4);
      int var6 = Math.round(C00OOC00oO(var3, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static enum NVnVnNnN {
      TYPE,
      ENABLED,
      PASTE,
      TEST,
      SAVE,
      BACK;
   }

   static final class VUnuUnnuNvVu {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU = -100.0F;
      float vVvUvVVuuNvV;
   }

   static final class VvunVVUvUNnv extends UUnnuuNNvVV.nvUnvV {
      final boolean UNnVVNvvnVvU;
      private final int uNnUnnuNUnNu;
      private final UUnnuuNNvVV.uunvUUVnuNn NnUuNNU;
      String nNvNUVU = "";
      int UnUNuUU;
      boolean uUVuVvuNUvnu;
      boolean UvUvUNuvNU;
      float c0oOOCcCoC0;
      float VVnVNnunVvu;
      float unNNVVNnvvV;

      VvunVVUvUNnv(String var1, boolean var2, int var3, UUnnuuNNvVV.uunvUUVnuNn var4) {
         super(var1);
         this.UNnVVNvvnVvU = var2;
         this.uNnUnnuNUnNu = var3;
         this.NnUuNNU = var4;
      }

      void UuUVuuUu(String var1) {
         this.nNvNUVU = this.uUnuvNvvNU(var1 == null ? "" : var1);
         if (this.nNvNUVU.length() > this.uNnUnnuNUnNu) {
            this.nNvNUVU = this.nNvNUVU.substring(0, this.uNnUnnuNUnNu);
         }

         this.UnUNuUU = this.nNvNUVU.length();
         this.UvUvUNuvNU = false;
         this.VVnVNnunVvu = 0.0F;
         this.unNNVVNnvvV = 0.0F;
      }

      void C00OOC00oO(String var1) {
         String var2 = this.uUnuvNvvNU(var1 == null ? "" : var1);
         if (!var2.isEmpty()) {
            if (this.UvUvUNuvNU) {
               this.nNvNUVU = "";
               this.UnUNuUU = 0;
               this.UvUvUNuvNU = false;
            }

            int var3 = this.uNnUnnuNUnNu - this.nNvNUVU.length();
            if (var3 > 0) {
               if (var2.length() > var3) {
                  var2 = var2.substring(0, var3);
               }

               int var4 = UUnnuuNNvVV.UuUVuuUu(this.UnUNuUU, 0, this.nNvNUVU.length());
               this.nNvNUVU = this.nNvNUVU.substring(0, var4) + var2 + this.nNvNUVU.substring(var4);
               this.UnUNuUU = var4 + var2.length();
            }
         }
      }

      void C00OOC00oO() {
         if (this.UvUvUNuvNU) {
            this.vVvUvVVuuNvV();
         } else if (this.UnUNuUU > 0 && !this.nNvNUVU.isEmpty()) {
            int var1 = UUnnuuNNvVV.UuUVuuUu(this.UnUNuUU, 0, this.nNvNUVU.length());
            if (var1 > 0) {
               this.nNvNUVU = this.nNvNUVU.substring(0, var1 - 1) + this.nNvNUVU.substring(var1);
               this.UnUNuUU = var1 - 1;
            }
         }
      }

      void uUnuvNvvNU() {
         if (this.UvUvUNuvNU) {
            this.vVvUvVVuuNvV();
         } else {
            int var1 = UUnnuuNNvVV.UuUVuuUu(this.UnUNuUU, 0, this.nNvNUVU.length());
            if (var1 < this.nNvNUVU.length()) {
               this.nNvNUVU = this.nNvNUVU.substring(0, var1) + this.nNvNUVU.substring(var1 + 1);
               this.UnUNuUU = var1;
            }
         }
      }

      private void vVvUvVVuuNvV() {
         this.nNvNUVU = "";
         this.UnUNuUU = 0;
         this.VVnVNnunVvu = 0.0F;
         this.unNNVVNnvvV = 0.0F;
         this.UvUvUNuvNU = false;
      }

      void uNNnnnuuuN() {
         this.UuUVuuUu();
         this.uUVuVvuNUvnu = false;
         this.UvUvUNuvNU = false;
         this.c0oOOCcCoC0 = 0.0F;
         this.VVnVNnunVvu = 0.0F;
         this.unNNVVNnvvV = 0.0F;
         this.UnUNuUU = UUnnuuNNvVV.UuUVuuUu(this.UnUNuUU, 0, this.nNvNUVU.length());
      }

      private String uUnuvNvvNU(String var1) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 >= ' '
               && var4 != 127
               && (this.NnUuNNU != UUnnuuNNvVV.uunvUUVnuNn.PORT || var4 >= '0' && var4 <= '9')
               && (this.NnUuNNU != UUnnuuNNvVV.uunvUUVnuNn.HOST && this.NnUuNNU != UUnnuuNNvVV.uunvUUVnuNn.TEXT || !Character.isWhitespace(var4))) {
               var2.append(var4);
            }
         }

         return var2.toString();
      }
   }

   static class nvUnvV {
      protected String UuUVuuUu;
      protected final vVnuUUVvvnV C00OOC00oO = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
      protected float uUnuvNvvNU;
      protected float vVvUvVVuuNvV;
      protected float uNNnnnuuuN;
      protected float nuUnNvnuUu;
      protected float VVuuUN;
      protected float vNUvnnVnUvu;
      protected float uVUuuVnNVU;
      protected float vuuuNvNuv;
      protected float nvUVNnuu;
      protected float UuuNnUvUuv;
      protected float nUUVuvU;
      protected float UnUNVVVNuv = 1.0F;
      protected float vNVuvnUUnuUn = 0.5F;
      protected float UvnvNVnnnnNU = 0.5F;
      protected float uVUVnuvnuVuv;
      protected float NVNnnvnuunNv;
      protected float uVunuUNVVUUV;

      protected nvUnvV(String var1) {
         this.UuUVuuUu = var1;
      }

      protected boolean UuUVuuUu(float var1, float var2) {
         return UUnnuuNNvVV.UuUVuuUu(var1, var2, this.uUnuvNvvNU, this.vVvUvVVuuNvV, this.VVuuUN, this.vNUvnnVnUvu, this.uVUuuVnNVU) <= 0.0F;
      }

      protected void UuUVuuUu() {
         this.vuuuNvNuv = 0.0F;
         this.nvUVNnuu = 0.0F;
         this.UuuNnUvUuv = 0.0F;
         this.nUUVuvU = 0.0F;
         this.uVUVnuvnuVuv = 0.0F;
         this.uVunuUNVVUUV = 0.0F;
         this.UnUNVVVNuv = 1.0F;
         this.vNVuvnUUnuUn = 0.5F;
         this.UvnvNVnnnnNU = 0.5F;
         this.C00OOC00oO.UuUVuuUu(1.0F);
      }
   }

   static final class nvnNNunvv extends UUnnuuNNvVV.nvUnvV {
      final UUnnuuNNvVV.NVnVnNnN UNnVVNvvnVvU;

      nvnNNunvv(String var1, UUnnuuNNvVV.NVnVnNnN var2) {
         super(var1);
         this.UNnVVNvvnVvU = var2;
      }
   }

   static enum uunvUUVnuNn {
      HOST,
      PORT,
      TEXT,
      SECRET;
   }
}
