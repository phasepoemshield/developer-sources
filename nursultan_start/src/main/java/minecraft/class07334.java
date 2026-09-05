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

public final class class07334
extends Enum<class07334>
implements class05033 {
    public static final /* enum */ class07334 field_64380 = new class07334("default");
    public static final /* enum */ class07334 field_64381 = new class07334("nether");
    public static final Codec<class07334> field_64382;
    private final String field_64383;
    private static final /* synthetic */ class07334[] field_64384;

    private class07334(String string2) {
        this.field_64383 = string2;
    }

    public static class07334[] values() {
        return (class07334[])field_64384.clone();
    }

    public static class07334 valueOf(String string) {
        return Enum.valueOf(class07334.class, string);
    }

    private static /* synthetic */ class07334[] N() {
        return new class07334[]{field_64380, field_64381};
    }

    public String method_15434() {
        return this.field_64383;
    }

    static {
        field_64384 = class07334.N();
        field_64382 = class05033.N(class07334::values);
    }
}

