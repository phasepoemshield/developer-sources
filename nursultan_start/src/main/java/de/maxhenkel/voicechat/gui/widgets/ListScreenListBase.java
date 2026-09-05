/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06318
 *  org.jspecify.annotations.Nullable
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.gui.widgets.ListScreenEntryBase;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06318;
import org.jspecify.annotations.Nullable;

public abstract class ListScreenListBase<T extends ListScreenEntryBase<T>>
extends class06318<T> {
    public ListScreenListBase(int n, int n2, int n3, int n4) {
        super(class06202.Nq(), n, n2, n3, n4);
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public void updateSize(int n, int n2, int n3, int n4) {
        this.method_55444(n, n2, n3, n4);
        this.method_65506();
    }

    public void method_57715(class01054 class010542) {
    }

    public void method_57713(class01054 class010542) {
    }
}

