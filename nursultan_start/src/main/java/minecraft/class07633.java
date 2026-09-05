/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01235
 *  minecraft.class01312
 *  minecraft.class04425
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05188
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07057
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07322
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01235;
import minecraft.class01312;
import minecraft.class04425;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05188;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07057;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07322;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public abstract class class07633
extends class07077 {
    protected static final int a = 6000;
    private static final int N = 0;
    private int y = 0;
    private @Nullable class08372<class04770> L;

    public static boolean L(class07078<? extends class07633> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        boolean bl = class06113.y((class06113)class061132) || class07633.N((class07295)class072842, class072092);
        return class072842.method_8320(class072092.method_10074()).N(class01210.LE) && bl;
    }

    public void M(int n) {
        this.y = n;
    }

    public class06889 method_24829(class07438 class074382) {
        class07211 class072112 = this.method_5755();
        if (class072112.z() == class07185.field_11052) {
            return super.method_24829(class074382);
        }
        int[][] nArray = class05188.N((class07211)class072112);
        class07209 class072092 = this.method_24515();
        class07218 class072182 = new class07218();
        for (class01312 class013122 : class074382.method_24831()) {
            class00734 class007342 = class074382.method_24833(class013122);
            for (int[] nArray2 : nArray) {
                class072182.N(class072092.method_10263() + nArray2[0], class072092.method_10264(), class072092.method_10260() + nArray2[1]);
                double d = this.method_73183().L((class07209)class072182);
                if (!class05188.N((double)d)) continue;
                class06889 class068892 = class06889.N((class00753)class072182, (double)d);
                if (!class05188.N((class07322)this.method_73183(), (class07438)class074382, (class00734)class007342.L(class068892))) continue;
                class074382.method_18380(class013122);
                return class068892;
            }
        }
        return super.method_24829(class074382);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("InLove", this.y);
        class08372.N(this.L, (class08329)class083292, (String)"LoveCause");
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y = class082992.N("InLove", 0);
        this.L = class08372.N((class08299)class082992, (String)"LoveCause");
    }

    public void method_5711(byte by) {
        if (by == 18) {
            for (int i = 0; i < 7; ++i) {
                double d = this.field_5974.E() * 0.02;
                double d2 = this.field_5974.E() * 0.02;
                double d3 = this.field_5974.E() * 0.02;
                this.method_73183().method_8406((class07126)class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
            }
        } else {
            super.method_5711(by);
        }
    }

    public class07633(class07078<? extends class07633> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_9, 16.0f);
        this.N(class04425.field_3, -1.0f);
    }

    private class07041 B() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return class07082.N;
        }
        return class07082.y;
    }

    public void i(@Nullable class08036 class080362) {
        this.y = 600;
        if (class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            this.L = class08372.N((class08636)class047702);
        }
        this.method_73183().method_8421((class07049)this, (byte)18);
    }

    private boolean y(class07299 class072992) {
        return class072992.method_8608() && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_15);
    }

    public void N(class04782 class047822) {
        if (this.K() != 0) {
            this.y = 0;
        }
        super.N(class047822);
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (class054872.method_8320(class072092.method_10074()).N(class00869.Z)) {
            return 10.0f;
        }
        return class054872.B(class072092);
    }

    protected static boolean N(class07295 class072952, class07209 class072092) {
        return class072952.method_22335(class072092, 0) > 8;
    }

    public boolean N(class07633 class076332) {
        if (class076332 == this) {
            return false;
        }
        if (((Object)((Object)class076332)).getClass() != ((Object)((Object)this)).getClass()) {
            return false;
        }
        return this.NX() && class076332.NX();
    }

    public void N(class04782 class047822, class07633 class076332) {
        class07077 class070772 = this.y(class047822, class076332);
        if (class070772 == null) {
            return;
        }
        class070772.y(true);
        class070772.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), 0.0f, 0.0f);
        this.N(class047822, class076332, class070772);
        class047822.y((class07049)class070772);
    }

    public void N(class04782 class047822, class07633 class076332, @Nullable class07077 class070772) {
        Optional.ofNullable(this.Nc()).or(() -> Optional.ofNullable(class076332.Nc())).ifPresent(class047702 -> {
            class047702.method_7281(class01235.F);
            class06912.s.N(class047702, this, class076332, class070772);
        });
        this.u(6000);
        class076332.u(6000);
        this.Na();
        class076332.Na();
        class047822.method_8421((class07049)this, (byte)18);
        if (((Boolean)class047822.method_64395().N(class07305.O)).booleanValue()) {
            class047822.method_8649((class07049)new class07057((class07299)class047822, this.method_23317(), this.method_23318(), this.method_23321(), this.method_59922().y(7) + 1));
        }
    }

    public abstract boolean N(class06584 var1);

    public boolean N(double d) {
        return false;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.N(class065842)) {
            int n = this.K();
            if (class080362 instanceof class04770) {
                class04770 class047702 = (class04770)class080362;
                if (n == 0 && this.T_()) {
                    this.N(class080362, class070502, class065842);
                    this.i((class08036)class047702);
                    this.O();
                    return this.B();
                }
            }
            if (this.method_6109()) {
                this.N(class080362, class070502, class065842);
                this.N(class07633.i((int)(-n)), true);
                this.O();
                return class07082.N;
            }
            class07299 class072992 = this.method_73183();
            if (this.y(class072992)) {
                return class07082.L;
            }
        }
        return super.N(class080362, class070502);
    }

    protected void O() {
    }

    public int m_() {
        return 120;
    }

    public int NH() {
        return this.y;
    }

    public @Nullable class04770 Nc() {
        return (class04770)class08372.N(this.L, (class07299)this.method_73183(), class04770.class);
    }

    public static class05300 Ne() {
        return class07079.H().N(class05298.J, 10.0);
    }

    public boolean NX() {
        return this.y > 0;
    }

    public void Na() {
        this.y = 0;
    }

    public int method_6110(class04782 class047822) {
        return 1 + this.field_5974.y(3);
    }

    public void method_6007() {
        super.method_6007();
        if (this.K() != 0) {
            this.y = 0;
        }
        if (this.y > 0) {
            --this.y;
            if (this.y % 10 == 0) {
                double d = this.field_5974.E() * 0.02;
                double d2 = this.field_5974.E() * 0.02;
                double d3 = this.field_5974.E() * 0.02;
                this.method_73183().method_8406((class07126)class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
            }
        }
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        this.Na();
        super.method_6074(class047822, class070722, f);
    }

    public boolean T_() {
        return this.y <= 0;
    }
}

