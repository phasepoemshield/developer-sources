/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class03448
 *  minecraft.class05033
 *  minecraft.class06289
 *  minecraft.class06584
 *  minecraft.class08894
 *  minecraft.class08896
 *  minecraft.class08899
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class03448;
import minecraft.class05033;
import minecraft.class06289;
import minecraft.class06584;
import minecraft.class08894;
import minecraft.class08896;
import minecraft.class08899;
import minecraft.class08924;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public abstract class class08934
extends Enum<class08934>
implements class05033 {
    public static final /* enum */ class08934 field_55555 = new class08899("NONE", 0, "none");
    public static final /* enum */ class08934 field_55390 = new class08894("LODESTONE", 1, "lodestone");
    public static final /* enum */ class08934 field_55391 = new class08924("SPAWN", 2, "spawn");
    public static final /* enum */ class08934 field_55392 = new class08896("RECOVERY", 3, "recovery");
    public static final Codec<class08934> field_55393;
    private final String field_55394;
    private static final /* synthetic */ class08934[] field_55395;

    class08934(String string2) {
        this.field_55394 = string2;
    }

    static {
        field_55395 = class08934.N();
        field_55393 = class05033.N(class08934::values);
    }

    public static class08934[] values() {
        return (class08934[])field_55395.clone();
    }

    public static class08934 valueOf(String string) {
        return Enum.valueOf(class08934.class, string);
    }

    private static /* synthetic */ class08934[] N() {
        return new class08934[]{field_55555, field_55390, field_55391, field_55392};
    }

    abstract @Nullable class06289 N(class03448 var1, class06584 var2, @Nullable class08961 var3);

    public String method_15434() {
        return this.field_55394;
    }
}

