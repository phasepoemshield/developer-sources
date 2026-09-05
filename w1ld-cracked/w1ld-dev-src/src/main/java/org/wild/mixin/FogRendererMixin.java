package org.wild.mixin;

import net.minecraft.class_758;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import ru.metaculture.protection.nUnVNUN;
import ru.metaculture.protection.uuUnvvnNUU;
import ru.metaculture.protection.vvnNVnuvvUu;

@Mixin({class_758.class})
public class FogRendererMixin {
   @ModifyArgs(
      method = {"applyFog(Lnet/minecraft/client/render/Camera;IZLnet/minecraft/client/render/RenderTickCounter;FLnet/minecraft/client/world/ClientWorld;)Lorg/joml/Vector4f;"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/fog/FogRenderer;applyFog(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"
      )
   )
   private void wild$eraseWorldFog(Args var1) {
      if (uuUnvvnNUU.UuUVuuUu("Туман") || vvnNVnuvvUu.UuuNnUvUuv() || nUnVNUN.nUUVuvU()) {
         var1.set(3, Float.MAX_VALUE);
         var1.set(4, Float.MAX_VALUE);
         var1.set(5, Float.MAX_VALUE);
         var1.set(6, Float.MAX_VALUE);
      }
   }
}
