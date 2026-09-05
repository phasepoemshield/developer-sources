/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01295
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01295;
import minecraft.class02106;

public final class class02123
extends Record
implements class02106 {
    private final class01295 component;
    private final class02106 childPath;

    public class02106 L() {
        return this.childPath;
    }

    public class02123(class01295 class012952, class02106 class021062) {
        this.component = class012952;
        this.childPath = class021062;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02123.class, "component;childPath", "component", "childPath"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02123.class, "component;childPath", "component", "childPath"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02123.class, "component;childPath", "component", "childPath"}, this);
    }

    public class01295 N() {
        return this.component;
    }

    @Override
    public void N(boolean bl) {
        if (!bl) {
            this.component.method_25395(null);
        } else {
            this.component.method_25395(this.childPath.N());
        }
        this.childPath.N(bl);
    }
}

