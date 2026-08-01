package sg.mx;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.model.CustomModelInstance;
import ru.destra.model.CustomModelManager;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererCustomModelMixin<S extends LivingEntityRenderState, M extends EntityModel<? super S>> {
   @Unique
   private LivingEntityRendererCustomModelMixin.с destra$customModelVisibility;
   @Unique
   private CustomModelInstance destra$activeCustomModel;

   @Shadow
   public abstract M getModel();

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$applyCustomModelVisibility(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      this.destra$customModelVisibility = null;
      this.destra$activeCustomModel = null;
      if (var1 instanceof PlayerEntityRenderState var6) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7.player != null && var6.id == var7.player.getId()) {
            CustomModelInstance var8 = CustomModelManager.Р().Ъ();
            if (var8 != null) {
               this.destra$activeCustomModel = var8;
               this.destra$applyPlayerVisibility(var8);
            }
         }
      }
   }

   @Inject(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/model/EntityModel;setAngles(Lnet/minecraft/client/render/entity/state/EntityRenderState;)V", shift = Shift.AFTER)
   )
   private void destra$renderCustomModel(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      if (var1 instanceof PlayerEntityRenderState var6) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         if (var7.player != null && var6.id == var7.player.getId() && !var7.player.isSpectator()) {
            if (this.getModel() instanceof PlayerEntityModel var8) {
               CustomModelInstance var10 = this.destra$activeCustomModel;
               if (var10 != null) {
                  this.destra$applyPlayerVisibility(var10, var8);
                  var10.必(var2, var3, var4, var8, var7.getRenderTickCounter().getTickDelta(false));
               }
            }
         }
      }
   }

   @WrapOperation(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V")
   )
   private void destra$skipVanillaPlayerRender(EntityModel<?> var1, MatrixStack var2, VertexConsumer var3, int var4, int var5, int var6, Operation<Void> var7) {
      CustomModelInstance var8 = this.destra$activeCustomModel;
      if (var8 == null || !var8.shouldHidePlayer()) {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      }
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$restoreCustomModelVisibility(S var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      if (this.destra$customModelVisibility == null) {
         this.destra$activeCustomModel = null;
      } else {
         if (this.getModel() instanceof PlayerEntityModel var7) {
            this.destra$customModelVisibility.restore(var7);
         }

         this.destra$customModelVisibility = null;
         this.destra$activeCustomModel = null;
      }
   }

   @Unique
   private void destra$applyPlayerVisibility(CustomModelInstance var1) {
      if (this.getModel() instanceof PlayerEntityModel var3) {
         this.destra$applyPlayerVisibility(var1, var3);
      }
   }

   @Unique
   private void destra$applyPlayerVisibility(CustomModelInstance var1, PlayerEntityModel var2) {
      if (var1 != null && var2 != null && (var1.shouldHidePlayer() || var1.hasVanillaPartVisibilityOverrides())) {
         if (this.destra$customModelVisibility == null) {
            this.destra$customModelVisibility = LivingEntityRendererCustomModelMixin.с.capture(var2);
         }

         var1.必(var2);
      }
   }

   @Unique
   private record с(
      boolean head,
      boolean body,
      boolean leftArm,
      boolean rightArm,
      boolean leftLeg,
      boolean rightLeg,
      boolean hat,
      boolean jacket,
      boolean leftSleeve,
      boolean rightSleeve,
      boolean leftPants,
      boolean rightPants
   ) {
      private static LivingEntityRendererCustomModelMixin.с capture(PlayerEntityModel var0) {
         return new LivingEntityRendererCustomModelMixin.с(
            var0.getHead().visible,
            var0.body.visible,
            var0.leftArm.visible,
            var0.rightArm.visible,
            var0.leftLeg.visible,
            var0.rightLeg.visible,
            var0.hat.visible,
            var0.jacket.visible,
            var0.leftSleeve.visible,
            var0.rightSleeve.visible,
            var0.leftPants.visible,
            var0.rightPants.visible
         );
      }

      private void restore(PlayerEntityModel var1) {
         var1.getHead().visible = this.head;
         var1.body.visible = this.body;
         var1.leftArm.visible = this.leftArm;
         var1.rightArm.visible = this.rightArm;
         var1.leftLeg.visible = this.leftLeg;
         var1.rightLeg.visible = this.rightLeg;
         var1.hat.visible = this.hat;
         var1.jacket.visible = this.jacket;
         var1.leftSleeve.visible = this.leftSleeve;
         var1.rightSleeve.visible = this.rightSleeve;
         var1.leftPants.visible = this.leftPants;
         var1.rightPants.visible = this.rightPants;
      }
   }
}
