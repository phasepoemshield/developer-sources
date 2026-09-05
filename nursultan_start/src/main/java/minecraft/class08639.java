/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08354
 *  minecraft.class08361
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;
import minecraft.class08354;
import minecraft.class08361;

final class class08639
extends Record {
    final class08361 texture;
    final CompletableFuture<class08354> newContents;

    class08639(class08361 class083612, CompletableFuture<class08354> completableFuture) {
        this.texture = class083612;
        this.newContents = completableFuture;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08639.class, "texture;newContents", "texture", "newContents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08639.class, "texture;newContents", "texture", "newContents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08639.class, "texture;newContents", "texture", "newContents"}, this);
    }

    public CompletableFuture<class08354> y() {
        return this.newContents;
    }

    public class08361 N() {
        return this.texture;
    }
}

