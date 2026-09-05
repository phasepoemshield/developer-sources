/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.context.ContextChain$Stage
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00392
 *  minecraft.class03099
 *  minecraft.class03102
 *  minecraft.class03126
 *  minecraft.class03144
 *  net.fabricmc.fabric.mixin.entity.event.effect.BuildContextsAccessor
 */
package minecraft;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01714;
import minecraft.class01717;
import minecraft.class01722;
import minecraft.class01727;
import minecraft.class01729;
import minecraft.class01744;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03102;
import minecraft.class03126;
import minecraft.class03144;
import net.fabricmc.fabric.mixin.entity.event.effect.BuildContextsAccessor;

public class class01736<T extends class01711<T>>
implements BuildContextsAccessor {
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"command.forkLimit", (Object[])new Object[]{object}));
    private final String y;
    private final ContextChain<T> L;

    public class01736(String string, ContextChain<T> contextChain) {
        this.y = string;
        this.L = contextChain;
    }

    public String toString() {
        return this.y;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void N(T t, List<T> list, class01752<T> class017522, class03099 class030993, class03126 class031262) {
        class01717<class01711> class017172;
        Command command;
        ContextChain contextChain = this.L;
        class03126 class031263 = class031262;
        List<Object> list2 = list;
        if (contextChain.getStage() != ContextChain.Stage.EXECUTE) {
            class017522.L().N(() -> "prepare " + this.y);
            try {
                int n2 = class017522.u();
                while (contextChain.getStage() != ContextChain.Stage.EXECUTE) {
                    command = contextChain.getTopContext();
                    if (command.isForked()) {
                        class031263 = class031263.y();
                    }
                    if ((class017172 = command.getRedirectModifier()) instanceof class01727) {
                        class01727 class017272 = (class01727)((Object)class017172);
                        class017272.N(t, list2, contextChain, class031263, class01744.N(class017522, class030993));
                        return;
                    }
                    if (class017172 != null) {
                        class017522.i();
                        boolean bl2 = class031263.N();
                        ObjectArrayList objectArrayList = new ObjectArrayList();
                        for (class01711 class017113 : list2) {
                            Collection collection;
                            block21: {
                                try {
                                    collection = ContextChain.runModifier((CommandContext)command, (Object)class017113, (commandContext, bl, n) -> {}, (boolean)bl2);
                                    if (objectArrayList.size() + collection.size() < n2) break block21;
                                    t.N(N.create((Object)n2), bl2, class017522.y());
                                    return;
                                }
                                catch (CommandSyntaxException commandSyntaxException) {
                                    class017113.N(commandSyntaxException, bl2, class017522.y());
                                    if (bl2) continue;
                                    class017522.L().L();
                                    return;
                                }
                            }
                            objectArrayList.addAll(collection);
                        }
                        list2 = objectArrayList;
                    }
                    contextChain = contextChain.nextStage();
                }
            }
            finally {
                class017522.L().L();
            }
        }
        if (list2.isEmpty()) {
            if (class031263.L()) {
                class017522.N(new class01714(class030993, class03144.N()));
            }
            return;
        }
        CommandContext commandContext2 = contextChain.getTopContext();
        command = commandContext2.getCommand();
        if (command instanceof class01729) {
            class017172 = (class01729)command;
            class01744 class017442 = class01744.N(class017522, class030993);
            for (Object object : list2) {
                class017172.N((class01711)object, (ContextChain<class01711>)contextChain, class031263, class017442);
            }
        } else {
            if (class031263.L()) {
                class017172 = (class01711)list2.get(0);
                class017172 = class017172.y(class03102.N((class03102)class017172.T(), (class03102)class030993.u()));
                list2 = List.of(class017172);
            }
            class017172 = new class01717(this.y, class031263, commandContext2);
            class01722.N(class017522, class030993, list2, (class030992, class017112) -> new class01714<class01711>(class030992, class017172.N((class01711)class017112)));
        }
    }

    protected void N(class01752<T> class017522, class03099 class030992) {
        class01704 class017042 = class017522.y();
        if (class017042 != null) {
            class017042.N(class030992.L(), this.y);
        }
    }

    public /* synthetic */ ContextChain getCommand() {
        return this.L;
    }
}

