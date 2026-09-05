/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00949
 *  minecraft.class03926
 *  minecraft.class05033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00949;
import minecraft.class03054;
import minecraft.class03926;
import minecraft.class05033;
import org.jspecify.annotations.Nullable;

public final class class03086
extends Enum<class03086>
implements class05033 {
    public static final /* enum */ class03086 field_39780 = new class03086("secure");
    public static final /* enum */ class03086 field_39781 = new class03086("modified");
    public static final /* enum */ class03086 field_39782 = new class03086("not_secure");
    public static final Codec<class03086> field_40801;
    private final String field_40802;
    private static final /* synthetic */ class03086[] field_39784;

    private class03086(String string2) {
        this.field_40802 = string2;
    }

    static {
        field_39784 = class03086.y();
        field_40801 = class05033.N(class03086::values);
    }

    public static class03086[] values() {
        return (class03086[])field_39784.clone();
    }

    public static class03086 valueOf(String string) {
        return Enum.valueOf(class03086.class, string);
    }

    private static /* synthetic */ class03086[] y() {
        return new class03086[]{field_39780, field_39781, field_39782};
    }

    public @Nullable class03054 N(class03926 class039262) {
        return switch (this.ordinal()) {
            case 1 -> class03054.N(class039262.L());
            case 2 -> class03054.L();
            default -> null;
        };
    }

    private static boolean N(class00405 class004052) {
        return !class004052.E().equals((Object)class00949.y);
    }

    public static class03086 N(class03926 class039262, class00392 class003922, Instant instant) {
        if (!class039262.Z() || class039262.y(instant)) {
            return field_39782;
        }
        if (class03086.N(class039262, class003922)) {
            return field_39781;
        }
        return field_39780;
    }

    private static boolean N(class03926 class039262, class00392 class003922) {
        if (!class003922.getString().contains(class039262.L())) {
            return true;
        }
        class00392 class003923 = class039262.m();
        if (class003923 == null) {
            return false;
        }
        return class03086.N(class003923);
    }

    private static boolean N(class00392 class003922) {
        return class003922.N((class004052, string) -> {
            if (class03086.N(class004052)) {
                return Optional.of(true);
            }
            return Optional.empty();
        }, class00405.N).orElse(false);
    }

    public boolean N() {
        return this == field_39782;
    }

    public String method_15434() {
        return this.field_40802;
    }
}

