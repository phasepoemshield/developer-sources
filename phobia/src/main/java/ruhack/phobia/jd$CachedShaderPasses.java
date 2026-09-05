/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.figuramc.figura.utils.PhobiaFiguraBridge$RenderPass
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.figuramc.figura.utils.PhobiaFiguraBridge;

final class jd$CachedShaderPasses {
    private static long[] hteg;
    private static int[] htel;
    private static long[] htef;
    private final PhobiaFiguraBridge.RenderPass[] passes;
    public static final int b;
    private long updatedFrameSerial;
    private static final long ox = 8473044720932432662L;
    private static int[] htek;
    private final int layout;

    private static /* synthetic */ long htee(int n2) {
        return htef[n2] ^ hteg[n2];
    }

    public static /* synthetic */ CallSite hteh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void htet() {
        jd$CachedShaderPasses.htel[0] = 1056045490;
        jd$CachedShaderPasses.htel[1] = 680468443;
        jd$CachedShaderPasses.htel[2] = 377361802;
        jd$CachedShaderPasses.htel[3] = -197233937;
        jd$CachedShaderPasses.htel[4] = 1693290992;
        jd$CachedShaderPasses.htel[5] = 1108831543;
    }

    private static /* synthetic */ int htej(int n2) {
        return htek[n2] ^ htel[n2];
    }

    private static /* synthetic */ void htes() {
        jd$CachedShaderPasses.htek[0] = 1056045490;
        jd$CachedShaderPasses.htek[1] = 680468440;
        jd$CachedShaderPasses.htek[2] = 377361807;
        jd$CachedShaderPasses.htek[3] = -197233941;
        jd$CachedShaderPasses.htek[4] = 1693290992;
        jd$CachedShaderPasses.htek[5] = 1108831542;
    }

    static {
        htek = new int[6];
        htel = new int[6];
        jd$CachedShaderPasses.htes();
        jd$CachedShaderPasses.htet();
        htef = new long[1];
        hteg = new long[1];
        jd$CachedShaderPasses.htef[0] = -5007823065480095736L;
        jd$CachedShaderPasses.hteg[0] = 4215548971374680072L;
    }

    private jd$CachedShaderPasses(int n2, PhobiaFiguraBridge.RenderPass[] renderPassArray) {
        int n3 = b;
        this.updatedFrameSerial = (long)jd$CachedShaderPasses.hteh("htei", htee(int ), (int)0);
        this.layout = n2;
        this.passes = renderPassArray;
    }
}

