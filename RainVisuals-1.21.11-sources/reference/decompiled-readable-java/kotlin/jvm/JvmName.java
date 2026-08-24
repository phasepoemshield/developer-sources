/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

@kotlin.annotation.Target(allowedTargets={AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FILE})
@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.CLASS)
@Documented
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/jvm/JvmName;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "kotlin-stdlib"})
@MustBeDocumented
@kotlin.annotation.Retention(value=AnnotationRetention.BINARY)
public @interface JvmName {
    public String name();
}

