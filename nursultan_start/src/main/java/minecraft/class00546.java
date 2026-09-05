/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class00546
extends Record
implements class00381<class08051> {
    private final int containerId;
    private final int buttonId;
    public static final class02362<class00667, class00546> N = class02362.N((class02362)class02389.l, class00546::N, (class02362)class02389.B, class00546::y, class00546::new);

    public class00546(int n, int n2) {
        this.containerId = n;
        this.buttonId = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00546.class, "containerId;buttonId", "containerId", "buttonId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00546.class, "containerId;buttonId", "containerId", "buttonId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00546.class, "containerId;buttonId", "containerId", "buttonId"}, this);
    }

    public int y() {
        return this.buttonId;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12055(this);
    }

    public int N() {
        return this.containerId;
    }

    public class02897<class00546> method_65080() {
        return class04248.yI;
    }
}

