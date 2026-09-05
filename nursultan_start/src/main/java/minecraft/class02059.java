/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class03529
 *  minecraft.class04113
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class02042;
import minecraft.class03529;
import minecraft.class04113;
import minecraft.class05946;

class class02059<T>
extends class04113<T> {
    final /* synthetic */ class05946 N;
    final /* synthetic */ Lifecycle y;
    final /* synthetic */ Map L;

    class02059(class02042 class020422, class05946 class059462, Lifecycle lifecycle, Map map) {
        this.N = class059462;
        this.y = lifecycle;
        this.L = map;
        super(class020422);
    }

    public class05946<? extends class00751<? extends T>> i() {
        return this.N;
    }

    public Stream<class03529<T>> z() {
        return this.L.values().stream();
    }

    public Optional<class03529<T>> N(class05946<T> class059462) {
        return Optional.ofNullable((class03529)this.L.get(class059462));
    }

    public Lifecycle R() {
        return this.y;
    }
}

