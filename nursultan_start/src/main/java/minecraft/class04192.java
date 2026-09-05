/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class07209
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class07209;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class04192
extends Record {
    private final String id;
    public static final class04192 N = new class04192("generic");
    public static final class04192 y = new class04192("ladder");
    public static final class04192 L = new class04192("vines");
    public static final class04192 u = new class04192("weeping_vines");
    public static final class04192 i = new class04192("twisting_vines");
    public static final class04192 R = new class04192("scaffolding");
    public static final class04192 M = new class04192("other_climbable");
    public static final class04192 B = new class04192("water");

    public class04192(String string) {
        this.id = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04192.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04192.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04192.class, "id", "id"}, this);
    }

    public String y() {
        return this.id;
    }

    public static @Nullable class04192 N(class07438 class074382) {
        Optional var1 = class074382.method_24832();
        if (var1.isPresent()) {
            return class04192.N(class074382.method_73183().method_8320((class07209)var1.get()));
        }
        if (class074382.method_5799()) {
            return B;
        }
        return null;
    }

    public static class04192 N(class00500 class005002) {
        if (class005002.N(class00869.uW) || class005002.N(class01210.X)) {
            return y;
        }
        if (class005002.N(class00869.Rc)) {
            return L;
        }
        if (class005002.N(class00869.sl) || class005002.N(class00869.sd)) {
            return u;
        }
        if (class005002.N(class00869.sw) || class005002.N(class00869.sk)) {
            return i;
        }
        if (class005002.N(class00869.Pa)) {
            return R;
        }
        return M;
    }

    public String N() {
        return "death.fell.accident." + this.id;
    }
}

