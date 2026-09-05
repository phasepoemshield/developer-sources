/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class05033;

public final class class04675
extends Enum<class04675>
implements class05033 {
    public static final /* enum */ class04675 field_50210 = new class04675("custom_name");
    public static final /* enum */ class04675 field_50211 = new class04675("item_name");
    public static final Codec<class04675> field_50212;
    private final String field_50213;
    private static final /* synthetic */ class04675[] field_50214;

    private class04675(String string2) {
        this.field_50213 = string2;
    }

    public static class04675[] values() {
        return (class04675[])field_50214.clone();
    }

    public static class04675 valueOf(String string) {
        return Enum.valueOf(class04675.class, string);
    }

    private static /* synthetic */ class04675[] y() {
        return new class04675[]{field_50210, field_50211};
    }

    public class02477<class00392> N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 1 -> class02484.U;
            case 0 -> class02484.B;
        };
    }

    public String method_15434() {
        return this.field_50213;
    }

    static {
        field_50214 = class04675.y();
        field_50212 = class05033.N(class04675::values);
    }
}

