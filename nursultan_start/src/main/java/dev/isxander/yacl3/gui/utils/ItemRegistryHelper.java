/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class00719
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06570
 *  minecraft.class06581
 */
package dev.isxander.yacl3.gui.utils;

import dev.isxander.yacl3.gui.utils.MiscUtil;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00719;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06570;
import minecraft.class06581;

public final class ItemRegistryHelper {
    public static class06581 getItemFromName(String string, class06581 class065812) {
        try {
            class01894 class018942 = YACLPlatform.parseRl((String)string.toLowerCase());
            if (class04206.B.u(class018942)) {
                return (class06581)MiscUtil.getFromRegistry(class04206.B, class018942);
            }
        }
        catch (class00719 class007192) {
            // empty catch block
        }
        return class065812;
    }

    public static class06581 getItemFromName(String string) {
        return ItemRegistryHelper.getItemFromName(string, class06570.N);
    }

    public static Stream<class01894> getMatchingItemIdentifiers(String string) {
        Predicate<class01894> predicate;
        int n = string.indexOf(58);
        if (n == -1) {
            predicate = class018942 -> class018942.N().contains(string) || ((class06581)MiscUtil.getFromRegistry(class04206.B, class018942)).U().getString().toLowerCase().contains(string.toLowerCase());
        } else {
            String string2 = string.substring(0, n);
            String string3 = string.substring(n + 1);
            predicate = class018942 -> class018942.y().equals(string2) && class018942.N().startsWith(string3);
        }
        return class04206.B.M().stream().filter(predicate).sorted((class018942, class018943) -> {
            String string2 = (n == -1 ? string : string.substring(n + 1)).toLowerCase();
            boolean bl = class018942.N().toLowerCase().startsWith(string2);
            boolean bl2 = class018943.N().toLowerCase().startsWith(string2);
            if (bl) {
                if (bl2) {
                    return class018942.N(class018943);
                }
                return -1;
            }
            if (bl2) {
                return 1;
            }
            return class018942.N(class018943);
        });
    }

    public static boolean isRegisteredItem(String string) {
        try {
            class01894 class018942 = YACLPlatform.parseRl((String)string.toLowerCase());
            return class04206.B.u(class018942);
        }
        catch (class00719 class007192) {
            return false;
        }
    }
}

