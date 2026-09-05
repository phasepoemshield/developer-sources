/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.tree.SectionTreeNode;
import org.quiltmc.config.impl.tree.Trie$Node;

class SectionTreeNode$1
implements Iterator {
    private final Iterator itr;
    final /* synthetic */ SectionTreeNode this$0;

    SectionTreeNode$1(SectionTreeNode sectionTreeNode) {
        this.this$0 = sectionTreeNode;
        this.itr = SectionTreeNode.access$000(sectionTreeNode).iterator();
    }

    @Override
    public boolean hasNext() {
        return this.itr.hasNext();
    }

    public ValueTreeNode next() {
        return ((Trie$Node)this.itr.next()).getValue();
    }
}

