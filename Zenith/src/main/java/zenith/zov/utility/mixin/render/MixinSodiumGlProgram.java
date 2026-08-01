package zenith.zov.utility.mixin.render;

import org.lwjgl.opengl.GL20C;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.Worldtweaks;

@Pseudo
@Mixin(
   targets = {"net.caffeinemc.mods.sodium.client.gl.shader.GlProgram"},
   remap = false
)
public class MixinSodiumGlProgram {
   @Inject(
      method = {"bind"},
      at = {@At("TAIL")},
      remap = false
   )
   private void uploadSaturation(CallbackInfo callbackinfo) {
      int i = GL20C.glGetInteger(35725);
      int j = GL20C.glGetUniformLocation(i, "ZenithSaturation");
      if (j != -1) {
         Worldtweaks illl1liii1llill1illi1l1l = Worldtweaks.l1I1II1l111l1llI11l1I1llII;
         float f = illl1liii1llill1illi1l1l.Spider() && illl1liii1llill1illi1l1l.Ill1ll111IllIlI11ll1.ConstructorHolder(3)
            ? illl1liii1llill1illi1l1l.l11l1IllI111IIIII.lll1lI1llll1IIllIIIII1lll()
            : 1.0F;
         GL20C.glUniform1f(j, f);
      }
   }
}
