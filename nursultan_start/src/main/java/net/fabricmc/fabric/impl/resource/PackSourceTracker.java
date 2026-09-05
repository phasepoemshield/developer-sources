/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01283
 *  minecraft.class01622
 */
package net.fabricmc.fabric.impl.resource;

import java.util.WeakHashMap;
import minecraft.class01283;
import minecraft.class01622;

public final class PackSourceTracker {
    private static final WeakHashMap<class01622, class01283> SOURCES = new WeakHashMap();

    public static void setSource(class01622 class016222, class01283 class012832) {
        SOURCES.put(class016222, class012832);
    }

    public static class01283 getSource(class01622 class016222) {
        return SOURCES.getOrDefault(class016222, class01283.y);
    }
}

