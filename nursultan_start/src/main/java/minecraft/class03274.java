/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class07085
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class07085;

public final class class03274
extends Enum<class03274>
implements class05033 {
    public static final /* enum */ class03274 field_41934 = new class03274(class07085.field_6169, 11, "helmet");
    public static final /* enum */ class03274 field_41935 = new class03274(class07085.field_6174, 16, "chestplate");
    public static final /* enum */ class03274 field_41936 = new class03274(class07085.field_6172, 15, "leggings");
    public static final /* enum */ class03274 field_41937 = new class03274(class07085.field_6166, 13, "boots");
    public static final /* enum */ class03274 field_48838 = new class03274(class07085.field_48824, 16, "body");
    public static final Codec<class03274> field_48839;
    private final class07085 field_41938;
    private final String field_41939;
    private final int field_49257;
    private static final /* synthetic */ class03274[] field_41940;

    private static /* synthetic */ class03274[] L() {
        return new class03274[]{field_41934, field_41935, field_41936, field_41937, field_48838};
    }

    private class03274(class07085 class070852, int n2, String string2) {
        this.field_41938 = class070852;
        this.field_41939 = string2;
        this.field_49257 = n2;
    }

    public static class03274[] values() {
        return (class03274[])field_41940.clone();
    }

    public static class03274 valueOf(String string) {
        return Enum.valueOf(class03274.class, string);
    }

    public String y() {
        return this.field_41939;
    }

    public class07085 N() {
        return this.field_41938;
    }

    public int N(int n) {
        return this.field_49257 * n;
    }

    public String method_15434() {
        return this.field_41939;
    }

    static {
        field_41940 = class03274.L();
        field_48839 = class05033.y(class03274::values);
    }
}

