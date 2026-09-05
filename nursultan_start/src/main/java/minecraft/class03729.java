/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  minecraft.class02362
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06521
 */
package minecraft;

import minecraft.class02362;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06521;

public final class class03729<T extends class06521<?>>
extends Record {
    private final class05946<class06521<?>> y;
    private final T L;
    public static final class02362<class04247, class03729<?>> N = class02362.N((class02362)class05946.y((class05946)class04227.yV), class03729::N, (class02362)class06521.B, class03729::y, class03729::new);

    public class03729(class05946<class06521<?>> class059462, T t) {
        this.y = class059462;
        this.L = t;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class03729)) return false;
        class03729 class037292 = (class03729)((Object)object);
        if (this.y != class037292.y) return false;
        return true;
    }

    public String toString() {
        return this.y.toString();
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public T y() {
        return this.L;
    }

    public class05946<class06521<?>> N() {
        return this.y;
    }
}

