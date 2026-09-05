/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class04907;
import minecraft.class04938;
import minecraft.class05946;

public class class04922<T>
implements Iterable<class04907<T>> {
    private final class00751<T> N;
    private final Map<T, class04907<T>> y = new IdentityHashMap<T, class04907<T>>();
    private final class00392 L;
    private final class02362<class04247, class04907<T>> u;

    public class00392 L() {
        return this.L;
    }

    public class04922(class00751<T> class007512, class00392 class003922) {
        this.N = class007512;
        this.L = class003922;
        this.u = class02389.N((class05946)class007512.i()).N_10(this::y, class04907::R);
    }

    @Override
    public Iterator<class04907<T>> iterator() {
        return this.y.values().iterator();
    }

    public class00751<T> y() {
        return this.N;
    }

    public class04907<T> y(T t) {
        return this.N(t, class04938.y);
    }

    public class02362<class04247, class04907<T>> N() {
        return this.u;
    }

    public boolean N(T t) {
        return this.y.containsKey(t);
    }

    public class04907<T> N(T t, class04938 class049382) {
        return this.y.computeIfAbsent(t, object -> new class04907<Object>(this, object, class049382));
    }
}

