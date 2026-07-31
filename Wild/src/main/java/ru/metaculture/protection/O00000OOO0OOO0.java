package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL11;

public final class O00000OOO0OOO0 {
   private O00000OOO0OOO0() {
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O00000OOOO00O o00000OOOO00O, float f, float g, float h, float i, float j, float k, float l
   ) {
      if (o00000OOOO00O == null) {
         o00000OOOO00O = O00000OOOO00O.PREVIEW_ONLY;
      }

      O0000O00000 var10 = o0000O000O0OOO.O000000000000();
      ColorScheme var11 = o0000O000O0OOO.O0000000000000();
      switch (o00000OOOO00O) {
         case BACKGROUND:
         case MENU_BACKGROUND:
            O00000000(o0000O00OO0O0, var10, var11, f, g, h, i, l);
            break;
         case MENU_PANEL_BG:
            O000000000(o0000O00OO0O0, var10, var11, f, g, h, i);
            break;
         case HUD:
         case HUD_OVERLAY:
            O00000000000(o0000O00OO0O0, var10, var11, f, g, h, i);
            break;
         case ESP:
         case ESP_OVERLAY:
            O000000000(o0000O00OO0O0, var10, var11, f, g, h, i, l);
            break;
         case ENTITY_HIGHLIGHT:
            O000000000000O(o0000O00OO0O0, var10, var11, f, g, h, i);
            break;
         case PREVIEW_ONLY:
            O00000000(o0000O00OO0O0, f, g, h, i);
      }
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O00000OOOO00O o00000OOOO00O, float f, float g, float h, float i, float j, float k
   ) {
      if (o00000OOOO00O != null) {
         O0000O00000 var9 = o0000O000O0OOO.O000000000000();
         ColorScheme var10 = o0000O000O0OOO.O0000000000000();
         switch (o00000OOOO00O) {
            case BACKGROUND:
            case MENU_BACKGROUND:
               O00000000(o0000O00OO0O0, var9, var10, f, g, h, i);
               break;
            case MENU_PANEL_BG:
               O0000000000(o0000O00OO0O0, var9, var10, f, g, h, i);
               break;
            case HUD:
            case HUD_OVERLAY:
               O000000000000(o0000O00OO0O0, var9, var10, f, g, h, i);
               break;
            case ESP:
            case ESP_OVERLAY:
               O0000000000000(o0000O00OO0O0, var9, var10, f, g, h, i);
               break;
            case ENTITY_HIGHLIGHT:
               O00000000000O(o0000O00OO0O0, var9, var10, f, g, h, i);
         }
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(3, 5, 9, 240));
   }

