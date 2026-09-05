/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.dsl.Buildable
 *  dev.isxander.yacl3.dsl.ParentRegistrarImpl$registering$1
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.properties.ReadOnlyProperty
 *  kotlin.reflect.KProperty
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.dsl.Buildable;
import dev.isxander.yacl3.dsl.ParentRegistrar;
import dev.isxander.yacl3.dsl.ParentRegistrarImpl;
import dev.isxander.yacl3.dsl.RegisterableActionDelegateProvider;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u00b4\u0001\u00126\u0010\r\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00010\u000e\u0012'\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e\u0012'\u0010\u0012\u001a#\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0019J>\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0004\b!\u0010\u001eRD\u0010\r\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\"R/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010#R5\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010#R5\u0010\u0012\u001a#\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010#R(\u0010\u001d\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00018\u00000$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010'\u00a8\u0006)"}, d2={"Ldev/isxander/yacl3/dsl/ParentRegistrarImpl;", "T", "Ldev/isxander/yacl3/dsl/Buildable;", "DSL", "INNER", "Ldev/isxander/yacl3/dsl/ParentRegistrar;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "registrant", "", "id", "", "adder", "Lkotlin/Function1;", "dslFactory", "Ljava/util/concurrent/CompletableFuture;", "getter", "innerGetter", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "register", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "registering", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "futureRef", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "ref", "(Ljava/lang/String;)Ljava/lang/Object;", "get", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/properties/ReadOnlyProperty;", "", "getFutureRef", "()Lkotlin/properties/ReadOnlyProperty;", "getRef", "yet_another_config_lib_v3"})
public final class ParentRegistrarImpl<T, DSL extends Buildable<T>, INNER>
implements ParentRegistrar<T, DSL, INNER> {
    private final Function2<T, String, Unit> adder;
    private final Function1<String, DSL> dslFactory;
    private final Function1<String, CompletableFuture<T>> getter;
    private final Function1<String, CompletableFuture<INNER>> innerGetter;

    public ParentRegistrarImpl(Function2<? super T, ? super String, Unit> function2, Function1<? super String, ? extends DSL> function1, Function1<? super String, ? extends CompletableFuture<T>> function12, Function1<? super String, ? extends CompletableFuture<INNER>> function13) {
        Intrinsics.checkNotNullParameter(function2, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        Intrinsics.checkNotNullParameter(function12, (String)"");
        Intrinsics.checkNotNullParameter(function13, (String)"");
        this.adder = function2;
        this.dslFactory = function1;
        this.getter = function12;
        this.innerGetter = function13;
    }

    @Override
    public CompletableFuture<INNER> get(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return (CompletableFuture)this.innerGetter.invoke((Object)string);
    }

    @Override
    public T register(String string, T t) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        this.adder.invoke(t, (Object)string);
        Unit unit = Unit.INSTANCE;
        boolean bl = false;
        return t;
    }

    @Override
    public T register(String string, Function1<? super DSL, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        Object object = this.dslFactory.invoke((Object)string);
        function1.invoke(object);
        return (T)this.register(string, ((Buildable)object).build());
    }

    @Override
    public T ref(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return this.futureRef(string).getNow(null);
    }

    @Override
    public ReadOnlyProperty<Object, T> getRef() {
        return (arg_0, arg_1) -> ParentRegistrarImpl._get_ref_$lambda$0(this, arg_0, arg_1);
    }

    private static final CompletableFuture _get_futureRef_$lambda$0(ParentRegistrarImpl parentRegistrarImpl, Object object, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        return parentRegistrarImpl.futureRef(kProperty.getName());
    }

    @Override
    public CompletableFuture<T> futureRef(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return (CompletableFuture)this.getter.invoke((Object)string);
    }

    @Override
    public ReadOnlyProperty<Object, CompletableFuture<T>> getFutureRef() {
        return (arg_0, arg_1) -> ParentRegistrarImpl._get_futureRef_$lambda$0(this, arg_0, arg_1);
    }

    @Override
    public RegisterableActionDelegateProvider<DSL, T> registering(String string, Function1<? super DSL, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return new RegisterableActionDelegateProvider((Function2)new registering.1((Object)this), function1, string);
    }

    private static final Object _get_ref_$lambda$0(ParentRegistrarImpl parentRegistrarImpl, Object object, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        return parentRegistrarImpl.ref(kProperty.getName());
    }
}

