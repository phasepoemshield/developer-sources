/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class08394;

public final class class03050
extends Enum<class03050> {
    public static final /* enum */ class03050 field_39763 = new class03050(class01894.y((String)"icon/chat_modified"), 9, 9);
    public final class01894 field_45292;
    public final int field_39766;
    public final int field_39767;
    private static final /* synthetic */ class03050[] field_39768;

    private class03050(class01894 class018942, int n2, int n3) {
        this.field_45292 = class018942;
        this.field_39766 = n2;
        this.field_39767 = n3;
    }

    static {
        field_39768 = class03050.N();
    }

    public static class03050[] values() {
        return (class03050[])field_39768.clone();
    }

    public static class03050 valueOf(String string) {
        return Enum.valueOf(class03050.class, string);
    }

    private static /* synthetic */ class03050[] N() {
        return new class03050[]{field_39763};
    }

    public void N(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, this.field_45292, n, n2, this.field_39766, this.field_39767);
    }
}

