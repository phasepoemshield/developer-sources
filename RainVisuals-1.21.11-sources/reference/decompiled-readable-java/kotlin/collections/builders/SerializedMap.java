/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0016\u00a2\u0006\u0004\b\u0002\u0010\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0013\u00a8\u0006\u0015"}, d2={"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "<init>", "()V", "", "map", "(Ljava/util/Map;)V", "Ljava/io/ObjectInput;", "input", "", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/util/Map;", "Companion", "kotlin-stdlib"})
final class SerializedMap
implements Externalizable {
    @NotNull
    private Map<?, ?> map;
    private static final long serialVersionUID = 0L;
    @NotNull
    public static final Companion Companion = new Companion(null);

    private final Object readResolve() {
        return this.map;
    }

    @Override
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        Iterator<Map.Entry<?, ?>> iterator2 = this.map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<?, ?> entry = iterator2.next();
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public SerializedMap() {
        this(MapsKt.emptyMap());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void readExternal(@NotNull ObjectInput input) {
        Map<Object, void> map;
        Intrinsics.checkNotNullParameter(input, "input");
        byte flags = input.readByte();
        if (flags != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + flags);
        }
        int size = input.readInt();
        if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
        }
        Map<Object, void> $this$readExternal_u24lambda_u241 = map = MapsKt.createMapBuilder(size);
        SerializedMap serializedMap = this;
        boolean bl = false;
        int n = 0;
        while (n < size) {
            void var11_12;
            int it = n++;
            boolean bl2 = false;
            Object key = input.readObject();
            Object value = input.readObject();
            $this$readExternal_u24lambda_u241.put(key, var11_12);
        }
        serializedMap.map = MapsKt.build(map);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/collections/builders/SerializedMap$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

