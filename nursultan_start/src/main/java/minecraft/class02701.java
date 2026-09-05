/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00412
 *  minecraft.class02055
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class06563
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00412;
import minecraft.class02055;
import minecraft.class02708;
import minecraft.class02717;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class06563;

public class class02701 {
    private final ImmutableList.Builder<class02717> N = ImmutableList.builder();

    public class02701 N(class02717 class027172) {
        this.N.add((Object)class027172);
        return this;
    }

    public class02701 N(class02708 class027082) {
        this.N.addAll(class027082.y());
        return this;
    }

    public class02708 N() {
        return new class02708((List<class02717>)this.N.build());
    }

    public class02701 N(class03556<class00412> class035562, class06563 class065632) {
        return this.N(new class02717(class035562, class065632));
    }

    @Deprecated
    public class02701 N(class02055<class00412> class020552, class05946<class00412> class059462, class06563 class065632) {
        Optional optional = class020552.N(class059462);
        if (optional.isEmpty()) {
            class02708.y.warn("Unable to find banner pattern with id: '{}'", (Object)class059462.N());
            return this;
        }
        return this.N((class03556<class00412>)((class03556)optional.get()), class065632);
    }
}

