/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.ModuleNameRetriever;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0006H\u0002\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f*\u00020\u0006H\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0006H\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"", "expected", "actual", "", "checkDebugMetadataVersion", "(II)V", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "getDebugMetadataAnnotation", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;", "getLabel", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "", "", "getSpilledVariableFieldMapping", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "getStackTraceElementImpl", "COROUTINES_DEBUG_METADATA_VERSION", "I", "kotlin-stdlib"})
public final class DebugMetadataKt {
    private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

    private static final void checkDebugMetadataVersion(int expected, int actual) {
        if (actual > expected) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final int getLabel(BaseContinuationImpl $this$getLabel) {
        int n;
        try {
            Field field = $this$getLabel.getClass().getDeclaredField("label");
            field.setAccessible(true);
            Object object = field.get($this$getLabel);
            Integer n2 = object instanceof Integer ? (Integer)object : null;
            n = (n2 != null ? n2 : 0) - 1;
        }
        catch (Exception exception) {
            n = -1;
        }
        return n;
    }

    @Nullable
    @SinceKotlin(version="1.3")
    @JvmName(name="getSpilledVariableFieldMapping")
    public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl $this$getSpilledVariableFieldMapping) {
        Intrinsics.checkNotNullParameter($this$getSpilledVariableFieldMapping, "<this>");
        DebugMetadata debugMetadata = DebugMetadataKt.getDebugMetadataAnnotation($this$getSpilledVariableFieldMapping);
        if (debugMetadata == null) {
            return null;
        }
        DebugMetadata debugMetadata2 = debugMetadata;
        DebugMetadataKt.checkDebugMetadataVersion(1, debugMetadata2.v());
        ArrayList<String> res = new ArrayList<String>();
        int label = DebugMetadataKt.getLabel($this$getSpilledVariableFieldMapping);
        int[] nArray = debugMetadata2.i();
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            int i2 = i;
            int labelOfIndex = nArray[i];
            if (labelOfIndex != label) continue;
            res.add(debugMetadata2.s()[i2]);
            res.add(debugMetadata2.n()[i2]);
        }
        Collection $this$toTypedArray$iv = res;
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        return thisCollection$iv.toArray(new String[0]);
    }

    private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl $this$getDebugMetadataAnnotation) {
        return $this$getDebugMetadataAnnotation.getClass().getAnnotation(DebugMetadata.class);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.3")
    @Nullable
    @JvmName(name="getStackTraceElement")
    public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl $this$getStackTraceElementImpl) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$getStackTraceElementImpl, "<this>");
        DebugMetadata debugMetadata = DebugMetadataKt.getDebugMetadataAnnotation($this$getStackTraceElementImpl);
        if (debugMetadata == null) {
            return null;
        }
        DebugMetadata debugMetadata2 = debugMetadata;
        DebugMetadataKt.checkDebugMetadataVersion(1, debugMetadata2.v());
        int label = DebugMetadataKt.getLabel($this$getStackTraceElementImpl);
        int lineNumber = label < 0 ? -1 : debugMetadata2.l()[label];
        String moduleName = ModuleNameRetriever.INSTANCE.getModuleName($this$getStackTraceElementImpl);
        String moduleAndClass = moduleName == null ? debugMetadata2.c() : moduleName + '/' + debugMetadata2.c();
        return new StackTraceElement(moduleAndClass, debugMetadata2.m(), debugMetadata2.f(), (int)var3_3);
    }
}

