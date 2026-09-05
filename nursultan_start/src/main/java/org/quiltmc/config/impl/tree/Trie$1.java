/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.tree.Trie$1$1;

class Trie$1
implements Iterable {
    final /* synthetic */ Trie this$0;

    Trie$1(Trie trie) {
        this.this$0 = trie;
    }

    public Iterator iterator() {
        return new Trie$1$1(this);
    }
}

