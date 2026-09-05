/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  minecraft.class01036
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import minecraft.class01036;

public class class01780 {
    public static String N(StringReader stringReader, class01036 class010362) {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && class010362.test(stringReader.peek())) {
            stringReader.skip();
        }
        return stringReader.getString().substring(n, stringReader.getCursor());
    }
}

