/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;

public class AnchorNode
extends Node {
    private Node realNode;

    public AnchorNode(Node node) {
        super(node.getTag(), node.getStartMark(), node.getEndMark());
        this.realNode = node;
    }

    @Override
    public NodeId getNodeId() {
        return NodeId.anchor;
    }

    public Node getRealNode() {
        return this.realNode;
    }
}

