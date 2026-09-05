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

public class class11997
extends Record {
    public String name;
    public int key;
    public String text;

    public String L() {
        return this.name;
    }

    public class11997(String string, String string2, int n) {
        this.name = string;
        this.text = string2;
        this.key = n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class11997)) {
            return false;
        }
        class11997 class119972 = (class11997)((Object)object);
        return Objects.equals(this.name, class119972.name);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11997.class, "name;text;key", "name", "text", "key"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    public String y() {
        return this.text;
    }

    public int N() {
        return this.key;
    }
}

