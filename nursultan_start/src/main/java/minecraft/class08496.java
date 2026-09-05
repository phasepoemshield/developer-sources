/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class02022
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import minecraft.class02022;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class08496 {
    public static final class08496 field_57012 = new class08496(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
    private final List<class02022> field_57013;
    private final List<class02022> field_57014;
    private final List<class02022> field_57015;
    private final List<class02022> field_57016;
    private final List<class02022> field_57017;
    private final List<class02022> field_57018;
    private final List<class02022> field_57019;
    private final List<class02022> field_57020;

    public class08496(List<class02022> list, List<class02022> list2, List<class02022> list3, List<class02022> list4, List<class02022> list5, List<class02022> list6, List<class02022> list7, List<class02022> list8) {
        this.field_57013 = list;
        this.field_57014 = list2;
        this.field_57015 = list3;
        this.field_57016 = list4;
        this.field_57017 = list5;
        this.field_57018 = list6;
        this.field_57019 = list7;
        this.field_57020 = list8;
    }

    public List<class02022> method_68049(@Nullable class07211 class072112) {
        class07211 class072113 = class072112;
        int n = 0;
        return switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"NORTH", "SOUTH", "EAST", "WEST", "UP", "DOWN"}, (class07211)class072113, (int)n)) {
            default -> throw new MatchException(null, null);
            case -1 -> this.field_57014;
            case 0 -> this.field_57015;
            case 1 -> this.field_57016;
            case 2 -> this.field_57017;
            case 3 -> this.field_57018;
            case 4 -> this.field_57019;
            case 5 -> this.field_57020;
        };
    }

    public List<class02022> method_68048() {
        return this.field_57013;
    }
}

