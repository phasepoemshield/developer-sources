/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00522
 *  minecraft.class01937
 *  minecraft.class01942
 *  minecraft.class07536
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00522;
import minecraft.class01937;
import minecraft.class01942;
import minecraft.class07536;
import minecraft.class08092;

public final class class01968
extends Record {
    private final List<class01937> entries;
    private static final char L = '|';
    private static final Joiner u = Joiner.on((char)'|');
    private static final Splitter i = Splitter.on((char)'|');
    private static final Codec<String> R = Codec.either((Codec)Codec.INT, (Codec)Codec.BOOL).flatComapMap(either -> (String)either.map(String::valueOf, String::valueOf), string -> DataResult.error(() -> "This codec can't be used for encoding"));
    public static final Codec<class01968> N = Codec.withAlternative((Codec)Codec.STRING, R).comapFlatMap(class01968::N, class01968::toString);

    public class01968(List<class01937> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty value for property");
        }
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01968.class, "entries", "entries"}, this, object);
    }

    public String toString() {
        return u.join(this.entries);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01968.class, "entries", "entries"}, this);
    }

    public static DataResult<class01968> N(String string) {
        List list = i.splitToStream((CharSequence)string).map(class01937::N).toList();
        if (list.isEmpty()) {
            return DataResult.error(() -> "Empty value for property");
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((class01937)iterator.next()).N().isEmpty()) continue;
            return DataResult.error(() -> "Empty term in value '" + string + "'");
        }
        return DataResult.success((Object)((Object)new class01968(list)));
    }

    public List<class01937> N() {
        return this.entries;
    }

    private <T extends Comparable<T>> Predicate<T> N(Object object, class08092<T> class080922, class01937 class019372) {
        Object t = this.N(object, class080922, class019372.N());
        if (class019372.y()) {
            return comparable2 -> !comparable2.equals(t);
        }
        return comparable2 -> comparable2.equals(t);
    }

    private <T extends Comparable<T>> T N(Object object, class08092<T> class080922, String string) {
        Optional optional = class080922.y(string);
        if (optional.isEmpty()) {
            throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", new Object[]{string, class080922, object, this}));
        }
        return (T)((Comparable)optional.get());
    }

    public <O, S extends class00522<O, S>, T extends Comparable<T>> Predicate<S> N(O o, class08092<T> class080922) {
        Object object;
        Object object2;
        boolean bl;
        Predicate predicate = class07536.y((List)Lists.transform(this.entries, class019372 -> this.N(o, class080922, (class01937)class019372)));
        ArrayList arrayList = new ArrayList(class080922.N());
        int n = arrayList.size();
        arrayList.removeIf(predicate.negate());
        int n2 = arrayList.size();
        if (n2 == 0) {
            class01942.y.warn("Condition {} for property {} on {} is always false", new Object[]{this, class080922.R(), o});
            return class005222 -> false;
        }
        int n3 = n - n2;
        if (n3 == 0) {
            class01942.y.warn("Condition {} for property {} on {} is always true", new Object[]{this, class080922.R(), o});
            return class005222 -> true;
        }
        if (n2 <= n3) {
            bl = false;
            object2 = arrayList;
        } else {
            bl = true;
            object = new ArrayList(class080922.N());
            object.removeIf(predicate);
            object2 = object;
        }
        if (object2.size() == 1) {
            object = (Comparable)object2.getFirst();
            return arg_0 -> class01968.N(class080922, (Comparable)object, bl, arg_0);
        }
        return class005222 -> {
            Comparable comparable = class005222.L(class080922);
            return object2.contains(comparable) ^ bl;
        };
    }

    private static /* synthetic */ boolean N(class08092 class080922, Comparable comparable, boolean bl, class00522 class005222) {
        Comparable comparable2 = class005222.L(class080922);
        return comparable.equals(comparable2) ^ bl;
    }
}

