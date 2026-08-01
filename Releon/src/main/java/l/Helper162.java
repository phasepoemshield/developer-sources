package l;

import java.util.HashMap;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.math.ColorHelper;

public final class Helper162 implements Helper160 {
   public static final HashMap<ItemStack, Helper161> SPRITE_CACHE = new HashMap<>();

   public static void method1337(MatrixStack var0, ItemStack var1, float var2, float var3, boolean var4, boolean var5) {
      Helper161 var6 = method1340(var1);
      if (var6 != null) {
         Helper178.method1509(var0, var6.sprite, var2, var3, 16.0F, 16);
      }

      if (var4) {
         method1338(var0, var1, var2, var3);
      }

      if (var5) {
         method1339(var0, var1, var2, var3);
      }
   }

   private static void method1338(MatrixStack var0, ItemStack var1, float var2, float var3) {
      int var4 = var1.getCount();
      String var5 = var4 > 1 ? var4 + "" : "";
      if (!var5.isEmpty()) {
         Helper175 var6 = Helper103.method926(16);
         var6.method1474(var0, var5, var2 + 16.0F - var6.method1479(var5), var3 + 11.0F, Helper133.method1160());
      }
   }

   private static void method1339(MatrixStack var0, ItemStack var1, float var2, float var3) {
      if (var1.isItemBarVisible()) {
         rectangle.method677(Helper80.method841(var0, var2 + 1.5F, var3 + 13.0F, 13.0, 2.0).method823(-16777216).method840());
         rectangle.method677(
            Helper80.method841(var0, var2 + 1.5F, var3 + 13.0F, var1.getItemBarStep(), 1.0)
               .method823(ColorHelper.fullAlpha(var1.getItemBarColor()))
               .method840()
         );
      }
   }

   private static Helper161 method1340(ItemStack var0) {
      return SPRITE_CACHE.computeIfAbsent(var0, var1 -> {
         ItemRenderState var2 = new ItemRenderState();
         mc.getItemModelManager().update(var2, var0, ModelTransformationMode.GUI, mc.world, null, 0);
         Sprite var3 = method1341(var2);
         if (var3 != null) {
            int var4 = mc.getTextureManager().getTexture(var3.getAtlasId()).getGlId();
            return new Helper161(var3, var4, 16777215);
         } else {
            return null;
         }
      });
   }

   private static Sprite method1341(ItemRenderState var0) {
      BakedModel var1 = var0.layers[0].model;
      return var0.layerCount != 0 && var1 != null ? var1.getParticleSprite() : null;
   }

   private Helper162() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
