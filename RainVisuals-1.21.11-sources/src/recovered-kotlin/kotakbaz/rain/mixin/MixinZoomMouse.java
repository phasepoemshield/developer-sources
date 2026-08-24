package kotakbaz.rain.mixin;

import net.minecraft.client.Mouse;
import net.minecraft.client.gui.Click;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.شز;

// $VF: Compiled from MixinZoomMouse.java
@Mixin(value = Mouse.class, priority = 500)
public class MixinZoomMouse {
   @Unique
   private static final Vector3f rain$mouseVec = new Vector3f();

   @ModifyArgs(method = "method_1601", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25406(Lnet/minecraft/class_11909;)Z"))
   private void rain$transformMouseUpCoordinates(Args args) {
      if (شز.INSTANCE.shouldTransformScreenMouse()) {
         Click event = (Click)args.get(0);
         rain$mouseVec.set((float)event.x(), (float)event.y(), 1.0F);
         rain$mouseVec.mul(شز.INSTANCE.getMouseTransform());
         args.set(0, new Click(rain$mouseVec.x, rain$mouseVec.y, event.buttonInfo()));
      }
   }

   @ModifyArgs(method = "method_1601", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25402(Lnet/minecraft/class_11909;Z)Z"))
   private void rain$transformMouseDownCoordinates(Args args) {
      if (شز.INSTANCE.shouldTransformScreenMouse()) {
         Click event = (Click)args.get(0);
         rain$mouseVec.set((float)event.x(), (float)event.y(), 1.0F);
         rain$mouseVec.mul(شز.INSTANCE.getMouseTransform());
         args.set(0, new Click(rain$mouseVec.x, rain$mouseVec.y, event.buttonInfo()));
      }
   }

   @ModifyArgs(method = "method_1598", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25401(DDDD)Z"))
   private void rain$transformMouseScrollCoordinates(Args args) {
      if (شز.INSTANCE.shouldTransformScreenMouse()) {
         rain$mouseVec.set(((Number)args.get(0)).floatValue(), ((Number)args.get(1)).floatValue(), 1.0F);
         rain$mouseVec.mul(شز.INSTANCE.getMouseTransform());
         args.set(0, (double)rain$mouseVec.x);
         args.set(1, (double)rain$mouseVec.y);
      }
   }
}
