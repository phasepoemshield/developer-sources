/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01040
 *  minecraft.class05111
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01040;
import minecraft.class05111;

public class class06216
extends Record {
    public class01040 quickPlayData;
    public class05111 realmsClient;

    public class06216(class05111 class051112, class01040 class010402) {
        this.realmsClient = class051112;
        this.quickPlayData = class010402;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06216.class, "realmsClient;quickPlayData", "realmsClient", "quickPlayData"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06216.class, "realmsClient;quickPlayData", "realmsClient", "quickPlayData"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06216.class, "realmsClient;quickPlayData", "realmsClient", "quickPlayData"}, this);
    }

    public class01040 y() {
        return this.quickPlayData;
    }

    public class05111 N() {
        return this.realmsClient;
    }
}

