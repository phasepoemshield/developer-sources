/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02204
 *  minecraft.class02362
 *  minecraft.class03252
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01929;
import minecraft.class02204;
import minecraft.class02362;
import minecraft.class03252;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class08551
extends Record {
    private final class02204<class03252> material;
    public static final Codec<class08551> N = class02204.N((class05946)class04227.yw, (Codec)class03252.L).xmap(class08551::new, class08551::N);
    public static final class02362<class04247, class08551> y = class02204.N((class05946)class04227.yw, (class02362)class03252.u).N_10(class08551::new, class08551::N);

    public class08551(class02204<class03252> class022042) {
        this.material = class022042;
    }

    @Deprecated
    public class08551(class05946<class03252> class059462) {
        this((class02204<class03252>)new class02204(class059462));
    }

    public class08551(class03556<class03252> class035562) {
        this((class02204<class03252>)new class02204(class035562));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08551.class, "material", "material"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08551.class, "material", "material"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08551.class, "material", "material"}, this);
    }

    public class02204<class03252> N() {
        return this.material;
    }

    public Optional<class03556<class03252>> N(class01929 class019292) {
        return this.material.N(class019292);
    }
}

