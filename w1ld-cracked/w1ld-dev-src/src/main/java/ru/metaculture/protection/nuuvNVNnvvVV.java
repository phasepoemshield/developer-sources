package ru.metaculture.protection;

import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;

public final class nuuvNVNnvvVV {
   private nuuvNVNnvvVV() {
   }

   public static void UuUVuuUu(
      UnVNvNnU var0, nUVuuNUVnV var1, VnuVUNUv var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
   ) {
      if (var2 == null) {
         var2 = VnuVUNUv.PREVIEW_ONLY;
      }

      nUvnuVnNUU var10 = var1.uNNnnnuuuN();
      NUunUunuNV var11 = var1.nuUnNvnuUu();
      switch (var2) {
         case BACKGROUND:
         case MENU_BACKGROUND:
            UuUVuuUu(var0, var10, var11, var3, var4, var5, var6, var9);
            break;
         case MENU_PANEL_BG:
            C00OOC00oO(var0, var10, var11, var3, var4, var5, var6);
            break;
         case HUD:
         case HUD_OVERLAY:
            vVvUvVVuuNvV(var0, var10, var11, var3, var4, var5, var6);
            break;
         case ESP:
         case ESP_OVERLAY:
            C00OOC00oO(var0, var10, var11, var3, var4, var5, var6, var9);
            break;
         case ENTITY_HIGHLIGHT:
            VVuuUN(var0, var10, var11, var3, var4, var5, var6);
            break;
         case PREVIEW_ONLY:
            UuUVuuUu(var0, var3, var4, var5, var6);
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUVuuNUVnV var1, VnuVUNUv var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var2 != null) {
         nUvnuVnNUU var9 = var1.uNNnnnuuuN();
         NUunUunuNV var10 = var1.nuUnNvnuUu();
         switch (var2) {
            case BACKGROUND:
            case MENU_BACKGROUND:
               UuUVuuUu(var0, var9, var10, var3, var4, var5, var6);
               break;
            case MENU_PANEL_BG:
               uUnuvNvvNU(var0, var9, var10, var3, var4, var5, var6);
               break;
            case HUD:
            case HUD_OVERLAY:
               uNNnnnuuuN(var0, var9, var10, var3, var4, var5, var6);
               break;
            case ESP:
            case ESP_OVERLAY:
               nuUnNvnuUu(var0, var9, var10, var3, var4, var5, var6);
               break;
            case ENTITY_HIGHLIGHT:
               vNUvnnVnUvu(var0, var9, var10, var3, var4, var5, var6);
         }
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4) {
      var0.UuUVuuUu(var1, var2, var3, var4, 0.0F, NUunUunuNV.UuUVuuUu(3, 5, 9, 240));
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7) {
      var0.UuUVuuUu(var3, var4, var5, var6, 0.0F, NUunUunuNV.UuUVuuUu(11, 13, 21, 232));
      int var8 = (int)(var5 / var1.UuUVuuUu(14.0F)) + 1;
      int var9 = (int)(var6 / var1.UuUVuuUu(14.0F)) + 1;

      for (int var10 = 0; var10 < var8; var10++) {
         float var11 = var3 + var10 * var1.UuUVuuUu(14.0F);
         var0.UuUVuuUu(var11, var4, 1.0F, var6, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 5));
      }

      for (int var12 = 0; var12 < var9; var12++) {
         float var14 = var4 + var12 * var1.UuUVuuUu(14.0F);
         var0.UuUVuuUu(var3, var14, var5, 1.0F, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 5));
      }

