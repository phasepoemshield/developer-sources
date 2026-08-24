package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({GameRenderer.class})
public interface GameRendererAccessor {
   @Invoker("renderHand")
   void zenith_renderHand(Camera var1, float var2, Matrix4f var3);
}
