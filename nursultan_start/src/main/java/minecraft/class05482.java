/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01590
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01590;
import minecraft.class05446;
import minecraft.class05478;

public interface class05482 {
    public static final class05482 N = new class05446();

    public int y();

    public static class05482 N(class01590 class015902, class00392 ... class00392Array) {
        return class05482.N(class015902, Integer.MAX_VALUE, Integer.MAX_VALUE, class00392Array);
    }

    public int N();

    public int N(class00937 var1, int var2, int var3, int var4, class00580 var5);

    public static class05482 N(class01590 class015902, int n, int n2, class00392 ... class00392Array) {
        if (class00392Array.length == 0) {
            return N;
        }
        return new class05478(class00392Array, class015902, n, n2);
    }

    public static class05482 N(class01590 class015902, class00392 class003922, int n) {
        return class05482.N(class015902, n, Integer.MAX_VALUE, class003922);
    }

    public static class05482 N(class01590 class015902, int n, class00392 ... class00392Array) {
        return class05482.N(class015902, n, Integer.MAX_VALUE, class00392Array);
    }
}

