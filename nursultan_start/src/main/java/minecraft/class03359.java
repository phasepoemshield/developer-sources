/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.MatchException
 *  minecraft.class00189
 *  minecraft.class00500
 *  minecraft.class00653
 *  minecraft.class00952
 *  minecraft.class01097
 *  minecraft.class01112
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02157
 *  minecraft.class02689
 *  minecraft.class03795
 *  minecraft.class04225
 *  minecraft.class04384
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07000
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07211
 *  minecraft.class07237
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class07688
 *  minecraft.class07949
 *  minecraft.class08092
 *  minecraft.class08141
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00189;
import minecraft.class00500;
import minecraft.class00653;
import minecraft.class00952;
import minecraft.class01097;
import minecraft.class01112;
import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02157;
import minecraft.class02689;
import minecraft.class03358;
import minecraft.class03795;
import minecraft.class04225;
import minecraft.class04384;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07000;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07211;
import minecraft.class07237;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class07688;
import minecraft.class07949;
import minecraft.class08092;
import minecraft.class08141;
import org.jspecify.annotations.Nullable;

public class class03359
implements class03358<class07237, class00952> {
    private final Function<class07030, class01097> N;
    private static final Map<class07030, class01894> y = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(class07032.field_11512, class01894.y((String)"textures/entity/skeleton/skeleton.png"));
        hashMap.put(class07032.field_11513, class01894.y((String)"textures/entity/skeleton/wither_skeleton.png"));
        hashMap.put(class07032.field_11508, class01894.y((String)"textures/entity/zombie/zombie.png"));
        hashMap.put(class07032.field_11507, class01894.y((String)"textures/entity/creeper/creeper.png"));
        hashMap.put(class07032.field_11511, class01894.y((String)"textures/entity/enderdragon/dragon.png"));
        hashMap.put(class07032.field_41313, class01894.y((String)"textures/entity/piglin/piglin.png"));
        hashMap.put(class07032.field_11510, class00189.N());
    });
    private final class07949 L;

    public class03359(class04811 class048112) {
        class01140 class011402 = class048112.R();
        this.L = class048112.Z();
        this.N = class07536.y_4(class070302 -> class03359.N(class011402, class070302));
    }

    public static class07311 N(class01894 class018942) {
        return class06851.z((class01894)class018942);
    }

    public static @Nullable class01097 N(class01140 class011402, class07030 class070302) {
        if (class070302 instanceof class07032) {
            class07032 class070322 = (class07032)class070302;
            return switch (class070322) {
                default -> throw new MatchException(null, null);
                case class07032.field_11512 -> new class04384(class011402.N(class04802.uP));
                case class07032.field_11513 -> new class04384(class011402.N(class04802.iP));
                case class07032.field_11510 -> new class04384(class011402.N(class04802.Lo));
                case class07032.field_11508 -> new class04384(class011402.N(class04802.iw));
                case class07032.field_11507 -> new class04384(class011402.N(class04802.Nw));
                case class07032.field_11511 -> new class02157(class011402.N(class04802.NH));
                case class07032.field_41313 -> new class04225(class011402.N(class04802.Ld));
            };
        }
        return null;
    }

    @Override
    public class00952 i() {
        return new class00952();
    }

    @Override
    public void N(class07237 class072372, class00952 class009522, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class072372, class009522, f, class068892, class081412);
        class009522.N = class072372.N(f);
        class00500 class005002 = class072372.w();
        boolean bl = class005002.i() instanceof class00653;
        class009522.y = bl ? (class07211)class005002.L((class08092)class00653.u) : null;
        int n = bl ? class03795.N((class07211)class009522.y.b()) : (Integer)class005002.L((class08092)class07000.i);
        class009522.L = class03795.y((int)n);
        class009522.u = ((class07688)class005002.i()).y();
        class009522.i = this.N(class009522.u, class072372);
    }

    @Override
    public void N(class00952 class009522, class01421 class014212, class01237 class012372, class06959 class069592) {
        class01097 class010972 = this.N.apply(class009522.u);
        class03359.N(class009522.y, class009522.L, class009522.N, class014212, class012372, class009522.Z, class010972, class009522.i, 0, class009522.z);
    }

    public static void N(@Nullable class07211 class072112, float f, float f2, class01421 class014212, class01237 class012372, int n, class01097 class010972, class07311 class073112, int n2, @Nullable class08141 class081412) {
        class014212.N();
        if (class072112 == null) {
            class014212.N(0.5f, 0.0f, 0.5f);
        } else {
            float f3 = 0.25f;
            class014212.N(0.5f - (float)class072112.P() * 0.25f, 0.25f, 0.5f - (float)class072112.T() * 0.25f);
        }
        class014212.y(-1.0f, -1.0f, 1.0f);
        class01112 class011122 = new class01112();
        class011122.N = f2;
        class011122.y = f;
        class012372.N((class06271)class010972, (Object)class011122, class014212, class073112, n, class01384.u, n2, class081412);
        class014212.y();
    }

    private class07311 N(class07030 class070302, class07237 class072372) {
        class02689 class026892;
        if (class070302 == class07032.field_11510 && (class026892 = class072372.N()) != null) {
            return this.L.N(class026892).L();
        }
        return class03359.N(class070302, null);
    }

    public static class07311 N(class07030 class070302, @Nullable class01894 class018942) {
        return class06851.B((class01894)(class018942 != null ? class018942 : y.get(class070302)));
    }
}

