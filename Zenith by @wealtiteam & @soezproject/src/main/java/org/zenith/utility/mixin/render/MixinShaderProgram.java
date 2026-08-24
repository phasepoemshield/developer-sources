package org.zenith.utility.mixin.render;

import org.zenith.module.Module;

import org.zenith.module.WorldTweaks;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.module.WorldTweaks;














import net.minecraft.client.gl.ShaderProgram;
import org.lwjgl.opengl.GL20;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ShaderProgram.class})
public class MixinShaderProgram {
   @Shadow
   @Final
   public int field_29493;

   public MixinShaderProgram() {
   }

   @Inject(
      method = {"bind"},
      at = {@At("TAIL")}
   )
   public void uploadSaturation(CallbackInfo var1) {
      int i = GL20.glGetUniformLocation(this.field_29493, "ZenithSaturation");
      if (i != -1) {
         GL20.glUniform1f(i, WorldTweaks.worldTweaks.int326());
      }
   }
}
