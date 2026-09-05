/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;

public abstract class Node {
    private Tag tag;
    private Mark startMark;
    protected Mark endMark;
    private Class<? extends Object> type;
    private boolean twoStepsConstruction;
    private String anchor;
    protected boolean resolved;
    protected Boolean useClassConstructor;

    public void setType(Class<? extends Object> clazz) {
        if (!clazz.isAssignableFrom(this.type)) {
            this.type = clazz;
        }
    }

    @Deprecated
    public boolean isResolved() {
        return this.resolved;
    }

    public Node(Tag tag, Mark mark, Mark mark2) {
        this.setTag(tag);
        this.startMark = mark;
        this.endMark = mark2;
        this.type = Object.class;
        this.twoStepsConstruction = false;
        this.resolved = true;
        this.useClassConstructor = null;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Class<? extends Object> getType() {
        return this.type;
    }

    public Tag getTag() {
        return this.tag;
    }

    public boolean isTwoStepsConstruction() {
        return this.twoStepsConstruction;
    }

    public boolean useClassConstructor() {
        if (this.useClassConstructor == null) {
            if (!this.tag.isSecondary() && this.resolved && !Object.class.equals(this.type) && !this.tag.equals(Tag.NULL)) {
                return true;
            }
            return this.tag.isCompatible(this.getType());
        }
        return this.useClassConstructor;
    }

    public void setTwoStepsConstruction(boolean bl) {
        this.twoStepsConstruction = bl;
    }

    public void setUseClassConstructor(Boolean bl) {
        this.useClassConstructor = bl;
    }

    public Mark getStartMark() {
        return this.startMark;
    }

    public String getAnchor() {
        return this.anchor;
    }

    public abstract NodeId getNodeId();

    public void setTag(Tag tag) {
        if (tag == null) {
            throw new NullPointerException("tag in a Node is required.");
        }
        this.tag = tag;
    }

    public Mark getEndMark() {
        return this.endMark;
    }

    public void setAnchor(String string) {
        this.anchor = string;
    }
}

