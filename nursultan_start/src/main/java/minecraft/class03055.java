/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00667
 *  minecraft.class05033
 *  minecraft.class05216
 *  minecraft.class06338
 *  minecraft.class06541
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00667;
import minecraft.class03084;
import minecraft.class05033;
import minecraft.class05216;
import minecraft.class06338;
import minecraft.class06541;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03055 {
    public static final Codec<class03055> N = class05033.N(class03084::values).dispatch(class03055::L, class03084::N);
    public static final class03055 y = new class03055(new BitSet(0), class03084.field_39948);
    public static final class03055 L = new class03055(new BitSet(0), class03084.field_39947);
    public static final class00405 u = class00405.N.N(class06541.field_1063).N((class00395)new class00401((class00392)class00392.L((String)"chat.filtered")));
    static final MapCodec<class03055> i = MapCodec.unit((Object)L);
    static final MapCodec<class03055> R = MapCodec.unit((Object)y);
    static final MapCodec<class03055> M = class06338.O.xmap(class03055::new, class03055::u).fieldOf("value");
    private static final char B = '#';
    private final BitSet Z;
    private final class03084 z;

    private class03084 L() {
        return this.z;
    }

    public class03055(int n) {
        this(new BitSet(n), class03084.field_39949);
    }

    private class03055(BitSet bitSet) {
        this.Z = bitSet;
        this.z = class03084.field_39949;
    }

    private class03055(BitSet bitSet, class03084 class030842) {
        this.Z = bitSet;
        this.z = class030842;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class03055 class030552 = (class03055)object;
        return this.Z.equals(class030552.Z) && this.z == class030552.z;
    }

    public int hashCode() {
        int n = this.Z.hashCode();
        n = 31 * n + this.z.hashCode();
        return n;
    }

    private BitSet u() {
        return this.Z;
    }

    public @Nullable class00392 y(String string) {
        return switch (this.z.ordinal()) {
            default -> throw new MatchException(null, null);
            case 1 -> null;
            case 0 -> class00392.y((String)string);
            case 2 -> {
                class05216 var2_2 = class00392.i();
                int var3_3 = 0;
                boolean var4_4 = this.Z.get(0);
                while (true) {
                    int var5_5 = var4_4 ? this.Z.nextClearBit(var3_3) : this.Z.nextSetBit(var3_3);
                    int v1 = var5_5 = var5_5 < 0 ? string.length() : var5_5;
                    if (var5_5 == var3_3) break;
                    if (var4_4) {
                        var2_2.y((class00392)class00392.y((String)StringUtils.repeat((char)'#', (int)(var5_5 - var3_3))).L(u));
                    } else {
                        var2_2.i(string.substring(var3_3, var5_5));
                    }
                    var4_4 = !var4_4;
                    var3_3 = var5_5;
                }
                yield var2_2;
            }
        };
    }

    public boolean y() {
        return this.z == class03084.field_39948;
    }

    public void N(int n) {
        this.Z.set(n);
    }

    public static class03055 N(class00667 class006672) {
        return switch (((class03084)class006672.y(class03084.class)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> L;
            case 1 -> y;
            case 2 -> new class03055(class006672.t(), class03084.field_39949);
        };
    }

    public static void N(class00667 class006672, class03055 class030552) {
        class006672.N((Enum)class030552.z);
        if (class030552.z == class03084.field_39949) {
            class006672.N(class030552.Z);
        }
    }

    public @Nullable String N(String string) {
        return switch (this.z.ordinal()) {
            default -> throw new MatchException(null, null);
            case 1 -> null;
            case 0 -> string;
            case 2 -> {
                char[] var2_2 = string.toCharArray();
                for (int var3_3 = 0; var3_3 < var2_2.length && var3_3 < this.Z.length(); ++var3_3) {
                    if (!this.Z.get(var3_3)) continue;
                    var2_2[var3_3] = 35;
                }
                yield new String(var2_2);
            }
        };
    }

    public boolean N() {
        return this.z == class03084.field_39947;
    }
}

