package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import ru.ocz.protection.annotation.Compile;

public class HighJump
extends Module {
    public static HighJump INSTANCE = new HighJump();
    private final ModeSetting mode = new ModeSetting("Режим", "Shulker", "Shulker", "Slime", "Boat");
    private final FloatSetting slimeMultiplier = new FloatSetting("Множитель", 2.0f, 1.1f, 5.0f, 0.1f);
    private boolean wasInBoat;
    private double lastVelY;
    private int cooldown;

    public HighJump() {
        super("HighJump", "Высокий прыжок", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.slimeMultiplier);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.wasInBoat = false;
        this.lastVelY = 0.0;
        this.cooldown = 0;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.wasInBoat = false;
        this.lastVelY = 0.0;
        this.cooldown = 0;
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    private void handleShulker() {
        if (!(HighJump.mc.currentScreen instanceof ShulkerBoxScreen)) {
            return;
        }
        BlockPos playerPos = HighJump.mc.player.getBlockPos();
        BlockPos[] checkPositions = new BlockPos[]{playerPos.down(), playerPos, playerPos.north(), playerPos.south(), playerPos.east(), playerPos.west()};
        boolean onShulker = false;
        for (BlockPos pos : checkPositions) {
            BlockState state = HighJump.mc.world.getBlockState(pos);
            if (!(state.getBlock() instanceof ShulkerBoxBlock)) continue;
            onShulker = true;
            break;
        }
        if (onShulker) {
            HighJump.mc.player.setVelocity(HighJump.mc.player.getVelocity().x, 2.0, HighJump.mc.player.getVelocity().z);
            HighJump.mc.player.closeHandledScreen();
        }
    }

    private void handleSlime() {
        boolean onSlime;
        double velY = HighJump.mc.player.getVelocity().y;
        BlockPos below = HighJump.mc.player.getBlockPos().down();
        BlockPos belowTwo = HighJump.mc.player.getBlockPos().down(2);
        boolean bl = onSlime = HighJump.mc.world.getBlockState(below).isOf(Blocks.SLIME_BLOCK) || HighJump.mc.world.getBlockState(belowTwo).isOf(Blocks.SLIME_BLOCK);
        if (this.lastVelY < -0.1 && velY > 0.1 && onSlime && this.cooldown == 0) {
            double boostedVel = velY * (double)this.slimeMultiplier.get();
            HighJump.mc.player.setVelocity(HighJump.mc.player.getVelocity().x, boostedVel, HighJump.mc.player.getVelocity().z);
            this.cooldown = 5;
        }
        this.lastVelY = velY;
    }

    private void handleBoat() {
        boolean inBoat = HighJump.mc.player.getVehicle() instanceof BoatEntity;
        if (this.wasInBoat && !inBoat && this.cooldown == 0) {
            HighJump.mc.player.setVelocity(HighJump.mc.player.getVelocity().x, 1.5, HighJump.mc.player.getVelocity().z);
            this.cooldown = 20;
        }
        this.wasInBoat = inBoat;
    }
}