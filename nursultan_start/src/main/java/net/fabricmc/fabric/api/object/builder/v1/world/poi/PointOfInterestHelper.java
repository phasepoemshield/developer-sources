/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03927
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05369
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.object.builder.v1.world.poi;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03927;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05369;
import minecraft.class05946;

public final class PointOfInterestHelper {
    private PointOfInterestHelper() {
    }

    private static class05369 register(class01894 class018942, int n, int n2, Set<class00500> set) {
        return class03927.N((class00751)class04206.w, (class05946)class05946.N((class05946)class04227.NZ, (class01894)class018942), set, (int)n, (int)n2);
    }

    public static class05369 register(class01894 class018942, int n, int n2, Iterable<class00500> iterable) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        return PointOfInterestHelper.register(class018942, n, n2, (Set<class00500>)builder.addAll(iterable).build());
    }

    public static class05369 register(class01894 class018942, int n, int n2, class00891 ... class00891Array) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        for (class00891 class008912 : class00891Array) {
            builder.addAll((Iterable)class008912.E().N());
        }
        return PointOfInterestHelper.register(class018942, n, n2, (Set<class00500>)builder.build());
    }
}

