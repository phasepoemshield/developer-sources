/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10783
 *  minecraft.class01903
 *  minecraft.class01921
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03552
 */
package minecraft;

import Nursultan.class10783;
import java.util.Optional;
import minecraft.class01903;
import minecraft.class01921;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03552;

public class class07681<T>
implements class01903<T> {
    final /* synthetic */ class01921 N;

    public class07681(class10783 class107832, class01921 class019212) {
        this.N = class019212;
    }

    public class03552<T> y(class03530<T> class035302) {
        return this.N().N(class035302).orElseGet(() -> class03543.N(this.N(), (class03530)class035302));
    }

    public class01921<T> N() {
        return this.N;
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        return Optional.of(this.y(class035302));
    }
}

