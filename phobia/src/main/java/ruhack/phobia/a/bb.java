/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1269$class_9860
 *  net.minecraft.class_1269$class_9861
 *  net.minecraft.class_1657
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_310
 *  net.minecraft.class_320
 *  net.minecraft.class_3965
 *  net.minecraft.class_437
 *  net.minecraft.class_442
 *  net.minecraft.class_636
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_757
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.adl.nativeprotect.User;
import net.minecraft.class_1041;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_3965;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_757;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.aa;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.ca;
import ruhack.phobia.ch;
import ruhack.phobia.db;
import ruhack.phobia.df;
import ruhack.phobia.fe;
import ruhack.phobia.fl;
import ruhack.phobia.gs;
import ruhack.phobia.mh;
import ruhack.phobia.mp;

@Mixin(value={class_310.class})
public abstract class bb {
    @Shadow
    @Nullable
    public class_746 field_1724;
    @Shadow
    @Nullable
    public class_636 field_1761;
    @Shadow
    @Final
    public class_757 field_1773;
    @Shadow
    public class_638 field_1687;
    @Shadow
    private class_1041 field_1704;
    private static boolean fontsInitialized = false;
    @Shadow
    @Mutable
    private class_320 field_1726;

    @Inject(method={"stop"}, at={@At(value="HEAD")})
    private void onStop(CallbackInfo ci2) {
        aa configSystem = aa.getInstance();
        if (configSystem != null) {
            configSystem.shutdown();
        }
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void applyDarkWindowFrame(CallbackInfo ci2) {
        if (this.field_1704 != null) {
            mp.setDarkMode(this.field_1704.method_4490());
        }
    }

    @Inject(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/Hand;values()[Lnet/minecraft/util/Hand;")}, cancellable=true)
    public void doItemUseHook(CallbackInfo ci2) {
        class_3965 target;
        fe openWalls = fe.getInstance();
        if (openWalls != null && openWalls.isState() && this.field_1724 != null && this.field_1761 != null && (target = openWalls.raycastInteractable()) != null && target.method_17783() == class_239.class_240.field_1332) {
            class_1268[] class_1268Array = class_1268.values();
            int n2 = class_1268Array.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                class_1268 hand = class_1268Array[i2];
                class_1269 result = this.field_1761.method_2896(this.field_1724, hand, target);
                if (result.method_23665()) {
                    class_1269.class_9860 success;
                    if (result instanceof class_1269.class_9860 && (success = (class_1269.class_9860)result).comp_2909().equals((Object)class_1269.class_9861.field_52427)) {
                        this.field_1724.method_6104(hand);
                    }
                    ci2.cancel();
                    return;
                }
                if (result != class_1269.field_5814) continue;
                ci2.cancel();
                return;
            }
        }
        if (gs.getInstance().isState()) {
            for (class_1268 hand : class_1268.values()) {
                class_1269.class_9860 success;
                class_1269 result;
                if (this.field_1724.method_5998(hand).method_7960() || !(result = this.field_1761.method_2919((class_1657)this.field_1724, hand)).method_23665()) continue;
                if (result instanceof class_1269.class_9860 && (success = (class_1269.class_9860)result).comp_2909().equals((Object)class_1269.class_9861.field_52427)) {
                    this.field_1773.field_4012.method_3215(hand);
                    this.field_1724.method_6104(hand);
                }
                ci2.cancel();
            }
        }
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V"}, at={@At(value="HEAD")})
    private void onDisconnect(class_437 screen, boolean transferring, CallbackInfo info) {
        if (this.field_1687 != null) {
            ax.callEvent(ca.get());
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void onTick(CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        class_310 mc2 = class_310.method_1551();
        if (!fl.isUnhooked() && mc2.field_1755 instanceof class_442) {
            mc2.method_1507((class_437)new mh());
            return;
        }
        if (mc2.field_1724 == null || mc2.field_1687 == null) {
            return;
        }
        ax.callEvent(new df());
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")}, cancellable=true)
    public void setScreenHook(class_437 screen, CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        if (!fl.isUnhooked() && screen instanceof class_442) {
            c.mc.method_1507((class_437)new mh());
            ci2.cancel();
            return;
        }
        if (!fl.isUnhooked() && screen == null && this.field_1687 == null && c.mc.method_1562() == null) {
            c.mc.method_1507((class_437)new mh());
            ci2.cancel();
            return;
        }
        db event = new db(screen);
        ax.callEvent(event);
        class_437 eventScreen = event.getScreen();
        if (screen != eventScreen) {
            c.mc.method_1507(eventScreen);
            ci2.cancel();
        }
    }

    @Inject(method={"getWindowTitle"}, at={@At(value="RETURN")}, cancellable=true)
    private void getWindowTitle(CallbackInfoReturnable<String> cir) {
        if (!fl.isUnhooked()) {
            String username = User.getInstance().profile("username");
            String role = User.getInstance().profile("role");
            cir.setReturnValue("Phobia 1.21.11 - " + username + " - #" + role + " - #1.4");
        }
    }

    @Inject(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getInventory()Lnet/minecraft/entity/player/PlayerInventory;")}, cancellable=true)
    public void handleInputEventsHook(CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        ch event = new ch();
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }
}
