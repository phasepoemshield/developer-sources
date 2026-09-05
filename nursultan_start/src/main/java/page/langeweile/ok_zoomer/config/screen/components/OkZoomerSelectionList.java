/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package page.langeweile.ok_zoomer.config.screen.components;

import minecraft.class00392;
import minecraft.class01202;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList$ButtonEntry;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList$CategoryEntry;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList$Entry;

public class OkZoomerSelectionList
extends class06318<OkZoomerSelectionList$Entry> {
    private final class05096 screen;

    public OkZoomerSelectionList(class06202 class062022, int n, int n2, int n3, class05096 class050962) {
        super(class062022, n, n2, n3, 25);
        this.screen = class050962;
    }

    public void addButton(class06478 class064782, class06478 class064783) {
        this.method_25321((class01202)new OkZoomerSelectionList$ButtonEntry(class064782, class064783, this.screen));
    }

    public void addButton(class06478 class064782) {
        this.method_25321((class01202)new OkZoomerSelectionList$ButtonEntry(class064782, this.screen));
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public void addCategory(class00392 class003922) {
        int n = 9;
        int n2 = this.method_25396().isEmpty() ? 0 : n * 2;
        this.method_73370((class01202)new OkZoomerSelectionList$CategoryEntry(class003922, this.screen, n2), n2 + n + 4);
    }

    public int method_25322() {
        return 310;
    }
}

