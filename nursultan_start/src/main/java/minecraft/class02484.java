/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class00412
 *  minecraft.class00693
 *  minecraft.class00704
 *  minecraft.class00751
 *  minecraft.class01319
 *  minecraft.class01894
 *  minecraft.class02197
 *  minecraft.class02204
 *  minecraft.class02232
 *  minecraft.class02265
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02687
 *  minecraft.class02689
 *  minecraft.class02692
 *  minecraft.class02695
 *  minecraft.class02699
 *  minecraft.class02705
 *  minecraft.class02706
 *  minecraft.class02708
 *  minecraft.class02710
 *  minecraft.class02716
 *  minecraft.class02719
 *  minecraft.class02720
 *  minecraft.class02764
 *  minecraft.class02766
 *  minecraft.class02813
 *  minecraft.class02816
 *  minecraft.class02820
 *  minecraft.class02827
 *  minecraft.class02830
 *  minecraft.class02833
 *  minecraft.class02837
 *  minecraft.class02841
 *  minecraft.class02845
 *  minecraft.class02847
 *  minecraft.class02848
 *  minecraft.class02854
 *  minecraft.class02911
 *  minecraft.class03220
 *  minecraft.class03254
 *  minecraft.class03490
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03648
 *  minecraft.class03689
 *  minecraft.class03748
 *  minecraft.class04068
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05289
 *  minecraft.class05349
 *  minecraft.class05541
 *  minecraft.class05660
 *  minecraft.class05946
 *  minecraft.class06244
 *  minecraft.class06338
 *  minecraft.class06495
 *  minecraft.class06517
 *  minecraft.class06521
 *  minecraft.class06543
 *  minecraft.class06563
 *  minecraft.class07044
 *  minecraft.class07078
 *  minecraft.class07589
 *  minecraft.class07631
 *  minecraft.class07648
 *  minecraft.class07861
 *  minecraft.class07892
 *  minecraft.class07897
 *  minecraft.class08153
 *  minecraft.class08172
 *  minecraft.class08174
 *  minecraft.class08186
 *  minecraft.class08197
 *  minecraft.class08208
 *  minecraft.class08209
 *  minecraft.class08213
 *  minecraft.class08403
 *  minecraft.class08423
 *  minecraft.class08519
 *  minecraft.class08551
 *  minecraft.class08562
 *  minecraft.class08576
 *  minecraft.class08582
 *  minecraft.class08588
 *  minecraft.class08609
 *  minecraft.class08642
 *  minecraft.class08721
 *  minecraft.class08723
 *  minecraft.class08725
 *  minecraft.class08983
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00412;
import minecraft.class00693;
import minecraft.class00704;
import minecraft.class00751;
import minecraft.class01319;
import minecraft.class01894;
import minecraft.class02197;
import minecraft.class02204;
import minecraft.class02232;
import minecraft.class02265;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02472;
import minecraft.class02477;
import minecraft.class02505;
import minecraft.class02687;
import minecraft.class02689;
import minecraft.class02692;
import minecraft.class02695;
import minecraft.class02699;
import minecraft.class02705;
import minecraft.class02706;
import minecraft.class02708;
import minecraft.class02710;
import minecraft.class02716;
import minecraft.class02719;
import minecraft.class02720;
import minecraft.class02764;
import minecraft.class02766;
import minecraft.class02813;
import minecraft.class02816;
import minecraft.class02820;
import minecraft.class02827;
import minecraft.class02830;
import minecraft.class02833;
import minecraft.class02837;
import minecraft.class02841;
import minecraft.class02845;
import minecraft.class02847;
import minecraft.class02848;
import minecraft.class02854;
import minecraft.class02911;
import minecraft.class03220;
import minecraft.class03254;
import minecraft.class03490;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03648;
import minecraft.class03689;
import minecraft.class03748;
import minecraft.class04068;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05289;
import minecraft.class05349;
import minecraft.class05541;
import minecraft.class05660;
import minecraft.class05946;
import minecraft.class06244;
import minecraft.class06338;
import minecraft.class06495;
import minecraft.class06517;
import minecraft.class06521;
import minecraft.class06543;
import minecraft.class06563;
import minecraft.class07044;
import minecraft.class07078;
import minecraft.class07589;
import minecraft.class07631;
import minecraft.class07648;
import minecraft.class07861;
import minecraft.class07892;
import minecraft.class07897;
import minecraft.class08153;
import minecraft.class08172;
import minecraft.class08174;
import minecraft.class08186;
import minecraft.class08197;
import minecraft.class08208;
import minecraft.class08209;
import minecraft.class08213;
import minecraft.class08403;
import minecraft.class08423;
import minecraft.class08519;
import minecraft.class08551;
import minecraft.class08562;
import minecraft.class08576;
import minecraft.class08582;
import minecraft.class08588;
import minecraft.class08609;
import minecraft.class08642;
import minecraft.class08721;
import minecraft.class08723;
import minecraft.class08725;
import minecraft.class08983;

