/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer
 *  org.lwjgl.system.MemoryUtil
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.Opcodes
 *  org.objectweb.asm.Type
 */
package net.caffeinemc.mods.sodium.client.render.vertex.serializers.generated;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializer;
import net.caffeinemc.mods.sodium.client.render.vertex.serializers.generated.VertexSerializerFactory$Bytecode;
import net.caffeinemc.mods.sodium.client.render.vertex.serializers.generated.VertexSerializerFactory$MemoryTransfer;
import org.lwjgl.system.MemoryUtil;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class VertexSerializerFactory {
    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();

    public static VertexSerializerFactory$Bytecode generate(VertexFormat vertexFormat, VertexFormat vertexFormat2, String string) {
        VertexSerializerFactory$MemoryTransfer vertexSerializerFactory$MemoryTransfer2;
        List<VertexSerializerFactory$MemoryTransfer> list = VertexSerializerFactory.createMemoryTransferList(vertexFormat, vertexFormat2);
        String string2 = "net/caffeinemc/mods/sodium/client/render/vertex/serializers/generated/VertexSerializer$Impl$" + string;
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(61, 17, string2, null, Type.getInternalName(Object.class), new String[]{Type.getInternalName(VertexSerializer.class)});
        boolean bl = false;
        MethodVisitor methodVisitor = classWriter.visitMethod(1, "<init>", "()V", null, null);
        methodVisitor.visitCode();
        Label label = new Label();
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitMethodInsn(183, "java/lang/Object", "<init>", "()V", false);
        Label label2 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitInsn(177);
        Label label3 = new Label();
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLocalVariable("this", "L" + string2 + ";", null, label, label3, 0);
        methodVisitor.visitMaxs(2, 1);
        methodVisitor.visitEnd();
        bl = false;
        boolean bl2 = true;
        int n = 3;
        int n2 = 5;
        int n3 = 6;
        MethodVisitor methodVisitor2 = classWriter.visitMethod(1, "serialize", "(JJI)V", null, null);
        methodVisitor2.visitCode();
        Label label4 = new Label();
        methodVisitor2.visitLabel(label4);
        methodVisitor2.visitInsn(3);
        methodVisitor2.visitVarInsn(54, 6);
        Label label5 = new Label();
        methodVisitor2.visitLabel(label5);
        methodVisitor2.visitFrame(1, 1, new Object[]{Opcodes.INTEGER}, 0, null);
        methodVisitor2.visitVarInsn(21, 6);
        methodVisitor2.visitVarInsn(21, 5);
        Label label6 = new Label();
        methodVisitor2.visitJumpInsn(162, label6);
        for (VertexSerializerFactory$MemoryTransfer vertexSerializerFactory$MemoryTransfer2 : list) {
            int n4 = 0;
            while (n4 < vertexSerializerFactory$MemoryTransfer2.length()) {
                int n5 = vertexSerializerFactory$MemoryTransfer2.length() - n4;
                Label label7 = new Label();
                methodVisitor2.visitLabel(label7);
                methodVisitor2.visitVarInsn(22, 3);
                methodVisitor2.visitLdcInsn((Object)(vertexSerializerFactory$MemoryTransfer2.dst() + n4));
                methodVisitor2.visitInsn(97);
                methodVisitor2.visitVarInsn(22, 1);
                methodVisitor2.visitLdcInsn((Object)(vertexSerializerFactory$MemoryTransfer2.src() + n4));
                methodVisitor2.visitInsn(97);
                if (n5 >= 8) {
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memGetLong", "(J)J", false);
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memPutLong", "(JJ)V", false);
                    n4 += 8;
                    continue;
                }
                if (n5 >= 4) {
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memGetInt", "(J)I", false);
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memPutInt", "(JI)V", false);
                    n4 += 4;
                    continue;
                }
                if (n5 >= 2) {
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memGetShort", "(J)S", false);
                    methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memPutShort", "(JS)V", false);
                    n4 += 2;
                    continue;
                }
                methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memGetByte", "(J)B", false);
                methodVisitor2.visitMethodInsn(184, Type.getInternalName(MemoryUtil.class), "memPutByte", "(JB)V", false);
                ++n4;
            }
        }
        Label label8 = new Label();
        methodVisitor2.visitLabel(label8);
        methodVisitor2.visitVarInsn(22, 1);
        methodVisitor2.visitLdcInsn((Object)vertexFormat.getVertexSize());
        methodVisitor2.visitInsn(97);
        methodVisitor2.visitVarInsn(55, 1);
        vertexSerializerFactory$MemoryTransfer2 = new Label();
        methodVisitor2.visitLabel((Label)vertexSerializerFactory$MemoryTransfer2);
        methodVisitor2.visitVarInsn(22, 3);
        methodVisitor2.visitLdcInsn((Object)vertexFormat2.getVertexSize());
        methodVisitor2.visitInsn(97);
        methodVisitor2.visitVarInsn(55, 3);
        Label label9 = new Label();
        methodVisitor2.visitLabel(label9);
        methodVisitor2.visitIincInsn(6, 1);
        methodVisitor2.visitJumpInsn(167, label5);
        methodVisitor2.visitLabel(label6);
        methodVisitor2.visitFrame(2, 1, null, 0, null);
        methodVisitor2.visitInsn(177);
        Label label10 = new Label();
        methodVisitor2.visitLabel(label10);
        methodVisitor2.visitLocalVariable("this", "L" + string2 + ";", null, label4, label10, 0);
        methodVisitor2.visitLocalVariable("src", "J", null, label4, label10, 1);
        methodVisitor2.visitLocalVariable("dst", "J", null, label4, label10, 3);
        methodVisitor2.visitLocalVariable("vertexCount", "I", null, label4, label10, 5);
        methodVisitor2.visitLocalVariable("vertexIndex", "I", null, label5, label6, 6);
        methodVisitor2.visitMaxs(6, 7);
        methodVisitor2.visitEnd();
        classWriter.visitEnd();
        return new VertexSerializerFactory$Bytecode(classWriter.toByteArray());
    }

    public static Class<?> define(VertexSerializerFactory$Bytecode vertexSerializerFactory$Bytecode) {
        try {
            return LOOKUP.defineClass(vertexSerializerFactory$Bytecode.data);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Failed to access generated class", illegalAccessException);
        }
    }

    private static List<VertexSerializerFactory$MemoryTransfer> mergeAdjacentMemoryTransfers(ArrayList<VertexSerializerFactory$MemoryTransfer> arrayList) {
        ArrayList<VertexSerializerFactory$MemoryTransfer> arrayList2 = new ArrayList<VertexSerializerFactory$MemoryTransfer>(arrayList.size());
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (VertexSerializerFactory$MemoryTransfer vertexSerializerFactory$MemoryTransfer : arrayList) {
            if (n + n3 == vertexSerializerFactory$MemoryTransfer.src() && n2 + n3 == vertexSerializerFactory$MemoryTransfer.dst()) {
                n3 += vertexSerializerFactory$MemoryTransfer.length();
                continue;
            }
            if (n3 > 0) {
                arrayList2.add(new VertexSerializerFactory$MemoryTransfer(n, n2, n3));
            }
            n = vertexSerializerFactory$MemoryTransfer.src();
            n2 = vertexSerializerFactory$MemoryTransfer.dst();
            n3 = vertexSerializerFactory$MemoryTransfer.length();
        }
        if (n3 > 0) {
            arrayList2.add(new VertexSerializerFactory$MemoryTransfer(n, n2, n3));
        }
        return arrayList2;
    }

    private static List<VertexSerializerFactory$MemoryTransfer> createMemoryTransferList(VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        ArrayList<VertexSerializerFactory$MemoryTransfer> arrayList = new ArrayList<VertexSerializerFactory$MemoryTransfer>();
        for (int i = 0; i < 32; ++i) {
            VertexFormatElement vertexFormatElement = VertexFormatElement.byId((int)i);
            if (vertexFormatElement == null || !vertexFormat2.contains(vertexFormatElement)) continue;
            if (!vertexFormat.contains(vertexFormatElement)) {
                throw new RuntimeException("Source format is missing element %s as required by destination format".formatted(new Object[]{vertexFormatElement}));
            }
            int n = vertexFormat.getOffset(vertexFormatElement);
            int n2 = vertexFormat2.getOffset(vertexFormatElement);
            arrayList.add(new VertexSerializerFactory$MemoryTransfer(n, n2, vertexFormatElement.byteSize()));
        }
        return VertexSerializerFactory.mergeAdjacentMemoryTransfers(arrayList);
    }
}

