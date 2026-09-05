/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.api.cache;

import baritone.api.cache.IWaypoint$Tag;
import baritone.api.utils.BetterBlockPos;

public interface IWaypoint {
    public String getName();

    public BetterBlockPos getLocation();

    public IWaypoint$Tag getTag();

    public long getCreationTimestamp();
}

