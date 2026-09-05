/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00869
 *  minecraft.class01032
 *  minecraft.class01296
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05668
 *  minecraft.class06113
 *  minecraft.class06145
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Set;
import java.util.UUID;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00869;
import minecraft.class01032;
import minecraft.class01296;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05668;
import minecraft.class06113;
import minecraft.class06145;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07560;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class07488
extends class05668 {
    private long N = 0L;

    public void method_64615(class07062 class070622) {
        if (class070622 != class07062.field_27001) {
            this.y();
        }
        super.method_64615(class070622);
    }

    /*
     * Unable to fully structure code
     */
    public void method_5773() {
        var2_1 = this.method_73183();
        if (!(var2_1 instanceof class04782)) {
            super.method_5773();
            return;
        }
        var1_3 = (class04782)var2_1;
        var2_2 = class01296.y((double)this.method_73189().N());
        var3_4 = class01296.y((double)this.method_73189().L());
        v0 = var4_5 = this.i != null ? class07488.N(var1_3, this.i.L()) : null;
        if (!(var4_5 instanceof class04770)) ** GOTO lbl-1000
        var5_6 = (class04770)var4_5;
        if (!var4_5.method_5805() && !var5_6.field_13989 && ((Boolean)var5_6.method_51469().method_64395().N(class07305.z)).booleanValue()) {
            this.method_31472();
        } else lbl-1000:
        // 2 sources

        {
            super.method_5773();
        }
        if (!this.method_5805()) {
            return;
        }
        var5_6 = class07209.method_49638((class00737)this.method_73189());
        if ((--this.N <= 0L || var2_2 != class01296.N((int)var5_6.method_10263()) || var3_4 != class01296.N((int)var5_6.method_10260())) && var4_5 instanceof class04770) {
            var6_7 = (class04770)var4_5;
            this.N = var6_7.method_64133(this);
        }
    }

    protected void method_5622(class00500 class005002) {
        class07049 class070492;
        super.method_5622(class005002);
        if (class005002.N(class00869.EY) && (class070492 = this.z()) instanceof class04770) {
            ((class04770)class070492).method_5622(class005002);
        }
    }

    public void method_5700(boolean bl, class07209 class072092) {
        class07049.method_67123((class07049)this, (boolean)bl, (class07209)class072092);
    }

    public void method_5764(boolean bl) {
        class07049.method_67124((class07049)this, (boolean)bl);
    }

    public @Nullable class07049 method_5731(class01032 class010322) {
        class07049 class070492 = super.method_5731(class010322);
        if (class070492 != null) {
            class070492.method_60950(class07209.method_49638((class00737)class070492.method_73189()));
        }
        return class070492;
    }

    public boolean method_61113(class07299 class072992, class07299 class072993) {
        class07049 class070492;
        if (class072992.method_27983() == class07299.field_25181 && class072993.method_27983() == class07299.field_25179 && (class070492 = this.z()) instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            return super.method_61113(class072992, class072993) && class047702.field_13969;
        }
        return super.method_61113(class072992, class072993);
    }

    public class07488(class07078<? extends class07488> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07488(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.C, class074382, class072992, class065842);
    }

    public @Nullable class07049 z() {
        class07299 class072992;
        if (this.i == null || !((class072992 = this.method_73183()) instanceof class04782)) {
            return super.z();
        }
        class04782 class047822 = (class04782)class072992;
        return (class07049)this.i.N((class07299)class047822, class07049.class);
    }

    private void u() {
        class07049 class070492 = this.z();
        if (class070492 instanceof class04770) {
            ((class04770)class070492).method_64124(this);
        }
    }

    private void y() {
        class07049 class070492 = this.z();
        if (class070492 instanceof class04770) {
            ((class04770)class070492).method_64130(this);
        }
    }

    protected void N(class07089 class070892) {
        class04782 class047822;
        class07299 class072992;
        block14: {
            block13: {
                super.N(class070892);
                for (int i = 0; i < 32; ++i) {
                    this.method_73183().method_8406((class07126)class07107.NM, this.method_23317(), this.method_23318() + this.field_5974.U() * 2.0, this.method_23321(), this.field_5974.E(), 0.0, this.field_5974.E());
                }
                class072992 = this.method_73183();
                if (!(class072992 instanceof class04782)) break block13;
                class047822 = (class04782)class072992;
                if (!this.method_31481()) break block14;
            }
            return;
        }
        class072992 = this.z();
        if (class072992 == null || !class07488.N((class07049)class072992, (class07299)class047822)) {
            this.method_31472();
            return;
        }
        class06889 class068892 = this.method_61411();
        if (class072992 instanceof class04770) {
            class04770 class047702 = (class04770)class072992;
            if (class047702.field_13987.method_48106()) {
                class07560 class075602;
                if (this.field_5974.z() < 0.05f && class047822.method_74962() && (class075602 = (class07560)class07078.A.N((class07299)class047822, class06113.field_16461)) != null) {
                    class075602.method_5808(class072992.method_23317(), class072992.method_23318(), class072992.method_23321(), class072992.method_36454(), class072992.method_36455());
                    class047822.method_8649((class07049)class075602);
                }
                if (this.method_30230()) {
                    class072992.method_30229();
                }
                if ((class075602 = class047702.method_61275(new class01032(class047822, class068892, class06889.L, 0.0f, 0.0f, class06681.N((Set[])new Set[]{class06681.field_40711, class06681.field_54094}), class01032.N))) != null) {
                    class075602.method_38785();
                    class075602.method_58396();
                    class075602.method_64397(class047702.method_51469(), this.method_48923().W(), 5.0f);
                }
                this.N((class07299)class047822, class068892);
            }
        } else {
            class07049 class070492 = class072992.method_5731(new class01032(class047822, class068892, class072992.method_18798(), class072992.method_36454(), class072992.method_36455(), class01032.N));
            if (class070492 != null) {
                class070492.method_38785();
            }
            this.N((class07299)class047822, class068892);
        }
        this.method_31472();
    }

    protected void N(@Nullable class08372<class07049> class083722) {
        this.y();
        super.N(class083722);
        this.u();
    }

    protected class06581 N() {
        return class06570.nz;
    }

    private static @Nullable class07049 N(class04782 class047822, UUID uUID) {
        class07049 class070492 = class047822.method_73284(uUID);
        if (class070492 != null) {
            return class070492;
        }
        return class047822.method_8503().Nm().y(uUID);
    }

    private static boolean N(class07049 class070492, class07299 class072992) {
        if (class070492.method_73183().method_27983() == class072992.method_27983()) {
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                return class074382.method_5805() && !class074382.method_6113();
            }
            return class070492.method_5805();
        }
        return class070492.method_5822(true);
    }

    private void N(class07299 class072992, class06889 class068892) {
        class072992.method_54762(null, class068892.M, class068892.B, class068892.Z, class04909.lB, class04911.field_15248);
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        class061452.L().method_64419(this.method_48923().y((class07049)this, this.z()), 0.0f);
    }
}

