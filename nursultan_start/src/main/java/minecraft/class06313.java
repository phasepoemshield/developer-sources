/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04995
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.openal.AL
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALC11
 *  org.lwjgl.openal.ALCCapabilities
 *  org.lwjgl.openal.ALCapabilities
 *  org.lwjgl.openal.ALUtil
 *  org.lwjgl.system.MemoryStack
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.nio.IntBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.OptionalLong;
import minecraft.class04995;
import minecraft.class06283;
import minecraft.class06291;
import minecraft.class06294;
import minecraft.class06297;
import minecraft.class06302;
import minecraft.class06310;
import minecraft.class06319;
import org.jspecify.annotations.Nullable;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;

public class class06313 {
    static final Logger N = LogUtils.getLogger();
    private static final int y = 0;
    private static final int L = 30;
    private long u;
    private long i;
    private boolean R;
    private @Nullable String M;
    private static final class06302 B = new class06291();
    private class06302 Z = B;
    private class06302 z = B;
    private final class06310 U = new class06310();

    public synchronized boolean L() {
        String string = class06313.N();
        if (Objects.equals(this.M, string)) {
            return false;
        }
        this.M = string;
        return true;
    }

    public List<String> M() {
        List var1 = ALUtil.getStringList((long)0L, (int)4115);
        if (var1 == null) {
            return Collections.emptyList();
        }
        return var1;
    }

    public class06313() {
        this.M = class06313.N();
    }

    public boolean B() {
        return this.R && ALC11.alcGetInteger((long)this.u, (int)787) == 0;
    }

    private int Z() {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            int n = ALC10.alcGetInteger((long)this.u, (int)4098);
            if (class06283.N(this.u, "Get attributes size")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            IntBuffer intBuffer = memoryStack.mallocInt(n);
            ALC10.alcGetIntegerv((long)this.u, (int)4099, (IntBuffer)intBuffer);
            if (class06283.N(this.u, "Get attributes")) {
                throw new IllegalStateException("Failed to get OpenAL attributes");
            }
            int n2 = 0;
            while (n2 < n) {
                int n3;
                if ((n3 = intBuffer.get(n2++)) == 0) {
                    break;
                }
                int n4 = intBuffer.get(n2++);
                if (n3 != 4112) continue;
                int n5 = n4;
                return n5;
            }
        }
        return 30;
    }

    public class06310 i() {
        return this.U;
    }

    public void u() {
        this.Z.y();
        this.z.y();
        ALC10.alcDestroyContext((long)this.i);
        if (this.u != 0L) {
            ALC10.alcCloseDevice((long)this.u);
        }
    }

    private static OptionalLong y(@Nullable String string) {
        long l = ALC10.alcOpenDevice((CharSequence)string);
        if (l != 0L && !class06283.N(l, "Open device")) {
            return OptionalLong.of(l);
        }
        return OptionalLong.empty();
    }

    public String y() {
        String string = ALC10.alcGetString((long)this.u, (int)4115);
        if (string == null) {
            string = ALC10.alcGetString((long)this.u, (int)4101);
        }
        if (string == null) {
            string = "Unknown";
        }
        return string;
    }

    public void N(class06297 class062972) {
        if (!this.Z.N(class062972) && !this.z.N(class062972)) {
            throw new IllegalStateException("Tried to release unknown channel");
        }
    }

    public static @Nullable String N() {
        if (!ALC10.alcIsExtensionPresent((long)0L, (CharSequence)"ALC_ENUMERATE_ALL_EXT")) {
            return null;
        }
        ALUtil.getStringList((long)0L, (int)4115);
        return ALC10.alcGetString((long)0L, (int)4114);
    }

    public void N(@Nullable String string, boolean bl) {
        this.u = class06313.N(string);
        this.R = false;
        ALCCapabilities aLCCapabilities = ALC.createCapabilities((long)this.u);
        if (class06283.N(this.u, "Get capabilities")) {
            throw new IllegalStateException("Failed to get OpenAL capabilities");
        }
        if (!aLCCapabilities.OpenALC11) {
            throw new IllegalStateException("OpenAL 1.1 not supported");
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            IntBuffer intBuffer = this.N(memoryStack, aLCCapabilities.ALC_SOFT_HRTF && bl);
            this.i = ALC10.alcCreateContext((long)this.u, (IntBuffer)intBuffer);
        }
        if (class06283.N(this.u, "Create context")) {
            throw new IllegalStateException("Unable to create OpenAL context");
        }
        ALC10.alcMakeContextCurrent((long)this.i);
        int n = this.Z();
        int n2 = class04995.N((int)((int)class04995.N((float)n)), (int)2, (int)8);
        int n3 = class04995.N((int)(n - n2), (int)8, (int)255);
        this.Z = new class06294(n3);
        this.z = new class06294(n2);
        ALCapabilities aLCapabilities = AL.createCapabilities((ALCCapabilities)aLCCapabilities);
        class06283.N("Initialization");
        if (!aLCapabilities.AL_EXT_source_distance_model) {
            throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
        }
        AL10.alEnable((int)512);
        if (!aLCapabilities.AL_EXT_LINEAR_DISTANCE) {
            throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
        }
        class06283.N("Enable per-source distance models");
        N.info("OpenAL initialized on device {}", (Object)this.y());
        this.R = ALC10.alcIsExtensionPresent((long)this.u, (CharSequence)"ALC_EXT_disconnect");
    }

    private IntBuffer N(MemoryStack memoryStack, boolean bl) {
        int n = 5;
        IntBuffer intBuffer = memoryStack.callocInt(11);
        if (ALC10.alcGetInteger((long)this.u, (int)6548) > 0) {
            intBuffer.put(6546).put(bl ? 1 : 0);
            intBuffer.put(6550).put(0);
        }
        intBuffer.put(6554).put(1);
        return intBuffer.put(0).flip();
    }

    private static long N(@Nullable String string) {
        OptionalLong optionalLong = OptionalLong.empty();
        if (string != null) {
            optionalLong = class06313.y(string);
        }
        if (optionalLong.isEmpty()) {
            optionalLong = class06313.y(class06313.N());
        }
        if (optionalLong.isEmpty()) {
            optionalLong = class06313.y(null);
        }
        if (optionalLong.isEmpty()) {
            throw new IllegalStateException("Failed to open OpenAL device");
        }
        return optionalLong.getAsLong();
    }

    public @Nullable class06297 N(class06319 class063192) {
        return (class063192 == class06319.field_18353 ? this.z : this.Z).N();
    }

    public String R() {
        return String.format(Locale.ROOT, "Sounds: %d/%d + %d/%d", this.Z.u(), this.Z.L(), this.z.u(), this.z.L());
    }
}

