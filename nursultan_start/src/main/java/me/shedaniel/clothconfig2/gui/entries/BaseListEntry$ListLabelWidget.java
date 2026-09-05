/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class03556
 *  minecraft.class04654
 *  minecraft.class04909
 *  minecraft.class06202
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.BaseListCell;
import me.shedaniel.clothconfig2.gui.entries.BaseListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class03556;
import minecraft.class04654;
import minecraft.class04909;
import minecraft.class06202;
import minecraft.class06613;

public class BaseListEntry$ListLabelWidget
implements class04654 {
    protected Rectangle rectangle = new Rectangle();
    final /* synthetic */ BaseListEntry this$0;

    public BaseListEntry$ListLabelWidget(BaseListEntry baseListEntry) {
        this.this$0 = baseListEntry;
    }

    public boolean method_25405(double d, double d2) {
        return this.rectangle.contains(d, d2) && !this.this$0.resetWidget.method_25405(d, d2);
    }

    public void method_25365(boolean bl) {
    }

    public boolean method_25370() {
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.this$0.isEnabled()) {
            return false;
        }
        if (this.this$0.resetWidget.method_25405(class066132.n(), class066132.t())) {
            return false;
        }
        if (this.this$0.isInsideCreateNew(class066132.n(), class066132.t())) {
            BaseListCell baseListCell;
            this.this$0.setExpanded(true);
            if (this.this$0.insertInFront()) {
                baseListCell = (BaseListCell)((Object)this.this$0.createNewInstance.apply(this.this$0.self()));
                this.this$0.cells.add(0, baseListCell);
                this.this$0.widgets.add(0, (class04654)baseListCell);
            } else {
                baseListCell = (BaseListCell)((Object)this.this$0.createNewInstance.apply(this.this$0.self()));
                this.this$0.cells.add(baseListCell);
                this.this$0.widgets.add((class04654)baseListCell);
            }
            baseListCell.onAdd();
            class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            return true;
        }
        if (this.this$0.isDeleteButtonEnabled() && this.this$0.isInsideDelete(class066132.n(), class066132.t())) {
            class04654 class046542 = this.this$0.method_25399();
            if (this.this$0.isExpanded() && class046542 instanceof BaseListCell) {
                ((BaseListCell)class046542).onDelete();
                this.this$0.cells.remove(class046542);
                this.this$0.widgets.remove(class046542);
                class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            }
            return true;
        }
        if (this.rectangle.contains(class066132.n(), class066132.t())) {
            this.this$0.setExpanded(!this.this$0.expanded);
            class06202.Nq().Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            return true;
        }
        return false;
    }
}

