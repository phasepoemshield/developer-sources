/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_10182
 *  net.minecraft.class_10265
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2678
 *  net.minecraft.class_2708
 *  net.minecraft.class_2709
 *  net.minecraft.class_2724
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_634
 *  net.minecraft.class_638
 *  net.minecraft.class_7439
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.util.Set;
import net.minecraft.class_10182;
import net.minecraft.class_10265;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2709;
import net.minecraft.class_2724;
import net.minecraft.class_2828;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_7439;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bp;
import ruhack.phobia.c;
import ruhack.phobia.ca;
import ruhack.phobia.dh;
import ruhack.phobia.fo;
import ruhack.phobia.hq;

@Mixin(value={class_634.class})
public abstract class m
implements c {
    @Shadow
    private class_638 field_3699;
    @Unique
    private boolean worldNotNull;
    @Unique
    private Set<class_2709> phobia$positionFlags = Set.of();

    @Shadow
    private static class_1799 method_19691(class_1657 player) {
        return null;
    }

    @Inject(method={"method_11157"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_2600;method_11074(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;Lnet/minecraft/class_11980;)V", shift=At.Shift.AFTER)})
    private void phobia$capturePositionFlags(class_2708 packet, CallbackInfo ci2) {
        this.phobia$positionFlags = packet.comp_3229();
    }

    @ModifyArg(method={"method_11157"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_634;method_64897(Lnet/minecraft/class_10182;Ljava/util/Set;Lnet/minecraft/class_1297;Z)Z"), index=0)
    private class_10182 phobia$keepCameraRotation(class_10182 change) {
        if (m.mc.field_1724 == null || !hq.getInstance().isState()) {
            return change;
        }
        float yaw = this.phobia$positionFlags.contains(class_2709.field_12401) ? 0.0f : m.mc.field_1724.method_36454();
        float pitch = this.phobia$positionFlags.contains(class_2709.field_12397) ? 0.0f : m.mc.field_1724.method_36455();
        return new class_10182(change.comp_3148(), change.comp_3149(), yaw, pitch);
    }

    @Inject(method={"method_64554"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_2600;method_11074(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;Lnet/minecraft/class_11980;)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void phobia$cancelServerRotation(class_10265 packet, CallbackInfo ci2) {
        if (m.mc.field_1724 == null || mc.method_1562() == null || !hq.getInstance().isState()) {
            return;
        }
        mc.method_1562().method_52787((class_2596)new class_2828.class_2831(m.mc.field_1724.method_36454(), m.mc.field_1724.method_36455(), false, false));
        ci2.cancel();
    }

    @Inject(method={"method_11120"}, at={@At(value="HEAD")})
    private void onGameJoinHead(class_2678 packet, CallbackInfo info) {
        this.worldNotNull = this.field_3699 != null;
    }

    @Inject(method={"method_11120"}, at={@At(value="TAIL")})
    private void onGameJoinTail(class_2678 packet, CallbackInfo info) {
        if (this.worldNotNull) {
            ax.callEvent(ca.get());
        }
    }

    @Inject(method={"method_11120"}, at={@At(value="RETURN")})
    private void onGameJoin(class_2678 packet, CallbackInfo ci2) {
        ax.callEvent(dh.get());
    }

    @Inject(method={"method_11117"}, at={@At(value="RETURN")})
    private void onPlayerRespawn(class_2724 packet, CallbackInfo ci2) {
        ax.callEvent(dh.get());
    }

    @Inject(method={"method_45729"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendChatMessage(String message, CallbackInfo ci2) {
        bp event = new bp(message);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_45730"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendChatCommand(String command, CallbackInfo ci2) {
        bp event = new bp("/" + command);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_43596"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGameMessage(class_7439 packet, CallbackInfo ci2) {
        String message = packet.comp_763().getString();
        bp event = new bp(message);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @ModifyExpressionValue(method={"method_43596"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_7439;comp_763()Lnet/minecraft/class_2561;")})
    private class_2561 phobia$streamerModeOwnChat(class_2561 original) {
        return fo.filterOwnChat(original);
    }
}

