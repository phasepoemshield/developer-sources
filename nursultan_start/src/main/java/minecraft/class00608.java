/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02584
 *  minecraft.class04206
 *  minecraft.class05359
 *  minecraft.class06024
 *  minecraft.class06731
 *  minecraft.class06756
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class08165
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00586;
import minecraft.class00588;
import minecraft.class00592;
import minecraft.class00607;
import minecraft.class00621;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02584;
import minecraft.class04206;
import minecraft.class05359;
import minecraft.class06024;
import minecraft.class06731;
import minecraft.class06756;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class08165;

public interface class00608 {
    public static final class00607<Integer> N = class00608.N("visual/fog_color", class00607.N(class00588.i).N(0).L().N());
    public static final class00607<Float> y = class00608.N("visual/fog_start_distance", class00607.N(class00588.L).N(Float.valueOf(0.0f)).L().N());
    public static final class00607<Float> L = class00608.N("visual/fog_end_distance", class00607.N(class00588.L).N(Float.valueOf(1024.0f)).N((class06756<Float>)class06756.y).L().N());
    public static final class00607<Float> u = class00608.N("visual/sky_fog_end_distance", class00607.N(class00588.L).N(Float.valueOf(512.0f)).N((class06756<Float>)class06756.y).L().N());
    public static final class00607<Float> i = class00608.N("visual/cloud_fog_end_distance", class00607.N(class00588.L).N(Float.valueOf(2048.0f)).N((class06756<Float>)class06756.y).L().N());
    public static final class00607<Integer> R = class00608.N("visual/water_fog_color", class00607.N(class00588.i).N(-16448205).L().N());
    public static final class00607<Float> M = class00608.N("visual/water_fog_start_distance", class00607.N(class00588.L).N(Float.valueOf(-8.0f)).L().N());
    public static final class00607<Float> B = class00608.N("visual/water_fog_end_distance", class00607.N(class00588.L).N(Float.valueOf(96.0f)).N((class06756<Float>)class06756.y).L().N());
    public static final class00607<Integer> Z = class00608.N("visual/sky_color", class00607.N(class00588.i).N(0).L().N());
    public static final class00607<Integer> z = class00608.N("visual/sunrise_sunset_color", class00607.N(class00588.R).N(0).L().N());
    public static final class00607<Integer> U = class00608.N("visual/cloud_color", class00607.N(class00588.R).N(0).L().N());
    public static final class00607<Float> E = class00608.N("visual/cloud_height", class00607.N(class00588.L).N(Float.valueOf(192.33f)).L().N());
    public static final class00607<Float> W = class00608.N("visual/sun_angle", class00607.N(class00588.u).N(Float.valueOf(0.0f)).L().N());
    public static final class00607<Float> m = class00608.N("visual/moon_angle", class00607.N(class00588.u).N(Float.valueOf(0.0f)).L().N());
    public static final class00607<Float> P = class00608.N("visual/star_angle", class00607.N(class00588.u).N(Float.valueOf(0.0f)).L().N());
    public static final class00607<class08165> s = class00608.N("visual/moon_phase", class00607.N(class00588.M).N(class08165.field_63425).N());
    public static final class00607<Float> T = class00608.N("visual/star_brightness", class00607.N(class00588.L).N(Float.valueOf(0.0f)).N((class06756<Float>)class06756.N).L().N());
    public static final class00607<Integer> b = class00608.N("visual/sky_light_color", class00607.N(class00588.i).N(-1).L().N());
    public static final class00607<Float> j = class00608.N("visual/sky_light_factor", class00607.N(class00588.L).N(Float.valueOf(1.0f)).N((class06756<Float>)class06756.N).L().N());
    public static final class00607<class07126> v = class00608.N("visual/default_dripstone_particle", class00607.N(class00588.z).N((class07126)class07107.NF).N());
    public static final class00607<List<class06024>> n = class00608.N("visual/ambient_particles", class00607.N(class00588.U).N(List.of()).N());
    public static final class00607<class00621> t = class00608.N("audio/background_music", class00607.N(class00588.E).N(class00621.N).N());
    public static final class00607<Float> G = class00608.N("audio/music_volume", class00607.N(class00588.L).N(Float.valueOf(1.0f)).N((class06756<Float>)class06756.N).N());
    public static final class00607<class06731> l = class00608.N("audio/ambient_sounds", class00607.N(class00588.W).N(class06731.N).N());
    public static final class00607<Boolean> d = class00608.N("audio/firefly_bush_sounds", class00607.N(class00588.N).N(false).N());
    public static final class00607<Float> w = class00608.N("gameplay/sky_light_level", class00607.N(class00588.L).N(Float.valueOf(15.0f)).N((class06756<Float>)class06756.N((float)0.0f, (float)15.0f)).y().N());
    public static final class00607<Boolean> k = class00608.N("gameplay/can_start_raid", class00607.N(class00588.N).N(true));
    public static final class00607<Boolean> Y = class00608.N("gameplay/water_evaporates", class00607.N(class00588.N).N(false).N());
    public static final class00607<class00586> Q = class00608.N("gameplay/bed_rule", class00607.N(class00588.Z).N(class00586.N));
    public static final class00607<Boolean> O = class00608.N("gameplay/respawn_anchor_works", class00607.N(class00588.N).N(false));
    public static final class00607<Boolean> g = class00608.N("gameplay/nether_portal_spawns_piglin", class00607.N(class00588.N).N(false));
    public static final class00607<Boolean> I = class00608.N("gameplay/fast_lava", class00607.N(class00588.N).N(false).y().N());
    public static final class00607<Boolean> J = class00608.N("gameplay/increased_fire_burnout", class00607.N(class00588.N).N(false));
    public static final class00607<class02584> o = class00608.N("gameplay/eyeblossom_open", class00607.N(class00588.y).N(class02584.field_52396));
    public static final class00607<Float> q = class00608.N("gameplay/turtle_egg_hatch_chance", class00607.N(class00588.L).N(Float.valueOf(0.0f)).N((class06756<Float>)class06756.N));
    public static final class00607<Boolean> K = class00608.N("gameplay/piglins_zombify", class00607.N(class00588.N).N(true).N());
    public static final class00607<Boolean> V = class00608.N("gameplay/snow_golem_melts", class00607.N(class00588.N).N(false));
    public static final class00607<Boolean> e = class00608.N("gameplay/creaking_active", class00607.N(class00588.N).N(false).N());
    public static final class00607<Float> H = class00608.N("gameplay/surface_slime_spawn_chance", class00607.N(class00588.L).N(Float.valueOf(0.0f)).N((class06756<Float>)class06756.N));
    public static final class00607<Float> c = class00608.N("gameplay/cat_waking_up_gift_chance", class00607.N(class00588.L).N(Float.valueOf(0.0f)).N((class06756<Float>)class06756.N));
    public static final class00607<Boolean> X = class00608.N("gameplay/bees_stay_in_hive", class00607.N(class00588.N).N(false));
    public static final class00607<Boolean> a = class00608.N("gameplay/monsters_burn", class00607.N(class00588.N).N(false));
    public static final class00607<Boolean> p = class00608.N("gameplay/can_pillager_patrol_spawn", class00607.N(class00588.N).N(true));
    public static final class00607<class05359> F = class00608.N("gameplay/villager_activity", class00607.N(class00588.B).N(class05359.y));
    public static final class00607<class05359> A = class00608.N("gameplay/baby_villager_activity", class00607.N(class00588.B).N(class05359.y));
    public static final Codec<class00607<?>> f = class04206.Nc.T();

    private static <Value> class00607<Value> N(String string, class00592<Value> class005922) {
        class00607<Value> class006072 = class005922.u();
        class00751.N((class00751)class04206.Nc, (class01894)class01894.y((String)string), class006072);
        return class006072;
    }

    public static class00607<?> N(class00751<class00607<?>> class007512) {
        return O;
    }
}

