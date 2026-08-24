/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlinx.serialization.ExperimentalSerializationApi;

@Target(value={ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lkotlinx/serialization/InheritableSerialInfo;", "", "<init>", "()V", "kotlinx-serialization-core"})
@MustBeDocumented
@kotlin.annotation.Retention(value=AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={AnnotationTarget.ANNOTATION_CLASS})
@Documented
@ExperimentalSerializationApi
@Retention(value=RetentionPolicy.CLASS)
public @interface InheritableSerialInfo {
}

