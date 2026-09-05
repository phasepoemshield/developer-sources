/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;

public class class11885
extends Record {
    public int channels;
    public int sampleRate;
    public int sampleBits;
    public ByteBuffer pcm;

    public int L() {
        return this.channels;
    }

    public class11885(ByteBuffer byteBuffer, int n, int n2, int n3) {
        this.pcm = byteBuffer;
        this.channels = n;
        this.sampleBits = n2;
        this.sampleRate = n3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11885.class, "pcm;channels;sampleBits;sampleRate", "pcm", "channels", "sampleBits", "sampleRate"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11885.class, "pcm;channels;sampleBits;sampleRate", "pcm", "channels", "sampleBits", "sampleRate"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11885.class, "pcm;channels;sampleBits;sampleRate", "pcm", "channels", "sampleBits", "sampleRate"}, this);
    }

    public ByteBuffer u() {
        return this.pcm;
    }

    public int y() {
        return this.sampleBits;
    }

    public int N() {
        return this.sampleRate;
    }
}

