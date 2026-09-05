/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02854
 *  minecraft.class06584
 */
package minecraft;

import java.util.List;
import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02854;
import minecraft.class02928;
import minecraft.class06584;

class class02948
implements class02928<class02854> {
    @Override
    public class02854 y() {
        return class02854.N;
    }

    class02948() {
    }

    @Override
    public class02854 N(class02854 class028542, Stream<class06584> stream) {
        return class02854.N((List)stream.toList());
    }

    @Override
    public class02477<class02854> N() {
        return class02484.NG;
    }

    @Override
    public Stream<class06584> N(class02854 class028542) {
        return class028542.y();
    }
}

