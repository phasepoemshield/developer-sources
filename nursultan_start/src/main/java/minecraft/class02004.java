/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05904
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02019;
import minecraft.class05904;

public final class class02004
extends Record {
    final class05904 woodType;
    final class02019 attachmentType;

    public class02004(class05904 class059042, class02019 class020192) {
        this.woodType = class059042;
        this.attachmentType = class020192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02004.class, "woodType;attachmentType", "woodType", "attachmentType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02004.class, "woodType;attachmentType", "woodType", "attachmentType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02004.class, "woodType;attachmentType", "woodType", "attachmentType"}, this);
    }

    public class02019 y() {
        return this.attachmentType;
    }

    public class05904 N() {
        return this.woodType;
    }
}

