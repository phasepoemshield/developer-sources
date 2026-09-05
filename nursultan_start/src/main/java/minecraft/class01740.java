/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00743
 *  minecraft.class02903
 *  minecraft.class03729
 *  minecraft.class05857
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00743;
import minecraft.class02903;
import minecraft.class03729;
import minecraft.class05857;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

final class class01740
extends Record {
    private final class00743<class06584> key;
    private final int width;
    private final int height;
    private final @Nullable class03729<class05857> value;

    public int L() {
        return this.height;
    }

    class01740(class00743<class06584> class007432, int n, int n2, @Nullable class03729<class05857> class037292) {
        this.key = class007432;
        this.width = n;
        this.height = n2;
        this.value = class037292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01740.class, "key;width;height;value", "key", "width", "height", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01740.class, "key;width;height;value", "key", "width", "height", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01740.class, "key;width;height;value", "key", "width", "height", "value"}, this);
    }

    public @Nullable class03729<class05857> u() {
        return this.value;
    }

    public int y() {
        return this.width;
    }

    public boolean N(class02903 class029032) {
        if (this.width != class029032.R() || this.height != class029032.M()) {
            return false;
        }
        for (int i = 0; i < this.key.size(); ++i) {
            if (class06584.L((class06584)((class06584)this.key.get(i)), (class06584)class029032.N(i))) continue;
            return false;
        }
        return true;
    }

    public class00743<class06584> N() {
        return this.key;
    }
}

