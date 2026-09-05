/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00425
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class03434
 *  minecraft.class03448
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06613
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen;
import me.shedaniel.clothconfig2.gui.entries.TextListEntry$1WidthLimitedCharSink;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00425;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class03434;
import minecraft.class03448;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06613;
import org.apache.commons.lang3.mutable.MutableObject;

public class TextListEntry
extends TooltipListEntry<Object> {
    public static final int LINE_HEIGHT = 12;
    public static final int DISABLED_COLOR = class02566.M((int)Objects.requireNonNull(class06541.field_1063.i()));
    private final class01590 textRenderer;
    private final int color;
    private final class00392 text;
    private int savedWidth;
    private int savedX;
    private int savedY;
    private List<class01028> wrappedLines;

    @Deprecated
    public TextListEntry(class00392 class003922, class00392 class003923, int n, Supplier<Optional<class00392[]>> supplier) {
        super(class003922, supplier);
        this.textRenderer = (class01590)class06202.Nq().i_3;
        this.savedWidth = -1;
        this.savedX = -1;
        this.savedY = -1;
        this.text = class003923;
        this.color = n;
        this.wrappedLines = Collections.emptyList();
    }

    @Deprecated
    public TextListEntry(class00392 class003922, class00392 class003923, int n) {
        this(class003922, class003923, n, null);
    }

    @Deprecated
    public TextListEntry(class00392 class003922, class00392 class003923) {
        this(class003922, class003923, -1);
    }

    public Object getValue() {
        return null;
    }

    public Optional<Object> getDefaultValue() {
        return Optional.empty();
    }

    public List<? extends class04654> method_25396() {
        return Collections.emptyList();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            class00405 class004052 = this.getTextAt(class066132.n(), class066132.t());
            AbstractConfigScreen abstractConfigScreen = this.getConfigScreen();
            if (abstractConfigScreen != null && class004052 != null && class004052.Z() != null) {
                AbstractConfigScreen.handleClickEvent(class004052.Z(), class06202.Nq(), abstractConfigScreen);
                return true;
            }
        }
        return super.method_25402(class066132, bl);
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        Object object2;
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        if (this.savedWidth != n4 || this.savedX != n3 || this.savedY != n2) {
            this.wrappedLines = this.textRenderer.L((class05936)this.text, n4);
            this.savedWidth = n4;
            this.savedX = n3;
            this.savedY = n2;
        }
        int n8 = n2 + 7;
        int n9 = this.isEnabled() ? this.color : DISABLED_COLOR;
        for (Object object2 : this.wrappedLines) {
            class010542.y((class01590)class06202.Nq().i_3, object2, n3, n8, n9);
            Objects.requireNonNull((class01590)class06202.Nq().i_3);
            n8 += 9 + 3;
        }
        class00405 class004052 = this.getTextAt(n6, n7);
        object2 = this.getConfigScreen();
        if (class004052 != null && object2 != null) {
            if ((class03448)class06202.Nq().T_3 == null && class004052.z() != null && class004052.z().N() == class00425.field_24343) {
                return;
            }
            class010542.N((class01590)class06202.Nq().i_3, class004052, n6, n7);
        }
    }

    private class00405 getTextAt(double d, double d2) {
        int n = this.wrappedLines.size();
        if (n > 0) {
            int n2;
            int n3 = class04995.N((double)(d - (double)this.savedX));
            int n4 = class04995.N((double)(d2 - 7.0 - (double)this.savedY));
            if (n3 >= 0 && n4 >= 0 && n3 <= this.savedWidth && n4 < 12 * n + n && (n2 = n4 / 12) < this.wrappedLines.size()) {
                class01028 class010282 = this.wrappedLines.get(n2);
                return this.componentStyleAtWidth(class010282, n3);
            }
        }
        return null;
    }

    public int getItemHeight() {
        if (this.savedWidth == -1) {
            return 12;
        }
        int n = this.wrappedLines.size();
        return n == 0 ? 0 : 14 + n * 12;
    }

    public List<? extends class03434> narratables() {
        return Collections.emptyList();
    }

    private class00405 componentStyleAtWidth(class01028 class010282, int n3) {
        TextListEntry$1WidthLimitedCharSink textListEntry$1WidthLimitedCharSink = new TextListEntry$1WidthLimitedCharSink(this, n3);
        MutableObject mutableObject = new MutableObject();
        class010282.accept((n, class004052, n2) -> {
            if (!textListEntry$1WidthLimitedCharSink.accept(n, class004052, n2)) {
                mutableObject.setValue((Object)class004052);
                return false;
            }
            return true;
        });
        return (class00405)mutableObject.get();
    }
}

