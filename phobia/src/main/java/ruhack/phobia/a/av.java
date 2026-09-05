/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 *  net.minecraft.class_309
 *  net.minecraft.class_310
 *  net.minecraft.class_3675$class_307
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.bo;
import ruhack.phobia.cn;
import ruhack.phobia.fl;
import ruhack.phobia.mo;

@Mixin(value={class_309.class})
public class av {
    @Final
    @Shadow
    private class_310 field_1678;

    @Inject(method={"method_1466"}, at={@At(value="HEAD")})
    private void onKey(long window, int action, class_11908 input, CallbackInfo ci2) {
        if (input.comp_4795() != -1 && window == this.field_1678.method_22683().method_4490()) {
            if (action == 0 && (input.comp_4795() == 344 || input.comp_4795() == 345) && this.canOpenClickGui()) {
                mo.INSTANCE.openGui();
            }
            ax.callEvent(new cn(this.field_1678.field_1755, class_3675.class_307.field_1668, input.comp_4795(), action));
        }
    }

    @Inject(method={"method_1457"}, at={@At(value="HEAD")})
    private void onChar(long window, class_11905 input, CallbackInfo ci2) {
        if (window == this.field_1678.method_22683().method_4490()) {
            char chr = (char)input.comp_4793();
            ax.callEvent(new bo(chr));
        }
    }

    private boolean canOpenClickGui() {
        return !fl.isUnhooked() && this.field_1678.field_1687 != null && this.field_1678.field_1724 != null && this.field_1678.field_1755 == null;
    }
}

