/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ItemRelease
 *  Nursultan.Trajectory
 *  Nursultan.class11223
 *  Nursultan.class11225
 *  Nursultan.class11228
 *  Nursultan.class11249
 *  Nursultan.class11264
 *  Nursultan.class11266
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.ItemRelease;
import Nursultan.Trajectory;
import Nursultan.class11131;
import Nursultan.class11223;
import Nursultan.class11225;
import Nursultan.class11228;
import Nursultan.class11249;
import Nursultan.class11264;
import Nursultan.class11266;
import java.util.function.Function;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class08036;

public class class11147
extends class11131 {
    public Object y_0;

    private void L() {
    }

    public class11147(ItemRelease itemRelease, String string, boolean bl) {
        super(itemRelease, string, bl);
        this.L();
        this.y_0 = new class11249((class11225)class11225.L_1, class11264.N);
    }

    @Override
    public void y(class06202 class062022, class07050 class070502) {
        ((class03443)class062022.T_2).y((class08036)((class04453)class062022.T_4));
    }

    @Override
    public boolean test(class06202 class062022, class07050 class070502) {
        if (((class04453)class062022.T_4).method_5998(class070502).N(class06570.db)) {
            return ((class04453)class062022.T_4).method_6048() >= 10;
        }
        return false;
    }

    @Override
    public boolean N(class06202 class062022, class07050 class070502, Function<class11223, Boolean> function) {
        this.L();
        return new class11266(new class06889(((Double)((class04453)class062022.T_4).M_1).doubleValue(), (Double)((class04453)class062022.T_4).M_2 + (double)((class04453)class062022.T_4).method_18381(((class04453)class062022.T_4).method_18376()), ((Double)((class04453)class062022.T_4).R_0).doubleValue()), Trajectory.N((class07049)((class04453)class062022.T_4), (class06889)((class04453)class062022.T_4).method_60478(), (float)((Float)((class04453)class062022.T_4).R_2).floatValue(), (float)((Float)((class04453)class062022.T_4).R_1).floatValue(), (float)0.0f, (float)2.5f), (class11228)this.y_0).y().N().map(function).orElse(false);
    }
}

