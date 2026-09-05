/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05117
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 */
package me.shedaniel.clothconfig2.gui.widget;

import java.util.List;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget$Entry;
import minecraft.class00392;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05117;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;

public abstract class DynamicElementListWidget$ElementEntry<E extends DynamicElementListWidget$ElementEntry<E>>
extends DynamicEntryListWidget$Entry<E>
implements class01295,
class03434 {
    private class04654 focused;
    private class03434 lastNarratable;
    private boolean dragging;

    public boolean method_25404(class06601 class066012) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25404(class066012);
    }

    public class04654 method_25399() {
        return this.focused;
    }

    public class02106 method_48205(class02089 class020892) {
        if (class020892 instanceof class02116) {
            int n;
            int n2;
            class02116 class021162 = (class02116)class020892;
            switch (class021162.y()) {
                default: {
                    throw new MatchException(null, null);
                }
                case field_41828: {
                    int n3 = -1;
                    break;
                }
                case field_41829: {
                    int n3 = 1;
                    break;
                }
                case field_41826: 
                case field_41827: {
                    int n3 = n2 = 0;
                }
            }
            if (n2 == 0) {
                return null;
            }
            for (int i = n = class04995.N((int)(n2 + this.method_25396().indexOf(this.method_25399())), (int)0, (int)(this.method_25396().size() - 1)); i >= 0 && i < this.method_25396().size(); i += n2) {
                class04654 class046542 = (class04654)this.method_25396().get(i);
                class02106 class021062 = class046542.method_48205(class020892);
                if (class021062 == null) continue;
                return class02106.N((class01295)this, (class02106)class021062);
            }
        }
        return super.method_48205(class020892);
    }

    @Override
    public void method_37020(class03428 class034282) {
        List<class03434> list = this.narratables();
        class05117 class051172 = class05096.method_37061(list, (class03434)this.lastNarratable);
        if (class051172 != null) {
            if (class051172.L().N()) {
                this.lastNarratable = class051172.N();
            }
            if (list.size() > 1) {
                class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.object_list", (Object[])new Object[]{class051172.y() + 1, list.size()}));
                if (class051172.L() == class03432.field_33786) {
                    class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.component_list.usage"));
                }
            }
            class051172.N().method_37020(class034282.N());
        }
    }

    public class03432 method_37018() {
        if (this.method_25370()) {
            return class03432.field_33786;
        }
        return class03432.field_33784;
    }

    public boolean method_37303() {
        return false;
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25400(class06626 class066262) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25400(class066262);
    }

    public void method_25395(class04654 class046542) {
        if (this.focused != null) {
            this.focused.method_25365(false);
        }
        if (class046542 != null) {
            class046542.method_25365(true);
        }
        this.focused = class046542;
    }

    public void method_25398(boolean bl) {
        this.dragging = bl;
    }

    public boolean method_25406(class06613 class066132) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25406(class066132);
    }

    public boolean method_25397() {
        return this.dragging;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        if (!this.isEnabled()) {
            return false;
        }
        return super.method_16803(class066012);
    }

    public class02106 focusPathAtIndex(class02089 class020892, int n) {
        if (this.method_25396().isEmpty()) {
            return null;
        }
        class02106 class021062 = ((class04654)this.method_25396().get(Math.min(n, this.method_25396().size() - 1))).method_48205(class020892);
        return class02106.N((class01295)this, (class02106)class021062);
    }

    @Override
    public abstract List<? extends class03434> narratables();
}

