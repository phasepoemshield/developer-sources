/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00731
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class05946
 */
package minecraft;

import java.util.Optional;
import minecraft.class00731;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class05946;

class class00745<T>
implements class02055<T> {
    final /* synthetic */ class00731 N;

    class00745(class00731 class007312) {
        this.N = class007312;
    }

    public class03552<T> y(class03530<T> class035302) {
        return this.N.L(class035302);
    }

    public class03529<T> y(class05946<T> class059462) {
        return this.N.u(class059462);
    }

    public Optional<class03552<T>> N(class03530<T> class035302) {
        return Optional.of(this.y(class035302));
    }

    public Optional<class03529<T>> N(class05946<T> class059462) {
        return Optional.of(this.y(class059462));
    }
}

