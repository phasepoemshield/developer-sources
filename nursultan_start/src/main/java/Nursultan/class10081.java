/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class03515
 *  minecraft.class03542
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Map;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class05946;

public class class10081
implements class03542 {
    final /* synthetic */ Map N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10081(Map map) {
        this.N = map;
    }

    public <T> Optional<class03515<T>> N(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.ofNullable((class03515)this.N.get(class059462));
    }
}

