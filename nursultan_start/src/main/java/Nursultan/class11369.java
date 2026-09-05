/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11901
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11901;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11369
extends Record {
    public class11901 sound;

    public class11369(class11901 class119012) {
        this.sound = class119012;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11369.class, "sound", "sound"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11369.class, "sound", "sound"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11369.class, "sound", "sound"}, this);
    }

    public class11901 N() {
        return this.sound;
    }
}

