/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class07209
 */
package baritone.api.cache;

import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypoint$Tag;
import baritone.api.utils.BetterBlockPos;
import java.util.Date;
import minecraft.class07209;

public class Waypoint
implements IWaypoint {
    private final String name;
    private final IWaypoint$Tag tag;
    private final long creationTimestamp;
    private final BetterBlockPos location;

    public Waypoint(String string, IWaypoint$Tag iWaypoint$Tag, BetterBlockPos betterBlockPos) {
        this(string, iWaypoint$Tag, betterBlockPos, System.currentTimeMillis());
    }

    public Waypoint(String string, IWaypoint$Tag iWaypoint$Tag, BetterBlockPos betterBlockPos, long l) {
        this.name = string;
        this.tag = iWaypoint$Tag;
        this.location = betterBlockPos;
        this.creationTimestamp = l;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof IWaypoint)) {
            return false;
        }
        IWaypoint iWaypoint = (IWaypoint)object;
        return this.name.equals(iWaypoint.getName()) && this.tag == iWaypoint.getTag() && this.location.equals((Object)iWaypoint.getLocation());
    }

    public String toString() {
        return String.format("%s %s %s", this.name, BetterBlockPos.from((class07209)this.location).toString(), new Date(this.creationTimestamp).toString());
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.tag.hashCode() ^ this.location.hashCode() ^ Long.hashCode(this.creationTimestamp);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BetterBlockPos getLocation() {
        return this.location;
    }

    @Override
    public IWaypoint$Tag getTag() {
        return this.tag;
    }

    @Override
    public long getCreationTimestamp() {
        return this.creationTimestamp;
    }
}

