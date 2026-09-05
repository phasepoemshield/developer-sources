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

public final class class05085
extends Enum<class05085>
implements class05033 {
    public static final /* enum */ class05085 field_24029 = new class05085("on_land_surface");
    public static final /* enum */ class05085 field_24030 = new class05085("partly_buried");
    public static final /* enum */ class05085 field_24031 = new class05085("on_ocean_floor");
    public static final /* enum */ class05085 field_24032 = new class05085("in_mountain");
    public static final /* enum */ class05085 field_24033 = new class05085("underground");
    public static final /* enum */ class05085 field_24034 = new class05085("in_nether");
    public static final Codec<class05085> field_37811;
    private final String field_24036;
    private static final /* synthetic */ class05085[] field_24037;

    private class05085(String string2) {
        this.field_24036 = string2;
    }

    public static class05085[] values() {
        return (class05085[])field_24037.clone();
    }

    public static class05085 valueOf(String string) {
        return Enum.valueOf(class05085.class, string);
    }

    private static /* synthetic */ class05085[] y() {
        return new class05085[]{field_24029, field_24030, field_24031, field_24032, field_24033, field_24034};
    }

    public String N() {
        return this.field_24036;
    }

    public String method_15434() {
        return this.field_24036;
    }

    static {
        field_24037 = class05085.y();
        field_37811 = class05033.N(class05085::values);
    }
}

