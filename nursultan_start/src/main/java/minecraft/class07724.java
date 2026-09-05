/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class01465
 *  minecraft.class01477
 *  minecraft.class03140
 *  minecraft.class03154
 *  minecraft.class03175
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import minecraft.class01424;
import minecraft.class01465;
import minecraft.class01477;
import minecraft.class03140;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class07709;
import minecraft.class07726;
import minecraft.class07741;

class class07724
implements class01477<class07741> {
    /*
     * Exception decompiling
     */
    private static class03154 L(DataInput var0, class03175 var1_1, class07726 var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[SWITCH], 8[CASE]], but top level block is 9[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    class07724() {
    }

    private static class07741 u(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.y(36L);
        byte by = dataInput.readByte();
        int n = class07724.N(dataInput);
        if (by == 0 && n > 0) {
            throw new class03140("Missing type on ListTag");
        }
        class077262.N(4L, n);
        class01424 var4 = class01465.N((int)by);
        class07741 class077412 = new class07741(new ArrayList<class07709>(n));
        for (int i = 0; i < n; ++i) {
            class077412.N(var4.L(dataInput, class077262));
        }
        return class077412;
    }

    public String y() {
        return "TAG_List";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.u();
        try {
            class01424 var3 = class01465.N((int)dataInput.readByte());
            int n = dataInput.readInt();
            var3.N(dataInput, n, class077262);
        }
        finally {
            class077262.i();
        }
    }

    public String N() {
        return "LIST";
    }

    private static int N(DataInput dataInput) throws IOException {
        int n = dataInput.readInt();
        if (n < 0) {
            throw new class03140("ListTag length cannot be negative: " + n);
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class03154 N(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        class077262.u();
        try {
            class03154 class031542 = class07724.L(dataInput, class031752, class077262);
            return class031542;
        }
        finally {
            class077262.i();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class07741 L(DataInput dataInput, class07726 class077262) throws IOException {
        class077262.u();
        try {
            class07741 class077412 = class07724.u(dataInput, class077262);
            return class077412;
        }
        finally {
            class077262.i();
        }
    }
}

