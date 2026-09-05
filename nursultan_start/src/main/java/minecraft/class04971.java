/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class04942;
import minecraft.class04970;

public final class class04971
extends Record
implements class04942 {
    @SerializedName(value="pingResults")
    private final List<class04970> pingResults;
    @SerializedName(value="worldIds")
    private final List<Long> realmIds;

    public class04971(List<class04970> list, List<Long> list2) {
        this.pingResults = list;
        this.realmIds = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04971.class, "pingResults;realmIds", "pingResults", "realmIds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04971.class, "pingResults;realmIds", "pingResults", "realmIds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04971.class, "pingResults;realmIds", "pingResults", "realmIds"}, this);
    }

    @SerializedName(value="worldIds")
    public List<Long> y() {
        return this.realmIds;
    }

    @SerializedName(value="pingResults")
    public List<class04970> N() {
        return this.pingResults;
    }
}

