/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.math.DoubleMath
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class06183
 *  minecraft.class06864
 *  minecraft.class06889
 *  minecraft.class07003
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07214
 *  minecraft.class07255
 *  minecraft.class07260
 *  minecraft.class07536
 *  minecraft.class07739
 *  net.caffeinemc.mods.lithium.common.shapes.OffsetVoxelShapeCache
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00406;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class04995;
import minecraft.class06183;
import minecraft.class06864;
import minecraft.class06889;
import minecraft.class07003;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07214;
import minecraft.class07255;
import minecraft.class07260;
import minecraft.class07536;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.common.shapes.OffsetVoxelShapeCache;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public abstract class class00494
implements OffsetVoxelShapeCache {
    public final class07739 field_1401;
    private @Nullable class00494 @Nullable [] field_19318;
    private volatile class00494[] offsetAndSimplified;
    private static final double POSITIVE_EPSILON = 1.0E-7;
    private static final double NEGATIVE_EPSILON = -1.0E-7;

    public class00494 method_66507(class00753 class007532) {
        return this.method_1096(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public abstract DoubleList method_1109(class07185 var1);

    public class00494(class07739 class077392) {
        this.field_1401 = class077392;
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public String toString() {
        return this.method_1110() ? "EMPTY" : "VoxelShape[" + String.valueOf(this.method_1107()) + "]";
    }

    public class00494 method_64034(class06889 class068892) {
        return this.method_1096(class068892.M, class068892.B, class068892.Z);
    }

    public double method_1108(class07185 class071852, class00734 class007342, double d) {
        return this.method_1103(class07214.N((class07185)class071852, (class07185)class07185.field_11048), class007342, d);
    }

    public List<class00734> method_1090() {
        ArrayList arrayList = Lists.newArrayList();
        this.method_1089((d, d2, d3, d4, d5, d6) -> arrayList.add(new class00734(d, d2, d3, d4, d5, d6)));
        return arrayList;
    }

    public boolean method_1110() {
        return this.field_1401.method_1056();
    }

    public class00734 method_1107() {
        if (this.method_1110()) {
            throw (UnsupportedOperationException)class07536.y((Throwable)new UnsupportedOperationException("No bounds for empty shape."));
        }
        return new class00734(this.method_1091(class07185.field_11048), this.method_1091(class07185.field_11052), this.method_1091(class07185.field_11051), this.method_1105(class07185.field_11048), this.method_1105(class07185.field_11052), this.method_1105(class07185.field_11051));
    }

    public Optional<class06889> method_33661(class06889 class068892) {
        if (this.method_1110()) {
            return Optional.empty();
        }
        MutableObject mutableObject = new MutableObject();
        this.method_1089((d, d2, d3, d4, d5, d6) -> {
            double d7 = class04995.N((double)class068892.N(), (double)d, (double)d4);
            double d8 = class04995.N((double)class068892.y(), (double)d2, (double)d5);
            double d9 = class04995.N((double)class068892.L(), (double)d3, (double)d6);
            class06889 class068893 = (class06889)mutableObject.get();
            if (class068893 == null || class068892.L(d7, d8, d9) < class068892.M(class068893)) {
                mutableObject.setValue((Object)new class06889(d7, d8, d9));
            }
        });
        return Optional.of(Objects.requireNonNull((class06889)mutableObject.get()));
    }

    public @Nullable class06183 method_1092(class06889 class068892, class06889 class068893, class07209 class072092) {
        if (this.method_1110()) {
            return null;
        }
        class06889 class068894 = class068893.u(class068892);
        if (class068894.B() < 1.0E-7) {
            return null;
        }
        class06889 class068895 = class068892.i(class068894.L(0.001));
        if (this.field_1401.method_1044(this.method_1100(class07185.field_11048, class068895.M - (double)class072092.method_10263()), this.method_1100(class07185.field_11052, class068895.B - (double)class072092.method_10264()), this.method_1100(class07185.field_11051, class068895.Z - (double)class072092.method_10260()))) {
            return new class06183(class068895, class07211.N((double)class068894.M, (double)class068894.B, (double)class068894.Z).b(), class072092, true);
        }
        return class00734.N(this.method_1090(), (class06889)class068892, (class06889)class068893, (class07209)class072092);
    }

    public double method_1105(class07185 class071852) {
        int n = this.field_1401.method_1045(class071852);
        if (n <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.method_1099(class071852, n);
    }

    public class00494 method_20538(class07211 class072112) {
        class00494 class004942;
        if (this.method_1110() || this == class00389.y()) {
            return this;
        }
        if (this.field_19318 != null) {
            class004942 = this.field_19318[class072112.ordinal()];
            if (class004942 != null) {
                return class004942;
            }
        } else {
            this.field_19318 = new class00494[6];
        }
        this.field_19318[class072112.ordinal()] = class004942 = this.method_1098(class072112);
        return class004942;
    }

    protected boolean method_61897() {
        for (class07185 class071852 : class07185.field_23780) {
            if (this.method_61896(class071852)) continue;
            return false;
        }
        return true;
    }

    public int method_1100(class07185 class071852, double d) {
        DoubleList doubleList = this.method_1109(class071852);
        int n = this.field_1401.method_1051(class071852);
        int n2 = 0;
        int n3 = n + 1 - n2;
        while (n3 > 0) {
            int n4 = n3 / 2;
            int n5 = n2 + n4;
            if (n5 >= 0 && (n5 > n || d < doubleList.getDouble(n5))) {
                n3 = n4;
                continue;
            }
            n2 = n5 + 1;
            n3 -= n4 + 1;
        }
        return n2 - 1;
    }

    public void method_1104(class00406 class004062) {
        this.field_1401.method_1064((n, n2, n3, n4, n5, n6) -> class004062.consume(this.method_1099(class07185.field_11048, n), this.method_1099(class07185.field_11052, n2), this.method_1099(class07185.field_11051, n3), this.method_1099(class07185.field_11048, n4), this.method_1099(class07185.field_11052, n5), this.method_1099(class07185.field_11051, n6)), true);
    }

    protected double method_1099(class07185 class071852, int n) {
        return this.method_1109(class071852).getDouble(n);
    }

    public double method_35593(class07185 class071852, double d, double d2) {
        int n;
        class07185 class071853 = class07214.field_10963.N(class071852);
        class07185 class071854 = class07214.field_10965.N(class071852);
        int n2 = this.method_1100(class071853, d);
        int n3 = this.field_1401.method_35592(class071852, n2, n = this.method_1100(class071854, d2));
        if (n3 >= this.field_1401.method_1051(class071852)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.method_1099(class071852, n3);
    }

    private class00494 method_1098(class07211 class072112) {
        class07185 class071852 = class072112.z();
        if (this.method_61896(class071852)) {
            return this;
        }
        class07212 class072122 = class072112.i();
        int n = this.method_1100(class071852, class072122 == class07212.field_11056 ? 0.9999999 : 1.0E-7);
        class07260 class072602 = new class07260(this, class071852, n);
        if (class072602.method_1110()) {
            return class00389.N();
        }
        if (class072602.method_61897()) {
            return class00389.y();
        }
        return class072602;
    }

    private boolean method_61896(class07185 class071852) {
        DoubleList doubleList = this.method_1109(class071852);
        return doubleList.size() == 2 && DoubleMath.fuzzyEquals((double)doubleList.getDouble(0), (double)0.0, (double)1.0E-7) && DoubleMath.fuzzyEquals((double)doubleList.getDouble(1), (double)1.0, (double)1.0E-7);
    }

    public double method_1091(class07185 class071852) {
        int n = this.field_1401.method_1055(class071852);
        if (n >= this.field_1401.method_1051(class071852)) {
            return Double.POSITIVE_INFINITY;
        }
        return this.method_1099(class071852, n);
    }

    public double method_1103(class07214 class072142, class00734 class007342, double d) {
        block11: {
            int n;
            int n2;
            int n3;
            int n4;
            class07185 class071852;
            class07185 class071853;
            class07185 class071854;
            class07214 class072143;
            block10: {
                if (this.method_1110()) {
                    return d;
                }
                if (Math.abs(d) < 1.0E-7) {
                    return 0.0;
                }
                class072143 = class072142.N();
                class071854 = class072143.N(class07185.field_11048);
                class071853 = class072143.N(class07185.field_11052);
                class071852 = class072143.N(class07185.field_11051);
                n4 = Integer.MIN_VALUE;
                n3 = Integer.MIN_VALUE;
                n2 = Integer.MIN_VALUE;
                n = Integer.MIN_VALUE;
                if (!(d > 0.0)) break block10;
                double d2 = class007342.y(class071854);
                int n5 = this.method_1100(class071854, d2 - 1.0E-7);
                int n6 = this.field_1401.method_1051(class071854);
                for (int i = n5 + 1; i < n6; ++i) {
                    n4 = n4 == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class071853, class007342.N(class071853) + 1.0E-7)) : n4;
                    n3 = n3 == Integer.MIN_VALUE ? Math.min(this.field_1401.method_1051(class071853), this.method_1100(class071853, class007342.y(class071853) - 1.0E-7) + 1) : n3;
                    for (int j = n4; j < n3; ++j) {
                        n2 = n2 == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class071852, class007342.N(class071852) + 1.0E-7)) : n2;
                        n = n == Integer.MIN_VALUE ? Math.min(this.field_1401.method_1051(class071852), this.method_1100(class071852, class007342.y(class071852) - 1.0E-7) + 1) : n;
                        for (int k = n2; k < n; ++k) {
                            if (!this.field_1401.method_1062(class072143, i, j, k)) continue;
                            double d3 = this.method_1099(class071854, i) - d2;
                            if (d3 >= -1.0E-7) {
                                d = Math.min(d, d3);
                            }
                            return d;
                        }
                    }
                }
                break block11;
            }
            if (!(d < 0.0)) break block11;
            double d4 = class007342.N(class071854);
            int n7 = this.method_1100(class071854, d4 + 1.0E-7);
            for (int i = n7 - 1; i >= 0; --i) {
                n4 = n4 == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class071853, class007342.N(class071853) + 1.0E-7)) : n4;
                n3 = n3 == Integer.MIN_VALUE ? Math.min(this.field_1401.method_1051(class071853), this.method_1100(class071853, class007342.y(class071853) - 1.0E-7) + 1) : n3;
                for (int j = n4; j < n3; ++j) {
                    n2 = n2 == Integer.MIN_VALUE ? Math.max(0, this.method_1100(class071852, class007342.N(class071852) + 1.0E-7)) : n2;
                    n = n == Integer.MIN_VALUE ? Math.min(this.field_1401.method_1051(class071852), this.method_1100(class071852, class007342.y(class071852) - 1.0E-7) + 1) : n;
                    for (int k = n2; k < n; ++k) {
                        if (!this.field_1401.method_1062(class072143, i, j, k)) continue;
                        double d5 = this.method_1099(class071854, i + 1) - d4;
                        if (d5 <= 1.0E-7) {
                            d = Math.max(d, d5);
                        }
                        return d;
                    }
                }
            }
        }
        return d;
    }

    private /* synthetic */ boolean method_1101(double d, class07185 class071852, int n) {
        return d < this.method_1099(class071852, n);
    }

    public class00494 method_52620() {
        if (this.method_1110()) {
            return class00389.N();
        }
        return class00389.N(this.method_1091(class07185.field_11048), this.method_1091(class07185.field_11052), this.method_1091(class07185.field_11051), this.method_1105(class07185.field_11048), this.method_1105(class07185.field_11052), this.method_1105(class07185.field_11051));
    }

    public class00494 method_1097() {
        class00494[] class00494Array = new class00494[]{class00389.N()};
        this.method_1089((d, d2, d3, d4, d5, d6) -> {
            class00494Array[0] = class00389.y(class00494Array[0], class00389.N(d, d2, d3, d4, d5, d6), class07003.P);
        });
        return class00494Array[0];
    }

    public void method_1089(class00406 class004062) {
        DoubleList doubleList = this.method_1109(class07185.field_11048);
        DoubleList doubleList2 = this.method_1109(class07185.field_11052);
        DoubleList doubleList3 = this.method_1109(class07185.field_11051);
        this.field_1401.method_1053((n, n2, n3, n4, n5, n6) -> class004062.consume(doubleList.getDouble(n), doubleList2.getDouble(n2), doubleList3.getDouble(n3), doubleList.getDouble(n4), doubleList2.getDouble(n5), doubleList3.getDouble(n6)), true);
    }

    public void lithium$setShape(float f, class07211 class072112, class00494 class004942) {
        if (class004942 == null) {
            throw new IllegalArgumentException("offsetShape must not be null!");
        }
        int n = class00494.getIndexForOffsetSimplifiedShapes(f, class072112);
        class00494[] class00494Array = this.offsetAndSimplified;
        class00494Array = class00494Array == null ? new class00494[13] : (class00494[])class00494Array.clone();
        class00494Array[n] = class004942;
        this.offsetAndSimplified = class00494Array;
    }

    public double method_1102(class07185 class071852, double d, double d2) {
        int n;
        class07185 class071853 = class07214.field_10963.N(class071852);
        class07185 class071854 = class07214.field_10965.N(class071852);
        int n2 = this.method_1100(class071853, d);
        int n3 = this.field_1401.method_1058(class071852, n2, n = this.method_1100(class071854, d2));
        if (n3 <= 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return this.method_1099(class071852, n3);
    }

    public class00494 method_1096(double d, double d2, double d3) {
        if (this.method_1110()) {
            return class00389.N();
        }
        return new class06864(this.field_1401, (DoubleList)new class07255(this.method_1109(class07185.field_11048), d), (DoubleList)new class07255(this.method_1109(class07185.field_11052), d2), (DoubleList)new class07255(this.method_1109(class07185.field_11051), d3));
    }

    private static int getIndexForOffsetSimplifiedShapes(float f, class07211 class072112) {
        if (f != 0.0f && f != 0.5f && f != 1.0f) {
            throw new IllegalArgumentException("offset must be one of {0f, 0.5f, 1f}");
        }
        if (f == 0.0f) {
            return 0;
        }
        return (int)(2.0f * f) + 2 * class072112.L();
    }

    public class00494 lithium$getOffsetSimplifiedShape(float f, class07211 class072112) {
        class00494[] class00494Array = this.offsetAndSimplified;
        if (class00494Array == null) {
            return null;
        }
        int n = class00494.getIndexForOffsetSimplifiedShapes(f, class072112);
        return class00494Array[n];
    }
}

