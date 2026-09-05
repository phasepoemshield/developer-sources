/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02112
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08430
 *  org.joml.Vector2i
 */
package jerozgen.languagereload.gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jerozgen.languagereload.access.ILanguageOptionsScreen;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.gui.LanguageEntry$ButtonRenderer;
import jerozgen.languagereload.gui.LanguageEntryButtonWidget;
import jerozgen.languagereload.gui.LanguageListWidget$Entry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02112;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08430;
import org.joml.Vector2i;

public class LanguageEntry
extends LanguageListWidget$Entry {
    private static final class00392 DEFAULT_LANGUAGE_TOOLTIP = class00392.L((String)"language.default.tooltip");
    private static final class01883 ADD_TEXTURES = new class01883(class01894.N((String)"languagereload", (String)"language_selection/add"), class01894.N((String)"languagereload", (String)"language_selection/add_highlighted"));
    private static final class01883 REMOVE_TEXTURES = new class01883(class01894.N((String)"languagereload", (String)"language_selection/remove"), class01894.N((String)"languagereload", (String)"language_selection/remove_highlighted"));
    private static final class01883 MOVE_UP_TEXTURES = new class01883(class01894.N((String)"languagereload", (String)"language_selection/move_up"), class01894.N((String)"languagereload", (String)"language_selection/move_up_highlighted"));
    private static final class01883 MOVE_DOWN_TEXTURES = new class01883(class01894.N((String)"languagereload", (String)"language_selection/move_down"), class01894.N((String)"languagereload", (String)"language_selection/move_down_highlighted"));
    private final class06202 client = class06202.Nq();
    private final String code;
    private final class08430 language;
    private final LinkedList<String> selectedLanguages;
    private final Runnable refreshListsAction;
    private final List<class06478> buttons = new ArrayList<class06478>();
    private final class05362 addButton = this.addButton(15, 24, ADD_TEXTURES, class053622 -> this.toggle());
    private final class05362 removeButton = this.addButton(15, 24, REMOVE_TEXTURES, class053622 -> this.toggle());
    private final class05362 moveUpButton = this.addButton(11, 11, MOVE_UP_TEXTURES, class053622 -> this.moveUp());
    private final class05362 moveDownButton = this.addButton(11, 11, MOVE_DOWN_TEXTURES, class053622 -> this.moveDown());

    private boolean isSelected() {
        return this.selectedLanguages.contains(this.code);
    }

    public LanguageEntry(Runnable runnable, String string, class08430 class084302, LinkedList<String> linkedList) {
        this.code = string;
        this.language = class084302;
        this.selectedLanguages = linkedList;
        this.refreshListsAction = runnable;
    }

    private boolean isDefault() {
        return this.code.equals("en_us");
    }

    public class08430 getLanguage() {
        return this.language;
    }

    protected class05362 addButton(int n, int n2, class01883 class018832, class05361 class053612) {
        LanguageEntryButtonWidget languageEntryButtonWidget = new LanguageEntryButtonWidget(n, n2, class018832, class053612);
        languageEntryButtonWidget.field_22764 = false;
        this.buttons.add((class06478)languageEntryButtonWidget);
        return languageEntryButtonWidget;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.u() && (!this.isDefault() || Config.getInstance().removableDefaultLanguage)) {
            this.toggle();
            return true;
        }
        if (class066012.W()) {
            if (class066012.B()) {
                this.moveUp();
                return true;
            }
            if (class066012.Z()) {
                this.moveDown();
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        for (class06478 class064782 : this.buttons) {
            if (!class064782.method_25402(class066132, bl)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    private boolean isFirst() {
        return this.code.equals(this.selectedLanguages.peekFirst());
    }

    private boolean isLast() {
        return this.code.equals(this.selectedLanguages.peekLast());
    }

    public void toggle() {
        if (this.method_25370()) {
            this.parentList.method_25395(null);
        }
        if (this.isSelected()) {
            this.selectedLanguages.remove(this.code);
        } else {
            this.selectedLanguages.addFirst(this.code);
        }
        this.refreshListsAction.run();
        ((ILanguageOptionsScreen)this.parentList.getScreen()).languagereload_focusEntry(this);
    }

    private void renderDefaultLanguageTooltip(class01054 class010542, int n, int n2) {
        List list = ((class01590)this.client.i_3).L((class05936)DEFAULT_LANGUAGE_TOOLTIP, this.parentList.method_25322() - 6);
        class02112 class021122 = (n3, n4, n5, n6, n7, n8) -> {
            Vector2i vector2i = new Vector2i(n + 3 + (this.parentList.method_25322() - n7 - 6) / 2, n2 + this.parentList.getRowHeight() + 4);
            if (vector2i.y > this.parentList.method_55443() + 2 || vector2i.y + n8 + 5 > n4) {
                vector2i.y = n2 - n8 - 6;
            }
            return vector2i;
        };
        class010542.N((class01590)this.client.i_3, list, class021122, 0, 0, true);
    }

    private void renderButtons(LanguageEntry$ButtonRenderer languageEntry$ButtonRenderer, int n, int n2) {
        if (this.isSelected()) {
            if (!this.isDefault() || Config.getInstance().removableDefaultLanguage) {
                languageEntry$ButtonRenderer.render(this.removeButton, n, n2);
            }
            if (!this.isFirst()) {
                languageEntry$ButtonRenderer.render(this.moveUpButton, n + this.removeButton.method_25368() + 1, n2);
            }
            if (!this.isLast()) {
                languageEntry$ButtonRenderer.render(this.moveDownButton, n + this.removeButton.method_25368() + 1, n2 + this.moveUpButton.method_25364() + 2);
            }
        } else {
            languageEntry$ButtonRenderer.render(this.addButton, n + 7, n2);
        }
    }

    public void moveUp() {
        if (!this.isSelected()) {
            return;
        }
        if (this.isFirst()) {
            return;
        }
        int n = this.selectedLanguages.indexOf(this.code);
        this.selectedLanguages.add(n - 1, this.selectedLanguages.remove(n));
        this.refreshListsAction.run();
    }

    public void moveDown() {
        if (!this.isSelected()) {
            return;
        }
        if (this.isLast()) {
            return;
        }
        int n = this.selectedLanguages.indexOf(this.code);
        this.selectedLanguages.add(n + 1, this.selectedLanguages.remove(n));
        this.refreshListsAction.run();
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n5 = this.method_46426();
        int n6 = this.method_46427();
        if (bl || this.method_25370() || ((Boolean)((class05630)this.client.i_7).Nm().method_41753()).booleanValue()) {
            int n7 = n5 + 1;
            int n8 = n6 + 1;
            int n9 = this.parentList.getHoveredSelectionRight() - 1;
            int n10 = n6 + this.method_25364() - 1;
            class010542.N(n7, n8, n9, n10, bl || this.method_25370() ? -1601138544 : 0x50909090);
            this.buttons.forEach(class064782 -> {
                class064782.field_22764 = false;
            });
            this.renderButtons((class053622, n3, n4) -> {
                class053622.method_46421(n3);
                class053622.method_46419(n4);
                class053622.field_22764 = true;
                class053622.method_25394(class010542, n, n2, f);
            }, n5, n6);
            if ((bl || this.method_25370()) && this.isDefault()) {
                this.renderDefaultLanguageTooltip(class010542, n5, n6);
            }
        }
        class010542.y((class01590)this.client.i_3, this.language.L(), n5 + 29, n6 + 3, -1);
        class010542.y((class01590)this.client.i_3, this.language.y(), n5 + 29, n6 + 14, -8355712);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.language.N()});
    }
}

