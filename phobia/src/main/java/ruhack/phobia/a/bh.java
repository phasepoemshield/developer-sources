/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.v2.WrapWithCondition
 *  net.minecraft.class_11910
 *  net.minecraft.class_310
 *  net.minecraft.class_312
 *  net.minecraft.class_3675$class_307
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import net.minecraft.class_3675;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bz;
import ruhack.phobia.cg;
import ruhack.phobia.cn;
import ruhack.phobia.cp;
import ruhack.phobia.hn;

@Mixin(value={class_312.class})
public abstract class bh {
    @Final
    @Shadow
    private class_310 field_1779;
    @Shadow
    private boolean field_1783;
    @Shadow
    private double field_1795;
    @Shadow
    private double field_1794;
    @Shadow
    private double field_1789;
    @Shadow
    private double field_1787;
    @Shadow
    private boolean field_1784;

    @Inject(method={"method_1601"}, at={@At(value="HEAD")})
    public void onMouseButtonHook(long window, class_11910 input, int action, CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        if (input.comp_4801() != -1 && window == this.field_1779.method_22683().method_4490()) {
            ax.callEvent(new cn(this.field_1779.field_1755, class_3675.class_307.field_1672, input.comp_4801(), action));
        }
    }

    @Inject(method={"method_1598"}, at={@At(value="HEAD")})
    public void phobia$wheelBind(long window, double horizontal, double vertical, CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        if (window != this.field_1779.method_22683().method_4490() || vertical == 0.0) {
            return;
        }
        int key = vertical > 0.0 ? -2 : -3;
        ax.callEvent(new cn(this.field_1779.field_1755, class_3675.class_307.field_1672, key, 1));
        ax.callEvent(new cn(this.field_1779.field_1755, class_3675.class_307.field_1672, key, 0));
    }

    @Inject(method={"method_1598"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_31548()Lnet/minecraft/class_1661;")}, cancellable=true)
    public void onMouseScrollHook(long window, double horizontal, double vertical, CallbackInfo ci2) {
        if (System.getProperty("os.name", "").contains("Mac")) {
            return;
        }
        cg event = new cg(horizontal, vertical);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_1606"}, at={@At(value="HEAD")})
    private void onUpdateMouse(double timeDelta, CallbackInfo ci2) {
        bz event = new bz();
        ax.callEvent(event);
        if (event.isCancelled()) {
            double slowdown = (double)event.getFov() / (double)((Integer)this.field_1779.field_1690.method_41808().method_41753()).intValue();
            this.field_1789 *= slowdown;
            this.field_1787 *= slowdown;
        }
    }

    @Inject(method={"method_1606"}, at={@At(value="TAIL")})
    private void phobia$applyLegitAimAssist(double timeDelta, CallbackInfo ci2) {
        hn aura = hn.getInstance();
        if (aura != null) {
            aura.applyLegitAimFrame();
        }
    }

    @WrapWithCondition(method={"method_1606"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_5872(DD)V")}, require=1, allow=1)
    private boolean modifyMouseRotationInput(class_746 instance, double cursorDeltaX, double cursorDeltaY) {
        cp event = new cp((float)cursorDeltaX, (float)cursorDeltaY);
        ax.callEvent(event);
        if (event.isCancelled()) {
            return false;
        }
        instance.method_5872((double)event.getCursorDeltaX(), (double)event.getCursorDeltaY());
        return false;
    }
}
