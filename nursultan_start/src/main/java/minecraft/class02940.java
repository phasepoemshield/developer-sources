/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02822
 *  minecraft.class02830
 *  minecraft.class06584
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02822;
import minecraft.class02830;
import minecraft.class02928;
import minecraft.class06584;

class class02940
implements class02928<class02830> {
    @Override
    public class02830 y() {
        return class02830.N;
    }

    class02940() {
    }

    @Override
    public class02830 N(class02830 class028302, Stream<class06584> stream) {
        class02822 class028222 = new class02822(class028302).N();
        stream.forEach(arg_0 -> ((class02822)class028222).N(arg_0));
        return class028222.u();
    }

    @Override
    public class02477<class02830> N() {
        return class02484.D;
    }

    @Override
    public Stream<class06584> N(class02830 class028302) {
        return class028302.y();
    }
}

