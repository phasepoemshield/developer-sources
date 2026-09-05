/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  dev.isxander.yacl3.dsl.ParentRegistrar
 *  dev.isxander.yacl3.dsl.RegisterableDelegateProvider
 *  dev.isxander.yacl3.dsl.RootDsl
 *  dev.isxander.yacl3.dsl.RootDslImpl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import dev.isxander.yacl3.dsl.RegisterableDelegateProvider;
import dev.isxander.yacl3.dsl.RootDsl;
import dev.isxander.yacl3.dsl.RootDslImpl;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0006\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b0\u00012\u0006\u0010\n\u001a\u00020\tH\u0086\u0002\u00a2\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0010\u0010\f\u001a9\u0010\u0010\u001a\u001e\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u000f0\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\r0\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0012\u001a.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0004\b\u0016\u0010\u0017*(\u0010\u0018\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0001*D\u0010\u001e\"\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002`\u001b0\b2*\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\bj\u0002`\u001b0\b*.\u0010\u001f\"\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\b2\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\b\u00a8\u0006 "}, d2={"T", "Ljava/util/concurrent/CompletableFuture;", "Lkotlin/Function1;", "", "block", "kotlin.jvm.PlatformType", "onReady", "(Ljava/util/concurrent/CompletableFuture;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "", "id", "get", "(Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/dsl/FutureOption;", "futureRef", "Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "(Ljava/util/concurrent/CompletableFuture;)Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "Ldev/isxander/yacl3/dsl/RootDsl;", "Lkotlin/ExtensionFunctionType;", "Ldev/isxander/yacl3/api/YetAnotherConfigLib;", "YetAnotherConfigLib", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/YetAnotherConfigLib;", "FutureOption", "Ldev/isxander/yacl3/api/ConfigCategory;", "Ldev/isxander/yacl3/dsl/CategoryDsl;", "Ldev/isxander/yacl3/dsl/GroupRegistrar;", "Ldev/isxander/yacl3/api/OptionGroup;", "Ldev/isxander/yacl3/dsl/GroupDsl;", "CategoryRegistrar", "GroupRegistrar", "yet_another_config_lib_v3"})
public final class APIKt {
    public static final <T> CompletableFuture<T> get(CompletableFuture<? extends ParentRegistrar<?, ?, T>> completableFuture, String string) {
        Intrinsics.checkNotNullParameter(completableFuture, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = completableFuture.thenCompose(arg_0 -> APIKt.get$lambda$1(arg_0 -> APIKt.get$lambda$0(string, arg_0), arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    public static final <T> CompletableFuture<Option<T>> futureRef(CompletableFuture<OptionRegistrar> completableFuture, String string) {
        Intrinsics.checkNotNullParameter(completableFuture, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        CompletionStage completionStage = completableFuture.thenCompose(arg_0 -> APIKt.futureRef$lambda$1(arg_0 -> APIKt.futureRef$lambda$0(string, arg_0), arg_0));
        Intrinsics.checkNotNullExpressionValue((Object)completionStage, (String)"");
        return completionStage;
    }

    public static final <T> RegisterableDelegateProvider<CompletableFuture<Option<T>>> futureRef(CompletableFuture<OptionRegistrar> completableFuture) {
        Intrinsics.checkNotNullParameter(completableFuture, (String)"");
        return new RegisterableDelegateProvider(arg_0 -> APIKt.futureRef$lambda$2(completableFuture, arg_0), null);
    }

    public static final <T> CompletableFuture<T> onReady(CompletableFuture<T> completableFuture, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(completableFuture, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return completableFuture.whenComplete((arg_0, arg_1) -> APIKt.onReady$lambda$1((arg_0, arg_1) -> APIKt.onReady$lambda$0(function1, arg_0, arg_1), arg_0, arg_1));
    }

    public static final YetAnotherConfigLib YetAnotherConfigLib(String string, Function1<? super RootDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        RootDslImpl rootDslImpl = new RootDslImpl(string);
        function1.invoke((Object)rootDslImpl);
        return rootDslImpl.build();
    }

    private static final CompletionStage futureRef$lambda$0(String string, OptionRegistrar optionRegistrar) {
        return optionRegistrar.futureRef(string);
    }

    private static final CompletionStage get$lambda$0(String string, ParentRegistrar parentRegistrar) {
        return parentRegistrar.get(string);
    }

    private static final Unit onReady$lambda$0(Function1 function1, Object object, Throwable throwable) {
        block0: {
            Object object2 = object;
            if (object2 == null) break block0;
            function1.invoke(object2);
        }
        return Unit.INSTANCE;
    }

    private static final CompletableFuture futureRef$lambda$2(CompletableFuture completableFuture, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return APIKt.futureRef(completableFuture, string);
    }

    private static final void onReady$lambda$1(Function2 function2, Object object, Object object2) {
        function2.invoke(object, object2);
    }

    private static final CompletionStage futureRef$lambda$1(Function1 function1, Object object) {
        return (CompletionStage)function1.invoke(object);
    }

    private static final CompletionStage get$lambda$1(Function1 function1, Object object) {
        return (CompletionStage)function1.invoke(object);
    }
}

