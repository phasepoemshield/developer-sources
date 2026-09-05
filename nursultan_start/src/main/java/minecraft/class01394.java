/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class07296
 */
package minecraft;

import minecraft.class01894;
import minecraft.class07296;

public final class class01394
extends Enum<class01394> {
    public static final /* enum */ class01394 field_2701 = new class01394(class01894.y((String)"advancements/box_obtained"), class01894.y((String)"advancements/task_frame_obtained"), class01894.y((String)"advancements/challenge_frame_obtained"), class01894.y((String)"advancements/goal_frame_obtained"));
    public static final /* enum */ class01394 field_2699 = new class01394(class01894.y((String)"advancements/box_unobtained"), class01894.y((String)"advancements/task_frame_unobtained"), class01894.y((String)"advancements/challenge_frame_unobtained"), class01894.y((String)"advancements/goal_frame_unobtained"));
    private final class01894 field_45426;
    private final class01894 field_45427;
    private final class01894 field_45428;
    private final class01894 field_45429;
    private static final /* synthetic */ class01394[] field_2698;

    private class01394(class01894 class018942, class01894 class018943, class01894 class018944, class01894 class018945) {
        this.field_45426 = class018942;
        this.field_45427 = class018943;
        this.field_45428 = class018944;
        this.field_45429 = class018945;
    }

    static {
        field_2698 = class01394.y();
    }

    public static class01394[] values() {
        return (class01394[])field_2698.clone();
    }

    public static class01394 valueOf(String string) {
        return Enum.valueOf(class01394.class, string);
    }

    private static /* synthetic */ class01394[] y() {
        return new class01394[]{field_2701, field_2699};
    }

    public class01894 N(class07296 class072962) {
        return switch (class072962) {
            default -> throw new MatchException(null, null);
            case class07296.field_1254 -> this.field_45427;
            case class07296.field_1250 -> this.field_45428;
            case class07296.field_1249 -> this.field_45429;
        };
    }

    public class01894 N() {
        return this.field_45426;
    }
}

