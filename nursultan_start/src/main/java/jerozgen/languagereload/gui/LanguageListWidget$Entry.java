/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05699
 */
package jerozgen.languagereload.gui;

import jerozgen.languagereload.gui.LanguageListWidget;
import minecraft.class05699;

public abstract class LanguageListWidget$Entry
extends class05699<LanguageListWidget$Entry> {
    protected LanguageListWidget parentList;

    public void setParent(LanguageListWidget languageListWidget) {
        this.parentList = languageListWidget;
    }

    public LanguageListWidget getParent() {
        return this.parentList;
    }

    public abstract String getCode();
}

