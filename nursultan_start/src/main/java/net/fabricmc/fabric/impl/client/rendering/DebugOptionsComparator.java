/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.Comparator;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class DebugOptionsComparator
implements Comparator<class01894> {
    public static final DebugOptionsComparator INSTANCE = new DebugOptionsComparator();

    @Override
    public int compare(class01894 class018942, class01894 class018943) {
        boolean bl = "minecraft".equals(class018942.y());
        boolean bl2 = "minecraft".equals(class018943.y());
        if (bl && !bl2) {
            return -1;
        }
        if (!bl && bl2) {
            return 1;
        }
        int n = class018942.y().compareTo(class018943.y());
        if (n != 0) {
            return n;
        }
        return class018942.N().compareTo(class018943.N());
    }
}

