package fun.wonderful.client.modules.impl.player;

import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import lombok.Generated;

public class NoPush
extends Module {
    public static NoPush INSTANCE = new NoPush();
    private ListSetting collisionList = new ListSetting("Коллизия", new BooleanSetting("Блоки", true), new BooleanSetting("Вода", false), new BooleanSetting("Удочик", true), new BooleanSetting("Игроки", true));

    public NoPush() {
        super("NoPush", "Отключает коллизию", Module.ModuleCategory.MISC);
        this.addSettings(this.collisionList);
    }

    @Generated
    public ListSetting getCollisionList() {
        return this.collisionList;
    }

    @Generated
    public void setCollisionList(ListSetting collisionList) {
        this.collisionList = collisionList;
    }
}