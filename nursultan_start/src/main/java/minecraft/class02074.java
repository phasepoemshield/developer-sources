/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09558
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00751
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class03542
 *  minecraft.class04132
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class09558;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class03542;
import minecraft.class04132;
import minecraft.class05946;

public class class02074
implements class01929 {
    final /* synthetic */ Map N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class02074(Map map) {
        this.N = map;
    }

    public Stream<class05946<? extends class00751<?>>> y() {
        return this.N.keySet().stream();
    }

    public <V> class03519<V> N(DynamicOps<V> dynamicOps) {
        return class03519.N(dynamicOps, (class03542)new class09558(this));
    }

    public <T> Optional<class04132<T>> N(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.ofNullable((class04132)this.N.get(class059462));
    }

    public <T> Optional<class01921<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return this.N(class059462).map(class04132::N);
    }
}

