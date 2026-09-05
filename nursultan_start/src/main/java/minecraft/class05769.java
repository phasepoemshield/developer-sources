/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class07438
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class05746;
import minecraft.class05775;
import minecraft.class07438;

public abstract class class05769
extends Enum<class05769> {
    public static final /* enum */ class05769 field_18855 = new class05746("RUN_ONE", 0);
    public static final /* enum */ class05769 field_18856 = new class05775("TRY_ALL", 1);
    private static final /* synthetic */ class05769[] field_18857;

    static {
        field_18857 = class05769.N();
    }

    public static class05769[] values() {
        return (class05769[])field_18857.clone();
    }

    public static class05769 valueOf(String string) {
        return Enum.valueOf(class05769.class, string);
    }

    private static /* synthetic */ class05769[] N() {
        return new class05769[]{field_18855, field_18856};
    }

    public abstract <E extends class07438> void N(Stream<class04142<? super E>> var1, class04782 var2, E var3, long var4);
}

