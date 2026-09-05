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

public final class class07428
extends Enum<class07428>
implements class05033 {
    public static final /* enum */ class07428 field_6302 = new class07428("monster", 70, false, false, 128);
    public static final /* enum */ class07428 field_6294 = new class07428("creature", 10, true, true, 128);
    public static final /* enum */ class07428 field_6303 = new class07428("ambient", 15, true, false, 128);
    public static final /* enum */ class07428 field_34447 = new class07428("axolotls", 5, true, false, 128);
    public static final /* enum */ class07428 field_30092 = new class07428("underground_water_creature", 5, true, false, 128);
    public static final /* enum */ class07428 field_6300 = new class07428("water_creature", 5, true, false, 128);
    public static final /* enum */ class07428 field_24460 = new class07428("water_ambient", 20, true, false, 64);
    public static final /* enum */ class07428 field_17715 = new class07428("misc", -1, true, true, 128);
    public static final Codec<class07428> field_24655;
    private final int field_6297;
    private final boolean field_6298;
    private final boolean field_6295;
    private final String field_6304;
    private final int field_24461;
    private final int field_24462;
    private static final /* synthetic */ class07428[] field_6301;

    public boolean L() {
        return this.field_6298;
    }

    private static /* synthetic */ class07428[] M() {
        return new class07428[]{field_6302, field_6294, field_6303, field_34447, field_30092, field_6300, field_24460, field_17715};
    }

    private class07428(String string2, int n2, boolean bl, boolean bl2, int n3) {
        this.field_24461 = 32;
        this.field_6304 = string2;
        this.field_6297 = n2;
        this.field_6298 = bl;
        this.field_6295 = bl2;
        this.field_24462 = n3;
    }

    public static class07428[] values() {
        return (class07428[])field_6301.clone();
    }

    public static class07428 valueOf(String string) {
        return Enum.valueOf(class07428.class, string);
    }

    public int i() {
        return this.field_24462;
    }

    public boolean u() {
        return this.field_6295;
    }

    public int y() {
        return this.field_6297;
    }

    public String N() {
        return this.field_6304;
    }

    public int R() {
        return 32;
    }

    public String method_15434() {
        return this.field_6304;
    }

    static {
        field_6301 = class07428.M();
        field_24655 = class05033.N(class07428::values);
    }
}

