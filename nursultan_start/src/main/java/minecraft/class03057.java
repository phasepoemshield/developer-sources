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
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03043;
import minecraft.class04248;
import minecraft.class07280;

public final class class03057
extends Record
implements class00381<class07280> {
    private final class03043 action;
    private final List<String> entries;
    public static final class02362<class00667, class03057> N = class00381.N(class03057::N, class03057::new);

    private class03057(class00667 class006672) {
        this((class03043)class006672.y(class03043.class), class006672.N_16(class00667::s));
    }

    public class03057(class03043 class030432, List<String> list) {
        this.action = class030432;
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03057.class, "action;entries", "action", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03057.class, "action;entries", "action", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03057.class, "action;entries", "action", "entries"}, this);
    }

    public List<String> y() {
        return this.entries;
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.action);
        class006672.N_12(this.entries, class00667::N);
    }

    public class03043 N() {
        return this.action;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class03057> method_65080() {
        return class04248.l;
    }
}

