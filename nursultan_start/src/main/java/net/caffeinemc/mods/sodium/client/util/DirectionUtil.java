/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.util;

import java.util.Arrays;
import minecraft.class07211;

public class DirectionUtil {
    public static final class07211[] ALL_DIRECTIONS = class07211.values();
    public static final class07211[] HORIZONTAL_DIRECTIONS = new class07211[]{class07211.field_11043, class07211.field_11035, class07211.field_11039, class07211.field_11034};
    private static final class07211[] OPPOSITE_DIRECTIONS = (class07211[])Arrays.stream(ALL_DIRECTIONS).map(class07211::b).toArray(class07211[]::new);

    public static class07211 getOpposite(class07211 class072112) {
        return OPPOSITE_DIRECTIONS[class072112.ordinal()];
    }
}

