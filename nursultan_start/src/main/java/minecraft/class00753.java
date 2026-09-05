/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00737
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07536
 *  org.joml.Vector3i
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.stream.IntStream;
import minecraft.class00737;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07536;
import org.joml.Vector3i;

public class class00753
implements Comparable<class00753> {
    public static final Codec<class00753> field_25123 = Codec.INT_STREAM.comapFlatMap(intStream -> class07536.N((IntStream)intStream, (int)3).map(nArray -> new class00753(nArray[0], nArray[1], nArray[2])), class007532 -> IntStream.of(class007532.method_10263(), class007532.method_10264(), class007532.method_10260()));
    public static final class02362<ByteBuf, class00753> field_56131 = class02362.N((class02362)class02389.B, class00753::method_10263, (class02362)class02389.B, class00753::method_10264, (class02362)class02389.B, class00753::method_10260, class00753::new);
    public static final class00753 field_11176 = new class00753(0, 0, 0);
    private int field_11175;
    private int field_11174;
    private int field_11173;

    public int method_10260() {
        return this.field_11173;
    }

    public int method_10263() {
        return this.field_11175;
    }

    public int method_10264() {
        return this.field_11174;
    }

    public class00753(int n, int n2, int n3) {
        this.field_11175 = n;
        this.field_11174 = n2;
        this.field_11173 = n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00753)) {
            return false;
        }
        class00753 class007532 = (class00753)object;
        return this.method_10263() == class007532.method_10263() && this.method_10264() == class007532.method_10264() && this.method_10260() == class007532.method_10260();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.method_10263()).add("y", this.method_10264()).add("z", this.method_10260()).toString();
    }

    public int hashCode() {
        return (this.method_10264() + this.method_10260() * 31) * 31 + this.method_10263();
    }

    public int method_65076(class00753 class007532) {
        int n = Math.abs(this.method_10263() - class007532.method_10263());
        int n2 = Math.abs(this.method_10264() - class007532.method_10264());
        int n3 = Math.abs(this.method_10260() - class007532.method_10260());
        return Math.max(Math.max(n, n2), n3);
    }

    public class00753 method_35850(class07185 class071852, int n) {
        if (n == 0) {
            return this;
        }
        int n2 = class071852 == class07185.field_11048 ? n : 0;
        int n3 = class071852 == class07185.field_11052 ? n : 0;
        int n4 = class071852 == class07185.field_11051 ? n : 0;
        return new class00753(this.method_10263() + n2, this.method_10264() + n3, this.method_10260() + n4);
    }

    public class00753 method_23227(int n) {
        return this.method_23226(class07211.field_11033, n);
    }

    protected class00753 method_20788(int n) {
        this.field_11173 = n;
        return this;
    }

    public class00753 method_35852(class00753 class007532) {
        return this.method_34592(-class007532.method_10263(), -class007532.method_10264(), -class007532.method_10260());
    }

    public class00753 method_35851(class07211 class072112) {
        return this.method_23226(class072112, 1);
    }

    public String method_23854() {
        return this.method_10263() + ", " + this.method_10264() + ", " + this.method_10260();
    }

    public class00753 method_35862(int n) {
        if (n == 1) {
            return this;
        }
        if (n == 0) {
            return field_11176;
        }
        return new class00753(this.method_10263() * n, this.method_10264() * n, this.method_10260() * n);
    }

    public double method_10268(double d, double d2, double d3) {
        double d4 = (double)this.method_10263() + 0.5 - d;
        double d5 = (double)this.method_10264() + 0.5 - d2;
        double d6 = (double)this.method_10260() + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public class00753 method_35856(int n) {
        return this.method_23226(class07211.field_11039, n);
    }

    public double method_40081(double d, double d2, double d3) {
        double d4 = (double)this.method_10263() - d;
        double d5 = (double)this.method_10264() - d2;
        double d6 = (double)this.method_10260() - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public class00753 method_35859() {
        return this.method_35858(1);
    }

    public class00753 method_10259(class00753 class007532) {
        return new class00753(this.method_10264() * class007532.method_10260() - this.method_10260() * class007532.method_10264(), this.method_10260() * class007532.method_10263() - this.method_10263() * class007532.method_10260(), this.method_10263() * class007532.method_10264() - this.method_10264() * class007532.method_10263());
    }

    public class00753 method_23226(class07211 class072112, int n) {
        if (n == 0) {
            return this;
        }
        return new class00753(this.method_10263() + class072112.P() * n, this.method_10264() + class072112.s() * n, this.method_10260() + class072112.T() * n);
    }

    public class00753 method_34592(int n, int n2, int n3) {
        if (n == 0 && n2 == 0 && n3 == 0) {
            return this;
        }
        return new class00753(this.method_10263() + n, this.method_10264() + n2, this.method_10260() + n3);
    }

    public class00753 method_35855() {
        return this.method_35854(1);
    }

    public class00753 method_35857() {
        return this.method_35856(1);
    }

    public class00753 method_35858(int n) {
        return this.method_23226(class07211.field_11035, n);
    }

    public class00753 method_35854(int n) {
        return this.method_23226(class07211.field_11034, n);
    }

    public class00753 method_30931() {
        return this.method_30930(1);
    }

    public class00753 method_23228() {
        return this.method_23227(1);
    }

    public class00753 method_35853(class00753 class007532) {
        return this.method_34592(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    protected class00753 method_10099(int n) {
        this.field_11174 = n;
        return this;
    }

    public int method_19455(class00753 class007532) {
        float f = Math.abs(class007532.method_10263() - this.method_10263());
        float f2 = Math.abs(class007532.method_10264() - this.method_10264());
        float f3 = Math.abs(class007532.method_10260() - this.method_10260());
        return (int)(f + f2 + f3);
    }

    public int method_30558(class07185 class071852) {
        return class071852.N(this.field_11175, this.field_11174, this.field_11173);
    }

    public boolean method_19771(class00753 class007532, double d) {
        return this.method_10262(class007532) < class04995.E((double)d);
    }

    public class00753 method_35860(int n) {
        return this.method_23226(class07211.field_11043, n);
    }

    public static Codec<class00753> method_39677(int n) {
        return field_25123.validate(class007532 -> {
            if (Math.abs(class007532.method_10263()) < n && Math.abs(class007532.method_10264()) < n && Math.abs(class007532.method_10260()) < n) {
                return DataResult.success((Object)class007532);
            }
            return DataResult.error(() -> "Position out of range, expected at most " + n + ": " + String.valueOf(class007532));
        });
    }

    public class00753 method_75504(int n, int n2, int n3) {
        return new class00753(this.method_10263() * n, this.method_10264() * n2, this.method_10260() * n3);
    }

    public Vector3i method_75505() {
        return new Vector3i(this.field_11175, this.field_11174, this.field_11173);
    }

    public class00753 method_35861() {
        return this.method_35860(1);
    }

    public class00753 method_30930(int n) {
        return this.method_23226(class07211.field_11036, n);
    }

    protected class00753 method_20787(int n) {
        this.field_11175 = n;
        return this;
    }

    public double method_10262(class00753 class007532) {
        return this.method_40081(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public boolean method_19769(class00737 class007372, double d) {
        return this.method_19770(class007372) < class04995.E((double)d);
    }

    public double method_19770(class00737 class007372) {
        return this.method_10268(class007372.N(), class007372.y(), class007372.L());
    }

    @Override
    public int compareTo(class00753 class007532) {
        if (this.method_10264() == class007532.method_10264()) {
            if (this.method_10260() == class007532.method_10260()) {
                return this.method_10263() - class007532.method_10263();
            }
            return this.method_10260() - class007532.method_10260();
        }
        return this.method_10264() - class007532.method_10264();
    }
}

