/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

public enum DumperOptions$Version {
    V1_0(new Integer[]{1, 0}),
    V1_1(new Integer[]{1, 1});

    private Integer[] version;

    private DumperOptions$Version(Integer[] integerArray) {
        this.version = integerArray;
    }

    public String toString() {
        return "Version: " + this.getRepresentation();
    }

    public int major() {
        return this.version[0];
    }

    public int minor() {
        return this.version[1];
    }

    public String getRepresentation() {
        return this.version[0] + "." + this.version[1];
    }
}

