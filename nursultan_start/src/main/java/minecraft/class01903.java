/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class05946;

public interface class01903<T>
extends class01921<T> {
    @Override
    default public class05946<? extends class00751<? extends T>> i() {
        return this.N().i();
    }

    @Override
    default public Stream<class03529<T>> z() {
        return this.N().z();
    }

    @Override
    default public Stream<class03552<T>> u() {
        return this.N().u();
    }

    @Override
    default public Optional<class03552<T>> N(class03530<T> class035302) {
        return this.N().N(class035302);
    }

    public class01921<T> N();

    @Override
    default public Optional<class03529<T>> N(class05946<T> class059462) {
        return this.N().N(class059462);
    }

    @Override
    default public Lifecycle R() {
        return this.N().R();
    }
}

