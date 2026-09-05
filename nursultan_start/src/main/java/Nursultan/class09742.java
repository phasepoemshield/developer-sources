/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.lwjgl.CLongBuffer
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FT_MM_Var
 *  org.lwjgl.util.freetype.FT_Var_Axis
 *  org.lwjgl.util.freetype.FT_Vector
 *  org.lwjgl.util.freetype.FreeType
 */
package Nursultan;

import Nursultan.class09718;
import Nursultan.class09719;
import Nursultan.class09720;
import Nursultan.class09724;
import Nursultan.class09726;
import Nursultan.class09730;
import Nursultan.class09731;
import Nursultan.class09734;
import Nursultan.class09735;
import Nursultan.class09745;
import Nursultan.class09746;
import Nursultan.class09750;
import Nursultan.class09752;
import Nursultan.class09758;
import Nursultan.class09761;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public final class class09742
implements AutoCloseable {
    private static final int[] N;
    private final class09734 y;
    private final byte[] L;
    private final long u;
    private final class09735 i;
    private final int R;
    private final double M;
    private final double B;
    private final int Z;
    private final long z;
    private final ByteBuffer U;
    private final FT_Face E;
    private final int W;
    private final boolean m;
    private final class09730 P;
    private final class09718 s;
    private final class09752 T = new class09752();
    private final class09731 b = new class09731();
    private class09726 j;
    private int[] v = new int[64];
    private int n;
    private class09726 t;
    private final IntOpenHashSet G = new IntOpenHashSet(256);
    private int[] l = new int[256];
    private int[] d = new int[256];
    private int[] w = new int[256];
    private int[] k = new int[256];
    private int[] Y = new int[256];
    private int Q;
    private final int[] O = new int[2];
    private int[] g;
    private class09761[] I;
    private final BlockingQueue<int[]> J = new LinkedBlockingQueue<int[]>();
    private final Queue<class09724> o = new ConcurrentLinkedQueue<class09724>();
    private final Executor q;
    private final Queue<class09745> K = new ConcurrentLinkedQueue<class09745>();
    private final List<class09745> V = Collections.synchronizedList(new ArrayList());
    private volatile boolean e;
    private Thread H;

    public ByteBuffer L() {
        return this.j.u();
    }

    public boolean L(int n) {
        return FreeType.FT_Get_Char_Index((FT_Face)this.E, (long)n) != 0;
    }

    public int M() {
        return 1;
    }

    private void P() {
        int n;
        int n2 = this.t.N();
        if (n2 >= this.y.R()) {
            throw new IllegalStateException("atlas exceeded max page size " + this.y.R() + "px");
        }
        int n3 = Math.min(this.y.R(), n2 * 2);
        class09726 class097262 = new class09726(n3, n3, this.R);
        int[] nArray = this.s();
        for (int i = 0; i < this.Q; ++i) {
            n = nArray[i];
            if (this.d[n] == 0) continue;
            if (!class097262.N(this.d[n], this.w[n], 1, this.O)) {
                throw new IllegalStateException("repack failed at " + n3 + "px");
            }
            class097262.N(this.t, this.k[n], this.Y[n], this.d[n], this.w[n], this.O[0], this.O[1]);
            this.k[n] = this.O[0];
            this.Y[n] = this.O[1];
        }
        class09726 class097263 = this.t;
        this.t = class097262;
        n = this.Q;
        this.o.offer(new class09720(class097262, class097263, n3, n3, Arrays.copyOf(this.l, n), Arrays.copyOf(this.k, n), Arrays.copyOf(this.Y, n), Arrays.copyOf(this.d, n), Arrays.copyOf(this.w, n), n));
    }

    private class09742(byte[] byArray, class09734 class097342, Executor executor) {
        PointerBuffer pointerBuffer;
        this.Z = 1;
        if (executor == null) {
            throw new IllegalArgumentException("bakeExecutor");
        }
        this.y = class097342;
        this.L = byArray;
        this.q = executor;
        this.i = class097342.y();
        this.R = this.i.N();
        this.M = class097342.L();
        this.B = class097342.u();
        this.u = class09742.N(byArray);
        try (Object object = MemoryStack.stackPush();){
            pointerBuffer = object.mallocPointer(1);
            if (FreeType.FT_Init_FreeType((PointerBuffer)pointerBuffer) != 0) {
                throw new IllegalStateException("FT_Init_FreeType failed");
            }
            this.z = pointerBuffer.get(0);
        }
        this.U = MemoryUtil.memAlloc((int)byArray.length);
        this.U.put(byArray).flip();
        object = MemoryStack.stackPush();
        try {
            pointerBuffer = object.mallocPointer(1);
            if (FreeType.FT_New_Memory_Face((long)this.z, (ByteBuffer)this.U, (long)0L, (PointerBuffer)pointerBuffer) != 0) {
                MemoryUtil.memFree((Buffer)this.U);
                FreeType.FT_Done_FreeType((long)this.z);
                throw new IllegalStateException("FT_New_Memory_Face failed");
            }
            this.E = FT_Face.create((long)pointerBuffer.get(0));
        }
        finally {
            if (object != null) {
                object.close();
            }
        }
        this.W = Math.max(1, this.E.units_per_EM() & 0xFFFF);
        this.E();
        this.m = FreeType.FT_HAS_KERNING((FT_Face)this.E);
        this.P = class09730.N(byArray);
        this.s = new class09718((double)this.E.ascender() / (double)this.W, (double)this.E.descender() / (double)this.W, (double)this.E.height() / (double)this.W);
        object = new class09726(class097342.i(), class097342.i(), this.R);
        this.j = object;
        this.t = object;
    }

    public class09734 B() {
        return this.y;
    }

    public long Z() {
        return this.u;
    }

    public int i() {
        return this.j.y();
    }

    private int[] s() {
        int n;
        int n2 = this.Q;
        int[] nArray = new int[n2];
        for (n = 0; n < n2; ++n) {
            nArray[n] = n;
        }
        for (n = 1; n < n2; ++n) {
            int n3 = nArray[n];
            int n4 = this.w[n3];
            for (int i = n - 1; i >= 0 && this.w[nArray[i]] < n4; --i) {
                nArray[i + 1] = nArray[i];
            }
            nArray[i + 1] = n3;
        }
        return nArray;
    }

    private class09745 m() {
        class09745 class097452 = this.K.poll();
        if (class097452 != null) {
            return class097452;
        }
        class097452 = class09745.N(this.L);
        this.y(class097452);
        this.V.add(class097452);
        return class097452;
    }

    private void U() {
        this.e = true;
        this.H = class09742.N(this::W, "msdf-atlas-coordinator");
        this.H.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        this.e = false;
        this.J.offer(N);
        try {
            this.H.join();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        List<class09745> var1 = this.V;
        synchronized (var1) {
            Iterator<class09745> var2 = this.V.iterator();
            while (var2.hasNext()) {
                var2.next().close();
            }
            this.V.clear();
        }
        this.K.clear();
        this.N();
        this.j.i();
        FreeType.FT_Done_Face((FT_Face)this.E);
        FreeType.FT_Done_FreeType((long)this.z);
        MemoryUtil.memFree((Buffer)this.U);
    }

    public class09718 z() {
        return this.s;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class09761 u(int n) {
        class09745 class097452 = this.m();
        try {
            class09761 class097612 = class097452.N(n, this.M, this.B, this.i);
            return class097612;
        }
        finally {
            this.N(class097452);
        }
    }

    public int u() {
        return this.j.N();
    }

    private void y(Path path) {
        class09746 class097462 = class09758.N(path);
        if (class097462 == null) {
            return;
        }
        if (class097462.N() != this.u || class097462.y() != this.i.ordinal() || class097462.L() != this.M || class097462.u() != this.B || class097462.R() != this.R || Double.compare(class097462.i(), this.y.M()) != 0) {
            return;
        }
        this.g = class097462.M();
        this.I = class097462.B();
    }

    public double y(int n) {
        int n2 = FreeType.FT_Get_Char_Index((FT_Face)this.E, (long)n);
        if (n2 == 0) {
            return 0.0;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            CLongBuffer cLongBuffer = memoryStack.mallocCLong(1);
            if (FreeType.FT_Get_Advance((FT_Face)this.E, (int)n2, (int)1, (CLongBuffer)cLongBuffer) != 0) {
                double d = 0.0;
                return d;
            }
            double d = (double)cLongBuffer.get(0) / (double)this.W;
            return d;
        }
    }

    private void y(class09745 class097452) {
        double d = this.y.M();
        if (!Double.isNaN(d) && class097452.y() != null) {
            class097452.N((float)d);
        }
    }

    public boolean y() {
        return this.b.N();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void E() {
        double d = this.y.M();
        if (Double.isNaN(d)) {
            return;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            if (FreeType.FT_Get_MM_Var((FT_Face)this.E, (PointerBuffer)pointerBuffer) != 0) {
                return;
            }
            FT_MM_Var fT_MM_Var = FT_MM_Var.create((long)pointerBuffer.get(0));
            try {
                int n = fT_MM_Var.num_axis();
                long l = fT_MM_Var.axis().address();
                long[] lArray = new long[n];
                int n2 = -1;
                for (int i = 0; i < n; ++i) {
                    FT_Var_Axis fT_Var_Axis = FT_Var_Axis.create((long)(l + (long)i * (long)FT_Var_Axis.SIZEOF));
                    lArray[i] = fT_Var_Axis.def();
                    if (fT_Var_Axis.tag() != 2003265652L) continue;
                    n2 = i;
                }
                if (n2 < 0) {
                    return;
                }
                lArray[n2] = Math.round(d * 65536.0);
                CLongBuffer cLongBuffer = memoryStack.mallocCLong(n);
                cLongBuffer.put(lArray).flip();
                FreeType.FT_Set_Var_Design_Coordinates((FT_Face)this.E, (CLongBuffer)cLongBuffer);
            }
            finally {
                FreeType.FT_Done_MM_Var((long)this.z, (FT_MM_Var)fT_MM_Var);
            }
        }
    }

    private void N(int n, int n2, int n3, int n4, int n5) {
        if (this.Q == this.l.length) {
            int n6 = this.l.length * 2;
            this.l = Arrays.copyOf(this.l, n6);
            this.d = Arrays.copyOf(this.d, n6);
            this.w = Arrays.copyOf(this.w, n6);
            this.k = Arrays.copyOf(this.k, n6);
            this.Y = Arrays.copyOf(this.Y, n6);
        }
        this.l[this.Q] = n;
        this.d[this.Q] = n2;
        this.w[this.Q] = n3;
        this.k[this.Q] = n4;
        this.Y[this.Q] = n5;
        ++this.Q;
    }

    private static int[] N(class09761[] class09761Array) {
        int n;
        int n2 = class09761Array.length;
        int[] nArray = new int[n2];
        for (n = 0; n < n2; ++n) {
            nArray[n] = n;
        }
        for (n = 1; n < n2; ++n) {
            int n3 = nArray[n];
            int n4 = class09761Array[n3] == null ? -1 : class09761Array[n3].u();
            for (int i = n - 1; i >= 0 && (class09761Array[nArray[i]] == null ? -1 : class09761Array[nArray[i]].u()) < n4; --i) {
                nArray[i + 1] = nArray[i];
            }
            nArray[i + 1] = n3;
        }
        return nArray;
    }

    private void N(int n, class09761 class097612) {
        if (!this.G.add(n)) {
            return;
        }
        if (class097612.N()) {
            this.N(n, 0, 0, 0, 0);
            this.o.offer(class09742.N(n, class097612, 0, 0, 0, 0));
            return;
        }
        int n2 = class097612.L();
        int n3 = class097612.u();
        while (!this.t.N(n2, n3, 1, this.O)) {
            this.P();
        }
        int n4 = this.O[0];
        int n5 = this.O[1];
        this.t.N(class097612.y(), n2, n3, n4, n5);
        this.N(n, n2, n3, n4, n5);
        this.o.offer(class09742.N(n, class097612, n4, n5, n2, n3));
    }

    public static class09742 N(Path path, class09734 class097342, Executor executor) throws IOException {
        class09742 class097422 = new class09742(Files.readAllBytes(path), class097342, executor);
        class097422.U();
        return class097422;
    }

    private static class09750 N(int n, class09761 class097612, int n2, int n3, int n4, int n5) {
        return new class09750(n, (float)class097612.R(), (float)class097612.M(), (float)class097612.B(), (float)class097612.Z(), (float)class097612.z(), n2, n3, n4, n5, 0);
    }

    public void N(Path path) throws IOException {
        class09758.N(path, this.u, this.y, this.T, this.j);
    }

    private static Thread N(Runnable runnable, String string) {
        Thread thread = new Thread(runnable, string);
        thread.setDaemon(true);
        return thread;
    }

    private static long N(byte[] byArray) {
        long l = -3750763034362895579L;
        for (byte by : byArray) {
            l ^= (long)(by & 0xFF);
            l *= 1099511628211L;
        }
        return l;
    }

    private static void N(int n, Exception exception) {
        System.err.println("[FontAtlas] failed to bake U+" + Integer.toHexString(n) + ": " + String.valueOf(exception));
    }

    public void N(int n) {
        if (this.T.N(n) != -2) {
            return;
        }
        this.T.y(n);
        if (this.n == this.v.length) {
            this.v = Arrays.copyOf(this.v, this.v.length * 2);
        }
        this.v[this.n++] = n;
    }

    public class09731 N() {
        class09724 class097242;
        this.b.B();
        this.b.u = this.R;
        this.b.i = 0;
        this.b.y = this.j.N();
        this.b.L = this.j.y();
        while ((class097242 = this.o.poll()) != null) {
            if (class097242 instanceof class09750) {
                class09750 class097502 = (class09750)class097242;
                this.T.N(class097502);
                if (class097502.Z() <= 0) continue;
                this.b.N(class097502.M(), class097502.B(), class097502.Z(), class097502.z());
                continue;
            }
            if (!(class097242 instanceof class09720)) continue;
            class09720 class097202 = (class09720)class097242;
            this.N(class097202);
        }
        if (this.n > 0) {
            this.J.offer(Arrays.copyOf(this.v, this.n));
            this.n = 0;
        }
        return this.b;
    }

    public double N(int n, int n2) {
        int n3 = FreeType.FT_Get_Char_Index((FT_Face)this.E, (long)n);
        int n4 = FreeType.FT_Get_Char_Index((FT_Face)this.E, (long)n2);
        if (n3 == 0 || n4 == 0) {
            return 0.0;
        }
        if (!this.P.N()) {
            return (double)this.P.N(n3, n4) / (double)this.W;
        }
        if (this.m) {
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                FT_Vector fT_Vector = FT_Vector.malloc((MemoryStack)memoryStack);
                if (FreeType.FT_Get_Kerning((FT_Face)this.E, (int)n3, (int)n4, (int)2, (FT_Vector)fT_Vector) != 0) {
                    double d = 0.0;
                    return d;
                }
                double d = (double)fT_Vector.x() / (double)this.W;
                return d;
            }
        }
        return 0.0;
    }

    public static class09742 N(byte[] byArray, class09734 class097342, Executor executor) {
        class09742 class097422 = new class09742((byte[])byArray.clone(), class097342, executor);
        class097422.U();
        return class097422;
    }

    private void N(class09720 class097202) {
        int n;
        this.j = class097202.N();
        int[] nArray = class097202.i();
        int[] nArray2 = class097202.R();
        int[] nArray3 = class097202.M();
        int[] nArray4 = class097202.B();
        int[] nArray5 = class097202.Z();
        for (n = 0; n < class097202.z(); ++n) {
            int n2 = this.T.L(nArray[n]);
            if (n2 < 0) continue;
            this.T.N(n2, nArray2[n], nArray3[n], nArray4[n], nArray5[n], 0);
        }
        if (class097202.y() != null) {
            class097202.y().i();
        }
        this.b.N = true;
        this.b.y = this.j.N();
        this.b.L = this.j.y();
        this.b.Z();
        for (n = 0; n < class097202.z(); ++n) {
            if (nArray4[n] <= 0) continue;
            this.b.N(nArray2[n], nArray3[n], nArray4[n], nArray5[n]);
        }
    }

    public static class09742 N(Path path, class09734 class097342, Path path2, Executor executor) throws IOException {
        class09742 class097422 = new class09742(Files.readAllBytes(path), class097342, executor);
        class097422.y(path2);
        class097422.U();
        return class097422;
    }

    public boolean N(int n, float f, class09719 class097192) {
        int n2 = this.T.L(n);
        if (n2 >= 0) {
            this.T.N(n2, f, this.j.N(), this.j.y(), (float)this.B, (float)this.M, class097192);
            return true;
        }
        if (n2 == -1) {
            return false;
        }
        this.N(n);
        return false;
    }

    public static class09742 N(byte[] byArray, class09734 class097342, Path path, Executor executor) {
        class09742 class097422 = new class09742((byte[])byArray.clone(), class097342, executor);
        class097422.y(path);
        class097422.U();
        return class097422;
    }

    private void N(int[] nArray) {
        int exception;
        int nArray2;
        int n2 = 0;
        int[] objectArray = nArray;
        int completableFutureArray = objectArray.length;
        for (nArray2 = 0; nArray2 < completableFutureArray; ++nArray2) {
            exception = objectArray[nArray2];
            if (this.G.contains(exception)) continue;
            nArray[n2++] = exception;
        }
        if (n2 == 0) {
            return;
        }
        class09761[] class09761Array = new class09761[n2];
        CompletableFuture[] completableFutureArray2 = new CompletableFuture[n2];
        for (nArray2 = 0; nArray2 < n2; ++nArray2) {
            exception = nArray[nArray2];
            completableFutureArray2[nArray2] = CompletableFuture.supplyAsync(() -> this.u(n3), this.q);
        }
        for (nArray2 = 0; nArray2 < n2; ++nArray2) {
            try {
                class09761Array[nArray2] = (class09761)((Object)completableFutureArray2[nArray2].get());
                continue;
            }
            catch (Exception i) {
                class09761Array[nArray2] = null;
                class09742.N(nArray[nArray2], i);
            }
        }
        int[] nArray3 = class09742.N(class09761Array);
        for (int i = 0; i < n2; ++i) {
            int n = nArray3[i];
            if (class09761Array[n] == null) continue;
            this.N(nArray[n], class09761Array[n]);
        }
    }

    private void N(class09745 class097452) {
        this.K.offer(class097452);
    }

    private void W() {
        try {
            int[] nArray;
            if (this.I != null) {
                nArray = class09742.N(this.I);
                for (int i = 0; i < this.I.length; ++i) {
                    int n = nArray[i];
                    if (this.I[n] == null) continue;
                    this.N(this.g[n], this.I[n]);
                }
                this.I = null;
                this.g = null;
            }
            while ((nArray = this.J.take()) != N) {
                this.N(nArray);
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public int R() {
        return this.R;
    }
}

