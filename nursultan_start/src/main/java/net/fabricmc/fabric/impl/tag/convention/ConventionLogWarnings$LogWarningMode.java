/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.tag.convention;

enum ConventionLogWarnings$LogWarningMode {
    SILENCED,
    SHORT,
    VERBOSE,
    FAIL;


    boolean isVerbose() {
        return this == VERBOSE || this == FAIL;
    }
}

