/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import minecraft.class00392;
import minecraft.class02222;

public final class class02213
extends Record {
    final Either<class02222, class00392> type;
    final URI link;

    public URI L() {
        return this.link;
    }

    public class02213(Either<class02222, class00392> either, URI uRI) {
        this.type = either;
        this.link = uRI;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02213.class, "type;link", "type", "link"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02213.class, "type;link", "type", "link"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02213.class, "type;link", "type", "link"}, this);
    }

    public Either<class02222, class00392> y() {
        return this.type;
    }

    public static class02213 N(class02222 class022222, URI uRI) {
        return new class02213((Either<class02222, class00392>)Either.left((Object)((Object)class022222)), uRI);
    }

    public class00392 N() {
        return (class00392)this.type.map(class02222::N, class003922 -> class003922);
    }

    public static class02213 N(class00392 class003922, URI uRI) {
        return new class02213((Either<class02222, class00392>)Either.right((Object)class003922), uRI);
    }
}

