/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class03505
 *  minecraft.class04284
 *  minecraft.class05852
 *  minecraft.class05855
 *  minecraft.class06246
 *  minecraft.class06254
 *  minecraft.class06262
 *  minecraft.class06270
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.freetype.FT_Face
 *  org.lwjgl.util.freetype.FreeType
 */
package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class03505;
import minecraft.class04284;
import minecraft.class05852;
import minecraft.class05855;
import minecraft.class06246;
import minecraft.class06254;
import minecraft.class06262;
import minecraft.class06270;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public final class class03492
extends Record
implements class06270 {
    private final class01894 location;
    private final float size;
    private final float oversample;
    private final class03505 shift;
    private final String skip;
    private static final Codec<String> B = Codec.withAlternative((Codec)Codec.STRING, (Codec)Codec.STRING.listOf(), list -> String.join((CharSequence)"", list));
    public static final MapCodec<class03492> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("file").forGetter(class03492::L), (App)Codec.FLOAT.optionalFieldOf("size", (Object)Float.valueOf(11.0f)).forGetter(class03492::u), (App)Codec.FLOAT.optionalFieldOf("oversample", (Object)Float.valueOf(1.0f)).forGetter(class03492::i), (App)class03505.u.optionalFieldOf("shift", (Object)class03505.L).forGetter(class03492::R), (App)B.optionalFieldOf("skip", (Object)"").forGetter(class03492::M)).apply(instance, class03492::new));

    public class01894 L() {
        return this.location;
    }

    public String M() {
        return this.skip;
    }

    public class03492(class01894 class018942, float f, float f2, class03505 class035052, String string) {
        this.location = class018942;
        this.size = f;
        this.oversample = f2;
        this.shift = class035052;
        this.skip = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03492.class, "location;size;oversample;shift;skip", "location", "size", "oversample", "shift", "skip"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03492.class, "location;size;oversample;shift;skip", "location", "size", "oversample", "shift", "skip"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03492.class, "location;size;oversample;shift;skip", "location", "size", "oversample", "shift", "skip"}, this);
    }

    public float i() {
        return this.oversample;
    }

    public float u() {
        return this.size;
    }

    public Either<class06246, class06254> y() {
        return Either.left(this::N);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private class06262 N(class01089 class010892) throws IOException {
        FT_Face fT_Face = null;
        ByteBuffer byteBuffer = null;
        try (InputStream inputStream = class010892.u(this.location.R("font/"));){
            byteBuffer = TextureUtil.readResource((InputStream)inputStream);
            Object object = class04284.N;
            synchronized (object) {
                PointerBuffer pointerBuffer;
                try (Object object2 = MemoryStack.stackPush();){
                    pointerBuffer = object2.mallocPointer(1);
                    class04284.N((int)FreeType.FT_New_Memory_Face((long)class04284.N(), (ByteBuffer)byteBuffer, (long)0L, (PointerBuffer)pointerBuffer), (String)"Initializing font face");
                    fT_Face = FT_Face.create((long)pointerBuffer.get());
                }
                object2 = FreeType.FT_Get_Font_Format((FT_Face)fT_Face);
                if (!"TrueType".equals(object2)) {
                    throw new IOException("Font is not in TTF format, was " + (String)object2);
                }
                class04284.N((int)FreeType.FT_Select_Charmap((FT_Face)fT_Face, (int)FreeType.FT_ENCODING_UNICODE), (String)"Find unicode charmap");
                pointerBuffer = new class05852(byteBuffer, fT_Face, this.size, this.oversample, this.shift.N(), this.shift.y(), this.skip);
                return pointerBuffer;
            }
        }
        catch (Exception exception) {
            Object object = class04284.N;
            synchronized (object) {
                if (fT_Face != null) {
                    FreeType.FT_Done_Face(fT_Face);
                }
            }
            MemoryUtil.memFree((Buffer)byteBuffer);
            throw exception;
        }
    }

    public class05855 N() {
        return class05855.field_2317;
    }

    public class03505 R() {
        return this.shift;
    }
}