      float var13 = (float)Math.sin(var7 * Math.PI * 2.0) * 0.5F + 0.5F;
      var0.UuUVuuUu(
         var3 + var5 * 0.2F,
         var4 + var6 * 0.2F,
         var5 * 0.6F,
         var6 * 0.6F,
         Math.min(var5, var6) * 0.3F,
         Math.min(var5, var6) * 0.3F,
         Math.min(var5, var6) * 0.1F,
         NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), Math.round(18.0F + 22.0F * var13))
      );
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      float var7 = var1.UuUVuuUu(12.0F);
      float var8 = var3 + var7;
      float var9 = var4 + var7;
      float var10 = var5 - var7 * 2.0F;
      float var11 = var6 - var7 * 2.0F;
      var0.UuUVuuUu(var8, var9, var10, var11, var1.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var2.nuUnNvnuUu(), 132));
      var0.UuUVuuUu(var8, var9, var10, var11, var1.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 96), 0.7F);
      nunvNNUnvU.UuUVuuUu(
         var0, var1, vNvnnVvvVUu.vVvUvVVuuNvV, var8 + var1.UuUVuuUu(10.0F), var9 + var1.UuUVuuUu(8.0F), 9.0F, "ClickGUI mock", var2.NVNnnvnuunNv()
      );
      float var12 = var1.UuUVuuUu(10.0F);

      for (int var13 = 0; var13 < 4; var13++) {
         var0.UuUVuuUu(
            var8 + var1.UuUVuuUu(10.0F) + var13 * var1.UuUVuuUu(14.0F),
            var9 + var11 - var1.UuUVuuUu(18.0F),
            var12,
            var12,
            var12 * 0.5F,
            NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 156 - var13 * 28)
         );
      }
   }

   private static void C00OOC00oO(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      var0.UuUVuuUu(var3, var4, var5, var6, 0.0F, NUunUunuNV.UuUVuuUu(9, 11, 17, 232));
   }

   private static void uUnuvNvvNU(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      float var7 = var1.UuUVuuUu(10.0F);
      float var8 = var1.UuUVuuUu(20.0F);
      var0.UuUVuuUu(var3 + var7, var4 + var7, var5 - var7 * 2.0F, var8, var1.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, 14));
      var0.UuUVuuUu(var3 + var7 + var1.UuUVuuUu(6.0F), var4 + var7 + var1.UuUVuuUu(6.0F), var1.UuUVuuUu(8.0F), var1.UuUVuuUu(8.0F), 2.0F, var2.uVunuUNVVUUV());
      nunvNNUnvU.UuUVuuUu(
         var0, var1, vNvnnVvvVUu.vVvUvVVuuNvV, var3 + var7 + var1.UuUVuuUu(20.0F), var4 + var7 + var1.UuUVuuUu(4.0F), 9.0F, "Module name", var2.NVNnnvnuunNv()
      );
      float var9 = var1.UuUVuuUu(14.0F);
      float var10 = var4 + var7 + var8 + var1.UuUVuuUu(6.0F);

      for (int var11 = 0; var11 < 3; var11++) {
         var0.UuUVuuUu(
            var3 + var7, var10 + var11 * (var9 + var1.UuUVuuUu(4.0F)), var5 - var7 * 2.0F, var9, var1.UuUVuuUu(4.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, 12)
         );
         var0.UuUVuuUu(
            var3 + var7 + var1.UuUVuuUu(4.0F),
            var10 + var11 * (var9 + var1.UuUVuuUu(4.0F)) + var1.UuUVuuUu(2.0F),
            var1.UuUVuuUu(8.0F),
            var1.UuUVuuUu(8.0F),
            1.0F,
            NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), 200)
         );
      }
   }

   private static void vVvUvVVuuNvV(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      var0.UuUVuuUu(var3, var4, var5, var6, 0.0F, NUunUunuNV.UuUVuuUu(35, 50, 78, 192));
      var0.UuUVuuUu(var3, var4 + var6 * 0.62F, var5, var6 * 0.38F, 0.0F, NUunUunuNV.UuUVuuUu(56, 86, 52, 200));
      var0.UuUVuuUu(var3, var4 + var6 - var1.UuUVuuUu(4.0F), var5, var1.UuUVuuUu(4.0F), 0.0F, NUunUunuNV.UuUVuuUu(28, 34, 22, 220));
   }

   private static void uNNnnnuuuN(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      float var7 = var1.UuUVuuUu(160.0F);
      float var8 = var1.UuUVuuUu(20.0F);
      float var9 = var3 + (var5 - var7) * 0.5F;
      float var10 = var4 + var6 - var8 - var1.UuUVuuUu(10.0F);
      var0.UuUVuuUu(var9, var10, var7, var8, 2.0F, NUunUunuNV.UuUVuuUu(20, 22, 28, 200));
      var0.UuUVuuUu(var9, var10, var7, var8, 2.0F, NUunUunuNV.UuUVuuUu(50, 52, 62, 220), 0.7F);

      for (int var11 = 0; var11 < 9; var11++) {
         float var12 = var7 / 9.0F;
         var0.UuUVuuUu(
            var9 + var11 * var12 + 1.0F,
            var10 + 1.0F,
            var12 - 2.0F,
            var8 - 2.0F,
            1.0F,
            var11 == 4 ? NUunUunuNV.UuUVuuUu(220, 220, 220, 110) : NUunUunuNV.UuUVuuUu(255, 255, 255, 16)
         );
      }

      for (int var13 = 0; var13 < 10; var13++) {
         float var15 = var10 - var1.UuUVuuUu(12.0F);
         var0.UuUVuuUu(
            var9 + var13 * var1.UuUVuuUu(7.0F) + var1.UuUVuuUu(3.0F),
            var15,
            var1.UuUVuuUu(6.0F),
            var1.UuUVuuUu(6.0F),
            1.0F,
            NUunUunuNV.UuUVuuUu(220, 40, 40, 230)
         );
      }

      for (int var14 = 0; var14 < 10; var14++) {
         float var16 = var10 - var1.UuUVuuUu(20.0F);
         var0.UuUVuuUu(
            var9 + var7 - (var14 + 1) * var1.UuUVuuUu(7.0F) - var1.UuUVuuUu(3.0F),
            var16,
            var1.UuUVuuUu(6.0F),
            var1.UuUVuuUu(6.0F),
            1.0F,
            NUunUunuNV.UuUVuuUu(54, 84, 250, 230)
         );
      }

      var0.UuUVuuUu(
         var9 + var7 * 0.5F - 1.0F, var4 + var6 * 0.5F - var1.UuUVuuUu(4.0F), 2.0F, var1.UuUVuuUu(8.0F), 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 220)
      );
      var0.UuUVuuUu(
         var9 + var7 * 0.5F - var1.UuUVuuUu(4.0F), var4 + var6 * 0.5F - 1.0F, var1.UuUVuuUu(8.0F), 2.0F, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 220)
      );
   }

   private static void C00OOC00oO(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7) {
      var0.UuUVuuUu(var3, var4, var5, var6, 0.0F, NUunUunuNV.UuUVuuUu(14, 18, 28, 232));

      for (int var8 = 0; var8 < 20; var8++) {
         float var9 = var3 + var8 * 67 % (int)var5;
         float var10 = var4 + var8 * 41 % (int)var6;
         var0.UuUVuuUu(var9, var10, 1.0F, 1.0F, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 22));
      }

      float var11 = (float)Math.sin(var7 * Math.PI * 2.0) * var1.UuUVuuUu(8.0F);
      float var12 = var1.UuUVuuUu(40.0F);
      float var13 = var1.UuUVuuUu(28.0F);
      UuUVuuUu(var0, var1, var3 + var5 * 0.28F + var11, var4 + var6 * 0.36F, var12 * 0.55F, var12, var2.uVunuUNVVUUV());
      UuUVuuUu(var0, var1, var3 + var5 * 0.6F - var11 * 0.6F, var4 + var6 * 0.48F, var13 * 0.55F, var13, var2.UNnVVNvvnVvU());
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, float var2, float var3, float var4, float var5, int var6) {
      var0.UuUVuuUu(var2, var3, var4, var5, 1.0F, NUunUunuNV.UuUVuuUu(var6, 220), 1.2F);
      float var7 = var4 * 0.4F;
      var0.UuUVuuUu(var2 + (var4 - var7) * 0.5F, var3 - var7 - 1.0F, var7, var7, 1.0F, NUunUunuNV.UuUVuuUu(var6, 80));
      var0.UuUVuuUu(var2 + (var4 - var7) * 0.5F, var3 - var7 - 1.0F, var7, var7, 1.0F, NUunUunuNV.UuUVuuUu(var6, 220), 1.0F);
   }

   private static void nuUnNvnuUu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      nunvNNUnvU.UuUVuuUu(
         var0,
         var1,
         vNvnnVvvVUu.UuUVuuUu,
         var3 + var1.UuUVuuUu(8.0F),
         var4 + var1.UuUVuuUu(6.0F),
         8.0F,
         "ESP fill preview",
         NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), 192)
      );
   }

   private static void VVuuUN(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      var0.UuUVuuUu(var3, var4, var5, var6, 0.0F, NUunUunuNV.UuUVuuUu(7, 9, 14, 240));
      float var7 = Math.min(var5, var6) * 0.55F;
      var0.UuUVuuUu(
         var3 + var5 * 0.5F - var7 * 0.5F,
         var4 + var6 * 0.5F - var7 * 0.5F,
         var7,
         var7,
         var7 * 0.5F,
         var7 * 0.45F,
         var7 * 0.1F,
         NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), 56)
      );

      for (int var8 = 0; var8 < 6; var8++) {
         float var9 = var8 / 6.0F;
         var0.UuUVuuUu(var3, var4 + var6 * var9, var5, 1.0F, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 6));
      }
   }

   private static void vNUvnnVnUvu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      float var7 = Math.min(var5, var6) * 0.36F;
      float var8 = var3 + (var5 - var7) * 0.5F;
      float var9 = var4 + (var6 - var7) * 0.5F - var1.UuUVuuUu(4.0F);
      boolean var10 = false;

      try {
         class_310 var11 = class_310.method_1551();
         if (var11 != null && var11.field_1724 != null) {
            class_2960 var12 = var11.method_1582().method_52862(var11.field_1724.method_7334()).comp_1626();
            class_1044 var13 = var11.method_1531().method_4619(var12);
            if (var13 != null && var13.method_68004() instanceof class_10868 var14 && var14.method_68427() > 0) {
               int var17 = var14.method_68427();
               GL11.glBindTexture(3553, var17);
               GL11.glTexParameteri(3553, 10241, 9728);
               GL11.glTexParameteri(3553, 10240, 9728);
               var0.UuUVuuUu(var17, var8, var9, var7, var7, 0.125F, 0.125F, 0.25F, 0.25F, var7 * 0.18F);
               var0.UuUVuuUu(var17, var8, var9, var7, var7, 0.625F, 0.125F, 0.75F, 0.25F, var7 * 0.18F);
               var10 = true;
            }
         }
      } catch (Throwable var16) {
      }

      if (!var10) {
         var0.UuUVuuUu(var8, var9, var7, var7, var7 * 0.18F, NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 200));
         nunvNNUnvU.UuUVuuUu(var0, var1, vNvnnVvvVUu.vVvUvVVuuNvV, var8, var9, var7, var7 * 0.42F, "P", var2.NVNnnvnuunNv());
      }

      var0.UuUVuuUu(var8, var9, var7, var7, var7 * 0.18F, NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 156), 0.8F);
      nunvNNUnvU.UuUVuuUu(
         var0,
         var1,
         vNvnnVvvVUu.UuUVuuUu,
         var3 + var1.UuUVuuUu(8.0F),
         var4 + var6 - var1.UuUVuuUu(14.0F),
         8.0F,
         "Entity overlay preview",
         NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), 192)
      );
   }
}
