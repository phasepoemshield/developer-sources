/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class02036
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class04116
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import minecraft.class00751;
import minecraft.class02036;
import minecraft.class02055;
import minecraft.class02082;
import minecraft.class03529;
import minecraft.class04116;
import minecraft.class05946;

class class02064<T>
implements class04116<T> {
    final /* synthetic */ class02036 N;

    class02064(class02036 class020362) {
        this.N = class020362;
    }

    public class03529<T> N(class05946<T> class059462, T t, Lifecycle lifecycle) {
        class02082<T> var4 = this.N.B().put(class059462, new class02082<T>(t, lifecycle));
        if (var4 != null) {
            this.N.Z().add(new IllegalStateException("Duplicate registration for " + String.valueOf(class059462) + ", new=" + String.valueOf(t) + ", old=" + String.valueOf(var4.N())));
        }
        return this.N.R().L(class059462);
    }

    public <S> class02055<S> N(class05946<? extends class00751<? extends S>> class059462) {
        return (class02055)this.N.M().getOrDefault(class059462.N(), this.N.R());
    }
}

