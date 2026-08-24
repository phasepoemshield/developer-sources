/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u001a\u00a2\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001a\u00a2\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010$R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00105R%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000308078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010\b\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b@\u0010$R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010DR\"\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0003078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR\"\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010=078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010-R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030Q8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u0001078@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bU\u0010/\u001a\u0004\bV\u0010W\u00a8\u0006Y"}, d2={"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "name", "", "isOptional", "", "addElement", "(Ljava/lang/String;Z)V", "", "buildIndices", "()Ljava/util/Map;", "", "other", "equals", "(Ljava/lang/Object;)Z", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "hashCode", "()I", "isElementOptional", "(I)Z", "annotation", "pushAnnotation", "(Ljava/lang/annotation/Annotation;)V", "a", "pushClassAnnotation", "toString", "()Ljava/lang/String;", "_hashCode$delegate", "Lkotlin/Lazy;", "get_hashCode", "_hashCode", "added", "I", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "", "classAnnotations", "Ljava/util/List;", "getElementsCount", "", "elementsOptionality", "[Z", "Lkotlinx/serialization/internal/GeneratedSerializer;", "indices", "Ljava/util/Map;", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "names", "[Ljava/lang/String;", "propertiesAnnotations", "[Ljava/util/List;", "Ljava/lang/String;", "getSerialName", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "typeParameterDescriptors$delegate", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "kotlinx-serialization-core"})
@PublishedApi
public class PluginGeneratedSerialDescriptor
implements SerialDescriptor,
CachedNames {
    @Nullable
    private final GeneratedSerializer<?> generatedSerializer;
    @NotNull
    private Map<String, Integer> indices;
    @NotNull
    private final String[] names;
    @Nullable
    private List<Annotation> classAnnotations;
    @NotNull
    private final Lazy typeParameterDescriptors$delegate;
    private final int elementsCount;
    @NotNull
    private final Lazy childSerializers$delegate;
    private int added;
    @NotNull
    private final Lazy _hashCode$delegate;
    @NotNull
    private final boolean[] elementsOptionality;
    @NotNull
    private final List<Annotation>[] propertiesAnnotations;
    @NotNull
    private final String serialName;

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.elementsCount), ", ", this.getSerialName() + '(', ")", 0, null, new Function1<Integer, CharSequence>(this){
            final /* synthetic */ PluginGeneratedSerialDescriptor this$0;
            {
                this.this$0 = $receiver;
                super(1);
            }

            @NotNull
            public final CharSequence invoke(int i) {
                return this.this$0.getElementName(i) + ": " + this.this$0.getElementDescriptor(i).getSerialName();
            }
        }, 24, null);
    }

    public int hashCode() {
        return this.get_hashCode();
    }

    @Override
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation>[] $this$getChecked$iv = this.propertiesAnnotations;
        boolean $i$f$getChecked = false;
        List<Annotation> list = $this$getChecked$iv[index];
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    @Override
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @NotNull
    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        Lazy lazy = this.typeParameterDescriptors$delegate;
        return (SerialDescriptor[])lazy.getValue();
    }

    public static final /* synthetic */ GeneratedSerializer access$getGeneratedSerializer$p(PluginGeneratedSerialDescriptor $this) {
        return $this.generatedSerializer;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean isElementOptional(int index) {
        void var1_1;
        boolean[] $this$getChecked$iv = this.elementsOptionality;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    @Override
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer n = this.indices.get(name);
        return n != null ? n : -3;
    }

    /*
     * WARNING - void declaration
     */
    private final Map<String, Integer> buildIndices() {
        void var1_1;
        HashMap indices = new HashMap();
        int i = 0;
        int n = this.names.length;
        while (i < n) {
            void var2_2;
            Integer n2 = i;
            ((Map)indices).put(this.names[i], n2);
            ++var2_2;
        }
        return (Map)var1_1;
    }

    public final void pushClassAnnotation(@NotNull Annotation a2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a2);
    }

    private final int get_hashCode() {
        Lazy lazy = this._hashCode$delegate;
        return ((Number)lazy.getValue()).intValue();
    }

    @Override
    @NotNull
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String string, GeneratedSerializer generatedSerializer, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 2) != 0) {
            generatedSerializer = null;
        }
        this(string, generatedSerializer, n);
    }

    public final void addElement(@NotNull String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, "name");
        ++this.added;
        this.names[this.added] = name;
        this.elementsOptionality[this.added] = isOptional;
        this.propertiesAnnotations[this.added] = null;
        if (this.added == this.elementsCount - 1) {
            this.indices = this.buildIndices();
        }
    }

    public PluginGeneratedSerialDescriptor(@NotNull String serialName, @Nullable GeneratedSerializer<?> generatedSerializer, int elementsCount) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = elementsCount;
        this.added = -1;
        int n = 0;
        int n2 = this.elementsCount;
        String[] stringArray = new String[n2];
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this;
        while (n < n2) {
            int n3 = n++;
            stringArray[n3] = "[UNINITIALIZED]";
        }
        pluginGeneratedSerialDescriptor.names = stringArray;
        this.propertiesAnnotations = new List[this.elementsCount];
        this.elementsOptionality = new boolean[this.elementsCount];
        this.indices = MapsKt.emptyMap();
        this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<KSerializer<?>[]>(this){
            final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

            @NotNull
            public final KSerializer<?>[] invoke() {
                KSerializer<?>[] kSerializerArray = PluginGeneratedSerialDescriptor.access$getGeneratedSerializer$p(this.this$0);
                if (kSerializerArray == null || (kSerializerArray = kSerializerArray.childSerializers()) == null) {
                    kSerializerArray = PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
                }
                return kSerializerArray;
            }
            {
                this.this$0 = $receiver;
                super(0);
            }
        });
        this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<SerialDescriptor[]>(this){
            final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

            /*
             * WARNING - void declaration
             */
            @NotNull
            public final SerialDescriptor[] invoke() {
                List list;
                KSerializer<?>[] kSerializerArray = PluginGeneratedSerialDescriptor.access$getGeneratedSerializer$p(this.this$0);
                if (kSerializerArray != null && (kSerializerArray = kSerializerArray.typeParametersSerializers()) != null) {
                    void var4_4;
                    void $this$mapTo$iv$iv;
                    KSerializer<?>[] $this$map$iv = kSerializerArray;
                    boolean $i$f$map = false;
                    KSerializer<?>[] kSerializerArray2 = $this$map$iv;
                    Collection destination$iv$iv = new ArrayList<E>($this$map$iv.length);
                    boolean $i$f$mapTo = false;
                    int n = ((void)$this$mapTo$iv$iv).length;
                    for (int i = 0; i < n; ++i) {
                        void item$iv$iv;
                        void it = item$iv$iv = $this$mapTo$iv$iv[i];
                        Collection collection = destination$iv$iv;
                        boolean bl = false;
                        collection.add(it.getDescriptor());
                    }
                    list = (List)var4_4;
                } else {
                    list = null;
                }
                return Platform_commonKt.compactArray(list);
            }
            {
                this.this$0 = $receiver;
                super(0);
            }
        });
        this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0)new Function0<Integer>(this){
            final /* synthetic */ PluginGeneratedSerialDescriptor this$0;
            {
                this.this$0 = $receiver;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this.this$0, this.this$0.getTypeParameterDescriptors$kotlinx_serialization_core());
            }
        });
    }

    @Override
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    @Override
    public final int getElementsCount() {
        return this.elementsCount;
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
            } else if (!(other instanceof PluginGeneratedSerialDescriptor)) {
                bl = false;
            } else if (!Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor)other).getSerialName())) {
                bl = false;
            } else {
                PluginGeneratedSerialDescriptor otherDescriptor = (PluginGeneratedSerialDescriptor)other;
                boolean bl2 = false;
                if (!Arrays.equals(this.getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core())) {
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
    @Override
    @NotNull
    public String getElementName(int index) {
        void var1_1;
        String[] $this$getChecked$iv = this.names;
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[var1_1];
    }

    /*
     * WARNING - void declaration
     */
    public final void pushAnnotation(@NotNull Annotation annotation) {
        void var1_1;
        List list;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> it = this.propertiesAnnotations[this.added];
        boolean bl = false;
        if (it == null) {
            void var5_4;
            ArrayList<Annotation> result = new ArrayList<Annotation>(1);
            this.propertiesAnnotations[this.added] = result;
            list = (List)var5_4;
        } else {
            void var3_2;
            list = var3_2;
        }
        void list2 = list;
        list2.add(var1_1);
    }

    @Override
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        KSerializer<?>[] $this$getChecked$iv = this.getChildSerializers();
        boolean $i$f$getChecked = false;
        return $this$getChecked$iv[index].getDescriptor();
    }

    @Override
    @NotNull
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    private final KSerializer<?>[] getChildSerializers() {
        Lazy lazy = this.childSerializers$delegate;
        return (KSerializer[])lazy.getValue();
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String string, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((n & 2) != 0) {
            bl = false;
        }
        pluginGeneratedSerialDescriptor.addElement(string, bl);
    }
}

