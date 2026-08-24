package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import java.util.Map;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.SkinTextures.Model;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({EntityRenderDispatcher.class})
public interface EntityRenderDispatcherAccessor {
   @Accessor("modelRenderers")
   Map<Model, EntityRenderer<? extends PlayerEntity, ?>> zenith_getModelRenderers();
}
