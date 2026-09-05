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

final class class04875
extends Enum<class04875>
implements class05033 {
    public static final /* enum */ class04875 field_19026 = new class04875("ongoing");
    public static final /* enum */ class04875 field_19027 = new class04875("victory");
    public static final /* enum */ class04875 field_19028 = new class04875("loss");
    public static final /* enum */ class04875 field_19029 = new class04875("stopped");
    public static final Codec<class04875> field_56440;
    private final String field_56441;
    private static final /* synthetic */ class04875[] field_19031;

    private class04875(String string2) {
        this.field_56441 = string2;
    }

    static {
        field_19031 = class04875.N();
        field_56440 = class05033.N(class04875::values);
    }

    public static class04875[] values() {
        return (class04875[])field_19031.clone();
    }

    public static class04875 valueOf(String string) {
        return Enum.valueOf(class04875.class, string);
    }

    private static /* synthetic */ class04875[] N() {
        return new class04875[]{field_19026, field_19027, field_19028, field_19029};
    }

    public String method_15434() {
        return this.field_56441;
    }
}

