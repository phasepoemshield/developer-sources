/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ButtonOption
 *  dev.isxander.yacl3.api.LabelOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.dsl.ButtonOptionDsl
 *  dev.isxander.yacl3.dsl.OptionDsl
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.properties.ReadOnlyProperty
 *  minecraft.class00392
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.LabelOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.dsl.ButtonOptionDsl;
import dev.isxander.yacl3.dsl.OptionDsl;
import dev.isxander.yacl3.dsl.RegisterableActionDelegateProvider;
import dev.isxander.yacl3.dsl.RegisterableDelegateProvider;
import dev.isxander.yacl3.dsl.TextLineBuilderDsl;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import minecraft.class00392;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0004\b\b\u0010\tJB\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001d\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH&\u00a2\u0006\u0004\b\b\u0010\u000fJX\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0010\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001d\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH&\u00a2\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0013\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00130\u0016\"\u0004\b\u0000\u0010\u0002H&\u00a2\u0006\u0004\b\u0014\u0010\u0017J7\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0018\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\b\u001c\u0010 J0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH&\u00a2\u0006\u0004\b\u001c\u0010#J0\u0010&\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH&\u00a2\u0006\u0004\b&\u0010'J@\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH&\u00a2\u0006\u0004\b(\u0010\u0012R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0017\u00a8\u0006+\u00c0\u0006\u0003"}, d2={"Ldev/isxander/yacl3/dsl/OptionRegistrar;", "", "T", "Ldev/isxander/yacl3/api/Option;", "OPT", "", "id", "option", "register", "(Ljava/lang/String;Ldev/isxander/yacl3/api/Option;)Ldev/isxander/yacl3/api/Option;", "Lkotlin/Function1;", "Ldev/isxander/yacl3/dsl/OptionDsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/Option;", "Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "registering", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/dsl/RegisterableActionDelegateProvider;", "Ljava/util/concurrent/CompletableFuture;", "futureRef", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "()Ldev/isxander/yacl3/dsl/RegisterableDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "ref", "(Ljava/lang/String;)Lkotlin/properties/ReadOnlyProperty;", "Ldev/isxander/yacl3/api/LabelOption;", "registerLabel", "(Ljava/lang/String;)Ldev/isxander/yacl3/api/LabelOption;", "Lnet/minecraft/class_2561;", "text", "(Ljava/lang/String;Lnet/minecraft/class_2561;)Ldev/isxander/yacl3/api/LabelOption;", "Ldev/isxander/yacl3/dsl/TextLineBuilderDsl;", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/LabelOption;", "Ldev/isxander/yacl3/dsl/ButtonOptionDsl;", "Ldev/isxander/yacl3/api/ButtonOption;", "registerButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/ButtonOption;", "registeringButton", "getRegisteringLabel", "registeringLabel", "yet_another_config_lib_v3"})
public interface OptionRegistrar {
    public <T, OPT extends Option<T>> OPT register(String var1, OPT var2);

    public <T> Option<T> register(String var1, Function1<? super OptionDsl<T>, Unit> var2);

    public <T> ReadOnlyProperty<Object, Option<T>> ref(String var1);

    public static /* synthetic */ RegisterableActionDelegateProvider registering$default(OptionRegistrar optionRegistrar, String string, Function1 function1, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registering");
        }
        if ((n & 1) != 0) {
            string = null;
        }
        return optionRegistrar.registering(string, function1);
    }

    public static /* synthetic */ RegisterableActionDelegateProvider registeringButton$default(OptionRegistrar optionRegistrar, String string, Function1 function1, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registeringButton");
        }
        if ((n & 1) != 0) {
            string = null;
        }
        return optionRegistrar.registeringButton(string, (Function1<? super ButtonOptionDsl, Unit>)function1);
    }

    public RegisterableDelegateProvider<LabelOption> getRegisteringLabel();

    public <T> RegisterableDelegateProvider<CompletableFuture<Option<T>>> futureRef();

    public <T> CompletableFuture<Option<T>> futureRef(String var1);

    public static /* synthetic */ ReadOnlyProperty ref$default(OptionRegistrar optionRegistrar, String string, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ref");
        }
        if ((n & 1) != 0) {
            string = null;
        }
        return optionRegistrar.ref(string);
    }

    public RegisterableActionDelegateProvider<ButtonOptionDsl, ButtonOption> registeringButton(String var1, Function1<? super ButtonOptionDsl, Unit> var2);

    public <T> RegisterableActionDelegateProvider<OptionDsl<T>, Option<T>> registering(String var1, Function1<? super OptionDsl<T>, Unit> var2);

    public LabelOption registerLabel(String var1, class00392 var2);

    public LabelOption registerLabel(String var1, Function1<? super TextLineBuilderDsl, Unit> var2);

    public LabelOption registerLabel(String var1);

    public ButtonOption registerButton(String var1, Function1<? super ButtonOptionDsl, Unit> var2);
}

