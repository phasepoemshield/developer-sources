/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09389
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00720
 *  minecraft.class01196
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class02819
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07099
 *  net.fabricmc.fabric.api.event.registry.FabricRegistry
 *  net.fabricmc.fabric.mixin.registry.sync.RegistryMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09389;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00720;
import minecraft.class00750;
import minecraft.class01196;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class02819;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07099;
import net.fabricmc.fabric.api.event.registry.FabricRegistry;
import net.fabricmc.fabric.mixin.registry.sync.RegistryMixin;
import org.jspecify.annotations.Nullable;

public interface class00751<T>
extends class00750<T>,
class01921<T>,
Keyable,
FabricRegistry,
RegistryMixin {
    public @Nullable T L(@Nullable class05946<T> var1);

    public Optional<class03529<T>> L(class01894 var1);

    public Optional<class03529<T>> L(int var1);

    public Set<class01894> M();

    default public Optional<T> M(@Nullable class05946<T> class059462) {
        return Optional.ofNullable(this.L(class059462));
    }

    default public Codec<T> T() {
        return this.y().flatComapMap(class03529::N, object -> this.N(this.i(object)));
    }

    public Set<class05946<T>> B();

    default public T B(class05946<T> class059462) {
        T t = this.L(class059462);
        if (t == null) {
            throw new IllegalStateException("Missing key in " + String.valueOf(this.i()) + ": " + String.valueOf(class059462));
        }
        return t;
    }

    public Set<Map.Entry<class05946<T>, T>> Z();

    public class05946<? extends class00751<T>> i();

    public class03556<T> i(T var1);

    public Optional<class02819> i(class05946<T> var1);

    default public Codec<class03556<T>> b() {
        return this.y().flatComapMap(class035292 -> class035292, this::N);
    }

    default public class00750<class03556<T>> v() {
        return new class09389(this);
    }

    default public Stream<T> j() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public Stream<class03552<T>> U();

    default public <U> Stream<U> keys(DynamicOps<U> dynamicOps) {
        return this.M().stream().map(class018942 -> dynamicOps.createString(class018942.toString()));
    }

    public Optional<class05946<T>> u(T var1);

    default public Iterable<class03556<T>> u(class03530<T> class035302) {
        return (Iterable)DataFixUtils.orElse((Optional)this.N(class035302), List.of());
    }

    public boolean u(class01894 var1);

    public static <R, T extends R> class03529<T> y(class00751<R> class007512, class01894 class018942, T t) {
        return class00751.y(class007512, class05946.N(class007512.i(), (class01894)class018942), t);
    }

    default public Optional<T> y(@Nullable class01894 class018942) {
        return Optional.ofNullable(this.N(class018942));
    }

    public @Nullable class01894 y(T var1);

    private Codec<class03529<T>> y() {
        return class06338.N((Codec)class01894.N.comapFlatMap(class018942 -> this.L((class01894)class018942).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + String.valueOf(this.i()) + ": " + String.valueOf(class018942))), class035292 -> class035292.B().N()), (T class035292) -> this.i(class035292.B()).map(class02819::y).orElse(Lifecycle.experimental()));
    }

    public static <R, T extends R> class03529<T> y(class00751<R> class007512, class05946<R> class059462, T t) {
        return ((class07099)class007512).N(class059462, t, class02819.N);
    }

    public static <T> T N(class00751<? super T> class007512, String string, T t) {
        return class00751.N(class007512, class01894.N((String)string), t);
    }

    public class00720<T> N(class01196<T> var1);

    private DataResult<class03529<T>> N(class03556<T> class035562) {
        return class035562 instanceof class03529 ? DataResult.success((Object)((class03529)class035562)) : DataResult.error(() -> "Unregistered holder in " + String.valueOf(this.i()) + ": " + String.valueOf(class035562));
    }

    public static <V, T extends V> T N(class00751<V> class007512, class01894 class018942, T t) {
        return class00751.N(class007512, class05946.N(class007512.i(), (class01894)class018942), t);
    }

    @Override
    public int N(@Nullable T var1);

    public Optional<class03529<T>> N(class06069 var1);

    public @Nullable T N(@Nullable class01894 var1);

    public Optional<class03529<T>> N();

    public static <V, T extends V> T N(class00751<V> class007512, class05946<V> class059462, T t) {
        ((class07099)class007512).N(class059462, t, class02819.N);
        return t;
    }

    public class00751<T> W();

    public class03529<T> R(T var1);

    public boolean R(class05946<T> var1);
}

