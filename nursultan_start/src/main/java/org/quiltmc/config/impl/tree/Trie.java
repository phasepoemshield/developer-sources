/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.builders.SectionBuilderImpl;
import org.quiltmc.config.impl.tree.SectionTreeNode;
import org.quiltmc.config.impl.tree.Trie$1;
import org.quiltmc.config.impl.tree.Trie$LeafItr;
import org.quiltmc.config.impl.tree.Trie$Node;

public final class Trie {
    private final Trie$Node root;
    private int modCount;

    public Iterable nodes() {
        return new Trie$1(this);
    }

    static /* synthetic */ Trie$Node access$100(Trie trie) {
        return trie.root;
    }

    static /* synthetic */ int access$400(Trie trie) {
        return trie.modCount;
    }

    public Trie() {
        Trie$Node trie$Node;
        Trie$Node trie$Node2 = trie$Node;
        trie$Node = new Trie$Node(this, null, null, null, null);
        this.root = trie$Node2;
    }

    public TrackedValue get(Iterable iterable) {
        return (TrackedValue)this.getNode(iterable);
    }

    public void put(Iterable iterable, SectionBuilderImpl sectionBuilderImpl) {
        Trie trie = this;
        int n = trie.modCount;
        Trie$Node trie$Node = trie.root;
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            trie$Node = Trie$Node.access$300(trie$Node, (String)iterator.next());
        }
        int n2 = n;
        sectionBuilderImpl.build(trie$Node);
        n = this.modCount;
        if (n2 == n) {
            this.modCount = n + 1;
        }
    }

    public ValueTreeNode put(Iterable iterable, ValueTreeNode valueTreeNode) {
        Trie trie = this;
        int n = trie.modCount;
        Trie$Node trie$Node = trie.root;
        for (String string : iterable) {
            if (Trie$Node.access$200(trie$Node) == null) {
                LinkedHashMap linkedHashMap;
                SectionTreeNode sectionTreeNode;
                SectionTreeNode sectionTreeNode2 = sectionTreeNode;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                linkedHashMap = new LinkedHashMap(0);
                sectionTreeNode = new SectionTreeNode(trie$Node, linkedHashMap2);
                trie$Node.setValue(sectionTreeNode2);
            }
            trie$Node = Trie$Node.access$300(trie$Node, string);
        }
        int n2 = n;
        trie$Node.setValue(valueTreeNode);
        n = this.modCount;
        if (n2 == n) {
            this.modCount = n + 1;
        }
        return null;
    }

    public ValueTreeNode getNode(Iterable object) {
        Object object2 = ((Trie)object2).root;
        object = object.iterator();
        while (object.hasNext()) {
            object2 = Trie$Node.access$300((Trie$Node)object2, (String)object.next());
        }
        return ((Trie$Node)object2).getValue();
    }

    static /* synthetic */ int access$404(Trie trie) {
        return ++trie.modCount;
    }

    public Iterable leaves() {
        return () -> new Trie$LeafItr(this, null);
    }
}

