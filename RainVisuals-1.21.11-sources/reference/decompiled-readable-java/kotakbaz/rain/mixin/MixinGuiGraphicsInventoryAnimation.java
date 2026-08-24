/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  org.joml.Matrix3x2fStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.\u0638\u062f;

@Mixin(value={DrawContext.class})
public abstract class MixinGuiGraphicsInventoryAnimation {
    @Final
    @Shadow
    private Matrix3x2fStack matrices;

    private float rain$transformY(float x, float y) {
        return this.matrices.m01() * x + this.matrices.m11() * y + this.matrices.m21();
    }

    @ModifyArgs(method={"method_70854"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11255;<init>(Lnet/minecraft/class_591;Lnet/minecraft/class_2960;FFFIIIIFLnet/minecraft/class_8030;)V"))
    private void rain$transformSkin(Args args2) {
        this.rain$transform(args2, 5, 6, 7, 8, 9);
    }

    @ModifyArgs(method={"method_70853"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11254;<init>(Lnet/minecraft/class_3879$class_9948;Lnet/minecraft/class_4719;IIIIFLnet/minecraft/class_8030;)V"))
    private void rain$transformSign(Args args2) {
        this.rain$transform(args2, 2, 3, 4, 5, 6);
    }

    private void rain$transform(Args args2, int leftIndex, int topIndex, int rightIndex, int bottomIndex, int scaleIndex) {
        if (!\u0638\u062f.isActive()) {
            return;
        }
        int left = (Integer)args2.get(leftIndex);
        int top = (Integer)args2.get(topIndex);
        int right = (Integer)args2.get(rightIndex);
        int bottom = (Integer)args2.get(bottomIndex);
        args2.set(leftIndex, (Object)Math.round(this.rain$transformX(left, top)));
        args2.set(topIndex, (Object)Math.round(this.rain$transformY(left, top)));
        args2.set(rightIndex, (Object)Math.round(this.rain$transformX(right, bottom)));
        args2.set(bottomIndex, (Object)Math.round(this.rain$transformY(right, bottom)));
        if (scaleIndex >= 0) {
            float scale = ((Float)args2.get(scaleIndex)).floatValue();
            float matrixScale = (float)Math.sqrt(this.matrices.m00() * this.matrices.m00() + this.matrices.m01() * this.matrices.m01());
            args2.set(scaleIndex, (Object)Float.valueOf(scale * matrixScale));
        }
    }

    @ModifyArgs(method={"method_70855"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11250;<init>(Lnet/minecraft/class_10377;Lnet/minecraft/class_1767;Lnet/minecraft/class_9307;IIIILnet/minecraft/class_8030;)V"))
    private void rain$transformBanner(Args args2) {
        this.rain$transform(args2, 3, 4, 5, 6, -1);
    }

    @ModifyArgs(method={"method_70856"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11252;<init>(Lnet/minecraft/class_10017;Lorg/joml/Vector3f;Lorg/joml/Quaternionf;Lorg/joml/Quaternionf;IIIIFLnet/minecraft/class_8030;)V"))
    private void rain$transformEntity(Args args2) {
        this.rain$transform(args2, 4, 5, 6, 7, 8);
    }

    private float rain$transformX(float x, float y) {
        return this.matrices.m00() * x + this.matrices.m10() * y + this.matrices.m20();
    }

    @ModifyArgs(method={"method_70852"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11251;<init>(Lnet/minecraft/class_557;Lnet/minecraft/class_2960;FFIIIIFLnet/minecraft/class_8030;)V"))
    private void rain$transformBook(Args args2) {
        this.rain$transform(args2, 4, 5, 6, 7, 8);
    }
}

