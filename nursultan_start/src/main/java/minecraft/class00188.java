/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02042
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03552
 *  minecraft.class05946
 */
package minecraft;

import java.util.Optional;
import minecraft.class00191;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03552;
import minecraft.class05946;

class class00188
implements class02042<Object>,
class02055<Object> {
    final /* synthetic */ class00191 N;

    private class03552<Object> L(class03530<Object> class035303) {
        return this.N.u.computeIfAbsent(class035303, class035302 -> class03543.N((class02042)this, (class03530)class035302));
    }

    private class03529<Object> L(class05946<Object> class059463) {
        return this.N.L.computeIfAbsent(class059463, class059462 -> class03529.N_40((class02042)this, (class05946)class059462));
    }

    class00188(class00191 class001912) {
        this.N = class001912;
    }

    public class03552<Object> y(class03530<Object> class035302) {
        return this.L(class035302);
    }

    public class03529<Object> y(class05946<Object> class059462) {
        return this.L(class059462);
    }

    public <T> class02042<T> y() {
        return this;
    }

    public Optional<class03552<Object>> N(class03530<Object> class035302) {
        return Optional.of(this.L(class035302));
    }

    public Optional<class03529<Object>> N(class05946<Object> class059462) {
        return Optional.of(this.L(class059462));
    }

    public <T> class02055<T> N() {
        return this;
    }
}

