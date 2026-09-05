/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.dsl.ExistingDelegateProvider
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.reflect.KProperty
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.ExistingDelegateProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BU\u0012)\u0010\t\u001a%\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0086\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R7\u0010\t\u001a%\u0012\u0004\u0012\u00020\u0005\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0014R%\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\u0016\u00a8\u0006\u0017"}, d2={"Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "Dsl", "Return", "", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "registerFunction", "action", "name", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "Ldev/isxander/yacl3/dsl/ExistingDelegateProvider;", "provideDelegate", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ldev/isxander/yacl3/dsl/ExistingDelegateProvider;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "yet_another_config_lib_v3"})
public final class RegisterableActionDelegateProvider<Dsl, Return> {
    private final Function2<String, Function1<? super Dsl, Unit>, Return> registerFunction;
    private final Function1<Dsl, Unit> action;
    private final String name;

    public RegisterableActionDelegateProvider(Function2<? super String, ? super Function1<? super Dsl, Unit>, ? extends Return> function2, Function1<? super Dsl, Unit> function1, String string) {
        Intrinsics.checkNotNullParameter(function2, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        this.registerFunction = function2;
        this.action = function1;
        this.name = string;
    }

    public final ExistingDelegateProvider<Return> provideDelegate(Object object, KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, (String)"");
        String string = this.name;
        if (string == null) {
            string = kProperty.getName();
        }
        return new ExistingDelegateProvider(this.registerFunction.invoke((Object)string, this.action));
    }
}

