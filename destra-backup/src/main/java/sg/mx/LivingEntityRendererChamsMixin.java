package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.gui.Theme2DManager;
import ru.destra.misc.TargetEntityProvider;
import ru.destra.module.ChamsModule;
import ru.destra.render.ChamsRenderLayer;
import ru.destra.render.ChamsRenderer;
import ru.destra.util.NamedColor;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererChamsMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Unique
   private static final Identifier DESTRA$GLOW_CAPTURE_TEXTURE = Identifier.of("destra", "textures/glow_entity_capture.png");
   @Unique
   private T destra$currentEntity;
   @Unique
   private boolean destra$glowCaptured;
   @Unique
   private static final int аэ = 0xF000F0;

   @Shadow
   protected abstract M getModel();

   @Inject(method = "updateRenderState", at = @At("TAIL"))
   private void destra$updateCurrentEntity(T var1, S var2, float var3, CallbackInfo var4) {
      this.destra$currentEntity = (T)var1;
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$beginRender(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      this.destra$glowCaptured = false;
      if (this.destra$currentEntity != null) {
         TargetEntityProvider.setTarget(this.destra$currentEntity);
      }

      ChamsModule var6 = destra$getChamsModule();
      if (var6 != null && this.destra$currentEntity != null && var6.isShaderMode(this.destra$currentEntity)) {
         ChamsRenderer.beginDepthCopyPass();
      }
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$endRender(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      this.destra$currentEntity = null;
      TargetEntityProvider.clearTarget();
   }

   @WrapOperation(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/VertexConsumerProvider;getBuffer(Lnet/minecraft/client/render/RenderLayer;)Lnet/minecraft/client/render/VertexConsumer;", ordinal = 0)
   )
   private VertexConsumer destra$replaceEntityTexture(VertexConsumerProvider var1, RenderLayer var2, Operation<VertexConsumer> var3) {
      ChamsModule var4 = destra$getChamsModule();
      Entity var5 = TargetEntityProvider.getTarget();
      if (var4 == null || var5 == null || !var4.isValidChamTarget(var5)) {
         return (VertexConsumer)var3.call(new Object[]{var1, var2});
      } else {
         return var4.isShaderModeActive()
            ? (VertexConsumer)var3.call(new Object[]{var1, var2})
            : var1.getBuffer(ChamsRenderLayer.getChamsFill(var4.isPartiallyTransparent(var5)));
      }
   }

   @WrapOperation(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V", ordinal = 0)
   )
   private void destra$overrideFillRender(M var1, MatrixStack var2, VertexConsumer var3, int var4, int var5, int var6, Operation<Void> var7) {
      ChamsModule var8 = destra$getChamsModule();
      Entity var9 = TargetEntityProvider.getTarget();
      if (var8 != null && var9 != null && var8.isValidChamTarget(var9) && !var8.isShaderModeActive()) {
          var7.call(new Object[]{var1, var2, var3, аэ, var5, destra$themeChamsColor(var8, var8.getFillColor(var9))});
       } else {
          var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
       }
   }

   @Inject(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V",
         shift = Shift.AFTER
      )
   )
   private void destra$captureGlowPass(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      if (!this.destra$glowCaptured) {
         this.destra$glowCaptured = true;
         ChamsModule var6 = destra$getChamsModule();
         Entity var7 = TargetEntityProvider.getTarget();
         if (var6 != null && var7 != null) {
            boolean var8 = var6.hasGlow(var7);
            boolean var9 = var6.isShaderMode(var7);
            if (var8 || var9) {
               EntityModel var10 = this.getModel();
               if (var10 != null) {
                  try {
                     if (var3 instanceof Immediate var11) {
                        var11.draw();
                     }

                     if (var8) {
                        if (!ChamsRenderer.beginEntityPass()) {
                           return;
                        }

                         VertexConsumer var14 = var3.getBuffer(RenderLayer.getEntitySolid(DESTRA$GLOW_CAPTURE_TEXTURE));
                         var10.render(var2, var14, var4, OverlayTexture.DEFAULT_UV, destra$themeChamsColor(var6, var6.getGlowColor(var7)));
                        if (var3 instanceof Immediate var12) {
                           var12.draw();
                        }

                        ChamsRenderer.endEntityPassInternal();
                     }

                     if (var9) {
                        if (!ChamsRenderer.beginScissorPass()) {
                           return;
                        }

                         VertexConsumer var15 = var3.getBuffer(RenderLayer.getEntitySolid(DESTRA$GLOW_CAPTURE_TEXTURE));
                         var10.render(var2, var15, var4, OverlayTexture.DEFAULT_UV, destra$themeChamsColor(var6, var6.getGlowColor(var7)));
                        if (var3 instanceof Immediate var16) {
                           var16.draw();
                        }

                        ChamsRenderer.endScissorPassInternal();
                        ChamsRenderer.renderEntityScissor(var6, var7);
                     }

                     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  } catch (Exception var13) {
                     var13.printStackTrace();
                     ChamsRenderer.endEntityPass();
                     ChamsRenderer.endScissorPass();
                     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

      @Unique
      private static int destra$themeChamsColor(ChamsModule module, int originalColorWithAlpha) {
         int base = destra$uiThemeColor();
         if (base == -1) {
            return originalColorWithAlpha;
         }
         int alpha = (originalColorWithAlpha >>> 24) & 0xFF;
         return (alpha << 24) | (base & 0x00FFFFFF);
      }

     @Unique
     private static int destra$uiThemeColor() {
        try {
           DestraClient dc = DestraClient.getInstance();
           if (dc != null && dc.theme2DManager != null) {
              Theme2DManager tm = dc.theme2DManager;
              NamedColor nc = tm.getCurrentColor();
              if (nc != null && nc.getColor() != null) {
                 return nc.getColor().getRGB();
              }
           }
        } catch (Throwable ignored) {
        }
        return -1;
     }

    @Unique
    private static ChamsModule destra$getChamsModule() {
      DestraClient var0 = DestraClient.getInstance();
      if (var0 != null && var0.getModuleManager() != null) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         return var1 != null && var1.currentScreen instanceof CreativeInventoryScreen ? null : var0.getModuleManager().chams;
      } else {
         return null;
      }
   }

}
