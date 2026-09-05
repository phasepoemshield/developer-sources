/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public class class12018
extends Record {
    public String key;

    public class12018(String string) {
        this.key = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string;
        if (!(object instanceof class12018)) return false;
        class12018 class120182 = (class12018)((Object)object);
        try {
            string = class120182.N();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        return Objects.equals(this.key, string);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12018.class, "key", "key"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.key);
    }

    public String y(String string) {
        return string + "." + this.key;
    }

    public String N() {
        return this.key;
    }

    public class12018 N(String string) {
        return new class12018(this.key + "." + string);
    }

    public class12018 N(class12018 class120182) {
        return new class12018(this.key + "." + class120182.key);
    }
}

