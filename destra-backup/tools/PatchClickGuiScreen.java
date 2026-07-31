import java.nio.file.*;
import java.util.*;

public final class PatchClickGuiScreen {
    private static final int CP_START = 10;
    private static final int FIELD_NAMESPACE_UTF = 1656;
    private static final int FIELD_PATH_UTF = 1658;

    public static void main(String[] args) throws Exception {
        if (args.length != 1) throw new IllegalArgumentException("Expected class file path");
        Path classFile = Path.of(args[0]);
        byte[] data = Files.readAllBytes(classFile);

        int cpCount = u2(data, 8);
        int cpEnd = findConstantPoolEnd(data, cpCount);

        int ntIdx = findNameAndType(data, cpCount, "staticInit", "()V");
        int mrIdx = ntIdx > 0 ? findMethodrefForClass(data, cpCount, ntIdx, "ru/destra/gui/ClickGuiScreen") : -1;

        if (mrIdx > 0) {
            System.out.println("Already patched (methodref at CP #" + mrIdx + ")");
            return;
        }

        int thisClassIdx = u2(data, cpEnd + 2);

        List<byte[]> newEntries = new ArrayList<>();
        int newCpCount = cpCount;

        int nameUtfIdx = findUtf8(data, cpCount, "staticInit");
        if (nameUtfIdx < 0) { newEntries.add(makeUtf8("staticInit")); nameUtfIdx = newCpCount; newCpCount++; }

        int descUtfIdx = findUtf8(data, cpCount, "()V");
        if (descUtfIdx < 0) { newEntries.add(makeUtf8("()V")); descUtfIdx = newCpCount; newCpCount++; }

        if (ntIdx < 0) {
            newEntries.add(makeNameAndType(nameUtfIdx, descUtfIdx));
            ntIdx = newCpCount;
            newCpCount++;
        }

        newEntries.add(makeMethodref(thisClassIdx, ntIdx));
        mrIdx = newCpCount;
        newCpCount++;

        int namespaceUtfIdx = findUtf8(data, cpCount, "destra");
        if (namespaceUtfIdx < 0) { newEntries.add(makeUtf8("destra")); namespaceUtfIdx = newCpCount; newCpCount++; }

        int logoPathUtfIdx = findUtf8(data, cpCount, "images/logoup.png");
        if (logoPathUtfIdx < 0) { newEntries.add(makeUtf8("images/logoup.png")); logoPathUtfIdx = newCpCount; newCpCount++; }

        int stringDescUtfIdx = findUtf8(data, cpCount, "Ljava/lang/String;");
        if (stringDescUtfIdx < 0) { newEntries.add(makeUtf8("Ljava/lang/String;")); stringDescUtfIdx = newCpCount; newCpCount++; }

        int nsNtIdx = findNameAndTypeByIndices(data, cpCount, FIELD_NAMESPACE_UTF, stringDescUtfIdx);
        if (nsNtIdx < 0) { newEntries.add(makeNameAndType(FIELD_NAMESPACE_UTF, stringDescUtfIdx)); nsNtIdx = newCpCount; newCpCount++; }

        int nsFieldrefIdx = findFieldref(data, cpCount, thisClassIdx, nsNtIdx);
        if (nsFieldrefIdx < 0) { newEntries.add(makeFieldref(thisClassIdx, nsNtIdx)); nsFieldrefIdx = newCpCount; newCpCount++; }

        int pathNtIdx = findNameAndTypeByIndices(data, cpCount, FIELD_PATH_UTF, stringDescUtfIdx);
        if (pathNtIdx < 0) { newEntries.add(makeNameAndType(FIELD_PATH_UTF, stringDescUtfIdx)); pathNtIdx = newCpCount; newCpCount++; }

        int pathFieldrefIdx = findFieldref(data, cpCount, thisClassIdx, pathNtIdx);
        if (pathFieldrefIdx < 0) { newEntries.add(makeFieldref(thisClassIdx, pathNtIdx)); pathFieldrefIdx = newCpCount; newCpCount++; }

        int codeLenOffset = findClinitCodeLengthOffset(data, cpCount, cpEnd);
        if (codeLenOffset < 0) {
            System.err.println("DEBUG cpCount=" + cpCount + " cpEnd=" + cpEnd);
            debugFindClinit(data, cpCount, cpEnd);
            throw new IllegalStateException("Cannot find <clinit> code_length");
        }
        int oldCodeLen = u4(data, codeLenOffset);
        int returnOffset = codeLenOffset + 4 + oldCodeLen - 1;
        if (data[returnOffset] != (byte) 0xB1) throw new IllegalStateException("Expected return at " + returnOffset);

        int injectedBytes = 3 + 3 + 3 + 3 + 3;
        int newCodeLen = oldCodeLen + injectedBytes;

        int totalNewBytes = 0;
        for (byte[] e : newEntries) totalNewBytes += e.length;

        byte[] patched = new byte[data.length + injectedBytes + totalNewBytes];
        int wPos = 0;

        System.arraycopy(data, 0, patched, wPos, cpEnd);
        wPos += cpEnd;
        patched[8] = (byte) ((newCpCount >>> 8) & 0xFF);
        patched[9] = (byte) (newCpCount & 0xFF);

        for (byte[] e : newEntries) {
            System.arraycopy(e, 0, patched, wPos, e.length);
            wPos += e.length;
        }

        System.arraycopy(data, cpEnd, patched, wPos, returnOffset - cpEnd);
        wPos += returnOffset - cpEnd;

        int codeLenAdj = codeLenOffset + totalNewBytes;
        patched[codeLenAdj]     = (byte) ((newCodeLen >>> 24) & 0xFF);
        patched[codeLenAdj + 1] = (byte) ((newCodeLen >>> 16) & 0xFF);
        patched[codeLenAdj + 2] = (byte) ((newCodeLen >>> 8) & 0xFF);
        patched[codeLenAdj + 3] = (byte) (newCodeLen & 0xFF);

        int attrLenOffset = codeLenOffset - 8 + totalNewBytes;
        int oldAttrLen = u4(patched, attrLenOffset);
        int newAttrLen = oldAttrLen + injectedBytes;
        patched[attrLenOffset]     = (byte) ((newAttrLen >>> 24) & 0xFF);
        patched[attrLenOffset + 1] = (byte) ((newAttrLen >>> 16) & 0xFF);
        patched[attrLenOffset + 2] = (byte) ((newAttrLen >>> 8) & 0xFF);
        patched[attrLenOffset + 3] = (byte) (newAttrLen & 0xFF);

        patched[wPos]     = (byte) 0x13;
        patched[wPos + 1] = (byte) ((namespaceUtfIdx >>> 8) & 0xFF);
        patched[wPos + 2] = (byte) (namespaceUtfIdx & 0xFF);
        patched[wPos + 3]     = (byte) 0xB3;
        patched[wPos + 4] = (byte) ((nsFieldrefIdx >>> 8) & 0xFF);
        patched[wPos + 5] = (byte) (nsFieldrefIdx & 0xFF);
        patched[wPos + 6]     = (byte) 0x13;
        patched[wPos + 7] = (byte) ((logoPathUtfIdx >>> 8) & 0xFF);
        patched[wPos + 8] = (byte) (logoPathUtfIdx & 0xFF);
        patched[wPos + 9]     = (byte) 0xB3;
        patched[wPos + 10] = (byte) ((pathFieldrefIdx >>> 8) & 0xFF);
        patched[wPos + 11] = (byte) (pathFieldrefIdx & 0xFF);
        patched[wPos + 12]    = (byte) 0xB8;
        patched[wPos + 13] = (byte) ((mrIdx >>> 8) & 0xFF);
        patched[wPos + 14] = (byte) (mrIdx & 0xFF);
        patched[wPos + 15]    = (byte) 0xB1;
        wPos += 16;

        System.arraycopy(data, returnOffset + 1, patched, wPos, data.length - returnOffset - 1);

        Files.write(classFile, patched);
        System.out.println("Patched: nsFieldref=CP#" + nsFieldrefIdx + " pathFieldref=CP#" + pathFieldrefIdx
            + " methodref=CP#" + mrIdx
            + ", code_length=" + oldCodeLen + "->" + newCodeLen + ", file=" + data.length + "->" + patched.length);
    }

