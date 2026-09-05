/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.caoimhe.compactchat.util;

import dev.caoimhe.compactchat.config.Configuration;
import minecraft.class00392;

public class TextUtil {
    private TextUtil() {
    }

    public static String stripIgnoredComponents(class00392 class003922) {
        String string = class003922.getString();
        if (Configuration.instance().ignoreFirstCharactersCount > 0) {
            int n2 = Math.min(string.length(), Configuration.instance().ignoreFirstCharactersCount);
            return string.substring(n2);
        }
        return string;
    }
}

