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

public non-sealed class class11970
extends Record
implements class11946 {
    public String newName;
    public long id;

    public class11970(long l, String string) {
        this.id = l;
        this.newName = string;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11970.class, "id;newName", "id", "newName"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11970.class, "id;newName", "id", "newName"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11970.class, "id;newName", "id", "newName"}, this);
    }

    public long y() {
        return this.id;
    }

    public static class11970 y(class11940 class119402) {
        return new class11970(class119402.M(), class119402.P());
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.id);
        class119402.N(this.newName);
    }

    public String N() {
        return this.newName;
    }
}

