package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityAttachmentType;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.render.CapeFeatureRenderer;
import ru.destra.render.HeadLayerFeatureRenderer;
import ru.destra.render.PlayerHeadFeatureRenderer;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(PlayerEntityRenderer.class)
public abstract class PlayerEntityRendererMixin {
   private static final float шфГ;
   private static final float шф7;
   private static final float шфя;
   private static final double шф6;

   @Inject(method = "<init>", at = @At("TAIL"))
   private void onInit(Context var1, boolean var2, CallbackInfo var3) {
      LivingEntityRendererAccessor var4 = (LivingEntityRendererAccessor)this;
      var4.invokeAddFeature(new HeadLayerFeatureRenderer((PlayerEntityRenderer)this));
      var4.invokeAddFeature(new PlayerHeadFeatureRenderer((PlayerEntityRenderer)this));
      var4.invokeAddFeature(new CapeFeatureRenderer((PlayerEntityRenderer)this));
   }

   @Inject(method = "scale", at = @At("TAIL"))
   private void onScale(PlayerEntityRenderState var1, MatrixStack var2, CallbackInfo var3) {
      DestraClient var4 = DestraClient.getInstance();
      MinecraftClient var5 = MinecraftClient.getInstance();
      if (var4 != null && var4.getModuleManager() != null && var4.getModuleManager().babyMod != null && var5.player != null) {
         if (var4.getModuleManager().babyMod.Д() && var1.id == var5.player.getId()) {
            var2.scale(шфГ, шф7, шфя);
         }
      }
   }

   @Inject(method = "updateRenderState", at = @At("TAIL"))
   private void onUpdateRenderState(AbstractClientPlayerEntity var1, PlayerEntityRenderState var2, float var3, CallbackInfo var4) {
      DestraClient var5 = DestraClient.getInstance();
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (var5 != null && var5.getModuleManager() != null && var6.player != null) {
         if (var1.getId() == var6.player.getId()) {
            if (var5.getModuleManager().selfNametag != null && var5.getModuleManager().selfNametag.Д() && !var1.isInvisible()) {
               var2.displayName = var1.getDisplayName();
               Vec3d var7 = var1.getAttachments().getPointNullable(EntityAttachmentType.NAME_TAG, 0, var1.getLerpedYaw(var3));
               if (var7 != null && var5.getModuleManager().babyMod != null && var5.getModuleManager().babyMod.Д()) {
                  var7 = var7.multiply(шф6);
               }

               var2.nameLabelPos = var7;
            }
         }
      }
   }

   static {
      шфГ = 0.5F;
      шф7 = 0.5F;
      шфя = 0.5F;
      шф6 = 0.5;
      VMBridge.identifyClass(PlayerEntityRendererMixin.class, "ivVAkuTr");
   }
}
