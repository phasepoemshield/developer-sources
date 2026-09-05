/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

public enum DumperOptions$FlowStyle {
    FLOW(Boolean.TRUE),
    BLOCK(Boolean.FALSE),
    AUTO(null);

    private Boolean styleBoolean;

    @Deprecated
    public static DumperOptions$FlowStyle fromBoolean(Boolean bl) {
        return bl == null ? AUTO : (bl != false ? FLOW : BLOCK);
    }

    private DumperOptions$FlowStyle(Boolean bl) {
        this.styleBoolean = bl;
    }

    public String toString() {
        return "Flow style: '" + this.styleBoolean + "'";
    }

    public Boolean getStyleBoolean() {
        return this.styleBoolean;
    }
}

