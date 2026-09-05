/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05034
 *  minecraft.class08392
 */
package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import minecraft.class05034;
import minecraft.class08392;

public class ModSearch {
    public static List<Mod> search(ModsScreen modsScreen, String string, List<Mod> list) {
        if (!ModSearch.validSearchQuery(string)) {
            return list;
        }
        return list.stream().map(mod -> new class05034(mod, (Object)ModSearch.passesFilters(modsScreen, mod, string.toLowerCase(Locale.ROOT)))).filter(class050342 -> (Integer)class050342.y() > 0).sorted((class050342, class050343) -> (Integer)class050343.y() - (Integer)class050342.y()).map(class05034::N).collect(Collectors.toList());
    }

    private static int passesFilters(ModsScreen modsScreen, Mod mod, String string) {
        String string2 = mod.getId();
        String string3 = mod.getName();
        String string4 = mod.getTranslatedName();
        String string5 = mod.getDescription();
        String string6 = mod.getSummary();
        String string7 = class08392.N((String)"modmenu.searchTerms.library", (Object[])new Object[0]);
        String string8 = class08392.N((String)"modmenu.searchTerms.patchwork", (Object[])new Object[0]);
        String string9 = class08392.N((String)"modmenu.searchTerms.modpack", (Object[])new Object[0]);
        String string10 = class08392.N((String)"modmenu.searchTerms.deprecated", (Object[])new Object[0]);
        String string11 = class08392.N((String)"modmenu.searchTerms.clientside", (Object[])new Object[0]);
        String string12 = class08392.N((String)"modmenu.searchTerms.configurable", (Object[])new Object[0]);
        String string13 = class08392.N((String)"modmenu.searchTerms.hasUpdate", (Object[])new Object[0]);
        if (mod.isHidden() || !ModMenuConfig.SHOW_LIBRARIES.getValue() && mod.getBadges().contains((Object)Mod$Badge.LIBRARY)) {
            return 0;
        }
        if (string3.toLowerCase(Locale.ROOT).contains(string) || string4.toLowerCase(Locale.ROOT).contains(string) || string2.toLowerCase(Locale.ROOT).contains(string)) {
            return string.length() >= 3 ? 2 : 1;
        }
        if (string5.toLowerCase(Locale.ROOT).contains(string) || string6.toLowerCase(Locale.ROOT).contains(string) || ModSearch.authorMatches(mod, string) || string7.contains(string) && mod.getBadges().contains((Object)Mod$Badge.LIBRARY) || string8.contains(string) && mod.getBadges().contains((Object)Mod$Badge.PATCHWORK_FORGE) || string9.contains(string) && mod.getBadges().contains((Object)Mod$Badge.MODPACK) || string10.contains(string) && mod.getBadges().contains((Object)Mod$Badge.DEPRECATED) || string11.contains(string) && mod.getBadges().contains((Object)Mod$Badge.CLIENT) || string12.contains(string) && modsScreen.getModHasConfigScreen(string2) || string13.contains(string) && mod.hasUpdate()) {
            return 1;
        }
        if (ModMenu.PARENT_MAP.keySet().contains(mod)) {
            for (Mod mod2 : ModMenu.PARENT_MAP.get((Object)mod)) {
                int n = ModSearch.passesFilters(modsScreen, mod2, string);
                if (n <= 0) continue;
                return n;
            }
        }
        return 0;
    }

    private static boolean authorMatches(Mod mod, String string3) {
        return mod.getAuthors().stream().map(string -> string.toLowerCase(Locale.ROOT)).anyMatch(string2 -> string2.contains(string3.toLowerCase(Locale.ROOT)));
    }

    public static boolean validSearchQuery(String string) {
        return string != null && !string.isEmpty();
    }
}

