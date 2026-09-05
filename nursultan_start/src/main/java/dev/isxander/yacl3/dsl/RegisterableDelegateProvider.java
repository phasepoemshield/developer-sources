/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.dsl.ExistingDelegateProvider
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.reflect.KProperty
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.ExistingDelegateProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B4\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0086\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R/\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0012\u00a8\u0006\u0013"}, d2={"Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "R", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "registerFunction", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "Ldev/isxander/yacl3/dsl/ExistingDelegateProvider;", "provideDelegate", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ldev/isxander/yacl3/dsl/ExistingDelegateProvider;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "yet_another_config_lib_v3"})
public final class RegisterableDelegateProvider<R> {
    private final Function1<String, R> registerFunction;
    private final String id;

    public RegisterableDelegateProvider(Function1<? super String, ? extends R> function1, String string) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        this.registerFunction = function1;
        this.id = string;
    }

    public final ExistingDelegateProvider<R> provideDelegate(Object object, KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, (String)"");
        String string = this.id;
        if (string == null) {
            string = kProperty.getName();
        }
        return new ExistingDelegateProvider(this.registerFunction.invoke((Object)string));
    }
}

