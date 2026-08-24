package kotakbaz.rain.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.جؤ;

// $VF: Compiled from MixinArmorFeatureRendererFriendsColor.java
@Mixin(ArmorFeatureRenderer.class)
public abstract class MixinArmorFeatureRendererFriendsColor<S extends BipedEntityRenderState, M extends BipedEntityModel<S>, A extends BipedEntityModel<S>> {
   @Unique
   private EquipmentSlot rain$currentArmorSlot;
   @Unique
   private BipedEntityRenderState rain$currentArmorRenderState;

   @ModifyVariable(method = "method_4169", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private ItemStack rain$replaceFriendArmor(ItemStack original) {
      if (this.rain$currentArmorRenderState instanceof PlayerEntityRenderState playerState) {
         boolean var6 = this.rain$isInvisible(playerState.id);
         String name = this.rain$getPlayerName(playerState);
         if (!جؤ.INSTANCE.shouldReplaceArmor(name, var6)) {
            return original;
         }

         ItemStack replacement = جؤ.INSTANCE.createReplacementArmor(this.rain$currentArmorSlot);
         return replacement != null ? replacement : original;
      } else {
         return original;
      }
   }

   @Unique
   private Entity rain$getEntity(int entityId) {
      MinecraftClient client = MinecraftClient.getInstance();
      return client.world == null ? null : client.world.getEntityById(entityId);
   }

   @Inject(method = "method_17157", at = @At("RETURN"))
   private void rain$clearRenderState(
      MatrixStack limbDistance, OrderedRenderCommandQueue matrices, int limbAngle, S light, float submitNodeCollector, float state, CallbackInfo ci
   ) {
      this.rain$currentArmorRenderState = null;
   }

   @Inject(method = "method_4169", at = @At("HEAD"))
   private void rain$captureArmorSlot(
      MatrixStack state, OrderedRenderCommandQueue slot, ItemStack stack, EquipmentSlot ci, int light, S matrices, CallbackInfo submitNodeCollector
   ) {
      this.rain$currentArmorSlot = slot;
   }

   @Unique
   private boolean rain$isInvisible(int entityId) {
      return this.rain$getEntity(entityId) instanceof LivingEntity living && living.hasStatusEffect(StatusEffects.INVISIBILITY);
   }

   @Inject(method = "method_17157", at = @At("HEAD"))
   private void rain$captureRenderState(
      MatrixStack ci, OrderedRenderCommandQueue state, int light, S limbDistance, float matrices, float limbAngle, CallbackInfo submitNodeCollector
   ) {
      this.rain$currentArmorRenderState = state;
   }

   @Unique
   private String rain$getPlayerName(PlayerEntityRenderState state) {
      if (this.rain$getEntity(state.id) instanceof PlayerEntity player) {
         return player.getGameProfile().name();
      } else {
         return state.displayName == null ? null : state.displayName.getString();
      }
   }

   @Inject(method = "method_4169", at = @At("RETURN"))
   private void rain$clearArmorSlot(
      MatrixStack matrices, OrderedRenderCommandQueue stack, ItemStack slot, EquipmentSlot ci, int state, S submitNodeCollector, CallbackInfo light
   ) {
      this.rain$currentArmorSlot = null;
   }
}
