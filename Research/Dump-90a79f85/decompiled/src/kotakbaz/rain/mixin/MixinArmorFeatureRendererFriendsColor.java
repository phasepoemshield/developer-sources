/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10034
 *  net.minecraft.class_10055
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1799
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_572
 *  net.minecraft.class_970
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.S;
import net.minecraft.class_10034;
import net.minecraft.class_10055;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_572;
import net.minecraft.class_970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_970.class})
public abstract class MixinArmorFeatureRendererFriendsColor<S extends class_10034, M extends class_572<S>, A extends class_572<S>> {
    @Unique
    private class_10034 rain$currentArmorRenderState;
    @Unique
    private class_1304 rain$currentArmorSlot;

    public MixinArmorFeatureRendererFriendsColor() {
        super();
    }

    @Inject(method={"method_17157"}, at={@At(value="HEAD")})
    private void rain$captureRenderState(class_4587 matrices, class_4597 vertexConsumers, int light, S state2, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = state2;
    }

    @Inject(method={"method_17157"}, at={@At(value="RETURN")})
    private void rain$clearRenderState(class_4587 matrices, class_4597 vertexConsumers, int light, S state2, float limbAngle, float limbDistance, CallbackInfo ci) {
        this.rain$currentArmorRenderState = null;
    }

    @Inject(method={"method_4169"}, at={@At(value="HEAD")})
    private void rain$captureArmorSlot(class_4587 matrices, class_4597 vertexConsumers, class_1799 stack, class_1304 slot, int light, A armorModel, CallbackInfo ci) {
        this.rain$currentArmorSlot = slot;
    }

    @Inject(method={"method_4169"}, at={@At(value="RETURN")})
    private void rain$clearArmorSlot(class_4587 matrices, class_4597 vertexConsumers, class_1799 stack, class_1304 slot, int light, A armorModel, CallbackInfo ci) {
        this.rain$currentArmorSlot = null;
    }

    @ModifyVariable(method={"method_4169"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private class_1799 rain$replaceFriendArmor(class_1799 original) {
        class_10034 class_100342 = this.rain$currentArmorRenderState;
        if (!(class_100342 instanceof class_10055)) {
            return original;
        }
        class_10055 playerState = (class_10055)class_100342;
        boolean invisible = this.rain$isInvisible(playerState.field_53528);
        if (!S.INSTANCE.shouldReplaceArmor(playerState.field_53529, invisible)) {
            return original;
        }
        class_1799 replacement = S.INSTANCE.createReplacementArmor(this.rain$currentArmorSlot);
        return replacement != null ? replacement : original;
    }

    @Unique
    private boolean rain$isInvisible(int entityId) {
        class_1309 living;
        class_310 client = class_310.method_1551();
        if (client.field_1687 == null) {
            return false;
        }
        class_1297 entity = client.field_1687.method_8469(entityId);
        return entity instanceof class_1309 && (living = (class_1309)entity).method_6059(class_1294.field_5905);
    }
}

