/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10021;
import Nursultan.class10052;
import Nursultan.class10053;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class10064
extends Record
implements class10053 {
    private final class10052 run;

    @Override
    public String L(class10021 class100212) {
        return this.run.N((class10021)class100212).Z;
    }

    class10064(class10052 class100522) {
        this.run = class100522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10064.class, "run", "run"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10064.class, "run", "run"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10064.class, "run", "run"}, this);
    }

    @Override
    public float y(class10021 class100212) {
        return this.run.N((class10021)class100212).y;
    }

    public class10052 N() {
        return this.run;
    }

    @Override
    public float N(class10021 class100212) {
        return this.run.N((class10021)class100212).N;
    }
}

