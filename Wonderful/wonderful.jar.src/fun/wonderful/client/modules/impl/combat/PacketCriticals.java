package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.client.modules.Module;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.annotation.VM;

public class PacketCriticals
extends Module {
    public static PacketCriticals INSTANCE = new PacketCriticals();

    public PacketCriticals() {
        super("PacketCriticals", "Бьет критами под эффект плавного падения / в паутине", Module.ModuleCategory.COMBAT);
    }

    @EventLink
    @VM
    @Compile
    public native void onAttack(EventAttackEntity var1);

    private boolean isInCobweb() {
        if (PacketCriticals.mc.player == null || PacketCriticals.mc.world == null) {
            return false;
        }
        Box box = PacketCriticals.mc.player.getBoundingBox();
        for (BlockPos pos : BlockPos.iterate((int)MathHelper.floor((double)box.minX), (int)MathHelper.floor((double)box.minY), (int)MathHelper.floor((double)box.minZ), (int)MathHelper.floor((double)box.maxX), (int)MathHelper.floor((double)box.maxY), (int)MathHelper.floor((double)box.maxZ))) {
            if (!PacketCriticals.mc.world.getBlockState(pos).isOf(Blocks.COBWEB)) continue;
            return true;
        }
        return false;
    }
}