public class class02484 {
    static final class02911 N = new class02911(512);
    public static final class02477<class02837> y = class02484.N("custom_data", class024722 -> class024722.N(class02837.L));
    public static final class02477<Integer> L = class02484.N("max_stack_size", class024722 -> class024722.N(class06338.N((int)1, (int)99)).N(class02389.B));
    public static final class02477<Integer> u = class02484.N("max_damage", class024722 -> class024722.N(class06338.b).N(class02389.B));
    public static final class02477<Integer> i = class02484.N("damage", class024722 -> class024722.N(class06338.T).L().N(class02389.B));
    public static final class02477<class06244> R = class02484.N("unbreakable", class024722 -> class024722.N(class06244.field_51563).N(class06244.field_55626));
    public static final class02477<class08153> M = class02484.N("use_effects", class024722 -> class024722.N(class08153.y).N(class08153.L));
    public static final class02477<class00392> B = class02484.N("custom_name", class024722 -> class024722.N(class03748.N).N(class03748.y).N());
    public static final class02477<Float> Z = class02484.N("minimum_attack_charge", class024722 -> class024722.N(class06338.N((float)0.0f, (float)1.0f)).N(class02389.E));
    public static final class02477<class02204<class03689>> z = class02484.N("damage_type", class024722 -> class024722.N(class02204.N((class05946)class04227.yN, (Codec)class03689.y)).N(class02204.N((class05946)class04227.yN, (class02362)class03689.L)));
    public static final class02477<class00392> U = class02484.N("item_name", class024722 -> class024722.N(class03748.N).N(class03748.y).N());
    public static final class02477<class01894> E = class02484.N("item_model", class024722 -> class024722.N(class01894.N).N(class01894.y).N());
    public static final class02477<class02848> W = class02484.N("lore", class024722 -> class024722.N(class02848.L).N(class02848.u).N());
    public static final class02477<class06495> m = class02484.N("rarity", class024722 -> class024722.N(class06495.field_50001).N(class06495.field_50003));
    public static final class02477<class02710> P = class02484.N("enchantments", class024722 -> class024722.N(class02710.y).N(class02710.L).N());
    public static final class02477<class03220> s = class02484.N("can_place_on", class024722 -> class024722.N(class03220.N).N(class03220.y).N());
    public static final class02477<class03220> T = class02484.N("can_break", class024722 -> class024722.N(class03220.N).N(class03220.y).N());
    public static final class02477<class02833> b = class02484.N("attribute_modifiers", class024722 -> class024722.N(class02833.y).N(class02833.L).N());
    public static final class02477<class02845> j = class02484.N("custom_model_data", class024722 -> class024722.N(class02845.y).N(class02845.L));
    public static final class02477<class08562> v = class02484.N("tooltip_display", class024722 -> class024722.N(class08562.N).N(class08562.y).N());
    public static final class02477<Integer> n = class02484.N("repair_cost", class024722 -> class024722.N(class06338.T).N(class02389.B));
    public static final class02477<class06244> t = class02484.N("creative_slot_lock", class024722 -> class024722.N(class06244.field_55626));
    public static final class02477<Boolean> G = class02484.N("enchantment_glint_override", class024722 -> class024722.N(Codec.BOOL).N(class02389.y));
    public static final class02477<class06244> l = class02484.N("intangible_projectile", class024722 -> class024722.N(class06244.field_51563));
    public static final class02477<class05349> d = class02484.N("food", class024722 -> class024722.N(class05349.N).N(class05349.y).N());
    public static final class02477<class08209> w = class02484.N("consumable", class024722 -> class024722.N(class08209.y).N(class08209.L).N());
    public static final class02477<class08197> k = class02484.N("use_remainder", class024722 -> class024722.N(class08197.N).N(class08197.y).N());
    public static final class02477<class08208> Y = class02484.N("use_cooldown", class024722 -> class024722.N(class08208.N).N(class08208.y).N());
    public static final class02477<class08721> Q = class02484.N("damage_resistant", class024722 -> class024722.N(class08721.N).N(class08721.y).N());
    public static final class02477<class02197> O = class02484.N("tool", class024722 -> class024722.N(class02197.N).N(class02197.y).N());
    public static final class02477<class08609> g = class02484.N("weapon", class024722 -> class024722.N(class08609.y).N(class08609.L).N());
    public static final class02477<class06543> I = class02484.N("attack_range", class024722 -> class024722.N(class06543.N).N(class06543.y).N());
    public static final class02477<class02766> J = class02484.N("enchantable", class024722 -> class024722.N(class02766.N).N(class02766.y).N());
    public static final class02477<class08725> o = class02484.N("equippable", class024722 -> class024722.N(class08725.N).N(class08725.y).N());
    public static final class02477<class02764> q = class02484.N("repairable", class024722 -> class024722.N(class02764.N).N(class02764.y).N());
    public static final class02477<class06244> K = class02484.N("glider", class024722 -> class024722.N(class06244.field_51563).N(class06244.field_55626));
    public static final class02477<class01894> V = class02484.N("tooltip_style", class024722 -> class024722.N(class01894.N).N(class01894.y).N());
    public static final class02477<class08723> e = class02484.N("death_protection", class024722 -> class024722.N(class08723.N).N(class08723.y).N());
    public static final class02477<class08576> H = class02484.N("blocks_attacks", class024722 -> class024722.N(class08576.N).N(class08576.y).N());
    public static final class02477<class08172> c = class02484.N("piercing_weapon", class024722 -> class024722.N(class08172.N).N(class08172.y).N());
    public static final class02477<class08174> X = class02484.N("kinetic_weapon", class024722 -> class024722.N(class08174.y).N(class08174.L).N());
    public static final class02477<class08186> a = class02484.N("swing_animation", class024722 -> class024722.N(class08186.y).N(class08186.L));
    public static final class02477<class02710> p = class02484.N("stored_enchantments", class024722 -> class024722.N(class02710.y).N(class02710.L).N());
    public static final class02477<class02816> F = class02484.N("dyed_color", class024722 -> class024722.N(class02816.N).N(class02816.y));
    public static final class02477<class02716> A = class02484.N("map_color", class024722 -> class024722.N(class02716.N).N(class02716.y));
    public static final class02477<class02265> f = class02484.N("map_id", class024722 -> class024722.N(class02265.N).N(class02265.y));
    public static final class02477<class02719> C = class02484.N("map_decorations", class024722 -> class024722.N(class02719.y).N());
    public static final class02477<class02705> S = class02484.N("map_post_processing", class024722 -> class024722.N(class02705.field_49356));
    public static final class02477<class02820> x = class02484.N("charged_projectiles", class024722 -> class024722.N(class02820.y).N(class02820.L).N());
    public static final class02477<class02830> D = class02484.N("bundle_contents", class024722 -> class024722.N(class02830.y).N(class02830.L).N());
    public static final class02477<class06517> h = class02484.N("potion_contents", class024722 -> class024722.N(class06517.L).N(class06517.u).N());
    public static final class02477<Float> r = class02484.N("potion_duration_scale", class024722 -> class024722.N(class06338.n).N(class02389.E).N());
    public static final class02477<class02692> NN = class02484.N("suspicious_stew_effects", class024722 -> class024722.N(class02692.L).N(class02692.u).N());
    public static final class02477<class02699> Ny = class02484.N("writable_book_content", class024722 -> class024722.N(class02699.i).N(class02699.R).N());
    public static final class02477<class02706> NL = class02484.N("written_book_content", class024722 -> class024722.N(class02706.Z).N(class02706.z).N());
    public static final class02477<class03254> Nu = class02484.N("trim", class024722 -> class024722.N(class03254.N).N(class03254.y).N());
    public static final class02477<class02847> Ni = class02484.N("debug_stick_state", class024722 -> class024722.N(class02847.y).N());
    public static final class02477<class08983<class07078<?>>> NR = class02484.N("entity_data", class024722 -> class024722.N(class08983.N((Codec)class07078.N)).N(class08983.N((class02362)class07078.y)));
    public static final class02477<class02837> NM = class02484.N("bucket_entity_data", class024722 -> class024722.N(class02837.L).N(class02837.u));
    public static final class02477<class08983<class00404<?>>> NB = class02484.N("block_entity_data", class024722 -> class024722.N(class08983.N((Codec)class04206.U.T())).N(class08983.N((class02362)class02389.N((class05946)class04227.i))));
    public static final class02477<class08582> NZ = class02484.N("instrument", class024722 -> class024722.N(class08582.N).N(class08582.y).N());
    public static final class02477<class08551> Nz = class02484.N("provides_trim_material", class024722 -> class024722.N(class08551.N).N(class08551.y).N());
    public static final class02477<class08213> NU = class02484.N("ominous_bottle_amplifier", class024722 -> class024722.N(class08213.u).N(class08213.i));
    public static final class02477<class02232> NE = class02484.N("jukebox_playable", class024722 -> class024722.N(class02232.N).N(class02232.y));
    public static final class02477<class03530<class00412>> NW = class02484.N("provides_banner_patterns", class024722 -> class024722.N(class03530.y((class05946)class04227.NF)).N(class03530.L((class05946)class04227.NF)).N());
    public static final class02477<List<class05946<class06521<?>>>> Nm = class02484.N("recipes", class024722 -> class024722.N(class06521.M.listOf()).N());
    public static final class02477<class02687> NP = class02484.N("lodestone_tracker", class024722 -> class024722.N(class02687.N).N(class02687.y).N());
    public static final class02477<class02827> Ns = class02484.N("firework_explosion", class024722 -> class024722.N(class02827.L).N(class02827.u).N());
    public static final class02477<class02813> NT = class02484.N("fireworks", class024722 -> class024722.N(class02813.y).N(class02813.L).N());
    public static final class02477<class02689> Nb = class02484.N("profile", class024722 -> class024722.N(class02689.N).N(class02689.y).N());
    public static final class02477<class01894> Nj = class02484.N("note_block_sound", class024722 -> class024722.N(class01894.N).N(class01894.y));
    public static final class02477<class02708> Nv = class02484.N("banner_patterns", class024722 -> class024722.N(class02708.u).N(class02708.i).N());
    public static final class02477<class06563> Nn = class02484.N("base_color", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class03490> Nt = class02484.N("pot_decorations", class024722 -> class024722.N(class03490.y).N(class03490.L).N());
    public static final class02477<class02854> NG = class02484.N("container", class024722 -> class024722.N(class02854.y).N(class02854.L).N());
    public static final class02477<class02841> Nl = class02484.N("block_state", class024722 -> class024722.N(class02841.y).N(class02841.L).N());
    public static final class02477<class08588> Nd = class02484.N("bees", class024722 -> class024722.N(class08588.N).N(class08588.y).N());
    public static final class02477<class07044> Nw = class02484.N("lock", class024722 -> class024722.N(class07044.y));
    public static final class02477<class02720> Nk = class02484.N("container_loot", class024722 -> class024722.N(class02720.N));
    public static final class02477<class03556<class04891>> NY = class02484.N("break_sound", class024722 -> class024722.N(class04891.y).N(class04891.u).N());
    public static final class02477<class03556<class05660>> NQ = class02484.N("villager/variant", class024722 -> class024722.N(class05660.B).N(class05660.Z));
    public static final class02477<class03556<class02505>> NO = class02484.N("wolf/variant", class024722 -> class024722.N(class02505.L).N(class02505.u));
    public static final class02477<class03556<class08519>> Ng = class02484.N("wolf/sound_variant", class024722 -> class024722.N(class08519.L).N(class08519.u));
    public static final class02477<class06563> NI = class02484.N("wolf/collar", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class01319> NJ = class02484.N("fox/variant", class024722 -> class024722.N(class01319.field_41548).N(class01319.field_55960));
    public static final class02477<class07861> No = class02484.N("salmon/size", class024722 -> class024722.N(class07861.field_52473).N(class07861.field_55967));
    public static final class02477<class07648> Nq = class02484.N("parrot/variant", class024722 -> class024722.N(class07648.field_41555).N(class07648.field_55965));
    public static final class02477<class07892> NK = class02484.N("tropical_fish/pattern", class024722 -> class024722.N(class07892.field_41578).N(class07892.field_55969));
    public static final class02477<class06563> NV = class02484.N("tropical_fish/base_color", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class06563> Ne = class02484.N("tropical_fish/pattern_color", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class07631> NH = class02484.N("mooshroom/variant", class024722 -> class024722.N(class07631.field_41549).N(class07631.field_55962));
    public static final class02477<class07897> Nc = class02484.N("rabbit/variant", class024722 -> class024722.N(class07897.field_41568).N(class07897.field_55966));
    public static final class02477<class03556<class08642>> NX = class02484.N("pig/variant", class024722 -> class024722.N(class08642.L).N(class08642.u));
    public static final class02477<class03556<class08403>> Na = class02484.N("cow/variant", class024722 -> class024722.N(class08403.L).N(class08403.u));
    public static final class02477<class02204<class08423>> Np = class02484.N("chicken/variant", class024722 -> class024722.N(class02204.N((class05946)class04227.NS, (Codec)class08423.L)).N(class02204.N((class05946)class04227.NS, (class02362)class08423.u)));
    public static final class02477<class02204<class07589>> NF = class02484.N("zombie_nautilus/variant", class024722 -> class024722.N(class02204.N((class05946)class04227.Nx, (Codec)class07589.L)).N(class02204.N((class05946)class04227.Nx, (class02362)class07589.u)));
    public static final class02477<class03556<class04068>> NA = class02484.N("frog/variant", class024722 -> class024722.N(class04068.L).N(class04068.u));
    public static final class02477<class05289> Nf = class02484.N("horse/variant", class024722 -> class024722.N(class05289.field_41595).N(class05289.field_55972));
    public static final class02477<class03556<class00693>> NC = class02484.N("painting/variant", class024722 -> class024722.N(class00693.L).N(class00693.u));
    public static final class02477<class00704> NS = class02484.N("llama/variant", class024722 -> class024722.N(class00704.field_41590).N(class00704.field_55971));
    public static final class02477<class05541> Nx = class02484.N("axolotl/variant", class024722 -> class024722.N(class05541.field_41585).N(class05541.field_55970));
    public static final class02477<class03556<class03648>> ND = class02484.N("cat/variant", class024722 -> class024722.N(class03648.L).N(class03648.u));
    public static final class02477<class06563> Nh = class02484.N("cat/collar", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class06563> Nr = class02484.N("sheep/color", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02477<class06563> yN = class02484.N("shulker/color", class024722 -> class024722.N(class06563.field_41600).N(class06563.field_49259));
    public static final class02695 yy = class02695.N().N(L, (Object)64).N(W, (Object)class02848.N).N(P, (Object)class02710.N).N(n, (Object)0).N(M, (Object)class08153.N).N(b, (Object)class02833.N).N(m, (Object)class06495.field_8906).N(NY, (Object)class04909.sI).N(v, (Object)class08562.L).N(a, (Object)class08186.N).N();

    public static class02477<?> N(class00751<class02477<?>> class007512) {
        return y;
    }

    private static <T> class02477<T> N(String string, UnaryOperator<class02472<T>> unaryOperator) {
        return (class02477)class00751.N((class00751)class04206.NW, (String)string, ((class02472)unaryOperator.apply(class02477.N())).y());
    }
}

