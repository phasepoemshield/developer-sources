/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00913
 *  minecraft.class00949
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class05936
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00913;
import minecraft.class00949;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class05936;
import minecraft.class06069;
import minecraft.class07536;

public class class04975 {
    private static final class00949 N = new class00913(class01894.y((String)"alt"));
    private static final class00405 y = class00405.N.N(N);
    private static final class04975 L = new class04975();
    private final class06069 u = class06069.u();
    private final String[] i = new String[]{"the", "elder", "scrolls", "klaatu", "berata", "niktu", "xyzzy", "bless", "curse", "light", "darkness", "fire", "air", "earth", "water", "hot", "dry", "cold", "wet", "ignite", "snuff", "embiggen", "twist", "shorten", "stretch", "fiddle", "destroy", "imbue", "galvanize", "enchant", "free", "limited", "range", "of", "towards", "inside", "sphere", "cube", "self", "other", "ball", "mental", "physical", "grow", "shrink", "demon", "elemental", "spirit", "animal", "creature", "beast", "humanoid", "undead", "fresh", "stale", "phnglui", "mglwnafh", "cthulhu", "rlyeh", "wgahnagl", "fhtagn", "baguette"};

    private class04975() {
    }

    public static class04975 N() {
        return L;
    }

    public void N(long l) {
        this.u.N(l);
    }

    public class05936 N(class01590 class015902, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.u.y(2) + 3;
        for (int i = 0; i < n2; ++i) {
            if (i != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append((String)class07536.N((Object[])this.i, (class06069)this.u));
        }
        return class015902.y().N((class05936)class00392.y((String)stringBuilder.toString()).L(y), n, class00405.N);
    }
}

