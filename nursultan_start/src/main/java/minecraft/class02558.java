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

public final class class02558
extends Enum<class02558>
implements class05033 {
    public static final /* enum */ class02558 field_51683 = new class02558("attacker");
    public static final /* enum */ class02558 field_51684 = new class02558("damaging_entity");
    public static final /* enum */ class02558 field_51685 = new class02558("victim");
    public static final Codec<class02558> field_51686;
    private final String field_51687;
    private static final /* synthetic */ class02558[] field_51688;

    private class02558(String string2) {
        this.field_51687 = string2;
    }

    public static class02558[] values() {
        return (class02558[])field_51688.clone();
    }

    public static class02558 valueOf(String string) {
        return Enum.valueOf(class02558.class, string);
    }

    private static /* synthetic */ class02558[] N() {
        return new class02558[]{field_51683, field_51684, field_51685};
    }

    public String method_15434() {
        return this.field_51687;
    }

    static {
        field_51688 = class02558.N();
        field_51686 = class05033.N(class02558::values);
    }
}

