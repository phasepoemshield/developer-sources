import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class PatchKeybindSettingElement {
    private PatchKeybindSettingElement() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected class file path");
        }

        Path classFile = Path.of(args[0]);
        byte[] original = Files.readAllBytes(classFile);
        ClassFile file = ClassFile.parse(original);
        if (file.isAlreadyPatched()) {
            System.out.println("KeybindSettingElement.class already patched, re-patching with x/y fix");
        }

        byte[] patched = file.patchEmptyBoundsMethod();
        if (!ClassFile.parse(patched).isAlreadyPatched()) {
            throw new IllegalStateException("Patched class still contains empty bounds method");
        }
        Files.write(classFile, patched);
        System.out.println("Patched KeybindSettingElement.class: " + ClassFile.parse(patched).describeBoundsMethod());
    }

    private static final class ClassFile {
        private final byte[] bytes;
        private final String[] utf8;
        private final int[] cpTag;
        private final int[][] cpPair;
        private final int[] cpSingle;
        private final int thisClassIndex;
        private final int superClassIndex;
        private final String thisClassName;
        private final String superClassName;
        private final List<FieldInfo> fields;
        private final List<MethodInfo> methods;
        private final int methodsCountOffset;

        private ClassFile(
            byte[] bytes,
            String[] utf8,
            int[] cpTag,
            int[][] cpPair,
            int[] cpSingle,
            int thisClassIndex,
            int superClassIndex,
            List<FieldInfo> fields,
            List<MethodInfo> methods,
            int methodsCountOffset
        ) {
            this.bytes = bytes;
            this.utf8 = utf8;
            this.cpTag = cpTag;
            this.cpPair = cpPair;
            this.cpSingle = cpSingle;
            this.thisClassIndex = thisClassIndex;
            this.superClassIndex = superClassIndex;
            this.thisClassName = this.className(thisClassIndex);
            this.superClassName = this.className(superClassIndex);
            this.fields = fields;
            this.methods = methods;
            this.methodsCountOffset = methodsCountOffset;
        }

        static ClassFile parse(byte[] bytes) {
            Cursor c = new Cursor(bytes);
            if (c.u4() != 0xCAFEBABE) {
                throw new IllegalArgumentException("Invalid class file");
            }

            c.u2();
            c.u2();
            int cpCount = c.u2();
            String[] utf8 = new String[cpCount];
            int[] cpTag = new int[cpCount];
            int[][] cpPair = new int[cpCount][];
            int[] cpSingle = new int[cpCount];

            for (int i = 1; i < cpCount; i++) {
                int tag = c.u1();
                cpTag[i] = tag;
                switch (tag) {
                    case 1 -> utf8[i] = c.utf8();
                    case 3, 4 -> c.skip(4);
                    case 5, 6 -> {
                        c.skip(8);
                        i++;
                    }
                    case 7, 8, 16, 19, 20 -> cpSingle[i] = c.u2();
                    case 9, 10, 11, 12, 18, 17 -> cpPair[i] = new int[] {c.u2(), c.u2()};
                    case 15 -> {
                        c.u1();
                        c.u2();
                    }
                    default -> throw new IllegalStateException("Unsupported constant pool tag " + tag);
                }
            }

            c.u2();
            int thisClassIndex = c.u2();
            int superClassIndex = c.u2();

            int interfacesCount = c.u2();
            c.skip(interfacesCount * 2);

            List<FieldInfo> fields = new ArrayList<>();
            int fieldsCount = c.u2();
            for (int i = 0; i < fieldsCount; i++) {
                fields.add(FieldInfo.parse(c));
            }

            int methodsCountOffset = c.position;
            List<MethodInfo> methods = new ArrayList<>();
            int methodsCount = c.u2();
            for (int i = 0; i < methodsCount; i++) {
                methods.add(MethodInfo.parse(c));
            }

            return new ClassFile(bytes, utf8, cpTag, cpPair, cpSingle, thisClassIndex, superClassIndex, fields, methods, methodsCountOffset);
        }

        boolean isAlreadyPatched() {
            MethodInfo target = this.findBoundsMethod();
            AttributeInfo code = target.findCodeAttribute(this.utf8);
            if (code == null) {
                throw new IllegalStateException("Target method has no Code attribute");
            }

            int codeLength = readU4(this.bytes, code.infoOffset + 4);
            int codeOffset = code.infoOffset + 8;
            return codeLength > 1 || this.bytes[codeOffset] != (byte) 0xB1;
        }

        String describeBoundsMethod() {
            MethodInfo target = this.findBoundsMethod();
            AttributeInfo code = target.findCodeAttribute(this.utf8);
            int codeLength = code == null ? -1 : readU4(this.bytes, code.infoOffset + 4);
            String methodName = this.utf8[target.nameIndex];
            return methodName + " codeLength=" + codeLength;
        }

        byte[] patchEmptyBoundsMethod() throws IOException {
            MethodInfo target = this.findBoundsMethod();
            AttributeInfo code = target.findCodeAttribute(this.utf8);
            if (code == null) {
                throw new IllegalStateException("Target method has no Code attribute");
            }

            DuplicateLayout layout = this.findDuplicateLayout();

            int fieldX = this.findFieldRef(this.superClassName, "x", "F");
            int fieldY = this.findFieldRef(this.superClassName, "y", "F");
            int fieldWidth = this.findFieldRef(this.superClassName, "width", "F");
            int fieldHeight = this.findFieldRef(this.superClassName, "height", "F");
            int dupHeight = this.findFieldRef(this.thisClassName, layout.heightName, "F");
            int dupX = this.findFieldRef(this.thisClassName, layout.xName, "F");
            int dupY = this.findFieldRef(this.thisClassName, layout.yName, "F");
            int dupWidth = this.findFieldRef(this.thisClassName, layout.widthName, "F");

            ByteArray out = new ByteArray(this.bytes.length + 96);
            out.write(this.bytes, 0, code.attributeStart);
            writeU2(out, code.nameIndex);

            ByteArray codeInfo = new ByteArray(96);
            writeU2(codeInfo, 2);
            writeU2(codeInfo, 5);

            byte[] instructions = new byte[] {
                0x2A, 0x23, (byte) 0xB5, hi(fieldX), lo(fieldX),
                0x2A, 0x24, (byte) 0xB5, hi(fieldY), lo(fieldY),
                0x2A, 0x25, (byte) 0xB5, hi(fieldWidth), lo(fieldWidth),
                0x2A, 0x17, 0x04, (byte) 0xB5, hi(fieldHeight), lo(fieldHeight),
                0x2A, 0x17, 0x04, (byte) 0xB5, hi(dupHeight), lo(dupHeight),
                0x2A, 0x23, (byte) 0xB5, hi(dupX), lo(dupX),
                0x2A, 0x24, (byte) 0xB5, hi(dupY), lo(dupY),
                0x2A, 0x25, (byte) 0xB5, hi(dupWidth), lo(dupWidth),
                (byte) 0xB1
            };

            writeU4(codeInfo, instructions.length);
            codeInfo.write(instructions, 0, instructions.length);
            writeU2(codeInfo, 0);
            writeU2(codeInfo, 0);

            writeU4(out, codeInfo.size());
            out.write(codeInfo.toByteArray(), 0, codeInfo.size());
            out.write(this.bytes, code.attributeEnd, this.bytes.length - code.attributeEnd);
            return out.toByteArray();
        }

        private MethodInfo findBoundsMethod() {
            MethodInfo target = null;
            for (MethodInfo method : this.methods) {
                String desc = this.utf8[method.descriptorIndex];
                if ("(FFFF)V".equals(desc)) {
                    if (target != null) {
                        throw new IllegalStateException("Multiple 4-float void methods found");
                    }
                    target = method;
                }
            }
            if (target == null) {
                throw new IllegalStateException("Bounds method not found");
            }
            return target;
        }

        private DuplicateLayout findDuplicateLayout() {
            List<FieldInfo> instanceFields = new ArrayList<>();
            for (FieldInfo field : this.fields) {
                if ((field.accessFlags & 0x0008) == 0) {
                    instanceFields.add(field);
                }
            }

            for (int i = 0; i + 4 < instanceFields.size(); i++) {
                FieldInfo height = instanceFields.get(i);
                FieldInfo screen = instanceFields.get(i + 1);
                FieldInfo x = instanceFields.get(i + 2);
                FieldInfo y = instanceFields.get(i + 3);
                FieldInfo width = instanceFields.get(i + 4);
                if ("F".equals(this.utf8[height.descriptorIndex])
                    && "Lru/destra/gui/ClickGuiScreen;".equals(this.utf8[screen.descriptorIndex])
                    && "F".equals(this.utf8[x.descriptorIndex])
                    && "F".equals(this.utf8[y.descriptorIndex])
                    && "F".equals(this.utf8[width.descriptorIndex])) {
                    return new DuplicateLayout(
                        this.utf8[height.nameIndex],
                        this.utf8[y.nameIndex],
                        this.utf8[x.nameIndex],
                        this.utf8[width.nameIndex]
                    );
                }
            }

            throw new IllegalStateException("Duplicate layout fields not found");
        }

        private int findFieldRef(String owner, String name, String descriptor) {
            for (int i = 1; i < this.cpTag.length; i++) {
                if (this.cpTag[i] != 9) {
                    continue;
                }

                int classIndex = this.cpPair[i][0];
                int nameAndTypeIndex = this.cpPair[i][1];
                String fieldOwner = this.className(classIndex);
                int[] nt = this.cpPair[nameAndTypeIndex];
                String fieldName = this.utf8[nt[0]];
                String fieldDesc = this.utf8[nt[1]];
                if (owner.equals(fieldOwner) && name.equals(fieldName) && descriptor.equals(fieldDesc)) {
                    return i;
                }
            }
            throw new IllegalStateException("Fieldref not found: " + owner + "." + name + ":" + descriptor);
        }

        private String className(int classIndex) {
            return this.utf8[this.cpSingle[classIndex]];
        }

        private static int readU4(byte[] bytes, int offset) {
            return ((bytes[offset] & 0xFF) << 24)
                | ((bytes[offset + 1] & 0xFF) << 16)
                | ((bytes[offset + 2] & 0xFF) << 8)
                | (bytes[offset + 3] & 0xFF);
        }

        private static byte hi(int value) {
            return (byte) ((value >>> 8) & 0xFF);
        }

        private static byte lo(int value) {
            return (byte) (value & 0xFF);
        }
    }

    private record DuplicateLayout(String heightName, String xName, String yName, String widthName) {
    }

    private static final class FieldInfo {
        private final int accessFlags;
        private final int nameIndex;
        private final int descriptorIndex;

        private FieldInfo(int accessFlags, int nameIndex, int descriptorIndex) {
            this.accessFlags = accessFlags;
            this.nameIndex = nameIndex;
            this.descriptorIndex = descriptorIndex;
        }

        static FieldInfo parse(Cursor c) {
            int access = c.u2();
            int name = c.u2();
            int desc = c.u2();
            int attrs = c.u2();
            for (int i = 0; i < attrs; i++) {
                c.skipAttribute();
            }
            return new FieldInfo(access, name, desc);
        }
    }

    private static final class MethodInfo {
        private final int nameIndex;
        private final int descriptorIndex;
        private final List<AttributeInfo> attributes;

        private MethodInfo(int nameIndex, int descriptorIndex, List<AttributeInfo> attributes) {
            this.nameIndex = nameIndex;
            this.descriptorIndex = descriptorIndex;
            this.attributes = attributes;
        }

        static MethodInfo parse(Cursor c) {
            c.u2();
            int name = c.u2();
            int desc = c.u2();
            int attrCount = c.u2();
            List<AttributeInfo> attrs = new ArrayList<>(attrCount);
            for (int i = 0; i < attrCount; i++) {
                attrs.add(AttributeInfo.parse(c));
            }
            return new MethodInfo(name, desc, attrs);
        }

        AttributeInfo findCodeAttribute(String[] utf8) {
            for (AttributeInfo attribute : this.attributes) {
                if ("Code".equals(utf8[attribute.nameIndex])) {
                    return attribute;
                }
            }
            return null;
        }
    }

    private static final class AttributeInfo {
        private final int attributeStart;
        private final int nameIndex;
        private final int infoOffset;
        private final int attributeEnd;

        private AttributeInfo(int attributeStart, int nameIndex, int infoOffset, int attributeEnd) {
            this.attributeStart = attributeStart;
            this.nameIndex = nameIndex;
            this.infoOffset = infoOffset;
            this.attributeEnd = attributeEnd;
        }

        static AttributeInfo parse(Cursor c) {
            int start = c.position;
            int nameIndex = c.u2();
            int length = c.u4();
            int infoOffset = c.position;
            c.skip(length);
            return new AttributeInfo(start, nameIndex, infoOffset, c.position);
        }
    }

    private static final class Cursor {
        private final byte[] bytes;
        private int position;

        private Cursor(byte[] bytes) {
            this.bytes = bytes;
        }

        int u1() {
            return this.bytes[this.position++] & 0xFF;
        }

        int u2() {
            int value = ((this.bytes[this.position] & 0xFF) << 8) | (this.bytes[this.position + 1] & 0xFF);
            this.position += 2;
            return value;
        }

        int u4() {
            int value = ((this.bytes[this.position] & 0xFF) << 24)
                | ((this.bytes[this.position + 1] & 0xFF) << 16)
                | ((this.bytes[this.position + 2] & 0xFF) << 8)
                | (this.bytes[this.position + 3] & 0xFF);
            this.position += 4;
            return value;
        }

        String utf8() {
            int length = this.u2();
            String value = new String(this.bytes, this.position, length, java.nio.charset.StandardCharsets.UTF_8);
            this.position += length;
            return value;
        }

        void skip(int count) {
            this.position += count;
        }

        void skipAttribute() {
            this.u2();
            int length = this.u4();
            this.skip(length);
        }
    }

    private static final class ByteArray {
        private byte[] bytes;
        private int size;

        private ByteArray(int capacity) {
            this.bytes = new byte[capacity];
        }

        void write(byte[] src, int offset, int length) {
            this.ensureCapacity(this.size + length);
            System.arraycopy(src, offset, this.bytes, this.size, length);
            this.size += length;
        }

        void write(byte value) {
            this.ensureCapacity(this.size + 1);
            this.bytes[this.size++] = value;
        }

        int size() {
            return this.size;
        }

        byte[] toByteArray() {
            byte[] copy = new byte[this.size];
            System.arraycopy(this.bytes, 0, copy, 0, this.size);
            return copy;
        }

        private void ensureCapacity(int wanted) {
            if (wanted <= this.bytes.length) {
                return;
            }
            int next = Math.max(wanted, this.bytes.length * 2);
            byte[] grown = new byte[next];
            System.arraycopy(this.bytes, 0, grown, 0, this.size);
            this.bytes = grown;
        }
    }

    private static void writeU2(ByteArray out, int value) {
        out.write((byte) ((value >>> 8) & 0xFF));
        out.write((byte) (value & 0xFF));
    }

    private static void writeU4(ByteArray out, int value) {
        out.write((byte) ((value >>> 24) & 0xFF));
        out.write((byte) ((value >>> 16) & 0xFF));
        out.write((byte) ((value >>> 8) & 0xFF));
        out.write((byte) (value & 0xFF));
    }
}
