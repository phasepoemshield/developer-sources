/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00843
 *  minecraft.class00845
 *  minecraft.class00855
 *  minecraft.class00858
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01990
 *  minecraft.class02055
 *  minecraft.class02484
 *  minecraft.class02678
 *  minecraft.class02859
 *  minecraft.class03243
 *  minecraft.class03246
 *  minecraft.class03279
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03719
 *  minecraft.class03767
 *  minecraft.class04107
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05544
 *  minecraft.class05547
 *  minecraft.class05565
 *  minecraft.class05577
 *  minecraft.class05641
 *  minecraft.class05654
 *  minecraft.class05946
 *  minecraft.class06161
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06516
 *  minecraft.class06521
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07293
 *  minecraft.class07310
 *  minecraft.class07313
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00843;
import minecraft.class00845;
import minecraft.class00855;
import minecraft.class00858;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01990;
import minecraft.class02055;
import minecraft.class02484;
import minecraft.class02678;
import minecraft.class02859;
import minecraft.class03243;
import minecraft.class03246;
import minecraft.class03279;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03719;
import minecraft.class03767;
import minecraft.class04107;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05544;
import minecraft.class05547;
import minecraft.class05565;
import minecraft.class05577;
import minecraft.class05641;
import minecraft.class05654;
import minecraft.class05946;
import minecraft.class06161;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06516;
import minecraft.class06521;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06870;
import minecraft.class06886;
import minecraft.class06891;
import minecraft.class06895;
import minecraft.class06912;
import minecraft.class06915;
import minecraft.class07293;
import minecraft.class07310;
import minecraft.class07313;
import org.jspecify.annotations.Nullable;

