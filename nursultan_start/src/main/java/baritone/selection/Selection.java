/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.selection.ISelection
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class07211
 */
package baritone.selection;

import baritone.api.selection.ISelection;
import baritone.api.utils.BetterBlockPos;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class07211;

public class Selection
implements ISelection {
    private final BetterBlockPos pos1;
    private final BetterBlockPos pos2;
    private final BetterBlockPos min;
    private final BetterBlockPos max;
    private final class00753 size;
    private final class00734 aabb;

    public BetterBlockPos pos1() {
        return this.pos1;
    }

    public BetterBlockPos pos2() {
        return this.pos2;
    }

    public Selection(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        this.pos1 = betterBlockPos;
        this.pos2 = betterBlockPos2;
        this.min = new BetterBlockPos(Math.min(betterBlockPos.x, betterBlockPos2.x), Math.min(betterBlockPos.y, betterBlockPos2.y), Math.min(betterBlockPos.z, betterBlockPos2.z));
        this.max = new BetterBlockPos(Math.max(betterBlockPos.x, betterBlockPos2.x), Math.max(betterBlockPos.y, betterBlockPos2.y), Math.max(betterBlockPos.z, betterBlockPos2.z));
        this.size = new class00753(this.max.x - this.min.x + 1, this.max.y - this.min.y + 1, this.max.z - this.min.z + 1);
        this.aabb = new class00734((double)this.min.x, (double)this.min.y, (double)this.min.z, (double)(this.max.x + 1), (double)(this.max.y + 1), (double)(this.max.z + 1));
    }

    public class00753 size() {
        return this.size;
    }

    public String toString() {
        return String.format("Selection{pos1=%s,pos2=%s}", this.pos1, this.pos2);
    }

    public int hashCode() {
        return this.pos1.hashCode() ^ this.pos2.hashCode();
    }

    public BetterBlockPos min() {
        return this.min;
    }

    public BetterBlockPos max() {
        return this.max;
    }

    public ISelection expand(class07211 class072112, int n) {
        if (this.isPos2(class072112)) {
            return new Selection(this.pos1, this.pos2.relative(class072112, n));
        }
        return new Selection(this.pos1.relative(class072112, n), this.pos2);
    }

    public ISelection shift(class07211 class072112, int n) {
        return new Selection(this.pos1.relative(class072112, n), this.pos2.relative(class072112, n));
    }

    public class00734 aabb() {
        return this.aabb;
    }

    public ISelection contract(class07211 class072112, int n) {
        if (this.isPos2(class072112)) {
            return new Selection(this.pos1.relative(class072112, n), this.pos2);
        }
        return new Selection(this.pos1, this.pos2.relative(class072112, n));
    }

    private boolean isPos2(class07211 class072112) {
        boolean bl = class072112.i().N() < 0;
        switch (class072112.z()) {
            case field_11048: {
                return this.pos2.x > this.pos1.x ^ bl;
            }
            case field_11052: {
                return this.pos2.y > this.pos1.y ^ bl;
            }
            case field_11051: {
                return this.pos2.z > this.pos1.z ^ bl;
            }
        }
        throw new IllegalStateException("Bad Direction.Axis");
    }
}

