/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public final class class01785
extends Record
implements class00381<class07280> {
    private final String owner;
    private final @Nullable String objectiveName;
    public static final class02362<class00667, class01785> N = class00381.N(class01785::N, class01785::new);

    private class01785(class00667 class006672) {
        this(class006672.s(), (String)class006672.L(class00667::s));
    }

    public class01785(String string, @Nullable String string2) {
        this.owner = string;
        this.objectiveName = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01785.class, "owner;objectiveName", "owner", "objectiveName"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01785.class, "owner;objectiveName", "owner", "objectiveName"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01785.class, "owner;objectiveName", "owner", "objectiveName"}, this);
    }

    public @Nullable String y() {
        return this.objectiveName;
    }

    private void N(class00667 class006672) {
        class006672.N(this.owner);
        class006672.N((Object)this.objectiveName, class00667::N);
    }

    public String N() {
        return this.owner;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class01785> method_65080() {
        return class04248.LG;
    }
}

