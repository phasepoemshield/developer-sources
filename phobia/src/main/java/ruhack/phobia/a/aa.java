/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921
 *  net.minecraft.class_310
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4618
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package ruhack.phobia.a;

import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4618;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import ruhack.phobia.jm;
import ruhack.phobia.oj;

@Mixin(targets={"org/figuramc/figura/model/rendering/ImmediateFiguraRenderer$VertexBuffer"}, remap=false)
public class aa {
    @Redirect(method={"consume"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_4597;method_73477(Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588;", remap=true), remap=false)
    private class_4588 phobia$directCustomModelOutline(class_4597 provider, class_1921 layer) {
        if (oj.isCustomModelOutline(layer)) {
            class_4618 outlineProvider = class_310.method_1551().method_22940().method_23003();
            jm shaderESP = jm.getInstance();
            if (shaderESP != null) {
                outlineProvider.method_23286(shaderESP.getOutlineColor());
            }
            return outlineProvider.method_73477(layer);
        }
        return provider.method_73477(layer);
    }
}

