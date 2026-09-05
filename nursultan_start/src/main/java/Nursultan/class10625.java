/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06581
 *  minecraft.class06584
 */
package Nursultan;

import minecraft.class02362;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06581;
import minecraft.class06584;

public class class10625
implements class02362<class04247, class06584> {
    final /* synthetic */ class02362 N;

    public class10625(class02362 class023622) {
        this.N = class023622;
    }

    public class06584 decode(class04247 class042472) {
        int n = class042472.E();
        if (n <= 0) {
            return class06584.E;
        }
        class03556 var3 = (class03556)class06581.i.decode((Object)class042472);
        class02678 class026782 = (class02678)this.N.decode((Object)class042472);
        return new class06584(var3, n, class026782);
    }

    public void encode(class04247 class042472, class06584 class065842) {
        if (class065842.R()) {
            class042472.L(0);
            return;
        }
        class042472.L(class065842.c());
        class06581.i.encode((Object)class042472, (Object)class065842.Z());
        this.N.encode((Object)class042472, (Object)class065842.W.M());
    }
}

