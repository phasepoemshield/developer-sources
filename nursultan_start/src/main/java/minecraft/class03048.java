/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03397
 *  minecraft.class03934
 *  minecraft.class04469
 */
package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SignatureException;
import java.util.List;
import minecraft.class03066;
import minecraft.class03397;
import minecraft.class03934;
import minecraft.class04469;

public final class class03048
extends Record {
    private final List<class04469> entries;
    public static final Codec<class03048> N = ((Codec)class04469.y_0).listOf().xmap(class03048::new, class03048::y);
    public static class03048 y = new class03048(List.of());
    public static final int L = 20;

    public class03048(List<class04469> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03048.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03048.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03048.class, "entries", "entries"}, this);
    }

    public List<class04469> y() {
        return this.entries;
    }

    public class03066 N(class03397 class033972) {
        return new class03066(this.entries.stream().map(class044692 -> class044692.N(class033972)).toList());
    }

    public void N(class03934 class039342) throws SignatureException {
        class039342.update(Ints.toByteArray((int)this.entries.size()));
        for (class04469 class044692 : this.entries) {
            class039342.update(class044692.y());
        }
    }

    public byte N() {
        int n = 1;
        for (class04469 class044692 : this.entries) {
            n = 31 * n + class044692.N();
        }
        byte by = (byte)n;
        return by == 0 ? (byte)1 : by;
    }
}

