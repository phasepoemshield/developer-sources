/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01295
 *  minecraft.class01894
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03249
 *  minecraft.class03287
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui.widget;

import me.shedaniel.clothconfig2.gui.widget.DynamicElementListWidget$ElementEntry;
import me.shedaniel.clothconfig2.gui.widget.DynamicSmoothScrollingEntryListWidget;
import minecraft.class00392;
import minecraft.class01295;
import minecraft.class01894;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03249;
import minecraft.class03287;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class06202;

public abstract class DynamicElementListWidget<E extends DynamicElementListWidget$ElementEntry<E>>
extends DynamicSmoothScrollingEntryListWidget<E> {
    private static final class00392 USAGE_NARRATION = class00392.L((String)"narration.selection.usage");

    @Override
    protected boolean isSelected(int n) {
        return false;
    }

    public DynamicElementListWidget(class06202 class062022, int n, int n2, int n3, int n4, class01894 class018942) {
        super(class062022, n, n2, n3, n4, class018942);
    }

    public class02106 method_48205(class02089 class020892) {
        class02106 class021062;
        if (this.getItemCount() == 0) {
            return null;
        }
        if (!(class020892 instanceof class02116)) {
            return super.method_48205(class020892);
        }
        class02116 class021162 = (class02116)class020892;
        DynamicElementListWidget$ElementEntry dynamicElementListWidget$ElementEntry2 = (DynamicElementListWidget$ElementEntry)this.getFocused();
        if (class021162.y().N() == class03287.field_41822 && dynamicElementListWidget$ElementEntry2 != null) {
            return class02106.N((class01295)this, (class02106)dynamicElementListWidget$ElementEntry2.method_48205(class020892));
        }
        int n = -1;
        class03249 class032492 = class021162.y();
        if (dynamicElementListWidget$ElementEntry2 != null) {
            n = dynamicElementListWidget$ElementEntry2.method_25396().indexOf(dynamicElementListWidget$ElementEntry2.method_25399());
        }
        if (n == -1) {
            switch (class032492) {
                case field_41828: {
                    n = Integer.MAX_VALUE;
                    class032492 = class03249.field_41827;
                    break;
                }
                case field_41829: {
                    n = 0;
                    class032492 = class03249.field_41827;
                    break;
                }
                default: {
                    n = 0;
                }
            }
        }
        DynamicElementListWidget$ElementEntry dynamicElementListWidget$ElementEntry3 = dynamicElementListWidget$ElementEntry2;
        do {
            if ((dynamicElementListWidget$ElementEntry3 = this.nextEntry(class032492, dynamicElementListWidget$ElementEntry -> !dynamicElementListWidget$ElementEntry.method_25396().isEmpty(), dynamicElementListWidget$ElementEntry3)) != null) continue;
            return null;
        } while ((class021062 = dynamicElementListWidget$ElementEntry3.focusPathAtIndex((class02089)class021162, n)) == null);
        return class02106.N((class01295)this, (class02106)class021062);
    }

    @Override
    public void method_37020(class03428 class034282) {
        DynamicElementListWidget$ElementEntry dynamicElementListWidget$ElementEntry = (DynamicElementListWidget$ElementEntry)this.hoveredItem;
        if (dynamicElementListWidget$ElementEntry != null) {
            dynamicElementListWidget$ElementEntry.method_37020(class034282.N());
            this.narrateListElementPosition(class034282, dynamicElementListWidget$ElementEntry);
        } else {
            DynamicElementListWidget$ElementEntry dynamicElementListWidget$ElementEntry2 = (DynamicElementListWidget$ElementEntry)this.getFocused();
            if (dynamicElementListWidget$ElementEntry2 != null) {
                dynamicElementListWidget$ElementEntry2.method_37020(class034282.N());
                this.narrateListElementPosition(class034282, dynamicElementListWidget$ElementEntry2);
            }
        }
        class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.component_list.usage"));
    }

    @Override
    public class03432 method_37018() {
        return this.method_25370() ? class03432.field_33786 : super.method_37018();
    }

    @Override
    public void method_25395(class04654 class046542) {
        super.method_25395(class046542);
        if (class046542 == null) {
            this.selectItem(null);
        }
    }
}

