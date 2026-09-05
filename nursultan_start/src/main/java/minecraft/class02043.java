/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class04141
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class04141;

public final class class02043
extends Record {
    private final class00392 message;
    public static final class02043 N = new class02043((class00392)class00392.L((String)"gui.abuseReport.send.no_reason"));
    public static final class02043 y = new class02043((class00392)class00392.L((String)"gui.chatReport.send.no_reported_messages"));
    public static final class02043 L = new class02043((class00392)class00392.L((String)"gui.chatReport.send.too_many_messages"));
    public static final class02043 u = new class02043((class00392)class00392.L((String)"gui.abuseReport.send.comment_too_long"));
    public static final class02043 i = new class02043((class00392)class00392.L((String)"gui.abuseReport.send.not_attested"));

    public class02043(class00392 class003922) {
        this.message = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02043.class, "message", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02043.class, "message", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02043.class, "message", "message"}, this);
    }

    public class00392 y() {
        return this.message;
    }

    public class04141 N() {
        return class04141.N((class00392)this.message);
    }
}

