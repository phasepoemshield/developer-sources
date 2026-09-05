/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01202
 *  minecraft.class04654
 *  minecraft.class05729
 *  minecraft.class06202
 *  minecraft.class06318
 *  org.jspecify.annotations.Nullable
 */
package net.irisshaders.iris.gui.element;

import minecraft.class01202;
import minecraft.class04654;
import minecraft.class05729;
import minecraft.class06202;
import minecraft.class06318;
import org.jspecify.annotations.Nullable;

public class IrisContainerObjectSelectionList<E extends class05729<E>>
extends class06318<E> {
    public void select(int n) {
        this.method_25313((class01202)((class05729)this.method_25396().get(n)));
    }

    public IrisContainerObjectSelectionList(class06202 class062022, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(class062022, n, n2, n3, n7);
    }

    public /* synthetic */ @Nullable class04654 method_25399() {
        return super.method_25336();
    }

    public int method_65507() {
        return this.field_22758 - 6;
    }
}

