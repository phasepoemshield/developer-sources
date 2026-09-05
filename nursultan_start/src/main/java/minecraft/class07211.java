/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  java.lang.MatchException
 *  minecraft.class00753
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07536
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import minecraft.class00753;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07212;
import minecraft.class07536;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class07211
extends Enum<class07211>
implements class05033 {
    public static final /* enum */ class07211 field_11033 = new class07211(0, 1, -1, "down", class07212.field_11060, class07185.field_11052, new class00753(0, -1, 0));
    public static final /* enum */ class07211 field_11036 = new class07211(1, 0, -1, "up", class07212.field_11056, class07185.field_11052, new class00753(0, 1, 0));
    public static final /* enum */ class07211 field_11043 = new class07211(2, 3, 2, "north", class07212.field_11060, class07185.field_11051, new class00753(0, 0, -1));
    public static final /* enum */ class07211 field_11035 = new class07211(3, 2, 0, "south", class07212.field_11056, class07185.field_11051, new class00753(0, 0, 1));
    public static final /* enum */ class07211 field_11039 = new class07211(4, 5, 1, "west", class07212.field_11060, class07185.field_11048, new class00753(-1, 0, 0));
    public static final /* enum */ class07211 field_11034 = new class07211(5, 4, 3, "east", class07212.field_11056, class07185.field_11048, new class00753(1, 0, 0));
    public static final class05031<class07211> field_29502;
    public static final Codec<class07211> field_35088;
    public static final IntFunction<class07211> field_48449;
    public static final class02362<ByteBuf, class07211> field_48450;
    @Deprecated
    public static final Codec<class07211> field_57037;
    @Deprecated
    public static final Codec<class07211> field_57038;
    public static final ImmutableList<class07185> field_61964;
    private static final ImmutableList<class07185> field_61965;
    private final int field_11032;
    private final int field_11031;
    private final int field_11030;
    private final String field_11046;
    private final class07185 field_11047;
    private final class07212 field_11044;
    private final class00753 field_11042;
    private final class06889 field_53685;
    private final Vector3fc field_57039;
    private static final class07211[] field_11040;
    private static final class07211[] field_11038;
    private static final class07211[] field_11041;
    private static final /* synthetic */ class07211[] field_11037;
    private int offsetX;
    private int offsetY;
    private int offsetZ;

    public int L() {
        return this.field_11032;
    }

    private static /* synthetic */ class07211[] L(int n) {
        return new class07211[n];
    }

    public class07211 M() {
        return switch (this.ordinal()) {
            case 2 -> field_11039;
            case 5 -> field_11043;
            case 3 -> field_11034;
            case 4 -> field_11035;
            default -> throw new IllegalStateException("Unable to get CCW facing of " + String.valueOf((Object)this));
        };
    }

    private static /* synthetic */ Byte M(class07211 class072112) {
        return (byte)class072112.L();
    }

    public int P() {
        return this.offsetX;
    }

    public int T() {
        return this.offsetZ;
    }

    private class07211(int n2, int n3, int n4, String string2, class07212 class072122, class07185 class071852, class00753 class007532) {
        this.field_11032 = n2;
        this.field_11030 = n4;
        this.field_11031 = n3;
        this.field_11046 = string2;
        this.field_11047 = class071852;
        this.field_11044 = class072122;
        this.field_11042 = class007532;
        this.field_53685 = class06889.N((class00753)class007532);
        this.field_57039 = new Vector3f((float)class007532.method_10263(), (float)class007532.method_10264(), (float)class007532.method_10260());
        this.N(string, n, n2, n3, n4, string2, class072122, class071852, class007532, null);
    }

    public String toString() {
        return this.field_11046;
    }

    public static class07211[] values() {
        return (class07211[])field_11037.clone();
    }

    public static class07211 valueOf(String string) {
        return Enum.valueOf(class07211.class, string);
    }

    public Vector3f B() {
        return new Vector3f(this.field_57039);
    }

    public String Z() {
        return this.field_11046;
    }

    public class07212 i() {
        return this.field_11044;
    }

    public class07211 b() {
        return field_11040[this.field_11031];
    }

    public int s() {
        return this.offsetY;
    }

    private class07211 n() {
        return switch (this.ordinal()) {
            case 1 -> field_11034;
            case 5 -> field_11033;
            case 0 -> field_11039;
            case 4 -> field_11036;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + String.valueOf((Object)this));
        };
    }

    private static /* synthetic */ class07211[] l() {
        return new class07211[]{field_11033, field_11036, field_11043, field_11035, field_11039, field_11034};
    }

    public Vector3fc m() {
        return this.field_57039;
    }

    private class07211 t() {
        return switch (this.ordinal()) {
            case 1 -> field_11039;
            case 4 -> field_11033;
            case 0 -> field_11034;
            case 5 -> field_11036;
            default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + String.valueOf((Object)this));
        };
    }

    private class07211 v() {
        return switch (this.ordinal()) {
            case 1 -> field_11035;
            case 3 -> field_11033;
            case 0 -> field_11043;
            case 2 -> field_11036;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + String.valueOf((Object)this));
        };
    }

    private class07211 j() {
        return switch (this.ordinal()) {
            case 1 -> field_11043;
            case 2 -> field_11033;
            case 0 -> field_11035;
            case 3 -> field_11036;
            default -> throw new IllegalStateException("Unable to get X-rotated facing of " + String.valueOf((Object)this));
        };
    }

    public float U() {
        return (this.field_11030 & 3) * 90;
    }

    public class07185 z() {
        return this.field_11047;
    }

    public int u() {
        return this.field_11030;
    }

    private static /* synthetic */ class07211[] u(int n) {
        return new class07211[n];
    }

    private static DataResult<class07211> y(class07211 class072112) {
        return class072112.z().y() ? DataResult.success((Object)((Object)class072112)) : DataResult.error(() -> "Expected a vertical direction");
    }

    public Quaternionf y() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> new Quaternionf().rotationX((float)Math.PI);
            case 1 -> new Quaternionf();
            case 2 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, (float)Math.PI);
            case 3 -> new Quaternionf().rotationX(1.5707964f);
            case 4 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, 1.5707964f);
            case 5 -> new Quaternionf().rotationXYZ(1.5707964f, 0.0f, -1.5707964f);
        };
    }

    public static ImmutableList<class07185> y(class06889 class068892) {
        if (Math.abs(class068892.M) < Math.abs(class068892.Z)) {
            return field_61965;
        }
        return field_61964;
    }

    public class07211 y(class07185 class071852) {
        return switch (class071852.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (this == field_11039 || this == field_11034) {
                    yield this;
                }
                yield this.v();
            }
            case 1 -> {
                if (this == field_11036 || this == field_11033) {
                    yield this;
                }
                yield this.M();
            }
            case 2 -> this == field_11043 || this == field_11035 ? this : this.t();
        };
    }

    public static class07211 y(int n) {
        return field_11041[class04995.N((int)(n % field_11041.length))];
    }

    public static class07211 y(class06069 class060692) {
        return field_11040[class060692.y(field_11040.length)];
    }

    public class00753 E() {
        return this.field_11042;
    }

    public class07211 N(class07185 class071852) {
        return switch (class071852.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (this == field_11039 || this == field_11034) {
                    yield this;
                }
                yield this.j();
            }
            case 1 -> {
                if (this == field_11036 || this == field_11033) {
                    yield this;
                }
                yield this.R();
            }
            case 2 -> this == field_11043 || this == field_11035 ? this : this.n();
        };
    }

    public static class07211 N(class07049 class070492, class07185 class071852) {
        return switch (class071852.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (field_11034.N(class070492.method_5705(1.0f))) {
                    yield field_11034;
                }
                yield field_11039;
            }
            case 2 -> {
                if (field_11035.N(class070492.method_5705(1.0f))) {
                    yield field_11035;
                }
                yield field_11043;
            }
            case 1 -> class070492.method_5695(1.0f) < 0.0f ? field_11036 : field_11033;
        };
    }

    public static class07211 N(Matrix4fc matrix4fc, class07211 class072112) {
        Vector3f vector3f = matrix4fc.transformDirection(class072112.field_57039, new Vector3f());
        return class07211.N(vector3f.x(), vector3f.y(), vector3f.z());
    }

    private static class07211[] N(class07211 class072112, class07211 class072113, class07211 class072114) {
        return new class07211[]{class072112, class072113, class072114, class072114.b(), class072113.b(), class072112.b()};
    }

    public static class07211[] N(class07049 class070492) {
        class07211 class072112;
        float f = class070492.method_5695(1.0f) * ((float)Math.PI / 180);
        float f2 = -class070492.method_5705(1.0f) * ((float)Math.PI / 180);
        float f3 = class04995.m((double)f);
        float f4 = class04995.P((double)f);
        float f5 = class04995.m((double)f2);
        float f6 = class04995.P((double)f2);
        boolean bl = f5 > 0.0f;
        boolean bl2 = f3 < 0.0f;
        boolean bl3 = f6 > 0.0f;
        float f7 = bl ? f5 : -f5;
        float f8 = bl2 ? -f3 : f3;
        float f9 = bl3 ? f6 : -f6;
        float f10 = f7 * f4;
        float f11 = f9 * f4;
        class07211 class072113 = bl ? field_11034 : field_11039;
        class07211 class072114 = bl2 ? field_11036 : field_11033;
        class07211 class072115 = class072112 = bl3 ? field_11035 : field_11043;
        if (f7 > f9) {
            if (f8 > f10) {
                return class07211.N(class072114, class072113, class072112);
            }
            if (f11 > f8) {
                return class07211.N(class072113, class072112, class072114);
            }
            return class07211.N(class072113, class072114, class072112);
        }
        if (f8 > f11) {
            return class07211.N(class072114, class072112, class072113);
        }
        if (f10 > f8) {
            return class07211.N(class072112, class072113, class072114);
        }
        return class07211.N(class072112, class072114, class072113);
    }

    public static class07211 N(float f, float f2, float f3) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f) {
            return field_11043;
        }
        float f4 = Math.abs(f2);
        float f5 = Math.abs(f3);
        float f6 = Math.abs(f);
        if (f4 >= f5) {
            if (f4 >= f6) {
                if (f2 <= 0.0f) {
                    return field_11033;
                }
                return field_11036;
            }
        } else if (f5 >= f6) {
            if (f3 <= 0.0f) {
                return field_11043;
            }
            return field_11035;
        }
        if (f <= 0.0f) {
            return field_11039;
        }
        return field_11034;
    }

    public static float N(class07211 class072112) {
        return switch (class072112.ordinal()) {
            case 2 -> 180.0f;
            case 3 -> 0.0f;
            case 4 -> 90.0f;
            case 5 -> -90.0f;
            default -> throw new IllegalStateException("No y-Rot for vertical axis: " + String.valueOf((Object)class072112));
        };
    }

    public static Stream<class07211> N() {
        return Stream.of(field_11040);
    }

    private void N(String string, int n, int n2, int n3, int n4, String string2, class07212 class072122, class07185 class071852, class00753 class007532, CallbackInfo callbackInfo) {
        this.offsetX = class007532.method_10263();
        this.offsetY = class007532.method_10264();
        this.offsetZ = class007532.method_10260();
    }

    public static Collection<class07211> N(class06069 class060692) {
        return class07536.y((Object[])class07211.values(), (class06069)class060692);
    }

    public static class07211 N(double d, double d2, double d3) {
        return class07211.N((float)d, (float)d2, (float)d3);
    }

    public static class07211 N(class06889 class068892) {
        return class07211.N(class068892.M, class068892.B, class068892.Z);
    }

    public static @Nullable class07211 N(int n, int n2, int n3, @Nullable class07211 class072112) {
        int n4 = Math.abs(n);
        int n5 = Math.abs(n2);
        int n6 = Math.abs(n3);
        if (n4 > n6 && n4 > n5) {
            return n < 0 ? field_11039 : field_11034;
        }
        if (n6 > n4 && n6 > n5) {
            return n3 < 0 ? field_11043 : field_11035;
        }
        if (n5 > n4 && n5 > n6) {
            return n2 < 0 ? field_11033 : field_11036;
        }
        return class072112;
    }

    public static @Nullable class07211 N(String string) {
        return (class07211)field_29502.N(string);
    }

    public static class07211 N(class07185 class071852, class07212 class072122) {
        return switch (class071852.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (class072122 == class07212.field_11056) {
                    yield field_11034;
                }
                yield field_11039;
            }
            case 1 -> {
                if (class072122 == class07212.field_11056) {
                    yield field_11036;
                }
                yield field_11033;
            }
            case 2 -> class072122 == class07212.field_11056 ? field_11035 : field_11043;
        };
    }

    public static class07211 N(double d) {
        return class07211.y(class04995.N((double)(d / 90.0 + 0.5)) & 3);
    }

    public static class07211 N(int n) {
        return field_11038[class04995.N((int)(n % field_11038.length))];
    }

    public boolean N(float f) {
        float f2 = f * ((float)Math.PI / 180);
        float f3 = -class04995.m((double)f2);
        float f4 = class04995.P((double)f2);
        return (float)this.field_11042.method_10263() * f3 + (float)this.field_11042.method_10260() * f4 > 0.0f;
    }

    public static @Nullable class07211 N(class00753 class007532, @Nullable class07211 class072112) {
        return class07211.N(class007532.method_10263(), class007532.method_10264(), class007532.method_10260(), class072112);
    }

    public static class07211 N(class07212 class072122, class07185 class071852) {
        for (class07211 class072112 : field_11040) {
            if (class072112.i() != class072122 || class072112.z() != class071852) continue;
            return class072112;
        }
        throw new IllegalArgumentException("No such direction: " + String.valueOf((Object)class072122) + " " + String.valueOf(class071852));
    }

    public class06889 W() {
        return this.field_53685;
    }

    public class07211 R() {
        return switch (this.ordinal()) {
            case 2 -> field_11034;
            case 5 -> field_11035;
            case 3 -> field_11039;
            case 4 -> field_11043;
            default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + String.valueOf((Object)this));
        };
    }

    private static /* synthetic */ Byte R(class07211 class072112) {
        return (byte)class072112.u();
    }

    public String method_15434() {
        return this.field_11046;
    }

    static {
        field_11037 = class07211.l();
        field_29502 = class05033.N(class07211::values);
        field_35088 = field_29502.validate(class07211::y);
        field_48449 = class02121.N(class07211::L, (Object[])class07211.values(), (class02126)class02126.field_41665);
        field_48450 = class02389.N(field_48449, class07211::L);
        field_57037 = Codec.BYTE.xmap(class07211::N, class072112 -> (byte)class072112.L());
        field_57038 = Codec.BYTE.xmap(class07211::y, class072112 -> (byte)class072112.u());
        field_61964 = ImmutableList.of((Object)class07185.field_11052, (Object)class07185.field_11048, (Object)class07185.field_11051);
        field_61965 = ImmutableList.of((Object)class07185.field_11052, (Object)class07185.field_11051, (Object)class07185.field_11048);
        field_11040 = class07211.values();
        field_11038 = (class07211[])Arrays.stream(field_11040).sorted(Comparator.comparingInt(class072112 -> class072112.field_11032)).toArray(class07211[]::new);
        field_11041 = (class07211[])Arrays.stream(field_11040).filter(class072112 -> class072112.z().L()).sorted(Comparator.comparingInt(class072112 -> class072112.field_11030)).toArray(class07211[]::new);
    }
}

