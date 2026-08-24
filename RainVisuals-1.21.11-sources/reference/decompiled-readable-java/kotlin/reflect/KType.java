/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\f\u0010\u0007\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Lkotlin/reflect/KType;", "Lkotlin/reflect/KAnnotatedElement;", "", "Lkotlin/reflect/KTypeProjection;", "getArguments", "()Ljava/util/List;", "getArguments$annotations", "()V", "arguments", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getClassifier$annotations", "classifier", "", "isMarkedNullable", "()Z", "kotlin-stdlib"})
public interface KType
extends KAnnotatedElement {
    @NotNull
    public List<KTypeProjection> getArguments();

    public boolean isMarkedNullable();

    @Nullable
    public KClassifier getClassifier();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getArguments$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getClassifier$annotations() {
        }
    }
}

