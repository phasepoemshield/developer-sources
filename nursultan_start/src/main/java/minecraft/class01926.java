/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class04417
 *  minecraft.class06069
 *  minecraft.class06143
 *  minecraft.class07134
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01901;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;
import minecraft.class07134;

public final class class01926
extends Record
implements class04417<class07134> {
    private final class06143 sprite;

    public class01926(class06143 class061432) {
        this.sprite = class061432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01926.class, "sprite", "sprite"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01926.class, "sprite", "sprite"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01926.class, "sprite", "sprite"}, this);
    }

    public class04406 method_3090(class07134 class071342, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class01901 class019012 = new class01901(class034482, d, d2, d3, d4, d5, d6, this.sprite);
        class019012.method_74308(1.0f);
        class019012.method_34753(d4, d5, d6);
        class019012.method_3077(class060692.y(4) + 6);
        return class019012;
    }

    public class06143 N() {
        return this.sprite;
    }
}

