/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class08719
 */
package minecraft;

import minecraft.class01134;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class08719;

public final class class02782
extends Enum<class02782> {
    public static final /* enum */ class02782 field_56095 = new class02782(class01894.y((String)"textures/entity/horse/donkey.png"), class04802.NJ, class04802.No, class08719.field_56127, class04802.Nq, class04802.NK);
    public static final /* enum */ class02782 field_56096 = new class02782(class01894.y((String)"textures/entity/horse/mule.png"), class04802.yD, class04802.yh, class08719.field_56128, class04802.yr, class04802.LN);
    final class01894 field_56097;
    final class01134 field_56098;
    final class01134 field_56099;
    final class08719 field_56100;
    final class01134 field_56101;
    final class01134 field_56102;
    private static final /* synthetic */ class02782[] field_56103;

    private class02782(class01894 class018942, class01134 class011342, class01134 class011343, class08719 class087192, class01134 class011344, class01134 class011345) {
        this.field_56097 = class018942;
        this.field_56098 = class011342;
        this.field_56099 = class011343;
        this.field_56100 = class087192;
        this.field_56101 = class011344;
        this.field_56102 = class011345;
    }

    public static class02782[] values() {
        return (class02782[])field_56103.clone();
    }

    public static class02782 valueOf(String string) {
        return Enum.valueOf(class02782.class, string);
    }

    private static /* synthetic */ class02782[] N() {
        return new class02782[]{field_56095, field_56096};
    }

    static {
        field_56103 = class02782.N();
    }
}

