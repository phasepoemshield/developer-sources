/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public class class11861
extends Record {
    public Consumer<Boolean> onChange;
    public boolean checked;

    public class11861(boolean bl, Consumer<Boolean> consumer) {
        this.checked = bl;
        this.onChange = consumer;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11861.class, "checked;onChange", "checked", "onChange"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11861.class, "checked;onChange", "checked", "onChange"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11861.class, "checked;onChange", "checked", "onChange"}, this);
    }

    public Consumer<Boolean> y() {
        return this.onChange;
    }

    public boolean N() {
        return this.checked;
    }
}

