/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01034
 *  minecraft.class04297
 *  minecraft.class07209
 */
package minecraft;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04297;
import minecraft.class06069;
import minecraft.class07209;

public abstract class class06041
extends class04297 {
    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        return IntStream.range(0, this.N(class060692, class072092)).mapToObj(n -> class072092);
    }

    protected abstract int N(class06069 var1, class07209 var2);
}

