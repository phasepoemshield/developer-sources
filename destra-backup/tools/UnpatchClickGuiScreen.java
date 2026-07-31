import java.nio.file.*;

public final class UnpatchClickGuiScreen {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) throw new IllegalArgumentException("Need class file path");
        Path file = Path.of(args[0]);
        byte[] data = Files.readAllBytes(file);
        System.out.println("Input size: " + data.length);
        
        int cpCount = u2(data, 8);
        System.out.println("CP count: " + cpCount);
        
        int origCpEnd = findConstantPoolEnd(data, cpCount - 1);
        System.out.println("Original CP end (cpCount-1): " + origCpEnd);
        
        int patchedCpEnd = findConstantPoolEnd(data, cpCount);
        System.out.println("Patched CP end (cpCount): " + patchedCpEnd);
        
        int cpExpansion = patchedCpEnd - origCpEnd;
        System.out.println("CP expansion: " + cpExpansion + " bytes");
        
        int codeLenOffset = findClinitCodeLengthOffset(data, cpCount, patchedCpEnd);
        int codeLen = u4(data, codeLenOffset);
        System.out.println("Current code_length: " + codeLen + " at file offset " + codeLenOffset);
        
        int returnOffset = codeLenOffset + 4 + codeLen - 1;
        System.out.println("Return at: " + returnOffset);
        
        if (data[returnOffset] != (byte) 0xB1) {
            System.out.println("ERROR: Not a return instruction"); return;
        }
        if (data[returnOffset - 3] != (byte) 0xB8) {
            System.out.println("Not patched (no invokestatic before return)"); return;
        }
        
        int cpIdx = ((data[returnOffset - 2] & 0xFF) << 8) | (data[returnOffset - 1] & 0xFF);
        System.out.println("invokestatic target CP index: " + cpIdx);
        
        int origCodeLen = codeLen - 3;
        int totalRemoval = cpExpansion + 3;
        System.out.println("Removing " + cpExpansion + " CP bytes + 3 code bytes");
        
        byte[] restored = new byte[data.length - cpExpansion - 3];
        
        int writePos = 0;
        System.arraycopy(data, 0, restored, 0, origCpEnd);
        writePos = origCpEnd;
        
        restored[8] = (byte) (((cpCount - 1) >>> 8) & 0xFF);
        restored[9] = (byte) ((cpCount - 1) & 0xFF);
        
        System.arraycopy(data, patchedCpEnd, restored, writePos, returnOffset - 3 - patchedCpEnd);
        writePos += returnOffset - 3 - patchedCpEnd;
        
        System.arraycopy(data, returnOffset, restored, writePos, data.length - returnOffset);
        
        int adjCodeLenOffset = codeLenOffset - cpExpansion;
        restored[adjCodeLenOffset] = (byte) ((origCodeLen >>> 24) & 0xFF);
        restored[adjCodeLenOffset + 1] = (byte) ((origCodeLen >>> 16) & 0xFF);
        restored[adjCodeLenOffset + 2] = (byte) ((origCodeLen >>> 8) & 0xFF);
        restored[adjCodeLenOffset + 3] = (byte) (origCodeLen & 0xFF);
        
        int adjReturnOffset = adjCodeLenOffset + 4 + origCodeLen - 1;
        restored[adjReturnOffset] = (byte) 0xB1;
        
        System.out.println("Restored size: " + restored.length + " (expected 102169)");
        Files.write(file, restored);
        System.out.println("Unpatched: " + file);
    }
    
    static int findConstantPoolEnd(byte[] data, int cpCount) {
        int pos = 10;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF;
            pos++;
            pos += cpPayload(data, pos, tag);
            if (tag == 5 || tag == 6) i++;
        }
        return pos;
    }
    
    static int cpPayload(byte[] data, int pos, int tag) {
        return switch (tag) {
            case 1 -> 2 + (((data[pos] & 0xFF) << 8) | (data[pos + 1] & 0xFF));
            case 3, 4 -> 4;
            case 5, 6 -> 8;
            case 7, 8, 16, 19, 20 -> 2;
            case 9, 10, 11, 12, 17, 18 -> 4;
            case 15 -> 3;
            default -> throw new IllegalStateException("Unknown tag " + tag);
        };
    }
    
    static int findClinitCodeLengthOffset(byte[] data, int cpCount, int cpEnd) {
        int pos = cpEnd + 6;
        int ifCount = u2(data, pos); pos += 2 + ifCount * 2;
        int fCount = u2(data, pos); pos += 2;
        for (int i = 0; i < fCount; i++) pos = skipMember(data, pos);
        int mCount = u2(data, pos); pos += 2;
        for (int i = 0; i < mCount; i++) {
            int nameIdx = u2(data, pos + 2);
            boolean isClinit = isUtf8At(data, cpCount, nameIdx, "<clinit>");
            if (isClinit) {
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
        throw new IllegalStateException("clinit code_length not found");
    }
    
    static boolean isUtf8At(byte[] data, int cpCount, int idx, String value) {
        int pos = 10;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF;
            pos++;
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
    
    static int skipMember(byte[] data, int pos) {
        pos += 6;
        int ac = u2(data, pos); pos += 2;
        for (int i = 0; i < ac; i++) { pos += 2; int l = u4(data, pos); pos += 4 + l; }
        return pos;
    }
    
    static int u2(byte[] data, int p) { return ((data[p] & 0xFF) << 8) | (data[p + 1] & 0xFF); }
    static int u4(byte[] data, int p) { return ((data[p] & 0xFF) << 24) | ((data[p+1] & 0xFF) << 16) | ((data[p+2] & 0xFF) << 8) | (data[p+3] & 0xFF); }
}
