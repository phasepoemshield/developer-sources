/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.BitSet;

public class class05495 {
    private final BitSet N = new BitSet();

    public void y(int n, int n2) {
        this.N.clear(n, n + n2);
    }

    public void N(int n, int n2) {
        this.N.set(n, n + n2);
    }

    public int N(int n) {
        int n2 = 0;
        while (true) {
            int n3;
            int n4;
            if ((n4 = this.N.nextSetBit(n3 = this.N.nextClearBit(n2))) == -1 || n4 - n3 >= n) {
                this.N(n3, n);
                return n3;
            }
            n2 = n4;
        }
    }

    public IntSet N() {
        return (IntSet)this.N.stream().collect(IntArraySet::new, IntCollection::add, IntCollection::addAll);
    }
}

