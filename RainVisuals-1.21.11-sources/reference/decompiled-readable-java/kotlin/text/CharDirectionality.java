/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.CharDirectionality;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d\u00a8\u0006\u001e"}, d2={"Lkotlin/text/CharDirectionality;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "kotlin-stdlib"})
public final class CharDirectionality
extends Enum<CharDirectionality> {
    public static final /* enum */ CharDirectionality SEGMENT_SEPARATOR;
    public static final /* enum */ CharDirectionality WHITESPACE;
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ CharDirectionality RIGHT_TO_LEFT_ARABIC;
    private static final /* synthetic */ CharDirectionality[] $VALUES;
    private final int value;
    public static final /* enum */ CharDirectionality EUROPEAN_NUMBER_TERMINATOR;
    public static final /* enum */ CharDirectionality LEFT_TO_RIGHT;
    @NotNull
    private static final Lazy<Map<Integer, CharDirectionality>> directionalityMap$delegate;
    public static final /* enum */ CharDirectionality PARAGRAPH_SEPARATOR;
    public static final /* enum */ CharDirectionality EUROPEAN_NUMBER;
    public static final /* enum */ CharDirectionality LEFT_TO_RIGHT_EMBEDDING;
    public static final /* enum */ CharDirectionality ARABIC_NUMBER;
    public static final /* enum */ CharDirectionality EUROPEAN_NUMBER_SEPARATOR;
    public static final /* enum */ CharDirectionality RIGHT_TO_LEFT_EMBEDDING;
    public static final /* enum */ CharDirectionality LEFT_TO_RIGHT_OVERRIDE;
    public static final /* enum */ CharDirectionality BOUNDARY_NEUTRAL;
    public static final /* enum */ CharDirectionality POP_DIRECTIONAL_FORMAT;
    public static final /* enum */ CharDirectionality COMMON_NUMBER_SEPARATOR;
    public static final /* enum */ CharDirectionality OTHER_NEUTRALS;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ CharDirectionality RIGHT_TO_LEFT_OVERRIDE;
    public static final /* enum */ CharDirectionality RIGHT_TO_LEFT;
    public static final /* enum */ CharDirectionality NONSPACING_MARK;
    public static final /* enum */ CharDirectionality UNDEFINED;

    private CharDirectionality(int value) {
        this.value = value;
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[])$VALUES.clone();
    }

    public static CharDirectionality valueOf(String value) {
        return Enum.valueOf(CharDirectionality.class, value);
    }

    public final int getValue() {
        return this.value;
    }

    @NotNull
    public static EnumEntries<CharDirectionality> getEntries() {
        return $ENTRIES;
    }

    static {
        UNDEFINED = new CharDirectionality(-1);
        LEFT_TO_RIGHT = new CharDirectionality(0);
        RIGHT_TO_LEFT = new CharDirectionality(1);
        RIGHT_TO_LEFT_ARABIC = new CharDirectionality(2);
        EUROPEAN_NUMBER = new CharDirectionality(3);
        EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality(4);
        EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality(5);
        ARABIC_NUMBER = new CharDirectionality(6);
        COMMON_NUMBER_SEPARATOR = new CharDirectionality(7);
        NONSPACING_MARK = new CharDirectionality(8);
        BOUNDARY_NEUTRAL = new CharDirectionality(9);
        PARAGRAPH_SEPARATOR = new CharDirectionality(10);
        SEGMENT_SEPARATOR = new CharDirectionality(11);
        WHITESPACE = new CharDirectionality(12);
        OTHER_NEUTRALS = new CharDirectionality(13);
        LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality(14);
        LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality(15);
        RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality(16);
        RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality(17);
        POP_DIRECTIONAL_FORMAT = new CharDirectionality(18);
        $VALUES = CharDirectionality.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        Companion = new Companion(null);
        directionalityMap$delegate = LazyKt.lazy(Companion.directionalityMap.2.INSTANCE);
    }

    private static final /* synthetic */ CharDirectionality[] $values() {
        CharDirectionality[] charDirectionalityArray = new CharDirectionality[20];
        charDirectionalityArray[0] = UNDEFINED;
        charDirectionalityArray[1] = LEFT_TO_RIGHT;
        charDirectionalityArray[2] = RIGHT_TO_LEFT;
        charDirectionalityArray[3] = RIGHT_TO_LEFT_ARABIC;
        charDirectionalityArray[4] = EUROPEAN_NUMBER;
        charDirectionalityArray[5] = EUROPEAN_NUMBER_SEPARATOR;
        charDirectionalityArray[6] = EUROPEAN_NUMBER_TERMINATOR;
        charDirectionalityArray[7] = ARABIC_NUMBER;
        charDirectionalityArray[8] = COMMON_NUMBER_SEPARATOR;
        charDirectionalityArray[9] = NONSPACING_MARK;
        charDirectionalityArray[10] = BOUNDARY_NEUTRAL;
        charDirectionalityArray[11] = PARAGRAPH_SEPARATOR;
        charDirectionalityArray[12] = SEGMENT_SEPARATOR;
        charDirectionalityArray[13] = WHITESPACE;
        charDirectionalityArray[14] = OTHER_NEUTRALS;
        charDirectionalityArray[15] = LEFT_TO_RIGHT_EMBEDDING;
        charDirectionalityArray[16] = LEFT_TO_RIGHT_OVERRIDE;
        charDirectionalityArray[17] = RIGHT_TO_LEFT_EMBEDDING;
        charDirectionalityArray[18] = RIGHT_TO_LEFT_OVERRIDE;
        charDirectionalityArray[19] = POP_DIRECTIONAL_FORMAT;
        return charDirectionalityArray;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2={"Lkotlin/text/CharDirectionality$Companion;", "", "<init>", "()V", "", "directionality", "Lkotlin/text/CharDirectionality;", "valueOf", "(I)Lkotlin/text/CharDirectionality;", "", "directionalityMap$delegate", "Lkotlin/Lazy;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap", "kotlin-stdlib"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @NotNull
        public final CharDirectionality valueOf(int directionality) {
            CharDirectionality charDirectionality = this.getDirectionalityMap().get(directionality);
            if (charDirectionality == null) {
                throw new IllegalArgumentException("Directionality #" + directionality + " is not defined.");
            }
            return charDirectionality;
        }

        private final Map<Integer, CharDirectionality> getDirectionalityMap() {
            Lazy lazy = directionalityMap$delegate;
            return (Map)lazy.getValue();
        }

        private Companion() {
        }
    }
}

