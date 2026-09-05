/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class04469
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class04469;

public class class10407
extends Record {
    public class04469 signature;
    public String name;

    public class10407(String string, class04469 class044692) {
        this.name = string;
        this.signature = class044692;
    }

    public class10407(class00667 class006672) {
        this(class006672.u(16), class04469.N((class00667)class006672));
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10407.class, "name;signature", "name", "signature"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10407.class, "name;signature", "name", "signature"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10407.class, "name;signature", "name", "signature"}, this);
    }

    public String y() {
        return this.name;
    }

    public class04469 N() {
        return this.signature;
    }

    public void N(class00667 class006672) {
        class006672.N(this.name, 16);
        class04469.N((class00667)class006672, (class04469)this.signature);
    }
}

