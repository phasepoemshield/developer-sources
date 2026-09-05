/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class07211
 */
package baritone.api.selection;

import baritone.api.utils.BetterBlockPos;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class07211;

public interface ISelection {
    public BetterBlockPos pos1();

    public BetterBlockPos pos2();

    public class00753 size();

    public BetterBlockPos min();

    public BetterBlockPos max();

    public ISelection expand(class07211 var1, int var2);

    public ISelection shift(class07211 var1, int var2);

    public class00734 aabb();

    public ISelection contract(class07211 var1, int var2);
}

