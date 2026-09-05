/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00891
 *  minecraft.class01041
 *  minecraft.class01058
 *  minecraft.class01100
 *  minecraft.class01132
 *  minecraft.class01152
 *  minecraft.class01154
 *  minecraft.class01158
 *  minecraft.class01165
 *  minecraft.class01173
 *  minecraft.class01185
 *  minecraft.class01210
 *  minecraft.class01339
 *  minecraft.class01347
 *  minecraft.class01447
 *  minecraft.class01458
 *  minecraft.class01466
 *  minecraft.class01470
 *  minecraft.class01476
 *  minecraft.class01478
 *  minecraft.class01536
 *  minecraft.class01551
 *  minecraft.class01552
 *  minecraft.class01554
 *  minecraft.class01565
 *  minecraft.class01572
 *  minecraft.class01579
 *  minecraft.class01580
 *  minecraft.class01630
 *  minecraft.class01812
 *  minecraft.class01936
 *  minecraft.class02256
 *  minecraft.class02458
 *  minecraft.class02611
 *  minecraft.class02616
 *  minecraft.class02670
 *  minecraft.class02673
 *  minecraft.class02722
 *  minecraft.class03087
 *  minecraft.class03147
 *  minecraft.class03194
 *  minecraft.class03238
 *  minecraft.class03324
 *  minecraft.class03514
 *  minecraft.class03530
 *  minecraft.class03613
 *  minecraft.class03863
 *  minecraft.class03967
 *  minecraft.class04035
 *  minecraft.class04055
 *  minecraft.class04059
 *  minecraft.class04100
 *  minecraft.class04103
 *  minecraft.class04206
 *  minecraft.class04316
 *  minecraft.class04329
 *  minecraft.class04685
 *  minecraft.class04754
 *  minecraft.class04756
 *  minecraft.class04772
 *  minecraft.class04781
 *  minecraft.class04887
 *  minecraft.class05241
 *  minecraft.class05284
 *  minecraft.class05286
 *  minecraft.class05302
 *  minecraft.class05315
 *  minecraft.class05332
 *  minecraft.class05572
 *  minecraft.class05583
 *  minecraft.class05587
 *  minecraft.class05591
 *  minecraft.class05594
 *  minecraft.class05602
 *  minecraft.class05610
 *  minecraft.class05612
 *  minecraft.class05618
 *  minecraft.class05619
 *  minecraft.class05621
 *  minecraft.class05629
 *  minecraft.class05702
 *  minecraft.class05718
 *  minecraft.class05902
 *  minecraft.class05974
 *  minecraft.class05981
 *  minecraft.class05986
 *  minecraft.class06003
 *  minecraft.class06011
 *  minecraft.class06020
 *  minecraft.class06035
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06070
 *  minecraft.class06076
 *  minecraft.class06189
 *  minecraft.class06191
 *  minecraft.class06201
 *  minecraft.class06203
 *  minecraft.class06212
 *  minecraft.class06224
 *  minecraft.class06225
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class08088
 *  minecraft.class08518
 *  minecraft.class08531
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00891;
import minecraft.class01041;
import minecraft.class01058;
import minecraft.class01100;
import minecraft.class01132;
import minecraft.class01152;
import minecraft.class01154;
import minecraft.class01158;
import minecraft.class01165;
import minecraft.class01173;
import minecraft.class01185;
import minecraft.class01210;
import minecraft.class01339;
import minecraft.class01347;
import minecraft.class01447;
import minecraft.class01458;
import minecraft.class01466;
import minecraft.class01470;
import minecraft.class01476;
import minecraft.class01478;
import minecraft.class01536;
import minecraft.class01551;
import minecraft.class01552;
import minecraft.class01554;
import minecraft.class01565;
import minecraft.class01572;
import minecraft.class01579;
import minecraft.class01580;
import minecraft.class01630;
import minecraft.class01812;
import minecraft.class01936;
import minecraft.class02256;
import minecraft.class02458;
import minecraft.class02611;
import minecraft.class02616;
import minecraft.class02670;
import minecraft.class02673;
import minecraft.class02722;
import minecraft.class03087;
import minecraft.class03147;
import minecraft.class03194;
import minecraft.class03238;
import minecraft.class03324;
import minecraft.class03514;
import minecraft.class03530;
import minecraft.class03613;
import minecraft.class03863;
import minecraft.class03967;
import minecraft.class04035;
import minecraft.class04055;
import minecraft.class04059;
import minecraft.class04100;
import minecraft.class04103;
import minecraft.class04206;
import minecraft.class04316;
import minecraft.class04329;
import minecraft.class04685;
import minecraft.class04754;
import minecraft.class04756;
import minecraft.class04772;
import minecraft.class04781;
import minecraft.class04887;
import minecraft.class05241;
import minecraft.class05284;
import minecraft.class05286;
import minecraft.class05302;
import minecraft.class05315;
import minecraft.class05332;
import minecraft.class05572;
import minecraft.class05583;
import minecraft.class05587;
import minecraft.class05591;
import minecraft.class05594;
import minecraft.class05602;
import minecraft.class05610;
import minecraft.class05612;
import minecraft.class05618;
import minecraft.class05619;
import minecraft.class05621;
import minecraft.class05629;
import minecraft.class05702;
import minecraft.class05718;
import minecraft.class05902;
import minecraft.class05974;
import minecraft.class05981;
import minecraft.class05986;
import minecraft.class06003;
import minecraft.class06011;
import minecraft.class06020;
import minecraft.class06035;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06070;
import minecraft.class06076;
import minecraft.class06189;
import minecraft.class06191;
import minecraft.class06201;
import minecraft.class06203;
import minecraft.class06212;
import minecraft.class06224;
import minecraft.class06225;
import minecraft.class06386;
import minecraft.class06389;
import minecraft.class06393;
import minecraft.class06396;
import minecraft.class06397;
import minecraft.class06414;
import minecraft.class06422;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class08088;
import minecraft.class08518;
import minecraft.class08531;

