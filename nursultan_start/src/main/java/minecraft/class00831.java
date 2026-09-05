/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02195
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04689
 *  minecraft.class05946
 */
package minecraft;

import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02195;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04689;
import minecraft.class05946;

public class class00831 {
    private static final int K = 12741452;
    public static final class03556<class02195> N = class00831.N("player", "player", false, true);
    public static final class03556<class02195> y = class00831.N("frame", "frame", true, true);
    public static final class03556<class02195> L = class00831.N("red_marker", "red_marker", false, true);
    public static final class03556<class02195> u = class00831.N("blue_marker", "blue_marker", false, true);
    public static final class03556<class02195> i = class00831.N("target_x", "target_x", true, false);
    public static final class03556<class02195> R = class00831.N("target_point", "target_point", true, false);
    public static final class03556<class02195> M = class00831.N("player_off_map", "player_off_map", false, true);
    public static final class03556<class02195> B = class00831.N("player_off_limits", "player_off_limits", false, true);
    public static final class03556<class02195> Z = class00831.N("mansion", "woodland_mansion", true, 5393476, false, true);
    public static final class03556<class02195> z = class00831.N("monument", "ocean_monument", true, 3830373, false, true);
    public static final class03556<class02195> U = class00831.N("banner_white", "white_banner", true, true);
    public static final class03556<class02195> E = class00831.N("banner_orange", "orange_banner", true, true);
    public static final class03556<class02195> W = class00831.N("banner_magenta", "magenta_banner", true, true);
    public static final class03556<class02195> m = class00831.N("banner_light_blue", "light_blue_banner", true, true);
    public static final class03556<class02195> P = class00831.N("banner_yellow", "yellow_banner", true, true);
    public static final class03556<class02195> s = class00831.N("banner_lime", "lime_banner", true, true);
    public static final class03556<class02195> T = class00831.N("banner_pink", "pink_banner", true, true);
    public static final class03556<class02195> b = class00831.N("banner_gray", "gray_banner", true, true);
    public static final class03556<class02195> j = class00831.N("banner_light_gray", "light_gray_banner", true, true);
    public static final class03556<class02195> v = class00831.N("banner_cyan", "cyan_banner", true, true);
    public static final class03556<class02195> n = class00831.N("banner_purple", "purple_banner", true, true);
    public static final class03556<class02195> t = class00831.N("banner_blue", "blue_banner", true, true);
    public static final class03556<class02195> G = class00831.N("banner_brown", "brown_banner", true, true);
    public static final class03556<class02195> l = class00831.N("banner_green", "green_banner", true, true);
    public static final class03556<class02195> d = class00831.N("banner_red", "red_banner", true, true);
    public static final class03556<class02195> w = class00831.N("banner_black", "black_banner", true, true);
    public static final class03556<class02195> k = class00831.N("red_x", "red_x", true, false);
    public static final class03556<class02195> Y = class00831.N("village_desert", "desert_village", true, class04689.G.NU, false, true);
    public static final class03556<class02195> Q = class00831.N("village_plains", "plains_village", true, class04689.G.NU, false, true);
    public static final class03556<class02195> O = class00831.N("village_savanna", "savanna_village", true, class04689.G.NU, false, true);
    public static final class03556<class02195> g = class00831.N("village_snowy", "snowy_village", true, class04689.G.NU, false, true);
    public static final class03556<class02195> I = class00831.N("village_taiga", "taiga_village", true, class04689.G.NU, false, true);
    public static final class03556<class02195> J = class00831.N("jungle_temple", "jungle_temple", true, class04689.G.NU, false, true);
    public static final class03556<class02195> o = class00831.N("swamp_hut", "swamp_hut", true, class04689.G.NU, false, true);
    public static final class03556<class02195> q = class00831.N("trial_chambers", "trial_chambers", true, 12741452, false, true);

    public static class03556<class02195> N(class00751<class02195> class007512) {
        return N;
    }

    private static class03556<class02195> N(String string, String string2, boolean bl, int n, boolean bl2, boolean bl3) {
        class05946 class059462 = class05946.N((class05946)class04227.r, (class01894)class01894.y((String)string));
        class02195 class021952 = new class02195(class01894.y((String)string2), bl, n, bl3, bl2);
        return class00751.y(class04206.NT, class059462, class021952);
    }

    private static class03556<class02195> N(String string, String string2, boolean bl, boolean bl2) {
        return class00831.N(string, string2, bl, -1, bl2, false);
    }
}

