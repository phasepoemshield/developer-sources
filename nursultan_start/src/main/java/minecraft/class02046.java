/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class02046
extends Record
implements class00381<class07280> {
    private final class00392 message;
    private final class00649 chatType;
    public static final class02362<class04247, class02046> N = class02362.N((class02362)class03748.u, class02046::N, (class02362)class00649.N, class02046::y, class02046::new);

    public class02046(class00392 class003922, class00649 class006492) {
        this.message = class003922;
        this.chatType = class006492;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02046.class, "message;chatType", "message", "chatType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02046.class, "message;chatType", "message", "chatType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02046.class, "message;chatType", "message", "chatType"}, this);
    }

    public boolean i() {
        return true;
    }

    public class00649 y() {
        return this.chatType;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00392 N() {
        return this.message;
    }

    public class02897<class02046> method_65080() {
        return class04248.I;
    }
}

