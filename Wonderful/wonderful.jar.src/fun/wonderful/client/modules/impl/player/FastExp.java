package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.mixin.IMinecraftClientAccessor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FastExp
extends Module {
    public static FastExp INSTANCE = new FastExp();

    public FastExp() {
        super("FastExp", "Позволяет бросать пузырьки опыта без задержки", Module.ModuleCategory.PLAYER);
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (FastExp.mc.player == null) {
            return;
        }
        ItemStack stack = FastExp.mc.player.getMainHandStack();
        if (stack.isOf(Items.EXPERIENCE_BOTTLE)) {
            ((IMinecraftClientAccessor)mc).setItemUseCooldown(0);
        }
    }
}