import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchMixinConstantsRaw {
    static final Map<String, Map<String, Object>> PATCHES = new LinkedHashMap<>();

    static {
        PATCHES.put("sg/mx/GameRendererMixin", new LinkedHashMap<>());
        PATCHES.get("sg/mx/GameRendererMixin").put("\u0448\u0421\u0420", 0.017453292F);
        PATCHES.get("sg/mx/GameRendererMixin").put("\u0448\u0421\u044a", 0.05F);

        PATCHES.put("sg/mx/OverlayTextureMixin", new LinkedHashMap<>());
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u041e", 0.0F);
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u042d", -255.0F);
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u0447", 0.5F);

        PATCHES.put("ru/destra/module/AspectRatioModule", new LinkedHashMap<>());
        PATCHES.get("ru/destra/module/AspectRatioModule").put("\u0431\u0435", "16:9");
        PATCHES.get("ru/destra/module/AspectRatioModule").put("\u0431\u0438", "4:3");
        PATCHES.get("ru/destra/module/AspectRatioModule").put("\u0431\u5f1f", "21:9");
        PATCHES.get("ru/destra/module/AspectRatioModule").put("\u0431\u0447", "16:10");
        PATCHES.get("ru/destra/module/AspectRatioModule").put("\u0431\u041e", "\u041a\u0430\u0441\u0442\u043e\u043c");
    }

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        for (Map.Entry<String, Map<String, Object>> entry : PATCHES.entrySet()) {
            String className = entry.getKey();
            String filePath = ".precompiled/" + className.replace('/', File.separatorChar) + ".class";
            Path classPath = Path.of(filePath);
            if (!Files.exists(classPath)) {
                System.out.println("NOT FOUND: " + filePath);
                continue;
            }

            byte[] data = Files.readAllBytes(classPath);

            // Parse constant pool to find field name UTF8 entries and fieldref entries
            CpInfo cp = new CpInfo(data);

            // Find <clinit> method
            int clinitOffset = findClinit(data, cp);
            if (clinitOffset < 0) {
                System.out.println("  No <clinit> in " + className);
                continue;
            }

            // Read method: access(2) name_idx(2) desc_idx(2) attr_count(2) [attrs...]
            int pos = clinitOffset;
            int access = u2(data, pos); pos += 2;
            int nameIdx = u2(data, pos); pos += 2;
            int descIdx = u2(data, pos); pos += 2;
            int attrCount = u2(data, pos); pos += 2;

            // Find Code attribute
            int codeAttrOffset = -1;
            for (int i = 0; i < attrCount; i++) {
                int attrNameIdx = u2(data, pos);
                int attrLen = u4(data, pos + 2);
                String attrName = cp.utf8(attrNameIdx);
                if ("Code".equals(attrName)) {
                    codeAttrOffset = pos;
                    break;
                }
                pos += 6 + attrLen;
            }
            if (codeAttrOffset < 0) {
                System.out.println("  No Code attribute in <clinit> of " + className);
                continue;
            }

            // Code attribute: attrNameIdx(2) attrLen(4) maxStack(2) maxLocals(2) codeLen(4) code[codeLen] ...
            int codeContentStart = codeAttrOffset + 6;
            int maxStack = u2(data, codeContentStart);
            int maxLocals = u2(data, codeContentStart + 2);
            int codeLen = u4(data, codeContentStart + 4);
            int codeStart = codeContentStart + 8;
            byte[] code = new byte[codeLen];
            System.arraycopy(data, codeStart, code, 0, codeLen);

            // Find existing PUTSTATIC instructions for our fields and remove them
            // Also find the RETURN instruction
            int returnOffset = -1;
            List<int[]> existingPuts = new ArrayList<>(); // {offset in code, length to remove}

            int ip = 0;
            while (ip < codeLen) {
                int op = code[ip] & 0xFF;
                if (op == 0xB3) { // PUTSTATIC
                    int fieldIdx = u2(code, ip + 1);
                    String[] fieldRef = cp.fieldref(fieldIdx);
                    if (fieldRef != null) {
                        String fieldName = fieldRef[1];
                        if (entry.getValue().containsKey(fieldName)) {
                            existingPuts.add(new int[]{ip, 3});
                            // Also check if preceded by LDC (0x12) or LDC_W (0x13)
                            if (ip > 0 && (code[ip-1] & 0xFF) == 0x12) {
                                existingPuts.get(existingPuts.size()-1)[0] = ip - 2;
                                existingPuts.get(existingPuts.size()-1)[1] = 5;
                            } else if (ip > 0 && (code[ip-1] & 0xFF) == 0x13) {
                                existingPuts.get(existingPuts.size()-1)[0] = ip - 3;
                                existingPuts.get(existingPuts.size()-1)[1] = 6;
                            }
                        }
                    }
                    ip += 3;
                } else if (op == 0xB1) { // RETURN
                    returnOffset = ip;
                    ip += 1;
                } else if (op >= 0xC4) { // wide
                    ip += 4;
                } else if (op == 0x12) { // LDC
                    ip += 2;
                } else if (op == 0x13 || op == 0x14) { // LDC_W, LDC2_W
                    ip += 3;
                } else {
                    ip += 1;
                }
            }

            if (returnOffset < 0) {
                System.out.println("  No RETURN in <clinit> of " + className);
                continue;
            }

            // Remove existing field inits (go backwards to preserve offsets)
            existingPuts.sort((a, b) -> b[0] - a[0]);
            for (int[] rm : existingPuts) {
                int rmStart = rm[0];
                int rmLen = rm[1];
                byte[] newCode = new byte[codeLen - rmLen];
                System.arraycopy(code, 0, newCode, 0, rmStart);
                System.arraycopy(code, rmStart + rmLen, newCode, rmStart, codeLen - rmStart - rmLen);
                code = newCode;
                codeLen = code.length;
                returnOffset -= rmLen;
            }

            // Build new instructions: for each field, LDC + PUTSTATIC
            List<byte[]> newInsns = new ArrayList<>();
            int addedCount = 0;
            for (Map.Entry<String, Object> fe : entry.getValue().entrySet()) {
                String fieldName = fe.getKey();
                Object value = fe.getValue();
                String fieldDesc = findFieldDesc(data, cp, className, fieldName);
                if (fieldDesc == null) {
                    System.out.println("  Field " + fieldName + " not found in " + className);
                    continue;
                }

                // Add float/string constant to CP
                int ldcIdx;
                byte ldcOp;
                if (value instanceof Float) {
                    ldcIdx = cp.addFloat((Float) value);
                    ldcOp = 0x13; // LDC_W (safe for all indices)
                } else if (value instanceof String) {
                    ldcIdx = cp.addString((String) value);
                    ldcOp = 0x13;
                } else if (value instanceof Integer) {
                    ldcIdx = cp.addInteger((Integer) value);
                    ldcOp = 0x13;
                } else if (value instanceof Long) {
                    continue; // not used
                } else {
                    continue;
                }

                int fieldrefIdx = cp.addFieldref(className, fieldName, fieldDesc);

                // Build instruction bytes
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                bos.write(ldcOp);
                bos.write((ldcIdx >> 8) & 0xFF);
                bos.write(ldcIdx & 0xFF);
                bos.write(0xB3); // PUTSTATIC
                bos.write((fieldrefIdx >> 8) & 0xFF);
                bos.write(fieldrefIdx & 0xFF);
                newInsns.add(bos.toByteArray());
                addedCount++;
                System.out.println("  Added: " + className + "." + fieldName + " = " + value);
            }

            if (addedCount == 0) continue;

            // Insert new instructions before RETURN
            int insertLen = 0;
            for (byte[] ni : newInsns) insertLen += ni.length;

            byte[] finalCode = new byte[codeLen + insertLen];
            System.arraycopy(code, 0, finalCode, 0, returnOffset);
            int off = returnOffset;
            for (byte[] ni : newInsns) {
                System.arraycopy(ni, 0, finalCode, off, ni.length);
                off += ni.length;
            }
            System.arraycopy(code, returnOffset, finalCode, off, codeLen - returnOffset);

            // Rebuild the class file with modified constant pool and code
            byte[] cpBytes = cp.toByteArray();
            int newCodeLen = finalCode.length;

            // Rebuild: magic(4) + minor(2) + major(2) + cp_count(2) + cp + ...rest after cp...
            // The rest after cp starts at cp.endOffset
            int restStart = cp.endOffset;
            byte[] rest = new byte[data.length - restStart];
            System.arraycopy(data, restStart, rest, 0, rest.length);

            // We need to patch the code attribute in 'rest'
            // The code attribute is at codeAttrOffset, but that's relative to the original data
            // After CP changes, offsets shift. We need to recalculate.
            // Actually, it's easier to rebuild everything.

            // New file: magic + minor + major + new_cp + (rest up to clinit method) + modified clinit + (rest after clinit)
            // This is getting complex. Let me use a simpler approach: rebuild the entire file.

            // New constant pool
            int newCpCount = cp.count;

            // Build new file
            ByteArrayOutputStream newFile = new ByteArrayOutputStream();
            // magic
            newFile.write(data, 0, 4);
            // minor + major
            newFile.write(data, 4, 4);
            // cp_count
            newFile.write((newCpCount >> 8) & 0xFF);
            newFile.write(newCpCount & 0xFF);
            // cp bytes
            newFile.write(cpBytes);

            // Now we need to copy everything from restStart to the start of the class's method section
            // Then modify the <clinit> method's Code attribute

            // Parse the rest to find where <clinit> method is
            // After CP: access_flags(2) this_class(2) super_class(2) interfaces(2+n*2)
            // fields_count(2) fields... methods_count(2) methods... attributes_count(2) attributes...

            int rp = 0; // position in rest
            // access_flags
            int accessFlags = u2(rest, rp); rp += 2;
            // this_class
            int thisClass = u2(rest, rp); rp += 2;
            // super_class
            int superClass = u2(rest, rp); rp += 2;
            // interfaces
            int ifaceCount = u2(rest, rp); rp += 2;
            rp += ifaceCount * 2;

            // fields
            int fieldCount = u2(rest, rp); rp += 2;
            for (int i = 0; i < fieldCount; i++) {
                rp = skipMember(rest, rp);
            }

            // Write everything up to methods_count
            newFile.write(rest, 0, rp);

            // methods
            int methodCount = u2(rest, rp);
            newFile.write(rest, rp, 2);
            rp += 2;

            for (int i = 0; i < methodCount; i++) {
                int mAccess = u2(rest, rp);
                int mNameIdx = u2(rest, rp + 2);
                int mDescIdx = u2(rest, rp + 4);
                int mAttrCount = u2(rest, rp + 6);
                String mName = cp.utf8(mNameIdx);

                int mStart = rp;
                rp += 8; // access + name + desc + attrCount

                if ("<clinit>".equals(mName)) {
                    // Process this method's attributes, modifying the Code attribute
                    ByteArrayOutputStream methodBos = new ByteArrayOutputStream();
                    methodBos.write(rest, mStart, 8); // access + name + desc + attrCount

                    for (int j = 0; j < mAttrCount; j++) {
                        int aNameIdx = u2(rest, rp);
                        int aLen = u4(rest, rp + 2);
                        String aName = cp.utf8(aNameIdx);

                        if ("Code".equals(aName)) {
                            // Modify code attribute
                            int codeAttrStart = rp;
                            int maxSt = u2(rest, rp + 6);
                            int maxLo = u2(rest, rp + 8);
                            int oldCodeLen = u4(rest, rp + 10);

                            // Write attr name idx + new attr length
                            int newAttrDataLen = 2 + 2 + 4 + newCodeLen; // maxStack + maxLocals + codeLen + code
                            // Plus exception table and attributes
                            // Code attr layout: nameIdx(2) + len(4) + maxStack(2) + maxLocals(2) + codeLen(4) + code...
                            int excTableStart = rp + 14 + oldCodeLen;
                            int excTableLen = u2(rest, excTableStart);
                            int afterExc = excTableStart + 2 + excTableLen * 8;
                            int codeAttrCount = u2(rest, afterExc);
                            int codeAttrsStart = afterExc + 2;
                            int codeAttrsLen = 0;
                            for (int k = 0; k < codeAttrCount; k++) {
                                int caNameIdx = u2(rest, codeAttrsStart + codeAttrsLen);
                                int caLen = u4(rest, codeAttrsStart + codeAttrsLen + 2);
                                codeAttrsLen += 6 + caLen;
                            }

                            newAttrDataLen += 2 + excTableLen * 8 + 2 + codeAttrsLen;

                            methodBos.write(rest, rp, 2); // attr name idx
                            writeU4(methodBos, newAttrDataLen);
                            methodBos.write(rest, rp + 6, 2); // maxStack
                            methodBos.write(rest, rp + 8, 2); // maxLocals
                            writeU4(methodBos, newCodeLen); // new code length
                            methodBos.write(finalCode, 0, newCodeLen); // new code
                            // Copy exception table
                            methodBos.write(rest, excTableStart, 2 + excTableLen * 8);
                            // Copy code attributes
                            methodBos.write(rest, codeAttrsStart - 2, 2 + codeAttrsLen);

                            rp = codeAttrsStart + codeAttrsLen;
                        } else {
                            // Copy attribute as-is
                            methodBos.write(rest, rp, 6 + aLen);
                            rp += 6 + aLen;
                        }
                    }

                    newFile.write(methodBos.toByteArray());
                } else {
                    // Copy method as-is
                    for (int j = 0; j < mAttrCount; j++) {
                        int aNameIdx = u2(rest, rp);
                        int aLen = u4(rest, rp + 2);
                        rp += 6 + aLen;
                    }
                    newFile.write(rest, mStart, rp - mStart);
                }
            }

            // Copy class attributes
            int classAttrCount = u2(rest, rp);
            newFile.write(rest, rp, rest.length - rp);

            byte[] result = newFile.toByteArray();
            Files.write(classPath, result);
            System.out.println("  Written " + classPath + " (" + result.length + " bytes, " + addedCount + " field(s))");
        }
    }

    static int skipMember(byte[] data, int pos) {
        pos += 6; // access + name + desc
        int attrCount = u2(data, pos); pos += 2;
        for (int i = 0; i < attrCount; i++) {
            int attrLen = u4(data, pos + 2);
            pos += 6 + attrLen;
        }
        return pos;
    }

    static int findClinit(byte[] data, CpInfo cp) {
        int pos = 10; // after magic + version + cp_count
        // Skip constant pool
        pos = cp.endOffset;
        // access_flags, this_class, super_class
        pos += 6;
        // interfaces
        int ifaceCount = u2(data, pos); pos += 2 + ifaceCount * 2;
        // fields
        int fieldCount = u2(data, pos); pos += 2;
        for (int i = 0; i < fieldCount; i++) pos = skipMember(data, pos);
        // methods
        int methodCount = u2(data, pos); pos += 2;
        for (int i = 0; i < methodCount; i++) {
            int nameIdx = u2(data, pos + 2);
            String name = cp.utf8(nameIdx);
            if ("<clinit>".equals(name)) return pos;
            pos = skipMember(data, pos);
        }
        return -1;
    }

    static String findFieldDesc(byte[] data, CpInfo cp, String className, String fieldName) {
        int pos = 10;
        pos = cp.endOffset;
        pos += 6; // access + this + super
        int ifaceCount = u2(data, pos); pos += 2 + ifaceCount * 2;
        int fieldCount = u2(data, pos); pos += 2;
        for (int i = 0; i < fieldCount; i++) {
            int fAccess = u2(data, pos);
            int fNameIdx = u2(data, pos + 2);
            int fDescIdx = u2(data, pos + 4);
            String fName = cp.utf8(fNameIdx);
            String fDesc = cp.utf8(fDescIdx);
            if (fieldName.equals(fName)) return fDesc;
            pos = skipMember(data, pos);
        }
        return null;
    }

    static int u2(byte[] data, int pos) {
        return ((data[pos] & 0xFF) << 8) | (data[pos + 1] & 0xFF);
    }

    static int u4(byte[] data, int pos) {
        return ((data[pos] & 0xFF) << 24) | ((data[pos + 1] & 0xFF) << 16) | ((data[pos + 2] & 0xFF) << 8) | (data[pos + 3] & 0xFF);
    }

    static void writeU4(ByteArrayOutputStream bos, int val) {
        bos.write((val >> 24) & 0xFF);
        bos.write((val >> 16) & 0xFF);
        bos.write((val >> 8) & 0xFF);
        bos.write(val & 0xFF);
    }

    // Minimal constant pool parser/builder
    static class CpInfo {
        byte[] data;
        int count;
        int endOffset;
        List<byte[]> entries = new ArrayList<>(); // raw bytes for each entry (including tag)
        Map<String, Integer> utf8Cache = new HashMap<>();
        Map<Float, Integer> floatCache = new HashMap<>();
        Map<String, Integer> stringCache = new HashMap<>();
        Map<Integer, Integer> intCache = new HashMap<>();

        CpInfo(byte[] fileData) {
            data = fileData;
            count = u2(fileData, 8);
            int pos = 10;
            entries.add(null); // index 0 unused
            for (int i = 1; i < count; i++) {
                int tag = fileData[pos] & 0xFF;
                int entryLen;
                switch (tag) {
                    case 1: { int len = u2(fileData, pos + 1); entryLen = 3 + len; break; }
                    case 3: case 4: entryLen = 5; break;
                    case 5: case 6: entryLen = 9; i++; entries.add(null); break; // long/double take 2 slots
                    case 7: case 8: case 16: case 19: case 20: entryLen = 3; break;
                    case 15: entryLen = 4; break;
                    case 9: case 10: case 11: case 12: case 17: case 18: entryLen = 5; break;
                    default: throw new RuntimeException("Unknown CP tag " + tag + " at " + pos);
                }
                byte[] entry = new byte[entryLen];
                System.arraycopy(fileData, pos, entry, 0, entryLen);
                entries.add(entry);
                pos += entryLen;
            }
            endOffset = pos;
        }

        String utf8(int idx) {
            if (idx <= 0 || idx >= entries.size() || entries.get(idx) == null) return null;
            byte[] e = entries.get(idx);
            if (e[0] != 1) return null;
            int len = u2(e, 1);
            return new String(e, 3, len, StandardCharsets.UTF_8);
        }

        String[] fieldref(int idx) {
            if (idx <= 0 || idx >= entries.size() || entries.get(idx) == null) return null;
            byte[] e = entries.get(idx);
            if (e[0] != 9) return null;
            int classIdx = u2(e, 1);
            int natIdx = u2(e, 3);
            String cls = utf8FromClass(classIdx);
            String[] nat = nameAndType(natIdx);
            if (cls == null || nat == null) return null;
            return new String[]{cls, nat[0], nat[1]};
        }

        String utf8FromClass(int idx) {
            if (idx <= 0 || idx >= entries.size() || entries.get(idx) == null) return null;
            byte[] e = entries.get(idx);
            if (e[0] != 7) return null;
            int nameIdx = u2(e, 1);
            return utf8(nameIdx);
        }

        String[] nameAndType(int idx) {
            if (idx <= 0 || idx >= entries.size() || entries.get(idx) == null) return null;
            byte[] e = entries.get(idx);
            if (e[0] != 12) return null;
            int nameIdx = u2(e, 1);
            int descIdx = u2(e, 3);
            return new String[]{utf8(nameIdx), utf8(descIdx)};
        }

        int addUtf8(String s) {
            if (utf8Cache.containsKey(s)) return utf8Cache.get(s);
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            byte[] entry = new byte[3 + bytes.length];
            entry[0] = 1;
            entry[1] = (byte) ((bytes.length >> 8) & 0xFF);
            entry[2] = (byte) (bytes.length & 0xFF);
            System.arraycopy(bytes, 0, entry, 3, bytes.length);
            int idx = entries.size();
            entries.add(entry);
            utf8Cache.put(s, idx);
            count++;
            return idx;
        }

        int addFloat(float v) {
            if (floatCache.containsKey(v)) return floatCache.get(v);
            int bits = Float.floatToRawIntBits(v);
            byte[] entry = new byte[5];
            entry[0] = 4;
            entry[1] = (byte) ((bits >> 24) & 0xFF);
            entry[2] = (byte) ((bits >> 16) & 0xFF);
            entry[3] = (byte) ((bits >> 8) & 0xFF);
            entry[4] = (byte) (bits & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            floatCache.put(v, idx);
            count++;
            return idx;
        }

        int addInteger(int v) {
            if (intCache.containsKey(v)) return intCache.get(v);
            byte[] entry = new byte[5];
            entry[0] = 3;
            entry[1] = (byte) ((v >> 24) & 0xFF);
            entry[2] = (byte) ((v >> 16) & 0xFF);
            entry[3] = (byte) ((v >> 8) & 0xFF);
            entry[4] = (byte) (v & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            intCache.put(v, idx);
            count++;
            return idx;
        }

        int addString(String s) {
            if (stringCache.containsKey(s)) return stringCache.get(s);
            int utf8Idx = addUtf8(s);
            byte[] entry = new byte[3];
            entry[0] = 8;
            entry[1] = (byte) ((utf8Idx >> 8) & 0xFF);
            entry[2] = (byte) (utf8Idx & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            stringCache.put(s, idx);
            count++;
            return idx;
        }

        int addNameAndType(int nameIdx, int descIdx) {
            byte[] entry = new byte[5];
            entry[0] = 12;
            entry[1] = (byte) ((nameIdx >> 8) & 0xFF);
            entry[2] = (byte) (nameIdx & 0xFF);
            entry[3] = (byte) ((descIdx >> 8) & 0xFF);
            entry[4] = (byte) (descIdx & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            count++;
            return idx;
        }

        int addClass(int utf8Idx) {
            byte[] entry = new byte[3];
            entry[0] = 7;
            entry[1] = (byte) ((utf8Idx >> 8) & 0xFF);
            entry[2] = (byte) (utf8Idx & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            count++;
            return idx;
        }

        int addFieldref(String className, String fieldName, String desc) {
            int classUtf8Idx = addUtf8(className);
            int classIdx = addClass(classUtf8Idx);
            int nameUtf8Idx = addUtf8(fieldName);
            int descUtf8Idx = addUtf8(desc);
            int natIdx = addNameAndType(nameUtf8Idx, descUtf8Idx);
            byte[] entry = new byte[5];
            entry[0] = 9;
            entry[1] = (byte) ((classIdx >> 8) & 0xFF);
            entry[2] = (byte) (classIdx & 0xFF);
            entry[3] = (byte) ((natIdx >> 8) & 0xFF);
            entry[4] = (byte) (natIdx & 0xFF);
            int idx = entries.size();
            entries.add(entry);
            count++;
            return idx;
        }

        byte[] toByteArray() {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int i = 1; i < entries.size(); i++) {
                byte[] e = entries.get(i);
                if (e != null) bos.write(e, 0, e.length);
            }
            return bos.toByteArray();
        }
    }
}