public abstract class class06391<FC extends class06386> {
    public static final class06391<class06225> N = class06391.N("no_op", new class05902(class06225.y));
    public static final class06391<class01476> y = class06391.N("tree", new class03194(class01476.N));
    public static final class06391<class08531> L = class06391.N("fallen_tree", new class08518(class08531.N));
    public static final class06391<class01478> u = class06391.N("flower", new class01447(class01478.N));
    public static final class06391<class01478> i = class06391.N("no_bonemeal_flower", new class01447(class01478.N));
    public static final class06391<class01478> R = class06391.N("random_patch", new class01447(class01478.N));
    public static final class06391<class01458> M = class06391.N("block_pile", new class05241(class01458.N));
    public static final class06391<class01470> B = class06391.N("spring_feature", new class04754(class01470.N));
    public static final class06391<class06225> Z = class06391.N("chorus_plant", new class03613(class06225.y));
    public static final class06391<class05591> z = class06391.N("replace_single_block", new class05621(class05591.N));
    public static final class06391<class06225> U = class06391.N("void_start_platform", new class04781(class06225.y));
    public static final class06391<class06225> E = class06391.N("desert_well", new class06393((Codec<class06225>)class06225.y));
    public static final class06391<class02670> W = class06391.N("fossil", new class06422((Codec<class02670>)class02670.N));
    public static final class06391<class01466> m = class06391.N("huge_red_mushroom", new class01565(class01466.N));
    public static final class06391<class01466> P = class06391.N("huge_brown_mushroom", new class01552(class01466.N));
    public static final class06391<class06225> s = class06391.N("ice_spike", new class01572(class06225.y));
    public static final class06391<class06225> T = class06391.N("glowstone_blob", new class01580(class06225.y));
    public static final class06391<class06225> b = class06391.N("freeze_top_layer", new class04756(class06225.y));
    public static final class06391<class06225> j = class06391.N("vines", new class04772(class06225.y));
    public static final class06391<class04055> v = class06391.N("block_column", new class04035(class04055.N));
    public static final class06391<class02256> n = class06391.N("vegetation_patch", new class02616(class02256.N));
    public static final class06391<class02256> t = class06391.N("waterlogged_vegetation_patch", new class02458(class02256.N));
    public static final class06391<class02673> G = class06391.N("root_system", new class02722(class02673.N));
    public static final class06391<class05583> l = class06391.N("multiface_growth", new class05572(class05583.N));
    public static final class06391<class06076> d = class06391.N("underwater_magma", new class06070(class06076.N));
    public static final class06391<class06225> w = class06391.N("monster_room", new class06224(class06225.y));
    public static final class06391<class06225> k = class06391.N("blue_ice", new class03863(class06225.y));
    public static final class06391<class03967> Y = class06391.N("iceberg", new class01554(class03967.N));
    public static final class06391<class03967> Q = class06391.N("forest_rock", new class03147(class03967.N));
    public static final class06391<class01812> O = class06391.N("disk", new class06396((Codec<class01812>)class01812.N));
    public static final class06391<class01579> g = class06391.N("lake", new class01551(class01579.N));
    public static final class06391<class06191> I = class06391.N("ore", new class06203(class06191.N));
    public static final class06391<class06225> J = class06391.N("end_platform", new class02611(class06225.y));
    public static final class06391<class04685> o = class06391.N("end_spike", new class01058(class04685.N));
    public static final class06391<class06225> q = class06391.N("end_island", new class06397((Codec<class06225>)class06225.y));
    public static final class06391<class06414> K = class06391.N("end_gateway", new class06389(class06414.N));
    public static final class05594 V = class06391.N("seagrass", new class05594(class06212.N));
    public static final class06391<class06225> e = class06391.N("kelp", new class01536(class06225.y));
    public static final class06391<class06225> H = class06391.N("coral_tree", new class03324(class06225.y));
    public static final class06391<class06225> c = class06391.N("coral_mushroom", new class01936(class06225.y));
    public static final class06391<class06225> X = class06391.N("coral_claw", new class04103(class06225.y));
    public static final class06391<class01630> a = class06391.N("sea_pickle", new class05619(class01630.N));
    public static final class06391<class05610> p = class06391.N("simple_block", new class05612(class05610.N));
    public static final class06391<class06212> F = class06391.N("bamboo", new class03087(class06212.N));
    public static final class06391<class06020> A = class06391.N("huge_fungus", new class05986(class06020.N));
    public static final class06391<class04316> f = class06391.N("nether_forest_vegetation", new class05981(class04316.L));
    public static final class06391<class06225> C = class06391.N("weeping_vines", new class06011(class06225.y));
    public static final class06391<class04329> S = class06391.N("twisting_vines", new class01347(class04329.N));
    public static final class06391<class05302> x = class06391.N("basalt_columns", new class05284(class05302.N));
    public static final class06391<class05332> D = class06391.N("delta_feature", new class05315(class05332.N));
    public static final class06391<class01041> h = class06391.N("netherrack_replace_blobs", new class05286(class01041.N));
    public static final class06391<class05718> r = class06391.N("fill_layer", new class05702(class05718.N));
    public static final class03514 NN = class06391.N("bonus_chest", new class03514(class06225.y));
    public static final class06391<class06225> Ny = class06391.N("basalt_pillar", new class06003(class06225.y));
    public static final class06391<class06191> NL = class06391.N("scattered_ore", new class06035(class06191.N));
    public static final class06391<class05629> Nu = class06391.N("random_selector", new class05618(class05629.N));
    public static final class06391<class05602> Ni = class06391.N("simple_random_selector", new class05587(class05602.N));
    public static final class06391<class06189> NR = class06391.N("random_boolean_selector", new class06201(class06189.N));
    public static final class06391<class01100> NM = class06391.N("geode", new class01132(class01100.y));
    public static final class06391<class01154> NB = class06391.N("dripstone_cluster", new class01158(class01154.N));
    public static final class06391<class01165> NZ = class06391.N("large_dripstone", new class01152(class01165.N));
    public static final class06391<class01173> Nz = class06391.N("pointed_dripstone", new class01185(class01173.N));
    public static final class06391<class04059> NU = class06391.N("sculk_patch", new class04100(class04059.N));
    private final MapCodec<class03238<FC, class06391<FC>>> NE;

