/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\f8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\f8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u00178&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001c8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020!8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u001c8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b(\u0010\u0010\u001a\u0004\b'\u0010\u001eR\u001c\u0010.\u001a\u0004\u0018\u00010*8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b-\u0010\u0010\u001a\u0004\b+\u0010,\u00a8\u0006/"}, d2={"Lkotlin/reflect/KCallable;", "R", "Lkotlin/reflect/KAnnotatedElement;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "isAbstract", "()Z", "isAbstract$annotations", "()V", "isFinal", "isFinal$annotations", "isOpen", "isOpen$annotations", "isSuspend", "isSuspend$annotations", "", "getName", "()Ljava/lang/String;", "getName$annotations", "name", "", "getParameters", "()Ljava/util/List;", "getParameters$annotations", "parameters", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "getReturnType$annotations", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "kotlin-stdlib"})
public interface KCallable<R>
extends KAnnotatedElement {
    @NotNull
    public List<KTypeParameter> getTypeParameters();

    public boolean isSuspend();

    public boolean isFinal();

    public boolean isOpen();

    public boolean isAbstract();

    public R call(Object ... var1);

    @NotNull
    public String getName();

    @NotNull
    public List<KParameter> getParameters();

    @Nullable
    public KVisibility getVisibility();

    public R callBy(@NotNull Map<KParameter, ? extends Object> var1);

    @NotNull
    public KType getReturnType();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void getReturnType$annotations() {
        }

        @IntrinsicConstEvaluation
        public static /* synthetic */ void getName$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isAbstract$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isFinal$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getVisibility$annotations() {
        }

        @SinceKotlin(version="1.3")
        public static /* synthetic */ void isSuspend$annotations() {
        }

        public static /* synthetic */ void getParameters$annotations() {
        }
    }
}

