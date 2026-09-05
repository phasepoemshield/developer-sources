/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.selection.ISelection
 *  baritone.api.selection.ISelectionManager
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class07211
 */
package baritone.selection;

import baritone.Baritone;
import baritone.api.selection.ISelection;
import baritone.api.selection.ISelectionManager;
import baritone.api.utils.BetterBlockPos;
import baritone.selection.Selection;
import baritone.selection.SelectionRenderer;
import java.util.LinkedList;
import java.util.ListIterator;
import minecraft.class07211;

public class SelectionManager
implements ISelectionManager {
    private final LinkedList<ISelection> selections = new LinkedList();
    private ISelection[] selectionsArr = new ISelection[0];

    public SelectionManager(Baritone baritone) {
        new SelectionRenderer(baritone, this);
    }

    public synchronized ISelection expand(ISelection iSelection, class07211 class072112, int n) {
        ListIterator<ISelection> listIterator = this.selections.listIterator();
        while (listIterator.hasNext()) {
            ISelection iSelection2 = (ISelection)listIterator.next();
            if (iSelection2 != iSelection) continue;
            listIterator.remove();
            listIterator.add(iSelection2.expand(class072112, n));
            this.resetSelectionsArr();
            return (ISelection)listIterator.previous();
        }
        return null;
    }

    public synchronized ISelection shift(ISelection iSelection, class07211 class072112, int n) {
        ListIterator<ISelection> listIterator = this.selections.listIterator();
        while (listIterator.hasNext()) {
            ISelection iSelection2 = (ISelection)listIterator.next();
            if (iSelection2 != iSelection) continue;
            listIterator.remove();
            listIterator.add(iSelection2.shift(class072112, n));
            this.resetSelectionsArr();
            return (ISelection)listIterator.previous();
        }
        return null;
    }

    public synchronized ISelection contract(ISelection iSelection, class07211 class072112, int n) {
        ListIterator<ISelection> listIterator = this.selections.listIterator();
        while (listIterator.hasNext()) {
            ISelection iSelection2 = (ISelection)listIterator.next();
            if (iSelection2 != iSelection) continue;
            listIterator.remove();
            listIterator.add(iSelection2.contract(class072112, n));
            this.resetSelectionsArr();
            return (ISelection)listIterator.previous();
        }
        return null;
    }

    public ISelection[] getSelections() {
        return this.selectionsArr;
    }

    public synchronized ISelection addSelection(ISelection iSelection) {
        this.selections.add(iSelection);
        this.resetSelectionsArr();
        return iSelection;
    }

    public ISelection addSelection(BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        return this.addSelection(new Selection(betterBlockPos, betterBlockPos2));
    }

    public synchronized ISelection removeSelection(ISelection iSelection) {
        this.selections.remove(iSelection);
        this.resetSelectionsArr();
        return iSelection;
    }

    public synchronized ISelection getOnlySelection() {
        if (this.selections.size() == 1) {
            return this.selections.peekFirst();
        }
        return null;
    }

    public ISelection getLastSelection() {
        return this.selections.peekLast();
    }

    private void resetSelectionsArr() {
        this.selectionsArr = this.selections.toArray(new ISelection[0]);
    }

    public synchronized ISelection[] removeAllSelections() {
        ISelection[] iSelectionArray = this.getSelections();
        this.selections.clear();
        this.resetSelectionsArr();
        return iSelectionArray;
    }
}

