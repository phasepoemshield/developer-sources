/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1735
 *  net.minecraft.class_332
 *  net.minecraft.class_465
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_1735;
import net.minecraft.class_332;
import net.minecraft.class_465;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.ax;
import ruhack.phobia.ce;

@Mixin(value={class_465.class})
public abstract class ai {
    @Shadow
    public int field_2792;
    @Shadow
    public int field_2779;
    @Shadow
    @Nullable
    protected class_1735 field_2787;

    @Inject(method={"method_2380"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$drawShulkerPreview(class_332 context, int mouseX, int mouseY, CallbackInfo ci2) {
        ce event = new ce(context, this.field_2787, mouseX, mouseY, this.field_2792, this.field_2779);
        ax.callEvent(event);
        if (event.isCancelled()) {
            ci2.cancel();
        }
    }
}

