/*
 * Decompiled with CFR 0.152.
 */
package de.odysseus.ithaka.digraph.io.tgf;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.io.tgf.TgfLabelProvider;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class TgfExporter {
    private final String newline;

    public TgfExporter() {
        this(System.lineSeparator());
    }

    public TgfExporter(String string) {
        this.newline = string;
    }

    public <V> void export(TgfLabelProvider<V> tgfLabelProvider, Digraph<V> digraph, Writer writer) throws IOException {
        HashMap<V, Integer> hashMap = new HashMap<V, Integer>();
        int n = 0;
        for (V v : digraph.vertices()) {
            hashMap.put(v, ++n);
            writer.write(String.valueOf(n));
            String string = tgfLabelProvider.getVertexLabel(v);
            if (string != null) {
                writer.write(32);
                writer.write(string);
            }
            writer.write(this.newline);
        }
        writer.write(35);
        writer.write(this.newline);
        for (V v : digraph.vertices()) {
            for (Object e : digraph.targets(v)) {
                writer.write(String.valueOf(hashMap.get(v)));
                writer.write(32);
                writer.write(String.valueOf(hashMap.get(e)));
                String string = tgfLabelProvider.getEdgeLabel(digraph.get(v, e).getAsInt());
                if (string != null) {
                    writer.write(32);
                    writer.write(string);
                }
                writer.write(this.newline);
            }
        }
        writer.flush();
    }
}

