/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06517
 *  minecraft.class06525
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02500;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06517;
import minecraft.class06525;

public final class class02469
extends Record
implements class02465<class06517> {
    private final class03543<class06525> potions;
    public static final Codec<class02469> N = class03541.N((class05946)class04227.NW).xmap(class02469::new, class02469::N);

    public class02469(class03543<class06525> class035432) {
        this.potions = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02469.class, "potions", "potions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02469.class, "potions", "potions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02469.class, "potions", "potions"}, this);
    }

    @Override
    public class02477<class06517> y() {
        return class02484.h;
    }

    @Override
    public boolean N(class06517 class065172) {
        Optional var2 = class065172.i();
        return !var2.isEmpty() && this.potions.N((class03556)var2.get());
    }

    public class03543<class06525> N() {
        return this.potions;
    }

    public static class02500 N(class03543<class06525> class035432) {
        return new class02469(class035432);
    }
}

