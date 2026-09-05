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

public final class class08719
extends Enum<class08719>
implements class05033 {
    public static final /* enum */ class08719 field_54125 = new class08719("humanoid");
    public static final /* enum */ class08719 field_54126 = new class08719("humanoid_leggings");
    public static final /* enum */ class08719 field_54127 = new class08719("wings");
    public static final /* enum */ class08719 field_54128 = new class08719("wolf_body");
    public static final /* enum */ class08719 field_54129 = new class08719("horse_body");
    public static final /* enum */ class08719 field_54130 = new class08719("llama_body");
    public static final /* enum */ class08719 field_56123 = new class08719("pig_saddle");
    public static final /* enum */ class08719 field_56124 = new class08719("strider_saddle");
    public static final /* enum */ class08719 field_56125 = new class08719("camel_saddle");
    public static final /* enum */ class08719 field_64249 = new class08719("camel_husk_saddle");
    public static final /* enum */ class08719 field_56126 = new class08719("horse_saddle");
    public static final /* enum */ class08719 field_56127 = new class08719("donkey_saddle");
    public static final /* enum */ class08719 field_56128 = new class08719("mule_saddle");
    public static final /* enum */ class08719 field_56129 = new class08719("zombie_horse_saddle");
    public static final /* enum */ class08719 field_56130 = new class08719("skeleton_horse_saddle");
    public static final /* enum */ class08719 field_59984 = new class08719("happy_ghast_body");
    public static final /* enum */ class08719 field_63621 = new class08719("nautilus_saddle");
    public static final /* enum */ class08719 field_63622 = new class08719("nautilus_body");
    public static final Codec<class08719> field_54131;
    private final String field_54132;
    private static final /* synthetic */ class08719[] field_54133;

    private class08719(String string2) {
        this.field_54132 = string2;
    }

    public static class08719[] values() {
        return (class08719[])field_54133.clone();
    }

    public static class08719 valueOf(String string) {
        return Enum.valueOf(class08719.class, string);
    }

    private static /* synthetic */ class08719[] y() {
        return new class08719[]{field_54125, field_54126, field_54127, field_54128, field_54129, field_54130, field_56123, field_56124, field_56125, field_64249, field_56126, field_56127, field_56128, field_56129, field_56130, field_59984, field_63621, field_63622};
    }

    public String N() {
        return "trims/entity/" + this.field_54132;
    }

    public String method_15434() {
        return this.field_54132;
    }

    static {
        field_54133 = class08719.y();
        field_54131 = class05033.N(class08719::values);
    }
}

