/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.ISchematic
 *  baritone.api.schematic.MaskSchematic
 *  baritone.api.selection.ISelection
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class07211
 */
package baritone.utils.schematic;

import baritone.api.schematic.ISchematic;
import baritone.api.schematic.MaskSchematic;
import baritone.api.selection.ISelection;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class07211;

public class SelectionSchematic
extends MaskSchematic {
    private final ISelection[] selections;

    public SelectionSchematic(ISchematic iSchematic, class00753 class007532, ISelection[] iSelectionArray) {
        super(iSchematic);
        this.selections = (ISelection[])Stream.of(iSelectionArray).map(iSelection -> iSelection.shift(class07211.field_11039, class007532.method_10263()).shift(class07211.field_11033, class007532.method_10264()).shift(class07211.field_11043, class007532.method_10260())).toArray(ISelection[]::new);
    }

    public boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        for (ISelection iSelection : this.selections) {
            if (n < iSelection.min().x || n2 < iSelection.min().y || n3 < iSelection.min().z || n > iSelection.max().x || n2 > iSelection.max().y || n3 > iSelection.max().z) continue;
            return true;
        }
        return false;
    }
}

