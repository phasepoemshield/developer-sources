/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07109
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07536
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06873;
import minecraft.class07109;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07536;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class06889
implements class00737 {
    public static final Codec<class06889> N = Codec.DOUBLE.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)3).map(list -> new class06889((Double)list.get(0), (Double)list.get(1), (Double)list.get(2))), class068892 -> List.of(Double.valueOf(class068892.N()), Double.valueOf(class068892.y()), Double.valueOf(class068892.L())));
    public static final class02362<ByteBuf, class06889> y = new class06873();
    public static final class06889 L = new class06889(0.0, 0.0, 0.0);
    public static final class06889 u = new class06889(1.0, 0.0, 0.0);
    public static final class06889 i = new class06889(0.0, 1.0, 0.0);
    public static final class06889 R = new class06889(0.0, 0.0, 1.0);
    public final double M;
    public final double B;
    public final double Z;

    public class06889 L(double d) {
        return this.u(d, d, d);
    }

    public double L(double d, double d2, double d3) {
        double d4 = d - this.M;
        double d5 = d2 - this.B;
        double d6 = d3 - this.Z;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public static class06889 L(class00753 class007532) {
        return class06889.N(class007532, 0.5, 0.0, 0.5);
    }

    public class06889 L(class06889 class068892) {
        return new class06889(this.B * class068892.Z - this.Z * class068892.B, this.Z * class068892.M - this.M * class068892.Z, this.M * class068892.B - this.B * class068892.M);
    }

    public final double L() {
        return this.Z;
    }

    public class06889 L(float f) {
        float f2 = class04995.P((double)f);
        float f3 = class04995.m((double)f);
        double d = this.M * (double)f2 + this.B * (double)f3;
        double d2 = this.B * (double)f2 - this.M * (double)f3;
        double d3 = this.Z;
        return new class06889(d, d2, d3);
    }

    public double M(class06889 class068892) {
        double d = class068892.M - this.M;
        double d2 = class068892.B - this.B;
        double d3 = class068892.Z - this.Z;
        return d * d + d2 * d2 + d3 * d3;
    }

    public double M() {
        return Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z);
    }

    public class06889(Vector3fc vector3fc) {
        this(vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    public class06889(double d, double d2, double d3) {
        this.M = d;
        this.B = d2;
        this.Z = d3;
    }

    public class06889(class00753 class007532) {
        this(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class06889)) {
            return false;
        }
        class06889 class068892 = (class06889)object;
        if (Double.compare(class068892.M, this.M) != 0) {
            return false;
        }
        if (Double.compare(class068892.B, this.B) != 0) {
            return false;
        }
        return Double.compare(class068892.Z, this.Z) == 0;
    }

    public String toString() {
        return "(" + this.M + ", " + this.B + ", " + this.Z + ")";
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.M);
        int n = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.B);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.Z);
        n = 31 * n + (int)(l ^ l >>> 32);
        return n;
    }

    public class06889 B(class06889 class068892) {
        return this.u(class068892.M, class068892.B, class068892.Z);
    }

    public double B() {
        return this.M * this.M + this.B * this.B + this.Z * this.Z;
    }

    public double Z() {
        return Math.sqrt(this.M * this.M + this.Z * this.Z);
    }

    public class06889 Z(class06889 class068892) {
        if (class068892.B() == 0.0) {
            return class068892;
        }
        return class068892.L(this.y(class068892)).L(1.0 / class068892.B());
    }

    public class06889 i() {
        return this.L(-1.0);
    }

    public class06889 i(class06889 class068892) {
        return this.y(class068892.M, class068892.B, class068892.Z);
    }

    public boolean m() {
        return Double.isFinite(this.M) && Double.isFinite(this.B) && Double.isFinite(this.Z);
    }

    public class06889 U() {
        return new class06889(-this.Z, this.B, this.M);
    }

    public double z() {
        return this.M * this.M + this.Z * this.Z;
    }

    public class06889 z(class06889 class068892) {
        return class06889.N(this.E(), class068892);
    }

    public class06889 u(class06889 class068892) {
        return this.N(class068892.M, class068892.B, class068892.Z);
    }

    public class06889 u(double d, double d2, double d3) {
        return new class06889(this.M * d, this.B * d2, this.Z * d3);
    }

    public class06889 u() {
        double d = Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z);
        if (d < (double)1.0E-5f) {
            return L;
        }
        return new class06889(this.M / d, this.B / d, this.Z / d);
    }

    public class06889 y(double d) {
        return this.y(d, d, d);
    }

    public double y(class06889 class068892) {
        return this.M * class068892.M + this.B * class068892.B + this.Z * class068892.Z;
    }

    public final double y() {
        return this.B;
    }

    public static class06889 y(class00753 class007532) {
        return class06889.N(class007532, 0.5, 0.5, 0.5);
    }

    public class06889 y(double d, double d2, double d3) {
        return new class06889(this.M + d, this.B + d2, this.Z + d3);
    }

    public class06889 y(float f) {
        float f2 = class04995.P((double)f);
        float f3 = class04995.m((double)f);
        double d = this.M * (double)f2 + this.Z * (double)f3;
        double d2 = this.B;
        double d3 = this.Z * (double)f2 - this.M * (double)f3;
        return new class06889(d, d2, d3);
    }

    public class06889 y(class06069 class060692, float f) {
        return this.y((class060692.z() - 0.5f) * f, 0.0, (class060692.z() - 0.5f) * f);
    }

    public class07109 E() {
        float f = (float)Math.atan2(-this.M, this.Z) * 57.295776f;
        float f2 = (float)Math.asin(-this.B / Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z)) * 57.295776f;
        return new class07109(f2, f);
    }

    public class06889 N(class07211 class072112, double d) {
        class00753 class007532 = class072112.E();
        return new class06889(this.M + d * (double)class007532.method_10263(), this.B + d * (double)class007532.method_10264(), this.Z + d * (double)class007532.method_10260());
    }

    public double N(class07185 class071852) {
        return class071852.N(this.M, this.B, this.Z);
    }

    public final double N() {
        return this.M;
    }

    public class06889 N(class07185 class071852, double d) {
        double d2 = class071852 == class07185.field_11048 ? d : this.M;
        double d3 = class071852 == class07185.field_11052 ? d : this.B;
        double d4 = class071852 == class07185.field_11051 ? d : this.Z;
        return new class06889(d2, d3, d4);
    }

    public class06889 N(double d) {
        return this.N(d, d, d);
    }

    public class06889 N(double d, double d2, double d3) {
        return this.y(-d, -d2, -d3);
    }

    public static class06889 N(class07109 class071092, class06889 class068892) {
        float f = class04995.P((double)((class071092.U + 90.0f) * ((float)Math.PI / 180)));
        float f2 = class04995.m((double)((class071092.U + 90.0f) * ((float)Math.PI / 180)));
        float f3 = class04995.P((double)(-class071092.z * ((float)Math.PI / 180)));
        float f4 = class04995.m((double)(-class071092.z * ((float)Math.PI / 180)));
        float f5 = class04995.P((double)((-class071092.z + 90.0f) * ((float)Math.PI / 180)));
        float f6 = class04995.m((double)((-class071092.z + 90.0f) * ((float)Math.PI / 180)));
        class06889 class068893 = new class06889(f * f3, f4, f2 * f3);
        class06889 class068894 = new class06889(f * f5, f6, f2 * f5);
        class06889 class068895 = class068893.L(class068894).L(-1.0);
        double d = class068893.M * class068892.Z + class068894.M * class068892.B + class068895.M * class068892.M;
        double d2 = class068893.B * class068892.Z + class068894.B * class068892.B + class068895.B * class068892.M;
        double d3 = class068893.Z * class068892.Z + class068894.Z * class068892.B + class068895.Z * class068892.M;
        return new class06889(d, d2, d3);
    }

    public static class06889 N(class00753 class007532, double d, double d2, double d3) {
        return new class06889((double)class007532.method_10263() + d, (double)class007532.method_10264() + d2, (double)class007532.method_10260() + d3);
    }

    public class06889 N(float f) {
        float f2 = class04995.P((double)f);
        float f3 = class04995.m((double)f);
        double d = this.M;
        double d2 = this.B * (double)f2 + this.Z * (double)f3;
        double d3 = this.Z * (double)f2 - this.B * (double)f3;
        return new class06889(d, d2, d3);
    }

    public class06889 N(class06889 class068892, double d) {
        return new class06889(class04995.u((double)d, (double)this.M, (double)class068892.M), class04995.u((double)d, (double)this.B, (double)class068892.B), class04995.u((double)d, (double)this.Z, (double)class068892.Z));
    }

    public boolean N(class06889 class068892, double d, double d2) {
        double d3 = class068892.N() - this.M;
        double d4 = class068892.y() - this.B;
        double d5 = class068892.L() - this.Z;
        return class04995.i((double)d3, (double)d5) < class04995.E((double)d) && Math.abs(d4) < d2;
    }

    public class06889 N(class06889 class068892) {
        return new class06889(class068892.M - this.M, class068892.B - this.B, class068892.Z - this.Z);
    }

    public static class06889 N(class00753 class007532, double d) {
        return class06889.N(class007532, 0.5, d, 0.5);
    }

    public class06889 N(class06069 class060692, float f) {
        return this.y((class060692.z() - 0.5f) * f, (class060692.z() - 0.5f) * f, (class060692.z() - 0.5f) * f);
    }

    public static class06889 N(class00753 class007532) {
        return new class06889(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public static class06889 N(class07109 class071092) {
        return class06889.N(class071092.z, class071092.U);
    }

    public class06889 N(EnumSet<class07185> enumSet) {
        double d = enumSet.contains(class07185.field_11048) ? (double)class04995.N((double)this.M) : this.M;
        double d2 = enumSet.contains(class07185.field_11052) ? (double)class04995.N((double)this.B) : this.B;
        double d3 = enumSet.contains(class07185.field_11051) ? (double)class04995.N((double)this.Z) : this.Z;
        return new class06889(d, d2, d3);
    }

    public boolean N(class00737 class007372, double d) {
        return this.L(class007372.N(), class007372.y(), class007372.L()) < d * d;
    }

    public static class06889 N(float f, float f2) {
        float f3 = class04995.P((double)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        float f4 = class04995.m((double)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        float f5 = -class04995.P((double)(-f * ((float)Math.PI / 180)));
        float f6 = class04995.m((double)(-f * ((float)Math.PI / 180)));
        return new class06889(f4 * f5, f6, f3 * f5);
    }

    public Vector3f W() {
        return new Vector3f((float)this.M, (float)this.B, (float)this.Z);
    }

    public double R(class06889 class068892) {
        double d = class068892.M - this.M;
        double d2 = class068892.B - this.B;
        double d3 = class068892.Z - this.Z;
        return Math.sqrt(d * d + d2 * d2 + d3 * d3);
    }

    public class06889 R() {
        return new class06889(this.M, 0.0, this.Z);
    }
}

