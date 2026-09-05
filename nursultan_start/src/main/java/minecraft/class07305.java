/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02796
 *  minecraft.class02957
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class05086
 *  minecraft.class05706
 *  minecraft.class06826
 *  minecraft.class06839
 *  minecraft.class07411
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class02796;
import minecraft.class02957;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class05086;
import minecraft.class05706;
import minecraft.class06826;
import minecraft.class06839;
import minecraft.class07320;
import minecraft.class07411;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class07305 {
    public static final class06839<Boolean> N = class07305.N("advance_time", class05086.i, !class07529.Nc);
    public static final class06839<Boolean> y = class07305.N("advance_weather", class05086.i, !class07529.Nc);
    public static final class06839<Boolean> L = class07305.N("allow_entering_nether_using_portals", class05086.M, true);
    public static final class06839<Boolean> u = class07305.N("block_drops", class05086.u, true);
    public static final class06839<Boolean> i = class07305.N("block_explosion_drop_decay", class05086.u, true);
    public static final class06839<Boolean> R = class07305.N("command_blocks_work", class05086.M, true);
    public static final class06839<Boolean> M = class07305.N("command_block_output", class05086.R, true);
    public static final class06839<Boolean> B = class07305.N("drowning_damage", class05086.N, true);
    public static final class06839<Boolean> Z = class07305.N("elytra_movement_check", class05086.N, true);
    public static final class06839<Boolean> z = class07305.N("ender_pearls_vanish_on_death", class05086.N, true);
    public static final class06839<Boolean> U = class07305.N("entity_drops", class05086.u, true);
    public static final class06839<Boolean> E = class07305.N("fall_damage", class05086.N, true);
    public static final class06839<Boolean> W = class07305.N("fire_damage", class05086.N, true);
    public static final class06839<Integer> m = class07305.N("fire_spread_radius_around_player", class05086.i, 128, -1);
    public static final class06839<Boolean> P = class07305.N("forgive_dead_players", class05086.y, true);
    public static final class06839<Boolean> s = class07305.N("freeze_damage", class05086.N, true);
    public static final class06839<Boolean> T = class07305.N("global_sound_events", class05086.M, true);
    public static final class06839<Boolean> b = class07305.N("immediate_respawn", class05086.N, false);
    public static final class06839<Boolean> j = class07305.N("keep_inventory", class05086.N, false);
    public static final class06839<Boolean> v = class07305.N("lava_source_conversion", class05086.i, false);
    public static final class06839<Boolean> n = class07305.N("limited_crafting", class05086.N, false);
    public static final class06839<Boolean> t = class07305.N("locator_bar", class05086.N, true);
    public static final class06839<Boolean> G = class07305.N("log_admin_commands", class05086.R, true);
    public static final class06839<Integer> l = class07305.N("max_block_modifications", class05086.M, 32768, 1);
    public static final class06839<Integer> d = class07305.N("max_command_forks", class05086.M, 65536, 0);
    public static final class06839<Integer> w = class07305.N("max_command_sequence_length", class05086.M, 65536, 0);
    public static final class06839<Integer> k = class07305.N("max_entity_cramming", class05086.y, 24, 0);
    public static final class06839<Integer> Y = class07305.N("max_minecart_speed", class05086.M, 8, 1, 1000, class03767.N((class02957)class03794.u));
    public static final class06839<Integer> Q = class07305.N("max_snow_accumulation_height", class05086.i, 1, 0, 8);
    public static final class06839<Boolean> O = class07305.N("mob_drops", class05086.u, true);
    public static final class06839<Boolean> g = class07305.N("mob_explosion_drop_decay", class05086.u, true);
    public static final class06839<Boolean> I = class07305.N("mob_griefing", class05086.y, true);
    public static final class06839<Boolean> J = class07305.N("natural_health_regeneration", class05086.N, true);
    public static final class06839<Boolean> o = class07305.N("player_movement_check", class05086.N, true);
    public static final class06839<Integer> q = class07305.N("players_nether_portal_creative_delay", class05086.N, 0, 0);
    public static final class06839<Integer> K = class07305.N("players_nether_portal_default_delay", class05086.N, 80, 0);
    public static final class06839<Integer> V = class07305.N("players_sleeping_percentage", class05086.N, 100, 0);
    public static final class06839<Boolean> e = class07305.N("projectiles_can_break_blocks", class05086.u, true);
    public static final class06839<Boolean> H = class07305.N("pvp", class05086.N, true);
    public static final class06839<Boolean> c = class07305.N("raids", class05086.y, true);
    public static final class06839<Integer> X = class07305.N("random_tick_speed", class05086.i, 3, 0);
    public static final class06839<Boolean> a = class07305.N("reduced_debug_info", class05086.M, false);
    public static final class06839<Integer> p = class07305.N("respawn_radius", class05086.N, 10, 0);
    public static final class06839<Boolean> F = class07305.N("send_command_feedback", class05086.R, true);
    public static final class06839<Boolean> A = class07305.N("show_advancement_messages", class05086.R, true);
    public static final class06839<Boolean> f = class07305.N("show_death_messages", class05086.R, true);
    public static final class06839<Boolean> C = class07305.N("spawner_blocks_work", class05086.M, true);
    public static final class06839<Boolean> S = class07305.N("spawn_mobs", class05086.L, true);
    public static final class06839<Boolean> x = class07305.N("spawn_monsters", class05086.L, true);
    public static final class06839<Boolean> D = class07305.N("spawn_patrols", class05086.L, true);
    public static final class06839<Boolean> h = class07305.N("spawn_phantoms", class05086.L, true);
    public static final class06839<Boolean> r = class07305.N("spawn_wandering_traders", class05086.L, true);
    public static final class06839<Boolean> NN = class07305.N("spawn_wardens", class05086.L, true);
    public static final class06839<Boolean> Ny = class07305.N("spectators_generate_chunks", class05086.N, true);
    public static final class06839<Boolean> NL = class07305.N("spread_vines", class05086.i, true);
    public static final class06839<Boolean> Nu = class07305.N("tnt_explodes", class05086.M, true);
    public static final class06839<Boolean> Ni = class07305.N("tnt_explosion_drop_decay", class05086.u, false);
    public static final class06839<Boolean> NR = class07305.N("universal_anger", class05086.y, false);
    public static final class06839<Boolean> NM = class07305.N("water_source_conversion", class05086.i, true);
    private final class06826 NB;

    public class07305(class03767 class037672) {
        this.NB = class06826.N(class04206.Nm.N(class037672).z().map(class03556::N));
    }

    public class07305(class03767 class037672, class06826 class068262) {
        this(class037672);
        this.NB.N(class068262, arg_0 -> ((class06826)this.NB).N(arg_0));
    }

    public <T> String y(class06839<T> class068392) {
        return class068392.N(this.N(class068392));
    }

    public class07305 y(class03767 class037672) {
        return new class07305(class037672, this.NB);
    }

    public static class06839<?> N(class00751<class06839<?>> class007512) {
        return N;
    }

    private static <T> class06839<T> N(String string, class05086 class050862, class07411 class074112, ArgumentType<T> argumentType, Codec<T> codec, T t, class03767 class037672, class07320<T> class073202, ToIntFunction<T> toIntFunction) {
        return (class06839)class00751.N((class00751)class04206.Nm, (String)string, (Object)new class06839(class050862, class074112, argumentType, class073202, codec, toIntFunction, t, class037672));
    }

    private static class06839<Integer> N(String string, class05086 class050862, int n2, int n3, int n4, class03767 class037672) {
        return class07305.N(string, class050862, class07411.field_62399, IntegerArgumentType.integer((int)n3, (int)n4), Codec.intRange((int)n3, (int)n4), n2, class037672, class05706::L, n -> n);
    }

    public static Codec<class07305> N(class03767 class037672) {
        return class06826.N.xmap(class068262 -> new class07305(class037672, (class06826)class068262), class073052 -> class073052.NB);
    }

    public void N(class06826 class068262, @Nullable class02796 class027962) {
        class068262.y().forEach(class068392 -> this.N(class068262, (class06839)class068392, class027962));
    }

    public void N(class07305 class073052, @Nullable class02796 class027962) {
        this.N(class073052.NB, class027962);
    }

    public <T> void N(class06839<T> class068392, T t, @Nullable class02796 class027962) {
        if (!this.NB.N(class068392)) {
            throw new IllegalArgumentException("Tried to set invalid game rule");
        }
        this.NB.N(class068392, t);
        if (class027962 != null) {
            class027962.N(class068392, t);
        }
    }

    public <T> T N(class06839<T> class068392) {
        Object object = this.NB.y(class068392);
        if (object == null) {
            throw new IllegalArgumentException("Tried to access invalid game rule");
        }
        return (T)object;
    }

    public Stream<class06839<?>> N() {
        return this.NB.y().stream();
    }

    private static class06839<Integer> N(String string, class05086 class050862, int n, int n2, int n3) {
        return class07305.N(string, class050862, n, n2, n3, class03767.N());
    }

    private static class06839<Integer> N(String string, class05086 class050862, int n, int n2) {
        return class07305.N(string, class050862, n, n2, Integer.MAX_VALUE, class03767.N());
    }

    private static class06839<Boolean> N(String string, class05086 class050862, boolean bl2) {
        return class07305.N(string, class050862, class07411.field_62400, BoolArgumentType.bool(), Codec.BOOL, bl2, class03767.N(), class05706::y, bl -> bl != false ? 1 : 0);
    }

    public void N(class05706 class057062) {
        this.NB.y().forEach(class068392 -> {
            class057062.N(class068392);
            class068392.N(class057062);
        });
    }

    private <T> void N(class06826 class068262, class06839<T> class068392, @Nullable class02796 class027962) {
        this.N(class068392, Objects.requireNonNull(class068262.y(class068392)), class027962);
    }
}

