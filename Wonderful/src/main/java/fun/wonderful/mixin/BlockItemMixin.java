package fun.wonderful.mixin;

import fun.wonderful.api.events.implement.EventPlaceBlock;
import net.minecraft.util.ActionResult;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockItem.class})
public abstract class BlockItemMixin {
    @Inject(method={"useOnBlock"}, at={@At(value="RETURN")})
    private void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        if (!((ActionResult)cir.getReturnValue()).isAccepted()) {
            return;
        }
        BlockItem item = (BlockItem)(Object)this;
        Block block = item.getBlock();
        if (block != Blocks.OBSIDIAN && block != Blocks.BEDROCK) {
            return;
        }
        BlockPos pos = new ItemPlacementContext(context).getBlockPos();
        if (context.getWorld().getBlockState(pos).getBlock() != block) {
            return;
        }
        new EventPlaceBlock(block, pos).call();
    }
}