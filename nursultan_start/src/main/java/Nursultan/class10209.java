/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01929
 *  minecraft.class03515
 *  minecraft.class03542
 *  minecraft.class05946
 */
package Nursultan;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class00751;
import minecraft.class01929;
import minecraft.class03515;
import minecraft.class03542;
import minecraft.class05946;

public final class class10209
implements class03542 {
    private final class01929 N;
    private final Map<class05946<? extends class00751<?>>, Optional<? extends class03515<?>>> y = new ConcurrentHashMap();

    public class10209(class01929 class019292) {
        this.N = class019292;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class10209)) return false;
        class10209 class102092 = (class10209)object;
        if (!this.N.equals((Object)class102092.N)) return false;
        return true;
    }

    public int hashCode() {
        return this.N.hashCode();
    }

    private Optional<class03515<Object>> y(class05946<? extends class00751<?>> class059462) {
        return this.N.method_46759(class059462).map(class03515::N);
    }

    public <E> Optional<class03515<E>> N(class05946<? extends class00751<? extends E>> class059462) {
        return this.y.computeIfAbsent(class059462, this::y);
    }
}

