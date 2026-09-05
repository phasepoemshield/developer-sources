/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.CollectionNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class SequenceNode
extends CollectionNode<Node> {
    private final List<Node> value;

    @Deprecated
    public SequenceNode(Tag tag, boolean bl, List<Node> list, Mark mark, Mark mark2, Boolean bl2) {
        this(tag, bl, list, mark, mark2, DumperOptions.FlowStyle.fromBoolean((Boolean)bl2));
    }

    @Deprecated
    public SequenceNode(Tag tag, List<Node> list, Boolean bl) {
        this(tag, list, DumperOptions.FlowStyle.fromBoolean((Boolean)bl));
    }

    public SequenceNode(Tag tag, List<Node> list, DumperOptions.FlowStyle flowStyle) {
        this(tag, true, list, null, null, flowStyle);
    }

    public SequenceNode(Tag tag, boolean bl, List<Node> list, Mark mark, Mark mark2, DumperOptions.FlowStyle flowStyle) {
        super(tag, mark, mark2, flowStyle);
        if (list == null) {
            throw new NullPointerException("value in a Node is required.");
        }
        this.value = list;
        this.resolved = bl;
    }

    public String toString() {
        return "<" + this.getClass().getName() + " (tag=" + this.getTag() + ", value=" + this.getValue() + ")>";
    }

    @Override
    public List<Node> getValue() {
        return this.value;
    }

    public void setListType(Class<? extends Object> clazz) {
        for (Node node : this.value) {
            node.setType(clazz);
        }
    }

    @Override
    public NodeId getNodeId() {
        return NodeId.sequence;
    }
}

