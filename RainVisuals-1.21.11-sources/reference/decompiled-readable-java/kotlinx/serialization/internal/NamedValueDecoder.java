/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.TaggedDecoder;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u0002*\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2={"Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/internal/TaggedDecoder;", "", "<init>", "()V", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "nestedName", "nested", "(Ljava/lang/String;)Ljava/lang/String;", "getTag", "kotlinx-serialization-core"})
public abstract class NamedValueDecoder
extends TaggedDecoder<String> {
    @Override
    @NotNull
    protected final String getTag(@NotNull SerialDescriptor $this$getTag, int index) {
        Intrinsics.checkNotNullParameter($this$getTag, "<this>");
        return this.nested(this.elementName($this$getTag, index));
    }

    @NotNull
    protected String composeName(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return ((CharSequence)parentName).length() == 0 ? childName : parentName + '.' + childName;
    }

    @NotNull
    protected final String nested(@NotNull String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String string = (String)this.getCurrentTagOrNull();
        if (string == null) {
            string = "";
        }
        return this.composeName(string, nestedName);
    }

    @NotNull
    protected String elementName(@NotNull SerialDescriptor descriptor2, int index) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        return descriptor2.getElementName(index);
    }
}

