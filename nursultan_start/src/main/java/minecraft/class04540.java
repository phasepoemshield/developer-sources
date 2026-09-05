/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10422
 *  Nursultan.class10440
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class02136
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06069
 *  minecraft.class06338
 *  net.caffeinemc.mods.lithium.common.util.collections.HashedReferenceList
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10422;
import Nursultan.class10440;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class02136;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04523;
import minecraft.class04531;
import minecraft.class04537;
import minecraft.class06069;
import minecraft.class06338;
import net.caffeinemc.mods.lithium.common.util.collections.HashedReferenceList;
import org.jspecify.annotations.Nullable;

public final class class04540<E> {
    private static final int N = 64;
    private final int y;
    private List<class04523<E>> L;
    private final @Nullable class04537<E> u;

    public boolean L() {
        return this.L.isEmpty();
    }

    class04540(List<? extends class04523<E>> list) {
        List<? extends class04523<E>> list2 = list;
        this.L = this.N(list2);
        this.y = class04531.N(list, class04523::y);
        this.u = this.y == 0 ? null : (this.y < 64 ? new class10440(this.L, this.y) : new class10422(this.L));
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class04540) {
            class04540 class045402 = (class04540)object;
            return this.y == class045402.y && Objects.equals(this.L, class045402.L);
        }
        return false;
    }

    public int hashCode() {
        int n = this.y;
        n = 31 * n + this.L.hashCode();
        return n;
    }

    public List<class04523<E>> u() {
        return this.L;
    }

    public E y(class06069 class060692) {
        if (this.u == null) {
            throw new IllegalStateException("Weighted list has no elements");
        }
        int n = class060692.y(this.y);
        return this.u.N(n);
    }

    public static <E> Codec<class04540<E>> y(Codec<E> codec) {
        return class06338.y((Codec)class04523.N(codec).listOf()).xmap(class04540::N, class04540::u);
    }

    public static <E> Codec<class04540<E>> y(MapCodec<E> mapCodec) {
        return class06338.y((Codec)class04523.N(mapCodec).listOf()).xmap(class04540::N, class04540::u);
    }

    public boolean y(E e) {
        Iterator<class04523<E>> iterator = this.L.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().N().equals(e)) continue;
            return true;
        }
        return false;
    }

    public static <E> class02136<E> y() {
        return new class02136();
    }

    public static <E, B extends ByteBuf> class02362<B, class04540<E>> N(class02362<B, E> class023622) {
        return class04523.N(class023622).N_33(class02389.N()).N_10(class04540::N, class04540::u);
    }

    public static <E> class04540<E> N(E e) {
        return new class04540<E>(List.of(new class04523<E>(e, 1)));
    }

    public static <E> class04540<E> N() {
        return new class04540<E>(List.of());
    }

    private List<class04523<E>> N(Collection collection) {
        return collection.size() > 4 ? new HashedReferenceList(collection) : new ReferenceArrayList(collection);
    }

    public Optional<E> N(class06069 class060692) {
        if (this.u == null) {
            return Optional.empty();
        }
        int n = class060692.y(this.y);
        return Optional.of(this.u.N(n));
    }

    @SafeVarargs
    public static <E> class04540<E> N(class04523<E> ... class04523Array) {
        return new class04540<E>(List.of(class04523Array));
    }

    public static <E> Codec<class04540<E>> N(Codec<E> codec) {
        return class04523.N(codec).listOf().xmap(class04540::N, class04540::u);
    }

    public static <E> Codec<class04540<E>> N(MapCodec<E> mapCodec) {
        return class04523.N(mapCodec).listOf().xmap(class04540::N, class04540::u);
    }

    public <T> class04540<T> N(Function<E, T> function) {
        return new class04540<E>(Lists.transform(this.L, class045232 -> class045232.N(function)));
    }

    public static <E> class04540<E> N(List<class04523<E>> list) {
        return new class04540<E>(list);
    }
}

