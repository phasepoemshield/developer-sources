/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

class Yaml$NodeIterable
implements Iterable<Node> {
    private Iterator<Node> iterator;

    public Yaml$NodeIterable(Iterator<Node> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<Node> iterator() {
        return this.iterator;
    }
}

