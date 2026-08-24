/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0018R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\t\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "", "getIndex", "()I", "index", "", "isOptional", "()Z", "isVararg", "isVararg$annotations", "()V", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "Kind", "kotlin-stdlib"})
public interface KParameter
extends KAnnotatedElement {
    @NotNull
    public Kind getKind();

    public int getIndex();

    @Nullable
    public String getName();

    @NotNull
    public KType getType();

    public boolean isVararg();

    public boolean isOptional();

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"})
    public static final class Kind
    extends Enum<Kind> {
        public static final /* enum */ Kind EXTENSION_RECEIVER;
        public static final /* enum */ Kind INSTANCE;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ Kind VALUE;
        private static final /* synthetic */ Kind[] $VALUES;

        @NotNull
        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }

        static {
            INSTANCE = new Kind();
            EXTENSION_RECEIVER = new Kind();
            VALUE = new Kind();
            $VALUES = Kind.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        public static Kind valueOf(String value) {
            return Enum.valueOf(Kind.class, value);
        }

        private static final /* synthetic */ Kind[] $values() {
            Kind[] kindArray = new Kind[3];
            kindArray[0] = INSTANCE;
            kindArray[1] = EXTENSION_RECEIVER;
            kindArray[2] = VALUE;
            return kindArray;
        }

        public static Kind[] values() {
            return (Kind[])$VALUES.clone();
        }
    }

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isVararg$annotations() {
        }
    }
}