    public class06391(Codec<FC> codec) {
        this.NE = codec.fieldOf("config").xmap(class063862 -> new class03238(this, class063862), class03238::L);
    }

    public static boolean u(class04887 class048872, class07209 class072092) {
        return class048872.method_16358(class072092, class06391::y);
    }

    public static boolean y(class00500 class005002) {
        return class005002.N(class01210.Ni);
    }

    protected void N_59(class05974 class059742, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < 2; ++i) {
            class072182.N(class07211.field_11036);
            if (class059742.method_8320((class07209)class072182).P()) {
                return;
            }
            class059742.method_8500((class07209)class072182).u((class07209)class072182);
        }
    }

    private static <C extends class06386, F extends class06391<C>> F N(String string, F f) {
        return (F)((class06391)class00751.N((class00751)class04206.X, (String)string, f));
    }

    public static boolean N(Function<class07209, class00500> function, class07209 class072092, Predicate<class00500> predicate) {
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07211.values()) {
            class072182.N((class00753)class072092, class072112);
            if (!predicate.test(function.apply((class07209)class072182))) continue;
            return true;
        }
        return false;
    }

    public static boolean N(Function<class07209, class00500> function, class07209 class072092) {
        return class06391.N(function, class072092, class01339::P);
    }

    protected void N(class05974 class059742, class07209 class072092, class00500 class005002, Predicate<class00500> predicate) {
        if (predicate.test(class059742.method_8320(class072092))) {
            class059742.method_8652(class072092, class005002, 2);
        }
    }

    public static Predicate<class00500> N(class03530<class00891> class035302) {
        return class005002 -> !class005002.N(class035302);
    }

    protected void N(class00807 class008072, class07209 class072092, class00500 class005002) {
        class008072.method_8652(class072092, class005002, 3);
    }

    public MapCodec<class03238<FC, class06391<FC>>> N() {
        return this.NE;
    }

    public abstract boolean N(class06058<FC> var1);

    public boolean N(FC FC, class05974 class059742, class08088 class080882, class06069 class060692, class07209 class072092) {
        if (class059742.u(class072092)) {
            return this.N(new class06058(Optional.empty(), class059742, class080882, class060692, class072092, FC));
        }
        return false;
    }

    protected static boolean N(class00500 class005002) {
        return class005002.N(class01210.yb);
    }
}

