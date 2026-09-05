/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10889
 *  net.minecraft.class_1920
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_776
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import java.util.List;
import net.minecraft.class_10889;
import net.minecraft.class_1920;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_776;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.jk;

@Mixin(value={class_776.class})
public class d {
    @Inject(method={"method_3355"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeGrass(class_2680 state, class_2338 pos, class_1920 world, class_4587 matrices, class_4588 vertexConsumer, boolean cull, List<class_10889> parts, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Grass") && (state.method_27852(class_2246.field_10479) || state.method_27852(class_2246.field_10214) || state.method_27852(class_2246.field_10112) || state.method_27852(class_2246.field_10313))) {
            ci2.cancel();
        }
    }
}

