/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04654
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02106;
import minecraft.class04654;

public final class class02109
extends Record
implements class02106 {
    private final class04654 component;

    public class02109(class04654 class046542) {
        this.component = class046542;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02109.class, "component", "component"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02109.class, "component", "component"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02109.class, "component", "component"}, this);
    }

    @Override
    public void N(boolean bl) {
        this.component.method_25365(bl);
    }

    @Override
    public class04654 N() {
        return this.component;
    }
}

