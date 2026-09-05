/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class02019
 *  minecraft.class05904
 *  minecraft.class08118
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class01134;
import minecraft.class01894;
import minecraft.class02019;
import minecraft.class05904;
import minecraft.class08118;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class04802
implements ModelLayersAccessor {
    private static final String ip = "main";
    private static final Set<class01134> iF = Sets.newHashSet();
    public static final class01134 N = class04802.N("boat/acacia");
    public static final class01134 y = class04802.N("chest_boat/acacia");
    public static final class01134 L = class04802.N("allay");
    public static final class01134 u = class04802.N("armadillo");
    public static final class01134 i = class04802.N("armadillo_baby");
    public static final class01134 R = class04802.N("armor_stand");
    public static final class08118<class01134> M = class04802.y("armor_stand");
    public static final class01134 B = class04802.N("armor_stand_small");
    public static final class08118<class01134> Z = class04802.y("armor_stand_small");
    public static final class01134 z = class04802.N("arrow");
    public static final class01134 U = class04802.N("axolotl");
    public static final class01134 E = class04802.N("axolotl_baby");
    public static final class01134 W = class04802.N("chest_boat/bamboo");
    public static final class01134 m = class04802.N("boat/bamboo");
    public static final class01134 P = class04802.N("standing_banner");
    public static final class01134 s = class04802.N("standing_banner", "flag");
    public static final class01134 T = class04802.N("wall_banner");
    public static final class01134 b = class04802.N("wall_banner", "flag");
    public static final class01134 j = class04802.N("bat");
    public static final class01134 v = class04802.N("bed_foot");
    public static final class01134 n = class04802.N("bed_head");
    public static final class01134 t = class04802.N("bee");
    public static final class01134 G = class04802.N("bee_baby");
    public static final class01134 l = class04802.N("bee_stinger");
    public static final class01134 d = class04802.N("bell");
    public static final class01134 w = class04802.N("boat/birch");
    public static final class01134 k = class04802.N("chest_boat/birch");
    public static final class01134 Y = class04802.N("blaze");
    public static final class01134 Q = class04802.N("boat", "water_patch");
    public static final class01134 O = class04802.N("bogged");
    public static final class08118<class01134> g = class04802.y("bogged");
    public static final class01134 I = class04802.N("bogged", "outer");
    public static final class01134 J = class04802.N("book");
    public static final class01134 o = class04802.N("breeze");
    public static final class01134 q = class04802.N("breeze", "wind");
    public static final class01134 K = class04802.N("breeze", "eyes");
    public static final class01134 V = class04802.N("camel");
    public static final class01134 e = class04802.N("camel_baby");
    public static final class01134 H = class04802.N("camel", "saddle");
    public static final class01134 c = class04802.N("camel_baby", "saddle");
    public static final class01134 X = class04802.N("camel_husk", "saddle");
    public static final class01134 a = class04802.N("camel_husk_baby", "saddle");
    public static final class01134 p = class04802.N("cat");
    public static final class01134 F = class04802.N("cat_baby");
    public static final class01134 A = class04802.N("cat_baby", "collar");
    public static final class01134 f = class04802.N("cat", "collar");
    public static final class01134 C = class04802.N("cave_spider");
    public static final class01134 S = class04802.N("boat/cherry");
    public static final class01134 x = class04802.N("chest_boat/cherry");
    public static final class01134 D = class04802.N("chest");
    public static final class01134 h = class04802.N("chest_minecart");
    public static final class01134 r = class04802.N("chicken");
    public static final class01134 NN = class04802.N("chicken_baby");
    public static final class01134 Ny = class04802.N("cod");
    public static final class01134 NL = class04802.N("cold_chicken");
    public static final class01134 Nu = class04802.N("cold_chicken_baby");
    public static final class01134 Ni = class04802.N("cold_cow");
    public static final class01134 NR = class04802.N("cold_cow_baby");
    public static final class01134 NM = class04802.N("cold_pig");
    public static final class01134 NB = class04802.N("cold_pig_baby");
    public static final class01134 NZ = class04802.N("command_block_minecart");
    public static final class01134 Nz = class04802.N("conduit", "cage");
    public static final class01134 NU = class04802.N("conduit", "eye");
    public static final class01134 NE = class04802.N("conduit", "shell");
    public static final class01134 NW = class04802.N("conduit", "wind");
    public static final class01134 Nm = class04802.N("copper_golem");
    public static final class01134 NP = class04802.N("copper_golem", "eyes");
    public static final class01134 Ns = class04802.N("copper_golem_running");
    public static final class01134 NT = class04802.N("copper_golem_sitting");
    public static final class01134 Nb = class04802.N("copper_golem_star");
    public static final class01134 Nj = class04802.N("zombie_nautilus_coral");
    public static final class01134 Nv = class04802.N("cow");
    public static final class01134 Nn = class04802.N("cow_baby");
    public static final class01134 Nt = class04802.N("creaking");
    public static final class01134 NG = class04802.N("creaking", "eyes");
    public static final class01134 Nl = class04802.N("creeper");
    public static final class01134 Nd = class04802.N("creeper", "armor");
    public static final class01134 Nw = class04802.N("creeper_head");
    public static final class01134 Nk = class04802.N("boat/dark_oak");
    public static final class01134 NY = class04802.N("chest_boat/dark_oak");
    public static final class01134 NQ = class04802.N("decorated_pot_base");
    public static final class01134 NO = class04802.N("decorated_pot_sides");
    public static final class01134 Ng = class04802.N("dolphin");
    public static final class01134 NI = class04802.N("dolphin_baby");
    public static final class01134 NJ = class04802.N("donkey");
    public static final class01134 No = class04802.N("donkey_baby");
    public static final class01134 Nq = class04802.N("donkey", "saddle");
    public static final class01134 NK = class04802.N("donkey_baby", "saddle");
    public static final class01134 NV = class04802.N("double_chest_left");
    public static final class01134 Ne = class04802.N("double_chest_right");
    public static final class01134 NH = class04802.N("dragon_skull");
    public static final class01134 Nc = class04802.N("drowned");
    public static final class01134 NX = class04802.N("drowned_baby");
    public static final class08118<class01134> Na = class04802.y("drowned_baby");
    public static final class01134 Np = class04802.N("drowned_baby", "outer");
    public static final class08118<class01134> NF = class04802.y("drowned");
    public static final class01134 NA = class04802.N("drowned", "outer");
    public static final class01134 Nf = class04802.N("elder_guardian");
    public static final class01134 NC = class04802.N("elytra");
    public static final class01134 NS = class04802.N("elytra_baby");
    public static final class01134 Nx = class04802.N("enderman");
    public static final class01134 ND = class04802.N("endermite");
    public static final class01134 Nh = class04802.N("ender_dragon");
    public static final class01134 Nr = class04802.N("end_crystal");
    public static final class01134 yN = class04802.N("evoker");
    public static final class01134 yy = class04802.N("evoker_fangs");
    public static final class01134 yL = class04802.N("fox");
    public static final class01134 yu = class04802.N("fox_baby");
    public static final class01134 yi = class04802.N("frog");
    public static final class01134 yR = class04802.N("furnace_minecart");
    public static final class01134 yM = class04802.N("ghast");
    public static final class01134 yB = class04802.N("giant");
    public static final class08118<class01134> yZ = class04802.y("giant");
    public static final class01134 yz = class04802.N("glow_squid");
    public static final class01134 yU = class04802.N("glow_squid_baby");
    public static final class01134 yE = class04802.N("goat");
    public static final class01134 yW = class04802.N("goat_baby");
    public static final class01134 ym = class04802.N("guardian");
    public static final class01134 yP = class04802.N("happy_ghast");
    public static final class01134 ys = class04802.N("happy_ghast_baby");
    public static final class01134 yT = class04802.N("happy_ghast_harness");
    public static final class01134 yb = class04802.N("happy_ghast_baby_harness");
    public static final class01134 yj = class04802.N("happy_ghast_ropes");
    public static final class01134 yv = class04802.N("happy_ghast_baby_ropes");
    public static final class01134 yn = class04802.N("hoglin");
    public static final class01134 yt = class04802.N("hoglin_baby");
    public static final class01134 yG = class04802.N("hopper_minecart");
    public static final class01134 yl = class04802.N("horse");
    public static final class01134 yd = class04802.N("horse_armor");
    public static final class01134 yw = class04802.N("horse", "saddle");
    public static final class01134 yk = class04802.N("horse_baby");
    public static final class01134 yY = class04802.N("horse_armor_baby");
    public static final class01134 yQ = class04802.N("horse_baby", "saddle");
    public static final class01134 yO = class04802.N("husk");
    public static final class01134 yg = class04802.N("husk_baby");
    public static final class08118<class01134> yI = class04802.y("husk_baby");
    public static final class08118<class01134> yJ = class04802.y("husk");
    public static final class01134 yo = class04802.N("illusioner");
    public static final class01134 yq = class04802.N("iron_golem");
    public static final class01134 yK = class04802.N("boat/jungle");
    public static final class01134 yV = class04802.N("chest_boat/jungle");
    public static final class01134 ye = class04802.N("leash_knot");
    public static final class01134 yH = class04802.N("llama");
    public static final class01134 yc = class04802.N("llama_baby");
    public static final class01134 yX = class04802.N("llama_baby", "decor");
    public static final class01134 ya = class04802.N("llama", "decor");
    public static final class01134 yp = class04802.N("llama_spit");
    public static final class01134 yF = class04802.N("magma_cube");
    public static final class01134 yA = class04802.N("boat/mangrove");
    public static final class01134 yf = class04802.N("chest_boat/mangrove");
    public static final class01134 yC = class04802.N("minecart");
    public static final class01134 yS = class04802.N("mooshroom");
    public static final class01134 yx = class04802.N("mooshroom_baby");
    public static final class01134 yD = class04802.N("mule");
    public static final class01134 yh = class04802.N("mule_baby");
    public static final class01134 yr = class04802.N("mule", "saddle");
    public static final class01134 LN = class04802.N("mule_baby", "saddle");
    public static final class01134 Ly = class04802.N("nautilus");
    public static final class01134 LL = class04802.N("nautilus_baby");
    public static final class01134 Lu = class04802.N("nautilus", "saddle");
    public static final class01134 Li = class04802.N("nautilus_armor");
    public static final class01134 LR = class04802.N("boat/oak");
    public static final class01134 LM = class04802.N("chest_boat/oak");
    public static final class01134 LB = class04802.N("ocelot");
    public static final class01134 LZ = class04802.N("ocelot_baby");
    public static final class01134 Lz = class04802.N("boat/pale_oak");
    public static final class01134 LU = class04802.N("chest_boat/pale_oak");
    public static final class01134 LE = class04802.N("panda");
    public static final class01134 LW = class04802.N("panda_baby");
    public static final class01134 Lm = class04802.N("parched");
    public static final class08118<class01134> LP = class04802.y("parched");
    public static final class01134 Ls = class04802.N("parched", "outer");
    public static final class01134 LT = class04802.N("parrot");
    public static final class01134 Lb = class04802.N("phantom");
    public static final class01134 Lj = class04802.N("pig");
    public static final class01134 Lv = class04802.N("piglin");
    public static final class01134 Ln = class04802.N("piglin_baby");
    public static final class08118<class01134> Lt = class04802.y("piglin_baby");
    public static final class01134 LG = class04802.N("piglin_brute");
    public static final class08118<class01134> Ll = class04802.y("piglin_brute");
    public static final class01134 Ld = class04802.N("piglin_head");
    public static final class08118<class01134> Lw = class04802.y("piglin");
    public static final class01134 Lk = class04802.N("pig_baby");
    public static final class01134 LY = class04802.N("pig_baby", "saddle");
    public static final class01134 LQ = class04802.N("pig", "saddle");
    public static final class01134 LO = class04802.N("pillager");
    public static final class01134 Lg = class04802.N("player");
    public static final class01134 LI = class04802.N("player", "cape");
    public static final class01134 LJ = class04802.N("player", "ears");
    public static final class01134 Lo = class04802.N("player_head");
    public static final class08118<class01134> Lq = class04802.y("player");
    public static final class01134 LK = class04802.N("player_slim");
    public static final class08118<class01134> LV = class04802.y("player_slim");
    public static final class01134 Le = class04802.N("spin_attack");
    public static final class01134 LH = class04802.N("polar_bear");
    public static final class01134 Lc = class04802.N("polar_bear_baby");
    public static final class01134 LX = class04802.N("pufferfish_big");
    public static final class01134 La = class04802.N("pufferfish_medium");
    public static final class01134 Lp = class04802.N("pufferfish_small");
    public static final class01134 LF = class04802.N("rabbit");
    public static final class01134 LA = class04802.N("rabbit_baby");
    public static final class01134 Lf = class04802.N("ravager");
    public static final class01134 LC = class04802.N("salmon");
    public static final class01134 LS = class04802.N("salmon_large");
    public static final class01134 Lx = class04802.N("salmon_small");
    public static final class01134 LD = class04802.N("sheep");
    public static final class01134 Lh = class04802.N("sheep_baby");
    public static final class01134 Lr = class04802.N("sheep_baby", "wool");
    public static final class01134 uN = class04802.N("sheep", "wool");
    public static final class01134 uy = class04802.N("sheep", "wool_undercoat");
    public static final class01134 uL = class04802.N("sheep_baby", "wool_undercoat");
    public static final class01134 uu = class04802.N("shield");
    public static final class01134 ui = class04802.N("shulker");
    public static final class01134 uR = class04802.N("shulker_box");
    public static final class01134 uM = class04802.N("shulker_bullet");
    public static final class01134 uB = class04802.N("silverfish");
    public static final class01134 uZ = class04802.N("skeleton");
    public static final class01134 uz = class04802.N("skeleton_horse");
    public static final class01134 uU = class04802.N("skeleton_horse_baby");
    public static final class01134 uE = class04802.N("skeleton_horse", "saddle");
    public static final class01134 uW = class04802.N("skeleton_horse_baby", "saddle");
    public static final class08118<class01134> um = class04802.y("skeleton");
    public static final class01134 uP = class04802.N("skeleton_skull");
    public static final class01134 us = class04802.N("slime");
    public static final class01134 uT = class04802.N("slime", "outer");
    public static final class01134 ub = class04802.N("sniffer");
    public static final class01134 uj = class04802.N("sniffer_baby");
    public static final class01134 uv = class04802.N("snow_golem");
    public static final class01134 un = class04802.N("spawner_minecart");
    public static final class01134 ut = class04802.N("spider");
    public static final class01134 uG = class04802.N("boat/spruce");
    public static final class01134 ul = class04802.N("chest_boat/spruce");
    public static final class01134 ud = class04802.N("squid");
    public static final class01134 uw = class04802.N("squid_baby");
    public static final class01134 uk = class04802.N("stray");
    public static final class08118<class01134> uY = class04802.y("stray");
    public static final class01134 uQ = class04802.N("stray", "outer");
    public static final class01134 uO = class04802.N("strider");
    public static final class01134 ug = class04802.N("strider", "saddle");
    public static final class01134 uI = class04802.N("strider_baby");
    public static final class01134 uJ = class04802.N("strider_baby", "saddle");
    public static final class01134 uo = class04802.N("tadpole");
    public static final class01134 uq = class04802.N("tnt_minecart");
    public static final class01134 uK = class04802.N("trader_llama");
    public static final class01134 uV = class04802.N("trader_llama_baby");
    public static final class01134 ue = class04802.N("trident");
    public static final class01134 uH = class04802.N("tropical_fish_large");
    public static final class01134 uc = class04802.N("tropical_fish_large", "pattern");
    public static final class01134 uX = class04802.N("tropical_fish_small");
    public static final class01134 ua = class04802.N("tropical_fish_small", "pattern");
    public static final class01134 up = class04802.N("turtle");
    public static final class01134 uF = class04802.N("turtle_baby");
    public static final class01134 uA = class04802.N("undead_horse_armor");
    public static final class01134 uf = class04802.N("undead_horse_baby_armor");
    public static final class01134 uC = class04802.N("vex");
    public static final class01134 uS = class04802.N("villager");
    public static final class01134 ux = class04802.N("villager_no_hat");
    public static final class01134 uD = class04802.N("villager_baby");
    public static final class01134 uh = class04802.N("villager_baby_no_hat");
    public static final class01134 ur = class04802.N("vindicator");
    public static final class01134 iN = class04802.N("wandering_trader");
    public static final class01134 iy = class04802.N("warden");
    public static final class01134 iL = class04802.N("warden", "bioluminescent");
    public static final class01134 iu = class04802.N("warden", "pulsating_spots");
    public static final class01134 ii = class04802.N("warden", "tendrils");
    public static final class01134 iR = class04802.N("warden", "heart");
    public static final class01134 iM = class04802.N("warm_cow");
    public static final class01134 iB = class04802.N("warm_cow_baby");
    public static final class01134 iZ = class04802.N("wind_charge");
    public static final class01134 iz = class04802.N("witch");
    public static final class01134 iU = class04802.N("wither");
    public static final class01134 iE = class04802.N("wither", "armor");
    public static final class01134 iW = class04802.N("wither_skeleton");
    public static final class08118<class01134> im = class04802.y("wither_skeleton");
    public static final class01134 iP = class04802.N("wither_skeleton_skull");
    public static final class01134 is = class04802.N("wither_skull");
    public static final class01134 iT = class04802.N("wolf");
    public static final class01134 ib = class04802.N("wolf_armor");
    public static final class01134 ij = class04802.N("wolf_baby");
    public static final class01134 iv = class04802.N("wolf_baby_armor");
    public static final class01134 in = class04802.N("zoglin");
    public static final class01134 it = class04802.N("zoglin_baby");
    public static final class01134 iG = class04802.N("zombie");
    public static final class01134 il = class04802.N("zombie_baby");
    public static final class08118<class01134> id = class04802.y("zombie_baby");
    public static final class01134 iw = class04802.N("zombie_head");
    public static final class01134 ik = class04802.N("zombie_horse");
    public static final class01134 iY = class04802.N("zombie_horse_baby");
    public static final class01134 iQ = class04802.N("zombie_horse", "saddle");
    public static final class01134 iO = class04802.N("zombie_horse_baby", "saddle");
    public static final class08118<class01134> ig = class04802.y("zombie");
    public static final class01134 iI = class04802.N("zombie_villager");
    public static final class01134 iJ = class04802.N("zombie_villager_no_hat");
    public static final class01134 io = class04802.N("zombie_villager_baby");
    public static final class01134 iq = class04802.N("zombie_villager_baby_no_hat");
    public static final class08118<class01134> iK = class04802.y("zombie_villager_baby");
    public static final class08118<class01134> iV = class04802.y("zombie_villager");
    public static final class01134 ie = class04802.N("zombified_piglin");
    public static final class01134 iH = class04802.N("zombified_piglin_baby");
    public static final class08118<class01134> ic = class04802.y("zombified_piglin_baby");
    public static final class08118<class01134> iX = class04802.y("zombified_piglin");
    public static final class01134 ia = class04802.N("zombie_nautilus");

    private static void y(class05904 class059042, CallbackInfoReturnable callbackInfoReturnable) {
        if (class059042.y().indexOf(58) != -1) {
            class01894 class018942 = class01894.N((String)class059042.y());
            callbackInfoReturnable.setReturnValue((Object)new class01134(class018942.R("sign/wall/"), ip));
        }
    }

    public static /* synthetic */ Set y() {
        return iF;
    }

    public static class01134 y(class05904 class059042) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class04802.y(class059042, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01134)callbackInfoReturnable.getReturnValue();
        }
        return class04802.y("sign/wall/" + class059042.y(), ip);
    }

    private static class01134 y(String string, String string2) {
        return new class01134(class01894.y((String)string), string2);
    }

    private static class08118<class01134> y(String string) {
        return new class08118((Object)class04802.N(string, "helmet"), (Object)class04802.N(string, "chestplate"), (Object)class04802.N(string, "leggings"), (Object)class04802.N(string, "boots"));
    }

    private static void N(class05904 class059042, class02019 class020192, CallbackInfoReturnable callbackInfoReturnable) {
        if (class059042.y().indexOf(58) != -1) {
            class01894 class018942 = class01894.N((String)class059042.y());
            callbackInfoReturnable.setReturnValue((Object)new class01134(class018942.N(string -> "hanging_sign/" + string + "/" + class020192.method_15434()), ip));
        }
    }

    private static class01134 N(String string) {
        return class04802.N(string, ip);
    }

    public static class01134 N(class05904 class059042, class02019 class020192) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class04802.N(class059042, class020192, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01134)callbackInfoReturnable.getReturnValue();
        }
        return class04802.y("hanging_sign/" + class059042.y() + "/" + class020192.method_15434(), ip);
    }

    public static class01134 N(class05904 class059042) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class04802.N(class059042, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01134)callbackInfoReturnable.getReturnValue();
        }
        return class04802.y("sign/standing/" + class059042.y(), ip);
    }

    public static Stream<class01134> N() {
        return iF.stream();
    }

    private static class01134 N(String string, String string2) {
        class01134 class011342 = class04802.y(string, string2);
        if (!iF.add(class011342)) {
            throw new IllegalStateException("Duplicate registration for " + String.valueOf(class011342));
        }
        return class011342;
    }

    private static void N(class05904 class059042, CallbackInfoReturnable callbackInfoReturnable) {
        if (class059042.y().indexOf(58) != -1) {
            class01894 class018942 = class01894.N((String)class059042.y());
            callbackInfoReturnable.setReturnValue((Object)new class01134(class018942.R("sign/standing/"), ip));
        }
    }
}

