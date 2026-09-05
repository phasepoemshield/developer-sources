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
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public abstract class CollectionNode<T>
extends Node {
    private DumperOptions.FlowStyle flowStyle;

    public CollectionNode(Tag tag, Mark mark, Mark mark2, DumperOptions.FlowStyle flowStyle) {
        super(tag, mark, mark2);
        this.setFlowStyle(flowStyle);
    }

    @Deprecated
    public CollectionNode(Tag tag, Mark mark, Mark mark2, Boolean bl) {
        this(tag, mark, mark2, DumperOptions.FlowStyle.fromBoolean((Boolean)bl));
    }

    public abstract List<T> getValue();

    @Deprecated
    public void setFlowStyle(Boolean bl) {
        this.setFlowStyle(DumperOptions.FlowStyle.fromBoolean((Boolean)bl));
    }

    public void setFlowStyle(DumperOptions.FlowStyle flowStyle) {
        if (flowStyle == null) {
            throw new NullPointerException("Flow style must be provided.");
        }
        this.flowStyle = flowStyle;
    }

    public DumperOptions.FlowStyle getFlowStyle() {
        return this.flowStyle;
    }

    public void setEndMark(Mark mark) {
        this.endMark = mark;
    }
}

