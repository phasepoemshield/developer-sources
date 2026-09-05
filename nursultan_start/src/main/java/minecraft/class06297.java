/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class06889
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL10
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sound.sampled.AudioFormat;
import minecraft.class06283;
import minecraft.class06304;
import minecraft.class06312;
import minecraft.class06889;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;
import org.slf4j.Logger;

public class class06297 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 4;
    public static final int N = 1;
    private final int u;
    private final AtomicBoolean i = new AtomicBoolean(true);
    private int R = 16384;
    private @Nullable class06304 M;

    public void L() {
        AL10.alSourcePlay((int)this.u);
    }

    public void L(float f) {
        AL10.alSourcei((int)this.u, (int)53248, (int)53251);
        AL10.alSourcef((int)this.u, (int)4131, (float)f);
        AL10.alSourcef((int)this.u, (int)4129, (float)1.0f);
        AL10.alSourcef((int)this.u, (int)4128, (float)0.0f);
    }

    public boolean M() {
        return this.U() == 4114;
    }

    private class06297(int n) {
        this.u = n;
    }

    public boolean B() {
        return this.U() == 4116;
    }

    public void Z() {
        AL10.alSourcei((int)this.u, (int)53248, (int)0);
    }

    public void i() {
        if (this.U() == 4115) {
            AL10.alSourcePlay((int)this.u);
        }
    }

    private int U() {
        if (!this.i.get()) {
            return 4116;
        }
        return AL10.alGetSourcei((int)this.u, (int)4112);
    }

    public void z() {
        if (this.M != null) {
            int n = this.E();
            this.N(n);
        }
    }

    public void u() {
        if (this.U() == 4114) {
            AL10.alSourcePause((int)this.u);
        }
    }

    public void y(boolean bl) {
        AL10.alSourcei((int)this.u, (int)514, (int)(bl ? 1 : 0));
    }

    public void y(float f) {
        AL10.alSourcef((int)this.u, (int)4106, (float)f);
    }

    public void y() {
        if (this.i.compareAndSet(true, false)) {
            AL10.alSourceStop((int)this.u);
            class06283.N("Stop");
            if (this.M != null) {
                try {
                    this.M.close();
                }
                catch (IOException iOException) {
                    y.error("Failed to close audio stream", (Throwable)iOException);
                }
                this.E();
                this.M = null;
            }
            AL10.alDeleteSources((int[])new int[]{this.u});
            class06283.N("Cleanup");
        }
    }

    private int E() {
        int n = AL10.alGetSourcei((int)this.u, (int)4118);
        if (n > 0) {
            int[] nArray = new int[n];
            AL10.alSourceUnqueueBuffers((int)this.u, (int[])nArray);
            class06283.N("Unqueue buffers");
            AL10.alDeleteBuffers((int[])nArray);
            class06283.N("Remove processed buffers");
        }
        return n;
    }

    static @Nullable class06297 N() {
        int[] nArray = new int[1];
        AL10.alGenSources((int[])nArray);
        if (class06283.N("Allocate new source")) {
            return null;
        }
        return new class06297(nArray[0]);
    }

    public void N(class06889 class068892) {
        AL10.alSourcefv((int)this.u, (int)4100, (float[])new float[]{(float)class068892.M, (float)class068892.B, (float)class068892.Z});
    }

    private void N(int n2) {
        if (this.M != null) {
            try {
                for (int i = 0; i < n2; ++i) {
                    ByteBuffer byteBuffer = this.M.N(this.R);
                    if (byteBuffer == null) continue;
                    new class06312(byteBuffer, this.M.N()).L().ifPresent(n -> AL10.alSourceQueueBuffers((int)this.u, (int[])new int[]{n}));
                }
            }
            catch (IOException iOException) {
                y.error("Failed to read from audio stream", (Throwable)iOException);
            }
        }
    }

    public void N(float f) {
        AL10.alSourcef((int)this.u, (int)4099, (float)f);
    }

    public void N(boolean bl) {
        AL10.alSourcei((int)this.u, (int)4103, (int)(bl ? 1 : 0));
    }

    public void N(class06312 class063122) {
        class063122.N().ifPresent(n -> AL10.alSourcei((int)this.u, (int)4105, (int)n));
    }

    public void N(class06304 class063042) {
        this.M = class063042;
        AudioFormat audioFormat = class063042.N();
        this.R = class06297.N(audioFormat, 1);
        this.N(4);
    }

    private static int N(AudioFormat audioFormat, int n) {
        return (int)((float)(n * audioFormat.getSampleSizeInBits()) / 8.0f * (float)audioFormat.getChannels() * audioFormat.getSampleRate());
    }

    public void R() {
        if (this.i.get()) {
            AL10.alSourceStop((int)this.u);
            class06283.N("Stop");
        }
    }
}

