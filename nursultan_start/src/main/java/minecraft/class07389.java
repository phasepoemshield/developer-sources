/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class05033
 *  minecraft.class06338
 *  minecraft.class06961
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07947
 *  minecraft.class08195
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01487;
import minecraft.class05033;
import minecraft.class06338;
import minecraft.class06961;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07379;
import minecraft.class07382;
import minecraft.class07384;
import minecraft.class07385;
import minecraft.class07390;
import minecraft.class07395;
import minecraft.class07397;
import minecraft.class07411;
import minecraft.class07414;
import minecraft.class07415;
import minecraft.class07420;
import minecraft.class07423;
import minecraft.class07425;
import minecraft.class07947;
import minecraft.class08195;

public final class class07389<T>
extends Record {
    private final Optional<URI> reference;
    private final List<String> type;
    private final Optional<class07389<?>> items;
    private final Map<String, class07389<?>> properties;
    private final List<String> enumValues;
    private final Codec<T> codec;
    public static final Codec<? extends class07389<?>> N = Codec.recursive((String)"Schema", codec -> RecordCodecBuilder.create(instance -> instance.group((App)class06961.N.optionalFieldOf("$ref").forGetter(class07389::i), (App)class06338.N((Codec)Codec.STRING).optionalFieldOf("type", List.of()).forGetter(class07389::R), (App)codec.optionalFieldOf("items").forGetter(class07389::M), (App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)codec).optionalFieldOf("properties", Map.of()).forGetter(class07389::B), (App)Codec.STRING.listOf().optionalFieldOf("enum", List.of()).forGetter(class07389::Z)).apply((Applicative)instance, (optional, list, optional2, map, list2) -> null))).validate(class073892 -> {
        if (class073892 == null) {
            return DataResult.error(() -> "Should not deserialize schema");
        }
        return DataResult.success((Object)class073892);
    });
    private static final List<class07425<?>> g = new ArrayList();
    public static final class07389<Boolean> y = class07389.N("boolean", Codec.BOOL);
    public static final class07389<Integer> L = class07389.N("integer", Codec.INT);
    public static final class07389<Either<Boolean, Integer>> u = class07389.N(List.of("boolean", "integer"), Codec.either((Codec)Codec.BOOL, (Codec)Codec.INT));
    public static final class07389<Float> i = class07389.N("number", Codec.FLOAT);
    public static final class07389<String> R = class07389.N("string", Codec.STRING);
    public static final class07389<UUID> M = class07389.N("string", class01487.N);
    public static final class07389<class07420> B = class07389.N("string", class07420.N.codec());
    public static final class07425<class07086> Z = class07389.y("difficulty", class07389.N(class07086::values, class07086.field_41668));
    public static final class07425<class07282> z = class07389.y("game_type", class07389.N(class07282::values, class07282.field_41676));
    public static final class07389<class08195> U = class07389.N("integer", class08195.field_63202);
    public static final class07425<class07947> E = class07389.y("player", class07389.N(class07947.N.codec()).N("id", M).N("name", R));
    public static final class07425<class07414> W = class07389.y("version", class07389.N(class07414.N.codec()).N("name", R).N("protocol", L));
    public static final class07425<class07382> m = class07389.y("server_state", class07389.N(class07382.N).N("started", y).N("players", E.N().u()).N("version", W.N()));
    public static final class07389<class07411> P = class07389.N(class07411::values);
    public static final class07425<class07423<?>> s = class07389.y("typed_game_rule", class07389.N(class07423.N).N("key", R).N("value", u).N("type", P));
    public static final class07425<class07423<?>> T = class07389.y("untyped_game_rule", class07389.N(class07423.y).N("key", R).N("value", u));
    public static final class07425<class07415> b = class07389.y("message", class07389.N(class07415.N).N("literal", R).N("translatable", R).N("translatableParams", R.u()));
    public static final class07425<class07379> j = class07389.y("system_message", class07389.N(class07379.N).N("message", b.N()).N("overlay", y).N("receivingPlayers", E.N().u()));
    public static final class07425<class07384> v = class07389.y("kick_player", class07389.N(class07384.y.codec()).N("message", b.N()).N("player", E.N()));
    public static final class07425<class07397> n = class07389.y("operator", class07389.N(class07397.N.codec()).N("player", E.N()).N("bypassesPlayerLimit", y).N("permissionLevel", L));
    public static final class07425<class07390> t = class07389.y("incoming_ip_ban", class07389.N(class07390.N.codec()).N("player", E.N()).N("ip", R).N("reason", R).N("source", R).N("expires", R));
    public static final class07425<class07385> G = class07389.y("ip_ban", class07389.N(class07385.N.codec()).N("ip", R).N("reason", R).N("source", R).N("expires", R));
    public static final class07425<class07395> l = class07389.y("user_ban", class07389.N(class07395.N.codec()).N("player", E.N()).N("reason", R).N("source", R).N("expires", R));

    public static List<class07425<?>> L() {
        return g;
    }

    public Optional<class07389<?>> M() {
        return this.items;
    }

    public class07389(Optional<URI> optional, List<String> list, Optional<class07389<?>> optional2, Map<String, class07389<?>> map, List<String> list2, Codec<T> codec) {
        this.reference = optional;
        this.type = list;
        this.items = optional2;
        this.properties = map;
        this.enumValues = list2;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07389.class, "reference;type;items;properties;enumValues;codec", "reference", "type", "items", "properties", "enumValues", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07389.class, "reference;type;items;properties;enumValues;codec", "reference", "type", "items", "properties", "enumValues", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07389.class, "reference;type;items;properties;enumValues;codec", "reference", "type", "items", "properties", "enumValues", "codec"}, this);
    }

    public Map<String, class07389<?>> B() {
        return this.properties;
    }

    public List<String> Z() {
        return this.enumValues;
    }

    public Optional<URI> i() {
        return this.reference;
    }

    public Codec<T> z() {
        return this.codec;
    }

    public class07389<List<T>> u() {
        return class07389.N(this, this.codec);
    }

    private static <T> class07425<T> y(String string, class07389<T> class073892) {
        class07425<T> class074252 = new class07425<T>(string, class06961.N((String)string), class073892);
        g.add(class074252);
        return class074252;
    }

    public class07389<T> y() {
        return new class07389<T>(this.reference, this.type, this.items.map(class07389::y), this.properties.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> ((class07389)((Object)((Object)entry.getValue()))).y())), this.enumValues, this.codec);
    }

    public static <T> class07389<T> y(List<String> list, Codec<T> codec) {
        return new class07389<T>(Optional.empty(), List.of("string"), Optional.empty(), Map.of(), list, codec);
    }

    public static <E extends Enum<E>> class07389<E> N(Supplier<E[]> supplier) {
        return class07389.N(supplier, class05033.N(supplier));
    }

    public static <T> class07389<T> N(String string, Codec<T> codec) {
        return class07389.N(List.of(string), codec);
    }

    public static <T> class07389<T> N(List<String> list, Codec<T> codec) {
        return new class07389<T>(Optional.empty(), list, Optional.empty(), Map.of(), List.of(), codec);
    }

    public static <T> class07389<T> N(Codec<T> codec) {
        return new class07389<T>(Optional.empty(), List.of("object"), Optional.empty(), Map.of(), List.of(), codec);
    }

    public static <T> class07389<T> N(URI uRI, Codec<T> codec) {
        return new class07389<T>(Optional.of(uRI), List.of(), Optional.empty(), Map.of(), List.of(), codec);
    }

    private static <T> class07389<T> N(Map<String, class07389<?>> map, Codec<T> codec) {
        return new class07389<T>(Optional.empty(), List.of("object"), Optional.empty(), map, List.of(), codec);
    }

    public class07389<T> N(String string, class07389<?> class073892) {
        HashMap hashMap = new HashMap(this.properties);
        hashMap.put(string, class073892);
        return class07389.N(hashMap, this.codec);
    }

    public static <E extends Enum<E>> class07389<E> N(Supplier<E[]> supplier, Codec<E> codec) {
        return class07389.y(Stream.of((Enum[])supplier.get()).map(object -> ((class05033)object).method_15434()).toList(), codec);
    }

    public static <T> Codec<class07389<T>> N() {
        return N;
    }

    public static <T> class07389<List<T>> N(class07389<?> class073892, Codec<T> codec) {
        return new class07389<List<T>>(Optional.empty(), List.of("array"), Optional.of(class073892), Map.of(), List.of(), codec.listOf());
    }

    public List<String> R() {
        return this.type;
    }
}

