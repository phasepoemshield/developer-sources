/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.UnsignedBytes
 *  com.mojang.serialization.DynamicOps
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02325
 *  minecraft.class08876
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.primitives.UnsignedBytes;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import minecraft.class00150;
import minecraft.class00154;
import minecraft.class00157;
import minecraft.class00162;
import minecraft.class00182;
import minecraft.class02325;
import minecraft.class08876;
import org.jspecify.annotations.Nullable;

final class class00170
extends Record {
    private final class00150 sign;
    private final class00182 base;
    private final String digits;
    final class00154 suffix;

    public String L() {
        return this.digits;
    }

    class00170(class00150 class001502, class00182 class001822, String string, class00154 class001542) {
        this.sign = class001502;
        this.base = class001822;
        this.digits = string;
        this.suffix = class001542;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00170.class, "sign;base;digits;suffix", "sign", "base", "digits", "suffix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00170.class, "sign;base;digits;suffix", "sign", "base", "digits", "suffix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00170.class, "sign;base;digits;suffix", "sign", "base", "digits", "suffix"}, this);
    }

    private class00162 i() {
        if (this.suffix.N() != null) {
            return this.suffix.N();
        }
        return switch (this.base.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 2 -> class00162.field_58018;
            case 1 -> class00162.field_58017;
        };
    }

    public class00154 u() {
        return this.suffix;
    }

    public class00182 y() {
        return this.base;
    }

    public <T> @Nullable T N(DynamicOps<T> dynamicOps, class00157 class001572, class02325<?> class023252) {
        boolean bl;
        boolean bl2 = bl = this.i() == class00162.field_58017;
        if (!bl && this.sign == class00150.field_58015) {
            class023252.y().N(class023252.M(), (Object)class08876.L);
            return null;
        }
        String string = this.N(this.sign);
        int n = switch (this.base.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 2;
            case 1 -> 10;
            case 2 -> 16;
        };
        try {
            if (bl) {
                return (T)(switch (class001572.ordinal()) {
                    case 2 -> dynamicOps.createByte(Byte.parseByte(string, n));
                    case 3 -> dynamicOps.createShort(Short.parseShort(string, n));
                    case 4 -> dynamicOps.createInt(Integer.parseInt(string, n));
                    case 5 -> dynamicOps.createLong(Long.parseLong(string, n));
                    default -> {
                        class023252.y().N(class023252.M(), (Object)class08876.y);
                        yield null;
                    }
                });
            }
            return (T)(switch (class001572.ordinal()) {
                case 2 -> dynamicOps.createByte(UnsignedBytes.parseUnsignedByte((String)string, (int)n));
                case 3 -> dynamicOps.createShort(class08876.N((String)string, (int)n));
                case 4 -> dynamicOps.createInt(Integer.parseUnsignedInt(string, n));
                case 5 -> dynamicOps.createLong(Long.parseUnsignedLong(string, n));
                default -> {
                    class023252.y().N(class023252.M(), (Object)class08876.y);
                    yield null;
                }
            });
        }
        catch (NumberFormatException numberFormatException) {
            class023252.y().N(class023252.M(), (Object)class08876.N((NumberFormatException)numberFormatException));
            return null;
        }
    }

    public class00150 N() {
        return this.sign;
    }

    private String N(class00150 class001502) {
        boolean bl = class08876.N((String)this.digits);
        if (class001502 == class00150.field_58015 || bl) {
            StringBuilder stringBuilder = new StringBuilder();
            class001502.N(stringBuilder);
            class08876.N((StringBuilder)stringBuilder, (String)this.digits, (boolean)bl);
            return stringBuilder.toString();
        }
        return this.digits;
    }

    public <T> @Nullable T N(DynamicOps<T> dynamicOps, class02325<?> class023252) {
        return this.N(dynamicOps, Objects.requireNonNullElse(this.suffix.y(), class00157.field_58024), class023252);
    }
}

