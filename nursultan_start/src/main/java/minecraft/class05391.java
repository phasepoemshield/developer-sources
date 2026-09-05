/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05403;

final class class05391
extends Record {
    private final class05403 template;
    private final String modelSuffix;

    class05391(class05403 class054032, String string) {
        this.template = class054032;
        this.modelSuffix = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05391.class, "template;modelSuffix", "template", "modelSuffix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05391.class, "template;modelSuffix", "template", "modelSuffix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05391.class, "template;modelSuffix", "template", "modelSuffix"}, this);
    }

    public String y() {
        return this.modelSuffix;
    }

    public class05403 N() {
        return this.template;
    }
}

