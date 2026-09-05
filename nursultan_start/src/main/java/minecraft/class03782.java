/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00751
 *  minecraft.class03529
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00751;
import minecraft.class03529;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class05946;

public interface class03782<T>
extends Predicate<class03556<T>> {
    public String y();

    public <E> Optional<class03782<E>> N(class05946<? extends class00751<E>> var1);

    public Either<class03529<T>, class03552<T>> N();
}

