/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"})
public final class FileWalkDirection
extends Enum<FileWalkDirection> {
    public static final /* enum */ FileWalkDirection TOP_DOWN = new FileWalkDirection();
    private static final /* synthetic */ FileWalkDirection[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ FileWalkDirection BOTTOM_UP = new FileWalkDirection();

    static {
        $VALUES = FileWalkDirection.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<FileWalkDirection> getEntries() {
        return $ENTRIES;
    }

    public static FileWalkDirection valueOf(String value) {
        return Enum.valueOf(FileWalkDirection.class, value);
    }

    private static final /* synthetic */ FileWalkDirection[] $values() {
        FileWalkDirection[] fileWalkDirectionArray = new FileWalkDirection[2];
        fileWalkDirectionArray[0] = TOP_DOWN;
        fileWalkDirectionArray[1] = BOTTOM_UP;
        return fileWalkDirectionArray;
    }
}

