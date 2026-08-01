package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.reflect.Method;
import java.util.function.Supplier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.render.state.special.EntityGuiElementRenderState;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOO0OOOO {
   private static final O00000OOO0 O00000000 = new O00000OOO0();
   private static final O00000OOO0 O000000000 = new O00000OOO0();
   private static final O00000OOO0 O0000000000 = new O00000OOO0();
   private static final int O00000000000 = -15657957;
   private static final int O000000000000 = -14670802;
   private static final String O0000000000000 = "__foundry_preview_live";
   private static String O000000000000O = "__foundry_preview_live";
   private static String O00000000000O = "";
   private static final float O00000000000O0 = 0.78F;
   private static final float O00000000000OO = -6.0F;
   private static final float O0000000000O = 22.0F;
   private static Boolean O0000000000O0;
   private static Method O0000000000O00;
   private static Method O0000000000O0O;

   private O00000OOO0OOOO() {
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO00O o00000OOOO00O,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      O0000O00000 var14 = o0000O000O0OOO.O000000000000();
      ColorScheme var15 = o0000O000O0OOO.O0000000000000();
      O00000OOOO00O var16 = o00000OOOO00O == null ? O00000OOOO00O.PREVIEW_ONLY : o00000OOOO00O;
      O00000OOOO00O var17 = var16.O00000000000();
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, var14.O00000000(10.0F), var14.O00000000(10.0F), var14.O00000000(10.0F), var14.O00000000(10.0F));

      try {
         if (var16 == O00000OOOO00O.TRAILS) {
            O0000000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n);
         } else if (var16 == O00000OOOO00O.SKY) {
            O000000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var15, f, g, h, i, j, k, l, m, n);
         } else if (var16 == O00000OOOO00O.NAMETAG) {
            O000000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n);
         } else if (var16 == O00000OOOO00O.CHAMS) {
            O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n, true);
         } else if (var16 == O00000OOOO00O.HEALTH_BAR) {
            O00000000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n);
         } else {
            switch (var17) {
               case HUD:
                  O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n);
                  break;
               case ESP:
                  O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, n, false);
                  break;
               case BACKGROUND:
                  O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var15, f, g, h, i, j, k, l, m, n);
                  break;
               default:
                  O0000000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var15, f, g, h, i, j, k, l, m, n);
            }
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      o0000O00OO0O0.O00000000(f, g, h, i, var14.O00000000(10.0F), ColorScheme.O00000000(var15.O000000000O0(), 96), 0.7F);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      String string,
      O00000OOOO00O o00000OOOO00O,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      String var14 = O000000000000O;
      String var15 = O00000000000O;
      String var16 = O00000OOOO0O00.O00000000000OO(string);
      O000000000000O = var16.isBlank() ? "__foundry_preview_live" : "__foundry_slot_preview_" + var16;
      O00000000000O = var16;
      boolean var19 = false /* VF: Semaphore variable */;

      try {
         var19 = true;
         O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO00O, null, o00000OOO0OO00, f, g, h, i, j, k, l, m, n);
         var19 = false;
      } finally {
         if (var19) {
            O000000000000O = var14;
            O00000000000O = var15;
         }
      }

      O000000000000O = var14;
      O00000000000O = var15;
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      o0000O00OO0O0.O00000000(f, g, h, i, 0.0F, -16645366);
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   private static void O000000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      o0000O00OO0O0.O000000000(f, g, h, i, 0.0F, -16381929, -15460309);
      o0000O00OO0O0.O00000000(
         f,
         g + i * 0.58F,
         h,
         i * 0.42F,
         0.0F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 54),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 28)
      );
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   private static void O0000000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      O00000000(o0000O00OO0O0, o0000O000O0OO, f, g, h, i, n);
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      ColorScheme var13 = o0000O000O0OOO.O0000000000000();
      O00000000(o0000O00OO0O0, var13, f, g, h, i, n);
      O00000OOO00OO0 var14 = O00000000(o00000OOOO0, o00000OOO0OO00);
      float var15 = Math.max(18.0F, Math.min(h * 0.84F, 220.0F));
      float var16 = Math.max(12.0F, Math.min(i * 0.58F, var15 * 0.42F));
      float var17 = f + (h - var15) * 0.5F;
      float var18 = g + i * 0.26F;
      float var19 = Math.min(var15, var16) * 0.18F;
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var14, f, g, h, i, var17, var18, var15, var16, var19, l, m, var13, n);
   }

   private static void O000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      ColorScheme var13 = o0000O000O0OOO.O0000000000000();
      O00000000(o0000O00OO0O0, var13, f, g, h, i, n);
      float var14 = Math.min(h * 0.7F, 230.0F);
      float var15 = Math.min(i * 0.24F, 54.0F);
      float var16 = f + (h - var14) * 0.5F;
      float var17 = g + i * 0.34F;
      float var18 = Math.min(var14, var15) * 0.22F;
      O00000OOO00OO0 var19 = O00000000(o00000OOOO0, o00000OOO0OO00);
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var19, f, g, h, i, var16, var17, var14, var15, var18, l, m, var13, n);
      MinecraftClient var20 = MinecraftClient.getInstance();
      String var21 = var20 != null && var20.player != null ? var20.player.getName().getString() : "Player";
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O000O0OOO.O000000000000(),
         FontRegistry.O00000000000,
         var16,
         var17 + var15 * 0.2F,
         var15 * 0.42F,
         10.0F,
         var21,
         var13.O000000000O()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O000O0OOO.O000000000000(),
         FontRegistry.O00000000,
         var16,
         var17 + var15 * 0.52F,
         var15 * 0.34F,
         8.0F,
         "20.0",
         ColorScheme.O00000000(var13.O000000000O00(), 220)
      );
   }

   private static void O0000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      O0000O00000 var13 = o0000O000O0OOO.O000000000000();
      ColorScheme var14 = o0000O000O0OOO.O0000000000000();
      MinecraftClient var15 = MinecraftClient.getInstance();
      ClientPlayerEntity var16 = var15 != null ? var15.player : null;
      O00000000(o0000O00OO0O0, var14, f, g, h, i, n);
      float var17 = g + i * 0.86F;
      o0000O00OO0O0.O00000000(f, var17, h, i - (var17 - g), 0.0F, -15657957);
      o0000O00OO0O0.O00000000(f, var17, h, 1.0F, 0.0F, -14670802);
      O00000OOO00OO0 var18 = O00000000(o00000OOOO0, o00000OOO0OO00);
      float var19 = Math.max(var13.O00000000(10.0F), i * 0.085F);
      float var20 = h * 0.55F;
      float var21 = f + h * 0.1F;
      float var22 = var17 - i * 0.3F - var19 * 0.5F;
      float var23 = var19 * 2.1F;
      float var24 = var22 - (var23 - var19) * 0.5F;
      o0000O00OO0O0.O00000000(var21, var24, var20, var23, var23 * 0.5F, var23 * 0.5F, var23 * 0.5F, var23 * 0.5F);

      try {
         O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var18, var21, var24, var20, var23, j, k, l, m, var14, n * 0.34F);
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      o0000O00OO0O0.O00000000(var21, var22, var20, var19, var19 * 0.5F, var19 * 0.5F, var19 * 0.5F, var19 * 0.5F);

      try {
         O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var18, var21, var22, var20, var19, j, k, l, m, var14, n);
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      if (var16 != null) {
         float var25 = Math.max(24.0F, Math.min(i * 0.58F, 105.0F));
         EntityGuiElementRenderState var26 = O00000000(var15, var16, f + h * 0.66F, var17, var25);
         O00000000(var15, var26);
      } else {
         float var35 = Math.min(h * 0.18F, 54.0F);
         float var36 = Math.min(i * 0.48F, 104.0F);
         float var27 = f + h * 0.66F - var35 * 0.5F;
         float var28 = var17 - var36;
         o0000O00OO0O0.O00000000(var27, var28, var35, var36, var35 * 0.22F, ColorScheme.O00000000(10, 12, 18, 230));
         o0000O00OO0O0.O00000000(var27, var28, var35, var36, var35 * 0.22F, ColorScheme.O00000000(var14.O000000000O0(), 140), 0.7F);
      }
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n,
      boolean bl
   ) {
      ColorScheme var14 = o0000O000O0OOO.O0000000000000();
      MinecraftClient var15 = MinecraftClient.getInstance();
      ClientPlayerEntity var16 = var15 != null ? var15.player : null;
      O00000000(o0000O00OO0O0, var14, f, g, h, i, n);
      float var17 = g + i * 0.88F;
      o0000O00OO0O0.O00000000(f, var17, h, i - (var17 - g), 0.0F, -15657957);
      o0000O00OO0O0.O00000000(f, var17, h, 1.0F, 0.0F, -14670802);
      if (var16 != null) {
         float var18 = (var17 - g) * 0.92F;
         float var19 = Math.max(24.0F, Math.min(var18, i * 0.78F) * 0.78F);
         float var20 = f + h * 0.5F;
         EntityGuiElementRenderState var22 = O00000000(var15, var16, var20, var17, var19);
         int var23 = O00000000(var15, var22, j, k);
         O00000000(var15, var22);
         if (var23 > 0) {
            O00000OOO00OO0 var24 = O00000000(o00000OOOO0, o00000OOO0OO00);
            boolean var25 = O00000OOOO00OO.O00000000(O00000000(), var24, var23, f, g, h, i, j, k, l, m, var14, bl ? n : n * 0.96F);
            O000000000();
            o0000O00OO0O0.O0000000000();
            if (var25) {
               return;
            }
         }
      }

      O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOOO0, o00000OOO0OO00, f, g, h, i, var17, j, k, l, m, n, bl);
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      float m,
      float n,
      float o,
      boolean bl
   ) {
      O0000O00000 var15 = o0000O000O0OOO.O000000000000();
      ColorScheme var16 = o0000O000O0OOO.O0000000000000();
      O00000OOO00OO0 var17 = O00000000(o00000OOOO0, o00000OOO0OO00);
      float var18 = f + h * 0.5F;
      float var19 = Math.min(i * 0.52F, var15.O00000000(130.0F));
      float var20 = Math.min(h * 0.2F, var15.O00000000(56.0F));
      float var21 = var20 * 0.72F;
      float var22 = var18 - var20 * 0.5F;
      float var23 = j - var19;
      float var24 = var18 - var21 * 0.5F;
      float var25 = var23 - var21 * 0.62F;
      float var26 = var20 * 0.3F;
      float var27 = var19 * 0.62F;
      float var28 = var20 * 0.34F;
      float var29 = var19 * 0.42F;
      o0000O00OO0O0.O00000000(
         var22 - var15.O00000000(6.0F),
         var25 - var15.O00000000(6.0F),
         var20 + var15.O00000000(12.0F),
         j - var25 + var15.O00000000(6.0F),
         var20 * 0.28F,
         var15.O00000000(22.0F),
         var15.O00000000(2.0F),
         ColorScheme.O00000000(var16.O000000000O0(), Math.round(64.0F * o))
      );
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var17, var24, var25, var21, var21, var21 * 0.42F, k, l, m, n, var16, o);
      O00000000(
         o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var17, var22 - var26 * 0.72F, var23 + var19 * 0.06F, var26, var27, var26 * 0.5F, k, l, m, n, var16, o
      );
      O00000000(
         o0000O00OO0O0,
         o00000OOOO0,
         o00000OOO0OO00,
         var17,
         var22 + var20 - var26 * 0.28F,
         var23 + var19 * 0.06F,
         var26,
         var27,
         var26 * 0.5F,
         k,
         l,
         m,
         n,
         var16,
         o
      );
      O00000000(
         o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var17, var22 + var20 * 0.1F, var23 + var19 * 0.58F, var28, var29, var28 * 0.4F, k, l, m, n, var16, o
      );
      O00000000(
         o0000O00OO0O0,
         o00000OOOO0,
         o00000OOO0OO00,
         var17,
         var22 + var20 - var28 - var20 * 0.1F,
         var23 + var19 * 0.58F,
         var28,
         var29,
         var28 * 0.4F,
         k,
         l,
         m,
         n,
         var16,
         o
      );
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var17, var22, var23, var20, var19 * 0.66F, var20 * 0.3F, k, l, m, n, var16, o);
      if (!bl) {
         o0000O00OO0O0.O00000000(var24, var25, var21, var21, var21 * 0.42F, ColorScheme.O00000000(var16.O000000000O0(), Math.round(150.0F * o)), 0.7F);
         o0000O00OO0O0.O00000000(var22, var23, var20, var19 * 0.66F, var20 * 0.3F, ColorScheme.O00000000(var16.O000000000O0(), Math.round(150.0F * o)), 0.7F);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      O00000OOO00OO0 o00000OOO00OO0,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      int l,
      float m,
      float n,
      ColorScheme o0000O000O0OO,
      float o
   ) {
      if (!(h <= 1.0F) && !(i <= 1.0F)) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);
         boolean var17 = false /* VF: Semaphore variable */;

         try {
            var17 = true;
            O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, o00000OOO00OO0, f, g, h, i, k, l, m, n, o0000O000O0OO, o);
            var17 = false;
         } finally {
            if (var17) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private static void O00000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      O0000O00000 var13 = o0000O000O0OOO.O000000000000();
      ColorScheme var14 = o0000O000O0OOO.O0000000000000();
      O00000000(o0000O00OO0O0, var14, f, g, h, i, n);
      float var15 = Math.min(h * 0.82F, var13.O00000000(280.0F));
      float var16 = Math.max(var13.O00000000(14.0F), Math.min(i * 0.16F, var13.O00000000(26.0F)));
      float var17 = f + (h - var15) * 0.5F;
      float var18 = g + i * 0.44F;
      float var19 = var16 * 0.5F;
      float var20 = 0.68F;
      o0000O00OO0O0.O00000000(var17, var18, var15, var16, var19, ColorScheme.O00000000(10, 12, 18, Math.round(220.0F * n)));
      o0000O00OO0O0.O00000000(var17, var18, var15, var16, var19, ColorScheme.O00000000(var14.O000000000O(), Math.round(40.0F * n)), 0.7F);
      float var21 = Math.max(var16, var15 * var20);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(var17, var18, var21, var16, var19, var19, var19, var19);

      try {
         O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, var17, var18, var15, var16, j, k, l, m, var14, n);
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      o0000O00OO0O0.O00000000(
         var17 + var21 - var13.O00000000(1.5F),
         var18 + var13.O00000000(1.5F),
         var13.O00000000(1.5F),
         var16 - var13.O00000000(3.0F),
         0.0F,
         ColorScheme.O00000000(var14.O000000000O(), Math.round(150.0F * n))
      );
      float var22 = var18 + var16 + var13.O00000000(8.0F);
      float var23 = Math.max(var13.O00000000(6.0F), var16 * 0.42F);
      o0000O00OO0O0.O00000000(var17, var22, var15, var23, var23 * 0.5F, ColorScheme.O00000000(10, 12, 18, Math.round(200.0F * n)));
      o0000O00OO0O0.O00000000(var17, var22, var15 * 0.5F, var23, var23 * 0.5F, ColorScheme.O00000000(var14.O000000000O0(), Math.round(150.0F * n)));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var13,
         FontRegistry.O00000000,
         var17,
         var18 - var13.O00000000(16.0F),
         var13.O00000000(12.0F),
         8.0F,
         "20.0 / 20.0",
         ColorScheme.O00000000(var14.O000000000O(), Math.round(180.0F * n))
      );
   }

   private static EntityGuiElementRenderState O00000000(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, float f, float g, float h) {
      if (minecraftClient != null && clientPlayerEntity != null) {
         int var5 = Math.max(48, Math.round(h * 2.24F));
         int var6 = Math.max(36, Math.round(var5 * 0.68F));
         int var7 = Math.round(f - var6 * 0.5F);
         int var8 = var7 + var6;
         int var9 = Math.round(g);
         int var10 = var9 - var5;
         int var11 = Math.max(18, Math.round(var5 * 0.43F));
         float var12 = (var7 + var8) * 0.5F;
         float var13 = (var10 + var9) * 0.5F;
         float var14 = var12 - (float)Math.tan(1.1F) * 40.0F;
         float var15 = var13 - (float)Math.tan(0.3F) * 40.0F;
         GuiRenderState var16 = new GuiRenderState();
         DrawContext var17 = new DrawContext(minecraftClient, var16);
         InventoryScreen.drawEntity(var17, var7, var10, var8, var9, var11, 0.0625F, var14, var15, clientPlayerEntity);
         EntityGuiElementRenderState[] var18 = new EntityGuiElementRenderState[1];
         var16.forEachSpecialElement(specialGuiElementRenderState -> {
            if (specialGuiElementRenderState instanceof EntityGuiElementRenderState var2) {
               var18[0] = var2;
            }
         });
         return var18[0];
      } else {
         return null;
      }
   }

   private static int O00000000(MinecraftClient minecraftClient, EntityGuiElementRenderState entityGuiElementRenderState, int i, int j) {
      if (entityGuiElementRenderState == null) {
         return 0;
      } else {
         int var4 = Math.max(1, i);
         int var5 = Math.max(1, j);
         O000000000.O00000000(var4, var5);
         if (!O000000000.O000000000000()) {
            return 0;
         } else {
            O0000O00O0OOO0.W373 var6 = O0000O00O0OOO0.O00000000();

            try {
               O000000000.O00000000();
               GL11.glViewport(0, 0, var4, var5);
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               GL11.glClear(16640);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDepthMask(false);
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               O000000000(minecraftClient, entityGuiElementRenderState);
            } catch (Throwable var8) {
               GL30.glBindFramebuffer(36160, 0);
               O0000O00O0OOO0.O00000000(var6);
               O000000000();
               return 0;
            }

            GL30.glBindFramebuffer(36160, 0);
            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var6);
            O000000000();
            return O000000000.O000000000();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O00000000(MinecraftClient minecraftClient, EntityGuiElementRenderState entityGuiElementRenderState) {
      if (entityGuiElementRenderState != null) {
         O0000O00O0OOO0.W373 var2 = O0000O00O0OOO0.O00000000();
         boolean var7 = false /* VF: Semaphore variable */;

         label48: {
            try {
               var7 = true;
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               O000000000(minecraftClient, entityGuiElementRenderState);
               var7 = false;
               break label48;
            } catch (Throwable var8) {
               var7 = false;
            } finally {
               if (var7) {
                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var2);
                  O000000000();
               }
            }

            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var2);
            O000000000();
            return;
         }

         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var2);
         O000000000();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O000000000(MinecraftClient minecraftClient, EntityGuiElementRenderState entityGuiElementRenderState) {
      if (minecraftClient != null && entityGuiElementRenderState != null) {
         EntityRenderDispatcher var2 = minecraftClient.getEntityRenderDispatcher();
         if (var2 != null) {
            Immediate var3 = minecraftClient.getBufferBuilders().getEntityVertexConsumers();
            if (var3 != null) {
               MatrixStack var4 = new MatrixStack();
               var4.push();
               var4.translate(
                  (entityGuiElementRenderState.x1() + entityGuiElementRenderState.x2()) * 0.5F,
                  (entityGuiElementRenderState.y1() + entityGuiElementRenderState.y2()) * 0.5F,
                  1000.0F
               );
               var4.scale(entityGuiElementRenderState.scale(), entityGuiElementRenderState.scale(), -entityGuiElementRenderState.scale());
               Vector3f var5 = entityGuiElementRenderState.translation();
               var4.translate(var5.x, var5.y, var5.z);
               var4.multiply(entityGuiElementRenderState.rotation());
               Quaternionf var6 = entityGuiElementRenderState.overrideCameraAngle();
               boolean var7 = false;
               if (var6 != null) {
                  var2.setRotation(var6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
                  var7 = true;
               }

               var2.setRenderShadows(false);
               int var8 = LightmapTextureManager.pack(15, 15);
               boolean var13 = false /* VF: Semaphore variable */;

               label89: {
                  label88: {
                     try {
                        var13 = true;
                        var2.render(entityGuiElementRenderState.renderState(), 0.0, 0.0, 0.0, var4, var3, var8);
                        var3.draw();
                        var13 = false;
                        break label88;
                     } catch (Throwable var14) {
                        var13 = false;
                     } finally {
                        if (var13) {
                           var2.setRenderShadows(true);
                           if (var7 && minecraftClient.gameRenderer != null && minecraftClient.gameRenderer.getCamera() != null) {
                              var2.setRotation(minecraftClient.gameRenderer.getCamera().getRotation());
                           }
                        }
                     }

                     var2.setRenderShadows(true);
                     if (var7 && minecraftClient.gameRenderer != null && minecraftClient.gameRenderer.getCamera() != null) {
                        var2.setRotation(minecraftClient.gameRenderer.getCamera().getRotation());
                     }
                     break label89;
                  }

                  var2.setRenderShadows(true);
                  if (var7 && minecraftClient.gameRenderer != null && minecraftClient.gameRenderer.getCamera() != null) {
                     var2.setRotation(minecraftClient.gameRenderer.getCamera().getRotation());
                  }
               }

               var4.pop();
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      O00000OOO00OO0 o00000OOO00OO0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      ColorScheme o0000O000O0OO,
      float q
   ) {
      o0000O00OO0O0.O0000000000();
      int var17 = Math.max(1, (int)Math.ceil(h));
      int var18 = Math.max(1, (int)Math.ceil(i));
      O00000000.O00000000(var17, var18);
      if (!O00000000.O000000000000()) {
         O00000000(
            o0000O00OO0O0,
            o00000OOOO0,
            o00000OOO0OO00,
            o00000OOO00OO0,
            j,
            k,
            l,
            m,
            Math.max(1, Math.round(l)),
            Math.max(1, Math.round(m)),
            o,
            p,
            o0000O000O0OO,
            q
         );
      } else {
         O0000O00O0OOO0.W373 var19 = O0000O00O0OOO0.O00000000();
         float[] var20 = new float[4];
         GL11.glGetFloatv(3106, var20);
         boolean var26 = false /* VF: Semaphore variable */;

         try {
            var26 = true;
            O00000000.O00000000();
            GL11.glViewport(0, 0, var17, var18);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            GL11.glEnable(3089);
            GL11.glScissor(0, 0, var17, var18);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            float var21 = j - f;
            float var22 = k - g;
            float var23 = Math.max(4.0F, Math.min(28.0F, Math.min(l, m) * 0.44F));
            if (o00000OOO00OO0 != null) {
               O00000OOOO00OO.O00000000(
                  O00000000(),
                  o00000OOO00OO0,
                  var21 - var23,
                  var22 - var23,
                  l + var23 * 2.0F,
                  m + var23 * 2.0F,
                  var21,
                  var22,
                  l,
                  m,
                  n,
                  var17,
                  var18,
                  o - f,
                  p - g,
                  o0000O000O0OO,
                  q
               );
               var26 = false;
            } else if (o00000OOOO0 != null) {
               o00000OOOO0.O00000000(o00000OOO0OO00, var21, var22, l, m, var17, var18, o - f, p - g, o0000O000O0OO, q);
               var26 = false;
            } else {
               var26 = false;
            }
         } finally {
            if (var26) {
               GL11.glClearColor(var20[0], var20[1], var20[2], var20[3]);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var19);
               O000000000();
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
            }
         }

         GL11.glClearColor(var20[0], var20[1], var20[2], var20[3]);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var19);
         O000000000();
         GlStateManager._enableBlend();
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         o0000O00OO0O0.O000000000(O00000000.O000000000(), f, g, h, i);
         o0000O00OO0O0.O0000000000();
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, float f, float g, float h, float i, float j) {
      boolean var7 = o0000O000O0OO.O000000000O000();
      int var8 = Math.round(255.0F * Math.max(0.0F, Math.min(1.0F, j)));
      int var9 = var7 ? ColorScheme.O00000000(233, 236, 243, var8) : ColorScheme.O00000000(26, 28, 37, var8);
      int var10 = var7 ? ColorScheme.O00000000(212, 216, 227, var8) : ColorScheme.O00000000(12, 13, 19, var8);
      o0000O00OO0O0.O000000000(f, g, h, i, 0.0F, var9, var10);
      o0000O00OO0O0.O000000000(
         f,
         g,
         h,
         i * 0.6F,
         0.0F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(16.0F * j)),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 0)
      );
      float var11 = Math.min(h, i) * 0.34F;
      int var12 = ColorScheme.O00000000(0, 0, 0, Math.round((var7 ? 26.0F : 60.0F) * j));
      o0000O00OO0O0.O000000000(f, g, h, var11, 0.0F, var12, ColorScheme.O00000000(0, 0, 0, 0));
      o0000O00OO0O0.O000000000(f, g + i - var11, h, var11, 0.0F, ColorScheme.O00000000(0, 0, 0, 0), var12);
      o0000O00OO0O0.O00000000(f, g, var11, i, 0.0F, var12, ColorScheme.O00000000(0, 0, 0, 0));
      o0000O00OO0O0.O00000000(f + h - var11, g, var11, i, 0.0F, ColorScheme.O00000000(0, 0, 0, 0), var12);
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      ColorScheme o0000O000O0OO,
      float n
   ) {
      O00000000(o0000O00OO0O0, o00000OOOO0, o00000OOO0OO00, O00000000(o00000OOOO0, o00000OOO0OO00), f, g, h, i, j, k, l, m, o0000O000O0OO, n);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void O00000000(
      RenderManager o0000O00OO0O0,
      O00000OOOO0 o00000OOOO0,
      O00000OOO0OO00 o00000OOO0OO00,
      O00000OOO00OO0 o00000OOO00OO0,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      ColorScheme o0000O000O0OO,
      float n
   ) {
      o0000O00OO0O0.O0000000000();
      int var14 = Math.max(1, (int)Math.ceil(h));
      int var15 = Math.max(1, (int)Math.ceil(i));
      O00000000.O00000000(var14, var15);
      if (!O00000000.O000000000000()) {
         if (o00000OOO00OO0 != null) {
            O00000OOOO00OO.O00000000(O00000000(), o00000OOO00OO0, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
            O000000000();
         } else if (o00000OOOO0 != null) {
            o00000OOOO0.O00000000(o00000OOO0OO00, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
         }

         o0000O00OO0O0.O0000000000();
      } else {
         O0000O00O0OOO0.W373 var16 = O0000O00O0OOO0.O00000000();
         float[] var17 = new float[4];
         GL11.glGetFloatv(3106, var17);
         boolean var20 = false /* VF: Semaphore variable */;

         try {
            var20 = true;
            O00000000.O00000000();
            GL11.glViewport(0, 0, var14, var15);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDepthMask(false);
            GlStateManager._enableBlend();
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            GL11.glDisable(36281);
            GL11.glEnable(3089);
            GL11.glScissor(0, 0, var14, var15);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            if (o00000OOO00OO0 != null) {
               O00000OOOO00OO.O00000000(O00000000(), o00000OOO00OO0, 0.0F, 0.0F, var14, var15, var14, var15, l - f, m - g, o0000O000O0OO, n);
               var20 = false;
            } else if (o00000OOOO0 != null) {
               o00000OOOO0.O00000000(o00000OOO0OO00, 0.0F, 0.0F, var14, var15, var14, var15, l - f, m - g, o0000O000O0OO, n);
               var20 = false;
            } else {
               var20 = false;
            }
         } finally {
            if (var20) {
               GL11.glClearColor(var17[0], var17[1], var17[2], var17[3]);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var16);
               O000000000();
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
            }
         }

         GL11.glClearColor(var17[0], var17[1], var17[2], var17[3]);
         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var16);
         O000000000();
         GlStateManager._enableBlend();
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         o0000O00OO0O0.O000000000(O00000000.O000000000(), f, g, h, i);
         o0000O00OO0O0.O0000000000();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOO00OO0 o00000OOO00OO0,
      String string,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      float n
   ) {
      ColorScheme var13 = o0000O000O0OOO.O0000000000000();
      O0000O00000 var14 = o0000O000O0OOO.O000000000000();
      float var15 = var14.O00000000(6.0F);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, var15, var15, var15, var15);
      boolean var24 = false /* VF: Semaphore variable */;

      try {
         var24 = true;
         O00000000(o0000O00OO0O0, var13, f, g, h, i, n);
         if (o00000OOO00OO0 != null) {
            if (o00000OOO00OO0.ok()) {
               if (string != null) {
                  if (!string.isBlank()) {
                     if (h > 2.0F) {
                        if (i > 2.0F) {
                           int var16 = Math.max(1, (int)Math.ceil(h));
                           int var17 = Math.max(1, (int)Math.ceil(i));
                           O0000000000.O00000000(var16, var17);
                           if (O0000000000.O000000000000()) {
                              o0000O00OO0O0.O0000000000();
                              O0000O00O0OOO0.W373 var18 = O0000O00O0OOO0.O00000000();
                              float[] var19 = new float[4];
                              GL11.glGetFloatv(3106, var19);

                              try {
                                 O0000000000.O00000000();
                                 GL11.glViewport(0, 0, var16, var17);
                                 GL11.glDisable(2929);
                                 GL11.glDisable(2884);
                                 GL11.glDepthMask(false);
                                 GlStateManager._enableBlend();
                                 GL11.glEnable(3042);
                                 GL14.glBlendFuncSeparate(770, 771, 1, 771);
                                 GL11.glDisable(36281);
                                 GL11.glEnable(3089);
                                 GL11.glScissor(0, 0, var16, var17);
                                 GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                                 GL11.glClear(16384);
                                 O00000OOOO00OO.O00000000(string, o00000OOO00OO0, 0.0F, 0.0F, var16, var17, var16, var17, l - f, m - g, var13, 1.0F);
                              } finally {
                                 GL11.glClearColor(var19[0], var19[1], var19[2], var19[3]);
                                 GL20.glUseProgram(0);
                                 O0000O00O0OOO0.O00000000(var18);
                                 O000000000();
                                 GlStateManager._enableBlend();
                                 GL11.glEnable(3042);
                                 GL14.glBlendFuncSeparate(770, 771, 1, 771);
                              }

                              o0000O00OO0O0.O000000000(O0000000000.O000000000(), f, g, h, i);
                              o0000O00OO0O0.O0000000000();
                              var24 = false;
                           } else {
                              var24 = false;
                           }
                        } else {
                           var24 = false;
                        }
                     } else {
                        var24 = false;
                     }
                  } else {
                     var24 = false;
                  }
               } else {
                  var24 = false;
               }
            } else {
               var24 = false;
            }
         } else {
            var24 = false;
         }
      } finally {
         if (var24) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, var15, ColorScheme.O00000000(var13.O000000000O0(), Math.round(70.0F * n)), 0.6F);
   }

   private static O00000OOO00OO0 O00000000(O00000OOOO0 o00000OOOO0, O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOOO0 != null) {
         return o00000OOOO0.O000000000(o00000OOO0OO00);
      } else if (o00000OOO0OO00 == null) {
         return null;
      } else {
         if (O00000000000O != null && !O00000000000O.isBlank()) {
            O00000OOO00OO0 var2 = O00000OOOO0O00.O00000000().O000000000(O00000000000O);
            if (var2 != null) {
               return var2;
            }
         }

         String var4 = o00000OOO0OO00.O00000000() == null ? "" : o00000OOO0OO00.O00000000().O000000000();
         if (!var4.isBlank()) {
            O00000OOO00OO0 var3 = O00000OOOO0O00.O00000000().O000000000(var4);
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }
   }

   private static String O00000000() {
      return O000000000000O != null && !O000000000000O.isBlank() ? O000000000000O : "__foundry_preview_live";
   }

   private static void O000000000() {
      GL20.glUseProgram(0);
      if (!Boolean.FALSE.equals(O0000000000O0)) {
         try {
            if (O0000000000O0 == null) {
               Class var0 = Class.forName("com.mojang.blaze3d.systems.RenderSystem");
               Class var1 = Class.forName("net.minecraft.client.render.GameRenderer");
               O0000000000O00 = var0.getMethod("setShader", Supplier.class);
               O0000000000O0O = var1.getMethod("getPositionColorProgram");
               O0000000000O0 = true;
            }

            Supplier var3 = () -> {
               try {
                  return O0000000000O0O.invoke(null);
               } catch (Throwable var1x) {
                  return null;
               }
            };
            O0000000000O00.invoke(null, var3);
         } catch (Throwable var2) {
            O0000000000O0 = false;
         }
      }
   }
}
