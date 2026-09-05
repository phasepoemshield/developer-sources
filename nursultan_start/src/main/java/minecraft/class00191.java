/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00751
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class02063
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03542
 *  minecraft.class03552
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00187;
import minecraft.class00188;
import minecraft.class00203;
import minecraft.class00216;
import minecraft.class00751;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class02063;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03542;
import minecraft.class03552;
import minecraft.class05946;

public class class00191
implements class02063 {
    final class01929 N;
    final class00188 y = new class00188(this);
    final Map<class05946<Object>, class03529<Object>> L = new HashMap<class05946<Object>, class03529<Object>>();
    final Map<class03530<Object>, class03552<Object>> u = new HashMap<class03530<Object>, class03552<Object>>();

    public class00191(class01929 class019292) {
        this.N = class019292;
    }

    public boolean y() {
        return !this.L.isEmpty() || !this.u.isEmpty();
    }

    public class00203 N() {
        return new class00216(this);
    }

    public <V> class03519<V> N(DynamicOps<V> dynamicOps) {
        return class03519.N(dynamicOps, (class03542)new class00187(this));
    }

    public <T> Optional<? extends class02055<T>> method_46759(class05946<? extends class00751<? extends T>> class059462) {
        return Optional.of(this.y.N());
    }
}

