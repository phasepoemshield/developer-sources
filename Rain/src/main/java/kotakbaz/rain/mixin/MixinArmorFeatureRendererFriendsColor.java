/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.FriendsColorModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ArmorFeatureRenderer.class})
public abstract class MixinArmorFeatureRendererFriendsColor<S extends BipedEntityRenderState, M extends BipedEntityModel<S>, A extends BipedEntityModel<S>> {
    @Unique
    private BipedEntityRenderState rain$currentArmorRenderState;
    @Unique
    private EquipmentSlot rain$currentArmorSlot;

    @Inject(method={"method_17157"}, at={@At(value="HEAD")})
    private void rain$captureRenderState(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, S state2, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = state2;
    }

    @Inject(method={"method_17157"}, at={@At(value="RETURN")})
    private void rain$clearRenderState(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, S state2, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = null;
    }

    @Inject(method={"method_4169"}, at={@At(value="HEAD")})
    private void rain$captureArmorSlot(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, EquipmentSlot slot, int light, A armorModel, CallbackInfo ci) {
        this.rain$currentArmorSlot = slot;
    }

    @Inject(method={"method_4169"}, at={@At(value="RETURN")})
    private void rain$clearArmorSlot(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, EquipmentSlot slot, int light, A armorModel, CallbackInfo ci) {
        this.rain$currentArmorSlot = null;
    }

    @ModifyVariable(method={"method_4169"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private ItemStack rain$replaceFriendArmor(ItemStack original) {
        BipedEntityRenderState bipedEntityRenderState = this.rain$currentArmorRenderState;
        if (!(bipedEntityRenderState instanceof PlayerEntityRenderState)) {
            return original;
        }
        PlayerEntityRenderState playerState = (PlayerEntityRenderState)bipedEntityRenderState;
        boolean invisible = this.rain$isInvisible(playerState.id);
        if (!FriendsColorModule.INSTANCE.shouldReplaceArmor(playerState.name, invisible)) {
            return original;
        }
        ItemStack replacement = FriendsColorModule.INSTANCE.createReplacementArmor(this.rain$currentArmorSlot);
        return replacement != null ? replacement : original;
    }

    @Unique
    private boolean rain$isInvisible(int entityId) {
        LivingEntity living;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null) {
            return false;
        }
        Entity entity = client.world.getEntityById(entityId);
        return entity instanceof LivingEntity && (living = (LivingEntity)entity).hasStatusEffect(StatusEffects.INVISIBILITY);
    }
}

