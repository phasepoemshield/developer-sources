/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11946;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class11944
extends Record
implements class11946 {
    public long id;

    public class11944(long l) {
        this.id = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11944.class, "id", "id"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11944.class, "id", "id"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11944.class, "id", "id"}, this);
    }

    public static class11944 y(class11940 class119402) {
        return new class11944(class119402.M());
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.id);
    }

    public long N() {
        return this.id;
    }
}

