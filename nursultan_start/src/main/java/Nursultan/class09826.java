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
import minecraft.class02477;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09826
implements class02695 {
    final /* synthetic */ class02695 L;
    final /* synthetic */ class02695 u;

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        Object object = this.L.method_58694(class024772);
        if (object != null) {
            return (T)object;
        }
        return (T)this.u.method_58694(class024772);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09826(class02695 class026952, class02695 class026953) {
        this.L = class026952;
        this.u = class026953;
    }

    public Set<class02477<?>> y() {
        return Sets.union((Set)this.u.y(), (Set)this.L.y());
    }
}