   private static void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(11, 13, 21, 232));
      int var8 = (int)(h / o0000O00000.O00000000(14.0F)) + 1;
      int var9 = (int)(i / o0000O00000.O00000000(14.0F)) + 1;

      for (int var10 = 0; var10 < var8; var10++) {
         float var11 = f + var10 * o0000O00000.O00000000(14.0F);
         o0000O00OO0O0.O00000000(var11, g, 1.0F, i, 0.0F, ColorScheme.O00000000(255, 255, 255, 5));
      }

      for (int var12 = 0; var12 < var9; var12++) {
         float var14 = g + var12 * o0000O00000.O00000000(14.0F);
         o0000O00OO0O0.O00000000(f, var14, h, 1.0F, 0.0F, ColorScheme.O00000000(255, 255, 255, 5));
      }

      float var13 = (float)Math.sin(j * Math.PI * 2.0) * 0.5F + 0.5F;
      o0000O00OO0O0.O00000000(
         f + h * 0.2F,
         g + i * 0.2F,
         h * 0.6F,
         i * 0.6F,
         Math.min(h, i) * 0.3F,
         Math.min(h, i) * 0.3F,
         Math.min(h, i) * 0.1F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(18.0F + 22.0F * var13))
      );
   }

   private static void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var7 = o0000O00000.O00000000(12.0F);
      float var8 = f + var7;
      float var9 = g + var7;
      float var10 = h - var7 * 2.0F;
      float var11 = i - var7 * 2.0F;
      o0000O00OO0O0.O00000000(var8, var9, var10, var11, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O0000000000000(), 132));
      o0000O00OO0O0.O00000000(var8, var9, var10, var11, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 96), 0.7F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var8 + o0000O00000.O00000000(10.0F),
         var9 + o0000O00000.O00000000(8.0F),
         9.0F,
         "ClickGUI mock",
         o0000O000O0OO.O000000000O()
      );
      float var12 = o0000O00000.O00000000(10.0F);

      for (int var13 = 0; var13 < 4; var13++) {
         o0000O00OO0O0.O00000000(
            var8 + o0000O00000.O00000000(10.0F) + var13 * o0000O00000.O00000000(14.0F),
            var9 + var11 - o0000O00000.O00000000(18.0F),
            var12,
            var12,
            var12 * 0.5F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 156 - var13 * 28)
         );
      }
   }

   private static void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(9, 11, 17, 232));
   }

   private static void O0000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var7 = o0000O00000.O00000000(10.0F);
      float var8 = o0000O00000.O00000000(20.0F);
      o0000O00OO0O0.O00000000(f + var7, g + var7, h - var7 * 2.0F, var8, o0000O00000.O00000000(6.0F), ColorScheme.O00000000(255, 255, 255, 14));
      o0000O00OO0O0.O00000000(
         f + var7 + o0000O00000.O00000000(6.0F),
         g + var7 + o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(8.0F),
         2.0F,
         o0000O000O0OO.O000000000O0()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         f + var7 + o0000O00000.O00000000(20.0F),
         g + var7 + o0000O00000.O00000000(4.0F),
         9.0F,
         "Module name",
         o0000O000O0OO.O000000000O()
      );
      float var9 = o0000O00000.O00000000(14.0F);
      float var10 = g + var7 + var8 + o0000O00000.O00000000(6.0F);

      for (int var11 = 0; var11 < 3; var11++) {
         o0000O00OO0O0.O00000000(
            f + var7,
            var10 + var11 * (var9 + o0000O00000.O00000000(4.0F)),
            h - var7 * 2.0F,
            var9,
            o0000O00000.O00000000(4.0F),
            ColorScheme.O00000000(255, 255, 255, 12)
         );
         o0000O00OO0O0.O00000000(
            f + var7 + o0000O00000.O00000000(4.0F),
            var10 + var11 * (var9 + o0000O00000.O00000000(4.0F)) + o0000O00000.O00000000(2.0F),
            o0000O00000.O00000000(8.0F),
            o0000O00000.O00000000(8.0F),
            1.0F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 200)
         );
      }
   }

   private static void O00000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(35, 50, 78, 192));
      o0000O00OO0O0.O00000000(f, g + i * 0.62F, h, i * 0.38F, 0.0F, ColorScheme.O00000000(56, 86, 52, 200));
      o0000O00OO0O0.O00000000(f, g + i - o0000O00000.O00000000(4.0F), h, o0000O00000.O00000000(4.0F), 0.0F, ColorScheme.O00000000(28, 34, 22, 220));
   }

   private static void O000000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var7 = o0000O00000.O00000000(160.0F);
      float var8 = o0000O00000.O00000000(20.0F);
      float var9 = f + (h - var7) * 0.5F;
      float var10 = g + i - var8 - o0000O00000.O00000000(10.0F);
      o0000O00OO0O0.O00000000(var9, var10, var7, var8, 2.0F, ColorScheme.O00000000(20, 22, 28, 200));
      o0000O00OO0O0.O00000000(var9, var10, var7, var8, 2.0F, ColorScheme.O00000000(50, 52, 62, 220), 0.7F);

      for (int var11 = 0; var11 < 9; var11++) {
         float var12 = var7 / 9.0F;
         o0000O00OO0O0.O00000000(
            var9 + var11 * var12 + 1.0F,
            var10 + 1.0F,
            var12 - 2.0F,
            var8 - 2.0F,
            1.0F,
            var11 == 4 ? ColorScheme.O00000000(220, 220, 220, 110) : ColorScheme.O00000000(255, 255, 255, 16)
         );
      }

      for (int var13 = 0; var13 < 10; var13++) {
         float var15 = var10 - o0000O00000.O00000000(12.0F);
         o0000O00OO0O0.O00000000(
            var9 + var13 * o0000O00000.O00000000(7.0F) + o0000O00000.O00000000(3.0F),
            var15,
            o0000O00000.O00000000(6.0F),
            o0000O00000.O00000000(6.0F),
            1.0F,
            ColorScheme.O00000000(220, 40, 40, 230)
         );
      }

      for (int var14 = 0; var14 < 10; var14++) {
         float var16 = var10 - o0000O00000.O00000000(20.0F);
         o0000O00OO0O0.O00000000(
            var9 + var7 - (var14 + 1) * o0000O00000.O00000000(7.0F) - o0000O00000.O00000000(3.0F),
            var16,
            o0000O00000.O00000000(6.0F),
            o0000O00000.O00000000(6.0F),
            1.0F,
            ColorScheme.O00000000(54, 84, 250, 230)
         );
      }

      o0000O00OO0O0.O00000000(
         var9 + var7 * 0.5F - 1.0F,
         g + i * 0.5F - o0000O00000.O00000000(4.0F),
         2.0F,
         o0000O00000.O00000000(8.0F),
         0.0F,
         ColorScheme.O00000000(255, 255, 255, 220)
      );
      o0000O00OO0O0.O00000000(
         var9 + var7 * 0.5F - o0000O00000.O00000000(4.0F),
         g + i * 0.5F - 1.0F,
         o0000O00000.O00000000(8.0F),
         2.0F,
         0.0F,
         ColorScheme.O00000000(255, 255, 255, 220)
      );
   }

   private static void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(14, 18, 28, 232));

      for (int var8 = 0; var8 < 20; var8++) {
         float var9 = f + var8 * 67 % (int)h;
         float var10 = g + var8 * 41 % (int)i;
         o0000O00OO0O0.O00000000(var9, var10, 1.0F, 1.0F, 0.0F, ColorScheme.O00000000(255, 255, 255, 22));
      }

      float var11 = (float)Math.sin(j * Math.PI * 2.0) * o0000O00000.O00000000(8.0F);
      float var12 = o0000O00000.O00000000(40.0F);
      float var13 = o0000O00000.O00000000(28.0F);
      O00000000(o0000O00OO0O0, o0000O00000, f + h * 0.28F + var11, g + i * 0.36F, var12 * 0.55F, var12, o0000O000O0OO.O000000000O0());
      O00000000(o0000O00OO0O0, o0000O00000, f + h * 0.6F - var11 * 0.6F, g + i * 0.48F, var13 * 0.55F, var13, o0000O000O0OO.O000000000O00());
   }

   private static void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, float h, float i, int j) {
      o0000O00OO0O0.O00000000(f, g, h, i, 1.0F, ColorScheme.O00000000(j, 220), 1.2F);
      float var7 = h * 0.4F;
      o0000O00OO0O0.O00000000(f + (h - var7) * 0.5F, g - var7 - 1.0F, var7, var7, 1.0F, ColorScheme.O00000000(j, 80));
      o0000O00OO0O0.O00000000(f + (h - var7) * 0.5F, g - var7 - 1.0F, var7, var7, 1.0F, ColorScheme.O00000000(j, 220), 1.0F);
   }

   private static void O0000000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(8.0F),
         g + o0000O00000.O00000000(6.0F),
         8.0F,
         "ESP fill preview",
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 192)
      );
   }

   private static void O000000000000O(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, ColorScheme.O00000000(7, 9, 14, 240));
      float var7 = Math.min(h, i) * 0.55F;
      o0000O00OO0O0.O00000000(
         f + h * 0.5F - var7 * 0.5F,
         g + i * 0.5F - var7 * 0.5F,
         var7,
         var7,
         var7 * 0.5F,
         var7 * 0.45F,
         var7 * 0.1F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 56)
      );

      for (int var8 = 0; var8 < 6; var8++) {
         float var9 = var8 / 6.0F;
         o0000O00OO0O0.O00000000(f, g + i * var9, h, 1.0F, 0.0F, ColorScheme.O00000000(255, 255, 255, 6));
      }
   }

   private static void O00000000000O(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i) {
      float var7 = Math.min(h, i) * 0.36F;
      float var8 = f + (h - var7) * 0.5F;
      float var9 = g + (i - var7) * 0.5F - o0000O00000.O00000000(4.0F);
      boolean var10 = false;

      try {
         MinecraftClient var11 = MinecraftClient.getInstance();
         if (var11 != null && var11.player != null) {
            Identifier var12 = var11.getSkinProvider().getSkinTextures(var11.player.getGameProfile()).texture();
            AbstractTexture var13 = var11.getTextureManager().getTexture(var12);
            if (var13 != null && var13.getGlTexture() instanceof GlTexture var14 && var14.getGlId() > 0) {
               int var17 = var14.getGlId();
               GL11.glBindTexture(3553, var17);
               GL11.glTexParameteri(3553, 10241, 9728);
               GL11.glTexParameteri(3553, 10240, 9728);
               o0000O00OO0O0.O00000000(var17, var8, var9, var7, var7, 0.125F, 0.125F, 0.25F, 0.25F, var7 * 0.18F);
               o0000O00OO0O0.O00000000(var17, var8, var9, var7, var7, 0.625F, 0.125F, 0.75F, 0.25F, var7 * 0.18F);
               var10 = true;
            }
         }
      } catch (Throwable var16) {
      }

      if (!var10) {
         o0000O00OO0O0.O00000000(var8, var9, var7, var7, var7 * 0.18F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 200));
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var8, var9, var7, var7 * 0.42F, "P", o0000O000O0OO.O000000000O());
      }

      o0000O00OO0O0.O00000000(var8, var9, var7, var7, var7 * 0.18F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 156), 0.8F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(8.0F),
         g + i - o0000O00000.O00000000(14.0F),
         8.0F,
         "Entity overlay preview",
         ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 192)
      );
   }
}
