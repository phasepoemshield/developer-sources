/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class03529
 *  minecraft.class05946
 */
package minecraft;

import java.util.Optional;
import minecraft.class00751;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class05946;

public interface class02063 {
    default public <T> class02055<T> L(class05946<? extends class00751<? extends T>> class059462) {
        return this.method_46759(class059462).orElseThrow(() -> new IllegalStateException("Registry " + String.valueOf(class059462.N()) + " not found"));
    }

    default public <T> class03529<T> i(class05946<T> class059462) {
        return (class03529)this.method_46759(class059462.L()).flatMap(class020552 -> class020552.N(class059462)).orElseThrow(() -> new IllegalStateException("Missing element " + String.valueOf(class059462)));
    }

    default public <T> Optional<class03529<T>> u(class05946<T> class059462) {
        return this.method_46759(class059462.L()).flatMap(class020552 -> class020552.N(class059462));
    }

    public <T> Optional<? extends class02055<T>> method_46759(class05946<? extends class00751<? extends T>> var1);
}

