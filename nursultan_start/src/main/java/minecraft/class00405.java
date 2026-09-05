/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09360
 *  minecraft.class00647
 *  minecraft.class00949
 *  minecraft.class05194
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09360;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00395;
import minecraft.class00647;
import minecraft.class00949;
import minecraft.class05194;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public final class class00405 {
    public static final class00405 N = new class00405(null, null, null, null, null, null, null, null, null, null, null);
    public static final int y = 0;
    final @Nullable class05194 L;
    final @Nullable Integer u;
    final @Nullable Boolean i;
    final @Nullable Boolean R;
    final @Nullable Boolean M;
    final @Nullable Boolean B;
    final @Nullable Boolean Z;
    final @Nullable class00647 z;
    final @Nullable class00395 U;
    final @Nullable String E;
    final @Nullable class00949 W;

    public boolean L() {
        return this.i == Boolean.TRUE;
    }

    public class00405 L(class06541 class065412) {
        class05194 class051942 = this.L;
        Boolean bl = this.i;
        Boolean bl2 = this.R;
        Boolean bl3 = this.B;
        Boolean bl4 = this.M;
        Boolean bl5 = this.Z;
        switch (class065412) {
            case field_1051: {
                bl5 = true;
                break;
            }
            case field_1067: {
                bl = true;
                break;
            }
            case field_1055: {
                bl3 = true;
                break;
            }
            case field_1073: {
                bl4 = true;
                break;
            }
            case field_1056: {
                bl2 = true;
                break;
            }
            case field_1070: {
                return N;
            }
            default: {
                bl5 = false;
                bl = false;
                bl3 = false;
                bl4 = false;
                bl2 = false;
                class051942 = class05194.N((class06541)class065412);
            }
        }
        return new class00405(class051942, this.u, bl, bl2, bl4, bl3, bl5, this.z, this.U, this.E, this.W);
    }

    public class00405 L(@Nullable Boolean bl) {
        if (Objects.equals(this.M, bl)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, bl, this.B, this.Z, this.z, this.U, this.E, this.W), this.M, bl);
    }

    public boolean M() {
        return this.Z == Boolean.TRUE;
    }

    private class00405(@Nullable class05194 class051942, @Nullable Integer n, @Nullable Boolean bl, @Nullable Boolean bl2, @Nullable Boolean bl3, @Nullable Boolean bl4, @Nullable Boolean bl5, @Nullable class00647 class006472, @Nullable class00395 class003952, @Nullable String string, @Nullable class00949 class009492) {
        this.L = class051942;
        this.u = n;
        this.i = bl;
        this.R = bl2;
        this.M = bl3;
        this.B = bl4;
        this.Z = bl5;
        this.z = class006472;
        this.U = class003952;
        this.E = string;
        this.W = class009492;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class00405) {
            class00405 class004052 = (class00405)object;
            return this.i == class004052.i && Objects.equals(this.N(), class004052.N()) && Objects.equals(this.y(), class004052.y()) && this.R == class004052.R && this.Z == class004052.Z && this.B == class004052.B && this.M == class004052.M && Objects.equals(this.z, class004052.z) && Objects.equals(this.U, class004052.U) && Objects.equals(this.E, class004052.E) && Objects.equals(this.W, class004052.W);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        class09360 class093602 = new class09360(this, stringBuilder);
        class093602.N("color", (Object)this.L);
        class093602.N("shadowColor", (Object)this.u);
        class093602.N("bold", this.i);
        class093602.N("italic", this.R);
        class093602.N("underlined", this.M);
        class093602.N("strikethrough", this.B);
        class093602.N("obfuscated", this.Z);
        class093602.N("clickEvent", (Object)this.z);
        class093602.N("hoverEvent", (Object)this.U);
        class093602.N("insertion", (Object)this.E);
        class093602.N("font", (Object)this.W);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public int hashCode() {
        return Objects.hash(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E);
    }

    public boolean B() {
        return this == N;
    }

    public @Nullable class00647 Z() {
        return this.z;
    }

    public class00405 i(@Nullable Boolean bl) {
        if (Objects.equals(this.Z, bl)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, bl, this.z, this.U, this.E, this.W), this.Z, bl);
    }

    public boolean i() {
        return this.B == Boolean.TRUE;
    }

    public @Nullable String U() {
        return this.E;
    }

    public @Nullable class00395 z() {
        return this.U;
    }

    public class00405 u(@Nullable Boolean bl) {
        if (Objects.equals(this.B, bl)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, bl, this.Z, this.z, this.U, this.E, this.W), this.B, bl);
    }

    public boolean u() {
        return this.R == Boolean.TRUE;
    }

    public class00405 y(@Nullable Boolean bl) {
        if (Objects.equals(this.R, bl)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, bl, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.R, bl);
    }

    public class00405 y(class06541 class065412) {
        class05194 class051942 = this.L;
        Boolean bl = this.i;
        Boolean bl2 = this.R;
        Boolean bl3 = this.B;
        Boolean bl4 = this.M;
        Boolean bl5 = this.Z;
        switch (class065412) {
            case field_1051: {
                bl5 = true;
                break;
            }
            case field_1067: {
                bl = true;
                break;
            }
            case field_1055: {
                bl3 = true;
                break;
            }
            case field_1073: {
                bl4 = true;
                break;
            }
            case field_1056: {
                bl2 = true;
                break;
            }
            case field_1070: {
                return N;
            }
            default: {
                class051942 = class05194.N((class06541)class065412);
            }
        }
        return new class00405(class051942, this.u, bl, bl2, bl4, bl3, bl5, this.z, this.U, this.E, this.W);
    }

    public class00405 y(int n) {
        if (Objects.equals(this.u, n)) {
            return this;
        }
        return class00405.N(new class00405(this.L, n, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.u, n);
    }

    public @Nullable Integer y() {
        return this.u;
    }

    public class00949 E() {
        return this.W != null ? this.W : class00949.y;
    }

    public class00405 N(@Nullable String string) {
        if (Objects.equals(this.E, string)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, string, this.W), this.E, string);
    }

    private static <T> class00405 N(class00405 class004052, @Nullable T t, @Nullable T t2) {
        if (t != null && t2 == null && class004052.equals(N)) {
            return N;
        }
        return class004052;
    }

    public static class00405 N(Optional<class05194> optional, Optional<Integer> optional2, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<Boolean> optional7, Optional<class00647> optional8, Optional<class00395> optional9, Optional<String> optional10, Optional<class00949> optional11) {
        class00405 class004052 = new class00405(optional.orElse(null), optional2.orElse(null), optional3.orElse(null), optional4.orElse(null), optional5.orElse(null), optional6.orElse(null), optional7.orElse(null), optional8.orElse(null), optional9.orElse(null), optional10.orElse(null), optional11.orElse(null));
        if (class004052.equals(N)) {
            return N;
        }
        return class004052;
    }

    public class00405 N(class06541 ... class06541Array) {
        class05194 class051942 = this.L;
        Boolean bl = this.i;
        Boolean bl2 = this.R;
        Boolean bl3 = this.B;
        Boolean bl4 = this.M;
        Boolean bl5 = this.Z;
        block8: for (class06541 class065412 : class06541Array) {
            switch (class065412) {
                case field_1051: {
                    bl5 = true;
                    continue block8;
                }
                case field_1067: {
                    bl = true;
                    continue block8;
                }
                case field_1055: {
                    bl3 = true;
                    continue block8;
                }
                case field_1073: {
                    bl4 = true;
                    continue block8;
                }
                case field_1056: {
                    bl2 = true;
                    continue block8;
                }
                case field_1070: {
                    return N;
                }
                default: {
                    class051942 = class05194.N((class06541)class065412);
                }
            }
        }
        return new class00405(class051942, this.u, bl, bl2, bl4, bl3, bl5, this.z, this.U, this.E, this.W);
    }

    public class00405 N(class00405 class004052) {
        if (this == N) {
            return class004052;
        }
        if (class004052 == N) {
            return this;
        }
        return new class00405(this.L != null ? this.L : class004052.L, this.u != null ? this.u : class004052.u, this.i != null ? this.i : class004052.i, this.R != null ? this.R : class004052.R, this.M != null ? this.M : class004052.M, this.B != null ? this.B : class004052.B, this.Z != null ? this.Z : class004052.Z, this.z != null ? this.z : class004052.z, this.U != null ? this.U : class004052.U, this.E != null ? this.E : class004052.E, this.W != null ? this.W : class004052.W);
    }

    public @Nullable class05194 N() {
        return this.L;
    }

    public class00405 N(@Nullable class06541 class065412) {
        return this.N(class065412 != null ? class05194.N((class06541)class065412) : null);
    }

    public class00405 N(int n) {
        return this.N(class05194.N((int)n));
    }

    public class00405 N(@Nullable Boolean bl) {
        if (Objects.equals(this.i, bl)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, bl, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.i, bl);
    }

    public class00405 N(@Nullable class00949 class009492) {
        if (Objects.equals(this.W, class009492)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, class009492), this.W, class009492);
    }

    public class00405 N(@Nullable class00395 class003952) {
        if (Objects.equals(this.U, class003952)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, class003952, this.E, this.W), this.U, class003952);
    }

    public class00405 N(@Nullable class00647 class006472) {
        if (Objects.equals(this.z, class006472)) {
            return this;
        }
        return class00405.N(new class00405(this.L, this.u, this.i, this.R, this.M, this.B, this.Z, class006472, this.U, this.E, this.W), this.z, class006472);
    }

    public class00405 N(@Nullable class05194 class051942) {
        if (Objects.equals(this.L, class051942)) {
            return this;
        }
        return class00405.N(new class00405(class051942, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U, this.E, this.W), this.L, class051942);
    }

    public class00405 W() {
        return this.y(0);
    }

    public boolean R() {
        return this.M == Boolean.TRUE;
    }
}

