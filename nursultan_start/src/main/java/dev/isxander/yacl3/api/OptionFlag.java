/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.RequireRestartScreen
 *  minecraft.class03063
 *  minecraft.class05096
 *  minecraft.class06202
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.gui.RequireRestartScreen;
import java.util.function.Consumer;
import minecraft.class03063;
import minecraft.class05096;
import minecraft.class06202;

@FunctionalInterface
public interface OptionFlag
extends Consumer<class06202> {
    public static final OptionFlag GAME_RESTART = class062022 -> class062022.N((class05096)new RequireRestartScreen((class05096)class062022.v_3));
    public static final OptionFlag RELOAD_CHUNKS = class062022 -> ((class03063)class062022.B_2).u();
    public static final OptionFlag WORLD_RENDER_UPDATE = class062022 -> ((class03063)class062022.B_2).W();
    public static final OptionFlag ASSET_RELOAD = class06202::Nw;
}

