/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  minecraft.class00032
 *  minecraft.class00245
 *  minecraft.class00259
 *  minecraft.class00267
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00672
 *  minecraft.class00673
 *  minecraft.class00674
 *  minecraft.class00676
 *  minecraft.class00679
 *  minecraft.class00680
 *  minecraft.class00681
 *  minecraft.class00682
 *  minecraft.class00683
 *  minecraft.class00690
 *  minecraft.class00696
 *  minecraft.class00698
 *  minecraft.class00700
 *  minecraft.class00701
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01128
 *  minecraft.class01266
 *  minecraft.class01325
 *  minecraft.class01377
 *  minecraft.class01489
 *  minecraft.class01696
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01952
 *  minecraft.class01964
 *  minecraft.class02119
 *  minecraft.class02148
 *  minecraft.class02254
 *  minecraft.class02289
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02626
 *  minecraft.class02796
 *  minecraft.class02839
 *  minecraft.class02976
 *  minecraft.class02995
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03630
 *  minecraft.class03672
 *  minecraft.class03677
 *  minecraft.class03694
 *  minecraft.class03767
 *  minecraft.class03811
 *  minecraft.class03831
 *  minecraft.class03976
 *  minecraft.class04003
 *  minecraft.class04067
 *  minecraft.class04096
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04499
 *  minecraft.class04508
 *  minecraft.class04626
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05292
 *  minecraft.class05487
 *  minecraft.class05538
 *  minecraft.class05574
 *  minecraft.class05946
 *  minecraft.class06018
 *  minecraft.class06113
 *  minecraft.class06129
 *  minecraft.class06163
 *  minecraft.class06165
 *  minecraft.class06179
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06600
 *  minecraft.class06622
 *  minecraft.class06824
 *  minecraft.class06832
 *  minecraft.class06837
 *  minecraft.class06889
 *  minecraft.class07140
 *  minecraft.class07141
 *  minecraft.class07144
 *  minecraft.class07146
 *  minecraft.class07147
 *  minecraft.class07149
 *  minecraft.class07153
 *  minecraft.class07155
 *  minecraft.class07162
 *  minecraft.class07164
 *  minecraft.class07178
 *  minecraft.class07182
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07428
 *  minecraft.class07438
 *  minecraft.class07480
 *  minecraft.class07487
 *  minecraft.class07488
 *  minecraft.class07494
 *  minecraft.class07498
 *  minecraft.class07506
 *  minecraft.class07507
 *  minecraft.class07513
 *  minecraft.class07514
 *  minecraft.class07517
 *  minecraft.class07518
 *  minecraft.class07520
 *  minecraft.class07523
 *  minecraft.class07525
 *  minecraft.class07530
 *  minecraft.class07534
 *  minecraft.class07536
 *  minecraft.class07538
 *  minecraft.class07541
 *  minecraft.class07549
 *  minecraft.class07550
 *  minecraft.class07557
 *  minecraft.class07560
 *  minecraft.class07564
 *  minecraft.class07617
 *  minecraft.class07618
 *  minecraft.class07625
 *  minecraft.class07627
 *  minecraft.class07628
 *  minecraft.class07632
 *  minecraft.class07637
 *  minecraft.class07641
 *  minecraft.class07644
 *  minecraft.class07654
 *  minecraft.class07869
 *  minecraft.class07870
 *  minecraft.class07871
 *  minecraft.class07872
 *  minecraft.class07879
 *  minecraft.class07881
 *  minecraft.class07883
 *  minecraft.class07884
 *  minecraft.class07888
 *  minecraft.class07894
 *  minecraft.class07896
 *  minecraft.class07899
 *  minecraft.class07901
 *  minecraft.class08002
 *  minecraft.class08003
 *  minecraft.class08004
 *  minecraft.class08006
 *  minecraft.class08009
 *  minecraft.class08011
 *  minecraft.class08016
 *  minecraft.class08018
 *  minecraft.class08021
 *  minecraft.class08023
 *  minecraft.class08024
 *  minecraft.class08026
 *  minecraft.class08028
 *  minecraft.class08029
 *  minecraft.class08036
 *  minecraft.class08037
 *  minecraft.class08040
 *  minecraft.class08041
 *  minecraft.class08042
 *  minecraft.class08045
 *  minecraft.class08047
 *  minecraft.class08157
 *  minecraft.class08187
 *  minecraft.class08299
 *  minecraft.class08308
 *  minecraft.class08319
 *  minecraft.class08566
 *  minecraft.class08583
 *  minecraft.class08591
 *  minecraft.class08982
 *  minecraft.class08983
 *  net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00032;
