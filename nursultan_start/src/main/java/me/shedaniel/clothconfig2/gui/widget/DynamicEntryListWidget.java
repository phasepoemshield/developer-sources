/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.MatchException
 *  me.shedaniel.clothconfig2.api.HideableWidget
 *  me.shedaniel.clothconfig2.api.scroll.ScrollingContainer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01894
 *  minecraft.class03249
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class04664
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class07849
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui.widget;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import me.shedaniel.clothconfig2.api.HideableWidget;
import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget$Entries;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget$Entry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01894;
import minecraft.class03249;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class04664;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class07849;
import minecraft.class08394;

public abstract class DynamicEntryListWidget<E extends DynamicEntryListWidget$Entry<E>>
extends class04664
implements class01294,
class03434 {
    protected static final int DRAG_OUTSIDE = -2;
    protected final class06202 client;
    private final List<E> entries = new DynamicEntryListWidget$Entries(this);
    private float totalTicks = 1.0f;
    private List<E> visibleEntries = Collections.emptyList();
    public int width;
    public int height;
    public int top;
    public int bottom;
    public int right;
    public int left;
    protected boolean verticallyCenter = true;
    protected int yDrag = -2;
    protected boolean selectionVisible = true;
    protected boolean renderSelection;
    protected int headerHeight;
    protected double scroll;
    protected boolean scrolling;
    protected E hoveredItem;
    protected E selectedItem;
    protected class01894 backgroundLocation;

    protected boolean removeEntry(E e) {
        boolean bl = this.method_25396().remove(e);
        if (bl && e == this.getSelectedItem()) {
            this.selectItem(null);
        }
        return bl;
    }

    protected int addItem(E e) {
        this.method_25396().add(e);
        return this.method_25396().size() - 1;
    }

    protected boolean isSelected(int n) {
        return Objects.equals(this.getSelectedItem(), this.getItem(n));
    }

    public DynamicEntryListWidget(class06202 class062022, int n, int n2, int n3, int n4, class01894 class018942) {
        this.client = class062022;
        this.width = n;
        this.height = n2;
        this.top = n3;
        this.bottom = n4;
        this.left = 0;
        this.right = n;
        this.backgroundLocation = class018942;
    }

    protected E remove(int n) {
        E e = this.getItem(n);
        return (E)(this.removeEntry(e) ? e : null);
    }

    protected E nextEntry(class03249 class032492, Predicate<E> predicate) {
        return this.nextEntry(class032492, predicate, this.getSelectedItem());
    }

    protected E nextEntry(class03249 class032492, Predicate<E> predicate, E e) {
        int n;
        switch (class032492) {
            default: {
                throw new MatchException(null, null);
            }
            case field_41829: 
            case field_41828: {
                int n2 = 0;
                break;
            }
            case field_41826: {
                int n2 = -1;
                break;
            }
            case field_41827: {
                int n2 = n = 1;
            }
        }
        if (!this.method_25396().isEmpty() && n != 0) {
            int n3 = e == null ? (n > 0 ? 0 : this.method_25396().size() - 1) : this.method_25396().indexOf(e) + n;
            for (int i = n3; i >= 0 && i < this.entries.size(); i += n) {
                DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry = (DynamicEntryListWidget$Entry)this.entries.get(i);
                if (!predicate.test(dynamicEntryListWidget$Entry)) continue;
                return (E)dynamicEntryListWidget$Entry;
            }
        }
        return null;
    }

    protected E nextEntry(class03249 class032492) {
        return (E)this.nextEntry(class032492, dynamicEntryListWidget$Entry -> true);
    }

    protected E getItem(int n) {
        return (E)((DynamicEntryListWidget$Entry)this.visibleChildren().get(n));
    }

    protected int getItemCount() {
        return this.visibleChildren().size();
    }

    public void ensureVisible(int n, int n2) {
        int n3 = n + n2;
        double d = this.getScroll();
        if ((double)n < d) {
            this.capYPosition(n);
        } else if ((double)n3 > d + (double)this.height) {
            this.capYPosition(n3);
        }
    }

    protected void ensureVisible(E e) {
        this.ensureVisible((int)this.getScroll() - this.top - this.headerHeight - 4 + this.getRowTop(this.visibleChildren().indexOf(e)), ((DynamicEntryListWidget$Entry)e).getItemHeight());
    }

    public List<E> method_25396() {
        return this.entries;
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.v() == 264) {
            this.moveSelection(1);
            return true;
        }
        if (class066012.v() == 265) {
            this.moveSelection(-1);
            return true;
        }
        return false;
    }

    public /* synthetic */ class04654 method_25399() {
        return this.getFocused();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.totalTicks += f;
        if (this.totalTicks >= 1.0f) {
            this.totalTicks %= 1.0f;
            this.tickList();
        }
        this.drawBackground();
        int n3 = this.getScrollbarPosition();
        int n4 = n3 + 6;
        this.renderBackBackground(class010542);
        int n5 = this.getRowLeft();
        int n6 = this.top + 4 - (int)this.getScroll();
        if (this.renderSelection) {
            this.renderHeader(class010542, n5, n6);
        }
        class010542.L(this.left, this.top, this.left + this.width, this.bottom);
        this.renderList(class010542, n5, n6, n, n2, f);
        class010542.R();
        this.renderHoleBackground(class010542, 0, this.top, 255, 255);
        this.renderHoleBackground(class010542, this.bottom, this.height, 255, 255);
        class010542.N(class08394.Na, class05096.field_49895, this.left, this.top - 2, 0.0f, 0.0f, this.width, 2, 32, 2);
        class010542.N(class08394.Na, class05096.field_49896, this.left, this.bottom, 0.0f, 0.0f, this.width, 2, 32, 2);
        int n7 = this.getMaxScroll();
        this.renderScrollBar(class010542, n7, n3, n4);
        this.renderDecorations(class010542, n, n2);
    }

    public void method_37020(class03428 class034282) {
        E e = this.hoveredItem;
        if (e != null) {
            ((DynamicEntryListWidget$Entry)e).method_37020(class034282.N());
            this.narrateListElementPosition(class034282, e);
        } else {
            E e2 = this.getFocused();
            if (e2 != null) {
                ((DynamicEntryListWidget$Entry)e2).method_37020(class034282.N());
                this.narrateListElementPosition(class034282, e2);
            }
        }
        class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.component_list.usage"));
    }

    public class03255 method_48202() {
        return new class03255(this.left, this.top, this.right - this.left, this.bottom - this.top);
    }

    public class03432 method_37018() {
        if (this.method_25370()) {
            return class03432.field_33786;
        }
        return this.hoveredItem != null ? class03432.field_33785 : class03432.field_33784;
    }

    public boolean method_25405(double d, double d2) {
        return d2 >= (double)this.top && d2 <= (double)this.bottom && d >= (double)this.left && d <= (double)this.right;
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (super.method_25403(class066132, d, d2)) {
            return true;
        }
        if (class066132.v() == 0 && this.scrolling) {
            if (class066132.t() < (double)this.top) {
                this.capYPosition(0.0);
            } else if (class066132.t() > (double)this.bottom) {
                this.capYPosition(this.getMaxScroll());
            } else {
                double d3 = Math.max(1, this.getMaxScroll());
                int n = this.bottom - this.top;
                int n2 = class04995.N((int)((int)((float)(n * n) / (float)this.getMaxScrollPosition())), (int)32, (int)(n - 8));
                double d4 = Math.max(1.0, d3 / (double)(n - n2));
                this.capYPosition(this.getScroll() + d2 * d4);
            }
            return true;
        }
        return false;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.visibleChildren()) {
            if (!dynamicEntryListWidget$Entry.method_25401(d, d2, d3, d4)) continue;
            return true;
        }
        this.capYPosition(this.getScroll() - d4 * (double)(this.getMaxScroll() / this.getItemCount()) / 2.0);
        return d4 != 0.0;
    }

    public void method_25395(class04654 class046542) {
        super.method_25395(class046542);
        int n = this.entries.indexOf(class046542);
        if (n >= 0) {
            DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry = (DynamicEntryListWidget$Entry)this.entries.get(n);
            this.selectItem(dynamicEntryListWidget$Entry);
            if (this.client.Nc().y()) {
                this.ensureVisible(dynamicEntryListWidget$Entry);
            }
        }
    }

    public boolean method_25370() {
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (this.getFocused() != null) {
            this.getFocused().method_25406(class066132);
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.updateScrollingState(class066132.n(), class066132.t(), class066132.v());
        if (!this.method_25405(class066132.n(), class066132.t())) {
            return false;
        }
        E e = this.getItemAtPosition(class066132.n(), class066132.t());
        if (e != null) {
            if (e.method_25402(class066132, bl)) {
                this.method_25395((class04654)e);
                this.method_25398(true);
                return true;
            }
        } else if (class066132.v() == 0) {
            this.clickedHeader((int)(class066132.n() - (double)(this.left + this.width / 2 - this.getItemWidth() / 2)), (int)(class066132.t() - (double)this.top) + (int)this.getScroll() - 4);
            return true;
        }
        return this.scrolling;
    }

    public void renderItem(class01054 class010542, E e, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ((DynamicEntryListWidget$Entry)e).setBounds(new Rectangle(n3, n2, n4, n5));
        ((DynamicEntryListWidget$Entry)e).render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
    }

    public E getFocused() {
        return (E)((DynamicEntryListWidget$Entry)super.method_25399());
    }

    public void renderList(class01054 class010542, int n, int n2, int n3, int n4, float f) {
        class07849 class078492 = class07849.y();
        class07331 class073312 = class078492.N(VertexFormat.class_5596.field_27382, class07835.z);
        this.hoveredItem = this.method_25405(n3, n4) ? this.getItemAtPosition(n3, n4) : null;
        int n5 = 0;
        int n6 = 0;
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.visibleChildren()) {
            int n7;
            int n8;
            int n9 = n2 + this.headerHeight + n5;
            int n10 = dynamicEntryListWidget$Entry.getItemHeight() - 4;
            int n11 = this.getItemWidth();
            boolean bl = Objects.equals(this.hoveredItem, dynamicEntryListWidget$Entry);
            if (this.selectionVisible && Objects.equals(this.selectedItem, dynamicEntryListWidget$Entry)) {
                n8 = this.left + (this.width - n11) / 2;
                n7 = this.left + (this.width + n11) / 2;
                class010542.N(n8, n9 - 2, n7, n9 + n10 + 2, this.method_25370() ? -1 : -8355712);
                class010542.N(n8 + 1, n9 - 1, n7 - 1, n9 + n10 + 1, -16777216);
            }
            n8 = this.getRowTop(n6);
            n7 = this.getRowLeft();
            this.renderItem(class010542, dynamicEntryListWidget$Entry, n6, n8, n7, n11, n10, n3, n4, bl, f);
            n5 += dynamicEntryListWidget$Entry.getItemHeight();
            ++n6;
        }
    }

    public void selectItem(E e) {
        this.selectedItem = e;
    }

    public int getRowTop(int n) {
        int n2 = this.top + 4 - (int)this.getScroll() + this.headerHeight;
        int n3 = 0;
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.visibleChildren()) {
            if (n <= n3++) break;
            n2 += dynamicEntryListWidget$Entry.getItemHeight();
        }
        return n2;
    }

    protected int getRowLeft() {
        return this.left + this.width / 2 - this.getItemWidth() / 2 + 2;
    }

    public void tickList() {
        this.updateVisibleChildren();
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.method_25396()) {
            dynamicEntryListWidget$Entry.tick();
        }
    }

    public void setLeftPos(int n) {
        this.left = n;
        this.right = n + this.width;
    }

    protected void scroll(int n) {
        this.capYPosition(this.getScroll() + (double)n);
        this.yDrag = -2;
    }

    public double getScroll() {
        return this.scroll;
    }

    protected final void clearItems() {
        this.method_25396().clear();
    }

    protected int getMaxScroll() {
        return Math.max(0, this.getMaxScrollPosition() - (this.bottom - this.top - 4));
    }

    protected void renderScrollBar(class01054 class010542, int n, int n2, int n3) {
        if (n > 0) {
            int n4 = (this.bottom - this.top) * (this.bottom - this.top) / this.getMaxScrollPosition();
            n4 = class04995.N((int)n4, (int)32, (int)(this.bottom - this.top - 8));
            int n5 = (int)this.getScroll() * (this.bottom - this.top - n4) / n + this.top;
            if (n5 < this.top) {
                n5 = this.top;
            }
            class010542.N(class08394.Na, ScrollingContainer.SCROLLER_BACKGROUND_SPRITE, n2, this.top, n3 - n2, this.bottom - this.top);
            class010542.N(class08394.Na, ScrollingContainer.SCROLLER_SPRITE, n2, n5, 6, n4);
        }
    }

    protected void setRenderHeader(boolean bl, int n) {
        this.renderSelection = bl;
        this.headerHeight = n;
        if (!bl) {
            this.headerHeight = 0;
        }
    }

    protected final E getItemAtPosition(double d, double d2) {
        int n = this.left + this.width / 2;
        int n2 = n - this.getItemWidth() / 2;
        int n3 = n + this.getItemWidth() / 2;
        int n4 = class04995.N((double)(d2 - (double)this.top)) - this.headerHeight + (int)this.getScroll() - 4;
        if ((double)this.getScrollbarPosition() <= d) {
            return null;
        }
        if (d < (double)n2) {
            return null;
        }
        if (d > (double)n3) {
            return null;
        }
        if (n4 < 0) {
            return null;
        }
        DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry = null;
        int n5 = 0;
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry2 : this.visibleChildren()) {
            if ((n5 += dynamicEntryListWidget$Entry2.getItemHeight()) <= n4) continue;
            dynamicEntryListWidget$Entry = dynamicEntryListWidget$Entry2;
            break;
        }
        return (E)dynamicEntryListWidget$Entry;
    }

    protected void renderHeader(class01054 class010542, int n, int n2) {
    }

    public List<E> visibleChildren() {
        return this.visibleEntries;
    }

    protected void moveSelection(int n) {
        List<E> list = this.visibleChildren();
        if (list.isEmpty()) {
            return;
        }
        int n2 = list.indexOf(this.getSelectedItem());
        int n3 = class04995.N((int)(n2 + n), (int)0, (int)(this.getItemCount() - 1));
        E e = this.getItem(n3);
        this.selectItem(e);
        this.ensureVisible(e);
    }

    public int getScrollBottom() {
        return (int)this.getScroll() - this.height - this.headerHeight;
    }

    public void capYPosition(double d) {
        this.scroll = class04995.N((double)d, (double)0.0, (double)this.getMaxScroll());
    }

    public int getItemWidth() {
        return 220;
    }

    protected void clickedHeader(int n, int n2) {
    }

    protected void drawBackground() {
    }

    public void setRenderSelection(boolean bl) {
        this.selectionVisible = bl;
    }

    public E getSelectedItem() {
        return this.selectedItem;
    }

    protected void centerScrollOn(E e) {
        List<E> list = this.visibleChildren();
        double d = (double)(this.bottom - this.top) / -2.0;
        int n = list.indexOf(e);
        int n2 = 0;
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : list) {
            if (n2++ >= n) break;
            d += (double)dynamicEntryListWidget$Entry.getItemHeight();
        }
        this.capYPosition(d);
    }

    protected void renderDecorations(class01054 class010542, int n, int n2) {
    }

    public void updateSize(int n, int n2, int n3, int n4) {
        this.width = n;
        this.height = n2;
        this.top = n3;
        this.bottom = n4;
        this.left = 0;
        this.right = n;
    }

    protected void renderHoleBackground(class01054 class010542, int n, int n2, int n3, int n4) {
        if (this.backgroundLocation != null) {
            class010542.N(class08394.Na, this.backgroundLocation, this.left, n, (float)this.right, (float)n2, this.width, n2 - n, this.width, n2 - n, 32, 32, -12566464);
        }
    }

    @Deprecated
    protected void renderBackBackground(class01054 class010542) {
        class010542.N(class08394.Na, Objects.requireNonNullElse(this.backgroundLocation, class05096.field_49511), this.left, this.top, (float)this.right, (float)this.bottom, this.width, this.bottom - this.top, this.width, this.bottom - this.top, 32, 32, -14671840);
    }

    private void updateVisibleChildren() {
        this.visibleEntries = this.method_25396().stream().filter(HideableWidget::isDisplayed).toList();
    }

    protected void narrateListElementPosition(class03428 class034282, E e) {
        int n;
        List<E> list = this.visibleChildren();
        if (list.size() > 1 && (n = list.indexOf(e)) != -1) {
            class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.list", (Object[])new Object[]{n + 1, list.size()}));
        }
    }

    protected int getScrollbarPosition() {
        return this.width / 2 + 124;
    }

    protected int getMaxScrollPosition() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = this.headerHeight;
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.visibleChildren()) {
            n += dynamicEntryListWidget$Entry.getItemHeight();
            if (dynamicEntryListWidget$Entry.getMorePossibleHeight() < 0) continue;
            arrayList.add(n + dynamicEntryListWidget$Entry.getMorePossibleHeight());
        }
        arrayList.add(n);
        return arrayList.stream().max(Integer::compare).orElse(0);
    }

    protected void updateScrollingState(double d, double d2, int n) {
        this.scrolling = n == 0 && d >= (double)this.getScrollbarPosition() && d < (double)(this.getScrollbarPosition() + 6);
    }
}

