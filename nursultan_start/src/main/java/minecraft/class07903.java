/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03529
 */
package minecraft;

import com.google.gson.JsonElement;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class03529;
import minecraft.class07940;

public final class class07903<Result>
extends Record {
    private final class03529<? extends class07940<?, ? extends Result>> method;
    private final CompletableFuture<Result> resultFuture;
    private final long timeoutTime;

    public long L() {
        return this.timeoutTime;
    }

    public class07903(class03529<? extends class07940<?, ? extends Result>> class035292, CompletableFuture<Result> completableFuture, long l) {
        this.method = class035292;
        this.resultFuture = completableFuture;
        this.timeoutTime = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07903.class, "method;resultFuture;timeoutTime", "method", "resultFuture", "timeoutTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07903.class, "method;resultFuture;timeoutTime", "method", "resultFuture", "timeoutTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07903.class, "method;resultFuture;timeoutTime", "method", "resultFuture", "timeoutTime"}, this);
    }

    public CompletableFuture<Result> y() {
        return this.resultFuture;
    }

    public boolean N(long l) {
        return l > this.timeoutTime;
    }

    public void N(JsonElement jsonElement) {
        try {
            Object Result2 = ((class07940)this.method.N()).N(jsonElement);
            this.resultFuture.complete(Objects.requireNonNull(Result2));
        }
        catch (Exception exception) {
            this.resultFuture.completeExceptionally(exception);
        }
    }

    public class03529<? extends class07940<?, ? extends Result>> N() {
        return this.method;
    }
}

