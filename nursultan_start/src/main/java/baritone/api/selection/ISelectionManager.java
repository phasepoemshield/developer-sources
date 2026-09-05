/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package baritone.api.selection;

import baritone.api.selection.ISelection;
import baritone.api.utils.BetterBlockPos;
import minecraft.class07211;

public interface ISelectionManager {
    public ISelection expand(ISelection var1, class07211 var2, int var3);

    public ISelection shift(ISelection var1, class07211 var2, int var3);

    public ISelection contract(ISelection var1, class07211 var2, int var3);

    public ISelection[] getSelections();

    public ISelection addSelection(ISelection var1);

    public ISelection addSelection(BetterBlockPos var1, BetterBlockPos var2);

    public ISelection removeSelection(ISelection var1);

    public ISelection getOnlySelection();

    public ISelection getLastSelection();

    public ISelection[] removeAllSelections();
}

