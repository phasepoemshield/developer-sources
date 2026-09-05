/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09788
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class11601
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class11601;
import Nursultan.class11834;
import Nursultan.class11849;
import Nursultan.class11861;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;

public class class11875
extends Record
implements class11849 {
    public BooleanSupplier checked;

    public class11875(BooleanSupplier booleanSupplier) {
        this.checked = booleanSupplier;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11875.class, "checked", "checked"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11875.class, "checked", "checked"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11875.class, "checked", "checked"}, this);
    }

    @Override
    public class09798 N(class09809 class098092, class11834 class118342) {
        class11861 class118612 = new class11861(this.checked.getAsBoolean(), bl -> {});
        return class098092.N("notify-switch-" + class118342.N(), (class09788)class11601.u_0, (Object)class118612);
    }

    public BooleanSupplier N() {
        return this.checked;
    }
}

