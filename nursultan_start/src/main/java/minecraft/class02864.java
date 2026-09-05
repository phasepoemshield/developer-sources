/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class03516
 *  minecraft.class05946
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00751;
import minecraft.class03516;
import minecraft.class05946;

class class02864 {
    private final Map<class05946<? extends class00751<?>>, class03516> N = new HashMap();

    class02864() {
    }

    public void N(class05946<? extends class00751<?>> class059462, class03516 class035162) {
        this.N.put(class059462, class035162);
    }

    public void N(BiConsumer<? super class05946<? extends class00751<?>>, ? super class03516> biConsumer) {
        this.N.forEach(biConsumer);
    }
}

