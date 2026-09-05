/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01818
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class04227
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class01818;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class04227;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05946;
import minecraft.class06069;

public class class03008 {
    public static final class05946<class05056> N = class03008.N("temperature");
    public static final class05946<class05056> y = class03008.N("vegetation");
    public static final class05946<class05056> L = class03008.N("continentalness");
    public static final class05946<class05056> u = class03008.N("erosion");
    public static final class05946<class05056> i = class03008.N("temperature_large");
    public static final class05946<class05056> R = class03008.N("vegetation_large");
    public static final class05946<class05056> M = class03008.N("continentalness_large");
    public static final class05946<class05056> B = class03008.N("erosion_large");
    public static final class05946<class05056> Z = class03008.N("ridge");
    public static final class05946<class05056> z = class03008.N("offset");
    public static final class05946<class05056> U = class03008.N("aquifer_barrier");
    public static final class05946<class05056> E = class03008.N("aquifer_fluid_level_floodedness");
    public static final class05946<class05056> W = class03008.N("aquifer_lava");
    public static final class05946<class05056> m = class03008.N("aquifer_fluid_level_spread");
    public static final class05946<class05056> P = class03008.N("pillar");
    public static final class05946<class05056> s = class03008.N("pillar_rareness");
    public static final class05946<class05056> T = class03008.N("pillar_thickness");
    public static final class05946<class05056> b = class03008.N("spaghetti_2d");
    public static final class05946<class05056> j = class03008.N("spaghetti_2d_elevation");
    public static final class05946<class05056> v = class03008.N("spaghetti_2d_modulator");
    public static final class05946<class05056> n = class03008.N("spaghetti_2d_thickness");
    public static final class05946<class05056> t = class03008.N("spaghetti_3d_1");
    public static final class05946<class05056> G = class03008.N("spaghetti_3d_2");
    public static final class05946<class05056> l = class03008.N("spaghetti_3d_rarity");
    public static final class05946<class05056> d = class03008.N("spaghetti_3d_thickness");
    public static final class05946<class05056> w = class03008.N("spaghetti_roughness");
    public static final class05946<class05056> k = class03008.N("spaghetti_roughness_modulator");
    public static final class05946<class05056> Y = class03008.N("cave_entrance");
    public static final class05946<class05056> Q = class03008.N("cave_layer");
    public static final class05946<class05056> O = class03008.N("cave_cheese");
    public static final class05946<class05056> g = class03008.N("ore_veininess");
    public static final class05946<class05056> I = class03008.N("ore_vein_a");
    public static final class05946<class05056> J = class03008.N("ore_vein_b");
    public static final class05946<class05056> o = class03008.N("ore_gap");
    public static final class05946<class05056> q = class03008.N("noodle");
    public static final class05946<class05056> K = class03008.N("noodle_thickness");
    public static final class05946<class05056> V = class03008.N("noodle_ridge_a");
    public static final class05946<class05056> e = class03008.N("noodle_ridge_b");
    public static final class05946<class05056> H = class03008.N("jagged");
    public static final class05946<class05056> c = class03008.N("surface");
    public static final class05946<class05056> X = class03008.N("surface_secondary");
    public static final class05946<class05056> a = class03008.N("clay_bands_offset");
    public static final class05946<class05056> p = class03008.N("badlands_pillar");
    public static final class05946<class05056> F = class03008.N("badlands_pillar_roof");
    public static final class05946<class05056> A = class03008.N("badlands_surface");
    public static final class05946<class05056> f = class03008.N("iceberg_pillar");
    public static final class05946<class05056> C = class03008.N("iceberg_pillar_roof");
    public static final class05946<class05056> S = class03008.N("iceberg_surface");
    public static final class05946<class05056> x = class03008.N("surface_swamp");
    public static final class05946<class05056> D = class03008.N("calcite");
    public static final class05946<class05056> h = class03008.N("gravel");
    public static final class05946<class05056> r = class03008.N("powder_snow");
    public static final class05946<class05056> NN = class03008.N("packed_ice");
    public static final class05946<class05056> Ny = class03008.N("ice");
    public static final class05946<class05056> NL = class03008.N("soul_sand_layer");
    public static final class05946<class05056> Nu = class03008.N("gravel_layer");
    public static final class05946<class05056> Ni = class03008.N("patch");
    public static final class05946<class05056> NR = class03008.N("netherrack");
    public static final class05946<class05056> NM = class03008.N("nether_wart");
    public static final class05946<class05056> NB = class03008.N("nether_state_selector");

    private static class05946<class05056> N(String string) {
        return class05946.N((class05946)class04227.yW, (class01894)class01894.y((String)string));
    }

    public static class05041 N(class02055<class05056> class020552, class01818 class018182, class05946<class05056> class059462) {
        class03529 class035292 = class020552.y(class059462);
        return class05041.y((class06069)class018182.N(((class05946)class035292.i().orElseThrow()).N()), (class05056)((class05056)class035292.N()));
    }
}

