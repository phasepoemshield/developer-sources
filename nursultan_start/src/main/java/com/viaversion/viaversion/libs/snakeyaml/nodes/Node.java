/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.comments.CommentLine
 */
package com.viaversion.viaversion.libs.snakeyaml.nodes;

import com.viaversion.viaversion.libs.snakeyaml.comments.CommentLine;
import com.viaversion.viaversion.libs.snakeyaml.error.Mark;
import com.viaversion.viaversion.libs.snakeyaml.nodes.NodeId;
import com.viaversion.viaversion.libs.snakeyaml.nodes.Tag;
import java.util.List;

public abstract class Node {
    private Tag tag;
    private final Mark startMark;
    protected Mark endMark;
    private Class<? extends Object> type;
    private boolean twoStepsConstruction;
    private String anchor;
    private List<CommentLine> inLineComments;
    private List<CommentLine> blockComments;
    private List<CommentLine> endComments;
    protected boolean resolved;
    protected Boolean useClassConstructor;

    public void setType(Class<? extends Object> type) {
        if (!type.isAssignableFrom(this.type)) {
            this.type = type;
        }
    }

    public Node(Tag tag, Mark startMark, Mark endMark) {
        this.setTag(tag);
        this.startMark = startMark;
        this.endMark = endMark;
        this.type = Object.class;
        this.twoStepsConstruction = false;
        this.resolved = true;
        this.useClassConstructor = null;
        this.inLineComments = null;
        this.blockComments = null;
        this.endComments = null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
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

    public void setTwoStepsConstruction(boolean twoStepsConstruction) {
        this.twoStepsConstruction = twoStepsConstruction;
    }

    public void setUseClassConstructor(Boolean useClassConstructor) {
        this.useClassConstructor = useClassConstructor;
    }

    public List<CommentLine> getEndComments() {
        return this.endComments;
    }

    public List<CommentLine> getBlockComments() {
        return this.blockComments;
    }

    public List<CommentLine> getInLineComments() {
        return this.inLineComments;
    }

    public Mark getStartMark() {
        return this.startMark;
    }

    public void setEndComments(List<CommentLine> endComments) {
        this.endComments = endComments;
    }

    public void setInLineComments(List<CommentLine> inLineComments) {
        this.inLineComments = inLineComments;
    }

    public void setBlockComments(List<CommentLine> blockComments) {
        this.blockComments = blockComments;
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

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }
}

