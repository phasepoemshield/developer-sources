/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL10
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viaaprilfools.api.AprilFoolsProtocolVersion;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import javax.sound.sampled.AudioFormat;
import minecraft.class06283;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL10;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06312 {
    private @Nullable ByteBuffer N;
    private final AudioFormat y;
    private boolean L;
    private int u;

    private void L(ByteBuffer byteBuffer) {
        short s = 0;
        short s2 = 0;
        int n = 0;
        while (byteBuffer.hasRemaining()) {
            if (n == 0) {
                byteBuffer.mark();
                s = (short)(byteBuffer.getShort() & 0xFFFFFFFC);
                s2 = (short)(byteBuffer.getShort() & 0xFFFFFFFC);
                byteBuffer.reset();
                n = 15;
            } else {
                --n;
            }
            byteBuffer.putShort(s);
            byteBuffer.putShort(s2);
        }
        byteBuffer.flip();
    }

    public OptionalInt L() {
        OptionalInt optionalInt = this.N();
        this.L = false;
        return optionalInt;
    }

    public class06312(ByteBuffer byteBuffer, AudioFormat audioFormat) {
        this.N = byteBuffer;
        this.y = audioFormat;
        this.N(byteBuffer, audioFormat, null);
    }

    public void y() {
        if (this.L) {
            AL10.alDeleteBuffers((int[])new int[]{this.u});
            if (class06283.N("Deleting stream buffers")) {
                return;
            }
        }
        this.L = false;
    }

    private void y(ByteBuffer byteBuffer) {
        short s = 0;
        int n = 0;
        while (byteBuffer.hasRemaining()) {
            if (n == 0) {
                byteBuffer.mark();
                s = (short)(byteBuffer.getShort() & 0xFFFFFFFC);
                byteBuffer.reset();
                n = 15;
            } else {
                --n;
            }
            byteBuffer.putShort(s);
        }
        byteBuffer.flip();
    }

    private void N(ByteBuffer byteBuffer, AudioFormat audioFormat, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)AprilFoolsProtocolVersion.s3d_shareware)) {
            this.N(byteBuffer);
        }
    }

    private void N(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        if (this.y.getChannels() == 1) {
            this.y(byteBuffer);
        } else {
            this.L(byteBuffer);
        }
    }

    OptionalInt N() {
        if (!this.L) {
            if (this.N == null) {
                return OptionalInt.empty();
            }
            int n = class06283.N(this.y);
            int[] nArray = new int[1];
            AL10.alGenBuffers((int[])nArray);
            if (class06283.N("Creating buffer")) {
                return OptionalInt.empty();
            }
            AL10.alBufferData((int)nArray[0], (int)n, (ByteBuffer)this.N, (int)((int)this.y.getSampleRate()));
            if (class06283.N("Assigning buffer data")) {
                return OptionalInt.empty();
            }
            this.u = nArray[0];
            this.L = true;
            this.N = null;
        }
        return OptionalInt.of(this.u);
    }
}

