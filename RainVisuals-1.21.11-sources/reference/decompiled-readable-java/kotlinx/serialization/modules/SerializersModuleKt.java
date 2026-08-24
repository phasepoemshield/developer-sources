/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0003\" \u0010\u0005\u001a\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b*\\\b\u0000\u0010\u0012\u001a\u0004\b\u0000\u0010\u000b\"'\u0012\u0015\u0012\u0013\u0018\u00010\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f2'\u0012\u0015\u0012\u0013\u0018\u00010\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f*X\b\u0000\u0010\u0015\u001a\u0004\b\u0000\u0010\u000b\"%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\f2%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\f\u00a8\u0006\u0016"}, d2={"Lkotlinx/serialization/modules/SerializersModule;", "other", "overwriteWith", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/modules/SerializersModule;", "plus", "EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicDeserializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "PolymorphicSerializerProvider", "kotlinx-serialization-core"})
public final class SerializersModuleKt {
    @NotNull
    private static final SerializersModule EmptySerializersModule = new SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap());

    @Deprecated(message="Deprecated in the favour of 'EmptySerializersModule()'", replaceWith=@ReplaceWith(expression="EmptySerializersModule()", imports={}), level=DeprecationLevel.WARNING)
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final SerializersModule plus(@NotNull SerializersModule $this$plus, @NotNull SerializersModule other) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        boolean $i$f$SerializersModule = false;
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SerializersModuleBuilder $this$plus_u24lambda_u240 = builder$iv;
        boolean bl = false;
        $this$plus_u24lambda_u240.include($this$plus);
        $this$plus_u24lambda_u240.include(other);
        return var3_3.build();
    }

    @NotNull
    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final SerializersModule overwriteWith(@NotNull SerializersModule $this$overwriteWith, @NotNull SerializersModule other) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$overwriteWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        boolean $i$f$SerializersModule = false;
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SerializersModuleBuilder $this$overwriteWith_u24lambda_u241 = builder$iv;
        boolean bl = false;
        $this$overwriteWith_u24lambda_u241.include($this$overwriteWith);
        other.dumpTo(new SerializersModuleCollector($this$overwriteWith_u24lambda_u241){
            final /* synthetic */ SerializersModuleBuilder $this_SerializersModule;

            public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
                Intrinsics.checkNotNullParameter(kClass, "kClass");
                Intrinsics.checkNotNullParameter(provider, "provider");
                this.$this_SerializersModule.registerSerializer(kClass, new ContextualProvider.WithTypeArguments(provider), true);
            }

            public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer2) {
                Intrinsics.checkNotNullParameter(kClass, "kClass");
                Intrinsics.checkNotNullParameter(serializer2, "serializer");
                this.$this_SerializersModule.registerSerializer(kClass, new ContextualProvider.Argless(serializer2), true);
            }

            public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                this.$this_SerializersModule.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
            }

            public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                this.$this_SerializersModule.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }
            {
                this.$this_SerializersModule = $receiver;
            }

            @Deprecated(message="Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith=@ReplaceWith(expression="polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports={}), level=DeprecationLevel.WARNING)
            public <Base> void polymorphicDefault(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, baseClass, defaultDeserializerProvider);
            }

            public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                this.$this_SerializersModule.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }
        });
        return var3_3.build();
    }
}

