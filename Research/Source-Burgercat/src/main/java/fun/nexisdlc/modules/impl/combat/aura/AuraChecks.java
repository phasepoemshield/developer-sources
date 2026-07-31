package fun.nexisdlc.modules.impl.combat.aura;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;

public final class AuraChecks {
    private AuraChecks() {
    }

    public static boolean isHoldingCombatWeapon(MinecraftClient mc) {
        if (mc.player == null) return false;

        ItemStack mainHandStack = mc.player.getMainHandStack();
        if (mainHandStack.isEmpty()) return false;

        return mainHandStack.isOf(Items.WOODEN_SWORD)
                || mainHandStack.isOf(Items.STONE_SWORD)
                || mainHandStack.isOf(Items.IRON_SWORD)
                || mainHandStack.isOf(Items.GOLDEN_SWORD)
                || mainHandStack.isOf(Items.DIAMOND_SWORD)
                || mainHandStack.isOf(Items.NETHERITE_SWORD)
                || mainHandStack.isOf(Items.WOODEN_AXE)
                || mainHandStack.isOf(Items.STONE_AXE)
                || mainHandStack.isOf(Items.IRON_AXE)
                || mainHandStack.isOf(Items.GOLDEN_AXE)
                || mainHandStack.isOf(Items.DIAMOND_AXE)
                || mainHandStack.isOf(Items.NETHERITE_AXE)
                || mainHandStack.isOf(Items.TRIDENT)
                || mainHandStack.isOf(Items.MACE);
    }

    public static boolean hasAnySideCollision(MinecraftClient mc) {
        if (mc.player == null || mc.world == null) return false;

        Box box = mc.player.getBoundingBox();
        Box sideBox = new Box(
                box.minX - 0.06, box.minY + 0.05, box.minZ - 0.06,
                box.maxX + 0.06, box.maxY - 0.05, box.maxZ + 0.06
        );

        return BlockPos.stream(sideBox).anyMatch(pos -> {
            BlockState state = mc.world.getBlockState(pos);
            return !state.getCollisionShape(mc.world, pos).isEmpty()
                    && state.getCollisionShape(mc.world, pos).getBoundingBoxes().stream()
                    .map(shapeBox -> shapeBox.offset(pos.getX(), pos.getY(), pos.getZ()))
                    .anyMatch(sideBox::intersects);
        });
    }

    public static boolean canSeeThroughWall(MinecraftClient mc, Entity entity) {
        if (entity == null || mc.player == null || mc.world == null) return false;

        return mc.world.raycast(new RaycastContext(
                mc.player.getEyePos(),
                entity.getEyePos(),
                RaycastContext.ShapeType.COLLIDER,
                RaycastContext.FluidHandling.NONE,
                mc.player)).getType() == BlockHitResult.Type.MISS;
    }

    public static boolean hasGrassOnRay(MinecraftClient mc, Entity entity) {
        if (entity == null || mc.player == null || mc.world == null) return false;

        HitResult outlineHit = mc.world.raycast(new RaycastContext(
                mc.player.getEyePos(),
                entity.getEyePos(),
                RaycastContext.ShapeType.OUTLINE,
                RaycastContext.FluidHandling.NONE,
                mc.player));
        if (outlineHit.getType() != HitResult.Type.BLOCK) return false;

        BlockHitResult blockHit = (BlockHitResult) outlineHit;
        var hitState = mc.world.getBlockState(blockHit.getBlockPos());
        return hitState.isOf(Blocks.SHORT_GRASS)
                || hitState.isOf(Blocks.TALL_GRASS)
                || hitState.isOf(Blocks.FERN)
                || hitState.isOf(Blocks.LARGE_FERN)
                || hitState.isOf(Blocks.DEAD_BUSH)
                || hitState.isOf(Blocks.SEAGRASS)
                || hitState.isOf(Blocks.TALL_SEAGRASS)
                || hitState.isOf(Blocks.KELP)
                || hitState.isOf(Blocks.KELP_PLANT)
                || hitState.isOf(Blocks.OAK_FENCE)
                || hitState.isOf(Blocks.SPRUCE_FENCE)
                || hitState.isOf(Blocks.BIRCH_FENCE)
                || hitState.isOf(Blocks.JUNGLE_FENCE)
                || hitState.isOf(Blocks.ACACIA_FENCE)
                || hitState.isOf(Blocks.CHERRY_FENCE)
                || hitState.isOf(Blocks.DARK_OAK_FENCE)
                || hitState.isOf(Blocks.PALE_OAK_FENCE)
                || hitState.isOf(Blocks.MANGROVE_FENCE)
                || hitState.isOf(Blocks.BAMBOO_FENCE)
                || hitState.isOf(Blocks.CRIMSON_FENCE)
                || hitState.isOf(Blocks.WARPED_FENCE)
                || hitState.isOf(Blocks.NETHER_BRICK_FENCE);
    }

    public static boolean isInCobweb(MinecraftClient mc) {
        if (mc.player == null || mc.world == null) return false;

        Box box = mc.player.getBoundingBox().expand(0.001);
        int minX = MathHelper.floor(box.minX);
        int minY = MathHelper.floor(box.minY);
        int minZ = MathHelper.floor(box.minZ);
        int maxX = MathHelper.floor(box.maxX);
        int maxY = MathHelper.floor(box.maxY);
        int maxZ = MathHelper.floor(box.maxZ);

        for (BlockPos pos : BlockPos.iterate(minX, minY, minZ, maxX, maxY, maxZ)) {
            if (mc.world.getBlockState(pos).isOf(Blocks.COBWEB)) return true;
        }
        return false;
    }

    public static boolean isPlayerInBlocks(MinecraftClient mc) {
        if (mc.player == null || mc.world == null) return false;

        Box box = mc.player.getBoundingBox().contract(0.05);
        int minX = MathHelper.floor(box.minX);
        int minY = MathHelper.floor(box.minY);
        int minZ = MathHelper.floor(box.minZ);
        int maxX = MathHelper.floor(box.maxX);
        int maxY = MathHelper.floor(box.maxY);
        int maxZ = MathHelper.floor(box.maxZ);

        for (BlockPos pos : BlockPos.iterate(minX, minY, minZ, maxX, maxY, maxZ)) {
            if (!mc.world.getBlockState(pos).isAir()) return true;
        }
        return false;
    }
}
