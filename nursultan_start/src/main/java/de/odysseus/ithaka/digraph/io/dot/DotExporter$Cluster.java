/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.io.dot;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.io.dot.DotAttribute;

class DotExporter$Cluster<V, G extends Digraph<V>> {
    final String id;
    final G subgraph;
    final V sample;
    final DotAttribute tail;
    final DotAttribute head;

    public DotExporter$Cluster(String string, G g) {
        this.id = string;
        this.subgraph = g;
        this.sample = g.vertices().iterator().next();
        this.head = new DotAttribute("lhead", string);
        this.tail = new DotAttribute("ltail", string);
    }
}

