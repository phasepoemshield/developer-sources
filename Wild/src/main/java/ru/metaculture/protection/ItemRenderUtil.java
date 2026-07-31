package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteContents;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

public final class ItemRenderUtil {
   private static final MinecraftClient O00000000 = MinecraftClient.getInstance();
   private static final ItemRenderState O000000000 = new ItemRenderState();
   private static final Random O0000000000 = Random.create(0L);
   private static final String[] O00000000000 = O000000000();
   private static final Set<Integer> O000000000000 = ConcurrentHashMap.newKeySet();
   private static final Map<String, ItemRenderUtil.W147> O0000000000000 = new ConcurrentHashMap<>();
   private static final long O000000000000O = 5000L;
   private static Field O00000000000O;

   private ItemRenderUtil() {
   }

   public static void O00000000(DrawContext drawContext, ItemStack itemStack, float f, float g, float h, int i, boolean bl) {
      O00000000(drawContext, O00000000.player, itemStack, f, g, h, i, bl);
   }

   public static void O00000000(DrawContext drawContext, PlayerEntity playerEntity, ItemStack itemStack, float f, float g, float h, int i, boolean bl) {
      Object var8 = playerEntity != null ? playerEntity : O00000000.player;
      if (drawContext != null && var8 != null && itemStack != null && !itemStack.isEmpty()) {
         float var9 = O00000000.getWindow().getScaleFactor();
         float var10 = O00000000(f);
         float var11 = O00000000(g);
         float var12 = O0000000000(h);
         drawContext.getMatrices().pushMatrix();
         drawContext.getMatrices().translate(var10 / var9, var11 / var9);
         drawContext.getMatrices().scale(var12 / var9, var12 / var9);
         drawContext.drawItem((LivingEntity)var8, itemStack, 0, 0, i);
         if (bl) {
            drawContext.drawStackOverlay(O00000000.textRenderer, itemStack, 0, 0);
         }

         drawContext.getMatrices().popMatrix();
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, ItemStack itemStack, float f, float g, float h, int i, boolean bl, int j) {
      if (o0000O00OO0O0 != null && O00000000.player != null && itemStack != null && !itemStack.isEmpty()) {
         if (O00000000(o0000O00OO0O0, itemStack, f, g, h)) {
            if (bl) {
               O000000000(o0000O00OO0O0, itemStack, f, g, h);
            }
         } else {
            try {
               O000000000.clear();
               O00000000.getItemModelManager().clearAndUpdate(O000000000, itemStack, ItemDisplayContext.GUI, O00000000.world, O00000000.player, i);
               O0000000000.setSeed(i);
               Sprite var8 = O000000000.getParticleSprite(O0000000000);
               if (var8 == null) {
                  return;
               }

               AbstractTexture var9 = O00000000.getTextureManager().getTexture(var8.getAtlasId());
               if (var9 == null || !(var9.getGlTexture() instanceof GlTexture var10 && var10.getGlId() > 0)) {
                  return;
               }

               o0000O00OO0O0.O00000000(
                  var10.getGlId(), f, g, 16.0F * h, 16.0F * h, var8.getMinU(), var8.getMinV(), var8.getMaxU(), var8.getMaxV(), Math.max(2.0F, 4.0F * h)
               );
            } catch (Throwable var12) {
            }

            if (bl) {
               O000000000(o0000O00OO0O0, itemStack, f, g, h);
            }
         }
      }
   }

   public static int[] O00000000(ItemStack itemStack, int i) {
      if (itemStack != null && !itemStack.isEmpty() && O00000000.player != null) {
         long var2 = System.currentTimeMillis();
         String var4 = O0000000000(itemStack, i);
         ItemRenderUtil.W147 var5 = O0000000000000.get(var4);
         if (var5 != null && var2 - var5.createdAt <= 5000L) {
            return O00000000(var5.colors);
         } else {
            int[] var6 = O00000000(itemStack);
            if (var6 == null) {
               var6 = O000000000(itemStack, i);
            }

            O0000000000000.put(var4, new ItemRenderUtil.W147(O00000000(var6), var2));
            return var6;
         }
      } else {
         return null;
      }
   }

   public static int[] O00000000() {
      return new int[]{RenderManager.W382.O0000000000(220, 255, 245, 255), RenderManager.W382.O0000000000(142, 226, 255, 255)};
   }

   private static int[] O000000000(ItemStack itemStack, int i) {
      try {
         O000000000.clear();
         O00000000.getItemModelManager().clearAndUpdate(O000000000, itemStack, ItemDisplayContext.GUI, O00000000.world, O00000000.player, i);
         O0000000000.setSeed(i);
         Sprite var2 = O000000000.getParticleSprite(O0000000000);
         if (var2 == null) {
            return null;
         } else {
            NativeImage var3 = O00000000(var2.getContents());
            if (var3 == null) {
               return null;
            } else {
               int var4 = Math.min(var2.getContents().getWidth(), var3.getWidth());
               int var5 = Math.min(var2.getContents().getHeight(), var3.getHeight());
               return O00000000(var3, 0, 0, var4, var5);
            }
         }
      } catch (Throwable var6) {
         return null;
      }
   }

   private static int[] O00000000(ItemStack itemStack) {
      if (!itemStack.isOf(Items.PLAYER_HEAD)) {
         return null;
      } else {
         try {
            ProfileComponent var1 = (ProfileComponent)itemStack.get(DataComponentTypes.PROFILE);
            if (var1 == null) {
               return null;
            } else {
               SkinTextures var2 = O00000000.getSkinProvider().getSkinTextures(var1.gameProfile());
               if (var2 != null && var2.texture() != null) {
                  if (O00000000.getTextureManager().getTexture(var2.texture()) instanceof NativeImageBackedTexture var4) {
                     NativeImage var5 = var4.getImage();
                     if (var5 != null && var5.getWidth() >= 16 && var5.getHeight() >= 16) {
                        int[] var6 = O00000000(var5, 8, 8, 8, 8);
                        int[] var7 = var5.getWidth() >= 48 ? O00000000(var5, 40, 8, 8, 8) : null;
                        return O00000000(var6, var7);
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               } else {
                  return null;
               }
            }
         } catch (Throwable var8) {
            return null;
         }
      }
   }

   private static boolean O00000000(RenderManager o0000O00OO0O0, ItemStack itemStack, float f, float g, float h) {
      if (!itemStack.isOf(Items.PLAYER_HEAD)) {
         return false;
      } else {
         try {
            ProfileComponent var5 = (ProfileComponent)itemStack.get(DataComponentTypes.PROFILE);
            if (var5 == null) {
               return false;
            } else {
               SkinTextures var6 = O00000000.getSkinProvider().getSkinTextures(var5.gameProfile());
               if (var6 != null && var6.texture() != null) {
                  AbstractTexture var7 = O00000000.getTextureManager().getTexture(var6.texture());
                  if (var7 != null && var7.getGlTexture() instanceof GlTexture var8 && var8.getGlId() > 0) {
                     float var13 = 16.0F * h;
                     float var10 = Math.max(2.0F, 4.0F * h);
                     int var11 = var8.getGlId();
                     o0000O00OO0O0.O00000000(var11, f, g, var13, var13, 0.125F, 0.125F, 0.25F, 0.25F, var10);
                     o0000O00OO0O0.O00000000(var11, f, g, var13, var13, 0.625F, 0.125F, 0.75F, 0.25F, var10);
                     return true;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            }
         } catch (Throwable var12) {
            return false;
         }
      }
   }

   private static NativeImage O00000000(SpriteContents spriteContents) {
      if (spriteContents == null) {
         return null;
      } else {
         try {
            Field var1 = O00000000000O;
            if (var1 == null) {
               for (Field var5 : SpriteContents.class.getDeclaredFields()) {
                  if (var5.getType() == NativeImage.class) {
                     var1 = var5;
                     break;
                  }
               }

               if (var1 == null) {
                  return null;
               }

               var1.setAccessible(true);
               O00000000000O = var1;
            }

            return var1.get(spriteContents) instanceof NativeImage var8 ? var8 : null;
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   private static int[] O00000000(NativeImage nativeImage, int i, int j, int k, int l) {
      if (nativeImage != null && k > 0 && l > 0) {
         ItemRenderUtil.W148[] var5 = new ItemRenderUtil.W148[24];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = new ItemRenderUtil.W148();
         }

         int var19 = Math.min(nativeImage.getWidth(), i + k);
         int var7 = Math.min(nativeImage.getHeight(), j + l);

         for (int var8 = Math.max(0, j); var8 < var7; var8++) {
            for (int var9 = Math.max(0, i); var9 < var19; var9++) {
               int var10 = nativeImage.getColorArgb(var9, var8);
               int var11 = var10 >>> 24 & 0xFF;
               if (var11 >= 40) {
                  int var12 = var10 >>> 16 & 0xFF;
                  int var13 = var10 >>> 8 & 0xFF;
                  int var14 = var10 & 0xFF;
                  float[] var15 = Color.RGBtoHSB(var12, var13, var14, null);
                  if (!(var15[2] < 0.09F)) {
                     float var16 = var15[1];
                     float var17 = var11 / 255.0F * (0.25F + var16 * 1.9F) * (0.35F + var15[2]);
                     if (var16 < 0.08F) {
                        var17 *= 0.2F;
                     }

                     int var18 = Math.min(var5.length - 1, (int)(var15[0] * var5.length));
                     var5[var18].O00000000(var12, var13, var14, var17);
                  }
               }
            }
         }

         int var20 = O00000000(var5, -1);
         if (var20 >= 0 && !(var5[var20].O00000000000 < 0.75F)) {
            int var21 = O00000000(var5, var20);
            int var22 = var5[var20].O00000000();
            int var23 = var21 >= 0 && var5[var21].O00000000000 >= var5[var20].O00000000000 * 0.18F ? var5[var21].O00000000() : O00000000(var22);
            return O00000000(var22, var23);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static int O00000000(ItemRenderUtil.W148[] o000000000s, int i) {
      int var2 = -1;
      float var3 = 0.0F;

      for (int var4 = 0; var4 < o000000000s.length; var4++) {
         if (var4 != i && !(o000000000s[var4].O00000000000 <= var3) && (i < 0 || O00000000(var4, i, o000000000s.length) >= 3)) {
            var2 = var4;
            var3 = o000000000s[var4].O00000000000;
         }
      }

      return var2;
   }

   private static int O00000000(int i, int j, int k) {
      int var3 = Math.abs(i - j);
      return Math.min(var3, k - var3);
   }

   private static int O00000000(int i) {
      float[] var1 = Color.RGBtoHSB(RenderManager.W382.O0000000000O00(i), RenderManager.W382.O0000000000O0O(i), RenderManager.W382.O0000000000OO(i), null);
      float var2 = (var1[0] + 0.08F) % 1.0F;
      int var3 = Color.HSBtoRGB(var2, Math.min(1.0F, var1[1] * 1.08F), Math.min(1.0F, var1[2] * 1.18F));
      return RenderManager.W382.O0000000000(var3 >>> 16 & 0xFF, var3 >>> 8 & 0xFF, var3 & 0xFF, 255);
   }

   private static int[] O00000000(int i, int j) {
      int var2 = O000000000(i);
      int var3 = O000000000(j);
      if (O000000000(var2, var3) < 42) {
         var3 = O00000000(var2);
         var3 = O000000000(var3);
      }

      return new int[]{var2, var3};
   }

   private static int O000000000(int i) {
      int var1 = RenderManager.W382.O0000000000O00(i);
      int var2 = RenderManager.W382.O0000000000O0O(i);
      int var3 = RenderManager.W382.O0000000000OO(i);
      float[] var4 = Color.RGBtoHSB(var1, var2, var3, null);
      float var5 = var1 * 0.2126F + var2 * 0.7152F + var3 * 0.0722F;
      if (var4[1] < 0.1F && var5 < 150.0F) {
         return O00000000()[0];
      } else {
         float var6 = Math.min(1.0F, Math.max(var4[1] * 1.12F, 0.38F));
         float var7 = Math.min(1.0F, Math.max(var4[2], 0.78F));
         if (var5 < 115.0F) {
            var7 = Math.max(var7, 0.88F);
         }

         int var8 = Color.HSBtoRGB(var4[0], var6, var7);
         return RenderManager.W382.O0000000000(var8 >>> 16 & 0xFF, var8 >>> 8 & 0xFF, var8 & 0xFF, 255);
      }
   }

   private static int O000000000(int i, int j) {
      int var2 = RenderManager.W382.O0000000000O00(i) - RenderManager.W382.O0000000000O00(j);
      int var3 = RenderManager.W382.O0000000000O0O(i) - RenderManager.W382.O0000000000O0O(j);
      int var4 = RenderManager.W382.O0000000000OO(i) - RenderManager.W382.O0000000000OO(j);
      return Math.abs(var2) + Math.abs(var3) + Math.abs(var4);
   }

   private static int[] O00000000(int[] is, int[] js) {
      if (is == null) {
         return js;
      } else {
         return js == null ? is : new int[]{is[0], js[1]};
      }
   }

   private static String O0000000000(ItemStack itemStack, int i) {
      return itemStack.getItem() + "|" + itemStack.getName().getString() + "|" + itemStack.getComponents() + "|" + i;
   }

   private static int[] O00000000(int[] is) {
      return is == null ? null : new int[]{is[0], is[1]};
   }

   public static void O00000000(Identifier identifier) {
      if (identifier != null) {
         try {
            AbstractTexture var1 = O00000000.getTextureManager().getTexture(identifier);
            if (var1 != null && var1.getGlTexture() instanceof GlTexture var2 && var2.getGlId() > 0) {
               int var5 = var2.getGlId();
               if (O000000000000.add(var5)) {
                  GlStateManager._bindTexture(var5);
                  GlStateManager._texParameter(3553, 10241, 9728);
                  GlStateManager._texParameter(3553, 10240, 9728);
               }
            }
         } catch (Throwable var4) {
         }
      }
   }

   public static float O00000000(float f) {
      return Math.round(f);
   }

   public static float O000000000(float f) {
      return Math.max(1.0F, (float)Math.round(f));
   }

   public static float O0000000000(float f) {
      return Float.isFinite(f) && !(f <= 0.0F) ? Math.max(0.0625F, Math.round(f * 16.0F) / 16.0F) : 1.0F;
   }

   public static void O00000000(DrawContext drawContext, RenderPipeline renderPipeline, Identifier identifier, float f, float g, float h, int i, int j) {
      if (drawContext != null && renderPipeline != null && identifier != null) {
         float var8 = O00000000.getWindow().getScaleFactor();
         drawContext.getMatrices().pushMatrix();
         drawContext.getMatrices().translate(f / var8, g / var8);
         drawContext.getMatrices().scale(h / var8, h / var8);
         drawContext.drawTexture(renderPipeline, identifier, 0, 0, 0.0F, 0.0F, i, j, i, j);
         drawContext.getMatrices().popMatrix();
      }
   }

   private static void O000000000(RenderManager o0000O00OO0O0, ItemStack itemStack, float f, float g, float h) {
      if (itemStack.getCount() > 1) {
         int var5 = itemStack.getCount();
         String var6 = var5 >= 0 && var5 < O00000000000.length ? O00000000000[var5] : "999+";
         float var7 = Math.max(7.0F, 18.0F * h);
         float var8 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var6, var7).O00000000;
         float var9 = f + 16.0F * h - var8 - 1.0F * h;
         float var10 = g + 15.0F * h;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var9, var10, var7, var6, RenderManager.W382.O0000000000(255, 255, 255, 255));
      }
   }

   private static String[] O000000000() {
      String[] var0 = new String[1000];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = Integer.toString(var1);
      }

      return var0;
   }

   record W147(int[] colors, long createdAt) {
   }

   static final class W148 {
      private float O00000000;
      private float O000000000;
      private float O0000000000;
      float O00000000000;

      void O00000000(int i, int j, int k, float f) {
         this.O00000000 += i * f;
         this.O000000000 += j * f;
         this.O0000000000 += k * f;
         this.O00000000000 += f;
      }

      int O00000000() {
         return this.O00000000000 <= 0.0F
            ? RenderManager.W382.O0000000000(220, 255, 245, 255)
            : RenderManager.W382.O0000000000(
               Math.round(this.O00000000 / this.O00000000000),
               Math.round(this.O000000000 / this.O00000000000),
               Math.round(this.O0000000000 / this.O00000000000),
               255
            );
      }
   }
}
