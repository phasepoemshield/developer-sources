/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11472
 *  Nursultan.class11802
 *  Nursultan.class11938
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL12
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class11472;
import Nursultan.class11802;
import Nursultan.class11914;
import Nursultan.class11923;
import Nursultan.class11938;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.system.MemoryUtil;

public class class11883 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private class11883() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11883.u();
        N_0 = LogManager.getLogger(String.class);
        N_2 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(20L)).executor((Executor)class11938.L_1).build();
    }

    private static List<String> B(String string) {
        return Arrays.asList(string.substring(1, string.length() - 1).split("\\s*,\\s*"));
    }

    private static void l(String string) {
    }

    private static void u() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void y(class11914 class119142) {
        ByteBuffer byteBuffer = null;
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = false;
        try {
            byteBuffer = MemoryUtil.memAlloc((int)class119142.y().length);
            byteBuffer.put(class119142.y()).flip();
            n2 = GL12.glGetInteger((int)32873);
            bl = true;
            n = GL12.glGenTextures();
            if (n == 0) {
                ((Logger)N_0).warn("Failed to allocate avatar GL texture");
                return;
            }
            GlStateManager._bindTexture((int)n);
            GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
            GlStateManager._texParameter((int)3553, (int)10242, (int)33071);
            GlStateManager._texParameter((int)3553, (int)10243, (int)33071);
            GlStateManager._pixelStore((int)3314, (int)0);
            GlStateManager._pixelStore((int)3316, (int)0);
            GlStateManager._pixelStore((int)3315, (int)0);
            GlStateManager._pixelStore((int)3317, (int)1);
            GL12.glTexImage2D((int)3553, (int)0, (int)32856, (int)class119142.L(), (int)class119142.N(), (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
            int n3 = ((class11472)class11938.L_2).U();
            GlStateManager._bindTexture((int)(n2 == n3 ? 0 : n2));
            bl2 = true;
            ((class11472)class11938.L_2).N(n);
            n = 0;
            if (n3 > 0) {
                GL12.glDeleteTextures((int)n3);
            }
        }
        catch (Exception exception) {
            ((Logger)N_0).error("Failed to upload avatar texture", (Throwable)exception);
        }
        finally {
            if (bl && !bl2) {
                GlStateManager._bindTexture((int)n2);
            }
            if (n != 0) {
                GL12.glDeleteTextures((int)n);
            }
            if (byteBuffer != null) {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
    }

    public static void N(String[] stringArray, OptionParser optionParser) {
        N_1 = System.nanoTime();
        optionParser.allowsUnrecognizedOptions();
        ArgumentAcceptingOptionSpec var2 = optionParser.accepts("subscribeTimeLeft").withRequiredArg().ofType(Long.class);
        ArgumentAcceptingOptionSpec var3 = optionParser.accepts("login").withRequiredArg();
        ArgumentAcceptingOptionSpec var4 = optionParser.accepts("uid").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec var5 = optionParser.accepts("role").withRequiredArg();
        ArgumentAcceptingOptionSpec var6 = optionParser.accepts("hash").withRequiredArg();
        ArgumentAcceptingOptionSpec var7 = optionParser.accepts("avatar").withRequiredArg();
        ArgumentAcceptingOptionSpec var8 = optionParser.accepts("boughtProducts").withRequiredArg();
        ArgumentAcceptingOptionSpec var9 = optionParser.accepts("apiToken").withRequiredArg();
        optionParser.accepts("debug");
        optionParser.accepts("checkLocalization");
        OptionSet optionSet = optionParser.parse(stringArray);
        ((class11472)class11938.L_2).N((String)class11883.N(optionSet, var3, "No such userdata: login!"));
        ((class11472)class11938.L_2).y(((Integer)class11883.N(optionSet, var4, "No such userdata: uid!")).intValue());
        ((class11472)class11938.L_2).N((Long)class11883.N(optionSet, var2, "No such userdata: subscribe time left!") / 60L);
        ((class11472)class11938.L_2).N(new class11802((String)class11883.N(optionSet, var5, "No such userdata: role!")));
        ((class11472)class11938.L_2).u((String)class11883.N(optionSet, var6, "No such userdata: hash!"));
        ((class11472)class11938.L_2).L((String)class11883.N(optionSet, var9, "No such userdata: api token!"));
        List<String> var12 = class11883.B((String)class11883.N(optionSet, var8, "No such userdata: bought products!"));
        ((class11472)class11938.L_2).N(var12.contains("premium"));
        class11883.l((String)class11883.N(optionSet, var7, "No such userdata: user avatar!"));
        if (optionSet.has("debug")) {
            class11938.L_3 = true;
        }
        if (optionSet.has("checkLocalization")) {
            class11938.L_4 = true;
        }
    }

    /*
     * Exception decompiling
     */
    private static class11914 N(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    private static /* synthetic */ void N(HttpResponse httpResponse) {
        if (httpResponse.statusCode() != 200) {
            ((Logger)N_0).warn("Failed to load avatar texture, status: {}", (Object)httpResponse.statusCode());
            return;
        }
        class11914 class119142 = class11883.N((byte[])httpResponse.body());
        if (class119142 != null) {
            class11923.N(() -> class11883.y(class119142));
        }
    }

    private static <T> T N(OptionSet optionSet, OptionSpec<T> optionSpec, String string) {
        if (!optionSet.has(optionSpec)) {
            throw new IllegalArgumentException(string);
        }
        return (T)optionSet.valueOf(optionSpec);
    }

    private static /* synthetic */ Void N(Throwable throwable) {
        ((Logger)N_0).error("Failed to load avatar texture asynchronously!", throwable);
        return null;
    }

    public static long N() {
        return (Long)N_1;
    }
}

