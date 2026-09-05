/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package dev.isxander.yacl3.dsl;

import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/Buildable;", "T", "", "build", "()Ljava/lang/Object;", "Ljava/util/concurrent/CompletableFuture;", "getBuilt", "()Ljava/util/concurrent/CompletableFuture;", "built", "yet_another_config_lib_v3"})
public interface Buildable<T> {
    public T build();

    public CompletableFuture<T> getBuilt();
}

