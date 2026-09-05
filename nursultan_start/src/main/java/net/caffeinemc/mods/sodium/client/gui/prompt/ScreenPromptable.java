/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.prompt;

import net.caffeinemc.mods.sodium.client.gui.Dimensioned;
import net.caffeinemc.mods.sodium.client.gui.prompt.ScreenPrompt;
import org.jspecify.annotations.Nullable;

public interface ScreenPromptable
extends Dimensioned {
    public @Nullable ScreenPrompt getPrompt();

    public void setPrompt(@Nullable ScreenPrompt var1);
}

