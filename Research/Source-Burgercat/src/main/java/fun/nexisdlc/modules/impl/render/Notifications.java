package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.Category;

@FunctionAdd(name = "Notifications", alias = "Уведомления", category = Category.Render, description = "Уведомления")
public class Notifications extends Function {
    public static final String SETTINGS_SCOPE = "Notifications";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_ITEM_PICKUP = "itemPickup";
    public static final String SETTING_ITEM_PICKUP_SHULKER = "itemPickupShulker";
    public static final String SETTING_ONLY_DON_ITEMS = "onlyDonItems";
    public static final String SETTING_MODULE_ON = "moduleOn";
    public static final String SETTING_MODULE_OFF = "moduleOff";
    public static final String SETTING_SHOW_BANS = "showBans";

    public Notifications() {
    }

    public static Notifications getInstance() {
        return (Notifications) fun.nexisdlc.NexisClient.getFunctionManager().getFunction("Notifications");
    }
}

