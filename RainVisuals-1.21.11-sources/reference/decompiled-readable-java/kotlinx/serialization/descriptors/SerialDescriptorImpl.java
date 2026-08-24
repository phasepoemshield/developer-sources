/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010 R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010$R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030A8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u00101\u00a8\u0006G"}, d2={"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "", "elementsCount", "", "typeParameters", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "index", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "toString", "()Ljava/lang/String;", "_hashCode$delegate", "Lkotlin/Lazy;", "get_hashCode", "_hashCode", "annotations", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "", "elementAnnotations", "[Ljava/util/List;", "elementDescriptors", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementNames", "[Ljava/lang/String;", "", "elementOptionality", "[Z", "I", "getElementsCount", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "", "name2Index", "Ljava/util/Map;", "Ljava/lang/String;", "getSerialName", "", "serialNames", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "typeParametersDescriptors", "kotlinx-serialization-core"})
public final class SerialDescriptorImpl
implements CachedNames,
SerialDescriptor {
    @NotNull
    private final List<Annotation>[] elementAnnotations;
    @NotNull
    private final String serialName;
    @NotNull
    private final SerialKind kind;
    @NotNull
    private final Set<String> serialNames;
    @NotNull
    private final List<Annotation> annotations;
    @NotNull
    private final Lazy _hashCode$delegate;
    @NotNull
    private final SerialDescriptor[] typeParametersDescriptors;
    @NotNull
    private final String[] elementNames;
    @NotNull
    private final Map<String, Integer> name2Index;
    @NotNull
    private final SerialDescriptor[] elementDescriptors;
    private final int elementsCount;
    @NotNull
    private final boolean[] elementOptionality;

    @Override
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer n = this.name2Index.get(name);
        return n != null ? n : -3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        void var1_1;
        List<Annotation>[] $this$getChecked$iv = this.elementAnnotations;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    @Override
    @NotNull
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return this.kind;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.getElementsCount()), ", ", this.getSerialName() + '(', ")", 0, null, new Function1<Integer, CharSequence>(this){
            final /* synthetic */ SerialDescriptorImpl this$0;
            {
                this.this$0 = $receiver;
                super(1);
            }

            @NotNull
            public final CharSequence invoke(int it) {
                return this.this$0.getElementName(it) + ": " + this.this$0.getElementDescriptor(it).getSerialName();
            }
        }, 24, null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public String getElementName(int index) {
        void var1_1;
        String[] $this$getChecked$iv = this.elementNames;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(@Nullable Object other) {
        boolean bl;
        block13: {
            SerialDescriptor $this$equalsImpl$iv = this;
            boolean $i$f$equalsImpl = false;
            if ($this$equalsImpl$iv == other) {
                bl = true;
            } else if (!(other instanceof SerialDescriptorImpl)) {
                bl = false;
            } else if (!Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor)other).getSerialName())) {
                bl = false;
            } else {
                SerialDescriptorImpl otherDescriptor = (SerialDescriptorImpl)other;
                boolean bl2 = false;
                if (!Arrays.equals(this.typeParametersDescriptors, otherDescriptor.typeParametersDescriptors)) {
                    bl = false;
                } else if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor)other).getElementsCount()) {
                    bl = false;
                } else {
                    int index$iv = 0;
                    int n = $this$equalsImpl$iv.getElementsCount();
                    while (index$iv < n) {
                        void var6_7;
                        if (!Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), ((SerialDescriptor)other).getElementDescriptor(index$iv).getSerialName())) {
                            bl = false;
                            break block13;
                        }
                        if (!Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), ((SerialDescriptor)other).getElementDescriptor(index$iv).getKind())) {
                            bl = false;
                            break block13;
                        }
                        ++var6_7;
                    }
                    bl = true;
                }
            }
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public SerialDescriptorImpl(@NotNull String serialName, @NotNull SerialKind kind, int elementsCount, @NotNull List<? extends SerialDescriptor> typeParameters, @NotNull ClassSerialDescriptorBuilder builder) {
        void var9_10;
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = elementsCount;
        this.annotations = builder.getAnnotations();
        this.serialNames = CollectionsKt.toHashSet((Iterable)builder.getElementNames$kotlinx_serialization_core());
        Collection $this$toTypedArray$iv = builder.getElementNames$kotlinx_serialization_core();
        boolean $i$f$toTypedArray = false;
        Iterable<Object> thisCollection$iv = $this$toTypedArray$iv;
        this.elementNames = thisCollection$iv.toArray(new String[0]);
        this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        $this$toTypedArray$iv = builder.getElementAnnotations$kotlinx_serialization_core();
        $i$f$toTypedArray = false;
        thisCollection$iv = $this$toTypedArray$iv;
        this.elementAnnotations = thisCollection$iv.toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray((Collection<Boolean>)builder.getElementOptionality$kotlinx_serialization_core());
        Iterable<IndexedValue<String>> $this$map$iv = ArraysKt.withIndex(this.elementNames);
        SerialDescriptorImpl serialDescriptorImpl = this;
        boolean $i$f$map = false;
        thisCollection$iv = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            IndexedValue it = (IndexedValue)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(TuplesKt.to(it.getValue(), it.getIndex()));
        }
        serialDescriptorImpl.name2Index = MapsKt.toMap((List)var9_10);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
        this._hashCode$delegate = LazyKt.lazy((Function0)new Function0<Integer>(this){
            final /* synthetic */ SerialDescriptorImpl this$0;

            @NotNull
            public final Integer invoke() {
                return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this.this$0, SerialDescriptorImpl.access$getTypeParametersDescriptors$p(this.this$0));
            }
            {
                this.this$0 = $receiver;
                super(0);
            }
        });
    }

    public static final /* synthetic */ SerialDescriptor[] access$getTypeParametersDescriptors$p(SerialDescriptorImpl $this) {
        return $this.typeParametersDescriptors;
    }

    private final int get_hashCode() {
        Lazy lazy = this._hashCode$delegate;
        return ((Number)lazy.getValue()).intValue();
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean isElementOptional(int index) {
        void var1_1;
        boolean[] $this$getChecked$iv = this.elementOptionality;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    @Override
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    public int hashCode() {
        return this.get_hashCode();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        void var1_1;
        SerialDescriptor[] $this$getChecked$iv = this.elementDescriptors;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }
}

