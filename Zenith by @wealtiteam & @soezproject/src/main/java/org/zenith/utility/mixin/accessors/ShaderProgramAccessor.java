package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import java.util.Map;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderProgram;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ShaderProgram.class})
public interface ShaderProgramAccessor {
   @Accessor
   Map<String, GlUniform> getUniformsByName();
}
