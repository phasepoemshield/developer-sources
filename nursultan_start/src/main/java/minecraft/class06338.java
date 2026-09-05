/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  com.google.common.primitives.UnsignedBytes
 *  com.google.gson.JsonElement
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Codec$ResultFunction
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.floats.FloatArrayList
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.util.HexFormat
 *  minecraft.class01487
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03543
 *  minecraft.class05018
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.joml.AxisAngle4f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector2f
 *  org.joml.Vector2fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector3i
 *  org.joml.Vector3ic
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import minecraft.class01487;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03543;
import minecraft.class05018;
import minecraft.class06328;
import minecraft.class06330;
import minecraft.class06335;
import minecraft.class06349;
import minecraft.class06351;
import minecraft.class06354;
import minecraft.class06356;
import minecraft.class06358;
import minecraft.class06359;
import minecraft.class06369;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import org.apache.commons.lang3.StringEscapeUtils;
import org.joml.AxisAngle4f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public class class06338 {
    public static final Codec<JsonElement> N = class06338.N(JsonOps.INSTANCE);
    public static final Codec<Object> y = class06338.N(JavaOps.INSTANCE);
    public static final Codec<class07709> L = class06338.N(class07713.N);
    public static final Codec<Vector2fc> u = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)2).map(list -> new Vector2f(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue())), vector2fc -> List.of(Float.valueOf(vector2fc.x()), Float.valueOf(vector2fc.y())));
    public static final Codec<Vector3fc> i = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)3).map(list -> new Vector3f(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue(), ((Float)list.get(2)).floatValue())), vector3fc -> List.of(Float.valueOf(vector3fc.x()), Float.valueOf(vector3fc.y()), Float.valueOf(vector3fc.z())));
    public static final Codec<Vector3ic> R = Codec.INT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)3).map(list -> new Vector3i(((Integer)list.get(0)).intValue(), ((Integer)list.get(1)).intValue(), ((Integer)list.get(2)).intValue())), vector3ic -> List.of(Integer.valueOf(vector3ic.x()), Integer.valueOf(vector3ic.y()), Integer.valueOf(vector3ic.z())));
    public static final Codec<Vector4fc> M = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)4).map(list -> new Vector4f(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue(), ((Float)list.get(2)).floatValue(), ((Float)list.get(3)).floatValue())), vector4fc -> List.of(Float.valueOf(vector4fc.x()), Float.valueOf(vector4fc.y()), Float.valueOf(vector4fc.z()), Float.valueOf(vector4fc.w())));
    public static final Codec<Quaternionfc> B = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)4).map(list -> new Quaternionf(((Float)list.get(0)).floatValue(), ((Float)list.get(1)).floatValue(), ((Float)list.get(2)).floatValue(), ((Float)list.get(3)).floatValue()).normalize()), quaternionfc -> List.of(Float.valueOf(quaternionfc.x()), Float.valueOf(quaternionfc.y()), Float.valueOf(quaternionfc.z()), Float.valueOf(quaternionfc.w())));
    public static final Codec<AxisAngle4f> Z = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("angle").forGetter(axisAngle4f -> Float.valueOf(axisAngle4f.angle)), (App)i.fieldOf("axis").forGetter(axisAngle4f -> new Vector3f(axisAngle4f.x, axisAngle4f.y, axisAngle4f.z))).apply(instance, AxisAngle4f::new));
    public static final Codec<Quaternionfc> z = Codec.withAlternative(B, (Codec)Z.xmap(Quaternionf::new, AxisAngle4f::new));
    public static final Codec<Matrix4fc> U = Codec.FLOAT.listOf().comapFlatMap(list2 -> class07536.N((List)list2, (int)16).map(list -> {
        Matrix4f matrix4f = new Matrix4f();
        for (int i = 0; i < list.size(); ++i) {
            matrix4f.setRowColumn(i >> 2, i & 3, ((Float)list.get(i)).floatValue());
        }
        return matrix4f.determineProperties();
    }), matrix4fc -> {
        FloatArrayList floatArrayList = new FloatArrayList(16);
        for (int i = 0; i < 16; ++i) {
            floatArrayList.add(matrix4fc.getRowColumn(i >> 2, i & 3));
        }
        return floatArrayList;
    });
    private static final String F = "#";
    public static final Codec<Integer> E = Codec.withAlternative((Codec)Codec.INT, i, vector3fc -> class02566.N((float)1.0f, (float)vector3fc.x(), (float)vector3fc.y(), (float)vector3fc.z()));
    public static final Codec<Integer> W = Codec.withAlternative((Codec)Codec.INT, M, vector4fc -> class02566.N((float)vector4fc.w(), (float)vector4fc.x(), (float)vector4fc.y(), (float)vector4fc.z()));
    public static final Codec<Integer> m = Codec.withAlternative((Codec)class06338.N(6).xmap(class02566::M, class02566::B), E);
    public static final Codec<Integer> P = Codec.withAlternative(class06338.N(8), W);
    public static final Codec<Integer> s = Codec.BYTE.flatComapMap(UnsignedBytes::toInt, n -> {
        if (n > 255) {
            return DataResult.error(() -> "Unsigned byte was too large: " + n + " > 255");
        }
        return DataResult.success((Object)n.byteValue());
    });
    public static final Codec<Integer> T = class06338.N_12(0, Integer.MAX_VALUE, n -> "Value must be non-negative: " + n);
    public static final Codec<Integer> b = class06338.N_12(1, Integer.MAX_VALUE, n -> "Value must be positive: " + n);
    public static final Codec<Long> j = class06338.N_56(0L, Long.MAX_VALUE, l -> "Value must be non-negative: " + l);
    public static final Codec<Long> v = class06338.N_56(1L, Long.MAX_VALUE, l -> "Value must be positive: " + l);
    public static final Codec<Float> n = class06338.a(0.0f, Float.MAX_VALUE, f -> "Value must be non-negative: " + f);
    public static final Codec<Float> t = class06338.b(0.0f, Float.MAX_VALUE, f -> "Value must be positive: " + f);
    public static final Codec<Pattern> G = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)Pattern.compile(string));
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return DataResult.error(() -> "Invalid regex pattern '" + string + "': " + patternSyntaxException.getMessage());
        }
    }, Pattern::pattern);
    public static final Codec<Instant> l = class06338.N(DateTimeFormatter.ISO_INSTANT).xmap(Instant::from, Function.identity());
    public static final Codec<byte[]> d = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)Base64.getDecoder().decode((String)string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return DataResult.error(() -> "Malformed base64 string");
        }
    }, byArray -> Base64.getEncoder().encodeToString((byte[])byArray));
    public static final Codec<String> w = Codec.STRING.comapFlatMap(string -> DataResult.success((Object)StringEscapeUtils.unescapeJava((String)string)), StringEscapeUtils::escapeJava);
    public static final Codec<class06359> k = Codec.STRING.comapFlatMap(string -> string.startsWith(F) ? class01894.u((String)string.substring(1)).map(class018942 -> new class06359((class01894)class018942, true)) : class01894.u((String)string).map(class018942 -> new class06359((class01894)class018942, false)), class06359::L);
    public static final Function<Optional<Long>, OptionalLong> Y = optional -> optional.map(OptionalLong::of).orElseGet(OptionalLong::empty);
    public static final Function<OptionalLong, Optional<Long>> Q = optionalLong -> optionalLong.isPresent() ? Optional.of(optionalLong.getAsLong()) : Optional.empty();
    public static final Codec<BitSet> O = Codec.LONG_STREAM.xmap(longStream -> BitSet.valueOf(longStream.toArray()), bitSet -> Arrays.stream(bitSet.toLongArray()));
    public static final int g = 64;
    public static final int I = Short.MAX_VALUE;
    public static final int J = 1024;
    public static final int o = 16;
    private static final Codec<Property> A = RecordCodecBuilder.create(instance -> instance.group((App)Codec.sizeLimitedString((int)64).fieldOf("name").forGetter(Property::name), (App)Codec.sizeLimitedString((int)Short.MAX_VALUE).fieldOf("value").forGetter(Property::value), (App)Codec.sizeLimitedString((int)1024).optionalFieldOf("signature").forGetter(property -> Optional.ofNullable(property.signature()))).apply((Applicative)instance, (string, string2, optional) -> new Property(string, string2, (String)optional.orElse(null))));
    public static final Codec<PropertyMap> q = Codec.either((Codec)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING.listOf()).validate(map -> map.size() > 16 ? DataResult.error(() -> "Cannot have more than 16 properties, but was " + map.size()) : DataResult.success((Object)map)), (Codec)A.sizeLimitedListOf(16)).xmap(either -> {
        ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
        either.ifLeft(map -> map.forEach((string, list) -> {
            for (String string2 : list) {
                builder.put(string, (Object)new Property(string, string2));
            }
        })).ifRight(list -> {
            for (Property property : list) {
                builder.put((Object)property.name(), (Object)property);
            }
        });
        return new PropertyMap((Multimap)builder.build());
    }, propertyMap -> Either.right((Object)propertyMap.values().stream().toList()));
    public static final Codec<String> K = Codec.string((int)0, (int)16).validate(string -> {
        if (class05018.R((String)string)) {
            return DataResult.success((Object)string);
        }
        return DataResult.error(() -> "Player name contained disallowed characters: '" + string + "'");
    });
    public static final Codec<GameProfile> V = class06338.B((Codec<UUID>)class01487.i).codec();
    public static final MapCodec<GameProfile> e = class06338.B((Codec<UUID>)class01487.N);
    public static final Codec<String> H = Codec.STRING.validate(string -> string.isEmpty() ? DataResult.error(() -> "Expected non-empty string") : DataResult.success((Object)string));
    public static final Codec<Integer> c = Codec.STRING.comapFlatMap(string -> {
        int[] nArray = string.codePoints().toArray();
        if (nArray.length != 1) {
            return DataResult.error(() -> "Expected one codepoint, got: " + string);
        }
        return DataResult.success((Object)nArray[0]);
    }, Character::toString);
    public static final Codec<String> X = Codec.STRING.validate(string -> {
        if (!class01894.Z((String)string)) {
            return DataResult.error(() -> "Invalid string to use as a resource path element: " + string);
        }
        return DataResult.success((Object)string);
    });
    public static final Codec<URI> a = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)class07536.N((String)string));
        }
        catch (URISyntaxException uRISyntaxException) {
            return DataResult.error(uRISyntaxException::getMessage);
        }
    }, URI::toString);
    public static final Codec<String> p = Codec.STRING.validate(string -> {
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (class05018.N((int)c)) continue;
            return DataResult.error(() -> "Disallowed chat character: '" + c + "'");
        }
        return DataResult.success((Object)string);
    });

    public static <E> Codec<List<E>> L(Codec<E> codec, Codec<List<E>> codec2) {
        return Codec.either(codec2, codec).xmap(either -> (List)either.map(list -> list, List::of), list -> list.size() == 1 ? Either.right((Object)list.getFirst()) : Either.left((Object)list));
    }

    @Deprecated
    public static <E extends Enum<E>> Codec<E> L(Function<String, E> function) {
        return Codec.STRING.comapFlatMap(string -> {
            try {
                return DataResult.success((Object)((Enum)function.apply((String)string)));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return DataResult.error(() -> "No value with id: " + string);
            }
        }, Enum::toString);
    }

    public static <T> Codec<class03543<T>> L(Codec<class03543<T>> codec) {
        return codec.validate(class035432 -> {
            if (class035432.u().right().filter(List::isEmpty).isPresent()) {
                return DataResult.error(() -> "List must have contents");
            }
            return DataResult.success((Object)class035432);
        });
    }

    public static <A> Codec<Optional<A>> M(Codec<A> codec) {
        return new class06369(codec);
    }

    private static MapCodec<GameProfile> B(Codec<UUID> codec) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)codec.fieldOf("id").forGetter(GameProfile::id), (App)K.fieldOf("name").forGetter(GameProfile::name), (App)q.optionalFieldOf("properties", (Object)PropertyMap.EMPTY).forGetter(GameProfile::properties)).apply((Applicative)instance, GameProfile::new));
    }

    public static <A> Codec<A> i(Codec<A> codec) {
        return Codec.of(codec, new class06351(codec));
    }

    public static <M extends Map<?, ?>> Codec<M> u(Codec<M> codec) {
        return codec.validate(map -> map.isEmpty() ? DataResult.error(() -> "Map must have contents") : DataResult.success((Object)map));
    }

    public static Codec<Long> y(int n, int n2) {
        return class06338.N_56(n, n2, l -> "Value must be within range [" + n + ";" + n2 + "]: " + l);
    }

    public static <E> Codec<E> y(Codec<E> codec, Function<E, Lifecycle> function, Function<E, Lifecycle> function2) {
        return codec.mapResult(new class06356(function, function2));
    }

    private static Codec<Float> y(float f, float f2, Function<Float, String> function) {
        return Codec.FLOAT.validate(f3 -> {
            if (f3.compareTo(Float.valueOf(f)) > 0 && f3.compareTo(Float.valueOf(f2)) <= 0) {
                return DataResult.success((Object)f3);
            }
            return DataResult.error(() -> (String)function.apply((Float)f3));
        });
    }

    public static <K, V> class06330<K, V> y(Codec<K> codec, Codec<V> codec2) {
        return new class06330<K, V>(codec, codec2);
    }

    public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> y(Function<E, T> function) {
        return collection -> {
            Iterator iterator = collection.iterator();
            if (iterator.hasNext()) {
                Object r = function.apply(iterator.next());
                while (iterator.hasNext()) {
                    Object e = iterator.next();
                    Object r2 = function.apply(e);
                    if (r2 == r) continue;
                    return DataResult.error(() -> "Mixed type list: element " + String.valueOf(e) + " had type " + String.valueOf(r2) + ", but list is of type " + String.valueOf(r));
                }
            }
            return DataResult.success((Object)collection, (Lifecycle)Lifecycle.stable());
        };
    }

    public static <T> Codec<List<T>> y(Codec<List<T>> codec) {
        return codec.validate(list -> list.isEmpty() ? DataResult.error(() -> "List must have contents") : DataResult.success((Object)list));
    }

    public static <E> Codec<E> N(ToIntFunction<E> toIntFunction, IntFunction<@Nullable E> intFunction, int n2) {
        return Codec.INT.flatXmap(n -> Optional.ofNullable(intFunction.apply((int)n)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown element id: " + n)), object -> {
            int n2 = toIntFunction.applyAsInt(object);
            return n2 == n2 ? DataResult.error(() -> "Element with unknown id: " + String.valueOf(object)) : DataResult.success((Object)n2);
        });
    }

    public static Codec<Integer> N(int n, int n2) {
        return class06338.N_12(n, n2, n3 -> "Value must be within range [" + n + ";" + n2 + "]: " + n3);
    }

    private static Codec<Integer> N_12(int n, int n2, Function<Integer, String> function) {
        return Codec.INT.validate(n3 -> {
            if (n3.compareTo(n) >= 0 && n3.compareTo(n2) <= 0) {
                return DataResult.success((Object)n3);
            }
            return DataResult.error(() -> (String)function.apply((Integer)n3));
        });
    }

    public static <I, E> Codec<E> N(Codec<I> codec, Function<I, @Nullable E> function, Function<E, @Nullable I> function2) {
        return codec.flatXmap(object -> {
            Object r = function.apply(object);
            return r == null ? DataResult.error(() -> "Unknown element id: " + String.valueOf(object)) : DataResult.success(r);
        }, object -> {
            Object r = function2.apply(object);
            if (r == null) {
                return DataResult.error(() -> "Element with unknown id: " + String.valueOf(object));
            }
            return DataResult.success(r);
        });
    }

    public static <E> Codec<E> N(Codec<E> codec, Codec<E> codec2) {
        return new class06358(codec2, codec);
    }

    public static Codec<Float> N(float f, float f2) {
        return class06338.N(f, f2, (Float f3) -> "Value must be within range [" + f + ";" + f2 + "]: " + f3);
    }

    private static Codec<Long> N_56(long l, long l2, Function<Long, String> function) {
        return Codec.LONG.validate(l3 -> {
            if ((long)l3.compareTo(l) >= 0L && (long)l3.compareTo(l2) <= 0L) {
                return DataResult.success((Object)l3);
            }
            return DataResult.error(() -> (String)function.apply((Long)l3));
        });
    }

    public static <E> MapCodec<E> N(Function<DynamicOps<?>, DataResult<E>> function) {
        return new class06328(function);
    }

    public static <T> Codec<T> N(DynamicOps<T> dynamicOps) {
        return Codec.PASSTHROUGH.xmap(dynamic -> dynamic.convert(dynamicOps).getValue(), object -> new Dynamic(dynamicOps, object));
    }

    private static Codec<Float> N(float f, float f2, Function<Float, String> function) {
        return Codec.FLOAT.validate(f3 -> {
            if (f3.compareTo(Float.valueOf(f)) >= 0 && f3.compareTo(Float.valueOf(f2)) <= 0) {
                return DataResult.success((Object)f3);
            }
            return DataResult.error(() -> (String)function.apply((Float)f3));
        });
    }

    public static <K, V> Codec<Map<K, V>> N(Codec<Map<K, V>> codec, int n) {
        return codec.validate(map -> {
            if (map.size() > n) {
                return DataResult.error(() -> "Map is too long: " + map.size() + ", expected range [0-" + n + "]");
            }
            return DataResult.success((Object)map);
        });
    }

    public static <P, I> Codec<I> N(Codec<P> codec, String string, String string2, BiFunction<P, P, DataResult<I>> biFunction, Function<I, P> function, Function<I, P> function2) {
        Codec codec2 = Codec.list(codec).comapFlatMap(list2 -> class07536.N((List)list2, (int)2).flatMap(list -> {
            Object e = list.get(0);
            Object e2 = list.get(1);
            return (DataResult)biFunction.apply(e, e2);
        }), object -> ImmutableList.of(function.apply(object), function2.apply(object)));
        Codec codec3 = RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf(string).forGetter(Pair::getFirst), (App)codec.fieldOf(string2).forGetter(Pair::getSecond)).apply((Applicative)instance, Pair::of)).comapFlatMap(pair -> (DataResult)biFunction.apply(pair.getFirst(), pair.getSecond()), object -> Pair.of(function.apply(object), function2.apply(object)));
        Codec codec4 = Codec.withAlternative((Codec)codec2, (Codec)codec3);
        return Codec.either(codec, (Codec)codec4).comapFlatMap(either -> (DataResult)either.map(object -> (DataResult)biFunction.apply(object, object), DataResult::success), object -> {
            Object r;
            Object r2 = function.apply(object);
            if (Objects.equals(r2, r = function2.apply(object))) {
                return Either.left(r2);
            }
            return Either.right((Object)object);
        });
    }

    @Deprecated
    public static <K, V> MapCodec<V> N(String string, String string2, Codec<K> codec, Function<? super V, ? extends K> function, Function<? super K, ? extends Codec<? extends V>> function2) {
        return new class06354(string, string2, codec, function2, function);
    }

    public static <A> Codec.ResultFunction<A> N(A a) {
        return new class06349(a);
    }

    private static Codec<Integer> N(int n) {
        long l = (1L << n * 4) - 1L;
        return Codec.STRING.comapFlatMap(string -> {
            if (!string.startsWith(F)) {
                return DataResult.error(() -> "Hex color must begin with #");
            }
            int n2 = string.length() - F.length();
            if (n2 != n) {
                return DataResult.error(() -> "Hex color is wrong size, expected " + n + " digits but got " + n2);
            }
            try {
                long l2 = HexFormat.fromHexDigitsToLong((CharSequence)string, (int)F.length(), (int)string.length());
                if (l2 < 0L || l2 > l) {
                    return DataResult.error(() -> "Color value out of range: " + string);
                }
                return DataResult.success((Object)((int)l2));
            }
            catch (NumberFormatException numberFormatException) {
                return DataResult.error(() -> "Invalid color value: " + string);
            }
        }, n2 -> F + HexFormat.of().toHexDigits((long)n2.intValue(), n));
    }

    public static Codec<TemporalAccessor> N(DateTimeFormatter dateTimeFormatter) {
        return Codec.STRING.comapFlatMap(string -> {
            try {
                return DataResult.success((Object)dateTimeFormatter.parse((CharSequence)string));
            }
            catch (Exception exception) {
                return DataResult.error(exception::getMessage);
            }
        }, dateTimeFormatter::format);
    }

    public static MapCodec<OptionalLong> N(MapCodec<Optional<Long>> mapCodec) {
        return mapCodec.xmap(Y, Q);
    }

    public static <E> Codec<E> N(Codec<E> codec, Function<E, Lifecycle> function) {
        return class06338.y(codec, function, function);
    }

    public static <E> Codec<List<E>> N(Codec<E> codec) {
        return class06338.L(codec, codec.listOf());
    }

    public static <E> MapCodec<E> N(MapCodec<E> mapCodec, MapCodec<E> mapCodec2) {
        return new class06335(mapCodec2, mapCodec);
    }

    public static <T> Codec<Object2BooleanMap<T>> R(Codec<T> codec) {
        return Codec.unboundedMap(codec, (Codec)Codec.BOOL).xmap(Object2BooleanOpenHashMap::new, Object2ObjectOpenHashMap::new);
    }

    private static Codec<Float> a(float f, float f2, Function<Float, String> function) {
        return Codec.FLOAT.validate(f3 -> {
            if (f3.compareTo(Float.valueOf(f)) >= 0 && f3.compareTo(Float.valueOf(f2)) <= 0) {
                return DataResult.success((Object)f3);
            }
            return DataResult.error(() -> (String)function.apply((Float)f3));
        });
    }

    private static Codec<Float> b(float f, float f2, Function<Float, String> function) {
        return Codec.FLOAT.validate(f3 -> {
            if (f3.compareTo(Float.valueOf(f)) > 0 && f3.compareTo(Float.valueOf(f2)) <= 0) {
                return DataResult.success((Object)f3);
            }
            return DataResult.error(() -> (String)function.apply((Float)f3));
        });
    }
}

