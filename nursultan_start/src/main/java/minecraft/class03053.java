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
 *  minecraft.class03928
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03928;
import minecraft.class04248;
import minecraft.class07280;

public final class class03053
extends Record
implements class00381<class07280> {
    private final class03928 messageSignature;
    public static final class02362<class00667, class03053> N = class00381.N(class03053::N, class03053::new);

    private class03053(class00667 class006672) {
        this(class03928.N((class00667)class006672));
    }

    public class03053(class03928 class039282) {
        this.messageSignature = class039282;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03053.class, "messageSignature", "messageSignature"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03053.class, "messageSignature", "messageSignature"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03053.class, "messageSignature", "messageSignature"}, this);
    }

    public class03928 N() {
        return this.messageSignature;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class03928.N((class00667)class006672, (class03928)this.messageSignature);
    }

    public class02897<class03053> method_65080() {
        return class04248.g;
    }
}

