/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class02071
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06366
 */
package Nursultan;

import Nursultan.class09664;
import Nursultan.class09674;
import Nursultan.class09678;
import Nursultan.class09684;
import Nursultan.class09688;
import minecraft.class00392;
import minecraft.class02071;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06366;

public class class09663
extends class05096 {
    private final class05096 N;

    public class09663(class05096 class050962) {
        super((class00392)class00392.y((String)"Mouse Tweaks Options"));
        this.N = class050962;
    }

    public void method_25426() {
        class09678.N.N();
        this.method_37063((class04654)new class02071(this.field_22789 / 2 - this.field_22793.N((class05936)this.field_22785) / 2, 15, this.field_22789, 9, this.field_22785, this.field_22793));
        this.method_37063((class04654)class06366.N((boolean)class09678.N.N).N(this.field_22789 / 2 - 155, this.field_22790 / 6, 150, 20, (class00392)class00392.y((String)"RMB Tweak"), (class063662, bl) -> {
            class09678.N.N = bl;
        }));
        this.method_37063((class04654)class06366.N((boolean)class09678.N.u).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 24, 150, 20, (class00392)class00392.y((String)"Wheel Tweak"), (class063662, bl) -> {
            class09678.N.u = bl;
        }));
        this.method_37063((class04654)class06366.N((boolean)class09678.N.y).N(this.field_22789 / 2 + 5, this.field_22790 / 6, 150, 20, (class00392)class00392.y((String)"LMB Tweak With Item"), (class063662, bl) -> {
            class09678.N.y = bl;
        }));
        this.method_37063((class04654)class06366.N((boolean)class09678.N.L).N(this.field_22789 / 2 + 5, this.field_22790 / 6 + 24, 150, 20, (class00392)class00392.y((String)"LMB Tweak Without Item"), (class063662, bl) -> {
            class09678.N.L = bl;
        }));
        this.method_37063((class04654)class06366.N((T class096842) -> class00392.y((String)(switch (class096842) {
            default -> throw new MatchException(null, null);
            case class09684.FIRST_TO_LAST -> "First to Last";
            case class09684.LAST_TO_FIRST -> "Last to First";
        })), (Object)((Object)class09678.N.i)).N((Object[])new class09684[]{class09684.FIRST_TO_LAST, class09684.LAST_TO_FIRST}).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 48, 310, 20, (class00392)class00392.y((String)"Wheel Tweak Search Order"), (class063662, class096842) -> {
            class09678.N.i = class096842;
        }));
        this.method_37063((class04654)class06366.N((T class096642) -> class00392.y((String)(switch (class096642) {
            default -> throw new MatchException(null, null);
            case class09664.NORMAL -> "Down to Push, Up to Pull";
            case class09664.INVERTED -> "Up to Push, Down to Pull";
            case class09664.INVENTORY_POSITION_AWARE -> "Inventory Position Aware";
            case class09664.INVENTORY_POSITION_AWARE_INVERTED -> "Inventory Position Aware, Inverted";
        })), (Object)((Object)class09678.N.R)).N((Object[])new class09664[]{class09664.NORMAL, class09664.INVERTED, class09664.INVENTORY_POSITION_AWARE, class09664.INVENTORY_POSITION_AWARE_INVERTED}).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 72, 310, 20, (class00392)class00392.y((String)"Scroll Direction"), (class063662, class096642) -> {
            class09678.N.R = class096642;
        }));
        this.method_37063((class04654)class06366.N((T class096882) -> class00392.y((String)(switch (class096882) {
            default -> throw new MatchException(null, null);
            case class09688.PROPORTIONAL -> "Multiple Wheel Clicks Move Multiple Items";
            case class09688.ALWAYS_ONE -> "Always Move One Item (macOS Compatibility)";
        })), (Object)((Object)class09678.N.M)).N((Object[])new class09688[]{class09688.PROPORTIONAL, class09688.ALWAYS_ONE}).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 96, 310, 20, (class00392)class00392.y((String)"Scroll Scaling"), (class063662, class096882) -> {
            class09678.N.M = class096882;
        }));
        this.method_37063((class04654)class06366.N((boolean)class09674.B).N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 120, 310, 20, (class00392)class00392.y((String)"Debug Mode"), (class063662, bl) -> {
            class09674.B = bl;
        }));
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 27, 200, 20).N());
    }

    public void method_25432() {
        class09678.N.y();
    }

    public void method_25419() {
        this.field_22787.N(this.N);
    }
}

