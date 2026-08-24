/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import kotakbaz.rain.client.render.texture.GlTex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0002H\u0096\u0080\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u001c\u00a8\u0006\u001d"}, d2={"Loxxxde/\u0638\u0628;", "", "", "textureId", "Loxxxde/\u0637\u062c;", "glTex", "<init>", "(ILkotakbaz/rain/client/render/texture/GlTex;)V", "(I)V", "(Lkotakbaz/rain/client/render/texture/GlTex;)V", "Loxxxde/\u062e\u0629;", "uniform", "", "apply", "(Lkotakbaz/rain/client/render/main/program/uniform/uniforms/sampler/SamplerUniform;)V", "id", "", "hasTextureId", "(I)Z", "texture", "hasGlTex", "(Lkotakbaz/rain/client/render/texture/GlTex;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "Loxxxde/\u0637\u062c;", "rain-visuals"})
public final class TextureSampler {
    @Nullable
    private final GlTex glTex;
    private final int textureId;

    public TextureSampler(@NotNull GlTex glTex) {
        Intrinsics.checkNotNullParameter(glTex, "glTex");
        this(0, glTex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextureSampler)) {
            return false;
        }
        if (this.glTex != null || ((TextureSampler)other).glTex != null) {
            return this.glTex == ((TextureSampler)other).glTex;
        }
        return this.textureId == ((TextureSampler)other).textureId;
    }

    public final boolean hasGlTex(@NotNull GlTex texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        return this.glTex == texture;
    }

    public int hashCode() {
        int n;
        GlTex glTex = this.glTex;
        if (glTex != null) {
            GlTex p0 = glTex;
            boolean bl = false;
            n = System.identityHashCode(p0);
        } else {
            n = this.textureId;
        }
        return n;
    }

    public final void apply(@NotNull SamplerUniform uniform) {
        Intrinsics.checkNotNullParameter(uniform, "uniform");
        GlTex texture = this.glTex;
        if (texture != null) {
            uniform.set(texture);
        } else {
            uniform.set(this.textureId);
        }
    }

    public final boolean hasTextureId(int id) {
        return this.glTex == null && this.textureId == id;
    }

    private TextureSampler(int textureId, GlTex glTex) {
        this.textureId = textureId;
        this.glTex = glTex;
    }

    public TextureSampler(int textureId) {
        this(textureId, null);
    }
}

