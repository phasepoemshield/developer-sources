/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 */
package com.viaversion.viafabricplus.features.interaction.replace_block_placement_logic;

import minecraft.class07082;

public final class ActionResultException1_12_2
extends RuntimeException {
    private final class07082 actionResult;

    public ActionResultException1_12_2(class07082 class070822) {
        this.actionResult = class070822;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public class07082 getActionResult() {
        return this.actionResult;
    }
}

