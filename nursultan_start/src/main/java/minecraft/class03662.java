/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05033;

public final class class03662
extends Enum<class03662>
implements class05033 {
    public static final /* enum */ class03662 field_4315 = new class03662(0, "none");
    public static final /* enum */ class03662 field_4323 = new class03662(1, "thirdperson_lefthand");
    public static final /* enum */ class03662 field_4320 = new class03662(2, "thirdperson_righthand");
    public static final /* enum */ class03662 field_4321 = new class03662(3, "firstperson_lefthand");
    public static final /* enum */ class03662 field_4322 = new class03662(4, "firstperson_righthand");
    public static final /* enum */ class03662 field_4316 = new class03662(5, "head");
    public static final /* enum */ class03662 field_4317 = new class03662(6, "gui");
    public static final /* enum */ class03662 field_4318 = new class03662(7, "ground");
    public static final /* enum */ class03662 field_4319 = new class03662(8, "fixed");
    public static final /* enum */ class03662 field_61988 = new class03662(9, "on_shelf");
    public static final Codec<class03662> field_42468;
    public static final IntFunction<class03662> field_42469;
    private final byte field_42470;
    private final String field_42471;
    private static final /* synthetic */ class03662[] field_4314;

    public boolean L() {
        return this == field_4321 || this == field_4323;
    }

    private class03662(int n2, String string2) {
        this.field_42471 = string2;
        this.field_42470 = (byte)n2;
    }

    public static class03662[] values() {
        return (class03662[])field_4314.clone();
    }

    public static class03662 valueOf(String string) {
        return Enum.valueOf(class03662.class, string);
    }

    private static /* synthetic */ class03662[] u() {
        return new class03662[]{field_4315, field_4323, field_4320, field_4321, field_4322, field_4316, field_4317, field_4318, field_4319, field_61988};
    }

    public boolean y() {
        return this == field_4321 || this == field_4322;
    }

    public byte N() {
        return this.field_42470;
    }

    public String method_15434() {
        return this.field_42471;
    }

    static {
        field_4314 = class03662.u();
        field_42468 = class05033.N(class03662::values);
        field_42469 = class02121.N(class03662::N, (Object[])class03662.values(), (class02126)class02126.field_41664);
    }
}

