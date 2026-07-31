package fun.wonderful.mixin;

import net.minecraft.client.render.entity.PlayerEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value={PlayerEntityRenderer.class})
public abstract class PlayerEntityRendererMixin {
}