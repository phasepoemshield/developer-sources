/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.MapWithDefault;
import kotlin.collections.MapWithDefaultImpl;
import kotlin.collections.MapsKt;
import kotlin.collections.MutableMapWithDefault;
import kotlin.collections.MutableMapWithDefaultImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001aX\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u001aZ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0007H\u0007\u00a2\u0006\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2={"K", "V", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "defaultValue", "withDefault", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "", "withDefaultMutable", "kotlin-stdlib"}, xs="kotlin/collections/MapsKt")
class MapsKt__MapWithDefaultKt {
    @NotNull
    public static final <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> $this$withDefault, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$withDefault, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return $this$withDefault instanceof MapWithDefault ? MapsKt.withDefault(((MapWithDefault)$this$withDefault).getMap(), defaultValue) : (Map)new MapWithDefaultImpl<K, V>($this$withDefault, defaultValue);
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="getOrImplicitDefaultNullable")
    @PublishedApi
    public static final <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> $this$getOrImplicitDefault, K key) {
        void var4_4;
        Intrinsics.checkNotNullParameter($this$getOrImplicitDefault, "<this>");
        if ($this$getOrImplicitDefault instanceof MapWithDefault) {
            return ((MapWithDefault)$this$getOrImplicitDefault).getOrImplicitDefault(key);
        }
        Map<K, V> $this$getOrElseNullable$iv = $this$getOrImplicitDefault;
        boolean $i$f$getOrElseNullable = false;
        V value$iv = $this$getOrElseNullable$iv.get(key);
        if (value$iv == null) {
            if (!$this$getOrElseNullable$iv.containsKey(key)) {
                boolean bl = false;
                throw new NoSuchElementException("Key " + key + " is missing in the map.");
            }
        }
        return var4_4;
    }

    @NotNull
    @JvmName(name="withDefaultMutable")
    public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> $this$withDefault, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter($this$withDefault, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return $this$withDefault instanceof MutableMapWithDefault ? MapsKt.withDefaultMutable(((MutableMapWithDefault)$this$withDefault).getMap(), defaultValue) : (Map)new MutableMapWithDefaultImpl<K, V>($this$withDefault, defaultValue);
    }
}

