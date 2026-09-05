/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class07209
 */
package baritone.api.cache;

import baritone.api.cache.ICachedRegion;
import java.util.ArrayList;
import minecraft.class00570;
import minecraft.class07209;

public interface ICachedWorld {
    public void save();

    public ICachedRegion getRegion(int var1, int var2);

    public boolean isCached(int var1, int var2);

    public void reloadAllFromDisk();

    public ArrayList<class07209> getLocationsOf(String var1, int var2, int var3, int var4, int var5);

    public void queueForPacking(class00570 var1);
}

