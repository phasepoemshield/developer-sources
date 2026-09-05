/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryPropertyContainer
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01487
 *  minecraft.class03497
 *  minecraft.class05216
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01487;
import minecraft.class02087;
import minecraft.class02096;
import minecraft.class02101;
import minecraft.class02108;
import minecraft.class03497;
import minecraft.class05216;
import minecraft.class06338;

public final class class02117<T>
extends Record {
    private final String id;
    private final String exportKey;
    private final Codec<T> codec;
    private final class02101<T> exporter;
    private static final DateTimeFormatter K = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
    public static final class02117<String> N = class02117.b("user_id", "userId");
    public static final class02117<String> y = class02117.b("client_id", "clientId");
    public static final class02117<UUID> L = class02117.i("minecraft_session_id", "deviceSessionId");
    public static final class02117<String> u = class02117.b("game_version", "buildDisplayName");
    public static final class02117<String> i = class02117.b("operating_system", "buildPlatform");
    public static final class02117<String> R = class02117.b("platform", "platform");
    public static final class02117<Boolean> M = class02117.M("client_modded", "clientModded");
    public static final class02117<String> B = class02117.b("launcher_name", "launcherName");
    public static final class02117<UUID> Z = class02117.i("world_session_id", "worldSessionId");
    public static final class02117<Boolean> z = class02117.M("server_modded", "serverModded");
    public static final class02117<class02087> U = class02117.N("server_type", "serverType", class02087.field_41493, (telemetryPropertyContainer, string, class020872) -> telemetryPropertyContainer.addProperty(string, class020872.method_15434()));
    public static final class02117<Boolean> E = class02117.M("opt_in", "isOptional");
    public static final class02117<Instant> W = class02117.N("event_timestamp_utc", "eventTimestampUtc", class06338.l, (telemetryPropertyContainer, string, instant) -> telemetryPropertyContainer.addProperty(string, K.format((TemporalAccessor)instant)));
    public static final class02117<class02096> m = class02117.N("game_mode", "playerGameMode", class02096.field_41486, (telemetryPropertyContainer, string, class020962) -> telemetryPropertyContainer.addProperty(string, class020962.N()));
    public static final class02117<String> P = class02117.b("realms_map_content", "realmsMapContent");
    public static final class02117<Integer> s = class02117.c("seconds_since_load", "secondsSinceLoad");
    public static final class02117<Integer> T = class02117.c("ticks_since_load", "ticksSinceLoad");
    public static final class02117<LongList> b = class02117.M("frame_rate_samples", "serializedFpsSamples");
    public static final class02117<LongList> j = class02117.M("render_time_samples", "serializedRenderTimeSamples");
    public static final class02117<LongList> v = class02117.M("used_memory_samples", "serializedUsedMemoryKbSamples");
    public static final class02117<Integer> n = class02117.c("number_of_samples", "numSamples");
    public static final class02117<Integer> t = class02117.c("render_distance", "renderDistance");
    public static final class02117<Integer> G = class02117.c("dedicated_memory_kb", "dedicatedMemoryKb");
    public static final class02117<Integer> l = class02117.c("world_load_time_ms", "worldLoadTimeMs");
    public static final class02117<Boolean> d = class02117.M("new_world", "newWorld");
    public static final class02117<class03497> w = class02117.R("load_time_total_time_ms", "loadTimeTotalTimeMs");
    public static final class02117<class03497> k = class02117.R("load_time_pre_window_ms", "loadTimePreWindowMs");
    public static final class02117<class03497> Y = class02117.R("load_time_bootstrap_ms", "loadTimeBootstrapMs");
    public static final class02117<class03497> Q = class02117.R("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
    public static final class02117<String> O = class02117.b("advancement_id", "advancementId");
    public static final class02117<Long> g = class02117.d("advancement_game_time", "advancementGameTime");

    public static class02117<Integer> L(String string, String string2) {
        return class02117.N(string, string2, Codec.INT, TelemetryPropertyContainer::addProperty);
    }

    public String L() {
        return this.exportKey;
    }

    public static class02117<LongList> M(String string2, String string3) {
        return class02117.N(string2, string3, Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()), (telemetryPropertyContainer, string, longList) -> telemetryPropertyContainer.addProperty(string, longList.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";"))));
    }

    public class02117(String string, String string2, Codec<T> codec, class02101<T> class021012) {
        this.id = string;
        this.exportKey = string2;
        this.codec = codec;
        this.exporter = class021012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02117.class, "id;exportKey;codec;exporter", "id", "exportKey", "codec", "exporter"}, this, object);
    }

    public String toString() {
        return "TelemetryProperty[" + this.id + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02117.class, "id;exportKey;codec;exporter", "id", "exportKey", "codec", "exporter"}, this);
    }

    public static class02117<UUID> i(String string2, String string3) {
        return class02117.N(string2, string3, class01487.u, (telemetryPropertyContainer, string, uUID) -> telemetryPropertyContainer.addProperty(string, uUID.toString()));
    }

    public class02101<T> i() {
        return this.exporter;
    }

    public static class02117<Long> u(String string, String string2) {
        return class02117.N(string, string2, Codec.LONG, TelemetryPropertyContainer::addProperty);
    }

    public Codec<T> u() {
        return this.codec;
    }

    public String y() {
        return this.id;
    }

    public static class02117<String> y(String string, String string2) {
        return class02117.N(string, string2, Codec.STRING, TelemetryPropertyContainer::addProperty);
    }

    public static <T> class02117<T> N(String string, String string2, Codec<T> codec, class02101<T> class021012) {
        return new class02117<T>(string, string2, codec, class021012);
    }

    public static class02117<Boolean> N(String string, String string2) {
        return class02117.N(string, string2, Codec.BOOL, TelemetryPropertyContainer::addProperty);
    }

    public class05216 N() {
        return class00392.L((String)("telemetry.property." + this.id + ".title"));
    }

    public void N(class02108 class021082, TelemetryPropertyContainer telemetryPropertyContainer) {
        Object t = class021082.N(this);
        if (t != null) {
            this.exporter.apply(telemetryPropertyContainer, this.exportKey, t);
        } else {
            telemetryPropertyContainer.addNullProperty(this.exportKey);
        }
    }

    public static class02117<class03497> R(String string2, String string3) {
        return class02117.N(string2, string3, class03497.N, (telemetryPropertyContainer, string, class034972) -> telemetryPropertyContainer.addProperty(string, class034972.N()));
    }

    public static class02117<String> b(String string, String string2) {
        return class02117.N(string, string2, Codec.STRING, TelemetryPropertyContainer::addProperty);
    }

    public static class02117<Integer> c(String string, String string2) {
        return class02117.N(string, string2, Codec.INT, TelemetryPropertyContainer::addProperty);
    }

    public static class02117<Long> d(String string, String string2) {
        return class02117.N(string, string2, Codec.LONG, TelemetryPropertyContainer::addProperty);
    }
}

