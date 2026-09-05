/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class00619;

public final class class00591
extends Enum<class00591>
implements class00619<Boolean, Boolean> {
    public static final /* enum */ class00591 field_63788 = new class00591();
    public static final /* enum */ class00591 field_63789 = new class00591();
    public static final /* enum */ class00591 field_63790 = new class00591();
    public static final /* enum */ class00591 field_63791 = new class00591();
    public static final /* enum */ class00591 field_63792 = new class00591();
    public static final /* enum */ class00591 field_63793 = new class00591();
    private static final /* synthetic */ class00591[] field_63794;

    public static class00591[] values() {
        return (class00591[])field_63794.clone();
    }

    public static class00591 valueOf(String string) {
        return Enum.valueOf(class00591.class, string);
    }

    private static /* synthetic */ class00591[] y() {
        return new class00591[]{field_63788, field_63789, field_63790, field_63791, field_63792, field_63793};
    }

    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> bl2 != false && bl != false;
            case 1 -> bl2 == false || bl == false;
            case 2 -> bl2 != false || bl != false;
            case 3 -> bl2 == false && bl == false;
            case 4 -> bl2 ^ bl;
            case 5 -> bl2 == bl;
        };
    }

    @Override
    public Codec<Boolean> argumentCodec(class00607<Boolean> class006072) {
        return Codec.BOOL;
    }

    @Override
    public class00610<Boolean> argumentKeyframeLerp(class00607<Boolean> class006072) {
        return class00610.y();
    }

    static {
        field_63794 = class00591.y();
    }
}

