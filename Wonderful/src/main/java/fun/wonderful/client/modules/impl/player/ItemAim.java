package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.api.utils.rotate.RotationUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public class ItemAim
extends Module {
    public static ItemAim INSTANCE = new ItemAim();
    public ListSetting element = new ListSetting("Лутать", new BooleanSetting("Шары", true), new BooleanSetting("Элитры", true));

    public ItemAim() {
        super("ItemAim", "Автоматически наводиться на предмет", Module.ModuleCategory.PLAYER);
        this.addSettings(this.element);
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (ItemAim.mc.player == null || ItemAim.mc.world == null) {
            return;
        }
        ItemEntity targetItem = this.findTargetItem();
        if (targetItem == null) {
            return;
        }
        Vec2f rotations = this.getItemRotations(targetItem);
        RotationStorage.update(new Rotation(rotations.x, rotations.y), 360.0f, 360.0f, 360.0f, 360.0f, 0, 1, false);
    }

    private ItemEntity findTargetItem() {
        ItemEntity bestItem = null;
        double bestDistance = Double.MAX_VALUE;
        for (Entity entity : ItemAim.mc.world.getEntities()) {
            double distance;
            ItemEntity itemEntity;
            if (!(entity instanceof ItemEntity) || !this.isWantedItem(itemEntity = (ItemEntity)entity) || !((distance = ItemAim.mc.player.squaredDistanceTo((Entity)itemEntity)) < bestDistance)) continue;
            bestDistance = distance;
            bestItem = itemEntity;
        }
        return bestItem;
    }

    private boolean isWantedItem(ItemEntity itemEntity) {
        return this.element.is("Шары") && itemEntity.getStack().isOf(Items.PLAYER_HEAD) || this.element.is("Элитры") && itemEntity.getStack().isOf(Items.ELYTRA);
    }

    private Vec2f getItemRotations(ItemEntity itemEntity) {
        Vec3d targetPos = itemEntity.getBoundingBox().getCenter();
        return RotationUtils.getRotations(targetPos);
    }
}