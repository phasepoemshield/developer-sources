/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class04206
 *  minecraft.class06763
 *  minecraft.class06789
 *  minecraft.class06799
 *  minecraft.class08164
 *  minecraft.class08166
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import minecraft.class04206;
import minecraft.class06763;
import minecraft.class06789;
import minecraft.class06799;
import minecraft.class08164;
import minecraft.class08166;
import org.slf4j.Logger;

public class class01906 {
    private static final Logger N = LogUtils.getLogger();
    private static final byte y = 1;
    private static final byte L = 2;

    public static boolean y(byte by) {
        return (by & 2) != 0;
    }

    private static <T> void N(CommandNode<T> commandNode2, Set<ArgumentType<?>> set, Set<CommandNode<T>> set2) {
        ArgumentCommandNode argumentCommandNode;
        if (!set2.add(commandNode2)) {
            return;
        }
        if (commandNode2 instanceof ArgumentCommandNode) {
            argumentCommandNode = (ArgumentCommandNode)commandNode2;
            set.add(argumentCommandNode.getType());
        }
        commandNode2.getChildren().forEach(commandNode -> class01906.N(commandNode, set, set2));
        argumentCommandNode = commandNode2.getRedirect();
        if (argumentCommandNode != null) {
            class01906.N(argumentCommandNode, set, set2);
        }
    }

    public static <T> Set<ArgumentType<?>> N(CommandNode<T> commandNode) {
        ReferenceOpenHashSet referenceOpenHashSet = new ReferenceOpenHashSet();
        HashSet hashSet = new HashSet();
        class01906.N(commandNode, hashSet, referenceOpenHashSet);
        return hashSet;
    }

    public static <S> JsonObject N(CommandDispatcher<S> commandDispatcher, CommandNode<S> commandNode) {
        Collection var4;
        LiteralCommandNode literalCommandNode;
        Object object;
        JsonObject jsonObject = new JsonObject();
        CommandNode<S> commandNode2 = commandNode;
        Objects.requireNonNull(commandNode2);
        Object object2 = commandNode2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{RootCommandNode.class, LiteralCommandNode.class, ArgumentCommandNode.class}, object2, (int)n)) {
            case 0: {
                object = (RootCommandNode)object2;
                jsonObject.addProperty("type", "root");
                break;
            }
            case 1: {
                literalCommandNode = (LiteralCommandNode)object2;
                jsonObject.addProperty("type", "literal");
                break;
            }
            case 2: {
                Object object3 = (ArgumentCommandNode)object2;
                class01906.N(jsonObject, object3.getType());
                break;
            }
            default: {
                N.error("Could not serialize node {} ({})!", commandNode, commandNode.getClass());
                jsonObject.addProperty("type", "unknown");
            }
        }
        object2 = commandNode.getChildren();
        if (!object2.isEmpty()) {
            JsonObject jsonObject2 = new JsonObject();
            object = object2.iterator();
            while (object.hasNext()) {
                literalCommandNode = (CommandNode)object.next();
                jsonObject2.add(literalCommandNode.getName(), (JsonElement)class01906.N(commandDispatcher, literalCommandNode));
            }
            jsonObject.add("children", (JsonElement)jsonObject2);
        }
        if (commandNode.getCommand() != null) {
            jsonObject.addProperty("executable", Boolean.valueOf(true));
        }
        if ((object = commandNode.getRequirement()) instanceof class08166) {
            class08166 class081662 = (class08166)object;
            object = (JsonElement)class08164.N.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class081662.N()).getOrThrow(string -> new IllegalStateException("Failed to serialize requirement: " + string));
            jsonObject.add("permissions", (JsonElement)object);
        }
        if (commandNode.getRedirect() != null && !(var4 = commandDispatcher.getPath(commandNode.getRedirect())).isEmpty()) {
            object = new JsonArray();
            for (Object object3 : var4) {
                object.add((String)object3);
            }
            jsonObject.add("redirect", (JsonElement)object);
        }
        return jsonObject;
    }

    public static boolean N(byte by) {
        return (by & 1) != 0;
    }

    private static <A extends ArgumentType<?>, T extends class06763<A>> void N(JsonObject jsonObject, class06799<A, T> class067992, class06763<A> class067632) {
        class067992.N(class067632, jsonObject);
    }

    private static <T extends ArgumentType<?>> void N(JsonObject jsonObject, T t) {
        class06763 class067632 = class06789.y(t);
        jsonObject.addProperty("type", "argument");
        jsonObject.addProperty("parser", String.valueOf(class04206.t.y((Object)class067632.N())));
        JsonObject jsonObject2 = new JsonObject();
        class01906.N(jsonObject2, class067632.N(), class067632);
        if (!jsonObject2.isEmpty()) {
            jsonObject.add("properties", (JsonElement)jsonObject2);
        }
    }

    public static int N(boolean bl, boolean bl2) {
        int n = 0;
        if (bl) {
            n |= 1;
        }
        if (bl2) {
            n |= 2;
        }
        return n;
    }
}

