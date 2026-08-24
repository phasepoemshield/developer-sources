/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0012J\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H'\u00a2\u0006\u0004\b\u000b\u0010\tR,\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2={"Lkotlin/reflect/KProperty2;", "D", "E", "V", "Lkotlin/reflect/KProperty;", "Lkotlin/Function2;", "receiver1", "receiver2", "get", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "Lkotlin/reflect/KProperty2$Getter;", "getGetter", "()Lkotlin/reflect/KProperty2$Getter;", "getGetter$annotations", "()V", "getter", "Getter", "kotlin-stdlib"})
public interface KProperty2<D, E, V>
extends KProperty<V>,
Function2<D, E, V> {
    public V get(D var1, E var2);

    @Nullable
    @SinceKotlin(version="1.1")
    public Object getDelegate(D var1, E var2);

    @NotNull
    public Getter<D, E, V> getGetter();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/reflect/KProperty2$Getter;", "D", "E", "V", "Lkotlin/reflect/KProperty$Getter;", "Lkotlin/Function2;", "kotlin-stdlib"})
    public static interface Getter<D, E, V>
    extends KProperty.Getter<V>,
    Function2<D, E, V> {
    }
}

