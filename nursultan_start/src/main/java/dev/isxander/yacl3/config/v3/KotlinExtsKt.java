/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.dsl.OptionRegistrar
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.properties.PropertyDelegateProvider
 *  kotlin.properties.ReadOnlyProperty
 *  kotlin.reflect.KProperty
 */
package dev.isxander.yacl3.config.v3;

import com.mojang.serialization.Codec;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.config.v3.CodecConfig;
import dev.isxander.yacl3.config.v3.ConfigEntry;
import dev.isxander.yacl3.config.v3.EntryAddable;
import dev.isxander.yacl3.dsl.OptionDsl;
import dev.isxander.yacl3.dsl.OptionRegistrar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aM\u0010\b\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00060\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u001aA\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n*\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0004\b\b\u0010\u000e\u001a>\u0010\u0012\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0086\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0000*\u00020\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u001d\u0010\u001b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u00a2\u0006\u0002\b\u001aH\u0007\u00a2\u0006\u0004\b\b\u0010\u001d\"4\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u001e\u001a\u00028\u00008G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u001f\"\u0004\b \u0010!\"!\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001f\"\u0019\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00078G\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u00a8\u0006%"}, d2={"T", "Ldev/isxander/yacl3/config/v3/EntryAddable;", "default", "Lcom/mojang/serialization/Codec;", "codec", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "Ldev/isxander/yacl3/config/v3/ConfigEntry;", "register", "(Ldev/isxander/yacl3/config/v3/EntryAddable;Ljava/lang/Object;Lcom/mojang/serialization/Codec;)Lkotlin/properties/PropertyDelegateProvider;", "Ldev/isxander/yacl3/config/v3/CodecConfig;", "", "fieldName", "configInstance", "(Ldev/isxander/yacl3/config/v3/EntryAddable;Ljava/lang/String;Ldev/isxander/yacl3/config/v3/CodecConfig;)Lkotlin/properties/PropertyDelegateProvider;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ldev/isxander/yacl3/config/v3/CodecConfig;Ldev/isxander/yacl3/config/v3/CodecConfig;Lkotlin/reflect/KProperty;)Ldev/isxander/yacl3/config/v3/CodecConfig;", "", "Ldev/isxander/yacl3/dsl/OptionRegistrar;", "configEntry", "Lkotlin/Function1;", "Ldev/isxander/yacl3/dsl/OptionDsl;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ldev/isxander/yacl3/api/Option;", "(Ldev/isxander/yacl3/dsl/OptionRegistrar;Ldev/isxander/yacl3/config/v3/ConfigEntry;Lkotlin/jvm/functions/Function1;)Ldev/isxander/yacl3/api/Option;", "value", "(Ldev/isxander/yacl3/config/v3/ConfigEntry;)Ljava/lang/Object;", "setValue", "(Ldev/isxander/yacl3/config/v3/ConfigEntry;Ljava/lang/Object;)V", "getDefault", "getFieldName", "(Ldev/isxander/yacl3/config/v3/ConfigEntry;)Ljava/lang/String;", "yet_another_config_lib_v3"})
public final class KotlinExtsKt {
    public static final <T> T getValue(ConfigEntry<T> configEntry) {
        Intrinsics.checkNotNullParameter(configEntry, (String)"");
        return configEntry.get();
    }

    public static final <T extends CodecConfig<T>> T getValue(T t, CodecConfig<?> codecConfig, KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(t, (String)"");
        Intrinsics.checkNotNullParameter(kProperty, (String)"");
        return t;
    }

    public static final <T> T getDefault(ConfigEntry<T> configEntry) {
        Intrinsics.checkNotNullParameter(configEntry, (String)"");
        return configEntry.defaultValue();
    }

    public static final <T> Option<T> register(OptionRegistrar optionRegistrar, ConfigEntry<T> configEntry, Function1<? super OptionDsl<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)optionRegistrar, (String)"");
        Intrinsics.checkNotNullParameter(configEntry, (String)"");
        Intrinsics.checkNotNullParameter(function1, (String)"");
        return optionRegistrar.register(KotlinExtsKt.getFieldName(configEntry), arg_0 -> KotlinExtsKt.register$lambda$2(configEntry, function1, arg_0));
    }

    public static final <T> PropertyDelegateProvider<EntryAddable, ReadOnlyProperty<EntryAddable, ConfigEntry<T>>> register(EntryAddable entryAddable, T t, Codec<T> codec) {
        Intrinsics.checkNotNullParameter((Object)entryAddable, (String)"");
        Intrinsics.checkNotNullParameter(codec, (String)"");
        return (arg_0, arg_1) -> KotlinExtsKt.register$lambda$0(t, codec, arg_0, arg_1);
    }

    public static final <T extends CodecConfig<T>> PropertyDelegateProvider<EntryAddable, T> register(EntryAddable entryAddable, String string, T t) {
        Intrinsics.checkNotNullParameter((Object)entryAddable, (String)"");
        Intrinsics.checkNotNullParameter(t, (String)"");
        return (arg_0, arg_1) -> KotlinExtsKt.register$lambda$1(string, t, arg_0, arg_1);
    }

    public static final <T> void setValue(ConfigEntry<T> configEntry, T t) {
        Intrinsics.checkNotNullParameter(configEntry, (String)"");
        configEntry.set(t);
    }

    public static final String getFieldName(ConfigEntry<?> configEntry) {
        Intrinsics.checkNotNullParameter(configEntry, (String)"");
        String string = configEntry.fieldName();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"");
        return string;
    }

    private static final ConfigEntry register$lambda$0$0(ConfigEntry configEntry, EntryAddable entryAddable, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)entryAddable, (String)"");
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        return configEntry;
    }

    private static final ReadOnlyProperty register$lambda$0(Object object, Codec codec, EntryAddable entryAddable, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)entryAddable, (String)"");
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        ConfigEntry<Object> configEntry = entryAddable.register(kProperty.getName(), object, codec);
        return (arg_0, arg_1) -> KotlinExtsKt.register$lambda$0$0(configEntry, arg_0, arg_1);
    }

    private static final CodecConfig register$lambda$1(String string, CodecConfig codecConfig, EntryAddable entryAddable, KProperty kProperty) {
        Intrinsics.checkNotNullParameter((Object)entryAddable, (String)"");
        Intrinsics.checkNotNullParameter((Object)kProperty, (String)"");
        String string2 = string;
        if (string2 == null) {
            string2 = kProperty.getName();
        }
        entryAddable.register(string2, codecConfig);
        return codecConfig;
    }

    private static final Unit register$lambda$2(ConfigEntry configEntry, Function1 function1, OptionDsl optionDsl) {
        Intrinsics.checkNotNullParameter((Object)optionDsl, (String)"");
        optionDsl.binding(configEntry.asBinding());
        function1.invoke((Object)optionDsl);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ PropertyDelegateProvider register$default(EntryAddable entryAddable, String string, CodecConfig codecConfig, int n, Object object) {
        if ((n & 1) != 0) {
            string = null;
        }
        return KotlinExtsKt.register(entryAddable, string, codecConfig);
    }
}

