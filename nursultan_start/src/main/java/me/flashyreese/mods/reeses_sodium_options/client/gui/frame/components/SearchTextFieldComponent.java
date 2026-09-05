/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class07536
 *  minecraft.class08394
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.config.structure.OptionGroup
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.OptionExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen;
import me.flashyreese.mods.reeses_sodium_options.client.gui.SodiumVideoOptionsScreen$UiState;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchIndex;
import me.flashyreese.mods.reeses_sodium_options.client.search.SearchResult;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class07536;
import minecraft.class08394;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class SearchTextFieldComponent
extends AbstractWidget {
    private static final long CURSOR_ANIMATION_DURATION = 750L;
    protected final List<Page> pages;
    private final class01590 font;
    private final Predicate<String> textPredicate;
    private final BiFunction<String, Integer, class01028> renderTextProvider;
    private final SodiumVideoOptionsScreen$UiState uiState;
    private final int tabDimHeight;
    private final SodiumVideoOptionsScreen sodiumVideoOptionsScreen;
    protected boolean selecting;
    protected String text;
    protected int maxLength;
    protected boolean visible;
    protected boolean editable;
    private final SearchIndex<Option> searchIndex;
    private int firstCharacterIndex;
    private int selectionStart;
    private int selectionEnd;
    private int lastCursorPosition;
    private long nextCursorUpdate;
    private boolean currentCursorState;
    private float currentCursorAlpha;

    private void erase(int n) {
        if (class06202.Nq().s()) {
            this.eraseWords(n);
        } else {
            this.eraseCharacters(n);
        }
    }

    public SearchTextFieldComponent(Dim2i dim2i, List<Page> list, SodiumVideoOptionsScreen$UiState sodiumVideoOptionsScreen$UiState, int n2, SodiumVideoOptionsScreen sodiumVideoOptionsScreen) {
        super(dim2i);
        this.font = (class01590)class06202.Nq().i_3;
        this.textPredicate = Objects::nonNull;
        this.renderTextProvider = (string, n) -> class01028.a_((String)string, (class00405)class00405.N);
        this.text = "";
        this.maxLength = 100;
        this.visible = true;
        this.editable = true;
        this.lastCursorPosition = this.getCursor();
        this.pages = list;
        this.uiState = sodiumVideoOptionsScreen$UiState;
        this.tabDimHeight = n2;
        this.sodiumVideoOptionsScreen = sodiumVideoOptionsScreen;
        List list2 = this.pages.stream().flatMap(page -> page.groups().stream()).flatMap(optionGroup -> optionGroup.options().stream()).toList();
        this.searchIndex = SearchIndex.builder(option -> String.format("%s %s", option.getName().getString(), option.getTooltip().getString())).addAll(list2).foldDiacritics(true).maxResults(10).minScore(0.15).rerankWithEditDistance(true).rerankLimit(50).rerankWeight(0.1).build();
        if (!this.uiState.lastSearch().get().trim().isEmpty()) {
            this.write(this.uiState.lastSearch().get());
        }
    }

    public void write(String string) {
        String string2;
        String string3;
        int n;
        int n2 = Math.min(this.selectionStart, this.selectionEnd);
        int n3 = Math.max(this.selectionStart, this.selectionEnd);
        int n4 = this.maxLength - this.text.length() - (n2 - n3);
        if (n4 < (n = (string3 = class05018.M((String)string)).length())) {
            string3 = string3.substring(0, n4);
            n = n4;
        }
        if (this.textPredicate.test(string2 = new StringBuilder(this.text).replace(n2, n3, string3).toString())) {
            this.currentCursorState = true;
            this.nextCursorUpdate = System.currentTimeMillis() + 750L;
            this.text = string2;
            this.setSelectionStart(n2 + n);
            this.setSelectionEnd(this.selectionStart);
            this.onChanged(this.text);
        }
    }

    public int getCursor() {
        return this.selectionStart;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public boolean method_25404(class06601 class066012) {
        this.pages.forEach(page -> page.groups().stream().flatMap(optionGroup -> optionGroup.options().stream()).toList().stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).forEach(optionExtended -> optionExtended.setSelected(false)));
        if (!this.method_37303()) {
            return false;
        }
        this.selecting = class066012.W();
        if (class066012.s()) {
            this.setCursorToEnd();
            this.setSelectionEnd(0);
            return true;
        }
        if (class066012.T()) {
            ((class06197)class06202.Nq().L_3).N(this.getSelectedText());
            return true;
        }
        if (class066012.b()) {
            if (this.editable) {
                this.write(((class06197)class06202.Nq().L_3).N());
            }
            return true;
        }
        if (class066012.j()) {
            ((class06197)class06202.Nq().L_3).N(this.getSelectedText());
            if (this.editable) {
                this.write("");
            }
            return true;
        }
        switch (class066012.v()) {
            case 257: {
                if (this.editable) {
                    int n = 0;
                    for (Page page2 : this.pages) {
                        for (OptionGroup optionGroup : page2.groups()) {
                            for (Option option : optionGroup.options()) {
                                OptionExtended optionExtended;
                                if (!(option instanceof OptionExtended) || !(optionExtended = (OptionExtended)option).isHighlight() || optionExtended.getParentDimension() == null) continue;
                                if (n == this.uiState.lastSearchIndex().get()) {
                                    Dim2i dim2i = optionExtended.getDim2i();
                                    Dim2i dim2i2 = optionExtended.getParentDimension();
                                    int n2 = dim2i2.height() - this.tabDimHeight;
                                    int n3 = dim2i.y() - dim2i2.y();
                                    int n4 = n3 + dim2i.height() == dim2i2.height() ? dim2i2.height() : n3;
                                    int n5 = n4 * n2 / dim2i2.height();
                                    int n6 = this.pages.stream().mapToInt(page -> Math.toIntExact(page.groups().stream().flatMap(optionGroup -> optionGroup.options().stream()).toList().stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).filter(OptionExtended::isHighlight).count())).sum();
                                    int n7 = n6 == this.uiState.lastSearchIndex().get() + 1 ? 0 : this.uiState.lastSearchIndex().get() + 1;
                                    optionExtended.setSelected(true);
                                    this.uiState.lastSearchIndex().set(n7);
                                    this.uiState.tabFrameSelectedTab().set(page2.name());
                                    this.uiState.tabFrameScrollBarOffset().set(0);
                                    this.uiState.optionPageScrollBarOffset().set(n5);
                                    this.sodiumVideoOptionsScreen.rebuildUI();
                                    return true;
                                }
                                ++n;
                            }
                        }
                    }
                }
                return true;
            }
            case 259: {
                if (this.editable) {
                    this.selecting = false;
                    this.erase(-1);
                    this.selecting = class066012.W();
                }
                return true;
            }
            case 261: {
                if (this.editable) {
                    this.selecting = false;
                    this.erase(1);
                    this.selecting = class066012.W();
                }
                return true;
            }
            case 262: {
                if (class066012.m()) {
                    this.setCursor(this.getWordSkipPosition(1));
                } else {
                    this.moveCursor(1);
                }
                boolean bl = this.getCursor() != this.lastCursorPosition && this.getCursor() != this.text.length() + 1;
                this.lastCursorPosition = this.getCursor();
                return bl;
            }
            case 263: {
                if (class066012.m()) {
                    this.setCursor(this.getWordSkipPosition(-1));
                } else {
                    this.moveCursor(-1);
                }
                boolean bl = this.getCursor() != this.lastCursorPosition && this.getCursor() != 0;
                this.lastCursorPosition = this.getCursor();
                return bl;
            }
            case 268: {
                this.setCursorToStart();
                return true;
            }
            case 269: {
                this.setCursorToEnd();
                return true;
            }
        }
        return false;
    }

    public class02106 method_48205(class02089 class020892) {
        if (!this.visible) {
            return null;
        }
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3;
        if (!this.isVisible()) {
            return;
        }
        this.updateCursorAlpha();
        if (!this.method_25370() && this.text.isBlank()) {
            String string = "rso.search_bar_empty";
            class05216 class052162 = class00392.L((String)string);
            if (class052162.getString().equals(string)) {
                class052162 = class00392.y((String)"Search options...");
            }
            this.drawString(class010542, (class00392)class052162, this.getX() + 6, ((AbstractWidgetExtended)this).getDim().y() + 6, -5592406);
        }
        this.drawRect(class010542, this.getX(), ((AbstractWidgetExtended)this).getDim().y(), ((AbstractWidgetExtended)this).getDim().getLimitX(), ((AbstractWidgetExtended)this).getDim().getLimitY(), this.method_25370() ? -536870912 : -1879048192);
        int n4 = this.selectionStart - this.firstCharacterIndex;
        int n5 = this.selectionEnd - this.firstCharacterIndex;
        String string = this.font.N(this.text.substring(this.firstCharacterIndex), this.getInnerWidth());
        boolean bl = n4 >= 0 && n4 <= string.length();
        int n6 = this.getX() + 6;
        int n7 = this.getY() + 6;
        int n8 = n6;
        if (n5 > string.length()) {
            n5 = string.length();
        }
        if (!string.isEmpty()) {
            String string2 = bl ? string.substring(0, n4) : string;
            class010542.y(this.font, this.renderTextProvider.apply(string2, this.firstCharacterIndex), n8, n7, -1);
            n8 += this.font.N(this.renderTextProvider.apply(string2, this.firstCharacterIndex));
        }
        boolean bl2 = this.selectionStart < this.text.length() || this.text.length() >= this.getMaxLength();
        int n9 = n8;
        if (!bl) {
            n9 = n4 > 0 ? n6 + this.getWidth() - 12 : n6;
        } else if (bl2) {
            --n9;
            --n8;
        }
        if (!string.isEmpty() && bl && n4 < string.length()) {
            class010542.y(this.font, this.renderTextProvider.apply(string.substring(n4), this.selectionStart), n8, n7, -1);
        }
        if (this.method_25370()) {
            n3 = (int)(this.currentCursorAlpha * 255.0f) << 24 | 0xD0D0D0;
            Objects.requireNonNull(this.font);
            class010542.N(class08394.NH, n9, n7 - 1, n9 + 1, n7 + 1 + 9, n3);
        }
        if (n5 != n4) {
            n3 = n6 + this.font.y(string.substring(0, n5));
            Objects.requireNonNull(this.font);
            this.drawSelectionHighlight(class010542, n9, n7 - 1, n3 - 1, n7 + 1 + 9);
        }
    }

    public boolean method_37303() {
        return this.isVisible() && this.method_25370() && this.isEditable();
    }

    public boolean method_25400(class06626 class066262) {
        if (!this.method_37303()) {
            return false;
        }
        if (class066262.y()) {
            if (this.editable) {
                this.uiState.lastSearch().set(this.text.trim());
                this.write(class066262.N());
                this.uiState.lastSearchIndex().set(0);
            }
            return true;
        }
        return false;
    }

    public void method_25365(boolean bl) {
        this.focused = bl;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        int n = class04995.N((double)class066132.n()) - this.getX() - 6;
        String string = this.font.N(this.text.substring(this.firstCharacterIndex), this.getInnerWidth());
        this.setCursor(this.font.N(string, n).length() + this.firstCharacterIndex);
        this.method_25365(this.method_25405(class066132.n(), class066132.t()));
        this.pages.forEach(page -> page.groups().stream().flatMap(optionGroup -> optionGroup.options().stream()).toList().stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).forEach(optionExtended -> optionExtended.setSelected(false)));
        return this.method_25370();
    }

    public boolean isEditable() {
        return this.editable;
    }

    public void setCursor(int n) {
        this.setSelectionStart(n);
        if (!this.selecting) {
            this.setSelectionEnd(this.selectionStart);
        }
        this.onChanged(this.text);
    }

    private int getMaxLength() {
        return this.maxLength;
    }

    private void onChanged(String string) {
        this.pages.forEach(page -> page.groups().stream().flatMap(optionGroup -> optionGroup.options().stream()).toList().stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).forEach(optionExtended -> optionExtended.setHighlight(false)));
        this.uiState.lastSearch().set(string.trim());
        List list = List.of();
        if (this.editable && !string.trim().isEmpty()) {
            List list2 = this.searchIndex.newSession(string).results().stream().map(SearchResult::item).toList();
            list2.stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).forEach(optionExtended -> optionExtended.setHighlight(true));
            list = list2.stream().filter(OptionExtended.class::isInstance).map(OptionExtended.class::cast).map(OptionExtended::getId).toList();
        }
        if (this.uiState.updateSearchResults(list)) {
            this.sodiumVideoOptionsScreen.rebuildUI();
        }
    }

    public void moveCursor(int n) {
        this.setCursor(this.getCursorPosWithOffset(n));
    }

    public void eraseWords(int n) {
        if (!this.text.isEmpty()) {
            if (this.selectionEnd != this.selectionStart) {
                this.write("");
            } else {
                this.eraseCharacters(this.getWordSkipPosition(n) - this.selectionStart);
            }
        }
    }

    public int getInnerWidth() {
        return this.getWidth() - 12;
    }

    public void setSelectionStart(int n) {
        this.selectionStart = class04995.N((int)n, (int)0, (int)this.text.length());
    }

    public void eraseCharacters(int n) {
        if (!this.text.isEmpty()) {
            if (this.selectionEnd != this.selectionStart) {
                this.write("");
            } else {
                String string;
                int n2;
                int n3 = this.getCursorPosWithOffset(n);
                int n4 = Math.min(n3, this.selectionStart);
                if (n4 != (n2 = Math.max(n3, this.selectionStart)) && this.textPredicate.test(string = new StringBuilder(this.text).delete(n4, n2).toString())) {
                    this.text = string;
                    this.setCursor(n4);
                    this.onChanged(this.text);
                }
            }
        }
    }

    public void setSelectionEnd(int n) {
        int n2 = this.text.length();
        this.selectionEnd = class04995.N((int)n, (int)0, (int)n2);
        if (this.firstCharacterIndex > n2) {
            this.firstCharacterIndex = n2;
        }
        int n3 = this.getInnerWidth();
        String string = this.font.N(this.text.substring(this.firstCharacterIndex), n3);
        int n4 = string.length() + this.firstCharacterIndex;
        if (this.selectionEnd == this.firstCharacterIndex) {
            this.firstCharacterIndex -= this.font.N(this.text, n3, true).length();
        }
        if (this.selectionEnd > n4) {
            this.firstCharacterIndex += this.selectionEnd - n4;
        } else if (this.selectionEnd <= this.firstCharacterIndex) {
            this.firstCharacterIndex -= this.firstCharacterIndex - this.selectionEnd;
        }
        this.firstCharacterIndex = class04995.N((int)this.firstCharacterIndex, (int)0, (int)n2);
    }

    private void updateCursorAlpha() {
        float f;
        long l = System.currentTimeMillis();
        if (l >= this.nextCursorUpdate) {
            this.currentCursorState = !this.currentCursorState;
            this.nextCursorUpdate = l + 750L;
        }
        f = (f = (float)(this.nextCursorUpdate - l) / 750.0f) <= 0.25f ? (f *= 4.0f) : (f >= 0.75f ? (1.0f - f) * 4.0f : 1.0f);
        f = Math.clamp((float)f, (float)0.0f, (float)1.0f);
        this.currentCursorAlpha = this.currentCursorState ? 1.0f : 1.0f - f;
    }

    public void setCursorToStart() {
        this.setCursor(0);
    }

    public String getSelectedText() {
        int n = Math.min(this.selectionStart, this.selectionEnd);
        int n2 = Math.max(this.selectionStart, this.selectionEnd);
        return this.text.substring(n, n2);
    }

    public void setCursorToEnd() {
        this.setCursor(this.text.length());
    }

    private void drawSelectionHighlight(class01054 class010542, int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if (n3 > this.getX() + this.getWidth()) {
            n3 = this.getX() + this.getWidth();
        }
        if (n > this.getX() + this.getWidth()) {
            n = this.getX() + this.getWidth();
        }
        class010542.N(class08394.NX, n, n2, n3, n4, -16776961);
    }

    public int getWordSkipPosition(int n) {
        return this.getWordSkipPosition(n, this.getCursor());
    }

    private int getWordSkipPosition(int n, int n2) {
        return this.getWordSkipPosition(n, n2, true);
    }

    private int getWordSkipPosition(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (!bl2) {
                int n5 = this.text.length();
                if ((n3 = this.text.indexOf(32, n3)) == -1) {
                    n3 = n5;
                    continue;
                }
                while (bl && n3 < n5 && this.text.charAt(n3) == ' ') {
                    ++n3;
                }
                continue;
            }
            while (bl && n3 > 0 && this.text.charAt(n3 - 1) == ' ') {
                --n3;
            }
            while (n3 > 0 && this.text.charAt(n3 - 1) != ' ') {
                --n3;
            }
        }
        return n3;
    }

    private int getCursorPosWithOffset(int n) {
        return class07536.N((String)this.text, (int)this.selectionStart, (int)n);
    }
}

