/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class06478
 */
package page.langeweile.ok_zoomer.config.screen.components;

import java.util.List;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class06478;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList$Entry;

class OkZoomerSelectionList$ButtonEntry
extends OkZoomerSelectionList$Entry {
    private final class06478 leftButton;
    private final class06478 rightButton;
    private final List<class06478> buttons;

    public OkZoomerSelectionList$ButtonEntry(class06478 class064782, class05096 class050962) {
        super(class050962);
        class064782.method_25358(310);
        this.leftButton = class064782;
        this.rightButton = null;
        this.buttons = List.of(class064782);
    }

    public OkZoomerSelectionList$ButtonEntry(class06478 class064782, class06478 class064783, class05096 class050962) {
        super(class050962);
        this.leftButton = class064782;
        this.rightButton = class064783;
        this.buttons = class064783 != null ? List.of(class064782, class064783) : List.of(class064782);
    }

    public List<? extends class04654> method_25396() {
        return this.buttons;
    }

    public int method_25364() {
        return (this.rightButton != null ? Math.max(this.leftButton.method_25364(), this.rightButton.method_25364()) : this.leftButton.method_25364()) + 4;
    }

    public List<? extends class03434> method_37025() {
        return this.buttons;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.screen.field_22789 / 2 - 155;
        int n4 = this.method_73382();
        this.leftButton.y(n3, n4 + 2);
        this.leftButton.method_25394(class010542, n, n2, f);
        if (this.rightButton != null) {
            this.rightButton.y(n3 + 160, n4 + 2);
            this.rightButton.method_25394(class010542, n, n2, f);
        }
    }
}

