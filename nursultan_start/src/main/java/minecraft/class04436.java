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

public final class class04436
extends Enum<class04436>
implements class05033 {
    public static final /* enum */ class04436 field_37199 = new class04436("piece");
    public static final /* enum */ class04436 field_37200 = new class04436("full");
    public static final Codec<class04436> field_37202;
    private final String field_37203;
    private static final /* synthetic */ class04436[] field_37204;

    private class04436(String string2) {
        this.field_37203 = string2;
    }

    public static class04436[] values() {
        return (class04436[])field_37204.clone();
    }

    public static class04436 valueOf(String string) {
        return Enum.valueOf(class04436.class, string);
    }

    private static /* synthetic */ class04436[] N() {
        return new class04436[]{field_37199, field_37200};
    }

    public String method_15434() {
        return this.field_37203;
    }

    static {
        field_37204 = class04436.N();
        field_37202 = class05033.N(class04436::values);
    }
}

