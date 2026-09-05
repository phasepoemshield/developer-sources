/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00427
 *  minecraft.class00437
 *  minecraft.class00442
 *  minecraft.class00449
 *  minecraft.class00455
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06968
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07321
 */
package Nursultan;

import Nursultan.class10692;
import Nursultan.class10696;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00427;
import minecraft.class00437;
import minecraft.class00442;
import minecraft.class00449;
import minecraft.class00455;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06968;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;

public class class10701<T>
extends class06968<T> {
    private final Map<class07321, class10692<T>> y = new HashMap<class07321, class10692<T>>();
    private final Map<class07209, class10692<T>> L = new HashMap<class07209, class10692<T>>();
    private final Map<UUID, class10692<T>> u = new HashMap<UUID, class10692<T>>();

    public class10701(class00455<T> class004552) {
        super(class004552);
    }

    protected void y(class04770 class047702, class07321 class073212) {
        class10692<T> class106922 = this.y.get(class073212);
        if (class106922 != null && class106922.N != null) {
            class047702.field_13987.method_14364((class00381)new class00427(class073212, this.N.N(class106922.N)));
        }
        for (Map.Entry<class07209, class10692<T>> entry : this.L.entrySet()) {
            class07209 class072092;
            Object t = entry.getValue().N;
            if (t == null || !class073212.y(class072092 = entry.getKey())) continue;
            class047702.field_13987.method_14364((class00381)new class00437(class072092, this.N.N(t)));
        }
    }

    protected void y(class04770 class047702, class07049 class070492) {
        class10692<T> class106922 = this.u.get(class070492.method_5667());
        if (class106922 != null && class106922.N != null) {
            class047702.field_13987.method_14364((class00381)new class00449(class070492.method_5628(), this.N.N(class106922.N)));
        }
    }

    protected void y(class04782 class047822) {
        class07321 class073212;
        class00442<T> class004422;
        for (Map.Entry<class07321, class10692<T>> entry : this.y.entrySet()) {
            class004422 = entry.getValue().N(this.N);
            if (class004422 == null) continue;
            class073212 = entry.getKey();
            this.N(class047822, class073212, (class00381)new class00427(class073212, class004422));
        }
        for (Map.Entry<class07321, class10692<T>> entry : this.L.entrySet()) {
            class004422 = entry.getValue().N(this.N);
            if (class004422 == null) continue;
            class073212 = (class07209)entry.getKey();
            class07321 class073213 = new class07321((class07209)class073212);
            this.N(class047822, class073213, (class00381)new class00437((class07209)class073212, class004422));
        }
        for (Map.Entry<Object, class10692<T>> entry : this.u.entrySet()) {
            class004422 = entry.getValue().N(this.N);
            if (class004422 == null) continue;
            class073212 = Objects.requireNonNull(class047822.method_66347((UUID)entry.getKey()));
            this.N(class047822, (class07049)class073212, (class00381)new class00449(class073212.method_5628(), class004422));
        }
    }

    public void N(class04782 class047822, class07209 class072092) {
        if (this.L.remove(class072092) != null) {
            class07321 class073212 = new class07321(class072092);
            this.N(class047822, class073212, (class00381)new class00437(class072092, this.N.N()));
        }
    }

    public void N(class07049 class070492) {
        this.u.remove(class070492.method_5667());
    }

    public void N(UUID uUID, class10696<T> class106962) {
        this.u.put(uUID, new class10692<T>(class106962));
    }

    protected void N() {
        this.y.clear();
        this.L.clear();
        this.u.clear();
    }

    public void N(class07321 class073212) {
        this.y.remove(class073212);
        this.L.keySet().removeIf(arg_0 -> ((class07321)class073212).y(arg_0));
    }

    public void N(class07209 class072092, class10696<T> class106962) {
        this.L.put(class072092, new class10692<T>(class106962));
    }

    public void N(class07321 class073212, class10696<T> class106962) {
        this.y.put(class073212, new class10692<T>(class106962));
    }
}

