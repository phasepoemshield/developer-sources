/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public class ScalarNode
extends Node {
    private DumperOptions.ScalarStyle style;
    private String value;

    @Deprecated
    public ScalarNode(Tag tag, boolean bl, String string, Mark mark, Mark mark2, Character c) {
        this(tag, bl, string, mark, mark2, DumperOptions.ScalarStyle.createStyle((Character)c));
    }

    @Deprecated
    public ScalarNode(Tag tag, String string, Mark mark, Mark mark2, Character c) {
        this(tag, string, mark, mark2, DumperOptions.ScalarStyle.createStyle((Character)c));
    }

    public ScalarNode(Tag tag, boolean bl, String string, Mark mark, Mark mark2, DumperOptions.ScalarStyle scalarStyle) {
        super(tag, mark, mark2);
        if (string == null) {
            throw new NullPointerException("value in a Node is required.");
        }
        this.value = string;
        if (scalarStyle == null) {
            throw new NullPointerException("Scalar style must be provided.");
        }
        this.style = scalarStyle;
        this.resolved = bl;
    }

    public ScalarNode(Tag tag, String string, Mark mark, Mark mark2, DumperOptions.ScalarStyle scalarStyle) {
        this(tag, true, string, mark, mark2, scalarStyle);
    }

    public String toString() {
        return "<" + this.getClass().getName() + " (tag=" + this.getTag() + ", value=" + this.getValue() + ")>";
    }

    public String getValue() {
        return this.value;
    }

    public DumperOptions.ScalarStyle getScalarStyle() {
        return this.style;
    }

    @Override
    public NodeId getNodeId() {
        return NodeId.scalar;
    }

    public boolean isPlain() {
        return this.style == DumperOptions.ScalarStyle.PLAIN;
    }

    @Deprecated
    public Character getStyle() {
        return this.style.getChar();
    }
}

