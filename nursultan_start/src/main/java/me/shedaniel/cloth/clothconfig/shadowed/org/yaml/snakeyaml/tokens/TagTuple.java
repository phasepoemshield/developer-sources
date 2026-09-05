/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens;

public final class TagTuple {
    private final String handle;
    private final String suffix;

    public String getSuffix() {
        return this.suffix;
    }

    public TagTuple(String string, String string2) {
        if (string2 == null) {
            throw new NullPointerException("Suffix must be provided.");
        }
        this.handle = string;
        this.suffix = string2;
    }

    public String getHandle() {
        return this.handle;
    }
}

