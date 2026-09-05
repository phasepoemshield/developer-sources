/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10213
 *  com.mojang.serialization.Codec
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class10213;
import com.mojang.serialization.Codec;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03881;
import minecraft.class03885;
import minecraft.class03891;
import minecraft.class03900;
import minecraft.class03912;
import minecraft.class03979;
import minecraft.class04227;
import minecraft.class05946;

public interface class03877 {
    public static final Codec<class03877> u = class03865.L;
    public static final Codec<class03556<class03877>> i = class01281.N((class05946)class04227.yy, u);
    public static final Codec<class03877> R = i.xmap(class03885::new, class038772 -> {
        if (class038772 instanceof class03885) {
            return ((class03885)class038772).u();
        }
        return new class10213(class038772);
    });

    public class03979<? extends class03877> L();

    default public class03877 M() {
        return class03865.N(this, class03891.field_36556);
    }

    default public class03877 B() {
        return class03865.N(this, class03891.field_36557);
    }

    default public class03877 Z() {
        return class03865.N(this, class03891.field_36558);
    }

    default public class03877 U() {
        return class03865.N(this, class03891.field_61470);
    }

    default public class03877 z() {
        return class03865.N(this, class03891.field_36559);
    }

    public double y();

    default public class03877 E() {
        return class03865.N(this, class03891.field_36560);
    }

    public double N(class03875 var1);

    default public class03877 N(double d, double d2) {
        return new class03900(this, d, d2);
    }

    public class03877 N(class03881 var1);

    public void N(double[] var1, class03912 var2);

    public double N();

    default public class03877 R() {
        return class03865.N(this, class03891.field_36555);
    }
}

