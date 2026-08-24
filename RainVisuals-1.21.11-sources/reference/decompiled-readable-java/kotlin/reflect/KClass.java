/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00a6\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001H'\u00a2\u0006\u0004\b\u000e\u0010\tR&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010!\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b!\u0010\u0017R\u001a\u0010#\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u0017R\u001a\u0010%\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010\u0017R\u001a\u0010'\u001a\u00020\u00078&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b(\u0010\u0014\u001a\u0004\b'\u0010\u0017R$\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\u000f8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b+\u0010\u0014\u001a\u0004\b*\u0010\u0012R$\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u000f8&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b.\u0010\u0014\u001a\u0004\b-\u0010\u0012R\u001c\u00103\u001a\u0004\u0018\u00018\u00008&X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b2\u0010\u0014\u001a\u0004\b0\u00101R\u0016\u00107\u001a\u0004\u0018\u0001048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R(\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000088&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u0001048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u00106R \u0010B\u001a\b\u0012\u0004\u0012\u00020?088&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\bA\u0010\u0014\u001a\u0004\b@\u0010:R \u0010F\u001a\b\u0012\u0004\u0012\u00020C088&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\bE\u0010\u0014\u001a\u0004\bD\u0010:R\u001c\u0010K\u001a\u0004\u0018\u00010G8&X\u00a7\u0004\u00a2\u0006\f\u0012\u0004\bJ\u0010\u0014\u001a\u0004\bH\u0010I\u00a8\u0006L"}, d2={"Lkotlin/reflect/KClass;", "", "T", "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "value", "isInstance", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "isAbstract", "()Z", "isAbstract$annotations", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "Lkotlin/reflect/KCallable;", "getMembers", "getMembers$annotations", "members", "getNestedClasses", "getNestedClasses$annotations", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName", "", "getSealedSubclasses", "()Ljava/util/List;", "getSealedSubclasses$annotations", "sealedSubclasses", "getSimpleName", "simpleName", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "kotlin-stdlib"})
public interface KClass<T>
extends KDeclarationContainer,
KAnnotatedElement,
KClassifier {
    @Nullable
    public KVisibility getVisibility();

    public boolean isSealed();

    public boolean isFun();

    @Nullable
    public String getQualifiedName();

    public boolean isData();

    public boolean equals(@Nullable Object var1);

    public boolean isInner();

    @NotNull
    public List<KTypeParameter> getTypeParameters();

    public boolean isValue();

    public boolean isFinal();

    public boolean isCompanion();

    @NotNull
    public Collection<KClass<?>> getNestedClasses();

    public boolean isAbstract();

    public int hashCode();

    @Nullable
    public T getObjectInstance();

    public boolean isOpen();

    @NotNull
    public List<KClass<? extends T>> getSealedSubclasses();

    @NotNull
    public List<KType> getSupertypes();

    @SinceKotlin(version="1.1")
    public boolean isInstance(@Nullable Object var1);

    @NotNull
    public Collection<KFunction<T>> getConstructors();

    @Override
    @NotNull
    public Collection<KCallable<?>> getMembers();

    @Nullable
    public String getSimpleName();

    @Metadata(mv={1, 9, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @SinceKotlin(version="1.5")
        public static /* synthetic */ void isValue$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isInner$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getSupertypes$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isOpen$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isFinal$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void getMembers$annotations() {
        }

        @SinceKotlin(version="1.3")
        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        public static /* synthetic */ void getConstructors$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isSealed$annotations() {
        }

        public static /* synthetic */ void getObjectInstance$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void getVisibility$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isData$annotations() {
        }

        public static /* synthetic */ void getNestedClasses$annotations() {
        }

        @SinceKotlin(version="1.1")
        public static /* synthetic */ void isCompanion$annotations() {
        }

        @SinceKotlin(version="1.4")
        public static /* synthetic */ void isFun$annotations() {
        }
    }
}

