package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import fun.wonderful.api.commands.Command;
import net.minecraft.world.BlockView;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;

public class TPCommand
extends Command {
    public TPCommand() {
        super("tp");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        builder.then(this.arg("Y", IntegerArgumentType.integer()).executes(context -> {
            int y2 = (Integer)context.getArgument("Y", Integer.class);
            TPCommand.mc.player.setPosition(TPCommand.mc.player.getX(), TPCommand.mc.player.getY() + (double)y2, TPCommand.mc.player.getZ());
            return 1;
        }));
        builder.then(this.literal("up").executes(context -> {
            this.clipToSafeBlock(true);
            return 1;
        }));
        builder.then(this.literal("down").executes(context -> {
            this.clipToSafeBlock(false);
            return 1;
        }));
    }

    private void clipToSafeBlock(boolean up) {
        if (TPCommand.mc.player == null || TPCommand.mc.world == null) {
            return;
        }
        int startY = TPCommand.mc.player.getBlockY();
        int minY = TPCommand.mc.world.getBottomY();
        int maxY = TPCommand.mc.world.getTopYInclusive() - 2;
        int step = up ? 1 : -1;
        int from = up ? startY + 1 : startY - 1;
        int to = up ? maxY : minY;
        int y2 = from;
        while (up ? y2 <= to : y2 >= to) {
            if (this.isSafeStandPosition(y2)) {
                VoxelShape shape = TPCommand.mc.world.getBlockState(new BlockPos(TPCommand.mc.player.getBlockX(), y2 - 1, TPCommand.mc.player.getBlockZ())).getCollisionShape((BlockView)TPCommand.mc.world, new BlockPos(TPCommand.mc.player.getBlockX(), y2 - 1, TPCommand.mc.player.getBlockZ()));
                double offsetY = shape.isEmpty() ? 0.0 : shape.getMax(Direction.class_2351.Y);
                TPCommand.mc.player.setPosition(TPCommand.mc.player.getX(), (double)y2 + offsetY, TPCommand.mc.player.getZ());
                return;
            }
            y2 += step;
        }
    }

    private boolean isSafeStandPosition(int y2) {
        BlockPos floorPos = new BlockPos(TPCommand.mc.player.getBlockX(), y2 - 1, TPCommand.mc.player.getBlockZ());
        BlockPos feetPos = floorPos.up();
        BlockPos headPos = feetPos.up();
        BlockState floorState = TPCommand.mc.world.getBlockState(floorPos);
        if (floorState.getCollisionShape((BlockView)TPCommand.mc.world, floorPos).isEmpty()) {
            return false;
        }
        return TPCommand.mc.world.getBlockState(feetPos).getCollisionShape((BlockView)TPCommand.mc.world, feetPos).isEmpty() && TPCommand.mc.world.getBlockState(headPos).getCollisionShape((BlockView)TPCommand.mc.world, headPos).isEmpty();
    }
}