/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09723
 *  Nursultan.class09940
 *  Nursultan.class09946
 *  Nursultan.class09960
 *  Nursultan.class11731
 *  Nursultan.class11735
 *  Nursultan.class11737
 *  Nursultan.class11741
 *  Nursultan.class11742
 *  Nursultan.class11758
 *  Nursultan.class11770
 *  Nursultan.class11773
 *  Nursultan.class11774
 *  Nursultan.class11938
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTexture
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class08893
 *  minecraft.class08918
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL33
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import Nursultan.class09723;
import Nursultan.class09940;
import Nursultan.class09946;
import Nursultan.class09960;
import Nursultan.class11596;
import Nursultan.class11597;
import Nursultan.class11627;
import Nursultan.class11637;
import Nursultan.class11731;
import Nursultan.class11735;
import Nursultan.class11737;
import Nursultan.class11741;
import Nursultan.class11742;
import Nursultan.class11758;
import Nursultan.class11770;
import Nursultan.class11773;
import Nursultan.class11774;
import Nursultan.class11938;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08893;
import minecraft.class08918;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.MemoryUtil;

public class class11643 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    private static class11596 M(String string) {
        GpuTexture gpuTexture;
        class08918 class089182;
        if (string.isEmpty()) {
            return (class11596)((Object)class11596.E_0);
        }
        class01894 class018942 = class01894.L((String)string);
        if (class018942 == null) {
            class018942 = class01894.y((String)string);
        }
        if ((class089182 = class06202.Nq().NO().y(class018942)) == null || !((gpuTexture = class089182.method_68004()) instanceof class08893)) {
            return (class11596)((Object)class11596.E_0);
        }
        class08893 class088932 = (class08893)gpuTexture;
        int n = class088932.N();
        if (n <= 0) {
            return (class11596)((Object)class11596.E_0);
        }
        class11643.y(n);
        return class11596.N(n, 0, 0);
    }

    public class11643(class11742 class117422) {
        this.u();
        this.L_0 = new ConcurrentLinkedQueue();
        this.L_1 = new Object2ObjectOpenHashMap();
        this.L_2 = new Object2ObjectOpenHashMap();
        this.L_3 = new ArrayDeque();
        this.L_4 = new class11770();
        this.y_0 = new class11735();
        this.y_2 = new class09723(class09940.ALPHA8, 512, 512, 1, 64);
        this.y_1 = class117422;
    }

    static {
        class11643.z();
        N_0 = LogManager.getLogger(String.class);
    }

    private ByteBuffer Z(int n) {
        if ((ByteBuffer)this.y_3 == null) {
            this.y_3 = MemoryUtil.memAlloc((int)n);
            ((ByteBuffer)this.y_3).clear();
            return (ByteBuffer)this.y_3;
        }
        if (((ByteBuffer)this.y_3).capacity() < n) {
            this.y_3 = MemoryUtil.memRealloc((ByteBuffer)((ByteBuffer)this.y_3), (int)n);
        }
        ((ByteBuffer)this.y_3).clear();
        return (ByteBuffer)this.y_3;
    }

    private void i(String string) {
        ((Map)this.L_1).put(string, class11597.u());
        ((ExecutorService)class11938.L_1).execute(() -> this.R(string));
    }

    private void i() {
        String string;
        while ((string = (String)((Queue)this.L_3).poll()) != null) {
            ((Logger)N_0).warn(string);
        }
    }

    private class11596 m(String string) {
        int n = string.indexOf(47, 5);
        if (n <= 5 || n == string.length() - 1) {
            return (class11596)((Object)class11596.E_0);
        }
        String string2 = string.substring(5, n);
        String string3 = string.substring(n + 1);
        class11731 class117312 = ((class11742)this.y_1).N(string2);
        if (class117312 == null) {
            return (class11596)((Object)class11596.E_0);
        }
        class11773 class117732 = class117312.N(string3);
        if (class117732 == null) {
            return (class11596)((Object)class11596.E_0);
        }
        float f = class117732.u() <= 0.0f ? 1.0f : class117732.L() / class117732.u();
        int n2 = class117312.y();
        class11596 class115962 = class11596.N(n2, class117312.u(), class117312.i(), class117732.i(), class117732.y(), class117732.R(), class117732.N(), class117312.L(), f);
        ((Map)this.L_2).put(string, new class11774(class117312, n2, class115962));
        return class115962;
    }

    private class11596 z(String string) {
        class11774 class117742 = (class11774)((Map)this.L_2).get(string);
        if (class117742 != null && class117742.L().y() == class117742.y()) {
            return class117742.N();
        }
        return this.m(string);
    }

    private static void z() {
        N_0 = null;
        N_1 = 512;
        N_2 = 512;
        N_3 = 1;
        N_4 = 64;
        N_5 = 256;
        N_6 = 0;
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_4 = 0;
            this.y_5 = 0;
        }
    }

    private static void y(int n) {
        if (n == (Integer)N_6) {
            return;
        }
        int n2 = GL33.glGetInteger((int)32873);
        GlStateManager._bindTexture((int)n);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9728);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9728);
        GlStateManager._bindTexture((int)n2);
        N_6 = n;
    }

    public void y() {
        this.E();
        this.i();
    }

    private void E() {
        class11637 class116372;
        boolean bl = false;
        while ((class116372 = (class11637)((Object)((Queue)this.L_0).poll())) != null) {
            int n;
            class11597 class115972 = (class11597)((Map)this.L_1).get(class116372.N());
            if (class115972 == null || (class11737)class115972.N_0 != class11737.LOADING) continue;
            if (class116372.y() != null) {
                class115972.N_0 = class11737.FAILED;
                ((Queue)this.L_3).add("Failed to decode UI texture '" + class116372.N() + "': " + class116372.y());
                continue;
            }
            if (class116372.L() != null) {
                class09946 class099462 = this.N(class116372);
                if (class099462 != null) {
                    class115972.N_0 = class11737.READY;
                    class115972.N_1 = class099462;
                    class115972.N_3 = class116372.R();
                    class115972.N_4 = class116372.i();
                    bl = true;
                    continue;
                }
                ((Queue)this.L_3).add("Atlas is full, using direct fallback for UI texture '" + class116372.N() + "'");
            }
            if ((n = this.N(class116372.R(), class116372.i(), class116372.u())) <= 0) {
                class115972.N_0 = class11737.FAILED;
                ((Queue)this.L_3).add("Failed to upload UI texture '" + class116372.N() + "'");
                continue;
            }
            class115972.N_0 = class11737.READY;
            class115972.N_2 = n;
            class115972.N_3 = class116372.R();
            class115972.N_4 = class116372.i();
            class115972.N_7 = class11596.N(n, class116372.R(), class116372.i());
        }
        if (bl) {
            this.R();
        }
    }

    public class11596 N(String string) {
        if (string.isEmpty()) {
            return (class11596)((Object)class11596.E_0);
        }
        if (string.startsWith("icon:")) {
            return this.z(string);
        }
        if (string.startsWith("glidfy:")) {
            return class11643.N(string, 7, true);
        }
        if (string.startsWith("glid:")) {
            return class11643.N(string, 5, false);
        }
        if (string.startsWith("mcatlas:")) {
            return class11643.M(string.substring(8));
        }
        class11597 class115972 = (class11597)((Map)this.L_1).get(string);
        if (class115972 == null) {
            this.i(string);
            return (class11596)((Object)class11596.E_0);
        }
        if ((class11737)class115972.N_0 == class11737.LOADING || (class11737)class115972.N_0 == class11737.FAILED) {
            return (class11596)((Object)class11596.E_0);
        }
        return class115972.N((Integer)this.y_4, ((class09723)this.y_2).L());
    }

    private class09946 N(class11637 class116372) {
        try {
            return ((class09723)this.y_2).N(class116372.L(), class116372.R(), class116372.i());
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
    }

    public int N() {
        return (Integer)this.y_4;
    }

    private int N(int n, int n2, byte[] byArray) {
        ByteBuffer byteBuffer = this.Z(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.flip();
        return ((class11741)this.y_0).N(n, n2, byteBuffer);
    }

    private static byte[] N(class11627 class116272) {
        byte[] byArray = class116272.y();
        byte[] byArray2 = new byte[class116272.L() * class116272.N()];
        int n = 0;
        int n2 = 0;
        while (n < byArray.length) {
            int n3 = byArray[n] & 0xFF;
            int n4 = byArray[n + 1] & 0xFF;
            int n5 = byArray[n + 2] & 0xFF;
            int n6 = byArray[n + 3] & 0xFF;
            if (n6 == 0) {
                byArray2[n2] = 0;
            } else {
                if (n3 != n4 || n4 != n5) {
                    return null;
                }
                int n7 = (n6 * n3 + 127) / 255;
                byArray2[n2] = (byte)n7;
            }
            n += 4;
            ++n2;
        }
        return byArray2;
    }

    private ByteBuffer N(int n, int n2, int n3, int n4) {
        int n5 = n3 * n4;
        ByteBuffer byteBuffer = this.Z(n5);
        byte[] byArray = ((class09723)this.y_2).M();
        int n6 = ((class09723)this.y_2).y();
        for (int i = 0; i < n4; ++i) {
            int n7 = (n2 + i) * n6 + n;
            byteBuffer.put(byArray, n7, n3);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    /*
     * Exception decompiling
     */
    private static class11627 N(byte[] var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
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

    private static class11596 N(String string, int n, boolean bl) {
        try {
            int n2 = Integer.parseInt(string, n, string.length(), 10);
            if (n2 <= 0) {
                return (class11596)((Object)class11596.E_0);
            }
            return bl ? class11596.y(n2, 0, 0) : class11596.N(n2, 0, 0);
        }
        catch (NumberFormatException numberFormatException) {
            return (class11596)((Object)class11596.E_0);
        }
    }

    private void R(String string) {
        try {
            byte[] byArray = ((class11758)this.L_4).N(string);
            if (byArray == null || byArray.length == 0) {
                ((Queue)this.L_0).add(class11637.N(string, "Resource not found"));
                return;
            }
            class11627 class116272 = class11643.N(byArray, string);
            if (class116272 == null) {
                ((Queue)this.L_0).add(class11637.N(string, "Image decode failed"));
                return;
            }
            byte[] byArray2 = class11643.N(class116272);
            boolean bl = byArray2 != null && class116272.L() <= 256 && class116272.N() <= 256;
            ((Queue)this.L_0).add(class11637.N(string, class116272.L(), class116272.N(), class116272.y(), (byte[])(bl ? byArray2 : null)));
        }
        catch (Exception exception) {
            ((Queue)this.L_0).add(class11637.N(string, exception.getMessage()));
        }
    }

    private void R() {
        boolean bl;
        class09960[] class09960Array = ((class09723)this.y_2).z();
        if (class09960Array.length == 0 && (Integer)this.y_4 != 0) {
            return;
        }
        int n = ((class09723)this.y_2).L();
        boolean bl2 = bl = (Integer)this.y_4 == 0 || (Integer)this.y_5 != n;
        if ((Integer)this.y_4 == 0) {
            this.y_4 = ((class11741)this.y_0).N();
        }
        if ((Integer)this.y_4 == 0) {
            ((Queue)this.L_3).add("Failed to create UI atlas texture");
            return;
        }
        if (bl) {
            ByteBuffer byteBuffer = this.N(0, 0, ((class09723)this.y_2).y(), n);
            ((class11741)this.y_0).N(((Integer)this.y_4).intValue(), 0, 0, ((class09723)this.y_2).y(), n, ((class09723)this.y_2).y(), n, true, byteBuffer);
            this.y_5 = n;
            return;
        }
        for (class09960 class099602 : class09960Array) {
            ByteBuffer byteBuffer = this.N(class099602.L(), class099602.u(), class099602.i(), class099602.R());
            ((class11741)this.y_0).N(((Integer)this.y_4).intValue(), class099602.L(), class099602.u(), class099602.i(), class099602.R(), ((class09723)this.y_2).y(), n, false, byteBuffer);
        }
    }
}

