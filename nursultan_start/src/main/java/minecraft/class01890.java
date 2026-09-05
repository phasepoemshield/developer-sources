/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public final class class01890
extends Enum<class01890>
implements class05033 {
    public static final /* enum */ class01890 field_45156 = new class01890(0, "list");
    public static final /* enum */ class01890 field_45157 = new class01890(1, "sidebar");
    public static final /* enum */ class01890 field_45158 = new class01890(2, "below_name");
    public static final /* enum */ class01890 field_45159 = new class01890(3, "sidebar.team.black");
    public static final /* enum */ class01890 field_45160 = new class01890(4, "sidebar.team.dark_blue");
    public static final /* enum */ class01890 field_45161 = new class01890(5, "sidebar.team.dark_green");
    public static final /* enum */ class01890 field_45162 = new class01890(6, "sidebar.team.dark_aqua");
    public static final /* enum */ class01890 field_45163 = new class01890(7, "sidebar.team.dark_red");
    public static final /* enum */ class01890 field_45164 = new class01890(8, "sidebar.team.dark_purple");
    public static final /* enum */ class01890 field_45165 = new class01890(9, "sidebar.team.gold");
    public static final /* enum */ class01890 field_45166 = new class01890(10, "sidebar.team.gray");
    public static final /* enum */ class01890 field_45167 = new class01890(11, "sidebar.team.dark_gray");
    public static final /* enum */ class01890 field_45168 = new class01890(12, "sidebar.team.blue");
    public static final /* enum */ class01890 field_45169 = new class01890(13, "sidebar.team.green");
    public static final /* enum */ class01890 field_45170 = new class01890(14, "sidebar.team.aqua");
    public static final /* enum */ class01890 field_45171 = new class01890(15, "sidebar.team.red");
    public static final /* enum */ class01890 field_45172 = new class01890(16, "sidebar.team.light_purple");
    public static final /* enum */ class01890 field_45173 = new class01890(17, "sidebar.team.yellow");
    public static final /* enum */ class01890 field_45174 = new class01890(18, "sidebar.team.white");
    public static final class05031<class01890> field_45175;
    public static final IntFunction<class01890> field_45176;
    private final int field_45177;
    private final String field_45178;
    private static final /* synthetic */ class01890[] field_45179;

    private class01890(int n2, String string2) {
        this.field_45177 = n2;
        this.field_45178 = string2;
    }

    static {
        field_45179 = class01890.y();
        field_45175 = class05033.N(class01890::values);
        field_45176 = class02121.N(class01890::N, (Object[])class01890.values(), (class02126)class02126.field_41664);
    }

    public static class01890[] values() {
        return (class01890[])field_45179.clone();
    }

    public static class01890 valueOf(String string) {
        return Enum.valueOf(class01890.class, string);
    }

    private static /* synthetic */ class01890[] y() {
        return new class01890[]{field_45156, field_45157, field_45158, field_45159, field_45160, field_45161, field_45162, field_45163, field_45164, field_45165, field_45166, field_45167, field_45168, field_45169, field_45170, field_45171, field_45172, field_45173, field_45174};
    }

    public static @Nullable class01890 N(class06541 class065412) {
        return switch (class065412) {
            default -> throw new MatchException(null, null);
            case class06541.field_1074 -> field_45159;
            case class06541.field_1058 -> field_45160;
            case class06541.field_1077 -> field_45161;
            case class06541.field_1062 -> field_45162;
            case class06541.field_1079 -> field_45163;
            case class06541.field_1064 -> field_45164;
            case class06541.field_1065 -> field_45165;
            case class06541.field_1080 -> field_45166;
            case class06541.field_1063 -> field_45167;
            case class06541.field_1078 -> field_45168;
            case class06541.field_1060 -> field_45169;
            case class06541.field_1075 -> field_45170;
            case class06541.field_1061 -> field_45171;
            case class06541.field_1076 -> field_45172;
            case class06541.field_1054 -> field_45173;
            case class06541.field_1068 -> field_45174;
            case class06541.field_1067, class06541.field_1056, class06541.field_1073, class06541.field_1070, class06541.field_1051, class06541.field_1055 -> null;
        };
    }

    public int N() {
        return this.field_45177;
    }

    public String method_15434() {
        return this.field_45178;
    }
}

