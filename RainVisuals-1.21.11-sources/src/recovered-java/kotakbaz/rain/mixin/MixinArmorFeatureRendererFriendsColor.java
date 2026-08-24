/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.feature.ArmorFeatureRenderer
 *  net.minecraft.client.render.entity.model.BipedEntityModel
 *  net.minecraft.client.render.entity.state.BipedEntityRenderState
 *  net.minecraft.client.render.entity.state.PlayerEntityRenderState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
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
import oxxxde.\u062c\u0624;

@Mixin(value={ArmorFeatureRenderer.class})
public abstract class MixinArmorFeatureRendererFriendsColor<S extends BipedEntityRenderState, M extends BipedEntityModel<S>, A extends BipedEntityModel<S>> {
    @Unique
    private EquipmentSlot rain$currentArmorSlot;
    @Unique
    private BipedEntityRenderState rain$currentArmorRenderState;

    @ModifyVariable(method={"method_4169"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private ItemStack rain$replaceFriendArmor(ItemStack original) {
        BipedEntityRenderState bipedEntityRenderState = this.rain$currentArmorRenderState;
        if (!(bipedEntityRenderState instanceof PlayerEntityRenderState)) {
            return original;
        }
        PlayerEntityRenderState playerState = (PlayerEntityRenderState)bipedEntityRenderState;
        boolean invisible = this.rain$isInvisible(playerState.id);
        String name = this.rain$getPlayerName(playerState);
        if (!\u062c\u0624.INSTANCE.shouldReplaceArmor(name, invisible)) {
            return original;
        }
        ItemStack replacement = \u062c\u0624.INSTANCE.createReplacementArmor(this.rain$currentArmorSlot);
        return replacement != null ? replacement : original;
    }

    @Unique
    private Entity rain$getEntity(int entityId) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null) {
            return null;
        }
        return client.world.getEntityById(entityId);
    }

    @Inject(method={"method_17157"}, at={@At(value="RETURN")})
    private void rain$clearRenderState(MatrixStack matrices, OrderedRenderCommandQueue submitNodeCollector, int light, S state, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = null;
    }

    @Inject(method={"method_4169"}, at={@At(value="HEAD")})
    private void rain$captureArmorSlot(MatrixStack matrices, OrderedRenderCommandQueue submitNodeCollector, ItemStack stack, EquipmentSlot slot, int light, S state, CallbackInfo ci) {
        this.rain$currentArmorSlot = slot;
    }

    @Unique
    private boolean rain$isInvisible(int entityId) {
        LivingEntity living;
        Entity entity = this.rain$getEntity(entityId);
        return entity instanceof LivingEntity && (living = (LivingEntity)entity).hasStatusEffect(StatusEffects.INVISIBILITY);
    }

    @Inject(method={"method_17157"}, at={@At(value="HEAD")})
    private void rain$captureRenderState(MatrixStack matrices, OrderedRenderCommandQueue submitNodeCollector, int light, S state, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = state;
    }

    @Unique
    private String rain$getPlayerName(PlayerEntityRenderState state) {
        Entity entity = this.rain$getEntity(state.id);
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            return player.getGameProfile().name();
        }
        return state.displayName == null ? null : state.displayName.getString();
    }

    @Inject(method={"method_4169"}, at={@At(value="RETURN")})
    private void rain$clearArmorSlot(MatrixStack matrices, OrderedRenderCommandQueue submitNodeCollector, ItemStack stack, EquipmentSlot slot, int light, S state, CallbackInfo ci) {
        this.rain$currentArmorSlot = null;
    }
}

