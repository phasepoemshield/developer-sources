/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class06027
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05033;
import minecraft.class06004;
import minecraft.class06015;
import minecraft.class06027;

public abstract class class06009
extends Enum<class06009>
implements class05033 {
    public static final /* enum */ class06009 field_26426 = new class06027("NONE", 0, "none");
    public static final /* enum */ class06009 field_26427 = new class06015("DARK_FOREST", 1, "dark_forest");
    public static final /* enum */ class06009 field_26428 = new class06004("SWAMP", 2, "swamp");
    private final String field_26430;
    public static final Codec<class06009> field_26429;
    private static final /* synthetic */ class06009[] field_26432;

    class06009(String string2) {
        this.field_26430 = string2;
    }

    static {
        field_26432 = class06009.y();
        field_26429 = class05033.N(class06009::values);
    }

    public static class06009[] values() {
        return (class06009[])field_26432.clone();
    }

    public static class06009 valueOf(String string) {
        return Enum.valueOf(class06009.class, string);
    }

    private static /* synthetic */ class06009[] y() {
        return new class06009[]{field_26426, field_26427, field_26428};
    }

    public String N() {
        return this.field_26430;
    }

    public abstract int N(double var1, double var3, int var5);

    public String method_15434() {
        return this.field_26430;
    }
}

