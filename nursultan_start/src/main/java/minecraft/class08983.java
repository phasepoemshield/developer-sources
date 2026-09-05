/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11668
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class11668;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import org.slf4j.Logger;

public final class class08983<IdType>
implements class02694 {
    private static final Logger L = LogUtils.getLogger();
    private static final String u = "id";
    public final IdType N;
    public final class07001 y;

    public class07001 L() {
        return this.y.N();
    }

    public class08983(IdType IdType, class07001 class070012) {
        this.N = IdType;
        this.y = class08983.N(class070012);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof class08983) {
            class08983 class089832 = (class08983)object;
            return this.N == class089832.N && this.y.equals((Object)class089832.y);
        }
        return false;
    }

    public String toString() {
        return String.valueOf(this.N) + " " + String.valueOf(this.y);
    }

    public int hashCode() {
        return 31 * this.N.hashCode() + this.y.hashCode();
    }

    private static /* synthetic */ String i() {
        return "(rollback)";
    }

    private class07001 u() {
        return this.y;
    }

    @Deprecated
    public class07001 y() {
        return this.y;
    }

    public static <T> Codec<class08983<T>> N(Codec<T> codec) {
        return new class11668(codec);
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (this.N.getClass() == class07078.class) {
            class07078 class070782 = (class07078)this.N;
            if (class065912.L() && !class070782.b()) {
                consumer.accept((class00392)class00392.L((String)"item.spawn_egg.peaceful").N(class06541.field_1061));
            }
        }
    }

    public static <B extends ByteBuf, T> class02362<B, class08983<T>> N(class02362<B, T> class023622) {
        return class02362.N(class023622, class08983::N, (class02362)class02389.j, class08983::u, class08983::new);
    }

    public IdType N() {
        return this.N;
    }

    public boolean N(String string) {
        return this.y.y(string);
    }

    private static class07001 N(class07001 class070012) {
        if (class070012.y(u)) {
            class07001 class070013 = class070012.N();
            class070013.b(u);
            return class070013;
        }
        return class070012;
    }

    public static <T> class08983<T> N(T t, class07001 class070012) {
        return new class08983<T>(t, class070012);
    }

    public void N(class07049 class070492) {
        try (class04495 class044952 = new class04495(class070492.method_71370(), L);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
            class070492.method_5647((class08329)class083032);
            class07001 class070012 = class083032.y();
            UUID uUID = class070492.method_5667();
            class070012.N(this.y());
            class070492.method_5651(class08308.N((class04490)class044952, (class01929)class070492.method_56673(), (class07001)class070012));
            class070492.method_5826(uUID);
        }
    }

    /*
     * Exception decompiling
     */
    public boolean N(class00394 var1_1, class01929 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CATCHBLOCK]], but top level block is 2[TRYBLOCK]
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
}

