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
import java.util.Objects;

public class class09332
extends Record {
    public String name;
    public long creationDate;

    public class09332(String string, long l) {
        this.name = string;
        this.creationDate = l;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class09332)) {
            return false;
        }
        class09332 class093322 = (class09332)((Object)object);
        return Objects.equals(this.name, class093322.name);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09332.class, "name;creationDate", "name", "creationDate"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    public String y() {
        return this.name;
    }

    public long N() {
        return this.creationDate;
    }
}

