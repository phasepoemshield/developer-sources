/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06363
 *  minecraft.class06366
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class04344;
import minecraft.class04355;
import minecraft.class04356;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06363;
import minecraft.class06366;
import minecraft.class06478;

interface class04361<T>
extends class04344<T> {
    @Override
    default public Function<class04370<T>, class06478> N(class04355<T> class043552, class05630 class056302, int n, int n2, int n3, Consumer<T> consumer) {
        return class043702 -> class06366.N_58(class043702.field_37864, class043702::method_41753).N(this.N()).N(class043552).N(n, n2, n3, 20, class043702.field_38280, (class063662, object) -> {
            this.R().set((class04370<Object>)class043702, object);
            class056302.Np();
            consumer.accept(object);
        });
    }

    public class06363<T> N();

    default public class04356<T> R() {
        return class04370::method_41748;
    }
}

