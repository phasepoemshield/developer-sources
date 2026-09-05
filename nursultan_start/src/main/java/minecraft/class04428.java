/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class05946;

public interface class04428<T>
extends Predicate<class03556<T>> {
    public String y();

    public <E> Optional<class04428<E>> N(class05946<? extends class00751<E>> var1);

    public Either<class05946<T>, class03530<T>> N();
}

