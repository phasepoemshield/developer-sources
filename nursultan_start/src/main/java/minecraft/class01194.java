/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;

public final class class01194
extends Record {
    private final int notificationRadius;
    public static final class03529<class01194> N = class01194.N("block_activate");
    public static final class03529<class01194> y = class01194.N("block_attach");
    public static final class03529<class01194> L = class01194.N("block_change");
    public static final class03529<class01194> u = class01194.N("block_close");
    public static final class03529<class01194> i = class01194.N("block_deactivate");
    public static final class03529<class01194> R = class01194.N("block_destroy");
    public static final class03529<class01194> M = class01194.N("block_detach");
    public static final class03529<class01194> B = class01194.N("block_open");
    public static final class03529<class01194> Z = class01194.N("block_place");
    public static final class03529<class01194> z = class01194.N("container_close");
    public static final class03529<class01194> U = class01194.N("container_open");
    public static final class03529<class01194> E = class01194.N("drink");
    public static final class03529<class01194> W = class01194.N("eat");
    public static final class03529<class01194> m = class01194.N("elytra_glide");
    public static final class03529<class01194> P = class01194.N("entity_damage");
    public static final class03529<class01194> s = class01194.N("entity_die");
    public static final class03529<class01194> T = class01194.N("entity_dismount");
    public static final class03529<class01194> b = class01194.N("entity_interact");
    public static final class03529<class01194> j = class01194.N("entity_mount");
    public static final class03529<class01194> v = class01194.N("entity_place");
    public static final class03529<class01194> n = class01194.N("entity_action");
    public static final class03529<class01194> t = class01194.N("equip");
    public static final class03529<class01194> G = class01194.N("explode");
    public static final class03529<class01194> l = class01194.N("flap");
    public static final class03529<class01194> d = class01194.N("fluid_pickup");
    public static final class03529<class01194> w = class01194.N("fluid_place");
    public static final class03529<class01194> k = class01194.N("hit_ground");
    public static final class03529<class01194> Y = class01194.N("instrument_play");
    public static final class03529<class01194> Q = class01194.N("item_interact_finish");
    public static final class03529<class01194> O = class01194.N("item_interact_start");
    public static final class03529<class01194> g = class01194.N("jukebox_play", 10);
    public static final class03529<class01194> I = class01194.N("jukebox_stop_play", 10);
    public static final class03529<class01194> J = class01194.N("lightning_strike");
    public static final class03529<class01194> o = class01194.N("note_block_play");
    public static final class03529<class01194> q = class01194.N("prime_fuse");
    public static final class03529<class01194> K = class01194.N("projectile_land");
    public static final class03529<class01194> V = class01194.N("projectile_shoot");
    public static final class03529<class01194> e = class01194.N("sculk_sensor_tendrils_clicking");
    public static final class03529<class01194> H = class01194.N("shear");
    public static final class03529<class01194> c = class01194.N("shriek", 32);
    public static final class03529<class01194> X = class01194.N("splash");
    public static final class03529<class01194> a = class01194.N("step");
    public static final class03529<class01194> p = class01194.N("swim");
    public static final class03529<class01194> F = class01194.N("teleport");
    public static final class03529<class01194> A = class01194.N("unequip");
    public static final class03529<class01194> f = class01194.N("resonate_1");
    public static final class03529<class01194> C = class01194.N("resonate_2");
    public static final class03529<class01194> S = class01194.N("resonate_3");
    public static final class03529<class01194> x = class01194.N("resonate_4");
    public static final class03529<class01194> D = class01194.N("resonate_5");
    public static final class03529<class01194> h = class01194.N("resonate_6");
    public static final class03529<class01194> r = class01194.N("resonate_7");
    public static final class03529<class01194> NN = class01194.N("resonate_8");
    public static final class03529<class01194> Ny = class01194.N("resonate_9");
    public static final class03529<class01194> NL = class01194.N("resonate_10");
    public static final class03529<class01194> Nu = class01194.N("resonate_11");
    public static final class03529<class01194> Ni = class01194.N("resonate_12");
    public static final class03529<class01194> NR = class01194.N("resonate_13");
    public static final class03529<class01194> NM = class01194.N("resonate_14");
    public static final class03529<class01194> NB = class01194.N("resonate_15");
    public static final int NZ = 16;
    public static final Codec<class03556<class01194>> Nz = class03539.N((class05946)class04227.c);

    public class01194(int n) {
        this.notificationRadius = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01194.class, "notificationRadius", "notificationRadius"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01194.class, "notificationRadius", "notificationRadius"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01194.class, "notificationRadius", "notificationRadius"}, this);
    }

    private static class03529<class01194> N(String string, int n) {
        return class00751.y((class00751)class04206.N, (class01894)class01894.y((String)string), (Object)((Object)new class01194(n)));
    }

    public int N() {
        return this.notificationRadius;
    }

    public static class03556<class01194> N(class00751<class01194> class007512) {
        return N;
    }

    private static class03529<class01194> N(String string) {
        return class01194.N(string, 16);
    }
}

