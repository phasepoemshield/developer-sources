/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04227
 *  minecraft.class05946
 *  net.irisshaders.iris.uniforms.BiomeUniforms
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00780;
import minecraft.class01894;
import minecraft.class04227;
import minecraft.class05946;
import net.irisshaders.iris.uniforms.BiomeUniforms;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00795 {
    public static final class05946<class00780> N = class00795.N("the_void");
    public static final class05946<class00780> y = class00795.N("plains");
    public static final class05946<class00780> L = class00795.N("sunflower_plains");
    public static final class05946<class00780> u = class00795.N("snowy_plains");
    public static final class05946<class00780> i = class00795.N("ice_spikes");
    public static final class05946<class00780> R = class00795.N("desert");
    public static final class05946<class00780> M = class00795.N("swamp");
    public static final class05946<class00780> B = class00795.N("mangrove_swamp");
    public static final class05946<class00780> Z = class00795.N("forest");
    public static final class05946<class00780> z = class00795.N("flower_forest");
    public static final class05946<class00780> U = class00795.N("birch_forest");
    public static final class05946<class00780> E = class00795.N("dark_forest");
    public static final class05946<class00780> W = class00795.N("pale_garden");
    public static final class05946<class00780> m = class00795.N("old_growth_birch_forest");
    public static final class05946<class00780> P = class00795.N("old_growth_pine_taiga");
    public static final class05946<class00780> s = class00795.N("old_growth_spruce_taiga");
    public static final class05946<class00780> T = class00795.N("taiga");
    public static final class05946<class00780> b = class00795.N("snowy_taiga");
    public static final class05946<class00780> j = class00795.N("savanna");
    public static final class05946<class00780> v = class00795.N("savanna_plateau");
    public static final class05946<class00780> n = class00795.N("windswept_hills");
    public static final class05946<class00780> t = class00795.N("windswept_gravelly_hills");
    public static final class05946<class00780> G = class00795.N("windswept_forest");
    public static final class05946<class00780> l = class00795.N("windswept_savanna");
    public static final class05946<class00780> d = class00795.N("jungle");
    public static final class05946<class00780> w = class00795.N("sparse_jungle");
    public static final class05946<class00780> k = class00795.N("bamboo_jungle");
    public static final class05946<class00780> Y = class00795.N("badlands");
    public static final class05946<class00780> Q = class00795.N("eroded_badlands");
    public static final class05946<class00780> O = class00795.N("wooded_badlands");
    public static final class05946<class00780> g = class00795.N("meadow");
    public static final class05946<class00780> I = class00795.N("cherry_grove");
    public static final class05946<class00780> J = class00795.N("grove");
    public static final class05946<class00780> o = class00795.N("snowy_slopes");
    public static final class05946<class00780> q = class00795.N("frozen_peaks");
    public static final class05946<class00780> K = class00795.N("jagged_peaks");
    public static final class05946<class00780> V = class00795.N("stony_peaks");
    public static final class05946<class00780> e = class00795.N("river");
    public static final class05946<class00780> H = class00795.N("frozen_river");
    public static final class05946<class00780> c = class00795.N("beach");
    public static final class05946<class00780> X = class00795.N("snowy_beach");
    public static final class05946<class00780> a = class00795.N("stony_shore");
    public static final class05946<class00780> p = class00795.N("warm_ocean");
    public static final class05946<class00780> F = class00795.N("lukewarm_ocean");
    public static final class05946<class00780> A = class00795.N("deep_lukewarm_ocean");
    public static final class05946<class00780> f = class00795.N("ocean");
    public static final class05946<class00780> C = class00795.N("deep_ocean");
    public static final class05946<class00780> S = class00795.N("cold_ocean");
    public static final class05946<class00780> x = class00795.N("deep_cold_ocean");
    public static final class05946<class00780> D = class00795.N("frozen_ocean");
    public static final class05946<class00780> h = class00795.N("deep_frozen_ocean");
    public static final class05946<class00780> r = class00795.N("mushroom_fields");
    public static final class05946<class00780> NN = class00795.N("dripstone_caves");
    public static final class05946<class00780> Ny = class00795.N("lush_caves");
    public static final class05946<class00780> NL = class00795.N("deep_dark");
    public static final class05946<class00780> Nu = class00795.N("nether_wastes");
    public static final class05946<class00780> Ni = class00795.N("warped_forest");
    public static final class05946<class00780> NR = class00795.N("crimson_forest");
    public static final class05946<class00780> NM = class00795.N("soul_sand_valley");
    public static final class05946<class00780> NB = class00795.N("basalt_deltas");
    public static final class05946<class00780> NZ = class00795.N("the_end");
    public static final class05946<class00780> Nz = class00795.N("end_highlands");
    public static final class05946<class00780> NU = class00795.N("end_midlands");
    public static final class05946<class00780> NE = class00795.N("small_end_islands");
    public static final class05946<class00780> NW = class00795.N("end_barrens");
    private static int Nm = 0;

    private static class05946<class00780> N(String string) {
        class05946 class059462 = class05946.N((class05946)class04227.NA, (class01894)class01894.y((String)string));
        class00795.N(string, new CallbackInfoReturnable("", false, (Object)class059462));
        return class059462;
    }

    private static void N(String string, CallbackInfoReturnable callbackInfoReturnable) {
        BiomeUniforms.getBiomeMap().put((Object)((class05946)callbackInfoReturnable.getReturnValue()), Nm++);
    }
}

