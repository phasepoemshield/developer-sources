/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl.tree;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.api.values.ValueTreeNode;
import org.quiltmc.config.api.values.ValueTreeNode$Section;
import org.quiltmc.config.impl.AbstractMetadataContainer;
import org.quiltmc.config.impl.tree.SectionTreeNode$1;
import org.quiltmc.config.impl.tree.Trie$Node;

public final class SectionTreeNode
extends AbstractMetadataContainer
implements ValueTreeNode$Section {
    private final Trie$Node node;

    static /* synthetic */ Trie$Node access$000(SectionTreeNode sectionTreeNode) {
        return sectionTreeNode.node;
    }

    public SectionTreeNode(Trie$Node trie$Node, Map map) {
        super(map);
        this.node = trie$Node;
    }

    public Iterator iterator() {
        return new SectionTreeNode$1(this);
    }

    @Override
    public ValueKey key() {
        return this.node.getKey();
    }

    @Override
    public void propagateInheritedMetadata(Map object) {
        LinkedHashMap linkedHashMap;
        Iterator iterator;
        object = object.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = object.next();
            MetadataType object2 = (MetadataType)entry2.getKey();
            ((AbstractMetadataContainer)((Object)iterator)).metadata.putIfAbsent(object2, entry2.getValue());
        }
        object = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((AbstractMetadataContainer)((Object)iterator)).metadata.entrySet()) {
            if (!((MetadataType)entry.getKey()).isInherited()) continue;
            Map.Entry entry3 = entry;
            MetadataType metadataType = (MetadataType)entry3.getKey();
            object.put(metadataType, entry3.getValue());
        }
        iterator = ((SectionTreeNode)((Object)iterator)).iterator();
        while (iterator.hasNext()) {
            ((ValueTreeNode)iterator.next()).propagateInheritedMetadata((Map)object);
        }
    }
}

