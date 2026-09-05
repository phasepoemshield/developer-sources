/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;

public final class NodeTuple {
    private Node keyNode;
    private Node valueNode;

    public NodeTuple(Node node, Node node2) {
        if (node == null || node2 == null) {
            throw new NullPointerException("Nodes must be provided.");
        }
        this.keyNode = node;
        this.valueNode = node2;
    }

    public String toString() {
        return "<NodeTuple keyNode=" + this.keyNode.toString() + "; valueNode=" + this.valueNode.toString() + ">";
    }

    public Node getValueNode() {
        return this.valueNode;
    }

    public Node getKeyNode() {
        return this.keyNode;
    }
}

