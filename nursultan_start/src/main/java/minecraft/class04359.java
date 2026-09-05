/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class04352;
import minecraft.class04355;
import minecraft.class04361;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06478;

interface class04359<T>
extends class04352<T>,
class04361<T> {
    public boolean i();

    @Override
    default public Function<class04370<T>, class06478> N(class04355<T> class043552, class05630 class056302, int n, int n2, int n3, Consumer<T> consumer) {
        if (this.i()) {
            return class04361.super.N(class043552, class056302, n, n2, n3, consumer);
        }
        return class04352.super.N(class043552, class056302, n, n2, n3, consumer);
    }
}

