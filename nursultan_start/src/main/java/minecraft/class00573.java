/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03058
 *  minecraft.class04248
 *  minecraft.class04469
 *  minecraft.class08051
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03058;
import minecraft.class04248;
import minecraft.class04469;
import minecraft.class08051;
import org.jspecify.annotations.Nullable;

public final class class00573
extends Record
implements class00381<class08051> {
    private final String message;
    private final Instant timeStamp;
    private final long salt;
    private final @Nullable class04469 signature;
    private final class03058 lastSeenMessages;
    public static final class02362<class00667, class00573> N = class00381.N(class00573::N, class00573::new);

    public long L() {
        return this.salt;
    }

    public class03058 M() {
        return this.lastSeenMessages;
    }

    private class00573(class00667 class006672) {
        this(class006672.u(256), class006672.j(), class006672.readLong(), (class04469)class006672.L(class04469::N), new class03058(class006672));
    }

    public class00573(String string, Instant instant, long l, @Nullable class04469 class044692, class03058 class030582) {
        this.message = string;
        this.timeStamp = instant;
        this.salt = l;
        this.signature = class044692;
        this.lastSeenMessages = class030582;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00573.class, "message;timeStamp;salt;signature;lastSeenMessages", "message", "timeStamp", "salt", "signature", "lastSeenMessages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00573.class, "message;timeStamp;salt;signature;lastSeenMessages", "message", "timeStamp", "salt", "signature", "lastSeenMessages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00573.class, "message;timeStamp;salt;signature;lastSeenMessages", "message", "timeStamp", "salt", "signature", "lastSeenMessages"}, this);
    }

    public @Nullable class04469 u() {
        return this.signature;
    }

    public Instant y() {
        return this.timeStamp;
    }

    private int N(int n) {
        return MaxChatLength.getChatLength();
    }

    private void N(class00667 class006672) {
        class006672.N(this.message, this.N(256));
        class006672.N(this.timeStamp);
        class006672.writeLong(this.salt);
        class006672.N((Object)this.signature, class04469::N);
        this.lastSeenMessages.N(class006672);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12048(this);
    }

    public String N() {
        return this.message;
    }

    public class02897<class00573> method_65080() {
        return class04248.yd;
    }
}

