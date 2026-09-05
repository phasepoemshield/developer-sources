/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.ButtonOption$Builder
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.Option$Builder
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionDescription$Builder
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.reflect.KMutableProperty0
 *  minecraft.class00392
 *  minecraft.class07018
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.ButtonOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import minecraft.class00392;
import minecraft.class07018;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000\u0086\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022,\u0010\u000f\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0013\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0013\u001a\u00020\u0006*\u00020\u00152\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0016\u001a*\u0010\u0013\u001a\u00020\u0006*\u00020\u00172\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0018\u001a%\u0010\u001d\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010!\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020\u0006*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020#0\u001f\u00a2\u0006\u0004\b$\u0010%\u001ab\u0010*\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001\"\u000e\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000&*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0004\u0012\u00028\u00010\u00122\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0004\b*\u0010+\"x\u0010*\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0012j\b\u0012\u0004\u0012\u00028\u0000`,\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\r\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0\u0012j\b\u0012\u0004\u0012\u00028\u0000`,8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0014\"@\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u000000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u0000008F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104\",\u0010!\u001a\u00020 *\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u00069"}, d2={"", "T", "Ldev/isxander/yacl3/api/Option$Builder;", "Lkotlin/reflect/KMutableProperty0;", "property", "default", "", "binding", "(Ldev/isxander/yacl3/api/Option$Builder;Lkotlin/reflect/KMutableProperty0;Ljava/lang/Object;)V", "Lkotlin/Function2;", "Ldev/isxander/yacl3/api/OptionDescription$Builder;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "block", "descriptionBuilderDyn", "(Ldev/isxander/yacl3/api/Option$Builder;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "descriptionBuilder", "(Ldev/isxander/yacl3/api/Option$Builder;Lkotlin/jvm/functions/Function1;)V", "Ldev/isxander/yacl3/api/ButtonOption$Builder;", "(Ldev/isxander/yacl3/api/ButtonOption$Builder;Lkotlin/jvm/functions/Function1;)V", "Ldev/isxander/yacl3/api/OptionGroup$Builder;", "(Ldev/isxander/yacl3/api/OptionGroup$Builder;Lkotlin/jvm/functions/Function1;)V", "", "prefix", "", "lines", "addDefaultText", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Ljava/lang/String;Ljava/lang/Integer;)V", "Lkotlin/Function0;", "", "available", "(Ldev/isxander/yacl3/api/Option$Builder;Lkotlin/jvm/functions/Function0;)V", "Lnet/minecraft/class_2561;", "text", "(Ldev/isxander/yacl3/api/OptionDescription$Builder;Lkotlin/jvm/functions/Function0;)V", "Ldev/isxander/yacl3/api/controller/ControllerBuilder;", "B", "Ldev/isxander/yacl3/api/Option;", "builder", "controller", "(Ldev/isxander/yacl3/api/Option$Builder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ldev/isxander/yacl3/dsl/ControllerBuilderFactory;", "getController", "(Ldev/isxander/yacl3/api/Option$Builder;)Lkotlin/jvm/functions/Function1;", "setController", "Ldev/isxander/yacl3/api/Binding;", "getBinding", "(Ldev/isxander/yacl3/api/Option$Builder;)Ldev/isxander/yacl3/api/Binding;", "setBinding", "(Ldev/isxander/yacl3/api/Option$Builder;Ldev/isxander/yacl3/api/Binding;)V", "getAvailable", "(Ldev/isxander/yacl3/api/Option$Builder;)Z", "setAvailable", "(Ldev/isxander/yacl3/api/Option$Builder;Z)V", "yet_another_config_lib_v3"})
public final class ExtensionsKt {
    public static final boolean getAvailable(Option.Builder<?> builder) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        throw new UnsupportedOperationException();
    }

    public static final <T> void binding(Option.Builder<T> builder, KMutableProperty0<T> kMutableProperty0, T t) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(kMutableProperty0, (String)"");
        Intrinsics.checkNotNullParameter(t, (String)"");
        builder.binding(t, () -> ExtensionsKt.binding$lambda$0(kMutableProperty0), arg_0 -> ExtensionsKt.binding$lambda$1(kMutableProperty0, arg_0));
    }

    public static final void available(Option.Builder<?> builder, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(function0, (String)"");
        builder.available(((Boolean)function0.invoke()).booleanValue());
    }

    public static final void text(OptionDescription.Builder builder, Function0<? extends class00392> function0) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        Intrinsics.checkNotNullParameter(function0, (String)"");
        class00392[] class00392Array = new class00392[]{function0.invoke()};
        builder.text(class00392Array);
    }

    public static final <T> Binding<T> getBinding(Option.Builder<T> builder) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        throw new UnsupportedOperationException();
    }

    public static final <T> void setBinding(Option.Builder<T> builder, Binding<T> binding) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(binding, (String)"");
        builder.binding(binding);
    }

    private static final OptionDescription descriptionBuilderDyn$lambda$0(Function2 function2, Object object) {
        OptionDescription.Builder builder;
        OptionDescription.Builder builder2 = builder = OptionDescription.createBuilder();
        boolean bl = false;
        Intrinsics.checkNotNull((Object)builder2);
        function2.invoke((Object)builder2, object);
        return builder.build();
    }

    public static /* synthetic */ void addDefaultText$default(OptionDescription.Builder builder, String string, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        ExtensionsKt.addDefaultText(builder, string, n);
    }

    private static final ControllerBuilder controller$lambda$1(Function1 function1, Function1 function12, Option option) {
        Intrinsics.checkNotNull((Object)option);
        Object object = function1.invoke((Object)option);
        function12.invoke(object);
        return (ControllerBuilder)object;
    }

    private static final Unit controller$lambda$0(ControllerBuilder controllerBuilder) {
        Intrinsics.checkNotNullParameter((Object)controllerBuilder, (String)"");
        return Unit.INSTANCE;
    }

    public static final <T> void descriptionBuilderDyn(Option.Builder<T> builder, Function2<? super OptionDescription.Builder, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(function2, (String)"");
        builder.description(arg_0 -> ExtensionsKt.descriptionBuilderDyn$lambda$0(function2, arg_0));
    }

    private static final ControllerBuilder _set_controller_$lambda$0(Function1 function1, Option option) {
        return (ControllerBuilder)function1.invoke((Object)option);
    }

    public static final <T, B extends ControllerBuilder<T>> void controller(Option.Builder<T> builder, Function1<? super Option<T>, ? extends B> function1, Function1<? super B, Unit> function12) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        Intrinsics.checkNotNullParameter(function12, (String)"");
        builder.controller(arg_0 -> ExtensionsKt.controller$lambda$1(function1, function12, arg_0));
    }

    public static final void setAvailable(Option.Builder<?> builder, boolean bl) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        builder.available(bl);
    }

    public static final void descriptionBuilder(ButtonOption.Builder builder, Function1<? super OptionDescription.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        OptionDescription.Builder builder2 = OptionDescription.createBuilder();
        function1.invoke((Object)builder2);
        builder.description(builder2.build());
    }

    public static final void descriptionBuilder(OptionGroup.Builder builder, Function1<? super OptionDescription.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        OptionDescription.Builder builder2 = OptionDescription.createBuilder();
        function1.invoke((Object)builder2);
        builder.description(builder2.build());
    }

    public static final void descriptionBuilder(Option.Builder<?> builder, Function1<? super OptionDescription.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        OptionDescription.Builder builder2 = OptionDescription.createBuilder();
        function1.invoke((Object)builder2);
        builder.description(builder2.build());
    }

    public static final <T> void setController(Option.Builder<T> builder, Function1<? super Option<T>, ? extends ControllerBuilder<T>> function1) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        builder.controller(arg_0 -> ExtensionsKt._set_controller_$lambda$0(function1, arg_0));
    }

    public static final <T> Function1<Option<T>, ControllerBuilder<T>> getController(Option.Builder<T> builder) {
        Intrinsics.checkNotNullParameter(builder, (String)"");
        throw new UnsupportedOperationException();
    }

    private static final void binding$lambda$1(KMutableProperty0 kMutableProperty0, Object object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"");
        kMutableProperty0.set(object);
    }

    private static final Object binding$lambda$0(KMutableProperty0 kMutableProperty0) {
        return kMutableProperty0.get();
    }

    public static /* synthetic */ void controller$default(Option.Builder builder, Function1 function1, Function1 function12, int n, Object object) {
        if ((n & 2) != 0) {
            function12 = ExtensionsKt::controller$lambda$0;
        }
        ExtensionsKt.controller(builder, function1, function12);
    }

    public static final void addDefaultText(OptionDescription.Builder builder, String string, Integer n) {
        Intrinsics.checkNotNullParameter((Object)builder, (String)"");
        Intrinsics.checkNotNullParameter((Object)string, (String)"");
        if (n != null) {
            int n2 = 1;
            if (n == n2) {
                class00392[] class00392Array = new class00392[]{class00392.L((String)string)};
                builder.text(class00392Array);
            } else {
                n2 = 1;
                int n3 = n;
                if (n2 <= n3) {
                    while (true) {
                        class00392[] class00392Array = new class00392[]{class00392.L((String)(string + "." + n2))};
                        builder.text(class00392Array);
                        if (n2 != n3) {
                            ++n2;
                            continue;
                        }
                        break;
                    }
                }
            }
        } else {
            for (int i = 1; i < 100; ++i) {
                String string2 = string + "." + i;
                if (!class07018.y().N(string2)) break;
                class00392[] class00392Array = new class00392[]{class00392.L((String)string2)};
                builder.text(class00392Array);
            }
        }
    }
}

