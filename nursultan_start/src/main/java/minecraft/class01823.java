/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class01828
 *  minecraft.class03875
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class01828;
import minecraft.class03875;
import org.jspecify.annotations.Nullable;

public final class class01823
extends Record
implements class01828 {
    private final class01828[] materialRuleList;

    public class01823(class01828[] class01828Array) {
        this.materialRuleList = class01828Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01823.class, "materialRuleList", "materialRuleList"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01823.class, "materialRuleList", "materialRuleList"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01823.class, "materialRuleList", "materialRuleList"}, this);
    }

    public class01828[] N() {
        return this.materialRuleList;
    }

    public @Nullable class00500 calculate(class03875 class038752) {
        class01828[] class01828Array = this.materialRuleList;
        int n = class01828Array.length;
        for (int i = 0; i < n; ++i) {
            class00500 class005002 = class01828Array[i].calculate(class038752);
            if (class005002 == null) continue;
            return class005002;
        }
        return null;
    }
}