public abstract class class06903 {
    protected final class01929 N;
    private final class02055<class06581> L;
    protected final class03719 y;
    private static final Map<class05565, class06891> u = ImmutableMap.builder().put((Object)class05565.field_28533, (class069032, class073102, class073103) -> class069032.N(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28534, (class069032, class073102, class073103) -> class069032.R(class01990.field_40634, class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_33689, (class069032, class073102, class073103) -> class069032.i(class01990.field_40634, class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28535, (class069032, class073102, class073103) -> class069032.y(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_40592, (class069032, class073102, class073103) -> class069032.L(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28536, (class069032, class073102, class073103) -> class069032.L(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_40593, (class069032, class073102, class073103) -> class069032.u(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28537, (class069032, class073102, class073103) -> class069032.u(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28538, (class069032, class073102, class073103) -> class069032.M(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28539, (class069032, class073102, class073103) -> class069032.y(class01990.field_40634, class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28540, (class069032, class073102, class073103) -> class069032.i(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28541, (class069032, class073102, class073103) -> class069032.N(class01990.field_40636, class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28542, (class069032, class073102, class073103) -> class069032.u(class01990.field_40634, class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28543, (class069032, class073102, class073103) -> class069032.R(class073102, class06510.method_8101((class07310)class073103))).put((Object)class05565.field_28544, (class069032, class073102, class073103) -> class069032.L(class01990.field_40635, class073102, class06510.method_8101((class07310)class073103))).build();

    public static String L(class07310 class073102) {
        return "has_" + class06903.u(class073102);
    }

    public void L(class00891 class008912, class00891 class008913) {
        this.N(class01990.field_40634, (class07310)class008912).N(Character.valueOf('M'), (class07310)class008913).N(" M ").N(" M ").y(class06903.u((class07310)class008912)).y(class06903.L((class07310)class008913), (class06915)this.y((class07310)class008913)).N(this.y);
    }

    public final class05544 L(class07310 class073102, class06510 class065102) {
        int n = class073102 == class00869.Mu ? 6 : 3;
        class06581 class065812 = class073102 == class00869.Mu ? class06570.GK : class06570.Tx;
        return this.N(class01990.field_40635, class073102, n).N(Character.valueOf('W'), class065102).N(Character.valueOf('#'), (class07310)class065812).N("W#W").N("W#W");
    }

    public void L(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.y(class019902, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), this.y(class073103)).N(this.y);
    }

    public final class05544 L(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102, 6).N(Character.valueOf('#'), class065102).N("###").N("###");
    }

    public void L(class07310 class073102, class07310 class073103) {
        this.y(class01990.field_40637, class073102).N((class07310)class00869.LA).N(class073103).y("chest_boat").y("has_boat", (class06915)this.N((class03530<class06581>)class01226.yW)).N(this.y);
    }

    public void M(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.R(class019902, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void M(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102, 3).N(Character.valueOf('#'), class073103).N("##").y("carpet").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public final class05544 M(class07310 class073102, class06510 class065102) {
        return this.N(class01990.field_40635, class073102, 3).y("sign").N(Character.valueOf('#'), class065102).N(Character.valueOf('X'), (class07310)class06570.Tx).N("###").N("###").N(" X ");
    }

    public static String M(class07310 class073102) {
        return class06903.u(class073102) + "_from_blasting";
    }

    public void P(class07310 class073102, class07310 class073103) {
        this.y(class01990.field_40634, class073102, 8).N(class073103).N((class07310)class00869.e, 4).N((class07310)class00869.X, 4).y("concrete_powder").y("has_sand", (class06915)this.y((class07310)class00869.e)).y("has_gravel", (class06915)this.y((class07310)class00869.X)).N(this.y);
    }

    public final void T(class07310 class073102, class07310 class073103) {
        class06886.L(class06510.method_8101((class07310)class073103), class01990.field_40634, class073102, 0.1f, 200).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    protected class06903(class01929 class019292, class03719 class037192) {
        this.N = class019292;
        this.L = class019292.y(class04227.F);
        this.y = class037192;
    }

    public void B(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102).N(Character.valueOf('#'), class073103).N(Character.valueOf('X'), (class03530<class06581>)class01226.y).N("###").N("XXX").y("bed").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void B(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.N(class019902, class073102).N(Character.valueOf('#'), class073103).N("#").N("#").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void B(class07310 class073102, class06510 class065102) {
        this.N(class01990.field_40642, class073102, 2).N(Character.valueOf('#'), (class07310)class06570.TN).N(Character.valueOf('C'), class065102).N(Character.valueOf('S'), class073102).N("#S#").N("#C#").N("###").y(class06903.L(class073102), (class06915)this.y(class073102)).N(this.y);
    }

    private static /* synthetic */ String B(class07310 class073102) {
        return class06903.L(class073102);
    }

    public void Z(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.N(class019902, class073102, class073103, 1);
    }

    public void Z(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102).N(Character.valueOf('#'), class073103).N(Character.valueOf('|'), (class07310)class06570.Tx).N("###").N("###").N(" | ").y("banner").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public static String i(class07310 class073102) {
        return class06903.u(class073102);
    }

    public final class06870 i(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102, 4).N(Character.valueOf('#'), class065102).N("##").N("##");
    }

    public void i(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.u(class019902, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), this.y(class073103)).N(this.y);
    }

    public void i(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102, 6).N(Character.valueOf('#'), class073103).N("###").N("   ").N("###").y("shelf").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public class05544 i(class07310 class073102, class06510 class065102) {
        return this.N(class01990.field_40634, class073102, 4).N(Character.valueOf('#'), class065102).N("#  ").N("## ").N("###");
    }

    public void b(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40642, class073102, 2).N(Character.valueOf('#'), (class07310)class06570.TN).N(Character.valueOf('C'), class073103).N(Character.valueOf('S'), class073102).N("#S#").N("#C#").N("###").y(class06903.L(class073102), (class06915)this.y(class073102)).N(this.y);
    }

    public void s(class07310 class073102, class07310 class073103) {
        this.y(class01990.field_40635, class073102).N((class07310)class00869.Te).N(class073103).y("dyed_candle").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void m(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40634, class073102, 8).N(Character.valueOf('#'), (class07310)class00869.zj).N(Character.valueOf('X'), class073103).N("###").N("#X#").N("###").y("stained_terracotta").y("has_terracotta", (class06915)this.y((class07310)class00869.zj)).N(this.y);
    }

    public static String j(class07310 class073102, class07310 class073103) {
        return class06903.u(class073102) + "_from_" + class06903.u(class073103);
    }

    public void U(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40639, class073102).N(Character.valueOf('#'), class073103).N(Character.valueOf('G'), (class07310)class06570.Lc).N(Character.valueOf('L'), (class07310)class06570.js).N("LLL").N("G#G").y("harness").y("has_dried_ghast", (class06915)this.y((class07310)class00869.mu)).N(this.y);
    }

    public void z(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40634, class073102, 8).N(Character.valueOf('#'), (class07310)class00869.ND).N(Character.valueOf('X'), class073103).N("###").N("#X#").N("###").y("stained_glass").y("has_glass", (class06915)this.y((class07310)class00869.ND)).N(this.y);
    }

    public void u(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40636, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), this.y(class073103)).N(this.y);
    }

    public void u(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.L(class019902, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), this.y(class073103)).N(this.y);
    }

    public final class05544 u(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102, 4).N(Character.valueOf('S'), class065102).N("SS").N("SS");
    }

    public final class05544 u(class07310 class073102, class06510 class065102) {
        return this.N(class01990.field_40636, class073102).N(Character.valueOf('#'), (class07310)class06570.Tx).N(Character.valueOf('W'), class065102).N("#W#").N("#W#");
    }

    public static String u(class07310 class073102) {
        return class04206.B.y((Object)class073102.B()).N();
    }

    public void y(class03767 class037672) {
        ((BiMap)class02859.N.get()).forEach((class008912, class008913) -> {
            if (!class008913.method_45322().N(class037672)) {
                return;
            }
            Pair var4 = (Pair)class02859.L.getOrDefault(class008913, (Object)Pair.of((Object)class01990.field_40634, (Object)class06903.u((class07310)class008913)));
            class01990 class019902 = (class01990)var4.getFirst();
            String string = (String)var4.getSecond();
            this.y(class019902, (class07310)class008913).N((class07310)class008912).N((class07310)class06570.wR).y(string).y(class06903.L((class07310)class008912), (class06915)this.y((class07310)class008912)).N(this.y, class06903.j((class07310)class008913, (class07310)class06570.wR));
        });
    }

    public void y(class01990 class019902, class07310 class073102, class01990 class019903, class07310 class073103, String string, String string2) {
        this.N(class019902, class073102, class019903, class073103, class06903.i(class073103), null, string, string2);
    }

    public class06915<class00843> y(class07310 class073102) {
        return class06903.N(class00837.N().N(this.L, new class07310[]{class073102}));
    }

    public class06510 y(class03530<class06581> class035302) {
        return class06510.method_8106((class03543)this.L.y(class035302));
    }

    public void y(List<class07310> list, class01990 class019902, class07310 class073102, float f, int n, String string) {
        this.N(class06514.T, class05641::new, list, class019902, class073102, f, n, string, "_from_blasting");
    }

    public class06895 y(class01990 class019902, class07310 class073102) {
        return class06895.N(this.L, class019902, class073102);
    }

    public void y(class00891 class008912, class00891 class008913) {
        this.N(class01990.field_40636, (class07310)class008912, 4).N(Character.valueOf('C'), (class07310)class008913).N(Character.valueOf('R'), (class07310)class06570.WY).N(Character.valueOf('B'), (class07310)class06570.nU).N(" C ").N("CBC").N(" R ").y(class06903.L((class07310)class008913), (class06915)this.y((class07310)class008913)).y(class06903.u((class07310)class008912)).N(this.y);
    }

    public class06895 y(class01990 class019902, class07310 class073102, int n) {
        return class06895.N(this.L, class019902, class073102, n);
    }

    public void y(class07310 class073102, class03530<class06581> class035302, int n) {
        this.y(class01990.field_40634, class073102, n).N(class035302).y("planks").y("has_logs", (class06915)this.N(class035302)).N(this.y);
    }

    public class05544 y(class07310 class073102, class06510 class065102) {
        return this.N(class01990.field_40636, class073102, 3).N(Character.valueOf('#'), class065102).N("##").N("##").N("##");
    }

    public void y(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.N(class019902, class073102, class073103, class06903.L(class073103));
    }

    public class05544 y(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102, 6).N(Character.valueOf('#'), class065102).N("###");
    }

    public void y(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40637, class073102).N(Character.valueOf('#'), class073103).N("# #").N("###").y("boat").y("in_water", (class06915)class06903.N(class00869.K)).N(this.y);
    }

    public void E(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102, 16).N(Character.valueOf('#'), class073103).N("###").N("###").y("stained_glass_pane").y("has_glass", (class06915)this.y(class073103)).N(this.y);
    }

    public void N(class07310 class073102, class07310 class073103, @Nullable String string) {
        this.N(class073102, class073103, string, 1);
    }

    public void N(class07310 class073102, class03530<class06581> class035302, int n) {
        this.y(class01990.field_40634, class073102, n).N(class035302).y("planks").y("has_log", (class06915)this.N(class035302)).N(this.y);
    }

    public void N(class07310 class073102, class07310 class073103, @Nullable String string, int n) {
        this.y(class01990.field_40642, class073102, n).N(class073103).y(string).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y, class06903.j(class073102, class073103));
    }

    public void N(List<class06581> list, List<class06581> list2, @Nullable class06581 class065812, String string, class01990 class019902) {
        for (int i = 0; i < list.size(); ++i) {
            class06581 class065814 = list.get(i);
            class06581 class065815 = list2.get(i);
            Stream<class06581> stream = list2.stream().filter(class065813 -> !class065813.equals(class065815));
            if (class065812 != null) {
                stream = Stream.concat(stream, Stream.of(class065812));
            }
            this.y(class019902, (class07310)class065815).N((class07310)class065814).N(class06510.method_26964(stream)).y(string).y("has_needed_dye", (class06915)this.y((class07310)class065814)).N(this.y, "dye_" + class06903.u((class07310)class065815));
        }
    }

    public class06870 N(class01990 class019902, class07310 class073102) {
        return class06870.N(this.L, class019902, class073102);
    }

    public class06870 N(class01990 class019902, class07310 class073102, int n) {
        return class06870.N(this.L, class019902, class073102, n);
    }

    public class06895 N(class01990 class019902, class06584 class065842) {
        return class06895.N(this.L, class019902, class065842);
    }

    public void N(List<class06581> list, List<class06581> list2, String string, class01990 class019902) {
        this.N(list, list2, null, string, class019902);
    }

    public void N(class01990 class019902, class07310 class073102, class01990 class019903, class07310 class073103) {
        this.N(class019902, class073102, class019903, class073103, class06903.i(class073103), null, class06903.i(class073102), null);
    }

    public void N(class03767 class037672) {
        class05577.N().filter(class05547::u).forEach(class055472 -> this.N((class05547)class055472, class037672));
    }

    public final class05544 N(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102).N(Character.valueOf('#'), class065102).N("##");
    }

    public void N(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40634, class073102, 3).N(Character.valueOf('#'), class073103).N("##").N("##").y("bark").y("has_log", (class06915)this.y(class073103)).N(this.y);
    }

