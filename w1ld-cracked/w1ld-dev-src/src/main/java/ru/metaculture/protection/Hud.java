package ru.metaculture.protection;

import java.util.ArrayList;
import net.minecraft.class_332;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Hud",
   C00OOC00oO = "Интерфейс клиента",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Hud extends Module implements uvVVuUNNunn {
   private static final Hud.NVnVnNnN[] uUVuVvuNUvnu = new Hud.NVnVnNnN[32];
   private static int UvUvUNuvNU;
   private static int c0oOOCcCoC0;
   private static int VVnVNnunVvu;
   public static final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN("Elements", UnUNVVVNuv());
   public static final String uVunuUNVVUUV = "Client";
   public static final String UNnVVNvvnVvU = "Custom";
   public static final VUVnvvnNN uNnUnnuNUnNu = NVNnnvnuunNv;
   public static final UvNnUnuNUUU NnUuNNU = new UvNnUnuNUUU("HUD Mode", "Client", "Client", "Custom").UuUVuuUu(() -> !UNNVvNNvVNu.UuUVuuUu());
   public static final vNnVvvNU nNvNUVU = new vNnVvvNU("HUD Constructor", 0)
      .C00OOC00oO("Open")
      .UuUVuuUu(() -> !UNNVvNNvVNu.UuUVuuUu() || !nUUVuvU())
      .UuUVuuUu(Hud::vNVuvnUUnuUn);
   public static final ili11Iii1Ii UnUNuUU = new ili11Iii1Ii("Foundry Shader", VnuVUNUv.HUD);

   public Hud() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, NnUuNNU, nNvNUVU, UnUNuUU});
   }

   private static vvNnnUNnVvn[] UnUNVVVNuv() {
      ArrayList var0 = new ArrayList();
      var0.add(new vvNnnUNnVvn("Watermark", true));
      var0.add(new vvNnnUNnVvn("ArrayList", true));
      var0.add(new vvNnnUNnVvn("HotKeys", true));
      var0.add(new vvNnnUNnVvn("Potions", true));
      var0.add(new vvNnnUNnVvn("Cool Downs", true));
      var0.add(new vvNnnUNnVvn("TargetHud", true));
      var0.add(new vvNnnUNnVvn("Armor", true));
      var0.add(new vvNnnUNnVvn("Inventory", true));
      var0.add(new vvNnnUNnVvn("PlayerInfo", true));
      if (uNvNvUNUnuu.UuUVuuUu(UNVvvuvnvVNV.class)) {
         var0.add(new vvNnnUNnVvn("AutoBuy Info", true));
      }

      var0.add(new vvNnnUNnVvn("Notifications", true));
      if (uNvNvUNUnuu.UuUVuuUu(UvUNVuVVU.class)) {
         var0.add(new vvNnnUNnVvn("AI Status", true));
      }

      var0.add(new vvNnnUNnVvn("Brew Monitor", true));
      var0.add(new vvNnnUNnVvn("HotBar", false));
      var0.add(new vvNnnUNnVvn("MediaPlayer", true));
      var0.add(new vvNnnUNnVvn("Server Helper", false));
      return var0.toArray(vvNnnUNnVvn[]::new);
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this, this);
   }

   @Override
   public void C00OOC00oO() {
      vUnVuNUUUVu.UuUVuuUu().UuUVuuUu(this);
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      vUnVuNUUUVu.UuUVuuUu().C00OOC00oO(this, this);
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_332 var2 = var1.vNUvnnVnUvu();
         UnVNvNnU var3 = var1.vVvUvVVuuNvV();
         if (var3 != null) {
            UuUVuuUu(var1.nuUnNvnuUu(), var1.VVuuUN());
            if (NVNnnvnuunNv.C00OOC00oO("Notifications")) {
               nuVVunNUnVnv.UvnvNVnnnnNU();
               nuVVunNUnVnv.UuUVuuUu(var3);
            }

            if (uNvNvUNUnuu.UuUVuuUu(UvUNVuVVU.class) && NVNnnvnuunNv.C00OOC00oO("AI Status")) {
               UvUNVuVVU.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("Brew Monitor")) {
               uuUnvuNNUUv.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("Watermark")) {
               unnvNvvnuVUn.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("ArrayList")) {
               cOC0cc0cO00o.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("PlayerInfo")) {
               VUVVnvUunV.UuUVuuUu(var3);
            }

            if (uNvNvUNUnuu.UuUVuuUu(UNVvvuvnvVNV.class) && NVNnnvnuunNv.C00OOC00oO("AutoBuy Info")) {
               UNVvvuvnvVNV.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("TargetHud")) {
               O0oo00cC00o.UuUVuuUu(var3, var1.vNUvnnVnUvu());
            }

            if (NVNnnvnuunNv.C00OOC00oO("Potions")) {
               NVuuUNN.UuUVuuUu(var3, var1.vNUvnnVnUvu());
            }

            if (NVNnnvnuunNv.C00OOC00oO("Cool Downs")) {
               vnVNuNUUvVNu.UuUVuuUu(var3, var2);
            }

            if (NVNnnvnuunNv.C00OOC00oO("Armor")) {
               uuNuUnUVUUn.UuUVuuUu(var3, var1.vNUvnnVnUvu());
            }

            if (NVNnnvnuunNv.C00OOC00oO("HotKeys")) {
               uuuVvnuun.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("Inventory")) {
               NunNvVnnnNV.UuUVuuUu(var3, var1.vNUvnnVnUvu());
            }

            if (NVNnnvnuunNv.C00OOC00oO("HotBar")) {
               UVNVVUnUnUU.UuUVuuUu(var3, var1.vNUvnnVnUvu());
            }

            if (NVNnnvnuunNv.C00OOC00oO("MediaPlayer")) {
               VVVVUN.UuUVuuUu(var3);
            }

            if (NVNnnvnuunNv.C00OOC00oO("Server Helper")) {
               o0cOOccooCc0.UuUVuuUu(var3, var2);
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      vnVNuNUUvVNu.UuUVuuUu(var1);
      NVuuUNN.UuUVuuUu(var1);
   }

   public static String UuuNnUvUuv() {
      String var0 = UnUNuUU.UuuNnUvUuv();
      return var0 == null ? "" : var0;
   }

   public static boolean nUUVuvU() {
      return UNNVvNNvVNu.UuUVuuUu() && "Custom".equals(NnUuNNU.uUnuvNvvNU());
   }

   private static void vNVuvnUUnuUn() {
      if (uUnuvNvvNU != null && UNNVvNNvVNu.UuUVuuUu()) {
         uUnuvNvvNU.execute(() -> uUnuvNvvNU.method_1507(new NVunNNNNuN()));
      }
   }

   @Override
   public VnuVUNUv uUnuvNvvNU() {
      return VnuVUNUv.HUD;
   }

   @Override
   public String vVvUvVVuuNvV() {
      String var1 = UuuNnUvUuv();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean uNNnnnuuuN() {
      return true;
   }

   public static void UuUVuuUu(int var0, int var1) {
      c0oOOCcCoC0 = Math.max(1, var0);
      VVnVNnunVvu = Math.max(1, var1);
      UvUvUNuvNU = 0;
   }

   public static void UuUVuuUu(String var0, float var1, float var2, float var3, float var4) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && Float.isFinite(var1) && Float.isFinite(var2)) {
         if (UvUvUNuvNU < uUVuVvuNUvnu.length) {
            Hud.NVnVnNnN var5 = uUVuVvuNUvnu[UvUvUNuvNU];
            if (var5 == null) {
               var5 = new Hud.NVnVnNnN();
               uUVuVvuNUvnu[UvUvUNuvNU] = var5;
            }

            var5.UuUVuuUu(var0, var1, var2, var3, var4);
            UvUvUNuvNU++;
         }
      }
   }

   public static void UuUVuuUu(String var0, UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      if (var1 == null) {
         UuUVuuUu(var0, var2, var3, var4, var5);
      } else {
         float[] var6 = var1.nvUVNnuu().uNNnnnuuuN();
         if (var6 != null && var6.length >= 6) {
            float var9 = var2 + var4;
            float var10 = var3 + var5;
            float var11 = var6[0] * var2 + var6[1] * var3 + var6[2];
            float var12 = var6[3] * var2 + var6[4] * var3 + var6[5];
            float var13 = var6[0] * var9 + var6[1] * var3 + var6[2];
            float var14 = var6[3] * var9 + var6[4] * var3 + var6[5];
            float var15 = var6[0] * var9 + var6[1] * var10 + var6[2];
            float var16 = var6[3] * var9 + var6[4] * var10 + var6[5];
            float var17 = var6[0] * var2 + var6[1] * var10 + var6[2];
            float var18 = var6[3] * var2 + var6[4] * var10 + var6[5];
            float var19 = Math.min(Math.min(var11, var13), Math.min(var15, var17));
            float var20 = Math.min(Math.min(var12, var14), Math.min(var16, var18));
            float var21 = Math.max(Math.max(var11, var13), Math.max(var15, var17));
            float var22 = Math.max(Math.max(var12, var14), Math.max(var16, var18));
            UuUVuuUu(var0, var19, var20, var21 - var19, var22 - var20);
         } else {
            UuUVuuUu(var0, var2, var3, var4, var5);
         }
      }
   }

   public static Hud.NVnVnNnN UuUVuuUu(String var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = UuUVuuUu(var1, 0.0F, Math.max(0.0F, c0oOOCcCoC0 - var3));
      float var7 = UuUVuuUu(var2, 0.0F, Math.max(0.0F, VVnVNnunVvu - var4));

      for (int var8 = 0; var8 < 6; var8++) {
         boolean var9 = false;

         for (int var10 = 0; var10 < UvUvUNuvNU; var10++) {
            Hud.NVnVnNnN var11 = uUVuVvuNUvnu[var10];
            if (var11 != null
               && !var0.equals(var11.UuUVuuUu)
               && UuUVuuUu(
                  var6, var7, var3, var4, var11.C00OOC00oO - var5, var11.uUnuvNvvNU - var5, var11.vVvUvVVuuNvV + var5 * 2.0F, var11.uNNnnnuuuN + var5 * 2.0F
               )) {
               float var12 = var11.uUnuvNvvNU - var4 - var5;
               float var13 = var11.uUnuvNvvNU + var11.uNNnnnuuuN + var5;
               float var14 = var11.C00OOC00oO - var3 - var5;
               float var15 = var11.C00OOC00oO + var11.vVvUvVVuuNvV + var5;
               float var16 = var6;
               float var17 = var7;
               float var18 = Float.MAX_VALUE;
               float var19 = UuUVuuUu(var6, var12, var1, var2, var3, var4);
               if (var12 >= 0.0F && var19 < var18) {
                  var18 = var19;
                  var17 = var12;
                  var16 = var6;
               }

               float var20 = UuUVuuUu(var6, var13, var1, var2, var3, var4);
               if (var13 + var4 <= VVnVNnunVvu && var20 < var18) {
                  var18 = var20;
                  var17 = var13;
                  var16 = var6;
               }

               float var21 = UuUVuuUu(var14, var7, var1, var2, var3, var4);
               if (var14 >= 0.0F && var21 < var18) {
                  var18 = var21;
                  var16 = var14;
                  var17 = var7;
               }

               float var22 = UuUVuuUu(var15, var7, var1, var2, var3, var4);
               if (var15 + var3 <= c0oOOCcCoC0 && var22 < var18) {
                  var16 = var15;
                  var17 = var7;
               }

               var6 = UuUVuuUu(var16, 0.0F, Math.max(0.0F, c0oOOCcCoC0 - var3));
               var7 = UuUVuuUu(var17, 0.0F, Math.max(0.0F, VVnVNnunVvu - var4));
               var9 = true;
            }
         }

         if (!var9) {
            break;
         }
      }

      return new Hud.NVnVnNnN(var0, var6, var7, var3, var4);
   }

   private static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      if (Float.isFinite(var0) && Float.isFinite(var1)) {
         float var6 = var0 - var2;
         float var7 = var1 - var3;
         float var8 = Math.abs(var0 + var4 * 0.5F - c0oOOCcCoC0 * 0.5F) * 0.012F;
         float var9 = Math.abs(var1 + var5 - VVnVNnunVvu) * 0.004F;
         return var6 * var6 + var7 * var7 + var8 + var9;
      } else {
         return Float.MAX_VALUE;
      }
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return var0 < var4 + var6 && var0 + var2 > var4 && var1 < var5 + var7 && var1 + var3 > var5;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   public static final class NVnVnNnN {
      public String UuUVuuUu;
      public float C00OOC00oO;
      public float uUnuvNvvNU;
      public float vVvUvVVuuNvV;
      public float uNNnnnuuuN;

      public NVnVnNnN() {
      }

      public NVnVnNnN(String var1, float var2, float var3, float var4, float var5) {
         this.UuUVuuUu(var1, var2, var3, var4, var5);
      }

      public void UuUVuuUu(String var1, float var2, float var3, float var4, float var5) {
         this.UuUVuuUu = var1 == null ? "" : var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
      }
   }
}
