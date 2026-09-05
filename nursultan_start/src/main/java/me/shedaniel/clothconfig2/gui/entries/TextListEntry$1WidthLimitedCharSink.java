/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class05197
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.TextListEntry;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class05197;
import minecraft.class06202;

class TextListEntry$1WidthLimitedCharSink
implements class05197 {
    private float maxWidth;
    private int position;

    public TextListEntry$1WidthLimitedCharSink(TextListEntry textListEntry, float f) {
        this.maxWidth = f;
    }

    public boolean accept(int n, class00405 class004052, int n2) {
        this.maxWidth -= ((class01590)class06202.Nq().i_3).y().N(class01028.N((int)n2, (class00405)class004052));
        if (this.maxWidth >= 0.0f) {
            this.position = n + Character.charCount(n2);
            return true;
        }
        return false;
    }

    public int getPosition() {
        return this.position;
    }

    public void resetPosition() {
        this.position = 0;
    }
}

