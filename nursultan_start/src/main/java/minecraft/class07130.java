/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.tree.CommandNode
 *  minecraft.class01906
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class07671
 *  minecraft.class07686
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.CommandNode;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import minecraft.class01906;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class07671;
import minecraft.class07686;

public class class07130
implements class07135 {
    private final class01996 N;
    private final CompletableFuture<class01929> i;

    public class07130(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.N = class019962;
        this.i = completableFuture;
    }

    @Override
    public String method_10321() {
        return "Command Syntax";
    }

    @Override
    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.N.method_45972(class02024.field_39369).resolve("commands.json");
        return this.i.thenCompose(class019292 -> {
            CommandDispatcher var3 = new class07686(class07671.field_25419, class07686.N((class01929)class019292)).N();
            return class07135.N(class044762, (JsonElement)class01906.N((CommandDispatcher)var3, (CommandNode)var3.getRoot()), path);
        });
    }
}

