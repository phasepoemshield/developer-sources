/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02567
 *  minecraft.class02590
 *  minecraft.class04828
 *  minecraft.class04830
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback
 *  net.fabricmc.fabric.impl.resource.client.PackTooltipComponent
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  squeek.appleskin.client.TooltipOverlayHandler$FoodOverlay
 *  squeek.appleskin.client.TooltipOverlayHandler$FoodOverlayTextComponent
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02567;
import minecraft.class02590;
import minecraft.class04828;
import minecraft.class04830;
import minecraft.class06334;
import minecraft.class06365;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback;
import net.fabricmc.fabric.impl.resource.client.PackTooltipComponent;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.TooltipOverlayHandler;

@Environment(value=EnvType.CLIENT)
public interface class06357 {
    private static void L(class04830 class048302, CallbackInfoReturnable callbackInfoReturnable) {
        if (class048302 instanceof PackTooltipComponent) {
            PackTooltipComponent packTooltipComponent = (PackTooltipComponent)class048302;
            callbackInfoReturnable.setReturnValue((Object)packTooltipComponent);
        }
    }

    private static void y(class04830 class048302, CallbackInfoReturnable callbackInfoReturnable) {
        class06357 class063572 = ((TooltipComponentCallback)TooltipComponentCallback.EVENT.invoker()).getComponent(class048302);
        if (class063572 != null) {
            callbackInfoReturnable.setReturnValue((Object)class063572);
        }
    }

    private static void N(class01028 class010282, CallbackInfoReturnable callbackInfoReturnable) {
        if (class010282 instanceof TooltipOverlayHandler.FoodOverlayTextComponent) {
            callbackInfoReturnable.setReturnValue((Object)((TooltipOverlayHandler.FoodOverlayTextComponent)class010282).foodOverlay);
        }
    }

    public static class06357 N(class01028 class010282) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class06357.N(class010282, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class06357)callbackInfoReturnable.getReturnValue();
        }
        return new class06365(class010282);
    }

    private static void N(class04830 class048302, CallbackInfoReturnable callbackInfoReturnable) {
        if (class048302 instanceof TooltipOverlayHandler.FoodOverlay) {
            callbackInfoReturnable.setReturnValue((Object)((TooltipOverlayHandler.FoodOverlay)class048302));
        }
    }

    default public boolean N() {
        return false;
    }

    public static class06357 N(class04830 class048302) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class06357.N(class048302, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class06357)callbackInfoReturnable.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        class06357.y(class048302, callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return (class06357)callbackInfoReturnable2.getReturnValue();
        }
        CallbackInfoReturnable callbackInfoReturnable3 = new CallbackInfoReturnable("", true);
        class06357.L(class048302, callbackInfoReturnable3);
        if (callbackInfoReturnable3.isCancelled()) {
            return (class06357)callbackInfoReturnable3.getReturnValue();
        }
        class04830 class048303 = class048302;
        Objects.requireNonNull(class048303);
        class04830 class048304 = class048303;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class04828.class, class02590.class}, (Object)class048304, (int)n)) {
            case 0 -> {
                class04828 var3_6 = (class04828)class048304;
                yield new class06334(var3_6.N());
            }
            case 1 -> {
                class02590 var4_7 = (class02590)class048304;
                yield new class02567(var4_7);
            }
            default -> throw new IllegalArgumentException("Unknown TooltipComponent");
        };
    }

    default public void method_32665(class01054 class010542, class01590 class015902, int n, int n2) {
    }

    default public void method_32666(class01590 class015902, int n, int n2, int n3, int n4, class01054 class010542) {
    }

    public int method_32664(class01590 var1);

    public int method_32661(class01590 var1);
}

