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
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01904;
import minecraft.class01928;
import minecraft.class03448;
import minecraft.class04406;
import minecraft.class04417;
import minecraft.class06069;
import minecraft.class06143;

public final class class01932
extends Record
implements class04417<class01904> {
    private final class06143 sprite;

    public class01932(class06143 class061432) {
        this.sprite = class061432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01932.class, "sprite", "sprite"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01932.class, "sprite", "sprite"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01932.class, "sprite", "sprite"}, this);
    }

    public class04406 method_3090(class01904 class019042, class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06069 class060692) {
        class01928 class019282 = new class01928(class034482, d, d2, d3, d4, d5, d6, this.sprite);
        class019282.method_74308(1.0f);
        class019282.method_34753(d4, d5, d6);
        class019282.field_62638 = class019042.N();
        class019282.field_62637 = class019042.N();
        class019282.method_3077(class060692.y(12) + 8);
        return class019282;
    }

    public class06143 N() {
        return this.sprite;
    }
}

