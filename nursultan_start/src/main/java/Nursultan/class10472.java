/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06584
 */
package Nursultan;

import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class04803;
import minecraft.class06584;

public class class10472
implements class04803 {
    final /* synthetic */ Supplier N;
    final /* synthetic */ Consumer y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10472(Supplier supplier, Consumer consumer) {
        this.N = supplier;
        this.y = consumer;
    }

    public class06584 N() {
        return (class06584)this.N.get();
    }

    public boolean N(class06584 class065842) {
        this.y.accept(class065842);
        return true;
    }
}

