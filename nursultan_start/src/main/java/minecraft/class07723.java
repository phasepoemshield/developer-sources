/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class07709;

interface class07723 {
    public class07709 N();

    default public class07723 N(Stream<class07709> stream) {
        return this.N(stream::iterator);
    }

    default public class07723 N(Iterable<class07709> iterable) {
        class07723 class077232 = this;
        for (class07709 class077092 : iterable) {
            class077232 = class077232.N(class077092);
        }
        return class077232;
    }

    public class07723 N(class07709 var1);
}

