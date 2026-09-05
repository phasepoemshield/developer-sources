/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10872
 *  Nursultan.class11333
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class10872;
import Nursultan.class11333;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09107
extends Record
implements class11333 {
    public class10872 action;

    public class10872 L() {
        return this.action;
    }

    public class09107(class10872 class108722) {
        this.action = class108722;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09107.class, "action", "action"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09107.class, "action", "action"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09107.class, "action", "action"}, this);
    }

    public class10872 N() {
        return this.action;
    }
}

