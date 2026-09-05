/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02048
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02048;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class02075
extends Record
implements class00381<class08051> {
    private final class02048 chatSession;
    public static final class02362<class00667, class02075> N = class00381.N(class02075::N, class02075::new);

    private class02075(class00667 class006672) {
        this(class02048.N((class00667)class006672));
    }

    public class02075(class02048 class020482) {
        this.chatSession = class020482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02075.class, "chatSession", "chatSession"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02075.class, "chatSession", "chatSession"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02075.class, "chatSession", "chatSession"}, this);
    }

    public class02048 N() {
        return this.chatSession;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_46367(this);
    }

    private void N(class00667 class006672) {
        class02048.N((class00667)class006672, (class02048)this.chatSession);
    }

    public class02897<class02075> method_65080() {
        return class04248.yw;
    }
}

