/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00400
 *  minecraft.class00404
 *  minecraft.class00891
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.object.builder;

import java.util.Set;
import minecraft.class00394;
import minecraft.class00400;
import minecraft.class00404;
import minecraft.class00891;
import org.jspecify.annotations.Nullable;

public class ExtendedBlockEntityType<T extends class00394>
extends class00404<T> {
    private final @Nullable Boolean canPotentiallyExecuteCommands;

    public ExtendedBlockEntityType(class00400<? extends T> class004002, Set<class00891> set, @Nullable Boolean bl) {
        super(class004002, set);
        this.canPotentiallyExecuteCommands = bl;
    }

    public boolean method_65166() {
        if (this.canPotentiallyExecuteCommands != null) {
            return this.canPotentiallyExecuteCommands;
        }
        return super.method_65166();
    }
}