    public final class05544 N(class07310 class073102, class06510 class065102) {
        return this.y(class01990.field_40636, class073102).N(class065102);
    }

    public abstract void N();

    public final <T extends class07313> void N(String string, class06514<T> class065142, class07293<T> class072932, int n, class07310 class073102, class07310 class073103, float f) {
        class06886.N(class06510.method_8101((class07310)class073102), class01990.field_40640, class073103, f, n, class065142, class072932).y(class06903.L(class073102), (class06915)this.y(class073102)).N(this.y, class06903.u(class073103) + "_from_" + string);
    }

    public void N(class00891 class008912, class00891 class008913) {
        this.N(class01990.field_40634, (class07310)class008912, 4).N(Character.valueOf('M'), (class07310)class008913).N(" M ").N("M M").N(" M ").y(class06903.u((class07310)class008912)).y(class06903.L((class07310)class008913), (class06915)this.y((class07310)class008913)).N(this.y);
    }

    public void N(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.N(class019902, class073102, 1).N(Character.valueOf('#'), class073103).N("##").N("##").y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void N(class01990 class019902, class07310 class073102, class07310 class073103, String string) {
        this.y(class019902, class073102).N(class073103, 9).y(string, (class06915)this.y(class073103)).N(this.y);
    }

    public void N(class06581 class065812, class01990 class019902, class06581 class065813) {
        class03279.N((class06510)class06510.method_8101((class07310)class06570.ky), (class06510)class06510.method_8101((class07310)class065812), (class06510)this.y((class03530<class06581>)class01226.yY), (class01990)class019902, (class06581)class065813).N("has_netherite_ingot", this.N((class03530<class06581>)class01226.yY)).N(this.y, class06903.u((class07310)class065813) + "_smithing");
    }

    public void N(class05547 class055472, class03767 class037672) {
        class055472.y().forEach((class055652, class008912) -> {
            if (!class008912.method_45322().N(class037672)) {
                return;
            }
            class06891 class068912 = u.get(class055652);
            class00891 class008913 = this.N(class055472, (class05565)class055652);
            if (class068912 != null) {
                class05544 class055442 = class068912.create(this, (class07310)class008912, (class07310)class008913);
                class055472.i().ifPresent(string -> class055442.y(string + (String)(class055652 == class05565.field_33689 ? "" : "_" + class055652.N())));
                class055442.y(class055472.R().orElseGet(() -> class06903.B((class07310)class008913)), this.y((class07310)class008913));
                class055442.N(this.y);
            }
            if (class055652 == class05565.field_29503) {
                this.T((class07310)class008912, (class07310)class008913);
            }
        });
    }

    public final <T extends class07313> void N(class06514<T> class065142, class07293<T> class072932, List<class07310> list, class01990 class019902, class07310 class073102, float f, int n, String string, String string2) {
        for (class07310 class073103 : list) {
            class06886.N(class06510.method_8101((class07310)class073103), class019902, class073102, f, n, class065142, class072932).y(string).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y, class06903.u(class073102) + string2 + "_" + class06903.u(class073103));
        }
    }

