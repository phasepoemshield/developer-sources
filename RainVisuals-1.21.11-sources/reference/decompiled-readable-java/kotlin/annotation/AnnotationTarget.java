/*
 * Decompiled with CFR 0.152.
 */
package kotlin.annotation;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2={"Lkotlin/annotation/AnnotationTarget;", "", "<init>", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"})
public final class AnnotationTarget
extends Enum<AnnotationTarget> {
    public static final /* enum */ AnnotationTarget CONSTRUCTOR;
    public static final /* enum */ AnnotationTarget FIELD;
    public static final /* enum */ AnnotationTarget PROPERTY;
    public static final /* enum */ AnnotationTarget EXPRESSION;
    public static final /* enum */ AnnotationTarget ANNOTATION_CLASS;
    @SinceKotlin(version="1.1")
    public static final /* enum */ AnnotationTarget TYPEALIAS;
    public static final /* enum */ AnnotationTarget FUNCTION;
    public static final /* enum */ AnnotationTarget CLASS;
    public static final /* enum */ AnnotationTarget PROPERTY_SETTER;
    public static final /* enum */ AnnotationTarget FILE;
    public static final /* enum */ AnnotationTarget VALUE_PARAMETER;
    public static final /* enum */ AnnotationTarget PROPERTY_GETTER;
    public static final /* enum */ AnnotationTarget TYPE;
    public static final /* enum */ AnnotationTarget LOCAL_VARIABLE;
    private static final /* synthetic */ AnnotationTarget[] $VALUES;
    public static final /* enum */ AnnotationTarget TYPE_PARAMETER;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    static {
        CLASS = new AnnotationTarget();
        ANNOTATION_CLASS = new AnnotationTarget();
        TYPE_PARAMETER = new AnnotationTarget();
        PROPERTY = new AnnotationTarget();
        FIELD = new AnnotationTarget();
        LOCAL_VARIABLE = new AnnotationTarget();
        VALUE_PARAMETER = new AnnotationTarget();
        CONSTRUCTOR = new AnnotationTarget();
        FUNCTION = new AnnotationTarget();
        PROPERTY_GETTER = new AnnotationTarget();
        PROPERTY_SETTER = new AnnotationTarget();
        TYPE = new AnnotationTarget();
        EXPRESSION = new AnnotationTarget();
        FILE = new AnnotationTarget();
        TYPEALIAS = new AnnotationTarget();
        $VALUES = AnnotationTarget.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<AnnotationTarget> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationTarget valueOf(String value) {
        return Enum.valueOf(AnnotationTarget.class, value);
    }

    private static final /* synthetic */ AnnotationTarget[] $values() {
        AnnotationTarget[] annotationTargetArray = new AnnotationTarget[15];
        annotationTargetArray[0] = CLASS;
        annotationTargetArray[1] = ANNOTATION_CLASS;
        annotationTargetArray[2] = TYPE_PARAMETER;
        annotationTargetArray[3] = PROPERTY;
        annotationTargetArray[4] = FIELD;
        annotationTargetArray[5] = LOCAL_VARIABLE;
        annotationTargetArray[6] = VALUE_PARAMETER;
        annotationTargetArray[7] = CONSTRUCTOR;
        annotationTargetArray[8] = FUNCTION;
        annotationTargetArray[9] = PROPERTY_GETTER;
        annotationTargetArray[10] = PROPERTY_SETTER;
        annotationTargetArray[11] = TYPE;
        annotationTargetArray[12] = EXPRESSION;
        annotationTargetArray[13] = FILE;
        annotationTargetArray[14] = TYPEALIAS;
        return annotationTargetArray;
    }
}

