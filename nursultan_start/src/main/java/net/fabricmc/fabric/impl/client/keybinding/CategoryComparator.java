/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06384
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.keybinding;

import java.util.Comparator;
import minecraft.class06384;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class CategoryComparator
implements Comparator<class06384> {
    public static final CategoryComparator INSTANCE = new CategoryComparator();

    @Override
    public int compare(class06384 class063842, class06384 class063843) {
        boolean bl = class063842.y().y().equals("minecraft");
        boolean bl2 = class063843.y().y().equals("minecraft");
        if (bl && bl2) {
            return 0;
        }
        if (bl) {
            return -1;
        }
        if (bl2) {
            return 1;
        }
        int n = class063842.y().y().compareTo(class063843.y().y());
        if (n != 0) {
            return n;
        }
        return class063842.y().N().compareTo(class063843.y().N());
    }
}

