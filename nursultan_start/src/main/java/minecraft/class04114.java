/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02042
 *  minecraft.class02053
 *  minecraft.class03529
 *  minecraft.class05946
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class02042;
import minecraft.class02053;
import minecraft.class03529;
import minecraft.class05946;

class class04114
extends class02053<Object> {
    final Map<class05946<Object>, class03529<Object>> N = new HashMap<class05946<Object>, class03529<Object>>();

    <T> class03529<T> L(class05946<T> class059463) {
        return this.N.computeIfAbsent(class059463, class059462 -> class03529.N_40((class02042)this.u, (class05946)class059462));
    }

    public class04114(class02042<Object> class020422) {
        super(class020422);
    }

    public Optional<class03529<Object>> N(class05946<Object> class059462) {
        return Optional.of(this.L(class059462));
    }
}

