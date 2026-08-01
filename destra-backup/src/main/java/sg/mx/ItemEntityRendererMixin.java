package sg.mx;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ItemEntityRenderer.class)
public abstract class ItemEntityRendererMixin {
   @Unique
   private boolean destra$isOnGround;
   @Unique
   private float destra$entityAge;
   @Unique
   private float destra$uniqueOffset;
   private static final float шБ西;
   private static final float шБР;

   @Inject(method = "updateRenderState", at = @At("HEAD"))
   private void onUpdateRenderState(ItemEntity var1, ItemEntityRenderState var2, float var3, CallbackInfo var4) {
      if (destra$isItemPhysicsEnabled()) {
         this.destra$isOnGround = var1.isOnGround();
         this.destra$entityAge = var2.age;
         this.destra$uniqueOffset = var2.uniqueOffset;
      }
   }

   @ModifyVariable(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/ItemEntityRenderer;renderStack(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ItemStackEntityRenderState;Lnet/minecraft/util/math/random/Random;)V"
      ),
      ordinal = 0
   )
   private MatrixStack onRender(MatrixStack var1, ItemEntityRenderState var2, MatrixStack var3, VertexConsumerProvider var4, int var5) {
      if (!destra$isItemPhysicsEnabled()) {
         return var1;
      }

      var1.pop();
      var1.push();
      float var6 = ItemEntity.getRotation(this.destra$entityAge, this.destra$uniqueOffset);
      if (this.destra$isOnGround) {
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(шБ西));
      } else {
         var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var6 * шБР));
      }

      return var1;
   }

   @Unique
   private static boolean destra$isItemPhysicsEnabled() {
      return DestraClient.getInstance() != null
         && DestraClient.getInstance().getModuleManager() != null
         && DestraClient.getInstance().getModuleManager().itemPhysics != null
         && DestraClient.getInstance().getModuleManager().itemPhysics.Д();
   }

   static {
      VMBridge.identifyClass(ItemEntityRendererMixin.class, "NutkDokr");
   }
}
