/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07707
 *  minecraft.class07709
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class08737;

class class08769
implements class08737 {
    final /* synthetic */ Supplier N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class08769(Supplier supplier) {
        this.N = supplier;
    }

    @Override
    public class07709 y() {
        return class07707.N((String)((String)this.N.get()));
    }

    @Override
    public String N() {
        return (String)this.N.get();
    }
}

