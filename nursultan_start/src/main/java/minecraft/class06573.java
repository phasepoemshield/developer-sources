/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01217
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class02204
 *  minecraft.class02206
 *  minecraft.class02232
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02676
 *  minecraft.class02695
 *  minecraft.class02749
 *  minecraft.class02764
 *  minecraft.class02766
 *  minecraft.class02833
 *  minecraft.class02834
 *  minecraft.class02957
 *  minecraft.class03252
 *  minecraft.class03274
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03683
 *  minecraft.class03696
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05349
 *  minecraft.class05946
 *  minecraft.class06495
 *  minecraft.class06932
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class07536
 *  minecraft.class08153
 *  minecraft.class08155
 *  minecraft.class08169
 *  minecraft.class08172
 *  minecraft.class08174
 *  minecraft.class08186
 *  minecraft.class08197
 *  minecraft.class08208
 *  minecraft.class08209
 *  minecraft.class08216
 *  minecraft.class08225
 *  minecraft.class08551
 *  minecraft.class08609
 *  minecraft.class08721
 *  minecraft.class08725
 *  minecraft.class08983
 *  net.fabricmc.fabric.api.item.v1.FabricItem$Settings
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01217;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class02204;
import minecraft.class02206;
import minecraft.class02232;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02676;
import minecraft.class02695;
import minecraft.class02749;
import minecraft.class02764;
import minecraft.class02766;
import minecraft.class02833;
import minecraft.class02834;
import minecraft.class02957;
import minecraft.class03252;
import minecraft.class03274;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03683;
import minecraft.class03696;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05349;
import minecraft.class05946;
import minecraft.class06495;
import minecraft.class06543;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06932;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class07536;
import minecraft.class08153;
import minecraft.class08155;
import minecraft.class08169;
import minecraft.class08172;
import minecraft.class08174;
import minecraft.class08186;
import minecraft.class08197;
import minecraft.class08208;
import minecraft.class08209;
import minecraft.class08216;
import minecraft.class08225;
import minecraft.class08551;
import minecraft.class08609;
import minecraft.class08721;
import minecraft.class08725;
import minecraft.class08983;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import org.jspecify.annotations.Nullable;

