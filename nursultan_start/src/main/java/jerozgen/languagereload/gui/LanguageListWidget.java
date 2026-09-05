/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class06279
 *  minecraft.class06541
 *  minecraft.class06601
 *  org.jspecify.annotations.Nullable
 */
package jerozgen.languagereload.gui;

import java.util.stream.Stream;
import jerozgen.languagereload.gui.HeaderEntry;
import jerozgen.languagereload.gui.LanguageListWidget$Entry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class06279;
import minecraft.class06541;
import minecraft.class06601;
import org.jspecify.annotations.Nullable;

public class LanguageListWidget
extends class05724<LanguageListWidget$Entry> {
    private final HeaderEntry headerEntry;
    private final class06279 screen;

    public LanguageListWidget(class06202 class062022, class06279 class062792, int n, int n2, class00392 class003922) {
        super(class062022, n, n2 - 83 - 16, 48, 24);
        this.screen = class062792;
        this.headerEntry = new HeaderEntry((class01590)class062022.i_3, (class00392)class00392.i().y(class003922).N(new class06541[]{class06541.field_1073, class06541.field_1067}));
        this.field_22744 = false;
    }

    public void set(Stream<? extends LanguageListWidget$Entry> stream) {
        this.method_25339();
        this.addEntry(this.headerEntry, 13);
        stream.forEach(class012022 -> this.method_25321((class01202)class012022));
        this.method_65506();
    }

    protected int addEntry(LanguageListWidget$Entry languageListWidget$Entry, int n) {
        languageListWidget$Entry.setParent(this);
        return super.method_73370((class01202)languageListWidget$Entry, n);
    }

    public boolean method_25404(class06601 class066012) {
        LanguageListWidget$Entry languageListWidget$Entry = (LanguageListWidget$Entry)this.method_25334();
        return languageListWidget$Entry != null ? languageListWidget$Entry.method_25404(class066012) : super.method_25404(class066012);
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public int getRowHeight() {
        return this.field_62109;
    }

    protected LanguageListWidget$Entry getEntryAtPosition(double d, double d2) {
        LanguageListWidget$Entry languageListWidget$Entry = (LanguageListWidget$Entry)super.method_25308(d, d2);
        return languageListWidget$Entry != null && this.method_44392() && d >= (double)this.method_65507() ? null : languageListWidget$Entry;
    }

    protected void drawSelectionHighlight(class01054 class010542, LanguageListWidget$Entry languageListWidget$Entry, int n) {
        if (this.method_44392()) {
            int n2 = languageListWidget$Entry.method_46426();
            int n3 = languageListWidget$Entry.method_46427();
            int n4 = this.method_65507();
            int n5 = n3 + languageListWidget$Entry.method_25364();
            class010542.N(n2, n3, n4, n5, n);
            class010542.N(n2 + 1, n3 + 1, n4 - 1, n5 - 1, -16777216);
        } else {
            super.method_44398(class010542, (class01202)languageListWidget$Entry, n);
        }
    }

    public int getHoveredSelectionRight() {
        return this.method_44392() ? this.method_65507() : this.method_31383();
    }

    public class06279 getScreen() {
        return this.screen;
    }

    public /* synthetic */ int method_73370(class01202 class012022, int n) {
        return this.addEntry((LanguageListWidget$Entry)class012022, n);
    }

    public int method_25322() {
        return this.field_22758;
    }

    public int method_65507() {
        return this.method_55442() - 6;
    }

    public /* synthetic */ class01202 method_25308(double d, double d2) {
        return this.getEntryAtPosition(d, d2);
    }

    public /* synthetic */ void method_44398(class01054 class010542, class01202 class012022, int n) {
        this.drawSelectionHighlight(class010542, (LanguageListWidget$Entry)class012022, n);
    }
}

