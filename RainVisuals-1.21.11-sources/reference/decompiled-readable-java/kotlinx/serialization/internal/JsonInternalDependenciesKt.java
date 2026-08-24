/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CoreFriendModuleApi;
import kotlinx.serialization.internal.Platform_commonKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "jsonCachedSerialNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Set;", "kotlinx-serialization-core"})
public final class JsonInternalDependenciesKt {
    @CoreFriendModuleApi
    @NotNull
    public static final Set<String> jsonCachedSerialNames(@NotNull SerialDescriptor $this$jsonCachedSerialNames) {
        Intrinsics.checkNotNullParameter($this$jsonCachedSerialNames, "<this>");
        return Platform_commonKt.cachedSerialNames($this$jsonCachedSerialNames);
    }
}

