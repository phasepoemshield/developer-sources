/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09516
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03099
 *  net.fabricmc.fabric.api.entity.event.v1.effect.EffectEventContext
 *  net.fabricmc.fabric.impl.entity.event.effect.EffectEventContextImpl
 *  net.fabricmc.fabric.impl.entity.event.effect.MobEffectUtil
 *  net.fabricmc.fabric.mixin.entity.event.effect.BuildContextsAccessor
 */
package minecraft;

import Nursultan.class09516;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;
import net.fabricmc.fabric.api.entity.event.v1.effect.EffectEventContext;
import net.fabricmc.fabric.impl.entity.event.effect.EffectEventContextImpl;
import net.fabricmc.fabric.impl.entity.event.effect.MobEffectUtil;
import net.fabricmc.fabric.mixin.entity.event.effect.BuildContextsAccessor;

public final class class01714<T>
extends Record {
    private final class03099 frame;
    private final class01742<T> action;

    public class01714(class03099 class030992, class01742<T> class017422) {
        this.frame = class030992;
        this.action = class017422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01714.class, "frame;action", "frame", "action"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01714.class, "frame;action", "frame", "action"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01714.class, "frame;action", "frame", "action"}, this);
    }

    private void y(class01752 class017522) {
        this.action.execute(class017522, this.frame);
    }

    public class01742<T> y() {
        return this.action;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class01752 class017522, Operation operation) {
        LiteralCommandNode literalCommandNode = this.action;
        if (!(literalCommandNode instanceof class09516)) {
            operation.call(new Object[]{class017522});
            return;
        }
        class09516 class095162 = (class09516)literalCommandNode;
        CommandNode commandNode = ((ParsedCommandNode)((BuildContextsAccessor)class095162).getCommand().getTopContext().getNodes().getFirst()).getNode();
        if (!(commandNode instanceof LiteralCommandNode)) {
            operation.call(new Object[]{class017522});
            return;
        }
        literalCommandNode = (LiteralCommandNode)commandNode;
        try {
            MobEffectUtil.pushContext((EffectEventContext)new EffectEventContextImpl(true, literalCommandNode.getName()));
            operation.call(new Object[]{class017522});
        }
        finally {
            MobEffectUtil.popContext();
        }
    }

    public class03099 N() {
        return this.frame;
    }

    public void N(class01752<T> class017522) {
        this.N(class017522, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_8854]");
            this.y((class01752)objectArray[0]);
            return null;
        });
    }
}

