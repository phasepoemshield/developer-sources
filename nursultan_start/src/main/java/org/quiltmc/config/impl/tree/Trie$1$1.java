/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.tree.Trie$1;
import org.quiltmc.config.impl.tree.Trie$Node;

class Trie$1$1
implements Iterator {
    private final Iterator itr;
    final /* synthetic */ Trie$1 this$1;

    Trie$1$1(Trie$1 trie$1) {
        this.this$1 = trie$1;
        this.itr = Trie.access$100(trie$1.this$0).iterator();
    }

    @Override
    public boolean hasNext() {
        return this.itr.hasNext();
    }

    public ValueTreeNode next() {
        return ((Trie$Node)this.itr.next()).getValue();
    }
}

