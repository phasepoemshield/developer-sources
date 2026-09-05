/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 */
package minecraft;

import minecraft.class02796;

public final class class03215
extends Enum<class03215> {
    public static final /* enum */ class03215 field_34412 = new class03215("client");
    public static final /* enum */ class03215 field_34413 = new class03215("server");
    private final String field_34414;
    private static final /* synthetic */ class03215[] field_34415;

    private class03215(String string2) {
        this.field_34414 = string2;
    }

    static {
        field_34415 = class03215.y();
    }

    public static class03215[] values() {
        return (class03215[])field_34415.clone();
    }

    public static class03215 valueOf(String string) {
        return Enum.valueOf(class03215.class, string);
    }

    private static /* synthetic */ class03215[] y() {
        return new class03215[]{field_34412, field_34413};
    }

    public String N() {
        return this.field_34414;
    }

    public static class03215 N(class02796 class027962) {
        return class027962.z() ? field_34413 : field_34412;
    }
}

