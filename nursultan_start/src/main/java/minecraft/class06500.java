/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00263
 *  minecraft.class03767
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06528
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00263;
import minecraft.class03767;
import minecraft.class05946;
import minecraft.class06482;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06528;

public class class06500
implements Consumer<class06521<?>> {
    final class05946<class00263> N;
    private final class06528 y;
    private final List<class06510> L = new ArrayList<class06510>();

    protected class06500(class05946<class00263> class059462, class06528 class065282) {
        this.N = class059462;
        this.y = class065282;
    }

    @Override
    public void accept(class06521<?> class065212) {
        this.y.apply(class065212).ifPresent(this.L::add);
    }

    public class00263 N(class03767 class037672) {
        return class00263.N(class06482.N(class037672, this.L));
    }
}

