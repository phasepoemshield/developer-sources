/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.path.ExperimentalPathApi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"})
@SinceKotlin(version="1.7")
@ExperimentalPathApi
public final class PathWalkOption
extends Enum<PathWalkOption> {
    private static final /* synthetic */ PathWalkOption[] $VALUES;
    public static final /* enum */ PathWalkOption BREADTH_FIRST;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ PathWalkOption INCLUDE_DIRECTORIES;
    public static final /* enum */ PathWalkOption FOLLOW_LINKS;

    public static PathWalkOption valueOf(String value) {
        return Enum.valueOf(PathWalkOption.class, value);
    }

    static {
        INCLUDE_DIRECTORIES = new PathWalkOption();
        BREADTH_FIRST = new PathWalkOption();
        FOLLOW_LINKS = new PathWalkOption();
        $VALUES = PathWalkOption.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[])$VALUES.clone();
    }

    @NotNull
    public static EnumEntries<PathWalkOption> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ PathWalkOption[] $values() {
        PathWalkOption[] pathWalkOptionArray = new PathWalkOption[3];
        pathWalkOptionArray[0] = INCLUDE_DIRECTORIES;
        pathWalkOptionArray[1] = BREADTH_FIRST;
        pathWalkOptionArray[2] = FOLLOW_LINKS;
        return pathWalkOptionArray;
    }
}

