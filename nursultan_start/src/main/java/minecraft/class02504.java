/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02471;
import minecraft.class02477;
import minecraft.class02480;

public class class02504 {
    private final List<class02480<?>> N = new ArrayList();

    class02504() {
    }

    public class02471 N() {
        return new class02471(List.copyOf(this.N));
    }

    public <T> class02504 N(class02477<? super T> class024772, T t) {
        Iterator<class02480<?>> var3 = this.N.iterator();
        while (var3.hasNext()) {
            if (var3.next().N() != class024772) continue;
            throw new IllegalArgumentException("Predicate already has component of type: '" + String.valueOf(class024772) + "'");
        }
        this.N.add(new class02480<T>(class024772, t));
        return this;
    }

    public <T> class02504 N(class02480<T> class024802) {
        return this.N(class024802.N(), class024802.y());
    }
}

