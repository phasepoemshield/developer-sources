/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0016\u00a2\u0006\u0004\b\u0002\u0010\u0003B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0002\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0016\u00a8\u0006\u0018"}, d2={"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "<init>", "()V", "", "collection", "", "tag", "(Ljava/util/Collection;I)V", "Ljava/io/ObjectInput;", "input", "", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/util/Collection;", "I", "Companion", "kotlin-stdlib"})
public final class SerializedCollection
implements Externalizable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private final int tag;
    @NotNull
    private Collection<?> collection;
    private static final long serialVersionUID = 0L;

    public SerializedCollection(@NotNull Collection<?> collection, int tag) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = tag;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void readExternal(@NotNull ObjectInput input) {
        Collection collection;
        Intrinsics.checkNotNullParameter(input, "input");
        byte flags = input.readByte();
        int tag = flags & 1;
        int other = flags & 0xFFFFFFFE;
        if (other != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + flags + '.');
        }
        int size = input.readInt();
        if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
        }
        SerializedCollection serializedCollection = this;
        switch (tag) {
            case 0: {
                List list;
                List list2 = list = CollectionsKt.createListBuilder(size);
                SerializedCollection serializedCollection2 = serializedCollection;
                boolean bl = false;
                int n = 0;
                while (n < size) {
                    void $this$readExternal_u24lambda_u241;
                    int it = n++;
                    boolean bl2 = false;
                    $this$readExternal_u24lambda_u241.add(input.readObject());
                }
                SerializedCollection serializedCollection3 = serializedCollection2;
                collection = CollectionsKt.build(list);
                break;
            }
            case 1: {
                Set set;
                Set $this$readExternal_u24lambda_u241 = set = SetsKt.createSetBuilder(size);
                SerializedCollection serializedCollection4 = serializedCollection;
                boolean bl = false;
                int n = 0;
                while (n < size) {
                    void $this$readExternal_u24lambda_u243;
                    int it = n++;
                    boolean bl3 = false;
                    $this$readExternal_u24lambda_u243.add(input.readObject());
                }
                SerializedCollection serializedCollection3 = serializedCollection4;
                collection = SetsKt.build(set);
                break;
            }
            default: {
                throw new InvalidObjectException("Unsupported collection type tag: " + tag + '.');
            }
        }
        serializedCollection3.collection = collection;
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> iterator2 = this.collection.iterator();
        while (iterator2.hasNext()) {
            Object element = iterator2.next();
            output.writeObject(element);
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\t\u00a8\u0006\u000b"}, d2={"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "<init>", "()V", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