import minecraft.class00245;
import minecraft.class00259;
import minecraft.class00267;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00672;
import minecraft.class00673;
import minecraft.class00674;
import minecraft.class00676;
import minecraft.class00679;
import minecraft.class00680;
import minecraft.class00681;
import minecraft.class00682;
import minecraft.class00683;
import minecraft.class00690;
import minecraft.class00696;
import minecraft.class00698;
import minecraft.class00700;
import minecraft.class00701;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01128;
import minecraft.class01266;
import minecraft.class01325;
import minecraft.class01377;
import minecraft.class01489;
import minecraft.class01696;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01952;
import minecraft.class01964;
import minecraft.class02119;
import minecraft.class02148;
import minecraft.class02254;
import minecraft.class02289;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02626;
import minecraft.class02796;
import minecraft.class02839;
import minecraft.class02976;
import minecraft.class02995;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03630;
import minecraft.class03672;
import minecraft.class03677;
import minecraft.class03694;
import minecraft.class03767;
import minecraft.class03811;
import minecraft.class03831;
import minecraft.class03976;
import minecraft.class04003;
import minecraft.class04067;
import minecraft.class04096;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04499;
import minecraft.class04508;
import minecraft.class04626;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05292;
import minecraft.class05487;
import minecraft.class05538;
import minecraft.class05574;
import minecraft.class05946;
import minecraft.class06018;
import minecraft.class06113;
import minecraft.class06129;
import minecraft.class06163;
import minecraft.class06165;
import minecraft.class06179;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06600;
import minecraft.class06622;
import minecraft.class06824;
import minecraft.class06832;
import minecraft.class06837;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07040;
import minecraft.class07045;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07079;
import minecraft.class07140;
import minecraft.class07141;
import minecraft.class07144;
import minecraft.class07146;
import minecraft.class07147;
import minecraft.class07149;
import minecraft.class07153;
import minecraft.class07155;
import minecraft.class07162;
import minecraft.class07164;
import minecraft.class07178;
import minecraft.class07182;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07428;
import minecraft.class07438;
import minecraft.class07480;
import minecraft.class07487;
import minecraft.class07488;
import minecraft.class07494;
import minecraft.class07498;
import minecraft.class07506;
import minecraft.class07507;
import minecraft.class07513;
import minecraft.class07514;
import minecraft.class07517;
import minecraft.class07518;
import minecraft.class07520;
import minecraft.class07523;
import minecraft.class07525;
import minecraft.class07530;
import minecraft.class07534;
import minecraft.class07536;
import minecraft.class07538;
import minecraft.class07541;
import minecraft.class07549;
import minecraft.class07550;
import minecraft.class07557;
import minecraft.class07560;
import minecraft.class07564;
import minecraft.class07617;
import minecraft.class07618;
import minecraft.class07625;
import minecraft.class07627;
import minecraft.class07628;
import minecraft.class07632;
import minecraft.class07637;
import minecraft.class07641;
import minecraft.class07644;
import minecraft.class07654;
import minecraft.class07869;
import minecraft.class07870;
import minecraft.class07871;
import minecraft.class07872;
import minecraft.class07879;
import minecraft.class07881;
import minecraft.class07883;
import minecraft.class07884;
import minecraft.class07888;
import minecraft.class07894;
import minecraft.class07896;
import minecraft.class07899;
import minecraft.class07901;
import minecraft.class08002;
import minecraft.class08003;
import minecraft.class08004;
import minecraft.class08006;
import minecraft.class08009;
import minecraft.class08011;
import minecraft.class08016;
import minecraft.class08018;
import minecraft.class08021;
import minecraft.class08023;
import minecraft.class08024;
import minecraft.class08026;
import minecraft.class08028;
import minecraft.class08029;
import minecraft.class08036;
import minecraft.class08037;
import minecraft.class08040;
import minecraft.class08041;
import minecraft.class08042;
import minecraft.class08045;
import minecraft.class08047;
import minecraft.class08157;
import minecraft.class08187;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08319;
import minecraft.class08566;
import minecraft.class08583;
import minecraft.class08591;
import minecraft.class08982;
import minecraft.class08983;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07078<T extends class07049>
implements class01128<class07049, T>,
class02995,
FabricEntityTypeImpl {
    private static final Logger LR = LogUtils.getLogger();
    private final class03529<class07078<?>> LM = class04206.M.R((Object)this);
    public static final Codec<class07078<?>> N = class04206.M.T();
    public static final class02362<class04247, class07078<?>> y = class02389.N((class05946)class04227.I);
    private static final float LB = 1.3964844f;
    private static final int LZ = 10;
    public static final class07078<class07487> L = class07078.N("acacia_boat", class07045.N(class07078.N(() -> class06570.sw), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> u = class07078.N("acacia_chest_boat", class07045.N(class07078.u(() -> class06570.sk), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03630> i = class07078.N("allay", class07045.N(class03630::new, class07428.field_6294).N(0.35f, 0.6f).y(0.36f).L(0.04f).N(8).y(2));
    public static final class07078<class07048> R = class07078.N("area_effect_cloud", class07045.N(class07048::new, class07428.field_17715).i().L().N(6.0f, 0.5f).N(10).y(Integer.MAX_VALUE));
    public static final class07078<class03811> M = class07078.N("armadillo", class07045.N(class03811::new, class07428.field_6294).N(0.7f, 0.65f).y(0.26f).N(10));
    public static final class07078<class00681> B = class07078.N("armor_stand", class07045.N(class00681::new, class07428.field_17715).N(0.5f, 1.975f).y(1.7775f).N(10));
    public static final class07078<class08037> Z = class07078.N("arrow", class07045.N(class08037::new, class07428.field_17715).i().N(0.5f, 0.5f).y(0.13f).N(4).y(20));
    public static final class07078<class05538> z = class07078.N("axolotl", class07045.N(class05538::new, class07428.field_34447).N(0.75f, 0.42f).y(0.2751f).N(10));
    public static final class07078<class00259> U = class07078.N("bamboo_chest_raft", class07045.N(class07078.y(() -> class06570.sV), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class00267> E = class07078.N("bamboo_raft", class07045.N(class07078.L(() -> class06570.sK), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07632> W = class07078.N("bat", class07045.N(class07632::new, class07428.field_6303).N(0.5f, 0.9f).y(0.45f).N(5));
    public static final class07078<class04626> m = class07078.N("bee", class07045.N(class04626::new, class07428.field_6294).N(0.7f, 0.6f).y(0.3f).N(8));
    public static final class07078<class07487> P = class07078.N("birch_boat", class07045.N(class07078.N(() -> class06570.st), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> s = class07078.N("birch_chest_boat", class07045.N(class07078.u(() -> class06570.sG), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07530> T = class07078.N("blaze", class07045.N(class07530::new, class07428.field_6302).L().N(0.6f, 1.8f).N(8).R());
    public static final class07078<class03672> b = class07078.N("block_display", class07045.N(class03672::new, class07428.field_17715).i().N(0.0f, 0.0f).N(10).y(1));
    public static final class07078<class02839> j = class07078.N("bogged", class07045.N(class02839::new, class07428.field_6302).N(0.6f, 1.99f).y(1.74f).L(-0.7f).N(8).R());
    public static final class07078<class04508> v = class07078.N("breeze", class07045.N(class04508::new, class07428.field_6302).N(0.6f, 1.77f).y(1.3452f).N(10).R());
    public static final class07078<class02289> n = class07078.N("breeze_wind_charge", class07045.N(class02289::new, class07428.field_17715).i().N(0.3125f, 0.3125f).y(0.0f).N(4).y(10));
    public static final class07078<class02976> t = class07078.N("camel", class07045.N(class02976::new, class07428.field_6294).N(1.7f, 2.375f).y(2.275f).N(10));
    public static final class07078<class06832> G = class07078.N("camel_husk", class07045.N(class06832::new, class07428.field_6302).N(1.7f, 2.375f).y(2.275f).N(10));
    public static final class07078<class07617> l = class07078.N("cat", class07045.N(class07617::new, class07428.field_6294).N(0.6f, 0.7f).y(0.35f).N(new float[]{0.5125f}).N(8));
    public static final class07078<class07534> d = class07078.N("cave_spider", class07045.N(class07534::new, class07428.field_6302).N(0.7f, 0.5f).y(0.45f).N(8).R());
    public static final class07078<class07487> w = class07078.N("cherry_boat", class07045.N(class07078.N(() -> class06570.sY), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> k = class07078.N("cherry_chest_boat", class07045.N(class07078.u(() -> class06570.sQ), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07498> Y = class07078.N("chest_minecart", class07045.N(class07498::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class07628> Q = class07078.N("chicken", class07045.N(class07628::new, class07428.field_6294).N(0.4f, 0.7f).y(0.644f).N(new class06889[]{new class06889(0.0, 0.7, -0.1)}).N(10));
    public static final class07078<class07644> O = class07078.N("cod", class07045.N(class07644::new, class07428.field_24460).N(0.5f, 0.3f).y(0.195f).N(4));
    public static final class07078<class08982> g = class07078.N("copper_golem", class07045.N(class08982::new, class07428.field_17715).N(0.49f, 0.98f).y(0.8125f).N(10));
    public static final class07078<class07480> I = class07078.N("command_block_minecart", class07045.N(class07480::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class08583> J = class07078.N("cow", class07045.N(class08583::new, class07428.field_6294).N(0.9f, 1.4f).y(1.3f).N(new float[]{1.36875f}).N(10));
    public static final class07078<class00245> o = class07078.N("creaking", class07045.N(class00245::new, class07428.field_6302).N(0.9f, 2.7f).y(2.3f).N(8).R());
    public static final class07078<class07550> q = class07078.N("creeper", class07045.N(class07550::new, class07428.field_6302).N(0.6f, 1.7f).N(8).R());
    public static final class07078<class07487> K = class07078.N("dark_oak_boat", class07045.N(class07078.N(() -> class06570.sO), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> V = class07078.N("dark_oak_chest_boat", class07045.N(class07078.u(() -> class06570.sg), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07618> e = class07078.N("dolphin", class07045.N(class07618::new, class07428.field_6300).N(0.9f, 0.6f).y(0.3f));
    public static final class07078<class07884> H = class07078.N("donkey", class07045.N(class07884::new, class07428.field_6294).N(1.3964844f, 1.5f).y(1.425f).N(new float[]{1.1125f}).N(10));
    public static final class07078<class08028> c = class07078.N("dragon_fireball", class07045.N(class08028::new, class07428.field_17715).i().N(1.0f, 1.0f).N(4).y(10));
    public static final class07078<class07541> X = class07078.N("drowned", class07045.N(class07541::new, class07428.field_6302).N(0.6f, 1.95f).y(1.74f).N(new float[]{2.0125f}).L(-0.7f).N(8).R());
    public static final class07078<class08003> a = class07078.N("egg", class07045.N(class08003::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class07520> p = class07078.N("elder_guardian", class07045.N(class07520::new, class07428.field_6302).N(1.9975f, 1.9975f).y(0.99875f).N(new float[]{2.350625f}).N(10).R());
    public static final class07078<class07525> F = class07078.N("enderman", class07045.N(class07525::new, class07428.field_6302).N(0.6f, 2.9f).y(2.55f).N(new float[]{2.80625f}).N(8).R());
    public static final class07078<class07560> A = class07078.N("endermite", class07045.N(class07560::new, class07428.field_6302).N(0.4f, 0.3f).y(0.13f).N(new float[]{0.2375f}).N(8).R());
    public static final class07078<class00690> f = class07078.N("ender_dragon", class07045.N(class00690::new, class07428.field_6302).L().N(16.0f, 8.0f).N(new float[]{3.0f}).N(10));
    public static final class07078<class07488> C = class07078.N("ender_pearl", class07045.N(class07488::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class00676> S = class07078.N("end_crystal", class07045.N(class00676::new, class07428.field_17715).i().L().N(2.0f, 2.0f).N(16).y(Integer.MAX_VALUE));
    public static final class07078<class07538> x = class07078.N("evoker", class07045.N(class07538::new, class07428.field_6302).N(0.6f, 1.95f).N(new float[]{2.0f}).L(-0.6f).N(8).R());
    public static final class07078<class08009> D = class07078.N("evoker_fangs", class07045.N(class08009::new, class07428.field_17715).i().N(0.5f, 0.8f).N(6).y(2));
    public static final class07078<class08040> h = class07078.N("experience_bottle", class07045.N(class08040::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class07057> r = class07078.N("experience_orb", class07045.N(class07057::new, class07428.field_17715).i().N(0.5f, 0.5f).N(6).y(20));
    public static final class07078<class08026> NN = class07078.N("eye_of_ender", class07045.N(class08026::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(4));
    public static final class07078<class00701> Ny = class07078.N("falling_block", class07045.N(class00701::new, class07428.field_17715).i().N(0.98f, 0.98f).N(10).y(20));
    public static final class07078<class08024> NL = class07078.N("fireball", class07045.N(class08024::new, class07428.field_17715).i().N(1.0f, 1.0f).N(4).y(10));
    public static final class07078<class08006> Nu = class07078.N("firework_rocket", class07045.N(class08006::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class06165> Ni = class07078.N("fox", class07045.N(class06165::new, class07428.field_6294).N(0.6f, 0.7f).y(0.4f).N(new class06889[]{new class06889(0.0, 0.6375, -0.25)}).N(8).N(class00869.sM));
    public static final class07078<class04067> NR = class07078.N("frog", class07045.N(class04067::new, class07428.field_6294).N(0.5f, 0.5f).N(new class06889[]{new class06889(0.0, 0.375, -0.25)}).N(10));
    public static final class07078<class07494> NM = class07078.N("furnace_minecart", class07045.N(class07494::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class07523> NB = class07078.N("ghast", class07045.N(class07523::new, class07428.field_6302).L().N(4.0f, 4.0f).y(2.6f).N(new float[]{4.0625f}).L(0.5f).N(10).R());
    public static final class07078<class00032> NZ = class07078.N("happy_ghast", class07045.N(class00032::new, class07428.field_6294).N(4.0f, 4.0f).y(2.6f).N(new class06889(0.0, 4.0, 1.7), new class06889(-1.7, 4.0, 0.0), new class06889(0.0, 4.0, -1.7), new class06889(1.7, 4.0, 0.0)).L(0.5f).N(10));
    public static final class07078<class07557> Nz = class07078.N("giant", class07045.N(class07557::new, class07428.field_6302).N(3.6f, 12.0f).y(10.44f).L(-3.75f).N(10).R());
    public static final class07078<class02254> NU = class07078.N("glow_item_frame", class07045.N(class02254::new, class07428.field_17715).i().N(0.5f, 0.5f).y(0.0f).N(10).y(Integer.MAX_VALUE));
    public static final class07078<class05574> NE = class07078.N("glow_squid", class07045.N(class05574::new, class07428.field_30092).N(0.8f, 0.8f).y(0.4f).N(10));
    public static final class07078<class02148> NW = class07078.N("goat", class07045.N(class02148::new, class07428.field_6294).N(0.9f, 1.3f).N(new float[]{1.1125f}).N(10));
    public static final class07078<class07549> Nm = class07078.N("guardian", class07045.N(class07549::new, class07428.field_6302).N(0.85f, 0.85f).y(0.425f).N(new float[]{0.975f}).N(8).R());
    public static final class07078<class06018> NP = class07078.N("hoglin", class07045.N(class06018::new, class07428.field_6302).N(1.3964844f, 1.4f).N(new float[]{1.49375f}).N(8));
    public static final class07078<class07514> Ns = class07078.N("hopper_minecart", class07045.N(class07514::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class07901> NT = class07078.N("horse", class07045.N(class07901::new, class07428.field_6294).N(1.3964844f, 1.6f).y(1.52f).N(new float[]{1.44375f}).N(10));
    public static final class07078<class07564> Nb = class07078.N("husk", class07045.N(class07564::new, class07428.field_6302).N(0.6f, 1.95f).y(1.74f).N(new float[]{2.075f}).L(-0.7f).N(8).R());
    public static final class07078<class07149> Nj = class07078.N("illusioner", class07045.N(class07149::new, class07428.field_6302).N(0.6f, 1.95f).N(new float[]{2.0f}).L(-0.6f).N(8).R());
    public static final class07078<class01952> Nv = class07078.N("interaction", class07045.N(class01952::new, class07428.field_17715).i().N(0.0f, 0.0f).N(10));
    public static final class07078<class07625> Nn = class07078.N("iron_golem", class07045.N(class07625::new, class07428.field_17715).N(1.4f, 2.7f).N(10));
    public static final class07078<class00717> Nt = class07078.N("item", class07045.N(class00717::new, class07428.field_17715).i().N(0.25f, 0.25f).y(0.2125f).N(6).y(20));
    public static final class07078<class03694> NG = class07078.N("item_display", class07045.N(class03694::new, class07428.field_17715).i().N(0.0f, 0.0f).N(10).y(1));
    public static final class07078<class00679> Nl = class07078.N("item_frame", class07045.N(class00679::new, class07428.field_17715).i().N(0.5f, 0.5f).y(0.0f).N(10).y(Integer.MAX_VALUE));
    public static final class07078<class07487> Nd = class07078.N("jungle_boat", class07045.N(class07078.N(() -> class06570.sl), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> Nw = class07078.N("jungle_chest_boat", class07045.N(class07078.u(() -> class06570.sd), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class00700> Nk = class07078.N("leash_knot", class07045.N(class00700::new, class07428.field_17715).i().y().N(0.375f, 0.5f).y(0.0625f).N(10).y(Integer.MAX_VALUE));
    public static final class07078<class00672> NY = class07078.N("lightning_bolt", class07045.N(class00672::new, class07428.field_17715).i().y().N(0.0f, 0.0f).N(16).y(Integer.MAX_VALUE));
    public static final class07078<class00683> NQ = class07078.N("llama", class07045.N(class00683::new, class07428.field_6294).N(0.9f, 1.87f).y(1.7765f).N(new class06889[]{new class06889(0.0, 1.37, -0.3)}).N(10));
    public static final class07078<class08021> NO = class07078.N("llama_spit", class07045.N(class08021::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class07140> Ng = class07078.N("magma_cube", class07045.N(class07140::new, class07428.field_6302).L().N(0.52f, 0.52f).y(0.325f).N(4.0f).N(8).R());
    public static final class07078<class07487> NI = class07078.N("mangrove_boat", class07045.N(class07078.N(() -> class06570.so), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> NJ = class07078.N("mangrove_chest_boat", class07045.N(class07078.u(() -> class06570.sq), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class06622> No = class07078.N("mannequin", class07045.N(class06622::N, class07428.field_17715).N(0.6f, 1.8f).y(1.62f).N(class06600.field_62512).N(32).y(2));
    public static final class07078<class01696> Nq = class07078.N("marker", class07045.N(class01696::new, class07428.field_17715).i().N(0.0f, 0.0f).N(0));
    public static final class07078<class07518> NK = class07078.N("minecart", class07045.N(class07518::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class07641> NV = class07078.N("mooshroom", class07045.N(class07641::new, class07428.field_6294).N(0.9f, 1.4f).y(1.3f).N(new float[]{1.36875f}).N(10));
    public static final class07078<class07896> Ne = class07078.N("mule", class07045.N(class07896::new, class07428.field_6294).N(1.3964844f, 1.6f).y(1.52f).N(new float[]{1.2125f}).N(8));
    public static final class07078<class08157> NH = class07078.N("nautilus", class07045.N(class08157::new, class07428.field_6300).N(0.875f, 0.95f).N(new float[]{1.1375f}).y(0.2751f).N(10));
    public static final class07078<class07487> Nc = class07078.N("oak_boat", class07045.N(class07078.N(() -> class06570.sb), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> NX = class07078.N("oak_chest_boat", class07045.N(class07078.u(() -> class06570.sj), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class06129> Na = class07078.N("ocelot", class07045.N(class06129::new, class07428.field_6294).N(0.6f, 0.7f).N(new float[]{0.6375f}).N(10));
    public static final class07078<class02626> Np = class07078.N("ominous_item_spawner", class07045.N(class02626::new, class07428.field_17715).i().N(0.25f, 0.25f).N(8));
    public static final class07078<class00698> NF = class07078.N("painting", class07045.N(class00698::new, class07428.field_17715).i().N(0.5f, 0.5f).N(10).y(Integer.MAX_VALUE));
    public static final class07078<class07487> NA = class07078.N("pale_oak_boat", class07045.N(class07078.N(() -> class06570.sI), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> Nf = class07078.N("pale_oak_chest_boat", class07045.N(class07078.u(() -> class06570.sJ), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07637> NC = class07078.N("panda", class07045.N(class07637::new, class07428.field_6294).N(1.3f, 1.25f).N(10));
    public static final class07078<class06824> NS = class07078.N("parched", class07045.N(class06824::new, class07428.field_6302).N(0.6f, 1.99f).y(1.74f).L(-0.7f).N(8).R());
    public static final class07078<class07654> Nx = class07078.N("parrot", class07045.N(class07654::new, class07428.field_6294).N(0.5f, 0.9f).y(0.54f).N(new float[]{0.4625f}).N(8));
    public static final class07078<class07155> ND = class07078.N("phantom", class07045.N(class07155::new, class07428.field_6302).N(0.9f, 0.5f).y(0.175f).N(new float[]{0.3375f}).L(-0.125f).N(8).R());
    public static final class07078<class07627> Nh = class07078.N("pig", class07045.N(class07627::new, class07428.field_6294).N(0.9f, 0.9f).N(new float[]{0.86875f}).N(10));
    public static final class07078<class01489> Nr = class07078.N("piglin", class07045.N(class01489::new, class07428.field_6302).N(0.6f, 1.95f).y(1.79f).N(new float[]{2.0125f}).L(-0.7f).N(8));
    public static final class07078<class01266> yN = class07078.N("piglin_brute", class07045.N(class01266::new, class07428.field_6302).N(0.6f, 1.95f).y(1.79f).N(new float[]{2.0125f}).L(-0.7f).N(8).R());
    public static final class07078<class07178> yy = class07078.N("pillager", class07045.N(class07178::new, class07428.field_6302).u().N(0.6f, 1.95f).N(new float[]{2.0f}).L(-0.6f).N(8).R());
    public static final class07078<class07869> yL = class07078.N("polar_bear", class07045.N(class07869::new, class07428.field_6294).N(class00869.ba).N(1.4f, 1.4f).N(10));
    public static final class07078<class08591> yu = class07078.N("splash_potion", class07045.N(class08591::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class08566> yi = class07078.N("lingering_potion", class07045.N(class08566::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class07871> yR = class07078.N("pufferfish", class07045.N(class07871::new, class07428.field_24460).N(0.7f, 0.7f).y(0.455f).N(4));
    public static final class07078<class07879> yM = class07078.N("rabbit", class07045.N(class07879::new, class07428.field_6294).N(0.4f, 0.5f).N(8));
    public static final class07078<class07153> yB = class07078.N("ravager", class07045.N(class07153::new, class07428.field_6302).N(1.95f, 2.2f).N(new class06889[]{new class06889(0.0, 2.2625, -0.0625)}).N(10).R());
    public static final class07078<class07870> yZ = class07078.N("salmon", class07045.N(class07870::new, class07428.field_24460).N(0.7f, 0.4f).y(0.26f).N(4));
    public static final class07078<class07881> yz = class07078.N("sheep", class07045.N(class07881::new, class07428.field_6294).N(0.9f, 1.3f).y(1.235f).N(new float[]{1.2375f}).N(10));
    public static final class07078<class07144> yU = class07078.N("shulker", class07045.N(class07144::new, class07428.field_6302).L().u().N(1.0f, 1.0f).y(0.5f).N(10));
    public static final class07078<class08002> yE = class07078.N("shulker_bullet", class07045.N(class08002::new, class07428.field_17715).i().N(0.3125f, 0.3125f).N(8));
    public static final class07078<class07147> yW = class07078.N("silverfish", class07045.N(class07147::new, class07428.field_6302).N(0.4f, 0.3f).y(0.13f).N(new float[]{0.2375f}).N(8).R());
    public static final class07078<class07146> ym = class07078.N("skeleton", class07045.N(class07146::new, class07428.field_6302).N(0.6f, 1.99f).y(1.74f).L(-0.7f).N(8).R());
    public static final class07078<class00682> yP = class07078.N("skeleton_horse", class07045.N(class00682::new, class07428.field_6294).N(1.3964844f, 1.6f).y(1.52f).N(new float[]{1.31875f}).N(10));
    public static final class07078<class07162> ys = class07078.N("slime", class07045.N(class07162::new, class07428.field_6302).N(0.52f, 0.52f).y(0.325f).N(4.0f).N(10).R());
    public static final class07078<class08029> yT = class07078.N("small_fireball", class07045.N(class08029::new, class07428.field_17715).i().N(0.3125f, 0.3125f).N(4).y(10));
    public static final class07078<class01964> yb = class07078.N("sniffer", class07045.N(class01964::new, class07428.field_6294).N(1.9f, 1.75f).y(1.05f).N(new float[]{2.09375f}).u(2.05f).N(10));
    public static final class07078<class08045> yj = class07078.N("snowball", class07045.N(class08045::new, class07428.field_17715).i().N(0.25f, 0.25f).N(4).y(10));
    public static final class07078<class07888> yv = class07078.N("snow_golem", class07045.N(class07888::new, class07428.field_17715).N(class00869.ba).N(0.7f, 1.9f).y(1.7f).N(8));
    public static final class07078<class07506> yn = class07078.N("spawner_minecart", class07045.N(class07506::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class08016> yt = class07078.N("spectral_arrow", class07045.N(class08016::new, class07428.field_17715).i().N(0.5f, 0.5f).y(0.13f).N(4).y(20));
    public static final class07078<class07141> yG = class07078.N("spider", class07045.N(class07141::new, class07428.field_6302).N(1.4f, 0.9f).y(0.65f).N(new float[]{0.765f}).N(8).R());
    public static final class07078<class07487> yl = class07078.N("spruce_boat", class07045.N(class07078.N(() -> class06570.sv), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class03976> yd = class07078.N("spruce_chest_boat", class07045.N(class07078.u(() -> class06570.sn), class07428.field_17715).i().N(1.375f, 0.5625f).y(0.5625f).N(10));
    public static final class07078<class07883> yw = class07078.N("squid", class07045.N(class07883::new, class07428.field_6300).N(0.8f, 0.8f).y(0.4f).N(8));
    public static final class07078<class07164> yk = class07078.N("stray", class07045.N(class07164::new, class07428.field_6302).N(0.6f, 1.99f).y(1.74f).L(-0.7f).N(class00869.ba).N(8).R());
    public static final class07078<class01377> yY = class07078.N("strider", class07045.N(class01377::new, class07428.field_6294).L().N(0.9f, 1.7f).N(10));
    public static final class07078<class04096> yQ = class07078.N("tadpole", class07045.N(class04096::new, class07428.field_6294).N(0.4f, 0.3f).y(0.19500001f).N(10));
    public static final class07078<class03677> yO = class07078.N("text_display", class07045.N(class03677::new, class07428.field_17715).i().N(0.0f, 0.0f).N(10).y(1));
    public static final class07078<class00674> yg = class07078.N("tnt", class07045.N(class00674::new, class07428.field_17715).i().L().N(0.98f, 0.98f).y(0.15f).N(10).y(10));
    public static final class07078<class07507> yI = class07078.N("tnt_minecart", class07045.N(class07507::new, class07428.field_17715).i().N(0.98f, 0.7f).N(new float[]{0.1875f}).N(8));
    public static final class07078<class06179> yJ = class07078.N("trader_llama", class07045.N(class06179::new, class07428.field_6294).N(0.9f, 1.87f).y(1.7765f).N(new class06889[]{new class06889(0.0, 1.37, -0.3)}).N(10));
    public static final class07078<class07517> yo = class07078.N("trident", class07045.N(class07517::new, class07428.field_17715).i().N(0.5f, 0.5f).y(0.13f).N(4).y(20));
    public static final class07078<class07899> yq = class07078.N("tropical_fish", class07045.N(class07899::new, class07428.field_24460).N(0.5f, 0.4f).y(0.26f).N(4));
    public static final class07078<class07872> yK = class07078.N("turtle", class07045.N(class07872::new, class07428.field_6294).N(1.2f, 0.4f).N(new class06889[]{new class06889(0.0, 0.55625, -0.25)}).N(10));
    public static final class07078<class08042> yV = class07078.N("vex", class07045.N(class08042::new, class07428.field_6302).L().N(0.4f, 0.8f).y(0.51875f).N(new float[]{0.7375f}).L(0.04f).N(8).R());
    public static final class07078<class08041> ye = class07078.N("villager", class07045.N(class08041::new, class07428.field_17715).N(0.6f, 1.95f).y(1.62f).N(10));
    public static final class07078<class08011> yH = class07078.N("vindicator", class07045.N(class08011::new, class07428.field_6302).N(0.6f, 1.95f).N(new float[]{2.0f}).L(-0.6f).N(8).R());
    public static final class07078<class06163> yc = class07078.N("wandering_trader", class07045.N(class06163::new, class07428.field_6294).N(0.6f, 1.95f).y(1.62f).N(10));
    public static final class07078<class04003> yX = class07078.N("warden", class07045.N(class04003::new, class07428.field_6302).N(0.9f, 2.9f).N(new float[]{3.15f}).N(class03831.field_48320, 0.0f, 1.6f, 0.0f).N(16).L().R());
    public static final class07078<class04499> ya = class07078.N("wind_charge", class07045.N(class04499::new, class07428.field_17715).i().N(0.3125f, 0.3125f).y(0.0f).N(4).y(10));
    public static final class07078<class08047> yp = class07078.N("witch", class07045.N(class08047::new, class07428.field_6302).N(0.6f, 1.95f).y(1.62f).N(new float[]{2.2625f}).N(8).R());
    public static final class07078<class00680> yF = class07078.N("wither", class07045.N(class00680::new, class07428.field_6302).L().N(class00869.Lm).N(0.9f, 3.5f).N(10).R());
    public static final class07078<class08023> yA = class07078.N("wither_skeleton", class07045.N(class08023::new, class07428.field_6302).L().N(class00869.Lm).N(0.7f, 2.4f).y(2.1f).L(-0.875f).N(8).R());
    public static final class07078<class07513> yf = class07078.N("wither_skull", class07045.N(class07513::new, class07428.field_17715).i().N(0.3125f, 0.3125f).N(4).y(10));
    public static final class07078<class07894> yC = class07078.N("wolf", class07045.N(class07894::new, class07428.field_6294).N(0.6f, 0.85f).y(0.68f).N(new class06889[]{new class06889(0.0, 0.81875, -0.0625)}).N(10));
    public static final class07078<class05292> yS = class07078.N("zoglin", class07045.N(class05292::new, class07428.field_6302).L().N(1.3964844f, 1.4f).N(new float[]{1.49375f}).N(8).R());
    public static final class07078<class08004> yx = class07078.N("zombie", class07045.N(class08004::new, class07428.field_6302).N(0.6f, 1.95f).y(1.74f).N(new float[]{2.0125f}).L(-0.7f).N(8).R());
    public static final class07078<class00673> yD = class07078.N("zombie_horse", class07045.N(class00673::new, class07428.field_6302).N(1.3964844f, 1.6f).y(1.52f).N(new float[]{1.31875f}).N(10));
    public static final class07078<class08187> yh = class07078.N("zombie_nautilus", class07045.N(class08187::new, class07428.field_6302).N(0.875f, 0.95f).N(new float[]{1.1375f}).y(0.2751f).N(10));
    public static final class07078<class08018> yr = class07078.N("zombie_villager", class07045.N(class08018::new, class07428.field_6302).N(0.6f, 1.95f).N(new float[]{2.125f}).L(-0.7f).y(1.74f).N(8).R());
    public static final class07078<class07182> LN = class07078.N("zombified_piglin", class07045.N(class07182::new, class07428.field_6302).L().N(0.6f, 1.95f).y(1.79f).N(new float[]{2.0f}).L(-0.7f).N(8).R());
    public static final class07078<class08036> Ly = class07078.N("player", class07045.N(class07428.field_17715).y().N().N(0.6f, 1.8f).y(1.62f).N(class06600.field_62512).N(32).y(2));
    public static final class07078<class00696> LL = class07078.N("fishing_bobber", class07045.N(class00696::new, class07428.field_17715).i().y().N().N(0.25f, 0.25f).N(4).y(5));
    private static final Set<class07078<?>> Lz = Set.of(Ny, I, yn);
    private final class07040<T> LU;
    private final class07428 LE;
    private final ImmutableSet<class00891> LW;
    private final boolean Lm;
    private final boolean LP;
    private final boolean Ls;
    private final boolean LT;
    private final int Lb;
    private final int Lj;
    private final String Lv;
    private @Nullable class00392 Ln;
    private final Optional<class05946<class05074>> Lt;
    public class01325 Lu;
    private final float LG;
    private final class03767 Ll;
    private final boolean Ld;
    private @Nullable Boolean Lw;
    private @Nullable Boolean Lk;

    private static class07040<class00267> L(Supplier<class06581> supplier) {
        return (class070782, class072992) -> new class00267(class070782, class072992, supplier);
    }

    public boolean L() {
        return this.Ls;
    }

    public class00392 M() {
        if (this.Ln == null) {
            this.Ln = class00392.L((String)this.R());
        }
        return this.Ln;
    }

    public boolean P() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this != Ly && this != NO && this != yF && this != W && this != Nl && this != NU && this != Nk && this != NF && this != S && this != D;
    }

    @Deprecated
    public class03529<class07078<?>> T() {
        return this.LM;
    }

    public class07078(class07040<T> class070402, class07428 class074282, boolean bl, boolean bl2, boolean bl3, boolean bl4, ImmutableSet<class00891> immutableSet, class01325 class013252, float f, int n, int n2, String string, Optional<class05946<class05074>> optional, class03767 class037672, boolean bl5) {
        this.LU = class070402;
        this.LE = class074282;
        this.LT = bl4;
        this.Lm = bl;
        this.LP = bl2;
        this.Ls = bl3;
        this.LW = immutableSet;
        this.Lu = class013252;
        this.LG = f;
        this.Lb = n;
        this.Lj = n2;
        this.Lv = string;
        this.Lt = optional;
        this.Ll = class037672;
        this.Ld = bl5;
    }

    public String toString() {
        return this.R();
    }

    public String B() {
        int n = this.R().lastIndexOf(46);
        return n == -1 ? this.R() : this.R().substring(n + 1);
    }

    public Optional<class05946<class05074>> Z() {
        return this.Lt;
    }

    public class07428 i() {
        return this.LE;
    }

    public boolean b() {
        return this.Ld;
    }

    public Class<? extends class07049> s() {
        return class07049.class;
    }

    public int m() {
        return this.Lj;
    }

    public boolean j() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return Lz.contains(this);
    }

    public float U() {
        return this.Lu.y();
    }

    public float z() {
        return this.Lu.N();
    }

    private static class07040<class00259> u(Supplier<class06581> supplier) {
        return (class070782, class072992) -> new class00259(class070782, class072992, supplier);
    }

    public boolean u() {
        return this.LT;
    }

    public static <T extends class07049> Consumer<T> y(Consumer<T> consumer, class07299 class072992, class06584 class065842, @Nullable class07438 class074382) {
        class08983 class089832 = (class08983)class065842.method_58694(class02484.NR);
        if (class089832 != null) {
            return consumer.andThen(class070492 -> class07078.N(class072992, class074382, class070492, class089832));
        }
        return consumer;
    }

    private static class05946<class07078<?>> y(String string) {
        return class05946.N((class05946)class04227.I, (class01894)class01894.y((String)string));
    }

    private static class07040<class03976> y(Supplier<class06581> supplier) {
        return (class070782, class072992) -> new class03976(class070782, class072992, supplier);
    }

    public void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.Lk != null) {
            callbackInfoReturnable.setReturnValue((Object)this.Lk);
        }
    }

    public @Nullable T y(class04782 class047822, @Nullable Consumer<T> consumer, class07209 class072092, class06113 class061132, boolean bl, boolean bl2) {
        double d;
        T t = this.N((class07299)class047822, class061132);
        if (t == null) {
            return null;
        }
        if (bl) {
            ((class07049)t).method_5814((double)class072092.method_10263() + 0.5, class072092.method_10264() + 1, (double)class072092.method_10260() + 0.5);
            d = class07078.N((class05487)class047822, class072092, bl2, ((class07049)t).method_5829());
        } else {
            d = 0.0;
        }
        ((class07049)t).method_5808((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + d, (double)class072092.method_10260() + 0.5, class04995.R((float)(class047822.field_9229.z() * 360.0f)), 0.0f);
        if (t instanceof class07079) {
            class07079 class070792 = (class07079)((Object)t);
            class070792.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(class070792.method_36454());
            class070792.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class070792.method_36454());
            class070792.N((class01001)class047822, class047822.method_8404(class070792.method_24515()), class061132, null);
        }
        if (consumer != null) {
            consumer.accept(t);
        }
        return t;
    }

    public boolean y() {
        return this.LP;
    }

    private static Optional<class07049> y(class08299 class082992, class07299 class072992, class06113 class061132) {
        try {
            return class07078.N(class082992, class072992, class061132);
        }
        catch (RuntimeException runtimeException) {
            LR.warn("Exception loading entity: ", (Throwable)runtimeException);
            return Optional.empty();
        }
    }

    private static Optional<class07049> y(class07078<?> class070782, class08299 class082992, class07299 class072992, class06113 class061132) {
        try {
            return class07078.N(class070782, class082992, class072992, class061132);
        }
        catch (RuntimeException runtimeException) {
            LR.warn("Exception loading entity: ", (Throwable)runtimeException);
            return Optional.empty();
        }
    }

    public class01325 E() {
        return this.Lu;
    }

    public void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.Lw != null) {
            callbackInfoReturnable.setReturnValue((Object)this.Lw);
        }
    }

    public boolean N() {
        return this.Lm;
    }

    public static void N(class07299 class072992, @Nullable class07438 class074382, @Nullable class07049 class070492, class08983<class07078<?>> class089832) {
        block5: {
            block6: {
                class02796 class027962 = class072992.method_8503();
                if (class027962 == null || class070492 == null) {
                    return;
                }
                if (class070492.method_5864() != class089832.N()) {
                    return;
                }
                if (class072992.method_8608() || !class070492.method_5864().j()) break block5;
                if (!(class074382 instanceof class08036)) break block6;
                class08036 class080362 = (class08036)class074382;
                if (class027962.Nm().R(class080362.method_72498())) break block5;
            }
            return;
        }
        class089832.N(class070492);
    }

    protected static double N(class05487 class054872, class07209 class072092, boolean bl, class00734 class007342) {
        class00734 class007343 = new class00734(class072092);
        if (bl) {
            class007343 = class007343.y(0.0, -1.0, 0.0);
        }
        Iterable iterable = class054872.method_8600(null, class007343);
        return 1.0 + class00389.N((class07185)class07185.field_11052, (class00734)class007342, (Iterable)iterable, (double)(bl ? -2.0 : -1.0));
    }

    public @Nullable T N(class04782 class047822, @Nullable Consumer<T> consumer, class07209 class072092, class06113 class061132, boolean bl, boolean bl2) {
        T t = this.y(class047822, consumer, class072092, class061132, bl, bl2);
        if (t != null) {
            class047822.y(t);
            if (t instanceof class07079) {
                ((class07079)((Object)t)).D();
            }
        }
        return t;
    }

    public class00734 N(double d, double d2, double d3) {
        float f = this.LG * this.z() / 2.0f;
        float f2 = this.LG * this.U();
        return new class00734(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f);
    }

    public static Optional<class07049> N(class07078<?> class070782, class08299 class082992, class07299 class072992, class06113 class061132) {
        Optional<class07049> optional = Optional.ofNullable(class070782.N(class072992, class061132));
        optional.ifPresent(class070492 -> class070492.method_5651(class082992));
        return optional;
    }

    public static Optional<class07049> N(class08299 class082992, class07299 class072992, class06113 class061132) {
        return class07536.N(class07078.N(class082992).map(class070782 -> class070782.N(class072992, class061132)), (T class070492) -> class070492.method_5651(class082992), () -> LR.warn("Skipping Entity with id {}", (Object)class082992.N("id", "[invalid]")));
    }

    public @Nullable T N(class07299 class072992, class06113 class061132) {
        if (!this.N(class072992.method_45162())) {
            return null;
        }
        return this.LU.create(this, class072992);
    }

    public @Nullable T N(class04782 class047822, @Nullable class06584 class065842, @Nullable class07438 class074382, class07209 class072092, class06113 class061132, boolean bl, boolean bl2) {
        Consumer<class07049> consumer = class065842 != null ? class07078.N((class07299)class047822, class065842, class074382) : class070492 -> {};
        return (T)this.N(class047822, consumer, class072092, class061132, bl, bl2);
    }

    public static Optional<class07078<?>> N(String string) {
        return class04206.M.y(class01894.L((String)string));
    }

    public static class01894 N(class07078<?> class070782) {
        return class04206.M.y(class070782);
    }

    private static <T extends class07049> class07078<T> N(String string, class07045<T> class070452) {
        return class07078.N(class07078.y(string), class070452);
    }

    public @Nullable T N(class04782 class047822, class07209 class072092, class06113 class061132) {
        return this.N(class047822, null, class072092, class061132, false, false);
    }

    public static <T extends class07049> Consumer<T> N(Consumer<T> consumer, class06584 class065842) {
        return consumer.andThen(class070492 -> class070492.method_66652(class065842));
    }

    public static <T extends class07049> Consumer<T> N(Consumer<T> consumer, class07299 class072992, class06584 class065842, @Nullable class07438 class074382) {
        return class07078.y(class07078.N(consumer, class065842), class072992, class065842, class074382);
    }

    public static <T extends class07049> Consumer<T> N(class07299 class072992, class06584 class065842, @Nullable class07438 class074382) {
        return class07078.N((T class070492) -> {}, class072992, class065842, class074382);
    }

    public boolean N(class03543<class07078<?>> class035432) {
        return class035432.N(this.LM);
    }

    public boolean N(class03530<class07078<?>> class035302) {
        return this.LM.N(class035302);
    }

    public static Stream<class07049> N(class08319 class083192, class07299 class072992, class06113 class061132) {
        return class083192.y().mapMulti((class082992, consumer) -> class07078.N(class082992, class072992, class061132, class070492 -> {
            consumer.accept(class070492);
            return class070492;
        }));
    }

    private static class07049 N(class07049 class070492, class08299 class082992, class07299 class072992, class06113 class061132, class06837 class068372) {
        Iterator iterator = class082992.u("Passengers").iterator();
        while (iterator.hasNext()) {
            class07049 class070493 = class07078.N((class08299)iterator.next(), class072992, class061132, class068372);
            if (class070493 == null) continue;
            class070493.method_5873(class070492, true, false);
        }
        return class070492;
    }

    public static @Nullable class07049 N(class07078<?> class070782, class08299 class082992, class07299 class072992, class06113 class061132, class06837 class068372) {
        return class07078.y(class070782, class082992, class072992, class061132).map(arg_0 -> ((class06837)class068372).process(arg_0)).map(class070492 -> class07078.N(class070492, class082992, class072992, class061132, class068372)).orElse(null);
    }

    private static class07040<class07487> N(Supplier<class06581> supplier) {
        return (class070782, class072992) -> new class07487(class070782, class072992, supplier);
    }

    private static <T extends class07049> class07078<T> N(class05946<class07078<?>> class059462, class07045<T> class070452) {
        return (class07078)class00751.N((class00751)class04206.M, class059462, class070452.N(class059462));
    }

    public @Nullable T N(class07049 class070492) {
        return (T)(class070492.method_5864() == this ? class070492 : null);
    }

    public static @Nullable class07049 N(class07078<?> class070782, class07001 class070012, class07299 class072992, class06113 class061132, class06837 class068372) {
        try (class04495 class044952 = new class04495(LR);){
            class07049 class070492 = class07078.N(class070782, class08308.N((class04490)class044952, (class01929)class072992.method_30349(), (class07001)class070012), class072992, class061132, class068372);
            return class070492;
        }
    }

    public static Optional<class07078<?>> N(class08299 class082992) {
        return class082992.N("id", N);
    }

    public boolean N(class00500 class005002) {
        if (this.LW.contains((Object)class005002.i())) {
            return false;
        }
        if (!this.Ls && class02119.N((class00500)class005002)) {
            return true;
        }
        return class005002.N(class00869.Lm) || class005002.N(class00869.sM) || class005002.N(class00869.ij) || class005002.N(class00869.ba);
    }

    public static @Nullable class07049 N(class08299 class082992, class07299 class072992, class06113 class061132, class06837 class068372) {
        return class07078.y(class082992, class072992, class061132).map(arg_0 -> ((class06837)class068372).process(arg_0)).map(class070492 -> class07078.N(class070492, class082992, class072992, class061132, class068372)).orElse(null);
    }

    public static @Nullable class07049 N(class07001 class070012, class07299 class072992, class06113 class061132, class06837 class068372) {
        try (class04495 class044952 = new class04495(LR);){
            class07049 class070492 = class07078.N(class08308.N((class04490)class044952, (class01929)class072992.method_30349(), (class07001)class070012), class072992, class061132, class068372);
            return class070492;
        }
    }

    public int W() {
        return this.Lb;
    }

    public String R() {
        return this.Lv;
    }

    public class03767 method_45322() {
        return this.Ll;
    }

    public void fabric_setCanPotentiallyExecuteCommands(@Nullable Boolean bl) {
        this.Lk = bl;
    }

    public void fabric_setAlwaysUpdateVelocity(@Nullable Boolean bl) {
        this.Lw = bl;
    }
}

