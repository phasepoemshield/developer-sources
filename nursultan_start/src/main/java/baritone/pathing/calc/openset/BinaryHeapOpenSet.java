/*
 * Decompiled with CFR 0.152.
 */
package baritone.pathing.calc.openset;

import baritone.pathing.calc.PathNode;
import baritone.pathing.calc.openset.IOpenSet;
import java.util.Arrays;

public final class BinaryHeapOpenSet
implements IOpenSet {
    private static final int INITIAL_CAPACITY = 1024;
    private PathNode[] array;
    private int size = 0;

    public BinaryHeapOpenSet() {
        this(1024);
    }

    public BinaryHeapOpenSet(int n) {
        this.array = new PathNode[n];
    }

    public int size() {
        return this.size;
    }

    @Override
    public final void update(PathNode pathNode) {
        int n = pathNode.heapPosition;
        int n2 = n >>> 1;
        double d = pathNode.combinedCost;
        PathNode pathNode2 = this.array[n2];
        while (n > 1 && pathNode2.combinedCost > d) {
            this.array[n] = pathNode2;
            this.array[n2] = pathNode;
            pathNode.heapPosition = n2;
            pathNode2.heapPosition = n;
            n = n2;
            n2 = n >>> 1;
            pathNode2 = this.array[n2];
        }
    }

    @Override
    public final void insert(PathNode pathNode) {
        if (this.size >= this.array.length - 1) {
            this.array = Arrays.copyOf(this.array, this.array.length << 1);
        }
        ++this.size;
        pathNode.heapPosition = this.size;
        this.array[this.size] = pathNode;
        this.update(pathNode);
    }

    @Override
    public final boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public final PathNode removeLowest() {
        PathNode pathNode;
        if (this.size == 0) {
            throw new IllegalStateException("Cannot remove from empty heap");
        }
        PathNode pathNode2 = this.array[1];
        this.array[1] = pathNode = this.array[this.size];
        pathNode.heapPosition = 1;
        this.array[this.size] = null;
        --this.size;
        pathNode2.heapPosition = -1;
        if (this.size < 2) {
            return pathNode2;
        }
        int n = 1;
        int n2 = 2;
        double d = pathNode.combinedCost;
        do {
            PathNode pathNode3 = this.array[n2];
            double d2 = pathNode3.combinedCost;
            if (n2 < this.size) {
                PathNode pathNode4 = this.array[n2 + 1];
                double d3 = pathNode4.combinedCost;
                if (d2 > d3) {
                    ++n2;
                    d2 = d3;
                    pathNode3 = pathNode4;
                }
            }
            if (d <= d2) break;
            this.array[n] = pathNode3;
            this.array[n2] = pathNode;
            pathNode.heapPosition = n2;
            pathNode3.heapPosition = n;
            n = n2;
        } while ((n2 <<= 1) <= this.size);
        return pathNode2;
    }
}

