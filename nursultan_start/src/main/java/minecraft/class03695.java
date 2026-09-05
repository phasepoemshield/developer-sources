/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02102
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class02102;
import minecraft.class06478;

public interface class03695
extends class02102 {
    default public void N() {
        this.N(class021022 -> {
            if (class021022 instanceof class03695) {
                ((class03695)class021022).N();
            }
        });
    }

    public void N(Consumer<class02102> var1);

    default public void method_48206(Consumer<class06478> consumer) {
        this.N(class021022 -> class021022.method_48206(consumer));
    }
}

