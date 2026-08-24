/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H'\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlinx/serialization/encoding/ChunkedDecoder;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "chunk", "", "consumeChunk", "decodeStringChunked", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"})
@ExperimentalSerializationApi
public interface ChunkedDecoder {
    @ExperimentalSerializationApi
    public void decodeStringChunked(@NotNull Function1<? super String, Unit> var1);
}

