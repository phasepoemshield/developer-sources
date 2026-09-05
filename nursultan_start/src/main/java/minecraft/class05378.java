/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 *  minecraft.class00143
 *  minecraft.class00717
 *  minecraft.class00751
 *  minecraft.class01238
 *  minecraft.class01487
 *  minecraft.class01491
 *  minecraft.class01894
 *  minecraft.class04051
 *  minecraft.class04206
 *  minecraft.class05779
 *  minecraft.class06018
 *  minecraft.class06244
 *  minecraft.class06289
 *  minecraft.class06537
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import minecraft.class00143;
import minecraft.class00717;
import minecraft.class00751;
import minecraft.class01238;
import minecraft.class01487;
import minecraft.class01491;
import minecraft.class01894;
import minecraft.class04051;
import minecraft.class04206;
import minecraft.class05352;
import minecraft.class05779;
import minecraft.class06018;
import minecraft.class06244;
import minecraft.class06289;
import minecraft.class06537;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08036;

public class class05378<U> {
    public static final class05378<Void> N = class05378.N("dummy");
    public static final class05378<class06289> y = class05378.N("home", class06289.y);
    public static final class05378<class06289> L = class05378.N("job_site", class06289.y);
    public static final class05378<class06289> u = class05378.N("potential_job_site", class06289.y);
    public static final class05378<class06289> i = class05378.N("meeting_point", class06289.y);
    public static final class05378<List<class06289>> R = class05378.N("secondary_job_site");
    public static final class05378<List<class07438>> M = class05378.N("mobs");
    public static final class05378<class04051> B = class05378.N("visible_mobs");
    public static final class05378<List<class07438>> Z = class05378.N("visible_villager_babies");
    public static final class05378<List<class08036>> z = class05378.N("nearest_players");
    public static final class05378<class08036> U = class05378.N("nearest_visible_player");
    public static final class05378<class08036> E = class05378.N("nearest_visible_targetable_player");
    public static final class05378<List<class08036>> W = class05378.N("nearest_visible_targetable_players");
    public static final class05378<class05352> m = class05378.N("walk_target");
    public static final class05378<class05779> P = class05378.N("look_target");
    public static final class05378<class07438> s = class05378.N("attack_target");
    public static final class05378<Boolean> T = class05378.N("attack_cooling_down");
    public static final class05378<class07438> b = class05378.N("interaction_target");
    public static final class05378<class07077> j = class05378.N("breed_target");
    public static final class05378<class07049> v = class05378.N("ride_target");
    public static final class05378<class00143> n = class05378.N("path");
    public static final class05378<List<class06289>> t = class05378.N("interactable_doors");
    public static final class05378<Set<class06289>> G = class05378.N("doors_to_close");
    public static final class05378<class07209> l = class05378.N("nearest_bed");
    public static final class05378<class07072> d = class05378.N("hurt_by");
    public static final class05378<class07438> w = class05378.N("hurt_by_entity");
    public static final class05378<class07438> k = class05378.N("avoid_target");
    public static final class05378<class07438> Y = class05378.N("nearest_hostile");
    public static final class05378<class07438> Q = class05378.N("nearest_attackable");
    public static final class05378<class06289> O = class05378.N("hiding_place");
    public static final class05378<Long> g = class05378.N("heard_bell_time");
    public static final class05378<Long> I = class05378.N("cant_reach_walk_target_since");
    public static final class05378<Boolean> J = class05378.N("golem_detected_recently", Codec.BOOL);
    public static final class05378<Boolean> o = class05378.N("danger_detected_recently", Codec.BOOL);
    public static final class05378<Long> q = class05378.N("last_slept", Codec.LONG);
    public static final class05378<Long> K = class05378.N("last_woken", Codec.LONG);
    public static final class05378<Long> V = class05378.N("last_worked_at_poi", Codec.LONG);
    public static final class05378<class07438> e = class05378.N("nearest_visible_adult");
    public static final class05378<class00717> H = class05378.N("nearest_visible_wanted_item");
    public static final class05378<class07079> c = class05378.N("nearest_visible_nemesis");
    public static final class05378<Integer> X = class05378.N("play_dead_ticks", Codec.INT);
    public static final class05378<class08036> a = class05378.N("tempting_player");
    public static final class05378<Integer> p = class05378.N("temptation_cooldown_ticks", Codec.INT);
    public static final class05378<Integer> F = class05378.N("gaze_cooldown_ticks", Codec.INT);
    public static final class05378<Boolean> A = class05378.N("is_tempted", Codec.BOOL);
    public static final class05378<Integer> f = class05378.N("long_jump_cooling_down", Codec.INT);
    public static final class05378<Boolean> C = class05378.N("long_jump_mid_jump");
    public static final class05378<Boolean> S = class05378.N("has_hunting_cooldown", Codec.BOOL);
    public static final class05378<Integer> x = class05378.N("ram_cooldown_ticks", Codec.INT);
    public static final class05378<class06889> D = class05378.N("ram_target");
    public static final class05378<class06244> h = class05378.N("is_in_water", class06244.field_51563);
    public static final class05378<class06244> r = class05378.N("is_pregnant", class06244.field_51563);
    public static final class05378<Boolean> NN = class05378.N("is_panicking", Codec.BOOL);
    public static final class05378<List<UUID>> Ny = class05378.N("unreachable_tongue_targets");
    public static final class05378<Set<class06289>> NL = class05378.N("visited_block_positions", class06289.y.listOf().xmap(Sets::newHashSet, Lists::newArrayList));
    public static final class05378<Set<class06289>> Nu = class05378.N("unreachable_transport_block_positions", class06289.y.listOf().xmap(Sets::newHashSet, Lists::newArrayList));
    public static final class05378<Integer> Ni = class05378.N("transport_items_cooldown_ticks");
    public static final class05378<Integer> NR = class05378.N("charge_cooldown_ticks", Codec.INT);
    public static final class05378<Integer> NM = class05378.N("attack_target_cooldown", Codec.INT);
    public static final class05378<Integer> NB = class05378.N("spear_fleeing_time");
    public static final class05378<class06889> NZ = class05378.N("spear_fleeing_position");
    public static final class05378<class06889> Nz = class05378.N("spear_charge_position");
    public static final class05378<Integer> NU = class05378.N("spear_engage_time");
    public static final class05378<class06537> NE = class05378.N("spear_status");
    public static final class05378<UUID> NW = class05378.N("angry_at", class01487.N);
    public static final class05378<Boolean> Nm = class05378.N("universal_anger", Codec.BOOL);
    public static final class05378<Boolean> NP = class05378.N("admiring_item", Codec.BOOL);
    public static final class05378<Integer> Ns = class05378.N("time_trying_to_reach_admire_item");
    public static final class05378<Boolean> NT = class05378.N("disable_walk_to_admire_item");
    public static final class05378<Boolean> Nb = class05378.N("admiring_disabled", Codec.BOOL);
    public static final class05378<Boolean> Nj = class05378.N("hunted_recently", Codec.BOOL);
    public static final class05378<class07209> Nv = class05378.N("celebrate_location");
    public static final class05378<Boolean> Nn = class05378.N("dancing");
    public static final class05378<class06018> Nt = class05378.N("nearest_visible_huntable_hoglin");
    public static final class05378<class06018> NG = class05378.N("nearest_visible_baby_hoglin");
    public static final class05378<class08036> Nl = class05378.N("nearest_targetable_player_not_wearing_gold");
    public static final class05378<List<class01238>> Nd = class05378.N("nearby_adult_piglins");
    public static final class05378<List<class01238>> Nw = class05378.N("nearest_visible_adult_piglins");
    public static final class05378<List<class06018>> Nk = class05378.N("nearest_visible_adult_hoglins");
    public static final class05378<class01238> NY = class05378.N("nearest_visible_adult_piglin");
    public static final class05378<class07438> NQ = class05378.N("nearest_visible_zombified");
    public static final class05378<Integer> NO = class05378.N("visible_adult_piglin_count");
    public static final class05378<Integer> Ng = class05378.N("visible_adult_hoglin_count");
    public static final class05378<class08036> NI = class05378.N("nearest_player_holding_wanted_item");
    public static final class05378<Boolean> NJ = class05378.N("ate_recently");
    public static final class05378<class07209> No = class05378.N("nearest_repellent");
    public static final class05378<Boolean> Nq = class05378.N("pacified");
    public static final class05378<class07438> NK = class05378.N("roar_target");
    public static final class05378<class07209> NV = class05378.N("disturbance_location");
    public static final class05378<class06244> Ne = class05378.N("recent_projectile", class06244.field_51563);
    public static final class05378<class06244> NH = class05378.N("is_sniffing", class06244.field_51563);
    public static final class05378<class06244> Nc = class05378.N("is_emerging", class06244.field_51563);
    public static final class05378<class06244> NX = class05378.N("roar_sound_delay", class06244.field_51563);
    public static final class05378<class06244> Na = class05378.N("dig_cooldown", class06244.field_51563);
    public static final class05378<class06244> Np = class05378.N("roar_sound_cooldown", class06244.field_51563);
    public static final class05378<class06244> NF = class05378.N("sniff_cooldown", class06244.field_51563);
    public static final class05378<class06244> NA = class05378.N("touch_cooldown", class06244.field_51563);
    public static final class05378<class06244> Nf = class05378.N("vibration_cooldown", class06244.field_51563);
    public static final class05378<class06244> NC = class05378.N("sonic_boom_cooldown", class06244.field_51563);
    public static final class05378<class06244> NS = class05378.N("sonic_boom_sound_cooldown", class06244.field_51563);
    public static final class05378<class06244> Nx = class05378.N("sonic_boom_sound_delay", class06244.field_51563);
    public static final class05378<UUID> ND = class05378.N("liked_player", class01487.N);
    public static final class05378<class06289> Nh = class05378.N("liked_noteblock", class06289.y);
    public static final class05378<Integer> Nr = class05378.N("liked_noteblock_cooldown_ticks", Codec.INT);
    public static final class05378<Integer> yN = class05378.N("item_pickup_cooldown_ticks", Codec.INT);
    public static final class05378<List<class06289>> yy = class05378.N("sniffer_explored_positions", Codec.list((Codec)class06289.y));
    public static final class05378<class07209> yL = class05378.N("sniffer_sniffing_target");
    public static final class05378<Boolean> yu = class05378.N("sniffer_digging");
    public static final class05378<Boolean> yi = class05378.N("sniffer_happy");
    public static final class05378<class06244> yR = class05378.N("breeze_jump_cooldown", class06244.field_51563);
    public static final class05378<class06244> yM = class05378.N("breeze_shoot", class06244.field_51563);
    public static final class05378<class06244> yB = class05378.N("breeze_shoot_charging", class06244.field_51563);
    public static final class05378<class06244> yZ = class05378.N("breeze_shoot_recover", class06244.field_51563);
    public static final class05378<class06244> yz = class05378.N("breeze_shoot_cooldown", class06244.field_51563);
    public static final class05378<class06244> yU = class05378.N("breeze_jump_inhaling", class06244.field_51563);
    public static final class05378<class07209> yE = class05378.N("breeze_jump_target", class07209.field_25064);
    public static final class05378<class06244> yW = class05378.N("breeze_leaving_water", class06244.field_51563);
    private final Optional<Codec<class01491<U>>> ym;

    public class05378(Optional<Codec<U>> optional) {
        this.ym = optional.map(class01491::N);
    }

    public String toString() {
        return class04206.k.y((Object)this).toString();
    }

    private static <U> class05378<U> N(String string, Codec<U> codec) {
        return (class05378)class00751.N((class00751)class04206.k, (class01894)class01894.y((String)string), new class05378<U>(Optional.of(codec)));
    }

    private static <U> class05378<U> N(String string) {
        return (class05378)class00751.N((class00751)class04206.k, (class01894)class01894.y((String)string), new class05378<U>(Optional.empty()));
    }

    public Optional<Codec<class01491<U>>> N() {
        return this.ym;
    }
}

