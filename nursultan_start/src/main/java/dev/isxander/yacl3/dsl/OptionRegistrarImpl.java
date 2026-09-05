/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.LabelOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.dsl.ButtonOptionDsl
 *  dev.isxander.yacl3.dsl.ButtonOptionDslImpl
 *  dev.isxander.yacl3.dsl.OptionDsl
 *  dev.isxander.yacl3.dsl.OptionRegistrarImpl$registering$1
 *  dev.isxander.yacl3.dsl.OptionRegistrarImpl$registeringButton$1
 *  dev.isxander.yacl3.dsl.OptionRegistrarImpl$registeringLabel$1
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.properties.ReadOnlyProperty
 *  kotlin.reflect.KProperty
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.dsl.ButtonOptionDsl;
import dev.isxander.yacl3.dsl.ButtonOptionDslImpl;
import dev.isxander.yacl3.dsl.OptionDsl;
import dev.isxander.yacl3.dsl.OptionDslImpl;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import dev.isxander.yacl3.dsl.OptionRegistrarImpl;
import dev.isxander.yacl3.dsl.RegisterableActionDelegateProvider;
import dev.isxander.yacl3.dsl.RegisterableDelegateProvider;
import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001Bx\u0012:\u0010\n\u001a6\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002\u0012+\u0010\r\u001a'\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00112\u0006\u0010\b\u001a\u00020\u00072\u001d\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0019JV\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001a\"\u0004\b\u0000\u0010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u001d\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f\"\u0004\b\u0000\u0010\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f0\u001f\"\u0004\b\u0000\u0010\u0011H\u0016\u00a2\u0006\u0004\b\u001d\u0010 J5\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030!\"\u0004\b\u0000\u0010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\b&\u0010*J0\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b&\u0010-J0\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b0\u00101J>\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\u0002\b\u0017H\u0016\u00a2\u0006\u0004\b2\u0010\u001cRH\u0010\n\u001a6\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u00103R9\u0010\r\u001a'\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\f0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020%0\u001f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010 \u00a8\u00069"}, d2={"Ldev/isxander/yacl3/dsl/OptionRegistrarImpl;", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "Lkotlin/Function2;", "Ldev/isxander/yacl3/api/Option;", "Lkotlin/ParameterName;", "name", "registrant", "", "id", "", "adder", "Lkotlin/Function1;", "Ljava/util/concurrent/CompletableFuture;", "getter", "groupKey", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "T", "OPT", "option", "register", "(Ljava/lang/String;Ldev/isxander/yacl3/api/Option;)Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/dsl/OptionDsl;", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "registering", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "futureRef", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "()Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "", "ref", "(Ljava/lang/String;)Lkotlin/properties/ReadOnlyProperty;", "Ldev/isxander/yacl3/api/LabelOption;", "registerLabel", "(Ljava/lang/String;)Ldev/isxander/yacl3/api/LabelOption;", "Lnet/minecraft/class_2561;", "text", "(Ljava/lang/String;Lnet/minecraft/class_2561;)Ldev/isxander/yacl3/api/LabelOption;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/LabelOption;", "Ldev/isxander/yacl3/dsl/ButtonOptionDsl;", "Ldev/isxander/yacl3/api/ButtonOption;", "registerButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/ButtonOption;", "registeringButton", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "registeringLabel", "Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "getRegisteringLabel", "yet_another_config_lib_v3"})
public final class OptionRegistrarImpl
implements OptionRegistrar {
    private final Function2<Option<?>, String, Unit> adder;
    private final Function1<String, CompletableFuture<Option<?>>> getter;
    private final String groupKey;
    private final RegisterableDelegateProvider<LabelOption> registeringLabel;

    public OptionRegistrarImpl(Function2<? super Option<?>, ? super String, Unit> function2, Function1<? super String, ? extends CompletableFuture<Option<?>>> function1, String string) {
        Intrinsics.checkNotNullParameter(function2, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        this.adder = function2;
        this.getter = function1;
        this.groupKey = string;
        this.registeringLabel = new RegisterableDelegateProvider((Function1)new registeringLabel.1((Object)this), null);
    }

    @Override
    public <T> Option<T> register(String string, Function1<? super OptionDsl<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        OptionDslImpl optionDslImpl = new OptionDslImpl(string, this.groupKey, null, 4, null);
        function1.invoke(optionDslImpl);
        return this.register(string, optionDslImpl.build());
    }

    @Override
    public <T, OPT extends Option<T>> OPT register(String string, OPT OPT) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(OPT, (String)"");
        this.adder.invoke(OPT, (Object)string);
        Unit unit = Unit.INSTANCE;
        boolean bl = false;
        return OPT;
    }

    @Override
    public <T> ReadOnlyProperty<Object, Option<T>> ref(String string) {
        return (arg_0, arg_1) -> OptionRegistrarImpl.ref$lambda$0(this, string, arg_0, arg_1);
    }

    @Override
    public RegisterableDelegateProvider<LabelOption> getRegisteringLabel() {
        return this.registeringLabel;
    }

    @Override
    public <T> RegisterableDelegateProvider<CompletableFuture<Option<T>>> futureRef() {
        return new RegisterableDelegateProvider<CompletableFuture<Option<T>>>(arg_0 -> OptionRegistrarImpl.futureRef$lambda$0(this, arg_0), null);
    }

    @Override
    public <T> CompletableFuture<Option<T>> futureRef(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Object object = this.getter.invoke((Object)string);
        Intrinsics.checkNotNull((Object)object);
        return (CompletableFuture)object;
    }

    private static final CompletableFuture futureRef$lambda$0(OptionRegistrarImpl optionRegistrarImpl, String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        return optionRegistrarImpl.futureRef(string);
    }

    @Override
    public RegisterableActionDelegateProvider<ButtonOptionDsl, ButtonOption> registeringButton(String string, Function1<? super ButtonOptionDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return new RegisterableActionDelegateProvider<ButtonOptionDsl, ButtonOption>((Function2)new registeringButton.1((Object)this), function1, string);
    }

    @Override
    public <T> RegisterableActionDelegateProvider<OptionDsl<T>, Option<T>> registering(String string, Function1<? super OptionDsl<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return new RegisterableActionDelegateProvider((Function2)new registering.1((Object)this), function1, string);
    }

    private static final Option ref$lambda$0(OptionRegistrarImpl optionRegistrarImpl, String string, Object object, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        String string2 = string;
        if (string2 == null) {
            string2 = kProperty.getName();
        }
        return optionRegistrarImpl.futureRef(string2).getNow(null);
    }

    @Override
    public LabelOption registerLabel(String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        LabelOption labelOption = LabelOption.create((class00392)((class00392)class00392.L((String)(this.groupKey + ".label." + string))));
        Intrinsics.checkNotNullExpressionValue((Object)labelOption, (String)"");
        Option option = this.register(string, (Option)labelOption);
        Intrinsics.checkNotNullExpressionValue((Object)option, (String)"");
        return (LabelOption)option;
    }

    @Override
    public LabelOption registerLabel(String string, class00392 class003922) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter((Object)class003922, (String)"");
        LabelOption labelOption = LabelOption.create((class00392)class003922);
        Intrinsics.checkNotNullExpressionValue((Object)labelOption, (String)"");
        Option option = this.register(string, (Option)labelOption);
        Intrinsics.checkNotNullExpressionValue((Object)option, (String)"");
        return (LabelOption)option;
    }

    @Override
    public LabelOption registerLabel(String string, Function1<? super TextLineBuilderDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return this.registerLabel(string, TextLineBuilderDsl.Companion.createText(function1));
    }

    @Override
    public ButtonOption registerButton(String string, Function1<? super ButtonOptionDsl, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        ButtonOptionDslImpl buttonOptionDslImpl = new ButtonOptionDslImpl(string, this.groupKey, null, 4, null);
        function1.invoke((Object)buttonOptionDslImpl);
        return (ButtonOption)this.register(string, (Option)buttonOptionDslImpl.build());
    }
}

