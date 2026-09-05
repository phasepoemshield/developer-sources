/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08394
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.joml.Vector2i
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class08394;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollableTooltip$TooltipParent;
import net.caffeinemc.mods.sodium.client.gui.widgets.ScrollbarWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.joml.Vector2i;
import org.jspecify.annotations.NonNull;

public class ScrollableTooltip {
    private static final class01894 ARROW_TEXTURE = class01894.N((String)"sodium", (String)"textures/gui/tooltip_arrows.png");
    private static final int ARROW_WIDTH = 5;
    private static final int SPRITE_WIDTH = 10;
    private static final int ARROW_HEIGHT = 9;
    private static final int TEXT_HORIZONTAL_PADDING = 4;
    private static final int TEXT_VERTICAL_PADDING = 4;
    private final class01590 font;
    private ControlElement hoveredElement;
    private ScrollbarWidget scrollbar;
    private final Vector2i contentSize;
    private Dim2i visibleDim;
    private boolean overlayMode;
    private final List<class01028> content;
    private final ScrollableTooltip$TooltipParent parent;
    private Dim2i tooltipArea;
    private final Vector2i reservedArea;

    public ScrollableTooltip(ScrollableTooltip$TooltipParent scrollableTooltip$TooltipParent) {
        this.font = (class01590)class06202.Nq().i_3;
        this.contentSize = new Vector2i();
        this.content = new ArrayList<class01028>();
        this.reservedArea = new Vector2i();
        this.parent = scrollableTooltip$TooltipParent;
    }

    public void render(@NonNull class01054 class010542) {
        int n;
        int n2;
        if (this.hoveredElement == null) {
            return;
        }
        if (!this.overlayMode) {
            n2 = this.visibleDim.x() - 5;
            n = this.hoveredElement.getCenterY() - 4;
            n = Math.max(n, this.tooltipArea.y());
            n = Math.min(n + 9, this.tooltipArea.getLimitY()) - 9;
            class010542.L();
            class010542.N(class08394.Na, ARROW_TEXTURE, n2, n, 5.0f, 0.0f, 5, 9, 10, 9, 0x40000000);
            class010542.N(class08394.Na, ARROW_TEXTURE, n2, n, 0.0f, 0.0f, 5, 9, 10, 9, -1879048192);
        }
        n2 = this.getLineHeight();
        n = 0;
        if (this.scrollbar != null) {
            n = this.scrollbar.getScrollAmount();
        }
        int n3 = this.overlayMode ? -369098752 : 0x40000000;
        class010542.L(this.visibleDim.x(), this.visibleDim.y(), this.visibleDim.getLimitX(), this.visibleDim.getLimitY());
        class010542.N(this.visibleDim.x(), this.visibleDim.y(), this.visibleDim.getLimitX(), this.visibleDim.getLimitY(), n3);
        class010542.L();
        for (int i = 0; i < this.content.size(); ++i) {
            class010542.y(this.font, this.content.get(i), this.visibleDim.x() + 4, this.visibleDim.y() + 4 + i * n2 - n, -1);
        }
        class010542.R();
    }

    public void setReservedAreaTopLeftCorner(int n, int n2) {
        this.reservedArea.set(n - 3, n2 - 3);
    }

    public void onControlHover(ControlElement controlElement, int n, int n2) {
        if (controlElement != null) {
            this.hoveredElement = controlElement;
            if (this.scrollbar != null) {
                this.parent.method_37066((class04654)this.scrollbar);
                this.scrollbar = null;
            }
            if (this.positionTooltip(false)) {
                this.positionTooltip(true);
                this.scrollbar = this.parent.method_37063(new ScrollbarWidget(new Dim2i(this.visibleDim.getLimitX() - 7, this.visibleDim.y(), 7, this.visibleDim.height()), false, true));
                this.scrollbar.setScrollbarContext(this.visibleDim.height(), this.contentSize.y());
            }
        } else if (this.hoveredElement != null) {
            this.positionTooltip(this.scrollbar != null);
            if (!(n >= this.hoveredElement.getLimitX() && n < this.visibleDim.x() && n2 >= this.hoveredElement.getY() && n2 < this.hoveredElement.getLimitY() || this.visibleDim.containsCursor((double)n, (double)n2))) {
                this.hoveredElement = null;
                if (this.scrollbar != null) {
                    this.parent.method_37066((class04654)this.scrollbar);
                    this.scrollbar = null;
                }
            }
        }
    }

