/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08839
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class08839;
import org.jspecify.annotations.Nullable;

final class class08352
extends Record {
    final class01894 id;
    final @Nullable class08839 clientItemInfo;

    class08352(class01894 class018942, @Nullable class08839 class088392) {
        this.id = class018942;
        this.clientItemInfo = class088392;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08352.class, "id;clientItemInfo", "id", "clientItemInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08352.class, "id;clientItemInfo", "id", "clientItemInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08352.class, "id;clientItemInfo", "id", "clientItemInfo"}, this);
    }

    public @Nullable class08839 y() {
        return this.clientItemInfo;
    }

    public class01894 N() {
        return this.id;
    }
}

