/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JX\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032/\u0010\u000b\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H&\u00a2\u0006\u0004\b\r\u0010\u000eJ5\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016\u00a2\u0006\u0004\b\r\u0010\u0010JM\u0010\u0016\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u0001\"\b\b\u0001\u0010\u0012*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H&\u00a2\u0006\u0004\b\u0016\u0010\u0017JT\u0010\u001c\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\u0005H\u0017\u00a2\u0006\u0004\b\u001c\u0010\u000eJT\u0010\u001d\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\u0005H&\u00a2\u0006\u0004\b\u001d\u0010\u000eJR\u0010!\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032)\u0010 \u001a%\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u0005H&\u00a2\u0006\u0004\b!\u0010\u000e\u00a8\u0006\""}, d2={"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "serializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefault", "polymorphicDefaultDeserializer", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "kotlinx-serialization-core"})
public interface SerializersModuleCollector {
    @Deprecated(message="Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith=@ReplaceWith(expression="polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports={}), level=DeprecationLevel.WARNING)
    public <Base> void polymorphicDefault(@NotNull KClass<Base> var1, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> var2);

    public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> var1, @NotNull KClass<Sub> var2, @NotNull KSerializer<Sub> var3);

    public <T> void contextual(@NotNull KClass<T> var1, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> var2);

    public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> var1, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> var2);

    public <T> void contextual(@NotNull KClass<T> var1, @NotNull KSerializer<T> var2);

    public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> var1, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> var2);

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static <T> void contextual(@NotNull SerializersModuleCollector $this, @NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer2) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer2, "serializer");
            $this.contextual(kClass, new Function1<List<? extends KSerializer<?>>, KSerializer<?>>(serializer2){
                final /* synthetic */ KSerializer<T> $serializer;

                @NotNull
                public final KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.$serializer;
                }
                {
                    this.$serializer = $serializer;
                    super(1);
                }
            });
        }

        @Deprecated(message="Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith=@ReplaceWith(expression="polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports={}), level=DeprecationLevel.WARNING)
        public static <Base> void polymorphicDefault(@NotNull SerializersModuleCollector $this, @NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            $this.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
        }
    }
}

