/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.context.CommandContextBuilder
 *  com.mojang.brigadier.context.ParsedArgument
 *  com.mojang.brigadier.context.ParsedCommandNode
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04458
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class03067;
import minecraft.class04458;
import org.jspecify.annotations.Nullable;

public final class class03039<S>
extends Record {
    private final List<class03067<S>> arguments;

    public class03039(List<class03067<S>> list) {
        this.arguments = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03039.class, "arguments", "arguments"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03039.class, "arguments", "arguments"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03039.class, "arguments", "arguments"}, this);
    }

    public static <S> class03039<S> y(ParseResults<S> parseResults) {
        CommandContextBuilder commandContextBuilder;
        CommandContextBuilder commandContextBuilder2;
        String string = parseResults.getReader().getString();
        CommandContextBuilder commandContextBuilder3 = commandContextBuilder2 = parseResults.getContext();
        List<class03067<S>> list = class03039.N(string, commandContextBuilder3);
        while ((commandContextBuilder = commandContextBuilder3.getChild()) != null && commandContextBuilder.getRootNode() != commandContextBuilder2.getRootNode()) {
            list.addAll(class03039.N(string, commandContextBuilder));
            commandContextBuilder3 = commandContextBuilder;
        }
        return new class03039<S>(list);
    }

    public List<class03067<S>> N() {
        return this.arguments;
    }

    public @Nullable class03067<S> N(String string) {
        for (class03067<S> class030672 : this.arguments) {
            if (!string.equals(class030672.N())) continue;
            return class030672;
        }
        return null;
    }

    private static <S> List<class03067<S>> N(String string, CommandContextBuilder<S> commandContextBuilder) {
        ArrayList<class03067<S>> arrayList = new ArrayList<class03067<S>>();
        Iterator iterator = commandContextBuilder.getNodes().iterator();
        while (iterator.hasNext()) {
            ArgumentCommandNode argumentCommandNode;
            CommandNode commandNode = ((ParsedCommandNode)iterator.next()).getNode();
            if (!(commandNode instanceof ArgumentCommandNode) || !((argumentCommandNode = (ArgumentCommandNode)commandNode).getType() instanceof class04458) || (commandNode = (ParsedArgument)commandContextBuilder.getArguments().get(argumentCommandNode.getName())) == null) continue;
            String string2 = commandNode.getRange().get(string);
            arrayList.add(new class03067(argumentCommandNode, string2));
        }
        return arrayList;
    }

    public static <S> boolean N(ParseResults<S> parseResults) {
        return !class03039.y(parseResults).N().isEmpty();
    }
}

