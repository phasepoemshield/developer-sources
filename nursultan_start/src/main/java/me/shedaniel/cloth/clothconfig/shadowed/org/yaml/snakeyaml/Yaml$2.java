/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer.Composer;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

class Yaml$2
implements Iterator<Node> {
    final /* synthetic */ Composer val$composer;
    final /* synthetic */ Yaml this$0;

    Yaml$2(Yaml yaml, Composer composer) {
        this.this$0 = yaml;
        this.val$composer = composer;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return this.val$composer.checkNode();
    }

    @Override
    public Node next() {
        Node node = this.val$composer.getNode();
        if (node != null) {
            return node;
        }
        throw new NoSuchElementException("No Node is available.");
    }
}

