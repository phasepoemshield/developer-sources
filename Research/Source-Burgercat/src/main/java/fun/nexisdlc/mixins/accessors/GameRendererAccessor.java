package fun.nexisdlc.mixins.accessors;

import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GameRenderer.class)
public interface GameRendererAccessor {
    @Accessor("firstPersonRenderer")
    HeldItemRenderer getFirstPersonRenderer();

    @Invoker("getFov")
    float invokeGetFov(Camera camera, float tickDelta, boolean changingFov);

    @Accessor("buffers")
    BufferBuilderStorage getBuffers();


}