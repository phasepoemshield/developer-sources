/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class02897
 *  minecraft.class03055
 *  minecraft.class03056
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class02897;
import minecraft.class03055;
import minecraft.class03056;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04469;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public final class class04464
extends Record
implements class00381<class07280> {
    private final int globalIndex;
    private final UUID sender;
    private final int index;
    private final @Nullable class04469 signature;
    private final class03056 body;
    private final @Nullable class00392 unsignedContent;
    private final class03055 filterMask;
    private final class00649 chatType;
    public static final class02362<class04247, class04464> N = class00381.N(class04464::N, class04464::new);

    public int L() {
        return this.index;
    }

    public class03056 M() {
        return this.body;
    }

    private class04464(class04247 class042472) {
        this(class042472.E(), class042472.m(), class042472.E(), (class04469)((Object)class042472.L(class04469::N)), new class03056((class00667)class042472), (class00392)class00667.N((ByteBuf)class042472, (class02895)class03748.u), class03055.N((class00667)class042472), (class00649)class00649.N.decode((Object)class042472));
    }

    public class04464(int n, UUID uUID, int n2, @Nullable class04469 class044692, class03056 class030562, @Nullable class00392 class003922, class03055 class030552, class00649 class006492) {
        this.globalIndex = n;
        this.sender = uUID;
        this.index = n2;
        this.signature = class044692;
        this.body = class030562;
        this.unsignedContent = class003922;
        this.filterMask = class030552;
        this.chatType = class006492;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04464.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "globalIndex", "sender", "index", "signature", "body", "unsignedContent", "filterMask", "chatType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04464.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "globalIndex", "sender", "index", "signature", "body", "unsignedContent", "filterMask", "chatType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04464.class, "globalIndex;sender;index;signature;body;unsignedContent;filterMask;chatType", "globalIndex", "sender", "index", "signature", "body", "unsignedContent", "filterMask", "chatType"}, this);
    }

    public @Nullable class00392 B() {
        return this.unsignedContent;
    }

    public class03055 Z() {
        return this.filterMask;
    }

    public boolean i() {
        return true;
    }

    public class00649 z() {
        return this.chatType;
    }

    public @Nullable class04469 u() {
        return this.signature;
    }

    public UUID y() {
        return this.sender;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.globalIndex;
    }

    private void N(class04247 class042472) {
        class042472.L(this.globalIndex);
        class042472.N(this.sender);
        class042472.L(this.index);
        class042472.N((Object)this.signature, class04469::N);
        this.body.N((class00667)class042472);
        class00667.N((ByteBuf)class042472, (Object)this.unsignedContent, (class02874)class03748.u);
        class03055.N((class00667)class042472, (class03055)this.filterMask);
        class00649.N.encode((Object)class042472, (Object)this.chatType);
    }

    public class02897<class04464> method_65080() {
        return class04248.NM;
    }
}

