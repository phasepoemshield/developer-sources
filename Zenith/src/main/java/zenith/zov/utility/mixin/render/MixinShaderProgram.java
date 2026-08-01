package zenith.zov.utility.mixin.render;

import net.minecraft.client.gl.ShaderProgram;
import org.lwjgl.opengl.GL20;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Worldtweaks;

@Mixin({ShaderProgram.class})
public class MixinShaderProgram {
   @Shadow
   @Final
   private int glRef;

   @Inject(
      method = {"bind"},
      at = {@At("TAIL")}
   )
   private void uploadSaturation(CallbackInfo callbackinfo) {
      int i = GL20.glGetUniformLocation(this.glRef, "ZenithSaturation");
      if (i != -1) {
         GL20.glUniform1f(i, Worldtweaks.l1I1II1l111l1llI11l1I1llII.I11IIIII111IlI1lI1I1IIlll11());
      }
   }
}
