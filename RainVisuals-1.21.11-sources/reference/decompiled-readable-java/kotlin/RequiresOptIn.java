/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@java.lang.annotation.Target(value={ElementType.ANNOTATION_TYPE})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\t\u00a8\u0006\u000b"}, d2={"Lkotlin/RequiresOptIn;", "", "", "message", "Lkotlin/RequiresOptIn$Level;", "level", "<init>", "(Ljava/lang/String;Lkotlin/RequiresOptIn$Level;)V", "()Lkotlin/RequiresOptIn$Level;", "()Ljava/lang/String;", "Level", "kotlin-stdlib"})
@Retention(value=AnnotationRetention.BINARY)
@Target(allowedTargets={AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(value=RetentionPolicy.CLASS)
@SinceKotlin(version="1.3")
public @interface RequiresOptIn {
    public Level level() default Level.ERROR;

    public String message() default "";

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/RequiresOptIn$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"})
    public static final class Level
    extends Enum<Level> {
        private static final /* synthetic */ Level[] $VALUES;
        public static final /* enum */ Level ERROR;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ Level WARNING;

        public static Level[] values() {
            return (Level[])$VALUES.clone();
        }

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        static {
            WARNING = new Level();
            ERROR = new Level();
            $VALUES = Level.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        public static Level valueOf(String value) {
            return Enum.valueOf(Level.class, value);
        }

        private static final /* synthetic */ Level[] $values() {
            Level[] levelArray = new Level[2];
            levelArray[0] = WARNING;
            levelArray[1] = ERROR;
            return levelArray;
        }
    }
}