    public boolean mouseScrolled(double d, double d2, double d3) {
        if (this.visibleDim != null && this.visibleDim.containsCursor(d, d2) && this.scrollbar != null) {
            this.scrollbar.scroll((int)(-d3 * 10.0));
            return true;
        }
        return false;
    }

    public void setTooltipArea(Dim2i dim2i) {
        this.tooltipArea = dim2i;
    }

    private boolean positionTooltip(boolean bl) {
        int n;
        int n2;
        int n3 = Math.min(this.tooltipArea.getLimitX() - this.tooltipArea.x(), 200);
        int n4 = this.hoveredElement.getY();
        int n5 = this.tooltipArea.x();
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        boolean bl2 = false;
        int n9 = this.tooltipArea.getLimitY();
        boolean bl3 = this.overlayMode = n3 < 100;
        if (!this.overlayMode) {
            if (this.hoveredElement.getLimitY() < this.reservedArea.y) {
                n6 = n3;
                n7 = n5;
                n8 = n4;
                n9 = this.reservedArea.y;
            } else if (this.tooltipArea.x() < this.reservedArea.x) {
                n2 = this.reservedArea.x - this.tooltipArea.x();
                if (n2 >= 100) {
                    n6 = Math.min(n2, 200);
                    n7 = n5;
                    n8 = n4;
                } else {
                    this.overlayMode = true;
                }
            } else {
                n6 = n3;
                n7 = n5;
                n8 = n4;
            }
        }
        if (this.overlayMode) {
            n6 = this.hoveredElement.getWidth() - 6;
            n7 = this.hoveredElement.getX() + 3;
            n2 = this.hoveredElement.getY() - this.tooltipArea.y();
            n = this.tooltipArea.getLimitY() - this.hoveredElement.getLimitY() - 3;
            if (n >= n2) {
                n8 = this.hoveredElement.getLimitY() + 3;
                n9 = this.tooltipArea.getLimitY() - 3;
                bl2 = true;
            } else {
                n8 = this.hoveredElement.getY() - 3;
                n9 = this.hoveredElement.getY() - 3;
            }
        }
        n2 = this.generateTooltipContent(n6, bl);
        n = n8 + n2;
        if (!bl2) {
            if (n > n9) {
                n8 -= n - n9;
            }
            if (n8 < this.tooltipArea.y()) {
                n8 = this.tooltipArea.y();
            }
        }
        this.contentSize.set(n6, n2);
        int n10 = n9 - n8;
        int n11 = Math.min(n2, n10);
        this.visibleDim = new Dim2i(n7, n8, n6, n11);
        return n2 > n10;
    }

    private int getLineHeight() {
        Objects.requireNonNull(this.font);
        return 9 + 2;
    }

    private int generateTooltipContent(int n, boolean bl) {
        int n2 = n - 8;
        if (bl) {
            n2 -= 7;
        }
        Option option = this.hoveredElement.getOption();
        this.content.clear();
        this.content.addAll(this.font.L((class05936)option.getTooltip(), n2));
        OptionImpact optionImpact = option.getImpact();
        if (optionImpact != null) {
            class05216 class052162 = class00392.N((String)"sodium.options.performance_impact_string", (Object[])new Object[]{optionImpact.getName()});
            this.content.addAll(this.font.L((class05936)class052162.N(class06541.field_1080), n2));
        }
        return this.content.size() * this.getLineHeight() - 2 + 8;
    }
}

