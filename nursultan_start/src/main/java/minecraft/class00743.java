/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.NonNullListAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.caffeinemc.mods.lithium.mixin.block.hopper.NonNullListAccessor;
import org.jspecify.annotations.Nullable;

public class class00743<E>
extends AbstractList<E>
implements NonNullListAccessor {
    private final List<E> field_11115;
    private final @Nullable E field_11116;

    public /* synthetic */ List getDelegate() {
        return this.field_11115;
    }

    public class00743(List<E> list, @Nullable E e) {
        this.field_11115 = list;
        this.field_11116 = e;
    }

    @Override
    public E remove(int n) {
        return this.field_11115.remove(n);
    }

    @Override
    public int size() {
        return this.field_11115.size();
    }

    @Override
    public E get(int n) {
        return this.field_11115.get(n);
    }

    @Override
    public void clear() {
        if (this.field_11116 == null) {
            super.clear();
        } else {
            for (int i = 0; i < this.size(); ++i) {
                this.set(i, this.field_11116);
            }
        }
    }

    @Override
    public void add(int n, E e) {
        Objects.requireNonNull(e);
        this.field_11115.add(n, e);
    }

    @Override
    public E set(int n, E e) {
        Objects.requireNonNull(e);
        return this.field_11115.set(n, e);
    }

    public static <E> class00743<E> method_10213(int n, E e) {
        Objects.requireNonNull(e);
        Object[] objectArray = new Object[n];
        Arrays.fill(objectArray, e);
        return new class00743<Object>(Arrays.asList(objectArray), e);
    }

    public static <E> class00743<E> method_10211() {
        return new class00743<Object>(Lists.newArrayList(), null);
    }

    @SafeVarargs
    public static <E> class00743<E> method_10212(E e, E ... EArray) {
        return new class00743<E>(Arrays.asList(EArray), e);
    }

    public static <E> class00743<E> method_37434(int n) {
        return new class00743<Object>(Lists.newArrayListWithCapacity((int)n), null);
    }
}

