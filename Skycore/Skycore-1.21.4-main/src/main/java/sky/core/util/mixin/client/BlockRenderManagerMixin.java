package sky.core.util.mixin.client;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockRenderView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.util.NoRenderUtil;

@Mixin(BlockRenderManager.class)
public class BlockRenderManagerMixin {
    @Inject(method = "renderBlock", at = @At("HEAD"), cancellable = true)
    private void skycore$hideGrass(
            BlockState state,
            BlockPos pos,
            BlockRenderView world,
            MatrixStack matrices,
            net.minecraft.client.render.VertexConsumer vertexConsumer,
            boolean cull,
            Random random,
            CallbackInfo ci
    ) {
        if (!NoRenderUtil.shouldCancel(NoRenderUtil.Type.GRASS)) {
            return;
        }

        Block block = state.getBlock();
        if (block == Blocks.SHORT_GRASS
                || block == Blocks.TALL_GRASS
                || block == Blocks.LARGE_FERN
                || block == Blocks.FERN) {
            ci.cancel();
        }
    }
}
