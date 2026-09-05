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
 *  minecraft.class03058
 *  minecraft.class04248
 *  minecraft.class04455
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03058;
import minecraft.class04248;
import minecraft.class04455;
import minecraft.class08051;

public final class class02177
extends Record
implements class00381<class08051> {
    private final String command;
    private final Instant timeStamp;
    private final long salt;
    private final class04455 argumentSignatures;
    private final class03058 lastSeenMessages;
    public static final class02362<class00667, class02177> N = class00381.N(class02177::N, class02177::new);

    public long L() {
        return this.salt;
    }

    public class03058 M() {
        return this.lastSeenMessages;
    }

    private class02177(class00667 class006672) {
        this(class006672.s(), class006672.j(), class006672.readLong(), new class04455(class006672), new class03058(class006672));
    }

    public class02177(String string, Instant instant, long l, class04455 class044552, class03058 class030582) {
        this.command = string;
        this.timeStamp = instant;
        this.salt = l;
        this.argumentSignatures = class044552;
        this.lastSeenMessages = class030582;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02177.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "command", "timeStamp", "salt", "argumentSignatures", "lastSeenMessages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02177.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "command", "timeStamp", "salt", "argumentSignatures", "lastSeenMessages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02177.class, "command;timeStamp;salt;argumentSignatures;lastSeenMessages", "command", "timeStamp", "salt", "argumentSignatures", "lastSeenMessages"}, this);
    }

    public class04455 u() {
        return this.argumentSignatures;
    }

    public Instant y() {
        return this.timeStamp;
    }

    private void N(class00667 class006672) {
        class006672.N(this.command);
        class006672.N(this.timeStamp);
        class006672.writeLong(this.salt);
        this.argumentSignatures.N(class006672);
        this.lastSeenMessages.N(class006672);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_58580(this);
    }

    public String N() {
        return this.command;
    }

    public class02897<class02177> method_65080() {
        return class04248.yl;
    }
}

