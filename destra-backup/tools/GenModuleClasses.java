import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class GenModuleClasses {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        genHitColor();
        genAspectRatio();
        genHitBubble();
    }

    static void addModeSetting(MethodVisitor mv, String cls, String fieldName, String label, String... modes) {
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW, "ru/destra/setting/ModeSetting");
        mv.visitInsn(Opcodes.DUP);
        mv.visitLdcInsn(label);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        // Create String[] array for varargs
        mv.visitIntInsn(Opcodes.BIPUSH, modes.length);
        mv.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/String");
        for (int i = 0; i < modes.length; i++) {
            mv.visitInsn(Opcodes.DUP);
            mv.visitIntInsn(Opcodes.BIPUSH, i);
            mv.visitLdcInsn(modes[i]);
            mv.visitInsn(Opcodes.AASTORE);
        }
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/setting/ModeSetting", "<init>", "(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V", false);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, fieldName, "Lru/destra/setting/ModeSetting;");
    }

    static void addNumberSetting(MethodVisitor mv, String cls, String fieldName, String label, float def, float min, float max, float inc) {
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW, "ru/destra/setting/NumberSetting");
        mv.visitInsn(Opcodes.DUP);
        mv.visitLdcInsn(label);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn(def);
        mv.visitLdcInsn(min);
        mv.visitLdcInsn(max);
        mv.visitLdcInsn(inc);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/setting/NumberSetting", "<init>", "(Ljava/lang/String;Lru/destra/core/Module;FFFF)V", false);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, fieldName, "Lru/destra/setting/NumberSetting;");
    }

    static void addBooleanSetting(MethodVisitor mv, String cls, String fieldName, String label, boolean def) {
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW, "ru/destra/setting/BooleanSetting");
        mv.visitInsn(Opcodes.DUP);
        mv.visitLdcInsn(label);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitInsn(def ? Opcodes.ICONST_1 : Opcodes.ICONST_0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/setting/BooleanSetting", "<init>", "(Ljava/lang/String;Lru/destra/core/Module;Z)V", false);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, fieldName, "Lru/destra/setting/BooleanSetting;");
    }

    static void addObjectSetting(MethodVisitor mv, String cls, String fieldName, String label) {
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitTypeInsn(Opcodes.NEW, "ru/destra/setting/ObjectSetting");
        mv.visitInsn(Opcodes.DUP);
        mv.visitLdcInsn(label);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitInsn(Opcodes.ICONST_M1);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/setting/ObjectSetting", "<init>", "(Ljava/lang/String;Lru/destra/core/Module;I)V", false);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, fieldName, "Lru/destra/setting/ObjectSetting;");
    }

    static void writeClass(String className, byte[] data) throws Exception {
        String filePath = ".precompiled/" + className.replace('/', File.separatorChar) + ".class";
        Path path = Path.of(filePath);
        Files.createDirectories(path.getParent());
        Files.write(path, data);
        System.out.println("Generated " + path + " (" + data.length + " bytes)");
    }

    static void genHitColor() throws Exception {
        String cls = "ru/destra/module/HitColorModule";
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V21, Opcodes.ACC_PUBLIC, cls, null, "ru/destra/core/Module", new String[]{"ru/destra/misc/ChatCommandSender2"});

        cw.visitField(Opcodes.ACC_PUBLIC, "paintTargetMode", "Lru/destra/setting/ModeSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "useThemeColor", "Lru/destra/setting/BooleanSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "customColor", "Lru/destra/setting/ObjectSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "opacity", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();

        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn("HitColor");
        mv.visitFieldInsn(Opcodes.GETSTATIC, "ru/destra/core/ModuleCategory", "Visuals", "Lru/destra/core/ModuleCategory;");
        mv.visitLdcInsn("\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0446\u0432\u0435\u0442 \u043f\u043e\u0434\u0441\u0432\u0435\u0442\u043a\u0438 \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435");
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "<init>", "(Ljava/lang/String;Lru/destra/core/ModuleCategory;Ljava/lang/String;)V", false);

        addModeSetting(mv, cls, "paintTargetMode", "\u041a\u0440\u0430\u0441\u0438\u0442\u044c", "\u0411\u0440\u043e\u043d\u044f + \u0438\u0433\u0440\u043e\u043a", "\u0411\u0440\u043e\u043d\u044f", "\u0418\u0433\u0440\u043e\u043a");
        addBooleanSetting(mv, cls, "useThemeColor", "\u0426\u0432\u0435\u0442 \u0442\u0435\u043c\u044b", true);
        addObjectSetting(mv, cls, "customColor", "\u0426\u0432\u0435\u0442");
        addNumberSetting(mv, cls, "opacity", "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", 0.5F, 0.0F, 1.0F, 0.1F);

        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // getColor()I
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "getColor", "()I", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "useThemeColor", "Lru/destra/setting/BooleanSetting;");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/BooleanSetting", "isEnabled", "()Z", false);
        Label lblNotTheme = new Label();
        mv.visitJumpInsn(Opcodes.IFEQ, lblNotTheme);
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "ru/destra/core/DestraClient", "getInstance", "()Lru/destra/core/DestraClient;", false);
        mv.visitInsn(Opcodes.DUP);
        Label lblNull = new Label();
        mv.visitJumpInsn(Opcodes.IFNULL, lblNull);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/core/DestraClient", "getThemeManager", "()Ljava/lang/Object;", false);
        mv.visitIntInsn(Opcodes.BIPUSH, 90);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getThemeColor", "(I)I", false);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitLabel(lblNull);
        mv.visitInsn(Opcodes.POP);
        mv.visitLabel(lblNotTheme);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "customColor", "Lru/destra/setting/ObjectSetting;");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ObjectSetting", "5", "()Ljava/lang/Object;", false);
        mv.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/Integer");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // shouldColorArmor()Z
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "shouldColorArmor", "()Z", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "paintTargetMode", "Lru/destra/setting/ModeSetting;");
        mv.visitLdcInsn("\u0411\u0440\u043e\u043d\u044f + \u0438\u0433\u0440\u043e\u043a");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ModeSetting", "is", "(Ljava/lang/String;)Z", false);
        Label lbl1 = new Label();
        mv.visitJumpInsn(Opcodes.IFNE, lbl1);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "paintTargetMode", "Lru/destra/setting/ModeSetting;");
        mv.visitLdcInsn("\u0411\u0440\u043e\u043d\u044f");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ModeSetting", "is", "(Ljava/lang/String;)Z", false);
        mv.visitLabel(lbl1);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // shouldColorPlayer()Z
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "shouldColorPlayer", "()Z", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "paintTargetMode", "Lru/destra/setting/ModeSetting;");
        mv.visitLdcInsn("\u0411\u0440\u043e\u043d\u044f + \u0438\u0433\u0440\u043e\u043a");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ModeSetting", "is", "(Ljava/lang/String;)Z", false);
        Label lbl2 = new Label();
        mv.visitJumpInsn(Opcodes.IFNE, lbl2);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "paintTargetMode", "Lru/destra/setting/ModeSetting;");
        mv.visitLdcInsn("\u0418\u0433\u0440\u043e\u043a");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ModeSetting", "is", "(Ljava/lang/String;)Z", false);
        mv.visitLabel(lbl2);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        cw.visitEnd();
        writeClass(cls, cw.toByteArray());
    }

    static void genAspectRatio() throws Exception {
        String cls = "ru/destra/module/AspectRatioModule";
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V21, Opcodes.ACC_PUBLIC, cls, null, "ru/destra/core/Module", new String[]{"ru/destra/misc/ChatCommandSender2"});

        cw.visitField(Opcodes.ACC_PUBLIC, "modeSetting", "Lru/destra/setting/ModeSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "multiplierSetting", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "currentRatio", "F", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PRIVATE, "lastNanoTime", "J", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PRIVATE, "targetRatio", "F", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PRIVATE, "transitionDeadlineNanos", "J", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "resettingToNative", "Z", null, null).visitEnd();

        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn("AspectRatio");
        mv.visitFieldInsn(Opcodes.GETSTATIC, "ru/destra/core/ModuleCategory", "Visuals", "Lru/destra/core/ModuleCategory;");
        mv.visitLdcInsn("\u0418\u0437\u043c\u0435\u043d\u044f\u0435\u0442 \u0441\u043e\u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u0441\u0442\u043e\u0440\u043e\u043d \u044d\u043a\u0440\u0430\u043d\u0430");
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "<init>", "(Ljava/lang/String;Lru/destra/core/ModuleCategory;Ljava/lang/String;)V", false);

        addModeSetting(mv, cls, "modeSetting", "\u0420\u0435\u0436\u0438\u043c", "16:9", "4:3", "21:9", "16:10", "\u041a\u0430\u0441\u0442\u043e\u043c");
        addNumberSetting(mv, cls, "multiplierSetting", "\u041c\u043d\u043e\u0436\u0438\u0442\u0435\u043b\u044c", 1.0F, 0.5F, 2.0F, 0.05F);

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn(1.7777778F);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, "currentRatio", "F");
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, "lastNanoTime", "J");
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn(1.7777778F);
        mv.visitFieldInsn(Opcodes.PUTFIELD, cls, "targetRatio", "F");
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // getCurrentRatio()F
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "getCurrentRatio", "()F", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, cls, "currentRatio", "F");
        mv.visitInsn(Opcodes.FRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // isTransitioning()Z
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "isTransitioning", "()Z", null, null);
        mv.visitCode();
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        cw.visitEnd();
        writeClass(cls, cw.toByteArray());
    }

    static void genHitBubble() throws Exception {
        String cls = "ru/destra/module/HitBubbleModule";
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V21, Opcodes.ACC_PUBLIC, cls, null, "ru/destra/core/Module", new String[]{"ru/destra/misc/ChatCommandSender2"});

        cw.visitField(Opcodes.ACC_PUBLIC, "shapeMode", "Lru/destra/setting/ModeSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "sizeSetting", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "speedSetting", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "rotateEnabled", "Lru/destra/setting/BooleanSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "rotationSpeedSetting", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "useThemeColor", "Lru/destra/setting/BooleanSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "colorModeSetting", "Lru/destra/setting/ModeSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "gradientModeSetting", "Lru/destra/setting/ModeSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "rainbowSpeedSetting", "Lru/destra/setting/NumberSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "color1Setting", "Lru/destra/setting/ObjectSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "color2Setting", "Lru/destra/setting/ObjectSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "color3Setting", "Lru/destra/setting/ObjectSetting;", null, null).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC, "color4Setting", "Lru/destra/setting/ObjectSetting;", null, null).visitEnd();

        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitLdcInsn("HitBubble");
        mv.visitFieldInsn(Opcodes.GETSTATIC, "ru/destra/core/ModuleCategory", "Visuals", "Lru/destra/core/ModuleCategory;");
        mv.visitLdcInsn("\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u044d\u0444\u0444\u0435\u043a\u0442 \u043f\u0440\u0438 \u043f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0438");
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "<init>", "(Ljava/lang/String;Lru/destra/core/ModuleCategory;Ljava/lang/String;)V", false);

        addModeSetting(mv, cls, "shapeMode", "\u041c\u043e\u0434", "\u041a\u0440\u0443\u0433 1", "\u041a\u0440\u0443\u0433 2", "\u041a\u0440\u0443\u0433 3", "\u041a\u0440\u0443\u0433 4", "\u041f\u0443\u0437\u044b\u0440\u044c 5");
        addNumberSetting(mv, cls, "sizeSetting", "\u0420\u0430\u0437\u043c\u0435\u0440", 1.0F, 0.5F, 3.0F, 0.1F);
        addNumberSetting(mv, cls, "speedSetting", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 6.0F, 1.0F, 15.0F, 0.1F);
        addBooleanSetting(mv, cls, "rotateEnabled", "\u0412\u0440\u0430\u0449\u0430\u0442\u044c", true);
        addNumberSetting(mv, cls, "rotationSpeedSetting", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0440\u043e\u0442\u0430\u0446\u0438\u0438", 1.0F, 0.5F, 3.0F, 0.1F);
        addBooleanSetting(mv, cls, "useThemeColor", "\u0426\u0432\u0435\u0442 \u0442\u0435\u043c\u044b", true);
        addModeSetting(mv, cls, "colorModeSetting", "\u041c\u043e\u0434 \u0446\u0432\u0435\u0442\u0430", "1 \u0446\u0432\u0435\u0442", "2 \u0446\u0432\u0435\u0442\u0430", "4 \u0446\u0432\u0435\u0442\u0430");
        addModeSetting(mv, cls, "gradientModeSetting", "\u0420\u0435\u0436\u0438\u043c \u0433\u0440\u0430\u0434\u0438\u0435\u043d\u0442\u0430", "\u041f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u0435", "\u0421\u0442\u0430\u0442\u0438\u0447\u043d\u044b\u0439");
        addNumberSetting(mv, cls, "rainbowSpeedSetting", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u044f", 1.0F, 0.1F, 5.0F, 0.1F);
        addObjectSetting(mv, cls, "color1Setting", "\u0426\u0432\u0435\u0442");
        addObjectSetting(mv, cls, "color2Setting", "\u0426\u0432\u0435\u0442 2");
        addObjectSetting(mv, cls, "color3Setting", "\u0426\u0432\u0435\u0442 3");
        addObjectSetting(mv, cls, "color4Setting", "\u0426\u0432\u0435\u0442 4");

        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        // onDisable()V
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "onDisable", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "disable", "()V", false);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        cw.visitEnd();
        writeClass(cls, cw.toByteArray());
    }
}
