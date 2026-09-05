/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01487
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class03748
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01487;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class03748;

public final class class06666
extends Record
implements class00381<class01662> {
    private final UUID id;
    private final String url;
    private final String hash;
    private final boolean required;
    private final Optional<class00392> prompt;
    public static final int N = 40;
    public static final class02362<ByteBuf, class06666> y = class02362.N((class02362)class01487.M, class06666::N, (class02362)class02389.s, class06666::y, (class02362)class02389.y((int)40), class06666::L, (class02362)class02389.y, class06666::u, (class02362)class03748.R.N_33(class02389::N), class06666::M, class06666::new);

    public String L() {
        return this.hash;
    }

    public Optional<class00392> M() {
        return this.prompt;
    }

    public class06666(UUID uUID, String string, String string2, boolean bl, Optional<class00392> optional) {
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
        this.id = uUID;
        this.url = string;
        this.hash = string2;
        this.required = bl;
        this.prompt = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06666.class, "id;url;hash;required;prompt", "id", "url", "hash", "required", "prompt"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06666.class, "id;url;hash;required;prompt", "id", "url", "hash", "required", "prompt"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06666.class, "id;url;hash;required;prompt", "id", "url", "hash", "required", "prompt"}, this);
    }

    public boolean u() {
        return this.required;
    }

    public String y() {
        return this.url;
    }

    public UUID N() {
        return this.id;
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class02897<class06666> method_65080() {
        return class02885.B;
    }
}

