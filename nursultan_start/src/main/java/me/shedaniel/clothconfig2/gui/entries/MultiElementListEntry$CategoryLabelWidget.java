/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class03556
 *  minecraft.class04654
 *  minecraft.class04909
 *  minecraft.class06202
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class03556;
import minecraft.class04654;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class06613;

public class MultiElementListEntry$CategoryLabelWidget
implements class03434,
class04654 {
    final Rectangle rectangle = new Rectangle();
    private boolean isHovered;
    final /* synthetic */ MultiElementListEntry this$0;

    public MultiElementListEntry$CategoryLabelWidget(MultiElementListEntry multiElementListEntry) {
        this.this$0 = multiElementListEntry;
    }

    public void method_37020(class03428 class034282) {
        class034282.N(class03457.field_33788, this.this$0.getFieldName());
    }

    public class03432 method_37018() {
        return this.isHovered ? class03432.field_33785 : class03432.field_33784;
    }

    public void method_25365(boolean bl) {
    }

    public boolean method_25370() {
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.this$0.isEnabled() && this.rectangle.contains(class066132.n(), class066132.t())) {
            this.this$0.setExpanded(!this.this$0.expanded);
            class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            this.isHovered = true;
            return true;
        }
        this.isHovered = false;
        return false;
    }
}

