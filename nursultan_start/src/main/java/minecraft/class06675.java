/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04922
 *  minecraft.class06541
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04922;
import minecraft.class06541;
import minecraft.class06640;

public class class06675 {
    private static final Map<String, class06675> P = Maps.newHashMap();
    private static final Map<String, class06675> s = Maps.newHashMap();
    public static final Codec<class06675> N = Codec.STRING.comapFlatMap(string -> class06675.y(string).map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + string)), class06675::y);
    public static final class06675 y = class06675.N("dummy");
    public static final class06675 L = class06675.N("trigger");
    public static final class06675 u = class06675.N("deathCount");
    public static final class06675 i = class06675.N("playerKillCount");
    public static final class06675 R = class06675.N("totalKillCount");
    public static final class06675 M = class06675.N("health", true, class06640.field_1471);
    public static final class06675 B = class06675.N("food", true, class06640.field_1472);
    public static final class06675 Z = class06675.N("air", true, class06640.field_1472);
    public static final class06675 z = class06675.N("armor", true, class06640.field_1472);
    public static final class06675 U = class06675.N("xp", true, class06640.field_1472);
    public static final class06675 E = class06675.N("level", true, class06640.field_1472);
    public static final class06675[] W = new class06675[]{class06675.N("teamkill." + class06541.field_1074.R()), class06675.N("teamkill." + class06541.field_1058.R()), class06675.N("teamkill." + class06541.field_1077.R()), class06675.N("teamkill." + class06541.field_1062.R()), class06675.N("teamkill." + class06541.field_1079.R()), class06675.N("teamkill." + class06541.field_1064.R()), class06675.N("teamkill." + class06541.field_1065.R()), class06675.N("teamkill." + class06541.field_1080.R()), class06675.N("teamkill." + class06541.field_1063.R()), class06675.N("teamkill." + class06541.field_1078.R()), class06675.N("teamkill." + class06541.field_1060.R()), class06675.N("teamkill." + class06541.field_1075.R()), class06675.N("teamkill." + class06541.field_1061.R()), class06675.N("teamkill." + class06541.field_1076.R()), class06675.N("teamkill." + class06541.field_1054.R()), class06675.N("teamkill." + class06541.field_1068.R())};
    public static final class06675[] m = new class06675[]{class06675.N("killedByTeam." + class06541.field_1074.R()), class06675.N("killedByTeam." + class06541.field_1058.R()), class06675.N("killedByTeam." + class06541.field_1077.R()), class06675.N("killedByTeam." + class06541.field_1062.R()), class06675.N("killedByTeam." + class06541.field_1079.R()), class06675.N("killedByTeam." + class06541.field_1064.R()), class06675.N("killedByTeam." + class06541.field_1065.R()), class06675.N("killedByTeam." + class06541.field_1080.R()), class06675.N("killedByTeam." + class06541.field_1063.R()), class06675.N("killedByTeam." + class06541.field_1078.R()), class06675.N("killedByTeam." + class06541.field_1060.R()), class06675.N("killedByTeam." + class06541.field_1075.R()), class06675.N("killedByTeam." + class06541.field_1061.R()), class06675.N("killedByTeam." + class06541.field_1076.R()), class06675.N("killedByTeam." + class06541.field_1054.R()), class06675.N("killedByTeam." + class06541.field_1068.R())};
    private final String T;
    private final boolean b;
    private final class06640 j;

    public boolean L() {
        return this.b;
    }

    protected class06675(String string, boolean bl, class06640 class066402) {
        this.T = string;
        this.b = bl;
        this.j = class066402;
        s.put(string, this);
    }

    protected class06675(String string) {
        this(string, false, class06640.field_1472);
    }

    public class06640 u() {
        return this.j;
    }

    public String y() {
        return this.T;
    }

    public static Optional<class06675> y(String string) {
        class06675 class066752 = s.get(string);
        if (class066752 != null) {
            return Optional.of(class066752);
        }
        int n = string.indexOf(58);
        if (n < 0) {
            return Optional.empty();
        }
        return class04206.G.y(class01894.N((String)string.substring(0, n), (char)'.')).flatMap(class049222 -> class06675.N(class049222, class01894.N((String)string.substring(n + 1), (char)'.')));
    }

    public static Set<String> N() {
        return ImmutableSet.copyOf(P.keySet());
    }

    public static class06675 N(String string) {
        return class06675.N(string, false, class06640.field_1472);
    }

    public static class06675 N(String string, boolean bl, class06640 class066402) {
        class06675 class066752 = new class06675(string, bl, class066402);
        P.put(string, class066752);
        return class066752;
    }

    private static <T> Optional<class06675> N(class04922<T> class049222, class01894 class018942) {
        return class049222.y().y(class018942).map(arg_0 -> class049222.y(arg_0));
    }
}

