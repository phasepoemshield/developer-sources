/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03529
 *  minecraft.class07382
 *  minecraft.class07385
 *  minecraft.class07389
 *  minecraft.class07395
 *  minecraft.class07397
 *  minecraft.class07423
 *  minecraft.class07947
 */
package minecraft;

import minecraft.class03529;
import minecraft.class07382;
import minecraft.class07385;
import minecraft.class07389;
import minecraft.class07395;
import minecraft.class07397;
import minecraft.class07423;
import minecraft.class07940;
import minecraft.class07947;

public class class07908 {
    public static final class03529<class07940<Void, Void>> N = class07940.L().N("Server started").y("server/started");
    public static final class03529<class07940<Void, Void>> y = class07940.L().N("Server shutting down").y("server/stopping");
    public static final class03529<class07940<Void, Void>> L = class07940.L().N("Server save started").y("server/saving");
    public static final class03529<class07940<Void, Void>> u = class07940.L().N("Server save completed").y("server/saved");
    public static final class03529<class07940<Void, Void>> i = class07940.L().N("Server activity occurred. Rate limited to 1 notification per 30 seconds").y("server/activity");
    public static final class03529<class07940<class07947, Void>> R = class07940.i().y("player", (class07389<Void>)class07389.E.N()).N("Player joined").y("players/joined");
    public static final class03529<class07940<class07947, Void>> M = class07940.i().y("player", (class07389<Void>)class07389.E.N()).N("Player left").y("players/left");
    public static final class03529<class07940<class07397, Void>> B = class07940.i().y("player", (class07389<Void>)class07389.n.N()).N("Player was oped").y("operators/added");
    public static final class03529<class07940<class07397, Void>> Z = class07940.i().y("player", (class07389<Void>)class07389.n.N()).N("Player was deoped").y("operators/removed");
    public static final class03529<class07940<class07947, Void>> z = class07940.i().y("player", (class07389<Void>)class07389.E.N()).N("Player was added to allowlist").y("allowlist/added");
    public static final class03529<class07940<class07947, Void>> U = class07940.i().y("player", (class07389<Void>)class07389.E.N()).N("Player was removed from allowlist").y("allowlist/removed");
    public static final class03529<class07940<class07385, Void>> E = class07940.i().y("player", (class07389<Void>)class07389.G.N()).N("Ip was added to ip ban list").y("ip_bans/added");
    public static final class03529<class07940<String, Void>> W = class07940.i().y("player", (class07389<Void>)class07389.R).N("Ip was removed from ip ban list").y("ip_bans/removed");
    public static final class03529<class07940<class07395, Void>> m = class07940.i().y("player", (class07389<Void>)class07389.l.N()).N("Player was added to ban list").y("bans/added");
    public static final class03529<class07940<class07947, Void>> P = class07940.i().y("player", (class07389<Void>)class07389.E.N()).N("Player was removed from ban list").y("bans/removed");
    public static final class03529<class07940<class07423<?>, Void>> s = class07940.i().y("gamerule", (class07389<Void>)class07389.s.N()).N("Gamerule was changed").y("gamerules/updated");
    public static final class03529<class07940<class07382, Void>> T = class07940.i().y("status", (class07389<Void>)class07389.m.N()).N("Server status heartbeat").y("server/status");
}