    public void N(class01990 class019902, class07310 class073102, class01990 class019903, class07310 class073103, String string, String string2) {
        this.N(class019902, class073102, class019903, class073103, string, string2, class06903.i(class073102), null);
    }

    public void N(class01990 class019902, class07310 class073102, class07310 class073103, int n) {
        class06161.N((class06510)class06510.method_8101((class07310)class073103), (class01990)class019902, (class07310)class073102, (int)n).y(class06903.L(class073103), this.y(class073103)).N(this.y, class06903.j(class073102, class073103) + "_stonecutting");
    }

    public final void N(class01990 class019902, class07310 class073102, class01990 class019903, class07310 class073103, String string, @Nullable String string2, String string3, @Nullable String string4) {
        this.y(class019902, class073102, 9).N(class073103).y(string4).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y, class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)string3)));
        this.N(class019903, class073103).N(Character.valueOf('#'), class073102).N("###").N("###").N("###").y(string2).y(class06903.L(class073102), (class06915)this.y(class073102)).N(this.y, class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)string)));
    }

    public void N(class06581 class065812, class05946<class03246> class059462, class05946<class06521<?>> class059463) {
        class03529 class035292 = this.N.y(class04227.yk).y(class059462);
        class03243.N((class06510)class06510.method_8101((class07310)class065812), (class06510)this.y((class03530<class06581>)class01226.yx), (class06510)this.y((class03530<class06581>)class01226.yD), (class03556)class035292, (class01990)class01990.field_40642).N("has_smithing_trim_template", this.y((class07310)class065812)).N(this.y, class059463);
    }

    public <T extends class07313> void N(String string, class06514<T> class065142, class07293<T> class072932, int n) {
        this.N(string, class065142, class072932, n, (class07310)class06570.ni, (class07310)class06570.nR, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.nM, (class07310)class06570.nB, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.vu, (class07310)class06570.vB, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.uD, (class07310)class06570.ny, 0.1f);
        this.N(string, class065142, class072932, n, (class07310)class06570.vi, (class07310)class06570.vZ, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.lL, (class07310)class06570.lu, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.bo, (class07310)class06570.bq, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.Gj, (class07310)class06570.Gv, 0.35f);
        this.N(string, class065142, class072932, n, (class07310)class06570.Gc, (class07310)class06570.GX, 0.35f);
    }

    public void N(class06581 class065812, class04107 class041072) {
        class06584 class065842 = new class06584((class03556)class06570.dk.i(), 1, class02678.N().N(class02484.NN, (Object)class041072.L()).N());
        this.N(class01990.field_40640, class065842).N((class07310)class06570.sC).N((class07310)class06570.uc).N((class07310)class06570.uX).N((class07310)class065812).y("suspicious_stew").y(class06903.L((class07310)class065812), (class06915)this.y((class07310)class065812)).N(this.y, class06903.u((class07310)class065842.B()) + "_from_" + class06903.u((class07310)class065812));
    }

    public void N(class07310 class073102) {
        this.N(class01990.field_40634, class073102, 1).N(Character.valueOf('#'), (class07310)class06570.nE).N(Character.valueOf('X'), (class07310)class06570.Rx).N("###").N("#X#").N("###").y("dry_ghast").y(class06903.L((class07310)class06570.nE), (class06915)this.y((class07310)class06570.nE)).N(this.y);
    }

    public void N(List<class07310> list, class01990 class019902, class07310 class073102, float f, int n, String string) {
        this.N(class06514.s, class05654::new, list, class019902, class073102, f, n, string, "_from_smelting");
    }

    public static class06915<class00843> N(class00837 ... class00837Array) {
        return class06903.N((class00845[])Arrays.stream(class00837Array).map(class00837::y).toArray(class00845[]::new));
    }

    public static class06915<class00843> N(class00845 ... class00845Array) {
        return class06912.R.N((class06516)new class00843(Optional.empty(), class00855.y, List.of(class00845Array)));
    }

    public final class00891 N(class05547 class055472, class05565 class055652) {
        if (class055652 == class05565.field_28534) {
            if (!class055472.y().containsKey(class05565.field_28539)) {
                throw new IllegalStateException("Slab is not defined for the family.");
            }
            return class055472.N(class05565.field_28539);
        }
        return class055472.N();
    }

    public class06915<class00843> N(class03530<class06581> class035302) {
        return class06903.N(class00837.N().N(this.L, class035302));
    }

    public static class06915<class00858> N(class00891 class008912) {
        return class06912.i.N((class06516)new class00858(Optional.empty(), Optional.of(class008912.s()), Optional.empty()));
    }

    public final class06915<class00843> N(class00836 class008362, class07310 class073102) {
        return class06903.N(class00837.N().N(this.L, new class07310[]{class073102}).N(class008362));
    }

    public void W(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102, 8).N(Character.valueOf('#'), (class07310)class00869.RJ).N(Character.valueOf('$'), class073103).N("###").N("#$#").N("###").y("stained_glass_pane").y("has_glass_pane", (class06915)this.y((class07310)class00869.RJ)).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y, class06903.j(class073102, (class07310)class00869.RJ));
    }

    public static String R(class07310 class073102) {
        return class06903.u(class073102) + "_from_smelting";
    }

    public class05544 R(class07310 class073102, class06510 class065102) {
        return this.N(class01990.field_40636, class073102, 2).N(Character.valueOf('#'), class065102).N("###").N("###");
    }

    public void R(class01990 class019902, class07310 class073102, class07310 class073103) {
        this.i(class019902, class073102, class06510.method_8101((class07310)class073103)).y(class06903.L(class073103), (class06915)this.y(class073103)).N(this.y);
    }

    public void R(class07310 class073102, class07310 class073103) {
        this.N(class01990.field_40635, class073102, 6).y("hanging_sign").N(Character.valueOf('#'), class073103).N(Character.valueOf('X'), (class07310)class06570.MQ).N("X X").N("###").N("###").y("has_stripped_logs", (class06915)this.y(class073103)).N(this.y);
    }

    public class06870 R(class01990 class019902, class07310 class073102, class06510 class065102) {
        return this.N(class019902, class073102).N(Character.valueOf('#'), class065102).N("#").N("#");
    }
}

