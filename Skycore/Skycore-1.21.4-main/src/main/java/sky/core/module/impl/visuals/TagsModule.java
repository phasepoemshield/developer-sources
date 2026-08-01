package sky.core.module.impl.visuals;

import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.module.setting.BooleanSetting;
import sky.core.module.setting.MultiBooleanSetting;

public final class TagsModule extends Module {
    public static final TagsModule INSTANCE = new TagsModule();

    public final MultiBooleanSetting show;
    public final BooleanSetting hideOriginal;

    private TagsModule() {
        super("Tags", "Displays entity name tags", Category.VISUALS);

        BooleanSetting items = new BooleanSetting("Items", true);
        BooleanSetting displayName = new BooleanSetting("Display name", false, () -> items.get());

        this.show = new MultiBooleanSetting(
                "Show",
                new BooleanSetting("Players", true),
                new BooleanSetting("Monsters", false),
                new BooleanSetting("Animals", false),
                new BooleanSetting("Self", false),
                new BooleanSetting("Villagers", false),
                new BooleanSetting("Naked", false),
                items,
                displayName,
                new BooleanSetting("Potions", false),
                new BooleanSetting("Armor", false),
                new BooleanSetting("Enchants", false)
        );
        this.hideOriginal = new BooleanSetting("Hide original", false);
        this.addSettings(this.show, this.hideOriginal);
    }
}
