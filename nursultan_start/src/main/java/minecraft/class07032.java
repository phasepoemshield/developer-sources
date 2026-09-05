/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class07030;

public final class class07032
extends Enum<class07032>
implements class07030 {
    public static final /* enum */ class07032 field_11512 = new class07032("skeleton");
    public static final /* enum */ class07032 field_11513 = new class07032("wither_skeleton");
    public static final /* enum */ class07032 field_11510 = new class07032("player");
    public static final /* enum */ class07032 field_11508 = new class07032("zombie");
    public static final /* enum */ class07032 field_11507 = new class07032("creeper");
    public static final /* enum */ class07032 field_41313 = new class07032("piglin");
    public static final /* enum */ class07032 field_11511 = new class07032("dragon");
    private final String field_46444;
    private static final /* synthetic */ class07032[] field_11509;

    private class07032(String string2) {
        this.field_46444 = string2;
        N.put(string2, this);
    }

    public static class07032[] values() {
        return (class07032[])field_11509.clone();
    }

    public static class07032 valueOf(String string) {
        return Enum.valueOf(class07032.class, string);
    }

    private static /* synthetic */ class07032[] N() {
        return new class07032[]{field_11512, field_11513, field_11510, field_11508, field_11507, field_41313, field_11511};
    }

    public String method_15434() {
        return this.field_46444;
    }

    static {
        field_11509 = class07032.N();
    }
}

