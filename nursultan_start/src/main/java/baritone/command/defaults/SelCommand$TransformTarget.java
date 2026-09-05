/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.selection.ISelection
 */
package baritone.command.defaults;

import baritone.api.selection.ISelection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;

/*
 * Exception performing whole class analysis.
 */
final class SelCommand$TransformTarget
extends Enum<SelCommand$TransformTarget> {
    public static final /* enum */ SelCommand$TransformTarget ALL;
    public static final /* enum */ SelCommand$TransformTarget NEWEST;
    public static final /* enum */ SelCommand$TransformTarget OLDEST;
    private final Function<ISelection[], ISelection[]> transform;
    private final String[] names;
    private static final /* synthetic */ SelCommand$TransformTarget[] $VALUES;

    private SelCommand$TransformTarget(Function<ISelection[], ISelection[]> function, String ... stringArray) {
        super(string, n);
        this.transform = function;
        this.names = stringArray;
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:455)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:409)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractConstructorInvokation.applyExpressionRewriter(AbstractConstructorInvokation.java:65)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredAssignment.rewriteExpressions(StructuredAssignment.java:146)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
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

    public static SelCommand$TransformTarget[] values() {
        return (SelCommand$TransformTarget[])$VALUES.clone();
    }

    public static SelCommand$TransformTarget valueOf(String string) {
        return Enum.valueOf(SelCommand$TransformTarget.class, string);
    }

    public ISelection[] transform(ISelection[] iSelectionArray) {
        return this.transform.apply(iSelectionArray);
    }

    public static SelCommand$TransformTarget getByName(String string) {
        for (SelCommand$TransformTarget selCommand$TransformTarget : SelCommand$TransformTarget.values()) {
            for (String string2 : selCommand$TransformTarget.names) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return selCommand$TransformTarget;
            }
        }
        return null;
    }

    private static /* synthetic */ SelCommand$TransformTarget[] $values() {
        return new SelCommand$TransformTarget[]{ALL, NEWEST, OLDEST};
    }

    private static /* synthetic */ ISelection[] lambda$static$2(ISelection[] iSelectionArray) {
        return new ISelection[]{iSelectionArray[0]};
    }

    public static String[] getAllNames() {
        HashSet<String> hashSet = new HashSet<String>();
        for (SelCommand$TransformTarget selCommand$TransformTarget : SelCommand$TransformTarget.values()) {
            hashSet.addAll(Arrays.asList(selCommand$TransformTarget.names));
        }
        return hashSet.toArray(new String[0]);
    }
}

