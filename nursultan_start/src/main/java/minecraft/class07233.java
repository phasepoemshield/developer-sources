/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09369
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00485
 *  minecraft.class00487
 *  minecraft.class00508
 *  minecraft.class00523
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04206
 *  minecraft.class04248
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06789
 *  minecraft.class06799
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09369;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import minecraft.class00381;
import minecraft.class00485;
import minecraft.class00487;
import minecraft.class00508;
import minecraft.class00523;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04206;
import minecraft.class04248;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06789;
import minecraft.class06799;
import minecraft.class07263;
import minecraft.class07273;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public class class07233
implements class00381<class07280> {
    public static final class02362<class00667, class07233> N = class00381.N(class07233::N, class07233::new);
    private static final byte y = 3;
    private static final byte L = 4;
    private static final byte u = 8;
    private static final byte i = 16;
    private static final byte R = 32;
    private static final byte M = 0;
    private static final byte B = 1;
    private static final byte Z = 2;
    private final int z;
    private final List<class00487> U;

    public <S> class07233(RootCommandNode<S> rootCommandNode, class07273<S> class072732) {
        Object2IntMap<CommandNode<S>> object2IntMap = class07233.N(rootCommandNode);
        this.U = class07233.N(object2IntMap, class072732);
        this.z = object2IntMap.getInt(rootCommandNode);
    }

    private class07233(class00667 class006672) {
        this.U = class006672.N_16(class07233::y);
        this.z = class006672.E();
        class07233.N(this.U);
    }

    private static class00487 y(class00667 class006672) {
        byte by = class006672.readByte();
        int[] nArray = class006672.L();
        int n = (by & 8) != 0 ? class006672.E() : 0;
        class00508 class005082 = class07233.N(class006672, by);
        return new class00487(class005082, (int)by, n, nArray);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private static <S> class00487 N(CommandNode<S> commandNode, class07273<S> class072732, Object2IntMap<CommandNode<S>> object2IntMap) {
        class00485 class004852;
        int n;
        int n2 = 0;
        if (commandNode.getRedirect() != null) {
            n2 |= 8;
            n = object2IntMap.getInt((Object)commandNode.getRedirect());
        } else {
            n = 0;
        }
        if (class072732.N(commandNode)) {
            n2 |= 4;
        }
        if (class072732.y(commandNode)) {
            n2 |= 0x20;
        }
        CommandNode<S> commandNode2 = commandNode;
        Objects.requireNonNull(commandNode2);
        Object object = commandNode2;
        int n3 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{RootCommandNode.class, ArgumentCommandNode.class, LiteralCommandNode.class}, object, (int)n3)) {
            case 0: {
                RootCommandNode rootCommandNode = (RootCommandNode)object;
                n2 |= 0;
                class004852 = null;
                break;
            }
            case 1: {
                ArgumentCommandNode argumentCommandNode = (ArgumentCommandNode)object;
                class01894 class018942 = class072732.N(argumentCommandNode);
                class004852 = new class00523(argumentCommandNode.getName(), class06789.y((ArgumentType)argumentCommandNode.getType()), class018942);
                n2 |= 2;
                if (class018942 != null) {
                    n2 |= 0x10;
                }
                break;
            }
            case 2: {
                LiteralCommandNode literalCommandNode = (LiteralCommandNode)object;
                class004852 = new class00485(literalCommandNode.getLiteral());
                n2 |= 1;
                break;
            }
            default: {
                throw new UnsupportedOperationException("Unknown node type " + String.valueOf(commandNode));
            }
        }
        object = commandNode.getChildren().stream().mapToInt(arg_0 -> object2IntMap.getInt(arg_0)).toArray();
        return new class00487((class00508)class004852, n2, n, object);
    }

    private static @Nullable class00508 N(class00667 class006672, byte by) {
        int n = by & 3;
        if (n == 2) {
            String string = class006672.s();
            int n2 = class006672.E();
            class06799 var5 = (class06799)class04206.t.N(n2);
            if (var5 == null) {
                return null;
            }
            class06763 class067632 = var5.y(class006672);
            class01894 class018942 = (by & 0x10) != 0 ? class006672.T() : null;
            return new class00523(string, class067632, class018942);
        }
        if (n == 1) {
            String string = class006672.s();
            return new class00485(string);
        }
        return null;
    }

    public <S> RootCommandNode<S> N(class04348 class043482, class07263<S> class072632) {
        return (RootCommandNode)new class09369(class043482, class072632, this.U).N(this.z);
    }

    private static /* synthetic */ boolean N(BiPredicate biPredicate, List list, IntSet intSet, int n) {
        return biPredicate.test((class00487)list.get(n), intSet);
    }

    private static void N(List<class00487> list) {
        class07233.N(list, class00487::N);
        class07233.N(list, class00487::y);
    }

    private static void N(List<class00487> list, BiPredicate<class00487, IntSet> biPredicate) {
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet((IntCollection)IntSets.fromTo((int)0, (int)list.size()));
        while (!intOpenHashSet.isEmpty()) {
            if (intOpenHashSet.removeIf(arg_0 -> class07233.N(biPredicate, list, (IntSet)intOpenHashSet, arg_0))) continue;
            throw new IllegalStateException("Server sent an impossible command tree");
        }
    }

    private static <S> Object2IntMap<CommandNode<S>> N(RootCommandNode<S> rootCommandNode) {
        CommandNode commandNode;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        arrayDeque.add(rootCommandNode);
        while ((commandNode = (CommandNode)arrayDeque.poll()) != null) {
            if (object2IntOpenHashMap.containsKey((Object)commandNode)) continue;
            int n = object2IntOpenHashMap.size();
            object2IntOpenHashMap.put((Object)commandNode, n);
            arrayDeque.addAll(commandNode.getChildren());
            if (commandNode.getRedirect() == null) continue;
            arrayDeque.add(commandNode.getRedirect());
        }
        return object2IntOpenHashMap;
    }

    private static <S> List<class00487> N(Object2IntMap<CommandNode<S>> object2IntMap, class07273<S> class072732) {
        ObjectArrayList objectArrayList = new ObjectArrayList(object2IntMap.size());
        objectArrayList.size(object2IntMap.size());
        for (Object2IntMap.Entry entry : Object2IntMaps.fastIterable(object2IntMap)) {
            objectArrayList.set(entry.getIntValue(), (Object)class07233.N((CommandNode)entry.getKey(), class072732, object2IntMap));
        }
        return objectArrayList;
    }

    private void N(class00667 class006673) {
        class006673.N_12(this.U, (class006672, class004872) -> class004872.N(class006672));
        class006673.L(this.z);
    }

    public class02897<class07233> method_65080() {
        return class04248.b;
    }
}

