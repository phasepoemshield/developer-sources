/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class05946
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class05946;

public interface class01905<T>
extends class02055<T> {
    default public Stream<class05946<T>> n() {
        return this.z().map(class03529::B);
    }

    default public Stream<class03530<T>> t() {
        return this.u().map(class03552::B);
    }

    public Stream<class03529<T>> z();

    public Stream<class03552<T>> u();
}

