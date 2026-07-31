package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Uuids;
import ru.ocz.protection.annotation.Compile;

public class AntiBot
extends Module {
    public static AntiBot INSTANCE = new AntiBot();
    private final ModeSetting mode = new ModeSetting("Режим", "Default", "Default", "ReallyWorld");
    public static final List<Entity> isBot = new ArrayList<Entity>();

    public AntiBot() {
        super("AntiBot", "Определяет ботов на сервере", Module.ModuleCategory.COMBAT);
        this.addSettings(this.mode);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    private void updateDefaultBots() {
        for (PlayerEntity player : AntiBot.mc.world.getPlayers()) {
            boolean bot;
            if (AntiBot.mc.player == player) continue;
            if (this.isFriend(player)) {
                isBot.remove(player);
                continue;
            }
            boolean bl = bot = ((ItemStack)player.getInventory().armor.get(0)).getItem() != Items.AIR && ((ItemStack)player.getInventory().armor.get(1)).getItem() != Items.AIR && ((ItemStack)player.getInventory().armor.get(2)).getItem() != Items.AIR && ((ItemStack)player.getInventory().armor.get(3)).getItem() != Items.AIR && ((ItemStack)player.getInventory().armor.get(0)).isEnchantable() && ((ItemStack)player.getInventory().armor.get(1)).isEnchantable() && ((ItemStack)player.getInventory().armor.get(2)).isEnchantable() && ((ItemStack)player.getInventory().armor.get(3)).isEnchantable() && player.getOffHandStack().getItem() == Items.AIR && (((ItemStack)player.getInventory().armor.get(0)).getItem() == Items.LEATHER_BOOTS || ((ItemStack)player.getInventory().armor.get(1)).getItem() == Items.LEATHER_LEGGINGS || ((ItemStack)player.getInventory().armor.get(2)).getItem() == Items.LEATHER_CHESTPLATE || ((ItemStack)player.getInventory().armor.get(3)).getItem() == Items.LEATHER_HELMET || ((ItemStack)player.getInventory().armor.get(0)).getItem() == Items.IRON_BOOTS || ((ItemStack)player.getInventory().armor.get(1)).getItem() == Items.IRON_LEGGINGS || ((ItemStack)player.getInventory().armor.get(2)).getItem() == Items.IRON_CHESTPLATE || ((ItemStack)player.getInventory().armor.get(3)).getItem() == Items.IRON_HELMET) && player.getMainHandStack().getItem() != Items.AIR && !((ItemStack)player.getInventory().armor.get(0)).isDamaged() && !((ItemStack)player.getInventory().armor.get(1)).isDamaged() && !((ItemStack)player.getInventory().armor.get(2)).isDamaged() && !((ItemStack)player.getInventory().armor.get(3)).isDamaged() && player.getHungerManager().getFoodLevel() == 20;
            if (bot) {
                if (isBot.contains(player)) continue;
                isBot.add((Entity)player);
                continue;
            }
            isBot.remove(player);
        }
    }

    private void updateOfflineUuidBots() {
        for (PlayerEntity player : AntiBot.mc.world.getPlayers()) {
            boolean bot;
            if (player == AntiBot.mc.player) continue;
            if (this.isFriend(player)) {
                isBot.remove(player);
                continue;
            }
            boolean bl = bot = !player.getUuid().equals(Uuids.getOfflinePlayerUuid((String)player.getName().getString()));
            if (bot) {
                if (isBot.contains(player)) continue;
                isBot.add((Entity)player);
                continue;
            }
            isBot.remove(player);
        }
    }

    private boolean isFriend(PlayerEntity player) {
        return Wonderful.INSTANCE.friendStorage != null && Wonderful.INSTANCE.friendStorage.isFriend(player.getName().getString());
    }

    public static boolean checkBot(LivingEntity entity) {
        if (INSTANCE == null || !INSTANCE.isEnable()) {
            return false;
        }
        return entity instanceof PlayerEntity && isBot.contains(entity);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        isBot.clear();
    }
}