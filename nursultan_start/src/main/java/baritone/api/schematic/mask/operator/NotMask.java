/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic.mask.operator;

import baritone.api.schematic.mask.AbstractMask;
import baritone.api.schematic.mask.Mask;
import minecraft.class00500;

public final class NotMask
extends AbstractMask {
    private final Mask source;

    public NotMask(Mask mask) {
        super(mask.widthX(), mask.heightY(), mask.lengthZ());
        this.source = mask;
    }

    @Override
    public boolean partOfMask(int n, int n2, int n3, class00500 class005002) {
        return !this.source.partOfMask(n, n2, n3, class005002);
    }
}

