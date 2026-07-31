package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public final class TpLoot
extends Module {
    public static TpLoot INSTANCE = new TpLoot();
    private final FloatSetting range = new FloatSetting("Дистанция", 10.0f, 3.0f, 50.0f, 1.0f);
    private final FloatSetting lootDelay = new FloatSetting("Задержка лута", 500.0f, 100.0f, 5000.0f, 50.0f);
    private final ModeSetting afterLoot = new ModeSetting("После лута", "Возвращаться", "Возвращаться", "Тепаться на спавн");
    private final FloatSetting actionDelay = new FloatSetting("Задержка действия", 1000.0f, 200.0f, 10000.0f, 100.0f);
    private final TimerUtils lootTimer = new TimerUtils();
    private final TimerUtils actionTimer = new TimerUtils();
    private Vec3d originalPos = null;
    private boolean waitingAction = false;
    private static final List<Item> TARGET_ITEMS = List.of(Items.NETHERITE_SWORD, Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS, Items.PLAYER_HEAD, Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE, Items.END_CRYSTAL, Items.TOTEM_OF_UNDYING, Items.ELYTRA);

    public TpLoot() {
        super("TPLoot", "Телепортирует к ресурсам", Module.ModuleCategory.MISC);
        this.addSettings(this.range, this.lootDelay, this.afterLoot, this.actionDelay);
    }

    @EventLink
    public void onTick(EventUpdate e2) {
        if (TpLoot.mc.player == null || TpLoot.mc.world == null) {
            return;
        }
        if (this.waitingAction) {
            if (this.actionTimer.finished((long)this.actionDelay.getValue().floatValue())) {
                if (this.afterLoot.is("Возвращаться") && this.originalPos != null) {
                    this.teleportTo(this.originalPos);
                    ChatUtils.sendMessage("TpLoot: возврат на исходную позицию");
                }
                if (this.afterLoot.is("Тепаться на спавн")) {
                    TpLoot.mc.player.networkHandler.sendChatCommand("spawn");
                    ChatUtils.sendMessage("TpLoot: выполнен /spawn");
                }
                this.waitingAction = false;
                this.originalPos = null;
                this.lootTimer.reset();
            }
            return;
        }
        if (!this.lootTimer.finished((long)this.lootDelay.getValue().floatValue())) {
            return;
        }
        ItemEntity targetItem = this.findTargetItem();
        if (targetItem == null) {
            return;
        }
        this.originalPos = TpLoot.mc.player.getPos();
        Vec3d itemPos = targetItem.getPos();
        this.teleportTo(itemPos);
        ItemStack stack = targetItem.getStack();
        ChatUtils.sendMessage("TpLoot: подобран " + stack.getName().getString());
        this.lootTimer.reset();
        this.waitingAction = true;
        this.actionTimer.reset();
    }

    private ItemEntity findTargetItem() {
        double maxRange = this.range.getValue().doubleValue();
        ItemEntity closest = null;
        double closestDist = Double.MAX_VALUE;
        for (Entity entity : TpLoot.mc.world.getEntities()) {
            double dist;
            ItemEntity itemEntity;
            ItemStack stack;
            if (!(entity instanceof ItemEntity) || !this.isTargetItem((stack = (itemEntity = (ItemEntity)entity).getStack()).getItem()) || (dist = TpLoot.mc.player.squaredDistanceTo(entity)) > maxRange * maxRange || !(dist < closestDist)) continue;
            closestDist = dist;
            closest = itemEntity;
        }
        return closest;
    }

    private boolean isTargetItem(Item item) {
        return TARGET_ITEMS.contains(item);
    }

    private void teleportTo(Vec3d pos) {
        int packets = (int)Math.ceil(TpLoot.mc.player.getPos().distanceTo(pos) / 10.0);
        packets = Math.max(packets, 3);
        for (int i2 = 0; i2 < packets; ++i2) {
            TpLoot.mc.player.networkHandler.sendPacket((Packet)new PlayerMoveC2SPacket.OnGroundOnly(TpLoot.mc.player.isOnGround(), TpLoot.mc.player.horizontalCollision));
        }
        TpLoot.mc.player.networkHandler.sendPacket((Packet)new PlayerMoveC2SPacket.PositionAndOnGround(pos.x, pos.y, pos.z, false, TpLoot.mc.player.horizontalCollision));
        TpLoot.mc.player.setPosition(pos.x, pos.y, pos.z);
    }

    @Override
    public void onEnable() {
        this.originalPos = null;
        this.waitingAction = false;
        this.lootTimer.reset();
        this.actionTimer.reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.originalPos = null;
        this.waitingAction = false;
        super.onDisable();
    }
}