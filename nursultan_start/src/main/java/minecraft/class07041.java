/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;
import minecraft.class07056;
import minecraft.class07064;
import minecraft.class07082;
import org.jspecify.annotations.Nullable;

public final class class07041
extends Record
implements class07082 {
    private final class07064 swingSource;
    private final class07056 itemContext;

    public boolean L() {
        return this.itemContext.N();
    }

    public class07041(class07064 class070642, class07056 class070562) {
        this.swingSource = class070642;
        this.itemContext = class070562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07041.class, "swingSource;itemContext", "swingSource", "itemContext"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07041.class, "swingSource;itemContext", "swingSource", "itemContext"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07041.class, "swingSource;itemContext", "swingSource", "itemContext"}, this);
    }

    public class07064 i() {
        return this.swingSource;
    }

    public @Nullable class06584 u() {
        return this.itemContext.y();
    }

    public class07041 y() {
        return new class07041(this.swingSource, class07056.L);
    }

    @Override
    public boolean N() {
        return true;
    }

    public class07041 N(class06584 class065842) {
        return new class07041(this.swingSource, new class07056(true, class065842));
    }

    public class07056 R() {
        return this.itemContext;
    }
}

