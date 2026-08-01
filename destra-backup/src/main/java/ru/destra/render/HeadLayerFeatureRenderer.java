package ru.destra.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import ru.destra.core.DestraClient;
import ru.destra.module.ChinaHatModule;

public class HeadLayerFeatureRenderer extends FeatureRenderer {
   private static final float Y_OFFSET_NO_HELMET = -0.43F;
   private static final float Y_OFFSET_WITH_HELMET = -0.53F;
   private static final float Y_OFFSET_CHINA_HAT_EXTRA = 0.06F;
   private final PlayerEntityModel contextModel;

   public HeadLayerFeatureRenderer(FeatureRendererContext var1) {
      super(var1);
      this.contextModel = (PlayerEntityModel) var1.getModel();
   }

   public void render(MatrixStack var1, VertexConsumerProvider var2, int var3, EntityRenderState var4, float var5, float var6) {
      if (!(var4 instanceof PlayerEntityRenderState)) return;
      PlayerEntityRenderState state = (PlayerEntityRenderState) var4;
      MinecraftClient mc = MinecraftClient.getInstance();
      DestraClient var7 = DestraClient.getInstance();
      if (var7 != null && var7.getModuleManager() != null && mc.player != null && mc.world != null) {
         if (!(mc.currentScreen instanceof InventoryScreen) && !(mc.currentScreen instanceof CreativeInventoryScreen)) {
            ChinaHatModule var8 = var7.getModuleManager().chinaHat;
            if (var8 != null && var8.Д()) {
               Entity var10 = mc.world.getEntityById(state.id);
               if (var10 instanceof PlayerEntity) {
                  PlayerEntity var9 = (PlayerEntity)var10;
                  if (var9 == mc.player && !state.invisible && !var9.isInvisible() && !var9.isSpectator()) {
                     if (mc.options.getPerspective() != Perspective.FIRST_PERSON) {
                        boolean var13 = var7.getModuleManager().babyMod != null && var7.getModuleManager().babyMod.Д();
                        ItemStack var11 = var9.getEquippedStack(EquipmentSlot.HEAD);
                        var1.push();
                        if (this.contextModel == null) {
                           var1.pop();
                           return;
                        }
                        this.contextModel.getHead().rotate(var1);
                        float var12 = var11.isEmpty() ? Y_OFFSET_NO_HELMET : Y_OFFSET_WITH_HELMET;
                        if (var13) {
                           var12 -= Y_OFFSET_CHINA_HAT_EXTRA;
                        }

                        var1.push();
                        var1.translate(0.0F, var12, 0.0F);
                        var8.renderHat(var1, var2, var13);
                        var1.pop();
                        var1.pop();
                     }
                  }
               }
            }
         }
      }
   }

}
