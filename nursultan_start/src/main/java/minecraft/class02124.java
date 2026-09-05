/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class07211;

public final class class02124
extends Enum<class02124> {
    public static final /* enum */ class02124 field_4281 = new class02124(class07211.field_11036);
    public static final /* enum */ class02124 field_4277 = new class02124(class07211.field_11033);
    public static final /* enum */ class02124 field_4278 = new class02124(class07211.field_11034);
    public static final /* enum */ class02124 field_4283 = new class02124(class07211.field_11039);
    final class07211 field_4276;
    private static final /* synthetic */ class02124[] field_4282;

    private static /* synthetic */ class02124[] L() {
        return new class02124[]{field_4281, field_4277, field_4278, field_4283};
    }

    private class02124(class07211 class072112) {
        this.field_4276 = class072112;
    }

    public static class02124[] values() {
        return (class02124[])field_4282.clone();
    }

    public static class02124 valueOf(String string) {
        return Enum.valueOf(class02124.class, string);
    }

    public boolean y() {
        return this == field_4277 || this == field_4281;
    }

    public class07211 N() {
        return this.field_4276;
    }

    static {
        field_4282 = class02124.L();
    }
}

