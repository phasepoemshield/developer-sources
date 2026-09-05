/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00939
 *  minecraft.class01894
 *  minecraft.class02245
 *  minecraft.class02484
 *  minecraft.class02758
 *  minecraft.class02774
 *  minecraft.class02840
 *  minecraft.class02841
 *  minecraft.class03971
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04941
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06581
 *  minecraft.class06851
 *  minecraft.class06918
 *  minecraft.class07438
 *  minecraft.class08476
 *  minecraft.class08827
 *  minecraft.class08943
 *  minecraft.class08971
 *  minecraft.class08982
 */
package minecraft;

import java.util.Optional;
import java.util.function.Function;
import minecraft.class00939;
import minecraft.class01894;
import minecraft.class02245;
import minecraft.class02484;
import minecraft.class02758;
import minecraft.class02774;
import minecraft.class02840;
import minecraft.class02841;
import minecraft.class03971;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04941;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06581;
import minecraft.class06851;
import minecraft.class06918;
import minecraft.class07438;
import minecraft.class08140;
import minecraft.class08476;
import minecraft.class08827;
import minecraft.class08943;
import minecraft.class08971;
import minecraft.class08982;

public class class08111
extends class02840<class08982, class08140, class04941> {
    public class08111(class04832 class048322) {
        super(class048322, (class06078)new class04941(class048322.N(class04802.Nm)), 0.5f);
        this.N((class06249)new class03971((class06252)this, class08111.u(), (class081402, f) -> 1.0f, (class06078)new class04941(class048322.N(class04802.Nm)), class06851::T, false));
        this.N((class06249)new class02758((class06252)this));
        this.N((class06249)new class00939((class06252)this, class081402 -> class081402.B, arg_0 -> ((class04941)((class04941)this.y)).y(arg_0)));
        this.N((class06249)new class02245((class06252)this, class048322.R(), class048322.U()));
    }

    private static Function<class08140, class01894> u() {
        return class081402 -> class08971.N((class02774)class081402.N).R();
    }

    public class08140 method_55269() {
        return new class08140();
    }

    public void method_62354(class08982 class089822, class08140 class081402, float f) {
        super.method_62354((class07438)class089822, (class08476)class081402, f);
        class08827.N((class07438)class089822, (class08827)class081402, (class08943)this.L, (float)f);
        class081402.N = class089822.E();
        class081402.y = class089822.B();
        class081402.L.N(class089822.m());
        class081402.u.N(class089822.v());
        class081402.i.N(class089822.n());
        class081402.R.N(class089822.t());
        class081402.M.N(class089822.G());
        class081402.B = Optional.of(class089822.method_6118(class08982.N)).flatMap(class065842 -> {
            class06581 class065812 = class065842.B();
            if (!(class065812 instanceof class06918)) {
                return Optional.empty();
            }
            class06918 class069182 = (class06918)class065812;
            class065812 = (class02841)class065842.a_(class02484.Nl, (Object)class02841.N);
            return Optional.of(class065812.N(class069182.L().W()));
        });
    }

    public class01894 N(class08140 class081402) {
        return class08971.N((class02774)class081402.N).i();
    }
}

