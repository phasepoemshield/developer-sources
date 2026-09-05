/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06986
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class06976;
import minecraft.class06986;
import minecraft.class07209;
import minecraft.class07321;

class class06980<V> {
    final class06976<class07321, V> N = new class06976();
    final class06976<class07209, V> y = new class06976();
    final class06976<UUID, V> L = new class06976();
    final List<class06986<V>> u = new ArrayList<class06986<V>>();

    class06980() {
    }

    public void N(class07321 class073212) {
        this.N.N(class073212);
        this.y.y(arg_0 -> ((class07321)class073212).y(arg_0));
    }

    public void N(long l) {
        Predicate<class06986> predicate = class069862 -> class069862.N(l);
        this.N.N((class07321)predicate);
        this.y.N((class07209)predicate);
        this.L.N((UUID)((Object)predicate));
        this.u.removeIf(predicate);
    }
}

