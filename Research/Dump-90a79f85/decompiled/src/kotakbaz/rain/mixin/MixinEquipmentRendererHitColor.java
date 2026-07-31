/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation
 *  net.minecraft.class_10197
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_4608
 *  net.minecraft.class_4722
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import kotakbaz.rain.client.render.hitcolor.A;
import kotakbaz.rain.module.modules.render.X;
import net.minecraft.class_10197;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4608;
import net.minecraft.class_4722;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={class_10197.class})
public class MixinEquipmentRendererHitColor
implements A {
    @Unique
    private int rain$overlayCoords = class_4608.field_21444;

    public MixinEquipmentRendererHitColor() {
        super();
    }

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1921;method_25448(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;")})
    private class_1921 rain$replaceArmorLayer(class_2960 texture, Operation<class_1921> original) {
        return this.rain$shouldColorArmor() ? class_1921.method_23578((class_2960)texture) : (class_1921)original.call(new Object[]{texture});
    }

    @WrapOperation(method={"method_64078"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_4722;method_48480(Z)Lnet/minecraft/class_1921;")})
    private class_1921 rain$replaceTrimLayer(boolean decal, Operation<class_1921> original) {
        if (!this.rain$shouldColorArmor()) {
            return (class_1921)original.call(new Object[]{decal});
        }
        return decal ? class_1921.method_28116((class_2960)class_4722.field_42071) : class_1921.method_23578((class_2960)class_4722.field_42071);
    }

    @ModifyArg(method={"method_64078"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3879;method_62100(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;III)V"), index=3)
    private int rain$replaceArmorOverlay(int overlay) {
        return this.rain$resolveOverlay(overlay);
    }

    @ModifyArg(method={"method_64078"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3879;method_60879(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;II)V"), index=3)
    private int rain$replaceTrimOverlay(int overlay) {
        return this.rain$resolveOverlay(overlay);
    }

    @Unique
    private boolean rain$shouldColorArmor() {
        return X.INSTANCE.isEnabled() && X.INSTANCE.shouldColorArmor();
    }

    @Unique
    private int rain$resolveOverlay(int original) {
        return this.rain$shouldColorArmor() ? this.rain$overlayCoords : original;
    }

    @Override
    public void rain$setOverlayCoords(int overlayCoords) {
        this.rain$overlayCoords = overlayCoords;
    }
}

