/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

public final class ScalarAnalysis {
    private String scalar;
    private boolean empty;
    private boolean multiline;
    private boolean allowFlowPlain;
    private boolean allowBlockPlain;
    private boolean allowSingleQuoted;
    private boolean allowBlock;

    public ScalarAnalysis(String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.scalar = string;
        this.empty = bl;
        this.multiline = bl2;
        this.allowFlowPlain = bl3;
        this.allowBlockPlain = bl4;
        this.allowSingleQuoted = bl5;
        this.allowBlock = bl6;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public String getScalar() {
        return this.scalar;
    }

    public boolean isAllowBlockPlain() {
        return this.allowBlockPlain;
    }

    public boolean isAllowBlock() {
        return this.allowBlock;
    }

    public boolean isAllowFlowPlain() {
        return this.allowFlowPlain;
    }

    public boolean isMultiline() {
        return this.multiline;
    }

    public boolean isAllowSingleQuoted() {
        return this.allowSingleQuoted;
    }
}

