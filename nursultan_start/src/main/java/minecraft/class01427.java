/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00142
 *  minecraft.class00809
 *  minecraft.class00891
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class07001
 */
package minecraft;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import minecraft.class00142;
import minecraft.class00809;
import minecraft.class00891;
import minecraft.class01392;
import minecraft.class01400;
import minecraft.class01408;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class07001;

public class class01427 {
    private Optional<class03543<class00891>> N = Optional.empty();
    private Optional<class01400> y = Optional.empty();
    private Optional<class00809> L = Optional.empty();
    private class00142 u = class00142.N;

    private class01427() {
    }

    public class01392 y() {
        return new class01392(this.N, this.y, this.L, this.u);
    }

    public class01427 N(class07001 class070012) {
        this.L = Optional.of(new class00809(class070012));
        return this;
    }

    public class01427 N(class01408 class014082) {
        this.y = class014082.y();
        return this;
    }

    public class01427 N(class00142 class001422) {
        this.u = class001422;
        return this;
    }

    public class01427 N(class02055<class00891> class020552, class03530<class00891> class035302) {
        this.N = Optional.of(class020552.y(class035302));
        return this;
    }

    public static class01427 N() {
        return new class01427();
    }

    public class01427 N(class02055<class00891> class020552, Collection<class00891> collection) {
        this.N = Optional.of(class03543.N(class00891::s, collection));
        return this;
    }

    public class01427 N(class02055<class00891> class020552, class00891 ... class00891Array) {
        return this.N(class020552, Arrays.asList(class00891Array));
    }
}

