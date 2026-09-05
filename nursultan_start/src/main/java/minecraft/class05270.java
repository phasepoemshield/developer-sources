/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00392
 *  minecraft.class00456
 *  minecraft.class01042
 *  minecraft.class01247
 *  minecraft.class01929
 *  minecraft.class02794
 *  minecraft.class03748
 *  minecraft.class03764
 *  minecraft.class03776
 *  minecraft.class04995
 *  minecraft.class05001
 *  minecraft.class05934
 *  minecraft.class05964
 *  minecraft.class06984
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class08195
 *  minecraft.class08326
 *  net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class00456;
import minecraft.class01042;
import minecraft.class01247;
import minecraft.class01929;
import minecraft.class02794;
import minecraft.class03748;
import minecraft.class03764;
import minecraft.class03776;
import minecraft.class04995;
import minecraft.class05001;
import minecraft.class05259;
import minecraft.class05264;
import minecraft.class05269;
import minecraft.class05934;
import minecraft.class05964;
import minecraft.class06984;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class08195;
import minecraft.class08326;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05270
extends class05269 {
    static final Logger N = LogUtils.getLogger();
    private static final Pattern Nm = Pattern.compile("^[a-fA-F0-9]{40}$");
    private static final Splitter NP = Splitter.on((char)',').trimResults();
    public static final String y = "management-server-tls-enabled";
    public static final String L = "management-server-tls-keystore";
    public static final String u = "management-server-tls-keystore-password";
    public final boolean i = this.N("online-mode", true);
    public final boolean R = this.N("prevent-proxy-connections", false);
    public final String M = this.N("server-ip", "");
    public final class05259 B = this.y("allow-flight", false);
    public final class05259 Z = this.y("motd", "A Minecraft Server");
    public final boolean z = this.N("enable-code-of-conduct", false);
    public final String U = this.N("bug-report-link", "");
    public final class05259 E = this.y("force-gamemode", false);
    public final class05259 W = this.y("enforce-whitelist", false);
    public final class05259 m = this.y("difficulty", class05270.N(class07086::N, class07086::N), class07086::u, class07086.field_5805);
    public final class05259 P = this.y("gamemode", class05270.N(class07282::N, class07282::N), class07282::y, class07282.field_9215);
    public final String s = this.N("level-name", "world");
    public final int T = this.N("server-port", 25565);
    public final boolean b = this.N("management-server-enabled", false);
    public final String j = this.N("management-server-host", "localhost");
    public final int v = this.N("management-server-port", 0);
    public final String n = this.N("management-server-secret", class00456.N());
    public final boolean t = this.N("management-server-tls-enabled", true);
    public final String G = this.N("management-server-tls-keystore", "");
    public final String l = this.N("management-server-tls-keystore-password", "");
    public final String d = this.N("management-server-allowed-origins", "");
    public final @Nullable Boolean w = this.L("announce-player-achievements");
    public final boolean k = this.N("enable-query", false);
    public final int Y = this.N("query.port", 25565);
    public final boolean Q = this.N("enable-rcon", false);
    public final int O = this.N("rcon.port", 25575);
    public final String g = this.N("rcon.password", "");
    public final boolean I = this.N("hardcore", false);
    public final boolean J = this.N("use-native-transport", true);
    public final class05259 o = this.y("spawn-protection", 16);
    public final class05259 q = this.y("op-permission-level", class05270::N, class05270::N, class06984.i);
    public final class06984 K = (class06984)this.N("function-permission-level", class05270::N, class05270::N, class06984.L);
    public final long V = this.N("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
    public final int e = this.N("max-chained-neighbor-updates", 1000000);
    public final int H = this.N("rate-limit", 0);
    public final class05259 c = this.y("view-distance", 10);
    public final class05259 X = this.y("simulation-distance", 10);
    public final class05259 a = this.y("max-players", 20);
    public final int p = this.N("network-compression-threshold", 256);
    public final boolean F = this.N("broadcast-rcon-to-ops", true);
    public final boolean A = this.N("broadcast-console-to-ops", true);
    public final int f = this.N("max-world-size", n -> class04995.N((int)n, (int)1, (int)29999984), 29999984);
    public final boolean C = this.N("sync-chunk-writes", true);
    public final String S = this.N("region-file-compression", "deflate");
    public final boolean x = this.N("enable-jmx-monitoring", false);
    public final class05259 D = this.y("enable-status", true);
    public final class05259 h = this.y("hide-online-players", false);
    public final class05259 r = this.y("entity-broadcast-range-percentage", string -> class04995.N((int)Integer.parseInt(string), (int)10, (int)1000), 100);
    public final String NN = this.N("text-filtering-config", "");
    public final int Ny = this.N("text-filtering-version", 0);
    public final Optional NL;
    public final class01247 Nu;
    public final class05259 Ni = this.y("player-idle-timeout", 0);
    public final class05259 NR = this.y("status-heartbeat-interval", 0);
    public final class05259 NM = this.y("white-list", false);
    public final boolean NB = this.N("enforce-secure-profile", true);
    public final boolean NZ = this.N("log-ips", true);
    public final class05259 Nz = this.y("pause-when-empty-seconds", 60);
    private final class05264 Ns;
    public final class05934 NU;
    public class05259 NE = this.y("accepts-transfers", false);

    private static class01247 L(String string, String string2) {
        List var2 = NP.splitToList((CharSequence)string);
        List var3 = NP.splitToList((CharSequence)string2);
        return new class01247(var2, var3);
    }

    public class05270(Properties properties) {
        super(properties);
        String string2 = this.N("level-seed", "");
        boolean bl = this.N("generate-structures", true);
        long l = class05934.N((String)string2).orElse(class05934.M());
        this.NU = new class05934(l, bl, false);
        this.Ns = new class05264((JsonObject)this.N("generator-settings", (T string) -> class05001.N((String)(!string.isEmpty() ? string : "{}")), new JsonObject()), (String)this.N("level-type", (T string) -> string.toLowerCase(Locale.ROOT), class05964.N.N().toString()));
        this.NL = class05270.N(this.N("resource-pack-id", ""), this.N("resource-pack", ""), this.N("resource-pack-sha1", ""), this.y("resource-pack-hash"), this.N("require-resource-pack", false), this.N("resource-pack-prompt", ""));
        this.Nu = class05270.L(this.N("initial-enabled-packs", String.join((CharSequence)",", this.y().N().N())), this.N("initial-disabled-packs", String.join((CharSequence)",", this.y().N().y())));
    }

    private static @Nullable class00392 u(String string) {
        if (!Strings.isNullOrEmpty((String)string)) {
            try {
                JsonElement jsonElement = class08326.N((String)string);
                return class03748.N.parse((DynamicOps)class01042.y.N((DynamicOps)JsonOps.INSTANCE), (Object)jsonElement).resultOrPartial(string2 -> N.warn("Failed to parse resource pack prompt '{}': {}", (Object)string, string2)).orElse(null);
            }
            catch (Exception exception) {
                N.warn("Failed to parse resource pack prompt '{}'", (Object)string, (Object)exception);
            }
        }
        return null;
    }

    private class03776 y() {
        return ModPackResourcesUtil.createDefaultDataConfiguration();
    }

    @Override
    protected class05270 y(class01042 class010422, Properties properties) {
        return new class05270(properties);
    }

    public static class05270 N(Path path) {
        return new class05270(class05270.y(path));
    }

    public class03764 N(class01929 class019292) {
        return this.Ns.N(class019292);
    }

    public static String N(class06984 class069842) {
        return Integer.toString(class069842.N().N());
    }

    private static Optional N(String string, String string2, String string3, @Nullable String string4, boolean bl, String string5) {
        UUID uUID;
        String string6;
        if (string2.isEmpty()) {
            return Optional.empty();
        }
        if (!string3.isEmpty()) {
            string6 = string3;
            if (!Strings.isNullOrEmpty((String)string4)) {
                N.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
        } else if (!Strings.isNullOrEmpty((String)string4)) {
            N.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            string6 = string4;
        } else {
            string6 = "";
        }
        if (string6.isEmpty()) {
            N.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
        } else if (!Nm.matcher(string6).matches()) {
            N.warn("Invalid sha1 for resource-pack-sha1");
        }
        class00392 class003922 = class05270.u(string5);
        if (string.isEmpty()) {
            uUID = UUID.nameUUIDFromBytes(string2.getBytes(StandardCharsets.UTF_8));
            N.warn("resource-pack-id missing, using default of {}", (Object)uUID);
        } else {
            try {
                uUID = UUID.fromString(string);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                N.warn("Failed to parse '{}' into UUID", (Object)string);
                return Optional.empty();
            }
        }
        return Optional.of(new class02794(uUID, string2, string6, bl, class003922));
    }

    public static @Nullable class06984 N(String string) {
        try {
            return class06984.N((class08195)class08195.N((int)Integer.parseInt(string)));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }
}

