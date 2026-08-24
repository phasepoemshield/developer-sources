/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@kotlin.annotation.Target(allowedTargets={AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
@MustBeDocumented
@Target(value={})
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\u00a8\u0006\b"}, d2={"Lkotlinx/serialization/EncodeDefault;", "", "Lkotlinx/serialization/EncodeDefault$Mode;", "mode", "<init>", "(Lkotlinx/serialization/EncodeDefault$Mode;)V", "()Lkotlinx/serialization/EncodeDefault$Mode;", "Mode", "kotlinx-serialization-core"})
@Documented
@Retention(value=RetentionPolicy.RUNTIME)
public @interface EncodeDefault {
    public Mode mode() default Mode.ALWAYS;

    @ExperimentalSerializationApi
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotlinx/serialization/EncodeDefault$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "NEVER", "kotlinx-serialization-core"})
    public static final class Mode
    extends Enum<Mode> {
        public static final /* enum */ Mode NEVER;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final /* enum */ Mode ALWAYS;

        private static final /* synthetic */ Mode[] $values() {
            Mode[] modeArray = new Mode[2];
            modeArray[0] = ALWAYS;
            modeArray[1] = NEVER;
            return modeArray;
        }

        public static Mode valueOf(String value) {
            return Enum.valueOf(Mode.class, value);
        }

        static {
            ALWAYS = new Mode();
            NEVER = new Mode();
            $VALUES = Mode.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        @NotNull
        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        public static Mode[] values() {
            return (Mode[])$VALUES.clone();
        }
    }
}

