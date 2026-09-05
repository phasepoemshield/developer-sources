/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00142
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class06581
 *  minecraft.class07310
 */
package minecraft;

import java.util.Optional;
import minecraft.class00142;
import minecraft.class00836;
import minecraft.class00845;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class06581;
import minecraft.class07310;

public class class00837 {
    private Optional<class03543<class06581>> N = Optional.empty();
    private class00836 y = class00836.L;
    private class00142 L = class00142.N;

    public class00845 y() {
        return new class00845(this.N, this.y, this.L);
    }

    public class00837 N(class00142 class001422) {
        this.L = class001422;
        return this;
    }

    public class00837 N(class00836 class008362) {
        this.y = class008362;
        return this;
    }

    public class00837 N(class02055<class06581> class020552, class03530<class06581> class035302) {
        this.N = Optional.of(class020552.y(class035302));
        return this;
    }

    public class00837 N(class02055<class06581> class020552, class07310 ... class07310Array) {
        this.N = Optional.of(class03543.N(class073102 -> class073102.B().i(), (Object[])class07310Array));
        return this;
    }

    public static class00837 N() {
        return new class00837();
    }
}

