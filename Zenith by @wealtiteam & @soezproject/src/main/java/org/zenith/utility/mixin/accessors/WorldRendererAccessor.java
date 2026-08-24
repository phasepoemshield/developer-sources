package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;














import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({WorldRenderer.class})
public interface WorldRendererAccessor {
   @Accessor("world")
   @Nullable
   ClientWorld zenith_getWorld();

   @Invoker("scheduleSectionRender")
   void zenith_scheduleSectionRender(BlockPos var1, boolean var2);
}
