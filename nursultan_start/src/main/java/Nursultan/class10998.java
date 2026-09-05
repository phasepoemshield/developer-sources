/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10872
 *  Nursultan.class11333
 *  Nursultan.class11935
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10872;
import Nursultan.class11067;
import Nursultan.class11333;
import Nursultan.class11935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class10998
extends Record
implements class11333 {
    public class11067 module;

    public class11067 L() {
        return this.module;
    }

    public class10998(class11067 class110672) {
        this.module = class110672;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10998.class, "module", "module"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10998.class, "module", "module"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10998.class, "module", "module"}, this);
    }

    public class10872 N() {
        return new class11935(this);
    }
}

