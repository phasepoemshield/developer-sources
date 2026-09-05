/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03860
 *  minecraft.class06069
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03860;
import minecraft.class06069;
import minecraft.class06432;
import minecraft.class06436;
import minecraft.class06438;
import minecraft.class06439;
import minecraft.class06440;
import minecraft.class06441;
import minecraft.class06445;
import minecraft.class06452;
import minecraft.class06453;
import minecraft.class06456;
import minecraft.class06458;
import minecraft.class06460;
import minecraft.class06470;
import minecraft.class06471;
import minecraft.class06472;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class06454 {
    private static final int u = 30;
    private static final int i = 10;
    public static final int N = 64;
    static final class06471[] y = new class06471[]{new class06471(class06439.class, 30, 0, true), new class06471(class06445.class, 10, 4), new class06471(class06436.class, 10, 4), new class06471(class06432.class, 10, 3), new class06471(class06453.class, 5, 2), new class06471(class06472.class, 5, 1)};
    static final class06471[] L = new class06471[]{new class06471(class06460.class, 25, 0, true), new class06471(class06441.class, 15, 5), new class06471(class06438.class, 5, 10), new class06471(class06452.class, 5, 10), new class06471(class06440.class, 10, 3, true), new class06471(class06470.class, 7, 2), new class06471(class06458.class, 5, 2)};

    static @Nullable class06456 N(class06471 class064712, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        Class<? extends class06456> var8 = class064712.N;
        class06456 class064562 = null;
        if (var8 == class06439.class) {
            class064562 = class06439.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (var8 == class06445.class) {
            class064562 = class06445.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06436.class) {
            class064562 = class06436.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06432.class) {
            class064562 = class06432.N(class038602, n, n2, n3, n4, class072112);
        } else if (var8 == class06453.class) {
            class064562 = class06453.N(class038602, n, n2, n3, n4, class072112);
        } else if (var8 == class06472.class) {
            class064562 = class06472.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (var8 == class06460.class) {
            class064562 = class06460.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06438.class) {
            class064562 = class06438.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (var8 == class06452.class) {
            class064562 = class06452.N(class038602, class060692, n, n2, n3, class072112, n4);
        } else if (var8 == class06440.class) {
            class064562 = class06440.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06470.class) {
            class064562 = class06470.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06441.class) {
            class064562 = class06441.N(class038602, n, n2, n3, class072112, n4);
        } else if (var8 == class06458.class) {
            class064562 = class06458.N(class038602, n, n2, n3, class072112, n4);
        }
        return class064562;
    }
}

