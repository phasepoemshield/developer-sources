/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadResourceBudget;

public class UnlimitedResourceBudget
implements UploadResourceBudget {
    public static final UnlimitedResourceBudget INSTANCE = new UnlimitedResourceBudget();

    @Override
    public void consume(long l, long l2) {
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}

