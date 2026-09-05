/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public class RecipeRewriter1_19_3<C extends ClientboundPacketType>
extends RecipeRewriter<C> {
    public RecipeRewriter1_19_3(Protocol<C, ?, ?, ?> protocol) {
        super(protocol);
        this.recipeHandlers.put("crafting_special_armordye", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_bookcloning", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_mapcloning", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_mapextending", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_firework_rocket", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_firework_star", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_firework_star_fade", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_tippedarrow", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_bannerduplicate", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_shielddecoration", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_shulkerboxcoloring", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_suspiciousstew", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
        this.recipeHandlers.put("crafting_special_repairitem", arg_0 -> ((RecipeRewriter1_19_3)this).handleSimpleRecipe(arg_0));
    }

    public void handleCraftingShaped(PacketWrapper wrapper) {
        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < ingredients; ++i) {
            this.handleIngredient(wrapper);
        }
        this.handleResult(wrapper);
    }

    public void handleCraftingShapeless(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.VAR_INT);
        this.handleIngredients(wrapper);
        this.handleResult(wrapper);
    }

    public void handleSmelting(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.VAR_INT);
        this.handleIngredient(wrapper);
        this.handleResult(wrapper);
        wrapper.passthrough((Type)Types.FLOAT);
        wrapper.passthrough((Type)Types.VAR_INT);
    }
}

