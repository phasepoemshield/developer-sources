/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class06889
 */
package baritone.process.elytra;

import baritone.api.utils.BetterBlockPos;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import minecraft.class06889;

public final class NetherPath
extends AbstractList<BetterBlockPos> {
    private static final NetherPath EMPTY_PATH = new NetherPath(Collections.emptyList());
    private final List<BetterBlockPos> backing;

    NetherPath(List<BetterBlockPos> list) {
        this.backing = list;
    }

    @Override
    public int size() {
        return this.backing.size();
    }

    @Override
    public BetterBlockPos get(int n) {
        return this.backing.get(n);
    }

    public BetterBlockPos getLast() {
        return this.isEmpty() ? null : this.backing.get(this.backing.size() - 1);
    }

    public static NetherPath emptyPath() {
        return EMPTY_PATH;
    }

    public class06889 getVec(int n) {
        BetterBlockPos betterBlockPos = this.get(n);
        return new class06889((double)betterBlockPos.x, (double)betterBlockPos.y, (double)betterBlockPos.z);
    }
}

