package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.util.Hand;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import ru.ocz.protection.annotation.Compile;

public class Nuker
extends Module {
    public static Nuker INSTANCE = new Nuker();
    private final FloatSetting radius = new FloatSetting("Дистанция", 3.0f, 1.0f, 5.0f, 1.0f);
    private final BooleanSetting breakAll = new BooleanSetting("Ломать все блоки", false);
    private final BooleanSetting swing = new BooleanSetting("Анимация руки", true);
    private final Set<String> targetBlocks = new HashSet<String>();
    private BlockPos currentTargetBlock;

    public Nuker() {
        super("Nuker", "Автоматически ломает блоки в радиусе", Module.ModuleCategory.PLAYER);
        this.addSettings(this.radius, this.breakAll, this.swing);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    private boolean isCurrentTargetValid() {
        return this.currentTargetBlock != null && this.isInRange(this.currentTargetBlock) && this.shouldBreak(this.currentTargetBlock);
    }

    private BlockPos findNewTarget() {
        int range = Math.round(this.radius.get());
        BlockPos playerPos = Nuker.mc.player.getBlockPos();
        return BlockPos.stream((BlockPos)playerPos.add(-range, 0, -range), (BlockPos)playerPos.add(range, range, range)).map(BlockPos::toImmutable).filter(this::isInRange).filter(this::shouldBreak).min(Comparator.comparingDouble(pos -> Nuker.mc.player.squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos)))).orElse(null);
    }

    private boolean isInRange(BlockPos pos) {
        double maxDistance = this.radius.get();
        return Nuker.mc.player.squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos)) <= maxDistance * maxDistance;
    }

    private boolean shouldBreak(BlockPos pos) {
        BlockState state = Nuker.mc.world.getBlockState(pos);
        if (state == null || state.isAir() || state.getHardness((BlockView)Nuker.mc.world, pos) < 0.0f) {
            return false;
        }
        if (this.breakAll.isState()) {
            return true;
        }
        String blockName = Registries.BLOCK.getId((Object)state.getBlock()).getPath().toLowerCase();
        return this.targetBlocks.contains(blockName);
    }

    private void breakCurrentTarget() {
        if (this.currentTargetBlock == null || Nuker.mc.player == null || Nuker.mc.interactionManager == null) {
            return;
        }
        Nuker.mc.interactionManager.attackBlock(this.currentTargetBlock, Direction.UP);
        Nuker.mc.interactionManager.updateBlockBreakingProgress(this.currentTargetBlock, Direction.UP);
        if (this.swing.isState()) {
            Nuker.mc.player.swingHand(Hand.MAIN_HAND);
        }
        if (Nuker.mc.world.getBlockState(this.currentTargetBlock).isAir()) {
            this.resetBreaking();
        }
    }

    private void resetBreaking() {
        this.currentTargetBlock = null;
        if (Nuker.mc.interactionManager != null) {
            Nuker.mc.interactionManager.cancelBlockBreaking();
        }
    }

    public void addBlock(String blockName) {
        this.targetBlocks.add(Nuker.normalizeBlockName(blockName));
    }

    public void removeBlock(String blockName) {
        this.targetBlocks.remove(Nuker.normalizeBlockName(blockName));
    }

    public void clearBlocks() {
        this.targetBlocks.clear();
        this.resetBreaking();
    }

    public boolean isTargetBlock(String blockName) {
        return this.targetBlocks.contains(Nuker.normalizeBlockName(blockName));
    }

    public Set<String> getTargetBlocks() {
        return new HashSet<String>(this.targetBlocks);
    }

    public static String normalizeBlockName(String blockName) {
        if (blockName == null) {
            return "";
        }
        String normalized = blockName.toLowerCase().trim();
        int namespaceSeparator = normalized.indexOf(58);
        return namespaceSeparator >= 0 ? normalized.substring(namespaceSeparator + 1) : normalized;
    }

    @Override
    public void onDisable() {
        this.resetBreaking();
        super.onDisable();
    }
}