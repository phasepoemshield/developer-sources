/*
 * Decompiled with CFR 0.152.
 */
package baritone.pathing.calc.openset;

import baritone.pathing.calc.PathNode;
import baritone.pathing.calc.openset.IOpenSet;
import baritone.pathing.calc.openset.LinkedListOpenSet$Node;

class LinkedListOpenSet
implements IOpenSet {
    private LinkedListOpenSet$Node first = null;

    LinkedListOpenSet() {
    }

    @Override
    public void update(PathNode pathNode) {
    }

    @Override
    public void insert(PathNode pathNode) {
        LinkedListOpenSet$Node linkedListOpenSet$Node = new LinkedListOpenSet$Node();
        linkedListOpenSet$Node.val = pathNode;
        linkedListOpenSet$Node.nextOpen = this.first;
        this.first = linkedListOpenSet$Node;
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public PathNode removeLowest() {
        if (this.first == null) {
            return null;
        }
        LinkedListOpenSet$Node linkedListOpenSet$Node = this.first.nextOpen;
        if (linkedListOpenSet$Node == null) {
            LinkedListOpenSet$Node linkedListOpenSet$Node2 = this.first;
            this.first = null;
            return linkedListOpenSet$Node2.val;
        }
        LinkedListOpenSet$Node linkedListOpenSet$Node3 = this.first;
        double d = this.first.val.combinedCost;
        LinkedListOpenSet$Node linkedListOpenSet$Node4 = this.first;
        LinkedListOpenSet$Node linkedListOpenSet$Node5 = null;
        while (linkedListOpenSet$Node != null) {
            double d2 = linkedListOpenSet$Node.val.combinedCost;
            if (d2 < d) {
                d = d2;
                linkedListOpenSet$Node4 = linkedListOpenSet$Node;
                linkedListOpenSet$Node5 = linkedListOpenSet$Node3;
            }
            linkedListOpenSet$Node3 = linkedListOpenSet$Node;
            linkedListOpenSet$Node = linkedListOpenSet$Node.nextOpen;
        }
        if (linkedListOpenSet$Node5 == null) {
            this.first = this.first.nextOpen;
            linkedListOpenSet$Node4.nextOpen = null;
            return linkedListOpenSet$Node4.val;
        }
        linkedListOpenSet$Node5.nextOpen = linkedListOpenSet$Node4.nextOpen;
        linkedListOpenSet$Node4.nextOpen = null;
        return linkedListOpenSet$Node4.val;
    }
}

