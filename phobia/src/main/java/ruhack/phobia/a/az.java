/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1291
 *  net.minecraft.class_1292
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_6880
 *  net.minecraft.class_746
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.lang.reflect.Method;
import net.minecraft.class_1291;
import net.minecraft.class_1292;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.ax;
import ruhack.phobia.cm;
import ruhack.phobia.cz;
import ruhack.phobia.cz$Type;
import ruhack.phobia.dd;
import ruhack.phobia.ot;

@Mixin(value={class_1309.class})
public abstract class az {
    @Shadow
    public float field_6283;
    @Unique
    private static boolean baritoneChecked = false;
    @Unique
    private static boolean baritoneAvailable = false;
    @Unique
    private static Method getProviderMethod;
    @Unique
    private static Method getPrimaryBaritoneMethod;
    @Unique
    private static Method getPathingBehaviorMethod;
    @Unique
    private static Method isPathingMethod;

    @Shadow
    public abstract boolean method_6059(class_6880<class_1291> var1);

    @Shadow
    @Nullable
    public abstract class_1293 method_6112(class_6880<class_1291> var1);

    @Shadow
    public abstract boolean method_20232();

    @Shadow
    protected abstract double method_61426();

    @Unique
    private boolean isBaritonePathing() {
        try {
            if (!baritoneChecked) {
                baritoneChecked = true;
                try {
                    Class<?> apiClass = Class.forName("baritone.api.BaritoneAPI");
                    getProviderMethod = apiClass.getMethod("getProvider", new Class[0]);
                    Class<?> providerClass = Class.forName("baritone.api.IBaritoneProvider");
                    getPrimaryBaritoneMethod = providerClass.getMethod("getPrimaryBaritone", new Class[0]);
                    Class<?> baritoneClass = Class.forName("baritone.api.IBaritone");
                    getPathingBehaviorMethod = baritoneClass.getMethod("getPathingBehavior", new Class[0]);
                    Class<?> pathingClass = Class.forName("baritone.api.behavior.IPathingBehavior");
                    isPathingMethod = pathingClass.getMethod("isPathing", new Class[0]);
                    baritoneAvailable = true;
                }
                catch (ClassNotFoundException | NoSuchMethodException e2) {
                    baritoneAvailable = false;
                }
            }
            if (!baritoneAvailable) {
                return false;
            }
            Object provider = getProviderMethod.invoke(null, new Object[0]);
            if (provider == null) {
                return false;
            }
            Object baritone = getPrimaryBaritoneMethod.invoke(provider, new Object[0]);
            if (baritone == null) {
                return false;
            }
            Object pathingBehavior = getPathingBehaviorMethod.invoke(baritone, new Object[0]);
            if (pathingBehavior == null) {
                return false;
            }
            Object result = isPathingMethod.invoke(pathingBehavior, new Object[0]);
            return Boolean.TRUE.equals(result);
        }
        catch (Exception e3) {
            return false;
        }
    }

    @Inject(method={"method_5810"}, at={@At(value="HEAD")}, cancellable=true)
    public void isPushable(CallbackInfoReturnable<Boolean> infoReturnable) {
        cz event = new cz(cz$Type.COLLISION);
        ax.callEvent(event);
        if (event.isCancelled()) {
            infoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_6043"}, at={@At(value="HEAD")}, cancellable=true)
    private void jump(CallbackInfo info) {
        az az2 = this;
        if (az2 instanceof class_746) {
            class_746 player = (class_746)az2;
            if (this.isBaritonePathing()) {
                return;
            }
            cm event = new cm((class_1657)player);
            ax.callEvent(event);
            if (event.isCancelled()) {
                info.cancel();
            }
        }
    }

    @Inject(method={"method_6028"}, at={@At(value="HEAD")}, cancellable=true)
    private void swingProgressHook(CallbackInfoReturnable<Integer> cir) {
        if (this != class_310.method_1551().field_1724) {
            return;
        }
        dd event = new dd();
        ax.callEvent(event);
        if (event.isCancelled()) {
            float animation = event.getAnimation();
            animation = class_1292.method_5576((class_1309)class_310.method_1551().field_1724) ? (animation *= (float)(6 - (1 + class_1292.method_5575((class_1309)class_310.method_1551().field_1724)))) : (animation *= (float)(this.method_6059((class_6880<class_1291>)class_1294.field_5901) ? 6 + (1 + this.method_6112((class_6880<class_1291>)class_1294.field_5901).method_5578()) * 2 : 6));
            cir.setReturnValue((Object)((int)animation));
        }
    }

    @ModifyExpressionValue(method={"method_6043"}, at={@At(value="NEW", target="(DDD)Lnet/minecraft/class_243;")})
    private class_243 hookFixRotation(class_243 original) {
        if (this != class_310.method_1551().field_1724) {
            return original;
        }
        float yaw = ot.INSTANCE.getMoveRotation().getYaw() * ((float)Math.PI / 180);
        return new class_243((double)(-class_3532.method_15374((double)yaw) * 0.2f), 0.0, (double)(class_3532.method_15362((double)yaw) * 0.2f));
    }

    @ModifyExpressionValue(method={"method_61430"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_36455()F")})
    private float hookModifyFallFlyingPitch(float original) {
        if (this != class_310.method_1551().field_1724) {
            return original;
        }
        return ot.INSTANCE.getMoveRotation().getPitch();
    }

    @ModifyExpressionValue(method={"method_61430"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;")})
    private class_243 hookModifyFallFlyingRotationVector(class_243 original) {
        if (this != class_310.method_1551().field_1724) {
            return original;
        }
        return ot.INSTANCE.getMoveRotation().toVector();
    }

    @ModifyExpressionValue(method={"method_6031"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_3532;method_15393(F)F", ordinal=1)})
    private float wrapDegreesHook(float original) {
        if (this == class_310.method_1551().field_1724) {
            return class_3532.method_15393((float)(this.field_6283 - ot.INSTANCE.getRotation().getYaw()));
        }
        return original;
    }
}