    static int findUtf8(byte[] data, int cpCount, String value) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (tag == 1) {
                int len = u2(data, pos);
                if (len == value.length()) {
                    boolean ok = true;
                    for (int j = 0; j < len; j++) {
                        if (data[pos + 2 + j] != (byte) value.charAt(j)) { ok = false; break; }
                    }
                    if (ok) return i;
                }
                pos += 2 + len;
            } else {
                pos += cpPayload(data, pos, tag);
                if (tag == 5 || tag == 6) i++;
            }
        }
        return -1;
    }

    static int findNameAndType(byte[] data, int cpCount, String name, String desc) {
        int nameIdx = findUtf8(data, cpCount, name);
        int descIdx = findUtf8(data, cpCount, desc);
        if (nameIdx < 0 || descIdx < 0) return -1;
        return findNameAndTypeByIndices(data, cpCount, nameIdx, descIdx);
    }

    static int findNameAndTypeByIndices(byte[] data, int cpCount, int nameIdx, int descIdx) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (tag == 12 && u2(data, pos) == nameIdx && u2(data, pos + 2) == descIdx) return i;
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return -1;
    }

    static int findFieldref(byte[] data, int cpCount, int classIdx, int ntIdx) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (tag == 9 && u2(data, pos) == classIdx && u2(data, pos + 2) == ntIdx) return i;
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return -1;
    }

    static int findMethodrefForClass(byte[] data, int cpCount, int ntIdx, String className) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (tag == 10 && u2(data, pos + 2) == ntIdx) {
                int clsIdx = u2(data, pos);
                int nameIdx = resolveClassToUtf8(data, cpCount, clsIdx);
                if (nameIdx > 0 && isUtf8At(data, cpCount, nameIdx, className)) return i;
            }
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return -1;
    }

    static int resolveClassToUtf8(byte[] data, int cpCount, int classIdx) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (i == classIdx && tag == 7) {
                return u2(data, pos);
            }
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return -1;
    }

    static boolean isUtf8At(byte[] data, int cpCount, int idx, String value) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            if (i == idx) {
                if (tag != 1) return false;
                int len = u2(data, pos);
                if (len != value.length()) return false;
                for (int j = 0; j < len; j++) {
                    if (data[pos + 2 + j] != (byte) value.charAt(j)) return false;
                }
                return true;
            }
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return false;
    }

    static void debugFindClinit(byte[] data, int cpCount, int cpEnd) {
        int pos = cpEnd;
        System.err.println("DEBUG: cpEnd=" + cpEnd + " access_flags=" + u2(data, pos) + " this_class=" + u2(data, pos+2) + " super_class=" + u2(data, pos+4));
        pos += 6;
        int ifCount = u2(data, pos); pos += 2 + ifCount * 2;
        int fCount = u2(data, pos); pos += 2;
        System.err.println("DEBUG: fields=" + fCount);
        for (int i = 0; i < fCount; i++) pos = skipMember(data, pos);
        int mCount = u2(data, pos); pos += 2;
        System.err.println("DEBUG: methods=" + mCount + " methodsStart=" + pos);
        for (int i = 0; i < mCount; i++) {
            int access = u2(data, pos);
            int nameIdx = u2(data, pos + 2);
            int descIdx = u2(data, pos + 4);
            int attrCount = u2(data, pos + 6);
            boolean isClinit = isUtf8At(data, cpCount, nameIdx, "<clinit>");
            if (i >= mCount - 5 || isClinit) {
                System.err.println("DEBUG: method[" + i + "] pos=" + pos + " nameIdx=" + nameIdx + " descIdx=" + descIdx + " attrs=" + attrCount + " clinit=" + isClinit);
            }
            pos = skipMember(data, pos);
        }
    }

    static int findClinitCodeLengthOffset(byte[] data, int cpCount, int cpEnd) {
        int pos = cpEnd;
        pos += 6;
        int ifCount = u2(data, pos); pos += 2 + ifCount * 2;
        int fCount = u2(data, pos); pos += 2;
        for (int i = 0; i < fCount; i++) pos = skipMember(data, pos);
        int mCount = u2(data, pos); pos += 2;
        for (int i = 0; i < mCount; i++) {
            int nameIdx = u2(data, pos + 2);
            if (isUtf8At(data, cpCount, nameIdx, "<clinit>")) {
                int attrCount = u2(data, pos + 6);
                int aPos = pos + 8;
                for (int j = 0; j < attrCount; j++) {
                    int attrNameIdx = u2(data, aPos);
                    int attrLen = u4(data, aPos + 2);
                    if (isUtf8At(data, cpCount, attrNameIdx, "Code")) {
                        return aPos + 10;
                    }
                    aPos += 6 + attrLen;
                }
                break;
            }
            pos = skipMember(data, pos);
        }
        return -1;
    }

    static int findConstantPoolEnd(byte[] data, int cpCount) {
        int pos = CP_START;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return pos;
    }

    static int cpPayload(byte[] data, int pos, int tag) {
        return switch (tag) {
            case 1 -> 2 + u2(data, pos);
            case 3, 4 -> 4;
            case 5, 6 -> 8;
            case 7, 8, 16, 19, 20 -> 2;
            case 9, 10, 11, 12, 17, 18 -> 4;
            case 15 -> 3;
            default -> throw new IllegalStateException("Unknown CP tag " + tag);
        };
    }

    static int skipMember(byte[] data, int pos) {
        pos += 6;
        int ac = u2(data, pos); pos += 2;
        for (int i = 0; i < ac; i++) { pos += 2; int l = u4(data, pos); pos += 4 + l; }
        return pos;
    }

    static byte[] makeUtf8(String v) {
        byte[] b = v.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        byte[] r = new byte[3 + b.length];
        r[0] = 1; r[1] = (byte) ((b.length >> 8) & 0xFF); r[2] = (byte) (b.length & 0xFF);
        System.arraycopy(b, 0, r, 3, b.length);
        return r;
    }

    static byte[] makeNameAndType(int n, int d) {
        return new byte[]{12, (byte) ((n >> 8) & 0xFF), (byte) (n & 0xFF), (byte) ((d >> 8) & 0xFF), (byte) (d & 0xFF)};
    }

    static byte[] makeFieldref(int c, int nt) {
        return new byte[]{9, (byte) ((c >> 8) & 0xFF), (byte) (c & 0xFF), (byte) ((nt >> 8) & 0xFF), (byte) (nt & 0xFF)};
    }

    static byte[] makeMethodref(int c, int nt) {
        return new byte[]{10, (byte) ((c >> 8) & 0xFF), (byte) (c & 0xFF), (byte) ((nt >> 8) & 0xFF), (byte) (nt & 0xFF)};
    }

    static int u2(byte[] d, int p) { return ((d[p] & 0xFF) << 8) | (d[p + 1] & 0xFF); }
    static int u4(byte[] d, int p) { return ((d[p] & 0xFF) << 24) | ((d[p+1] & 0xFF) << 16) | ((d[p+2] & 0xFF) << 8) | (d[p+3] & 0xFF); }
}
