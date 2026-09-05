/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  com.google.common.collect.Lists
 *  minecraft.class01001
 *  minecraft.class01032
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04391
 *  minecraft.class04425
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05663
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07126
 *  minecraft.class07288
 *  minecraft.class07299
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class08025
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import minecraft.class01001;
import minecraft.class01032;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04391;
import minecraft.class04425;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05663;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07126;
import minecraft.class07288;
import minecraft.class07299;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class08025;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class06171
extends class07077
implements class04391,
class07288,
class08025 {
    private static final class02131<Integer> N = class03289.N(class06171.class, (class04383)class02154.y);
    public static final int i = 300;
    private static final int y = 8;
    private @Nullable class08036 L;
    protected @Nullable class07316 R;
    private final class07075 u = new class07075(8);

    public boolean L() {
        return this.method_73183().method_8608();
    }

    public void M(int n) {
        this.field_6011.N(N, (Object)n);
    }

    public @Nullable class04803 method_32318(int n) {
        int n2 = n - 300;
        if (n2 >= 0 && n2 < this.u.method_5439()) {
            return this.u.method_32318(n2);
        }
        return super.method_32318(n);
    }

    public class06889 method_30951(float f) {
        float f2 = class04995.B((float)f, (float)((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue()) * ((float)Math.PI / 180);
        class06889 class068892 = new class06889(0.0, this.method_5829().L() - 1.0, 0.2);
        return this.method_30950(f).i(class068892.y(-f2));
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
    }

    public void method_5652(class08329 class083292) {
        class07316 class073162;
        super.method_5652(class083292);
        if (!this.method_73183().method_8608() && !(class073162 = this.y()).isEmpty()) {
            class083292.N("Offers", class07316.N, (Object)class073162);
        }
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.R = class082992.N("Offers", class07316.N).orElse(null);
        this.b_(class082992);
    }

    public @Nullable class07049 method_5731(class01032 class010322) {
        this.W();
        return super.method_5731(class010322);
    }

    public class06171(class07078<? extends class06171> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_9, 16.0f);
        this.N(class04425.field_3, -1.0f);
    }

    public int I() {
        return (Integer)this.field_6011.N(N);
    }

    public boolean i() {
        return true;
    }

    protected abstract void i(class04782 var1);

    public class07075 n() {
        return this.u;
    }

    public boolean o() {
        return this.L != null;
    }

    public boolean g() {
        return false;
    }

    public int u() {
        return 0;
    }

    public class07316 y() {
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            throw new IllegalStateException("Cannot load Villager offers on the client");
        }
        class04782 class047822 = (class04782)class072992;
        if (this.R == null) {
            this.R = new class07316();
            this.i(class047822);
        }
        return this.R;
    }

    protected abstract void y(class07324 var1);

    public boolean y(class08036 class080362) {
        return this.N() == class080362 && this.method_5805() && class080362.method_56094((class07049)this, 4.0);
    }

    protected void N(class07126 class071262) {
        for (int i = 0; i < 5; ++i) {
            double d = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            double d3 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406(class071262, this.method_23322(1.0), this.method_23319() + 1.0, this.method_23325(1.0), d, d2, d3);
        }
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class074462 == null) {
            class074462 = new class10714(false);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    protected void N(class04782 class047822, class07316 class073162, class05663[] class05663Array, int n) {
        ArrayList arrayList = Lists.newArrayList((Object[])class05663Array);
        int n2 = 0;
        while (n2 < n && !arrayList.isEmpty()) {
            class07324 class073242 = ((class05663)arrayList.remove(this.field_5974.y(arrayList.size()))).N(class047822, (class07049)this, this.field_5974);
            if (class073242 == null) continue;
            class073162.add((Object)class073242);
            ++n2;
        }
    }

    public void N(int n) {
    }

    public void N(@Nullable class07316 class073162) {
    }

    public void N(class07324 class073242) {
        class073242.E();
        this.I = -this.m_();
        this.y(class073242);
        if (this.L instanceof class04770) {
            class06912.v.N((class04770)this.L, this, class073242.R());
        }
    }

    public @Nullable class08036 N() {
        return this.L;
    }

    protected class04891 N(boolean bl) {
        return bl ? class04909.gT : class04909.gP;
    }

    public void N(@Nullable class08036 class080362) {
        this.L = class080362;
    }

    public void W() {
        this.N((class08036)null);
    }

    public class04891 R() {
        return class04909.gT;
    }

    public void d_(class06584 class065842) {
        if (!this.method_73183().method_8608() && this.I > -this.m_() + 20) {
            this.I = -this.m_();
            this.method_56078(this.N(!class065842.R()));
        }
    }

    public void NQ() {
        this.method_56078(class04909.gE);
    }

    public void method_6078(class07072 class070722) {
        super.method_6078(class070722);
        this.W();
    }
}

