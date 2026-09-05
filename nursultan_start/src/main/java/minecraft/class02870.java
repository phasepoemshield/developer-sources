/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01662
 *  minecraft.class02362
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;

public final class class02870
extends Record
implements class00381<class01662> {
    private final String host;
    private final int port;
    public static final class02362<class00667, class02870> N = class00381.N(class02870::N, class02870::new);

    private class02870(class00667 class006672) {
        this(class006672.s(), class006672.E());
    }

    public class02870(String string, int n) {
        this.host = string;
        this.port = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02870.class, "host;port", "host", "port"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02870.class, "host;port", "host", "port"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02870.class, "host;port", "host", "port"}, this);
    }

    public int y() {
        return this.port;
    }

    private void N(class00667 class006672) {
        class006672.N(this.host);
        class006672.L(this.port);
    }

    public String N() {
        return this.host;
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class02897<class02870> method_65080() {
        return class02885.E;
    }
}

