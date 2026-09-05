/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04664
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04664;

public abstract class BaseListCell
extends class04664
implements class03434 {
    private Supplier<Optional<class00392>> errorSupplier;

    public abstract void render(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10);

    public void onDelete() {
    }

    public void onAdd() {
    }

    public abstract Optional<class00392> getError();

    public boolean isEdited() {
        return this.getConfigError().isPresent();
    }

    public final Optional<class00392> getConfigError() {
        if (this.errorSupplier != null && this.errorSupplier.get().isPresent()) {
            return this.errorSupplier.get();
        }
        return this.getError();
    }

    public void setErrorSupplier(Supplier<Optional<class00392>> supplier) {
        this.errorSupplier = supplier;
    }

    public boolean isRequiresRestart() {
        return false;
    }

    public void updateSelected(boolean bl) {
    }

    public void updateBounds(boolean bl, int n, int n2, int n3, int n4) {
    }

    public abstract int getCellHeight();

    public final int getPreferredTextColor() {
        return this.getConfigError().isPresent() ? -43691 : -2039584;
    }
}