public class class06573
implements FabricItem.Settings {
    private static final class08216<class06581, String> L = class059462 -> class07536.N((String)"block", (class01894)class059462.N());
    private static final class08216<class06581, String> u = class059462 -> class07536.N((String)"item", (class01894)class059462.N());
    private final class02676 i = class02695.N().N(class02484.yy);
    @Nullable class06581 N;
    class03767 y = class03794.M;
    private @Nullable class05946<class06581> R;
    private class08216<class06581, String> M = u;
    private class08216<class06581, class01894> B = class05946::N;

    public class06573 L() {
        this.M = u;
        return this;
    }

    public class06573 L(int n) {
        return this.N(class02484.J, new class02766(n));
    }

    public class06573 L(class06932 class069322) {
        class02055 class020552 = class04206.N((class00751)class04206.M);
        return this.N(class069322.N(class03274.field_48838)).N(class02484.o, class08725.N((class07085)class07085.field_48824).N((class03556)class04909.NY).N(class069322.B()).N((class03543)class020552.y(class01217.c)).L(false).u(true).i(true).y((class03556)class04909.NQ).N()).N(1);
    }

    public class06573 L(class02749 class027492, float f, float f2) {
        return this.N(class027492, (class03530<class00891>)class01210.yX, f, f2, 0.0f);
    }

    public class06573 L(class06581 class065812) {
        return this.N(class02484.q, new class02764((class03543)class03543.N((class03556[])new class03556[]{class065812.i()})));
    }

    public class06573 L(class05946<class06581> class059462) {
        this.R = class059462;
        return this;
    }

    public class06573 i(class02749 class027492, float f, float f2) {
        return class027492.N(this, f, f2);
    }

    public class01894 i() {
        return (class01894)this.B.get(Objects.requireNonNull(this.R, "Item id not set"));
    }

    public String u() {
        return (String)this.M.get(Objects.requireNonNull(this.R, "Item id not set"));
    }

    public class06573 u(class02749 class027492, float f, float f2) {
        return this.N(class027492, (class03530<class00891>)class01210.yp, f, f2, 0.0f);
    }

    public class06573 y(int n) {
        this.N(class02484.u, n);
        this.N(class02484.L, 1);
        this.N(class02484.i, 0);
        return this;
    }

    public class06573 y(class06581 class065812) {
        this.N = class065812;
        return this;
    }

    public class06573 y() {
        this.M = L;
        return this;
    }

    public class06573 y(class06932 class069322) {
        class02055 class020552 = class04206.N((class00751)class04206.M);
        return this.N(class069322.N(class03274.field_48838)).N(class02484.o, class08725.N((class07085)class07085.field_48824).N((class03556)class04909.PJ).N(class069322.B()).N((class03543)class020552.y(class01217.H)).L(false).i(true).y((class03556)class04909.Po).N()).N(1);
    }

    public class06573 y(class05946<class03252> class059462) {
        return this.N(class02484.Nz, new class08551(class059462));
    }

    public class06573 y(class07085 class070852) {
        return this.N(class02484.o, class08725.N((class07085)class070852).y(false).N());
    }

    public class06573 y(class02749 class027492, float f, float f2) {
        return this.N(class027492, (class03530<class00891>)class01210.yc, f, f2, 5.0f);
    }

    public class06573 N(class05349 class053492, class08209 class082092) {
        return this.N(class02484.d, class053492).N(class02484.w, class082092);
    }

    public class06573 N(int n) {
        return this.N(class02484.L, n);
    }

    public class06573 N(String string) {
        this.M = class08216.N((Object)string);
        return this;
    }

    public class06573 N(class05349 class053492) {
        return this.N(class053492, class08225.N);
    }

    public <T> class06573 N(class02477<T> class024772, T t) {
        this.i.N(class024772, t);
        return this;
    }

    public class06573 N(class02833 class028332) {
        return this.N(class02484.b, class028332);
    }

    public class06573 N(class06581 class065812) {
        return this.N(class02484.k, new class08197(new class06584(class065812)));
    }

    class02695 N(class00392 class003922, class01894 class018942) {
        class02695 class026952 = this.i.N(class02484.U, (Object)class003922).N(class02484.E, (Object)class018942).N();
        if (class026952.N(class02484.i) && (Integer)class026952.a_(class02484.L, (Object)1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
        }
        return class026952;
    }

    public class06573 N(float f) {
        return this.N(class02484.Y, new class08208(f));
    }

    public class06573 N(class06495 class064952) {
        return this.N(class02484.m, class064952);
    }

    public class06573 N(class02749 class027492, float f, float f2) {
        return this.N(class027492, (class03530<class00891>)class01210.ya, f, f2, 0.0f);
    }

    public class06573 N(class02749 class027492, class03530<class00891> class035302, float f, float f2, float f3) {
        return class027492.N(this, class035302, f, f2, f3);
    }

    public class06573 N(class07085 class070852) {
        return this.N(class02484.o, class08725.N((class07085)class070852).N());
    }

    public class06573 N(class03530<class06581> class035302) {
        class02055 class020552 = class04206.N((class00751)class04206.B);
        return this.N(class02484.q, new class02764((class03543)class020552.y(class035302)));
    }

    public class06573 N() {
        return this.N(class02484.Q, new class08721(class03696.Z));
    }

    public class06573 N(class02957 ... class02957Array) {
        this.y = class03794.i.N(class02957Array);
        return this;
    }

    public class06573 N(class05946<class02206> class059462) {
        return this.N(class02484.NE, new class02232(new class02204(class059462)));
    }

    public class06573 N(class06932 class069322) {
        return this.y(class03274.field_48838.N(class069322.N())).N(class069322.N(class03274.field_48838)).N((class03530<class06581>)class069322.M()).N(class02484.o, class08725.N((class07085)class07085.field_48824).N(class069322.u()).N(class069322.B()).N((class03543)class03543.N((class03556[])new class03556[]{class07078.yC.T()})).i(true).y(class04206.y.i((Object)class04909.Nk)).N()).N(class02484.NY, class04909.JL).N(1);
    }

    public class06573 N(class02749 class027492, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return this.y(class027492.y()).N((class03530<class06581>)class027492.R()).L(class027492.i()).N(class02484.z, new class02204(class03683.g)).N(class02484.X, new class08174(10, (int)(f3 * 20.0f), class08169.N((int)((int)(f4 * 20.0f)), (float)f5), class08169.N((int)((int)(f6 * 20.0f)), (float)f7), class08169.y((int)((int)(f8 * 20.0f)), (float)f9), 0.38f, f2, Optional.of(class027492 == class02749.N ? class04909.YM : class04909.Yu), Optional.of(class027492 == class02749.N ? class04909.YB : class04909.Yi))).N(class02484.c, new class08172(true, false, Optional.of(class027492 == class02749.N ? class04909.YZ : class04909.YR), Optional.of(class027492 == class02749.N ? class04909.YB : class04909.Yi))).N(class02484.I, new class06543(2.0f, 4.5f, 2.0f, 6.5f, 0.125f, 0.5f)).N(class02484.Z, Float.valueOf(1.0f)).N(class02484.a, new class08186(class08155.field_63400, (int)(f * 20.0f))).N(class02833.N().N(class05298.u, new class07471(class06581.M, (double)(0.0f + class027492.u()), class07463.field_6328), class02834.field_49217).N(class05298.R, new class07471(class06581.B, (double)(1.0f / f) - 4.0, class07463.field_6328), class02834.field_49217).N()).N(class02484.M, new class08153(true, false, 1.0f)).N(class02484.g, new class08609(1));
    }

    public class06573 N(class07078<?> class070782) {
        return this.N(class02484.NR, class08983.N(class070782, (class07001)new class07001()));
    }

    public class06573 N(class06932 class069322, class03274 class032742) {
        return this.y(class032742.N(class069322.N())).N(class069322.N(class032742)).L(class069322.L()).N(class02484.o, class08725.N((class07085)class032742.N()).N(class069322.u()).N(class069322.B()).N()).N((class03530<class06581>)class069322.M());
    }

    public class06573 modelId(class01894 class018942) {
        this.B = class08216.N((Object)class018942);
        return super.modelId(class018942);
    }
}

