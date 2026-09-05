/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09174
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  minecraft.class00161
 *  minecraft.class00381
 *  minecraft.class00479
 *  minecraft.class00496
 *  minecraft.class00524
 *  minecraft.class02480
 *  minecraft.class02580
 *  minecraft.class02723
 *  minecraft.class06584
 *  minecraft.class07482
 */
package minecraft;

import Nursultan.class09174;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.List;
import minecraft.class00161;
import minecraft.class00381;
import minecraft.class00479;
import minecraft.class00496;
import minecraft.class00524;
import minecraft.class02480;
import minecraft.class02580;
import minecraft.class02723;
import minecraft.class04768;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07482;

class class04765
implements class02723 {
    private final LoadingCache<class02480<?>, Integer> y = CacheBuilder.newBuilder().maximumSize(256L).build((CacheLoader)new class04768(this));
    final /* synthetic */ class04770 N;

    class04765(class04770 class047702) {
        this.N = class047702;
    }

    private void y(class07482 class074822, int n, int n2) {
        this.N.field_13987.method_14364((class00381)new class00479(class074822.b, n, n2));
    }

    public class00161 N() {
        return new class09174(arg_0 -> this.y.getUnchecked(arg_0));
    }

    public void N(class07482 class074822, int n, int n2) {
        this.y(class074822, n, n2);
    }

    public void N(class07482 class074822, class06584 class065842) {
        this.N.field_13987.method_14364((class00381)new class02580(class065842));
    }

    public void N(class07482 class074822, int n, class06584 class065842) {
        this.N.field_13987.method_14364((class00381)new class00496(class074822.b, class074822.U(), n, class065842));
    }

    public void N(class07482 class074822, List<class06584> list, class06584 class065842, int[] nArray) {
        this.N.field_13987.method_14364((class00381)new class00524(class074822.b, class074822.U(), list, class065842));
        for (int i = 0; i < nArray.length; ++i) {
            this.y(class074822, i, nArray[i]);
        }
    }
}

