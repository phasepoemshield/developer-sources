package fun.nexisdlc.mixins.render;

import com.mojang.blaze3d.systems.RenderSystem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RenderSystem.class)
public class RenderSystemMixin {
    // UI render moved to MinecraftClientMixin (before blitToScreen)
}
