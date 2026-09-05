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

public final class class07360
extends Enum<class07360>
implements class05033 {
    public static final /* enum */ class07360 field_64385 = new class07360("none");
    public static final /* enum */ class07360 field_64386 = new class07360("overworld");
    public static final /* enum */ class07360 field_64387 = new class07360("end");
    public static final Codec<class07360> field_64388;
    private final String field_64389;
    private static final /* synthetic */ class07360[] field_64390;

    private class07360(String string2) {
        this.field_64389 = string2;
    }

    public static class07360[] values() {
        return (class07360[])field_64390.clone();
    }

    public static class07360 valueOf(String string) {
        return Enum.valueOf(class07360.class, string);
    }

    private static /* synthetic */ class07360[] N() {
        return new class07360[]{field_64385, field_64386, field_64387};
    }

    public String method_15434() {
        return this.field_64389;
    }

    static {
        field_64390 = class07360.N();
        field_64388 = class05033.N(class07360::values);
    }
}

