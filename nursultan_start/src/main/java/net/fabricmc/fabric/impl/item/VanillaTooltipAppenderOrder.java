/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class06497
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class08036
 *  minecraft.class08562
 *  net.fabricmc.loader.api.FabricLoader
 *  org.objectweb.asm.Type
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.spongepowered.asm.service.MixinService
 */
package net.fabricmc.fabric.impl.item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class06497;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class08036;
import minecraft.class08562;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.service.MixinService;

public final class VanillaTooltipAppenderOrder {
    private static final List<class02477<?>> VANILLA_ORDER = VanillaTooltipAppenderOrder.scrapeVanillaOrder();

    private VanillaTooltipAppenderOrder() {
    }

    public static void load() {
    }

    public static List<class02477<?>> getVanillaOrder() {
        return VANILLA_ORDER;
    }

    private static List<class02477<?>> scrapeVanillaOrder() {
        try {
            ClassNode classNode = MixinService.getService().getBytecodeProvider().getClassNode(Type.getInternalName(class06584.class));
            String string = FabricLoader.getInstance().getMappingResolver().mapMethodName("intermediary", "net.minecraft.class_1799", "method_67194", Type.getMethodDescriptor((Type)Type.VOID_TYPE, (Type[])new Type[]{Type.getObjectType((String)"net/minecraft/class_1792$class_9635"), Type.getObjectType((String)"net/minecraft/class_10712"), Type.getObjectType((String)"net/minecraft/class_1657"), Type.getObjectType((String)"net/minecraft/class_1836"), Type.getType(Consumer.class)}));
            String string2 = Type.getMethodDescriptor((Type)Type.VOID_TYPE, (Type[])new Type[]{Type.getType(class06591.class), Type.getType(class08562.class), Type.getType(class08036.class), Type.getType(class06497.class), Type.getType(Consumer.class)});
            String string3 = FabricLoader.getInstance().getMappingResolver().mapMethodName("intermediary", "net.minecraft.class_1799", "method_57363", Type.getMethodDescriptor((Type)Type.VOID_TYPE, (Type[])new Type[]{Type.getType(Consumer.class), Type.getObjectType((String)"net/minecraft/class_10712"), Type.getObjectType((String)"net/minecraft/class_1657")}));
            String string4 = Type.getMethodDescriptor((Type)Type.VOID_TYPE, (Type[])new Type[]{Type.getType(Consumer.class), Type.getType(class08562.class), Type.getType(class08036.class)});
            MethodNode methodNode2 = classNode.methods.stream().filter(methodNode -> methodNode.name.equals(string) && methodNode.desc.equals(string2)).findAny().orElseThrow(() -> new IllegalStateException("No appendTooltip method in ItemStack"));
            ArrayList<class02477> arrayList = new ArrayList<class02477>();
            HashSet<String> hashSet = new HashSet<String>();
            String string5 = Type.getInternalName(class02484.class);
            String string6 = Type.getDescriptor(class02477.class);
            for (AbstractInsnNode abstractInsnNode : methodNode2.instructions) {
                if (abstractInsnNode instanceof FieldInsnNode) {
                    FieldInsnNode fieldInsnNode = (FieldInsnNode)abstractInsnNode;
                    if (fieldInsnNode.getOpcode() == 178 && fieldInsnNode.owner.equals(string5) && fieldInsnNode.desc.equals(string6)) {
                        String string7 = fieldInsnNode.name;
                        if (!hashSet.add(string7)) continue;
                        arrayList.add((class02477)class02484.class.getField(string7).get(null));
                        continue;
                    }
                }
                if (!(abstractInsnNode instanceof MethodInsnNode)) continue;
                MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                if (!methodInsnNode.name.equals(string3) || !methodInsnNode.desc.equals(string4) || !methodInsnNode.owner.equals(Type.getInternalName(class06584.class))) continue;
                arrayList.add(class02484.b);
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Found no component types in appendTooltip method");
            }
            return Collections.unmodifiableList(arrayList);
        }
        catch (IOException | ReflectiveOperationException exception) {
            throw new RuntimeException(exception);
        }
    }
}

