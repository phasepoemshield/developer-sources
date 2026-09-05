/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
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
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class01735
extends Record
implements class00381<class08051> {
    private final int slotId;
    private final int containerId;
    private final boolean newState;
    public static final class02362<class00667, class01735> N = class00381.N(class01735::N, class01735::new);

    public boolean L() {
        return this.newState;
    }

    private class01735(class00667 class006672) {
        this(class006672.E(), class006672.G(), class006672.readBoolean());
    }

    public class01735(int n, int n2, boolean bl) {
        this.slotId = n;
        this.containerId = n2;
        this.newState = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01735.class, "slotId;containerId;newState", "slotId", "containerId", "newState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01735.class, "slotId;containerId;newState", "slotId", "containerId", "newState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01735.class, "slotId;containerId;newState", "slotId", "containerId", "newState"}, this);
    }

    public int y() {
        return this.containerId;
    }

    private void N(class00667 class006672) {
        class006672.L(this.slotId);
        class006672.R(this.containerId);
        class006672.writeBoolean(this.newState);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_54436(this);
    }

    public int N() {
        return this.slotId;
    }

    public class02897<class01735> method_65080() {
        return class04248.yq;
    }
}

