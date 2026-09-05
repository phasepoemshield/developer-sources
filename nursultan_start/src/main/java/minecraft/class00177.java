/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02028
 *  minecraft.class04540
 *  minecraft.class08350
 *  minecraft.class08880
 *  minecraft.class08887
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00163;
import minecraft.class02028;
import minecraft.class04540;
import minecraft.class08350;
import minecraft.class08880;
import minecraft.class08887;

public final class class00177
extends Record
implements class08880 {
    private final class04540<class08880> entries;

    public class00177(class04540<class08880> class045402) {
        this.entries = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00177.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00177.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00177.class, "entries", "entries"}, this);
    }

    public class04540<class08880> y() {
        return this.entries;
    }

    public void method_62326(class08350 class083502) {
        this.entries.u().forEach(class045232 -> ((class08880)class045232.N()).method_62326(class083502));
    }

    public class08887 method_68521(class02028 class020282) {
        return new class00163((class04540<class08887>)this.entries.N(class088802 -> class088802.method_68521(class020282)));
    }
}

