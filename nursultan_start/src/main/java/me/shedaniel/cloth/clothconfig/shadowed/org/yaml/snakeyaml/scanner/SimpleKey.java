/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.scanner;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;

final class SimpleKey {
    private int tokenNumber;
    private boolean required;
    private int index;
    private int line;
    private int column;
    private Mark mark;

    public int getColumn() {
        return this.column;
    }

    public SimpleKey(int n, boolean bl, int n2, int n3, int n4, Mark mark) {
        this.tokenNumber = n;
        this.required = bl;
        this.index = n2;
        this.line = n3;
        this.column = n4;
        this.mark = mark;
    }

    public String toString() {
        return "SimpleKey - tokenNumber=" + this.tokenNumber + " required=" + this.required + " index=" + this.index + " line=" + this.line + " column=" + this.column;
    }

    public int getIndex() {
        return this.index;
    }

    public int getTokenNumber() {
        return this.tokenNumber;
    }

    public int getLine() {
        return this.line;
    }

    public boolean isRequired() {
        return this.required;
    }

    public Mark getMark() {
        return this.mark;
    }
}

