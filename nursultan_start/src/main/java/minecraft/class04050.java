/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01034
 *  minecraft.class04297
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04297;
import minecraft.class06069;
import minecraft.class07209;

public abstract class class04050
extends class04297 {
    protected abstract boolean y(class01034 var1, class06069 var2, class07209 var3);

    public final Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        if (this.y(class010342, class060692, class072092)) {
            return Stream.of(class072092);
        }
        return Stream.of(new class07209[0]);
    }
}

