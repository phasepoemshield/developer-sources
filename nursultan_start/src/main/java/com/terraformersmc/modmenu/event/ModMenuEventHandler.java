/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00388
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class02102
 *  minecraft.class04141
 *  minecraft.class04439
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04705
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class06384
 *  minecraft.class06428
 *  minecraft.class06478
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
 *  net.fabricmc.fabric.api.client.screen.v1.Screens
 */
package com.terraformersmc.modmenu.event;

import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig$TitleMenuButtonStyle;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget;
import com.terraformersmc.modmenu.mixin.AccessorClickableWidget;
import com.terraformersmc.modmenu.util.UpdateCheckerUtil;
import java.util.Arrays;
import java.util.List;
import minecraft.class00388;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02102;
import minecraft.class04141;
import minecraft.class04439;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06428;
import minecraft.class06478;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;

public class ModMenuEventHandler {
    public static final class01894 MODS_BUTTON_TEXTURE = class01894.N((String)"modmenu", (String)"textures/gui/mods_button.png");
    private static class06428 MENU_KEY_BIND;

    public static void register() {
        MENU_KEY_BIND = KeyBindingHelper.registerKeyBinding((class06428)new class06428("key.modmenu.open_menu", class04648.field_1668, class04655.yI.y(), class06384.L));
        ClientTickEvents.END_CLIENT_TICK.register(ModMenuEventHandler::onClientEndTick);
        ScreenEvents.AFTER_INIT.register(ModMenuEventHandler::afterScreenInit);
    }

    public static void shiftButtons(class02102 class021022, boolean bl, int n) {
        class06478 class064782;
        if (bl) {
            class021022.method_46419(class021022.method_46427() - n / 2);
        } else if (!(class021022 instanceof class06478) || !(class064782 = (class06478)class021022).method_25369().equals((Object)class00392.L((String)"title.credits"))) {
            class021022.method_46419(class021022.method_46427() + n / 2);
        }
    }

    public static void afterScreenInit(class06202 class062022, class05096 class050962, int n, int n2) {
        if (class050962 instanceof class04705) {
            ModMenuEventHandler.afterTitleScreenInit(class050962);
        }
    }

    public static boolean buttonHasText(class02102 class021022, String ... stringArray) {
        if (class021022 instanceof class05362) {
            class05362 class053622 = (class05362)class021022;
            class00392 class003922 = class053622.method_25369();
            class04439 class044392 = class003922.method_10851();
            return class044392 instanceof class00388 && Arrays.stream(stringArray).anyMatch(string -> ((class00388)class044392).y().equals(string));
        }
        return false;
    }

    public static boolean buttonHasTooltip(class02102 class021022, class04141 class041412) {
        if (class021022 instanceof class05362 && class021022 instanceof AccessorClickableWidget) {
            AccessorClickableWidget accessorClickableWidget = (AccessorClickableWidget)class021022;
            return class041412 == accessorClickableWidget.getTooltip().N();
        }
        return false;
    }

    private static void onClientEndTick(class06202 class062022) {
        while (MENU_KEY_BIND.B()) {
            class062022.N((class05096)new ModsScreen((class05096)class062022.v_3));
        }
    }

    private static void afterTitleScreenInit(class05096 class050962) {
        List list = Screens.getButtons((class05096)class050962);
        if (ModMenuConfig.MODIFY_TITLE_SCREEN.getValue()) {
            int n = -1;
            int n2 = 24;
            int n3 = class050962.field_22790 / 4 + 48;
            for (int i = 0; i < list.size(); ++i) {
                class06478 class064782 = (class06478)list.get(i);
                if (!(class064782 instanceof class05362)) continue;
                class05362 class053623 = (class05362)class064782;
                if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.CLASSIC && class053623.field_22764) {
                    ModMenuEventHandler.shiftButtons((class02102)class053623, n == -1, 24);
                    if (n == -1) {
                        n3 = class053623.method_46427();
                    }
                }
                if (!ModMenuEventHandler.buttonHasText((class02102)class053623, "menu.online")) continue;
                if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.REPLACE_REALMS) {
                    list.set(i, new ModMenuButtonWidget(class053623.method_46426(), class053623.method_46427(), class053623.method_25368(), class053623.method_25364(), ModMenuApi.createModsButtonText(), class050962));
                    continue;
                }
                if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.SHRINK) {
                    class053623.method_25358(98);
                }
                n = i + 1;
                if (!class053623.field_22764) continue;
                n3 = class053623.method_46427();
            }
            if (n != -1) {
                if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.CLASSIC) {
                    list.add(n, new ModMenuButtonWidget(class050962.field_22789 / 2 - 100, n3 + 24, 200, 20, ModMenuApi.createModsButtonText(), class050962));
                } else if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.SHRINK) {
                    list.add(n, new ModMenuButtonWidget(class050962.field_22789 / 2 + 2, n3, 98, 20, ModMenuApi.createModsButtonText(), class050962));
                } else if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig$TitleMenuButtonStyle.ICON) {
                    list.add(n, new UpdateCheckerTexturedButtonWidget(class050962.field_22789 / 2 + 104, n3, 20, 20, 0, 0, 20, MODS_BUTTON_TEXTURE, 32, 64, class053622 -> class06202.Nq().N((class05096)new ModsScreen(class050962)), ModMenuApi.createModsButtonText()));
                }
            }
        }
        UpdateCheckerUtil.triggerV2DeprecatedToast();
    }
}

