/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06584
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06584;
import minecraft.class08051;

public final class class07346
extends Record
implements class00381<class08051> {
    private final short slotNum;
    private final class06584 itemStack;
    public static final class02362<class04247, class07346> N = class02362.N((class02362)class02389.i, class07346::N, (class02362)class06584.N((class02362)class06584.Z), class07346::y, class07346::new);

    public class07346(int n, class06584 class065842) {
        this((short)n, class065842);
    }

    public class07346(short s, class06584 class065842) {
        this.slotNum = s;
        this.itemStack = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07346.class, "slotNum;itemStack", "slotNum", "itemStack"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07346.class, "slotNum;itemStack", "slotNum", "itemStack"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07346.class, "slotNum;itemStack", "slotNum", "itemStack"}, this);
    }

    public class06584 y() {
        return this.itemStack;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12070(this);
    }

    public short N() {
        return this.slotNum;
    }

    public class02897<class07346> method_65080() {
        return class04248.LW;
    }
}

