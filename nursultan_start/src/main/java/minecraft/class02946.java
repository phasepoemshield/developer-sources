/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class06584
 */
package minecraft;

import java.util.List;
import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class02928;
import minecraft.class06584;

class class02946
implements class02928<class02820> {
    @Override
    public class02820 y() {
        return class02820.N;
    }

    class02946() {
    }

    @Override
    public class02820 N(class02820 class028202, Stream<class06584> stream) {
        return class02820.N((List)stream.toList());
    }

    @Override
    public class02477<class02820> N() {
        return class02484.x;
    }

    @Override
    public Stream<class06584> N(class02820 class028202) {
        return class028202.N().stream();
    }
}

