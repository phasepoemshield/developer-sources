/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.impl.tree.SectionTreeNode;
import org.quiltmc.config.impl.tree.Trie;
import org.quiltmc.config.impl.tree.Trie$1;
import org.quiltmc.config.impl.values.ValueKeyImpl;

public class Trie$Node
implements Iterable {
    private final Trie$Node parent;
    private final ValueKey key;
    private final Map children;
    private ValueTreeNode value;
    final /* synthetic */ Trie this$0;

    static /* synthetic */ ValueTreeNode access$200(Trie$Node trie$Node) {
        return trie$Node.value;
    }

    static /* synthetic */ Map access$500(Trie$Node trie$Node) {
        return trie$Node.children;
    }

    static /* synthetic */ Trie$Node access$300(Trie$Node trie$Node, String string) {
        return trie$Node.getOrCreateChild(string);
    }

    private Trie$Node(Trie trie, Trie$Node trie$Node, ValueKey valueKey, ValueTreeNode valueTreeNode) {
        LinkedHashMap linkedHashMap;
        ((Trie$Node)((Object)linkedHashMap2)).this$0 = trie;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        v1.children = linkedHashMap2;
        v1.parent = trie$Node;
        v1.key = valueKey;
        v1.value = valueTreeNode;
    }

    private Trie$Node(Trie trie, Trie$Node trie$Node, ValueKey valueKey) {
        this(trie, trie$Node, valueKey, null);
    }

    /* synthetic */ Trie$Node(Trie trie, Trie$Node trie$Node, ValueKey valueKey, ValueTreeNode valueTreeNode, Trie$1 trie$1) {
        this(trie, trie$Node, valueKey, valueTreeNode);
    }

    public ValueTreeNode getValue() {
        return this.value;
    }

    public Iterator iterator() {
        return this.children.values().iterator();
    }

    public ValueKey getKey() {
        return this.key;
    }

    public Trie$Node getParent() {
        return this.parent;
    }

    public void setValue(ValueTreeNode valueTreeNode) {
        if (this.value != null && !(valueTreeNode instanceof SectionTreeNode)) {
            throw new UnsupportedOperationException("Cannot put node '" + valueTreeNode.key() + "': Node already exists");
        }
        this.value = valueTreeNode;
    }

    public boolean hasChildren() {
        return this.children.isEmpty() ^ true;
    }

    private Trie$Node getOrCreateChild(String string) {
        if (this.children.containsKey(string)) {
            return (Trie$Node)this.children.get(string);
        }
        Trie$Node trie$Node = this;
        Trie.access$404(trie$Node.this$0);
        Trie trie = trie$Node.this$0;
        ValueKey valueKey = trie$Node.key;
        if (valueKey == null) {
            ValueKeyImpl valueKeyImpl;
            valueKey = valueKeyImpl;
            valueKeyImpl = new ValueKeyImpl(string, new String[0]);
        } else {
            valueKey = valueKey.child(string);
        }
        Trie$Node trie$Node2 = new Trie$Node(trie, this, valueKey);
        this.children.put(string, trie$Node2);
        return trie$Node2;
    }
}

