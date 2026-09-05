/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  jerozgen.languagereload.mixin.SignTextAccessor
 *  minecraft.class00392
 *  minecraft.class00647
 *  minecraft.class00654
 *  minecraft.class01028
 *  minecraft.class03748
 *  minecraft.class05220
 *  minecraft.class06563
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import jerozgen.languagereload.mixin.SignTextAccessor;
import minecraft.class00392;
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class01028;
import minecraft.class03748;
import minecraft.class05220;
import minecraft.class06563;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class03610
implements SignTextAccessor {
    private static final Codec<class00392[]> L = class03748.N.listOf().comapFlatMap(var0 -> {
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
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriterToArgs(AbstractMemberFunctionInvokation.java:101)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractMemberFunctionInvokation.applyExpressionRewriter(AbstractMemberFunctionInvokation.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:103)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.rewriteExpressions(StructuredReturn.java:99)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }, class00392Array -> List.of(class00392Array[0], class00392Array[1], class00392Array[2], class00392Array[3]));
    public static final Codec<class03610> N = RecordCodecBuilder.create(instance -> instance.group((App)L.fieldOf("messages").forGetter(class036102 -> class036102.u), (App)L.lenientOptionalFieldOf("filtered_messages").forGetter(class03610::u), (App)class06563.field_41600.fieldOf("color").orElse((Object)class06563.field_7963).forGetter(class036102 -> class036102.R), (App)Codec.BOOL.fieldOf("has_glowing_text").orElse((Object)false).forGetter(class036102 -> class036102.M)).apply(instance, class03610::N));
    public static final int y = 4;
    private final class00392[] u;
    private final class00392[] i;
    private final class06563 R;
    private final boolean M;
    private class01028 @Nullable [] B;
    private boolean Z;

    private static class00392[] L() {
        return new class00392[]{class05220.N, class05220.N, class05220.N, class05220.N};
    }

    public class03610() {
        this(class03610.L(), class03610.L(), class06563.field_7963, false);
    }

    public class03610(class00392[] class00392Array, class00392[] class00392Array2, class06563 class065632, boolean bl) {
        this.u = class00392Array;
        this.i = class00392Array2;
        this.R = class065632;
        this.M = bl;
    }

    private Optional<class00392[]> u() {
        for (int i = 0; i < 4; ++i) {
            if (this.i[i].equals((Object)this.u[i])) continue;
            return Optional.of(this.i);
        }
        return Optional.empty();
    }

    public class00392[] y(boolean bl) {
        return bl ? this.i : this.u;
    }

    public boolean y(class08036 class080362) {
        class00392[] class00392Array = this.y(class080362.method_33793());
        int n = class00392Array.length;
        for (int i = 0; i < n; ++i) {
            class00647 class006472 = class00392Array[i].method_10866().Z();
            if (class006472 == null || class006472.N() != class00654.field_11750) continue;
            return true;
        }
        return false;
    }

    public class06563 y() {
        return this.R;
    }

    public class00392 N(int n, boolean bl) {
        return this.y(bl)[n];
    }

    public class03610 N(class06563 class065632) {
        if (class065632 == this.y()) {
            return this;
        }
        return new class03610(this.u, this.i, class065632, this.M);
    }

    public class03610 N(boolean bl) {
        if (bl == this.M) {
            return this;
        }
        return new class03610(this.u, this.i, this.R, bl);
    }

    public boolean N() {
        return this.M;
    }

    private static class03610 N(class00392[] class00392Array, Optional<class00392[]> optional, class06563 class065632, boolean bl) {
        return new class03610(class00392Array, optional.orElse(Arrays.copyOf(class00392Array, class00392Array.length)), class065632, bl);
    }

    public class01028[] N(boolean bl, Function<class00392, class01028> function) {
        if (this.B == null || this.Z != bl) {
            this.Z = bl;
            this.B = new class01028[4];
            for (int i = 0; i < 4; ++i) {
                this.B[i] = function.apply(this.N(i, bl));
            }
        }
        return this.B;
    }

    public boolean N(class08036 class080362) {
        return Arrays.stream(this.y(class080362.method_33793())).anyMatch(class003922 -> !class003922.getString().isEmpty());
    }

    public class03610 N(int n, class00392 class003922, class00392 class003923) {
        class00392[] class00392Array = Arrays.copyOf(this.u, this.u.length);
        class00392[] class00392Array2 = Arrays.copyOf(this.i, this.i.length);
        class00392Array[n] = class003922;
        class00392Array2[n] = class003923;
        return new class03610(class00392Array, class00392Array2, this.R, this.M);
    }

    public class03610 N(int n, class00392 class003922) {
        return this.N(n, class003922, class003922);
    }

    public /* synthetic */ void languagereload_setOrderedMessages(class01028[] class01028Array) {
        this.B = class01028Array;
    }
}

