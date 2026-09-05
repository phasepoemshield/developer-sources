/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.properties.ReadOnlyProperty
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.RegisterableActionDelegateProvider;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\b\u0010\tJ0\u0010\b\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\b\fH&\u00a2\u0006\u0004\b\b\u0010\u000eJ@\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\b\fH&\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0014R(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a\u00a8\u0006\u001c\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/ParentRegistrar;", "T", "DSL", "INNER", "", "", "id", "registrant", "register", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "registering", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "Ljava/util/concurrent/CompletableFuture;", "futureRef", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "ref", "(Ljava/lang/String;)Ljava/lang/Object;", "get", "Lkotlin/properties/ReadOnlyProperty;", "getFutureRef", "()Lkotlin/properties/ReadOnlyProperty;", "getRef", "yet_another_config_lib_v3"})
public interface ParentRegistrar<T, DSL, INNER> {
    public CompletableFuture<INNER> get(String var1);

    public T register(String var1, T var2);

    public T register(String var1, Function1<? super DSL, Unit> var2);

    public T ref(String var1);

    public ReadOnlyProperty<Object, T> getRef();

    public static /* synthetic */ RegisterableActionDelegateProvider registering$default(ParentRegistrar parentRegistrar, String string, Function1 function1, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registering");
        }
        if ((n & 1) != 0) {
            string = null;
        }
        return parentRegistrar.registering(string, function1);
    }

    public CompletableFuture<T> futureRef(String var1);

    public ReadOnlyProperty<Object, CompletableFuture<T>> getFutureRef();

    public RegisterableActionDelegateProvider<DSL, T> registering(String var1, Function1<? super DSL, Unit> var2);
}

