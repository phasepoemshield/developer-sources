/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00487
 *  minecraft.class04348
 *  minecraft.class07263
 */
package Nursultan;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00487;
import minecraft.class04348;
import minecraft.class07263;

public class class09369<S> {
    private final class04348 N;
    private final class07263<S> y;
    private final List<class00487> L;
    private final List<CommandNode<S>> u;

    public class09369(class04348 class043482, class07263<S> class072632, List<class00487> list) {
        this.N = class043482;
        this.y = class072632;
        this.L = list;
        ObjectArrayList objectArrayList = new ObjectArrayList();
        objectArrayList.size(list.size());
        this.u = objectArrayList;
    }

    public CommandNode<S> N(int n) {
        RootCommandNode rootCommandNode;
        CommandNode<S> commandNode = this.u.get(n);
        if (commandNode != null) {
            return commandNode;
        }
        class00487 class004872 = this.L.get(n);
        if (class004872.N() == null) {
            rootCommandNode = new RootCommandNode();
        } else {
            ArgumentBuilder object = class004872.N().N(this.N, this.y);
            if ((class004872.y() & 8) != 0) {
                object.redirect(this.N(class004872.L()));
            }
            int n2 = (class004872.y() & 4) != 0 ? 1 : 0;
            int n3 = (class004872.y() & 0x20) != 0 ? 1 : 0;
            rootCommandNode = this.y.N(object, n2 != 0, n3 != 0).build();
        }
        this.u.set(n, (CommandNode<S>)rootCommandNode);
        for (int n4 : class004872.u()) {
            CommandNode<S> commandNode2 = this.N(n4);
            if (commandNode2 instanceof RootCommandNode) continue;
            rootCommandNode.addChild(commandNode2);
        }
        return rootCommandNode;
    }
}

