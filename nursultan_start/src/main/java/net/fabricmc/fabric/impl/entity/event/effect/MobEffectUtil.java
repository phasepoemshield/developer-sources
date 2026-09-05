/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.entity.event.v1.effect.EffectEventContext
 */
package net.fabricmc.fabric.impl.entity.event.effect;

import java.util.Stack;
import net.fabricmc.fabric.api.entity.event.v1.effect.EffectEventContext;
import net.fabricmc.fabric.impl.entity.event.effect.EffectEventContextImpl;

public final class MobEffectUtil {
    private static final ThreadLocal<Stack<EffectEventContext>> CURRENT_COMMAND_CONTEXT = ThreadLocal.withInitial(() -> {
        Stack<EffectEventContext> stack = new Stack<EffectEventContext>();
        stack.push(EffectEventContextImpl.DEFAULT);
        return stack;
    });

    private MobEffectUtil() {
    }

    public static void popContext() {
        CURRENT_COMMAND_CONTEXT.get().pop();
    }

    public static void pushContext(EffectEventContext effectEventContext) {
        CURRENT_COMMAND_CONTEXT.get().push(effectEventContext);
    }

    public static EffectEventContext getCommandContext() {
        return (EffectEventContext)CURRENT_COMMAND_CONTEXT.get().getLast();
    }
}

