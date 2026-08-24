package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Particle.class})
public interface ParticleAccessor {
   @Accessor("world")
   ClientWorld zenith_getWorld();
}
