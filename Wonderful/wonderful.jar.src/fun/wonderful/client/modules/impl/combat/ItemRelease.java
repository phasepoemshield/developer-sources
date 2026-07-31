package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import ru.ocz.protection.annotation.Compile;

public class ItemRelease
extends Module {
    public static ItemRelease INSTANCE = new ItemRelease();
    private final ListSetting items = new ListSetting("Предметы", new BooleanSetting("Лук", true), new BooleanSetting("Трезубец", false), new BooleanSetting("Арбалет", true));
    private final FloatSetting tickBow = new FloatSetting("Задержка выстрела", 2.5f, 2.0f, 5.0f, 0.05f).visible(() -> this.items.is("Лук"));

    public ItemRelease() {
        super("ItemRelease", "Автоматически выпускает предмет когда он полностью натянут", Module.ModuleCategory.COMBAT);
        this.addSettings(this.items, this.tickBow);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);
}