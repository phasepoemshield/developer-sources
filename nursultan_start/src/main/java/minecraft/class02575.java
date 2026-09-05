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

public final class class02575
extends Record
implements class00381<class08051> {
    private final int slotId;
    private final int selectedItemIndex;
    public static final class02362<class00667, class02575> N = class00381.N(class02575::N, class02575::new);

    private class02575(class00667 class006672) {
        this(class006672.E(), class006672.E());
        if (this.selectedItemIndex < 0 && this.selectedItemIndex != -1) {
            throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.selectedItemIndex);
        }
    }

    public class02575(int n, int n2) {
        this.slotId = n;
        this.selectedItemIndex = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02575.class, "slotId;selectedItemIndex", "slotId", "selectedItemIndex"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02575.class, "slotId;selectedItemIndex", "slotId", "selectedItemIndex"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02575.class, "slotId;selectedItemIndex", "slotId", "selectedItemIndex"}, this);
    }

    public int y() {
        return this.selectedItemIndex;
    }

    private void N(class00667 class006672) {
        class006672.L(this.slotId);
        class006672.L(this.selectedItemIndex);
    }

    public int N() {
        return this.slotId;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_61220(this);
    }

    public class02897<class02575> method_65080() {
        return class04248.yj;
    }
}

