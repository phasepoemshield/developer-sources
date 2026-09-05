/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  minecraft.class06929
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import minecraft.class00311;
import minecraft.class06929;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public class class00289 {
    private final Map<class07491<?>, Object> N = new IdentityHashMap();

    public <T> @Nullable T y(class07491<T> class074912) {
        return (T)this.N.get(class074912);
    }

    public <T> class00289 y(class07491<T> class074912, @Nullable T t) {
        if (t == null) {
            this.N.remove(class074912);
        } else {
            this.N.put(class074912, t);
        }
        return this;
    }

    public class00311 N(class06929 class069292) {
        Sets.SetView var2 = Sets.difference(this.N.keySet(), (Set)class069292.y());
        if (!var2.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + String.valueOf(var2));
        }
        Sets.SetView var3 = Sets.difference((Set)class069292.N(), this.N.keySet());
        if (!var3.isEmpty()) {
            throw new IllegalArgumentException("Missing required parameters: " + String.valueOf(var3));
        }
        return new class00311(this.N);
    }

    public <T> T N(class07491<T> class074912) {
        Object object = this.N.get(class074912);
        if (object == null) {
            throw new NoSuchElementException(class074912.N().toString());
        }
        return (T)object;
    }

    public <T> class00289 N(class07491<T> class074912, T t) {
        this.N.put(class074912, t);
        return this;
    }
}

