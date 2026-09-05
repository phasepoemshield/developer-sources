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

public final class class07852
extends Enum<class07852>
implements class05033 {
    public static final /* enum */ class07852 field_13174 = new class07852("raw_generation");
    public static final /* enum */ class07852 field_25186 = new class07852("lakes");
    public static final /* enum */ class07852 field_13171 = new class07852("local_modifications");
    public static final /* enum */ class07852 field_13172 = new class07852("underground_structures");
    public static final /* enum */ class07852 field_13173 = new class07852("surface_structures");
    public static final /* enum */ class07852 field_25187 = new class07852("strongholds");
    public static final /* enum */ class07852 field_13176 = new class07852("underground_ores");
    public static final /* enum */ class07852 field_13177 = new class07852("underground_decoration");
    public static final /* enum */ class07852 field_35182 = new class07852("fluid_springs");
    public static final /* enum */ class07852 field_13178 = new class07852("vegetal_decoration");
    public static final /* enum */ class07852 field_13179 = new class07852("top_layer_modification");
    public static final Codec<class07852> field_37680;
    private final String field_37682;
    private static final /* synthetic */ class07852[] field_13181;

    private class07852(String string2) {
        this.field_37682 = string2;
    }

    public static class07852[] values() {
        return (class07852[])field_13181.clone();
    }

    public static class07852 valueOf(String string) {
        return Enum.valueOf(class07852.class, string);
    }

    private static /* synthetic */ class07852[] y() {
        return new class07852[]{field_13174, field_25186, field_13171, field_13172, field_13173, field_25187, field_13176, field_13177, field_35182, field_13178, field_13179};
    }

    public String N() {
        return this.field_37682;
    }

    public String method_15434() {
        return this.field_37682;
    }

    static {
        field_13181 = class07852.y();
        field_37680 = class05033.N(class07852::values);
    }
}

