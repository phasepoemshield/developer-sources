/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.List;
import minecraft.class03805;
import minecraft.class03821;
import minecraft.class03824;
import minecraft.class03834;
import minecraft.class03837;
import minecraft.class03843;
import minecraft.class03845;

class class03816
implements class03805 {
    final /* synthetic */ List N;
    final /* synthetic */ List y;
    final /* synthetic */ class03837 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03816(class03837 class038372, List list, List list2) {
        this.L = class038372;
        this.N = list;
        this.y = list2;
    }

    @Override
    public List<class03821> y() {
        return this.N.stream().map(class038452 -> new class03821(class038452.N, class038452.u)).toList();
    }

    @Override
    public void N(boolean bl) {
        if (!bl) {
            this.N.clear();
            for (class03845 class038452 : this.L.y) {
                switch (class038452.M.ordinal()) {
                    case 2: {
                        this.N.add(class038452);
                        break;
                    }
                    case 1: {
                        class038452.M = class03843.field_47639;
                        class038452.N(class03834.field_47652);
                        break;
                    }
                    case 0: {
                        class038452.N(class03834.field_47654);
                    }
                }
            }
            this.L.N();
        } else {
            for (class03845 class038453 : this.L.y) {
                if (class038453.M != class03843.field_47640) continue;
                class038453.M = class03843.field_47639;
            }
        }
    }

    @Override
    public void N() {
        for (class03845 class038452 : this.N) {
            class038452.M = class03843.field_47641;
            if (class038452.i != null) continue;
            this.L.N.N(class038452.N, class03824.field_47624);
        }
        for (class03845 class038452 : this.y) {
            class038452.M = class03843.field_47639;
        }
        this.L.N();
    }
}

