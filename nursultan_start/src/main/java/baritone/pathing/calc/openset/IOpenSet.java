/*
 * Decompiled with CFR 0.152.
 */
package baritone.pathing.calc.openset;

import baritone.pathing.calc.PathNode;

public interface IOpenSet {
    public void update(PathNode var1);

    public void insert(PathNode var1);

    public boolean isEmpty();

    public PathNode removeLowest();
}

