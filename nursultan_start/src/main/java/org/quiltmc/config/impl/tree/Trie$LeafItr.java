/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.tree;

import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.tree.Trie$1;
import org.quiltmc.config.impl.tree.Trie$Node;

class Trie$LeafItr
implements Iterator {
    private final int modCount;
    private final Deque iterators;
    final /* synthetic */ Trie this$0;

    private Trie$LeafItr(Trie trie) {
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2;
        this.this$0 = trie;
        this.modCount = Trie.access$400(trie);
        ArrayDeque arrayDeque3 = arrayDeque2 = arrayDeque;
        arrayDeque3();
        this.iterators = arrayDeque3;
        arrayDeque.addFirst(Trie$Node.access$500(Trie.access$100(trie)).values().iterator());
    }

    /* synthetic */ Trie$LeafItr(Trie trie, Trie$1 trie$1) {
        this(trie);
    }

    @Override
    public boolean hasNext() {
        this.checkForComodification();
        while (!this.iterators.isEmpty() && !((Iterator)this.iterators.peek()).hasNext()) {
            this.iterators.pop();
        }
        return this.iterators.isEmpty() ^ true;
    }

    public ValueTreeNode next() {
        if (this.hasNext()) {
            Trie$LeafItr trie$LeafItr = this;
            trie$LeafItr.checkForComodification();
            Iterator iterator = (Iterator)trie$LeafItr.iterators.removeFirst();
            Trie$Node trie$Node = (Trie$Node)iterator.next();
            if (iterator.hasNext()) {
                this.iterators.addFirst(iterator);
            }
            while (trie$Node.hasChildren()) {
                iterator = Trie$Node.access$500(trie$Node).values().iterator();
                trie$Node = (Trie$Node)iterator.next();
                this.iterators.addFirst(iterator);
            }
            this.checkForComodification();
            return trie$Node.getValue();
        }
        throw new NoSuchElementException();
    }

    private void checkForComodification() {
        if (this.modCount == Trie.access$400(this.this$0)) {
            return;
        }
        throw new ConcurrentModificationException();
    }
}

