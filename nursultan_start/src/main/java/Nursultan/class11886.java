/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11369
 *  Nursultan.class11932
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.EXTThreadLocalContext
 */
package Nursultan;

import Nursultan.class11369;
import Nursultan.class11885;
import Nursultan.class11901;
import Nursultan.class11916;
import Nursultan.class11932;
import Nursultan.class11938;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.EXTThreadLocalContext;

public class class11886 {
    private static String[] B;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;

    private static float L() {
        return ((Float)class11938.u().NB().m().i()).floatValue() / 100.0f;
    }

    private static boolean M() {
        return !class11938.u().NB().U();
    }

    private class11886() {
        throw new UnsupportedOperationException(B[5]);
    }

    static {
        class11886.U();
        class11886.N();
        N_0 = LogManager.getLogger(String.class);
        N_2 = Executors.newSingleThreadExecutor(runnable -> {
            Thread thread = new Thread(runnable, B[6]);
            thread.setDaemon(true);
            return thread;
        });
        N_3 = new class11932();
        N_4 = new HashMap();
        N_5 = new ArrayList();
    }

    private static int B() {
        Iterator iterator = ((List)N_5).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (AL10.alGetSourcei((int)n, (int)4112) == 4114) continue;
            return n;
        }
        if (((List)N_5).size() < 16) {
            int n = AL10.alGenSources();
            if (n != 0) {
                ((List)N_5).add(n);
            }
            return n;
        }
        int n = (Integer)((List)N_5).getFirst();
        AL10.alSourceStop((int)n);
        return n;
    }

    private static boolean i() {
        if (((Boolean)N_6).booleanValue()) {
            return true;
        }
        if (((Boolean)N_7).booleanValue()) {
            return false;
        }
        try {
            long l = ALC10.alcOpenDevice((ByteBuffer)null);
            if (l == 0L) {
                N_7 = true;
                ((Logger)N_0).error(B[1]);
                return false;
            }
            long l2 = ALC10.alcCreateContext((long)l, (IntBuffer)null);
            if (l2 == 0L) {
                N_7 = true;
                ((Logger)N_0).error(B[2]);
                ALC10.alcCloseDevice((long)l);
                return false;
            }
            ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)l);
            if (!(aLCCapabilities.ALC_EXT_thread_local_context ? EXTThreadLocalContext.alcSetThreadContext((long)l2) : ALC10.alcMakeContextCurrent((long)l2))) {
                N_7 = true;
                ((Logger)N_0).error(B[3]);
                ALC10.alcDestroyContext((long)l2);
                ALC10.alcCloseDevice((long)l);
                return false;
            }
            AL.createCapabilities((ALCCapabilities)aLCCapabilities);
            N_6 = true;
            return true;
        }
        catch (Throwable throwable) {
            N_7 = true;
            ((Logger)N_0).error(B[4], throwable);
            return false;
        }
    }

    private static void U() {
        B = new String[7];
        class11886.B[0] = "Failed to load sound";
        class11886.B[1] = "Failed to open OpenAL device";
        class11886.B[2] = "Failed to create OpenAL context";
        class11886.B[3] = "Failed to make OpenAL context current";
        class11886.B[4] = "Failed to initialize OpenAL sound backend";
        class11886.B[5] = "This is a utility class and cannot be instantiated";
        class11886.B[6] = "nursultan-sound";
    }

    private static void y(String string, class11916 class119162, float f) {
        int n;
        if (!class11886.i()) {
            return;
        }
        Integer n2 = (Integer)((Map)N_4).get(string);
        if (n2 == null) {
            n2 = class11886.N(class119162);
            if (n2 == null) {
                return;
            }
            ((Map)N_4).put(string, n2);
        }
        if ((n = class11886.B()) == 0) {
            return;
        }
        AL10.alSourcei((int)n, (int)4105, (int)n2);
        AL10.alSourcef((int)n, (int)4106, (float)f);
        AL10.alSourcePlay((int)n);
    }

    public static void y(Path path) {
        if (class11886.M()) {
            return;
        }
        class11886.N(path.toString(), () -> Files.newInputStream(path, new OpenOption[0]));
    }

    private static Integer N(class11916 class119162) {
        Integer n;
        block8: {
            InputStream inputStream = class119162.open();
            try {
                class11885 class118852 = ((class11932)N_3).N(inputStream);
                int n2 = AL10.alGenBuffers();
                AL10.alBufferData((int)n2, (int)class11886.N(class118852.L(), class118852.y()), (ByteBuffer)class118852.u(), (int)class118852.N());
                n = n2;
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    ((Logger)N_0).error(B[0], (Throwable)exception);
                    return null;
                }
            }
            inputStream.close();
        }
        return n;
    }

    public static void N(class11901 class119012) {
        if (class11886.M()) {
            return;
        }
        class11886.N(class119012.name(), class119012::N);
        class11938.L().L(new class11369(class119012));
    }

    private static int N(int n, int n2) {
        boolean bl;
        boolean bl2 = bl = n2 == 8;
        if (n == 1) {
            return bl ? 4352 : 4353;
        }
        return bl ? 4354 : 4355;
    }

    private static void N() {
        N_1 = 16;
        N_6 = false;
        N_7 = false;
    }

    public static void N(Path path) {
        String string = path.toString();
        ((ExecutorService)N_2).execute(() -> {
            Integer n = (Integer)((Map)N_4).remove(string);
            if (n != null) {
                AL10.alDeleteBuffers((int)n);
            }
        });
    }

    private static void N(String string, class11916 class119162) {
        float f = class11886.L();
        ((ExecutorService)N_2).execute(() -> class11886.y(string, class119162, f));
    }
}

