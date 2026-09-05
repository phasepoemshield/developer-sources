/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

class IndentationPolicy {
    private final int tableIndent;
    private final int keyValueIndent;
    private final int arrayDelimiterPadding;

    IndentationPolicy(int n, int n2, int n3) {
        this.keyValueIndent = n;
        this.tableIndent = n2;
        this.arrayDelimiterPadding = n3;
    }

    int getTableIndent() {
        return this.tableIndent;
    }

    int getKeyValueIndent() {
        return this.keyValueIndent;
    }

    int getArrayDelimiterPadding() {
        return this.arrayDelimiterPadding;
    }
}

