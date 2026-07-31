package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.player.MoveUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

public class NoWeb
extends Module {
    public static NoWeb INSTANCE = new NoWeb();
    public ModeSetting web = new ModeSetting("Мод", "Коллизия", "Коллизия", "Обычный");

    public NoWeb() {
        super("NoWeb", "Убирает замедление от паутины", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.web);
    }

    @EventLink
    public void onUpdate(EventUpdate eventUpdate) {
        if (NoWeb.mc.player == null || NoWeb.mc.world == null) {
            return;
        }
        if (this.web.is("Коллизия")) {
            BlockPos playerPos = NoWeb.mc.player.getBlockPos();
            for (int x2 = -1; x2 <= 1; ++x2) {
                for (int y2 = 0; y2 <= 2; ++y2) {
                    for (int z2 = -1; z2 <= 1; ++z2) {
                        BlockPos pos = playerPos.add(x2, y2, z2);
                        if (NoWeb.mc.world.getBlockState(pos).getBlock() != Blocks.COBWEB) continue;
                        NoWeb.mc.player.networkHandler.sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.class_2847.STOP_DESTROY_BLOCK, pos, Direction.UP));
                    }
                }
            }
            return;
        }
        if (this.web.is("Обычный")) {
            BlockPos aboveHead;
            double z3;
            double x3;
            if (NoWeb.mc.player.isSneaking() && NoWeb.mc.player.isOnGround()) {
                return;
            }
            boolean headInWeb = false;
            boolean feetInWeb = false;
            block3: for (x3 = -0.295; x3 <= 0.295; x3 += 0.05) {
                for (z3 = -0.295; z3 <= 0.295; z3 += 0.05) {
                    for (double y3 = (double)NoWeb.mc.player.getEyeHeight(NoWeb.mc.player.getPose()); y3 >= 0.0; y3 -= 0.1) {
                        BlockPos headPos = BlockPos.ofFloored((double)(NoWeb.mc.player.getX() + x3), (double)(NoWeb.mc.player.getY() + y3), (double)(NoWeb.mc.player.getZ() + z3));
                        if (NoWeb.mc.world.getBlockState(headPos).getBlock() != Blocks.COBWEB) continue;
                        headInWeb = true;
                        continue block3;
                    }
                }
            }
            if (!headInWeb) {
                block6: for (x3 = -0.295; x3 <= 0.295; x3 += 0.05) {
                    for (z3 = -0.295; z3 <= 0.295; z3 += 0.05) {
                        BlockPos pos = BlockPos.ofFloored((double)(NoWeb.mc.player.getX() + x3), (double)NoWeb.mc.player.getY(), (double)(NoWeb.mc.player.getZ() + z3));
                        if (NoWeb.mc.world.getBlockState(pos).getBlock() != Blocks.COBWEB) continue;
                        feetInWeb = true;
                        break block6;
                    }
                }
            }
            if (!headInWeb && !feetInWeb && NoWeb.mc.world.getBlockState(aboveHead = BlockPos.ofFloored((double)NoWeb.mc.player.getX(), (double)(NoWeb.mc.player.getY() + (double)NoWeb.mc.player.getEyeHeight(NoWeb.mc.player.getPose()) + 0.2), (double)NoWeb.mc.player.getZ())).getBlock() == Blocks.COBWEB) {
                headInWeb = true;
            }
            if (headInWeb || feetInWeb) {
                if (NoWeb.mc.options.jumpKey.isPressed()) {
                    NoWeb.mc.player.setVelocity(0.0, 0.8, 0.0);
                } else if (NoWeb.mc.options.sneakKey.isPressed()) {
                    NoWeb.mc.player.setVelocity(0.0, -0.8, 0.0);
                } else {
                    NoWeb.mc.player.setVelocity(NoWeb.mc.player.getVelocity().x, 0.0, NoWeb.mc.player.getVelocity().z);
                }
                MoveUtils.setMotion(0.21);
            }
        }
    }
}