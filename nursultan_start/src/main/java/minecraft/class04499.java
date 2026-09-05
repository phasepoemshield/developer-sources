/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01210
 *  minecraft.class01284
 *  minecraft.class02247
 *  minecraft.class02260
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04252
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07328
 *  minecraft.class08036
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.function.Function;
import minecraft.class01210;
import minecraft.class01284;
import minecraft.class02247;
import minecraft.class02260;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04252;
import minecraft.class04540;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07328;
import minecraft.class08036;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class04499
extends class02260 {
    private static final class01284 M = new class02247(true, false, Optional.of(Float.valueOf(1.22f)), class04206.i.N(class01210.Lp).map(Function.identity()));
    private static final float B = 1.2f;
    private static final float Z = class04995.z((float)3.5f);
    private int z = 5;

    public void method_5773() {
        super.method_5773();
        if (this.z > 0) {
            --this.z;
        }
    }

    public boolean method_5640(double d) {
        if (this.field_6012 < 2 && d < (double)Z) {
            return false;
        }
        return super.method_5640(d);
    }

    public class04499(class07078<? extends class02260> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class04499(class07299 class072992, double d, double d2, double d3, class06889 class068892) {
        super(class07078.ya, d, d2, d3, class068892, class072992);
    }

    public class04499(class08036 class080362, class07299 class072992, double d, double d2, double d3) {
        super(class07078.ya, class072992, (class07049)class080362, d, d2, d3);
    }

    protected void N(class06889 class068892) {
        this.method_73183().method_8454((class07049)this, null, M, class068892.N(), class068892.y(), class068892.L(), 1.2f, false, class07328.field_51779, (class07126)class07107.Y, (class07126)class07107.k, class04540.N(), (class03556)class04909.IV);
    }

    public boolean N(class04252 class042522, @Nullable class07049 class070492, @Nullable class08372<class07049> class083722, boolean bl) {
        if (this.z > 0) {
            return false;
        }
        return super.N(class042522, class070492, class083722, bl);
    }
}

