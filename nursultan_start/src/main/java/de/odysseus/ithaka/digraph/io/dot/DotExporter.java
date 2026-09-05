/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.io.dot;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.DigraphProvider;
import de.odysseus.ithaka.digraph.io.dot.DotAttribute;
import de.odysseus.ithaka.digraph.io.dot.DotExporter$Cluster;
import de.odysseus.ithaka.digraph.io.dot.DotProvider;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DotExporter {
    private final String indent;
    private final String lineSpeparator;

    public DotExporter() {
        this("  ", System.lineSeparator());
    }

    public DotExporter(String string, String string2) {
        this.indent = string;
        this.lineSpeparator = string2;
    }

    private void indent(Writer writer, int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            writer.write(this.indent);
        }
    }

    public <V, G extends Digraph<V>> void export(DotProvider<V, G> dotProvider, G g, DigraphProvider<V, G> digraphProvider, Writer writer) throws IOException {
        writer.write("de.odysseus.ithaka.digraph G {");
        writer.write(this.lineSpeparator);
        Map<V, DotExporter$Cluster<V, G>> map = this.createClusters(g, dotProvider, digraphProvider);
        if (!map.isEmpty()) {
            this.indent(writer, 1);
            writer.write("compound=true;");
            writer.write(this.lineSpeparator);
        }
        this.writeDefaultAttributes(writer, 1, "graph", dotProvider.getDefaultGraphAttributes(g));
        this.writeDefaultAttributes(writer, 1, "node", dotProvider.getDefaultNodeAttributes(g));
        this.writeDefaultAttributes(writer, 1, "edge", dotProvider.getDefaultEdgeAttributes(g));
        this.writeNodesAndEdges(writer, 1, dotProvider, g, map, digraphProvider);
        writer.write("}");
        writer.write(this.lineSpeparator);
        writer.flush();
    }

    private void writeDefaultAttributes(Writer writer, int n, String string, Iterable<DotAttribute> iterable) throws IOException {
        if (iterable != null) {
            this.indent(writer, n);
            Iterator<DotAttribute> iterator = iterable.iterator();
            if (iterator.hasNext()) {
                writer.write(string);
                this.writeAttributes(writer, iterator);
            }
            writer.write(";");
            writer.write(this.lineSpeparator);
        }
    }

    private <V, G extends Digraph<V>> void writeCluster(Writer writer, int n, DotProvider<V, G> dotProvider, V v, DotExporter$Cluster<V, G> dotExporter$Cluster, DigraphProvider<V, G> digraphProvider) throws IOException {
        this.indent(writer, n);
        writer.write("subgraph ");
        writer.write(dotExporter$Cluster.id);
        writer.write(" {");
        writer.write(this.lineSpeparator);
        this.writeDefaultAttributes(writer, n + 1, "graph", dotProvider.getSubgraphAttributes(dotExporter$Cluster.subgraph, v));
        Map map = this.createClusters(dotExporter$Cluster.subgraph, dotProvider, (DigraphProvider<? super V, G>)digraphProvider);
        this.writeNodesAndEdges(writer, n + 1, dotProvider, dotExporter$Cluster.subgraph, map, digraphProvider);
        this.indent(writer, n);
        writer.write("}");
        writer.write(this.lineSpeparator);
    }

    private <V, G extends Digraph<V>> void writeNodesAndEdges(Writer writer, int n, DotProvider<V, G> dotProvider, G g, Map<V, DotExporter$Cluster<V, G>> map, DigraphProvider<V, G> digraphProvider) throws IOException {
        for (V v : g.vertices()) {
            if (map.containsKey(v)) {
                this.writeCluster(writer, n, dotProvider, v, map.get(v), digraphProvider);
                continue;
            }
            this.writeNode(writer, n, v, dotProvider);
        }
        for (V v : g.vertices()) {
            for (V v2 : g.targets(v)) {
                this.writeEdge(writer, n, v, v2, g.get(v, v2).getAsInt(), dotProvider, map.get(v), map.get(v2));
            }
        }
    }

    private void writeAttributes(Writer writer, Iterator<DotAttribute> iterator) throws IOException {
        if (iterator.hasNext()) {
            boolean bl = true;
            while (iterator.hasNext()) {
                if (bl) {
                    writer.write(91);
                    bl = false;
                } else {
                    writer.write(", ");
                }
                iterator.next().write(writer);
            }
            writer.write(93);
        }
    }

    private <V, G extends Digraph<V>> Map<V, DotExporter$Cluster<V, G>> createClusters(G g, DotProvider<V, G> dotProvider, DigraphProvider<? super V, G> digraphProvider) {
        HashMap hashMap = new HashMap();
        if (digraphProvider != null) {
            for (V v : g.vertices()) {
                G g2 = digraphProvider.get(v);
                if (g2 == null || g2.getVertexCount() <= 0) continue;
                hashMap.put(v, new DotExporter$Cluster("cluster_" + dotProvider.getNodeId(v), g2));
            }
        }
        return hashMap;
    }

    private <V> void writeEdge(Writer writer, int n, V v, V v2, int n2, DotProvider<V, ?> dotProvider, DotExporter$Cluster<V, ?> dotExporter$Cluster, DotExporter$Cluster<V, ?> dotExporter$Cluster2) throws IOException {
        this.indent(writer, n);
        writer.write(dotProvider.getNodeId(dotExporter$Cluster == null ? v : dotExporter$Cluster.sample));
        writer.write(" -> ");
        writer.write(dotProvider.getNodeId(dotExporter$Cluster2 == null ? v2 : dotExporter$Cluster2.sample));
        Iterable<DotAttribute> iterable = dotProvider.getEdgeAttributes(v, v2, n2);
        if (dotExporter$Cluster == null && dotExporter$Cluster2 == null) {
            if (iterable != null) {
                this.writeAttributes(writer, iterable.iterator());
            }
        } else {
            ArrayList<DotAttribute> arrayList = new ArrayList<DotAttribute>();
            if (dotExporter$Cluster != null) {
                arrayList.add(dotExporter$Cluster.tail);
            }
            if (dotExporter$Cluster2 != null) {
                arrayList.add(dotExporter$Cluster2.head);
            }
            if (iterable != null) {
                for (DotAttribute dotAttribute : iterable) {
                    arrayList.add(dotAttribute);
                }
            }
            this.writeAttributes(writer, arrayList.iterator());
        }
        writer.write(";");
        writer.write(this.lineSpeparator);
    }

    private <V> void writeNode(Writer writer, int n, V v, DotProvider<V, ?> dotProvider) throws IOException {
        this.indent(writer, n);
        writer.write(dotProvider.getNodeId(v));
        Iterable<DotAttribute> iterable = dotProvider.getNodeAttributes(v);
        if (iterable != null) {
            this.writeAttributes(writer, iterable.iterator());
        }
        writer.write(";");
        writer.write(this.lineSpeparator);
    }
}

