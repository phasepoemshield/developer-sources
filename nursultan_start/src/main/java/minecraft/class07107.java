/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00303
 *  minecraft.class00436
 *  minecraft.class00473
 *  minecraft.class00751
 *  minecraft.class01162
 *  minecraft.class01192
 *  minecraft.class01904
 *  minecraft.class02329
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03627
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class07092
 *  minecraft.class07103
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00303;
import minecraft.class00436;
import minecraft.class00473;
import minecraft.class00751;
import minecraft.class01162;
import minecraft.class01192;
import minecraft.class01904;
import minecraft.class02329;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03627;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class07092;
import minecraft.class07103;
import minecraft.class07105;
import minecraft.class07115;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07138;

public class class07107 {
    public static final class07134 N = class07107.N("angry_villager", false);
    public static final class07103<class07105> y = class07107.N("block", false, class07105::N, class07105::y);
    public static final class07103<class07105> L = class07107.N("block_marker", true, class07105::N, class07105::y);
    public static final class07134 u = class07107.N("bubble", false);
    public static final class07134 i = class07107.N("cloud", false);
    public static final class07134 R = class07107.N("copper_fire_flame", false);
    public static final class07134 M = class07107.N("crit", false);
    public static final class07134 B = class07107.N("damage_indicator", true);
    public static final class07103<class00473> Z = class07107.N("dragon_breath", false, class00473::N, class00473::y);
    public static final class07134 z = class07107.N("dripping_lava", false);
    public static final class07134 U = class07107.N("falling_lava", false);
    public static final class07134 E = class07107.N("landing_lava", false);
    public static final class07134 W = class07107.N("dripping_water", false);
    public static final class07134 m = class07107.N("falling_water", false);
    public static final class07103<class07138> P = class07107.N("dust", false, class071032 -> class07138.L, class071032 -> class07138.u);
    public static final class07103<class01162> s = class07107.N("dust_color_transition", false, class071032 -> class01162.L, class071032 -> class01162.u);
    public static final class07103<class00436> T = class07107.N("effect", false, class00436::N, class00436::y);
    public static final class07134 b = class07107.N("elder_guardian", true);
    public static final class07134 j = class07107.N("enchanted_hit", false);
    public static final class07134 v = class07107.N("enchant", false);
    public static final class07134 n = class07107.N("end_rod", false);
    public static final class07103<class02329> t = class07107.N("entity_effect", false, class02329::N, class02329::y);
    public static final class07134 G = class07107.N("explosion_emitter", true);
    public static final class07134 l = class07107.N("explosion", true);
    public static final class07134 d = class07107.N("gust", true);
    public static final class07134 w = class07107.N("small_gust", false);
    public static final class07134 k = class07107.N("gust_emitter_large", true);
    public static final class07134 Y = class07107.N("gust_emitter_small", true);
    public static final class07134 Q = class07107.N("sonic_boom", true);
    public static final class07103<class07105> O = class07107.N("falling_dust", false, class07105::N, class07105::y);
    public static final class07134 g = class07107.N("firework", false);
    public static final class07134 I = class07107.N("fishing", false);
    public static final class07134 J = class07107.N("flame", false);
    public static final class07134 o = class07107.N("infested", false);
    public static final class07134 q = class07107.N("cherry_leaves", false);
    public static final class07134 K = class07107.N("pale_oak_leaves", false);
    public static final class07103<class02329> V = class07107.N("tinted_leaves", false, class02329::N, class02329::y);
    public static final class07134 e = class07107.N("sculk_soul", false);
    public static final class07103<class01904> H = class07107.N("sculk_charge", true, class071032 -> class01904.N, class071032 -> class01904.y);
    public static final class07134 c = class07107.N("sculk_charge_pop", true);
    public static final class07134 X = class07107.N("soul_fire_flame", false);
    public static final class07134 a = class07107.N("soul", false);
    public static final class07103<class02329> p = class07107.N("flash", false, class02329::N, class02329::y);
    public static final class07134 F = class07107.N("happy_villager", false);
    public static final class07134 A = class07107.N("composter", false);
    public static final class07134 f = class07107.N("heart", false);
    public static final class07103<class00436> C = class07107.N("instant_effect", false, class00436::N, class00436::y);
    public static final class07103<class07092> S = class07107.N("item", false, class07092::N, class07092::y);
    public static final class07103<class01192> x = class07107.N("vibration", true, class071032 -> class01192.N, class071032 -> class01192.y);
    public static final class07103<class00303> D = class07107.N("trail", false, class071032 -> class00303.N, class071032 -> class00303.y);
    public static final class07134 h = class07107.N("item_slime", false);
    public static final class07134 r = class07107.N("item_cobweb", false);
    public static final class07134 NN = class07107.N("item_snowball", false);
    public static final class07134 Ny = class07107.N("large_smoke", false);
    public static final class07134 NL = class07107.N("lava", false);
    public static final class07134 Nu = class07107.N("mycelium", false);
    public static final class07134 Ni = class07107.N("note", false);
    public static final class07134 NR = class07107.N("poof", true);
    public static final class07134 NM = class07107.N("portal", false);
    public static final class07134 NB = class07107.N("rain", false);
    public static final class07134 NZ = class07107.N("smoke", false);
    public static final class07134 Nz = class07107.N("white_smoke", false);
    public static final class07134 NU = class07107.N("sneeze", false);
    public static final class07134 NE = class07107.N("spit", true);
    public static final class07134 NW = class07107.N("squid_ink", true);
    public static final class07134 Nm = class07107.N("sweep_attack", true);
    public static final class07134 NP = class07107.N("totem_of_undying", false);
    public static final class07134 Ns = class07107.N("underwater", false);
    public static final class07134 NT = class07107.N("splash", false);
    public static final class07134 Nb = class07107.N("witch", false);
    public static final class07134 Nj = class07107.N("bubble_pop", false);
    public static final class07134 Nv = class07107.N("current_down", false);
    public static final class07134 Nn = class07107.N("bubble_column_up", false);
    public static final class07134 Nt = class07107.N("nautilus", false);
    public static final class07134 NG = class07107.N("dolphin", false);
    public static final class07134 Nl = class07107.N("campfire_cosy_smoke", true);
    public static final class07134 Nd = class07107.N("campfire_signal_smoke", true);
    public static final class07134 Nw = class07107.N("dripping_honey", false);
    public static final class07134 Nk = class07107.N("falling_honey", false);
    public static final class07134 NY = class07107.N("landing_honey", false);
    public static final class07134 NQ = class07107.N("falling_nectar", false);
    public static final class07134 NO = class07107.N("falling_spore_blossom", false);
    public static final class07134 Ng = class07107.N("ash", false);
    public static final class07134 NI = class07107.N("crimson_spore", false);
    public static final class07134 NJ = class07107.N("warped_spore", false);
    public static final class07134 No = class07107.N("spore_blossom_air", false);
    public static final class07134 Nq = class07107.N("dripping_obsidian_tear", false);
    public static final class07134 NK = class07107.N("falling_obsidian_tear", false);
    public static final class07134 NV = class07107.N("landing_obsidian_tear", false);
    public static final class07134 Ne = class07107.N("reverse_portal", false);
    public static final class07134 NH = class07107.N("white_ash", false);
    public static final class07134 Nc = class07107.N("small_flame", false);
    public static final class07134 NX = class07107.N("snowflake", false);
    public static final class07134 Na = class07107.N("dripping_dripstone_lava", false);
    public static final class07134 Np = class07107.N("falling_dripstone_lava", false);
    public static final class07134 NF = class07107.N("dripping_dripstone_water", false);
    public static final class07134 NA = class07107.N("falling_dripstone_water", false);
    public static final class07134 Nf = class07107.N("glow_squid_ink", true);
    public static final class07134 NC = class07107.N("glow", true);
    public static final class07134 NS = class07107.N("wax_on", true);
    public static final class07134 Nx = class07107.N("wax_off", true);
    public static final class07134 ND = class07107.N("electric_spark", true);
    public static final class07134 Nh = class07107.N("scrape", true);
    public static final class07103<class03627> Nr = class07107.N("shriek", false, class071032 -> class03627.N, class071032 -> class03627.y);
    public static final class07134 yN = class07107.N("egg_crack", false);
    public static final class07134 yy = class07107.N("dust_plume", false);
    public static final class07134 yL = class07107.N("trial_spawner_detection", true);
    public static final class07134 yu = class07107.N("trial_spawner_detection_ominous", true);
    public static final class07134 yi = class07107.N("vault_connection", true);
    public static final class07103<class07105> yR = class07107.N("dust_pillar", false, class07105::N, class07105::y);
    public static final class07134 yM = class07107.N("ominous_spawning", true);
    public static final class07134 yB = class07107.N("raid_omen", false);
    public static final class07134 yZ = class07107.N("trial_omen", false);
    public static final class07103<class07105> yz = class07107.N("block_crumble", false, class07105::N, class07105::y);
    public static final class07134 yU = class07107.N("firefly", false);
    public static final Codec<class07126> yE = class04206.z.T().dispatch("type", class07126::method_10295, class07103::method_29138);
    public static final class02362<class04247, class07126> yW = class02389.N((class05946)class04227.NM).y(class07126::method_10295, class07103::method_56179);

    private static <T extends class07126> class07103<T> N(String string, boolean bl, Function<class07103<T>, MapCodec<T>> function, Function<class07103<T>, class02362<? super class04247, T>> function2) {
        return (class07103)class00751.N((class00751)class04206.z, (String)string, new class07115(bl, function, function2));
    }

    private static class07134 N(String string, boolean bl) {
        return (class07134)class00751.N((class00751)class04206.z, (String)string, (Object)new class07134(bl));
    }
}

