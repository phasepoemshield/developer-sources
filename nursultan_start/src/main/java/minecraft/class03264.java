/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00177
 *  minecraft.class03674
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class08503
 *  minecraft.class08880
 *  minecraft.class08883
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Function;
import minecraft.class00177;
import minecraft.class03674;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class08503;
import minecraft.class08880;
import minecraft.class08883;

public final class class03264
extends Record {
    private final class04540<class03674> variants;

    public class03264(class04540<class03674> class045402) {
        if (class045402.L()) {
            throw new IllegalArgumentException("Variant list must contain at least one element");
        }
        this.variants = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03264.class, "variants", "variants"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03264.class, "variants", "variants"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03264.class, "variants", "variants"}, this);
    }

    public class04540<class03674> y() {
        return this.variants;
    }

    public class08880 N() {
        List var1 = this.variants.u();
        return var1.size() == 1 ? new class08883((class03674)((class04523)var1.getFirst()).N()) : new class00177(this.variants.N(class08883::new));
    }

    public class03264 N(class08503 class085032) {
        return new class03264((class04540<class03674>)this.variants.N((Function)class085032));
    }
}

