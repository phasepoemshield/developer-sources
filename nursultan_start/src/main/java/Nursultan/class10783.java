/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01903
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07681
 */
package Nursultan;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07681;

public class class10783
implements class04348 {
    final /* synthetic */ class01929 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10783(class01929 class019292) {
        this.N = class019292;
    }

    public Stream<class05946<? extends class00751<?>>> y() {
        return this.N.y();
    }

    public class03767 N() {
        return class03794.i.N();
    }

    private <T> class01903<T> N(class01921<T> class019212) {
        return new class07681(this, class019212);
    }

    public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return this.N.method_46759(class059462).map(this::N);
    }
}

