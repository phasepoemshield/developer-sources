/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.ArrayList;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Keys$Key;

class Keys {
    private Keys() {
    }

    static Keys$Key[] split(String string) {
        ArrayList<Keys$Key> arrayList = new ArrayList<Keys$Key>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        boolean bl2 = true;
        boolean bl3 = false;
        int n = -1;
        for (int i = string.length() - 1; i > -1; --i) {
            char c = string.charAt(i);
            if (c == ']' && bl2) {
                bl3 = true;
                continue;
            }
            bl2 = false;
            if (c == '[' && bl3) {
                bl3 = false;
                n = Integer.parseInt(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                continue;
            }
            if (Keys.isQuote(c) && (i == 0 || string.charAt(i - 1) != '\\')) {
                bl = !bl;
                bl2 = false;
            }
            if (c != '.' || bl) {
                stringBuilder.insert(0, c);
                continue;
            }
            arrayList.add(0, new Keys$Key(stringBuilder.toString(), n, !arrayList.isEmpty() ? (Keys$Key)arrayList.get(0) : null));
            bl2 = true;
            n = -1;
            stringBuilder = new StringBuilder();
        }
        arrayList.add(0, new Keys$Key(stringBuilder.toString(), n, !arrayList.isEmpty() ? (Keys$Key)arrayList.get(0) : null));
        return arrayList.toArray(new Keys$Key[0]);
    }

    static boolean isQuote(char c) {
        return c == '\"' || c == '\'';
    }
}

