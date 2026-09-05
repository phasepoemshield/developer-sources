/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class02477
 *  minecraft.class02666
 *  minecraft.class02695
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.Set;
import minecraft.class00394;
import minecraft.class02477;
import minecraft.class02666;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public class class09358
implements class02666 {
    final /* synthetic */ Set N;
    final /* synthetic */ class02695 y;

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        this.N.add(class024772);
        return (T)this.y.method_58694(class024772);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09358(class00394 class003942, Set set, class02695 class026952) {
        this.N = set;
        this.y = class026952;
    }

    public <T> T a_(class02477<? extends T> class024772, T t) {
        this.N.add(class024772);
        return (T)this.y.a_(class024772, t);
    }
}

