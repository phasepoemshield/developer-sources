/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;

public final class class07582
extends Enum<class07582>
implements class05033 {
    public static final /* enum */ class07582 field_64365 = new class07582("normal");
    public static final /* enum */ class07582 field_64366 = new class07582("warm");
    public static final Codec<class07582> field_64367;
    private final String field_64368;
    private static final /* synthetic */ class07582[] field_64369;

    private class07582(String string2) {
        this.field_64368 = string2;
    }

    public static class07582[] values() {
        return (class07582[])field_64369.clone();
    }

    public static class07582 valueOf(String string) {
        return Enum.valueOf(class07582.class, string);
    }

    private static /* synthetic */ class07582[] N() {
        return new class07582[]{field_64365, field_64366};
    }

    public String method_15434() {
        return this.field_64368;
    }

    static {
        field_64369 = class07582.N();
        field_64367 = class05033.N(class07582::values);
    }
}

