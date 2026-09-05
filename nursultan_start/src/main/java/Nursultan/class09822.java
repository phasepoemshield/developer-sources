/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class02477
 *  minecraft.class02695
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class02477;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09822
implements class02695 {
    final /* synthetic */ Predicate L;
    final /* synthetic */ class02695 u;

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        return (T)(this.L.test(class024772) ? this.u.method_58694(class024772) : null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09822(class02695 class026952, Predicate predicate) {
        this.u = class026952;
        this.L = predicate;
    }

    public Set<class02477<?>> y() {
        return Sets.filter((Set)this.u.y(), this.L::test);
    }
}

