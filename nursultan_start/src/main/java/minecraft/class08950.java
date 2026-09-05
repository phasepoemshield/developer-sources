/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02774
 *  minecraft.class02859
 *  minecraft.class04206
 *  minecraft.class04891
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06638
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02774;
import minecraft.class02859;
import minecraft.class04206;
import minecraft.class04891;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06638;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;

public class class08950
extends class00860 {
    public static final MapCodec<class08950> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class08950::y), (App)class04206.y.T().fieldOf("open_sound").forGetter(class00860::j), (App)class04206.y.T().fieldOf("close_sound").forGetter(class00860::v), (App)class08950.t()).apply(instance, class08950::new));
    private static final Map<class00891, Supplier<class00891>> y = Map.of(class00869.bx, () -> class00869.vj, class00869.bD, () -> class00869.vv, class00869.bh, () -> class00869.vn, class00869.br, () -> class00869.vt, class00869.jG, () -> class00869.vj, class00869.jd, () -> class00869.vv, class00869.jl, () -> class00869.vn, class00869.jw, () -> class00869.vt);
    private final class02774 Z;

    private static class00500 L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class00891 class008912;
        class00500 class005003 = class072992.method_8320(class072092.method_10093(class08950.E((class00500)class005002)));
        if (!((class06638)class005002.L((class08092)class00860.i)).equals((Object)class06638.field_12569) && (class008912 = class005002.i()) instanceof class08950) {
            class08950 class089502 = (class08950)class008912;
            class008912 = class005003.i();
            if (class008912 instanceof class08950) {
                class08950 class089503 = (class08950)class008912;
                class008912 = class005002;
                class00500 class005004 = class005003;
                if (class089502.L() != class089503.L()) {
                    class008912 = class08950.N(class089502, class005002).orElse((class00500)class008912);
                    class005004 = class08950.N(class089503, class005003).orElse(class005004);
                }
                return (class089502.Z.ordinal() <= class089503.Z.ordinal() ? class008912.i() : class005004.i()).s((class00500)class008912);
            }
        }
        return class005002;
    }

    public boolean L(class00500 class005002) {
        return class005002.N(class01210.NZ) && class005002.y((class08092)class00860.i);
    }

    public boolean L() {
        return true;
    }

    private static /* synthetic */ class00891 Q() {
        return class00869.vn;
    }

    public class08950(class02774 class027742, class04891 class048912, class04891 class048913, class01362 class013622) {
        super(() -> class00404.field_11914, class048912, class048913, class013622);
        this.Z = class027742;
    }

    private static /* synthetic */ class00891 I() {
        return class00869.vt;
    }

    private static /* synthetic */ class00891 J() {
        return class00869.vn;
    }

    public boolean i(class00500 class005002) {
        return class005002.N(class01210.NZ);
    }

    private static /* synthetic */ class00891 i() {
        return class00869.vt;
    }

    private static /* synthetic */ class00891 o() {
        return class00869.vv;
    }

    private static /* synthetic */ class00891 g() {
        return class00869.vj;
    }

    private static /* synthetic */ class00891 q() {
        return class00869.vj;
    }

    public class02774 y() {
        return this.Z;
    }

    public MapCodec<? extends class08950> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class00500 class005004 = super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        if (this.L(class005003) && !((class06638)class005004.L((class08092)class00860.i)).equals((Object)class06638.field_12569) && class08950.E((class00500)class005004) == class072112) {
            return class005003.i().s(class005004);
        }
        return class005004;
    }

    public class00500 N(class06942 class069422) {
        return class08950.L(super.N(class069422), class069422.method_8045(), class069422.method_8037());
    }

    public static class00500 N(class00891 class008912, class07211 class072112, class07299 class072992, class07209 class072092) {
        class08950 class089502 = (class08950)y.getOrDefault(class008912, () -> ((class00891)class00869.vj).P()).get();
        class06638 class066382 = class089502.N(class072992, class072092, class072112);
        return class08950.L((class00500)((class00500)class089502.W().y((class08092)u, (Comparable)class072112)).y((class08092)i, (Comparable)class066382), class072992, class072092);
    }

    private static Optional<class00500> N(class08950 class089502, class00500 class005002) {
        if (!class089502.L()) {
            return Optional.of(class005002);
        }
        return Optional.ofNullable((class00891)((BiMap)class02859.y.get()).get((Object)class005002.i())).map(class008912 -> class008912.s(class005002));
    }

    private static /* synthetic */ class00891 O() {
        return class00869.vv;
    }
}

