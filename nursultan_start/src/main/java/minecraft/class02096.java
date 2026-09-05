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

public final class class02096
extends Enum<class02096>
implements class05033 {
    public static final /* enum */ class02096 field_41481 = new class02096("survival", 0);
    public static final /* enum */ class02096 field_41482 = new class02096("creative", 1);
    public static final /* enum */ class02096 field_41483 = new class02096("adventure", 2);
    public static final /* enum */ class02096 field_41484 = new class02096("spectator", 6);
    public static final /* enum */ class02096 field_41485 = new class02096("hardcore", 99);
    public static final Codec<class02096> field_41486;
    private final String field_41487;
    private final int field_41488;
    private static final /* synthetic */ class02096[] field_41489;

    private class02096(String string2, int n2) {
        this.field_41487 = string2;
        this.field_41488 = n2;
    }

    public static class02096[] values() {
        return (class02096[])field_41489.clone();
    }

    public static class02096 valueOf(String string) {
        return Enum.valueOf(class02096.class, string);
    }

    private static /* synthetic */ class02096[] y() {
        return new class02096[]{field_41481, field_41482, field_41483, field_41484, field_41485};
    }

    public int N() {
        return this.field_41488;
    }

    public String method_15434() {
        return this.field_41487;
    }

    static {
        field_41489 = class02096.y();
        field_41486 = class05033.N(class02096::values);
    }
}

