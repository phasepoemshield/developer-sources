/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00793;
import minecraft.class00804;
import minecraft.class05033;
import minecraft.class07209;

public abstract class class00785
extends Enum<class00785>
implements class05033 {
    public static final /* enum */ class00785 field_26407 = new class00793("NONE", 0, "none");
    public static final /* enum */ class00785 field_26408 = new class00804("FROZEN", 1, "frozen");
    private final String field_26410;
    public static final Codec<class00785> field_26409;
    private static final /* synthetic */ class00785[] field_26412;

    class00785(String string2) {
        this.field_26410 = string2;
    }

    static {
        field_26412 = class00785.y();
        field_26409 = class05033.N(class00785::values);
    }

    public static class00785[] values() {
        return (class00785[])field_26412.clone();
    }

    public static class00785 valueOf(String string) {
        return Enum.valueOf(class00785.class, string);
    }

    private static /* synthetic */ class00785[] y() {
        return new class00785[]{field_26407, field_26408};
    }

    public String N() {
        return this.field_26410;
    }

    public abstract float N(class07209 var1, float var2);

    public String method_15434() {
        return this.field_26410;
    }
}

