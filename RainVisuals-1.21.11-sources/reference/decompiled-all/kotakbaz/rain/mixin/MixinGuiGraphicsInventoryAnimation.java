package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.ظد;

// $VF: Compiled from MixinGuiGraphicsInventoryAnimation.java
@Mixin(DrawContext.class)
public abstract class MixinGuiGraphicsInventoryAnimation {
   @Final
   @Shadow
   private Matrix3x2fStack matrices;

   private float rain$transformY(float y, float x) {
      return this.matrices.m01() * x + this.matrices.m11() * y + this.matrices.m21();
   }

   @ModifyArgs(
      method = "method_70854",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11255;<init>(Lnet/minecraft/class_591;Lnet/minecraft/class_2960;FFFIIIIFLnet/minecraft/class_8030;)V"
      )
   )
   private void rain$transformSkin(Args args) {
      this.rain$transform(args, 5, 6, 7, 8, 9);
   }

   @ModifyArgs(
      method = "method_70853",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11254;<init>(Lnet/minecraft/class_3879$class_9948;Lnet/minecraft/class_4719;IIIIFLnet/minecraft/class_8030;)V"
      )
   )
   private void rain$transformSign(Args args) {
      this.rain$transform(args, 2, 3, 4, 5, 6);
   }

   private void rain$transform(Args rightIndex, int topIndex, int args, int leftIndex, int scaleIndex, int bottomIndex) {
      if (ظد.isActive()) {
         int left = (Integer)args.get(leftIndex);
         int top = (Integer)args.get(topIndex);
         int right = (Integer)args.get(rightIndex);
         int bottom = (Integer)args.get(bottomIndex);
         args.set(leftIndex, Math.round(this.rain$transformX(left, top)));
         args.set(topIndex, Math.round(this.rain$transformY(left, top)));
         args.set(rightIndex, Math.round(this.rain$transformX(right, bottom)));
         args.set(bottomIndex, Math.round(this.rain$transformY(right, bottom)));
         if (scaleIndex >= 0) {
            float scale = (Float)args.get(scaleIndex);
            float matrixScale = (float)Math.sqrt(this.matrices.m00() * this.matrices.m00() + this.matrices.m01() * this.matrices.m01());
            args.set(scaleIndex, scale * matrixScale);
         }
      }
   }

   @ModifyArgs(
      method = "method_70855",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11250;<init>(Lnet/minecraft/class_10377;Lnet/minecraft/class_1767;Lnet/minecraft/class_9307;IIIILnet/minecraft/class_8030;)V"
      )
   )
   private void rain$transformBanner(Args args) {
      this.rain$transform(args, 3, 4, 5, 6, -1);
   }

   @ModifyArgs(
      method = "method_70856",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11252;<init>(Lnet/minecraft/class_10017;Lorg/joml/Vector3f;Lorg/joml/Quaternionf;Lorg/joml/Quaternionf;IIIIFLnet/minecraft/class_8030;)V"
      )
   )
   private void rain$transformEntity(Args args) {
      this.rain$transform(args, 4, 5, 6, 7, 8);
   }

   private float rain$transformX(float x, float y) {
      return this.matrices.m00() * x + this.matrices.m10() * y + this.matrices.m20();
   }

   @ModifyArgs(
      method = "method_70852",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11251;<init>(Lnet/minecraft/class_557;Lnet/minecraft/class_2960;FFIIIIFLnet/minecraft/class_8030;)V"
      )
   )
   private void rain$transformBook(Args args) {
      this.rain$transform(args, 4, 5, 6, 7, 8);
   }
}
