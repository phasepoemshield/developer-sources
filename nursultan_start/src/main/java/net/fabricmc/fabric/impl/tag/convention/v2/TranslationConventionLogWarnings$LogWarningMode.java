/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.tag.convention.v2;

enum TranslationConventionLogWarnings$LogWarningMode {
    SILENCED,
    SHORT,
    VERBOSE,
    FAIL;


    boolean verbose() {
        return this == VERBOSE || this == FAIL;
    }
}

