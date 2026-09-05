/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  jerozgen.languagereload.access.ILanguage
 *  jerozgen.languagereload.access.ITranslationStorage
 *  jerozgen.languagereload.config.Config
 *  minecraft.class03748
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class05935
 *  minecraft.class05936
 *  minecraft.class05977
 *  minecraft.class06338
 *  minecraft.class07018
 *  minecraft.class07049
 *  minecraft.class07701
 *  minecraft.class08429
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jerozgen.languagereload.access.ILanguage;
import jerozgen.languagereload.access.ITranslationStorage;
import jerozgen.languagereload.config.Config;
import minecraft.class00386;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class03748;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;
import minecraft.class06338;
import minecraft.class07018;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class08429;
import org.jspecify.annotations.Nullable;

public class class00388
implements class04439 {
    public static final Object[] N = new Object[0];
    private static final Codec<Object> L = class06338.y.validate(class00388::y);
    private static final Codec<Object> u = Codec.either(L, (Codec)class03748.N).xmap(either -> either.map(object -> object, class003922 -> Objects.requireNonNullElse(class003922.N(), class003922)), object -> object instanceof class00392 ? Either.right((Object)((class00392)object)) : Either.left((Object)object));
    public static final MapCodec<class00388> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("translate").forGetter(class003882 -> class003882.M), (App)Codec.STRING.lenientOptionalFieldOf("fallback").forGetter(class003882 -> Optional.ofNullable(class003882.B)), (App)u.listOf().optionalFieldOf("with").forGetter(class003882 -> class00388.N(class003882.Z))).apply(instance, class00388::N));
    private static final class05936 i = class05936.R((String)"%");
    private static final class05936 R = class05936.R((String)"null");
    private final String M;
    private final @Nullable String B;
    private final Object[] Z;
    private @Nullable class07018 z;
    private List<class05936> U = ImmutableList.of();
    private static final Pattern E = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public @Nullable String L() {
        return this.B;
    }

    public class00388(String string, @Nullable String string2, Object[] objectArray) {
        this.M = string;
        this.B = string2;
        this.Z = objectArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00388)) return false;
        class00388 class003882 = (class00388)object;
        if (!Objects.equals(this.M, class003882.M)) return false;
        if (!Objects.equals(this.B, class003882.B)) return false;
        if (!Arrays.equals(this.Z, class003882.Z)) return false;
        return true;
    }

    public String toString() {
        return "translation{key='" + this.M + "'" + (String)(this.B != null ? ", fallback='" + this.B + "'" : "") + ", args=" + Arrays.toString(this.Z) + "}";
    }

    public int hashCode() {
        int n = Objects.hashCode(this.M);
        n = 31 * n + Objects.hashCode(this.B);
        n = 31 * n + Arrays.hashCode(this.Z);
        return n;
    }

    List i() {
        if (!Config.getInstance().multilingualItemSearch) {
            return null;
        }
        class07018 class070182 = class07018.y();
        if (class070182 == null) {
            return null;
        }
        class08429 class084292 = ((ILanguage)class070182).languagereload_getTranslationStorage();
        if (class084292 == null) {
            return null;
        }
        if (((ITranslationStorage)class084292).languagereload_getTargetLanguage() == null) {
            return null;
        }
        String string = ((ITranslationStorage)class084292).languagereload_get(this.M);
        try {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            this.N(string, arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
            return builder.build();
        }
        catch (class00386 class003862) {
            return ImmutableList.of((Object)class05936.R((String)string));
        }
    }

    public Object[] u() {
        return this.Z;
    }

    public String y() {
        return this.M;
    }

    List y(class00388 class003882, Operation operation) {
        List list = this.i();
        if (list != null) {
            return list;
        }
        return (List)operation.call(new Object[]{class003882});
    }

    private static DataResult<Object> y(@Nullable Object object) {
        if (!class00388.N(object)) {
            return DataResult.error(() -> "This value needs to be parsed as component");
        }
        return DataResult.success((Object)object);
    }

    private static Object[] N(Optional<List<Object>> optional) {
        return (Object[])optional.map(list -> list.isEmpty() ? N : list.toArray()).orElse(N);
    }

    public static boolean N(@Nullable Object object) {
        return object instanceof Number || object instanceof Boolean || object instanceof String;
    }

    List N(class00388 class003882, Operation operation) {
        List list = this.i();
        if (list != null) {
            return list;
        }
        return (List)operation.call(new Object[]{class003882});
    }

    public class05216 N(@Nullable class07701 class077012, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        Object[] objectArray = new Object[this.Z.length];
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = this.Z[i];
            if (object instanceof class00392) {
                class00392 class003922 = (class00392)object;
                objectArray[i] = class00390.N(class077012, class003922, class070492, n);
                continue;
            }
            objectArray[i] = object;
        }
        return class05216.N((class04439)new class00388(this.M, this.B, objectArray));
    }

    private static class00388 N(String string, Optional<String> optional, Optional<List<Object>> optional2) {
        return new class00388(string, optional.orElse(null), class00388.N(optional2));
    }

    public final class05936 N(int n) {
        if (n < 0 || n >= this.Z.length) {
            throw new class00386(this, n);
        }
        Object object = this.Z[n];
        if (object instanceof class00392) {
            return (class00392)object;
        }
        return object == null ? R : class05936.R((String)object.toString());
    }

    private void N(String string, Consumer<class05936> consumer) {
        Matcher matcher = E.matcher(string);
        try {
            int n = 0;
            int n2 = 0;
            while (matcher.find(n2)) {
                String string2;
                int n3 = matcher.start();
                int n4 = matcher.end();
                if (n3 > n2) {
                    string2 = string.substring(n2, n3);
                    if (string2.indexOf(37) != -1) {
                        throw new IllegalArgumentException();
                    }
                    consumer.accept(class05936.R((String)string2));
                }
                string2 = matcher.group(2);
                String string3 = string.substring(n3, n4);
                if ("%".equals(string2) && "%%".equals(string3)) {
                    consumer.accept(i);
                } else if ("s".equals(string2)) {
                    String string4 = matcher.group(1);
                    int n5 = string4 != null ? Integer.parseInt(string4) - 1 : n++;
                    consumer.accept(this.N(n5));
                } else {
                    throw new class00386(this, "Unsupported format: '" + string3 + "'");
                }
                n2 = n4;
            }
            if (n2 < string.length()) {
                String string5 = string.substring(n2);
                if (string5.indexOf(37) != -1) {
                    throw new IllegalArgumentException();
                }
                consumer.accept(class05936.R((String)string5));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new class00386(this, (Throwable)illegalArgumentException);
        }
    }

    public MapCodec<class00388> N() {
        return y;
    }

    private static Optional<List<Object>> N(Object[] objectArray) {
        return objectArray.length == 0 ? Optional.empty() : Optional.of(Arrays.asList(objectArray));
    }

    private void R() {
        class07018 class070182 = class07018.y();
        if (class070182 == this.z) {
            return;
        }
        this.z = class070182;
        String string = this.B != null ? class070182.N(this.M, this.B) : class070182.y(this.M);
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            this.N(string, arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
            this.U = builder.build();
        }
        catch (class00386 class003862) {
            this.U = ImmutableList.of((Object)class05936.R((String)string));
        }
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        this.R();
        class00388 class003882 = this;
        Iterator iterator = this.y(class003882, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_2588]");
            return ((class00388)objectArray[0]).U;
        }).iterator();
        while (iterator.hasNext()) {
            Optional optional = ((class05936)iterator.next()).N(class059352, class004052);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        this.R();
        class00388 class003882 = this;
        Iterator iterator = this.N(class003882, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_2588]");
            return ((class00388)objectArray[0]).U;
        }).iterator();
        while (iterator.hasNext()) {
            Optional optional = ((class05936)iterator.next()).N_8(class059772);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }
}

