package fat.releon.mixins.player.item;

import java.util.UUID;
import l.Cosmetic;
import l.ClientIndication;
import l.Helper283;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.feature.PlayerHeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ModelWithArms;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerHeldItemFeatureRenderer.class})
public abstract class PlayerHeldItemFeatureRendererMixin<S extends PlayerEntityRenderState, M extends EntityModel<S> & ModelWithArms>
   extends HeldItemFeatureRenderer<S, M> {
   protected PlayerHeldItemFeatureRendererMixin(FeatureRendererContext<S, M> var1) {
      super(var1);
   }

   @Unique
   private static boolean releon$figuraAvatarMissing(PlayerEntityRenderState var0) {
      MinecraftClient var1 = MinecraftClient.getInstance();
      if (var1 != null && var1.world != null && var0 != null) {
         if (var1.world.getEntityById(var0.id) instanceof PlayerEntity var2) {
            try {
               Class var6 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
               return var6.getMethod("getLoadedAvatar", UUID.class).invoke(null, var2.getUuid()) == null;
            } catch (ClassNotFoundException var4) {
               return false;
            } catch (ReflectiveOperationException var5) {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Unique
   private void releon$renderVanillaHeldItem(ItemRenderState var1, Arm var2, MatrixStack var3, VertexConsumerProvider var4, int var5) {
      if (!var1.isEmpty()) {
         var3.push();
         this.getContextModel().setArmAngle(var2, var3);
         var3.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-90.0F));
         var3.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
         boolean var6 = var2 == Arm.LEFT;
         var3.translate((var6 ? -1.0F : 1.0F) / 16.0F, 0.125F, -0.625F);
         var1.render(var3, var4, var5, OverlayTexture.DEFAULT_UV);
         var3.pop();
      }
   }

   @Unique
   private static boolean releon$shouldTintOffhand(PlayerEntityRenderState var0, Arm var1) {
      ClientIndication var2 = ClientIndication.method2427();
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var2 != null && var3 != null && var3.world != null && var0 != null && var1 != null && var0.mainArm != null) {
         Arm var4 = var0.mainArm == Arm.RIGHT ? Arm.LEFT : Arm.RIGHT;
         if (var1 != var4) {
            return false;
         } else {
            return var3.world.getEntityById(var0.id) instanceof PlayerEntity var5 ? var2.method2429(var5.getOffHandStack()) : false;
         }
      } else {
         return false;
      }
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/util/Arm;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void releon$beforeRenderItem(
      PlayerEntityRenderState var1, ItemRenderState var2, Arm var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      MinecraftClient var8 = MinecraftClient.getInstance();
      if (var8.world != null && var8.world.getEntityById(var1.id) instanceof PlayerEntity var9) {
         Cosmetic var12 = Cosmetic.method1873();
         if (var12 != null && var12.isState() && var12.method1878(var9) && !var12.method1880(var9, var3)) {
            var7.cancel();
            return;
         }
      }

      if (releon$figuraAvatarMissing(var1)) {
         this.releon$renderVanillaHeldItem(var2, var3, var4, var5, var6);
         var7.cancel();
      } else {
         ClientIndication var11 = ClientIndication.method2427();
         if (releon$shouldTintOffhand(var1, var3) && var11 != null) {
            PlayerEntity var13 = (PlayerEntity)MinecraftClient.getInstance().world.getEntityById(var1.id);
            if (var13 != null) {
               Helper283.method2776(
                  var11.method2431(var13.getOffHandStack()),
                  var11.method2432(var13.getOffHandStack()),
                  var11.method2433(var13.getOffHandStack()),
                  var11.method2434()
               );
            }
         }
      }
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/util/Arm;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("RETURN")}
   )
   private void releon$afterRenderItem(
      PlayerEntityRenderState var1, ItemRenderState var2, Arm var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      if (releon$shouldTintOffhand(var1, var3)) {
         Helper283.method2777();
      }
   }
}
