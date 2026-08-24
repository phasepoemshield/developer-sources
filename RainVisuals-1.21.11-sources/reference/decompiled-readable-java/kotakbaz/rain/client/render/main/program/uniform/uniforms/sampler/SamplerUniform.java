/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  lombok.Generated
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.client.texture.GlTextureView
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import com.mojang.blaze3d.opengl.GlStateManager;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a;
import kotakbaz.rain.client.render.texture.GlTex;
import lombok.Generated;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0637\u064a;

public class SamplerUniform
extends \u0637\u064a {
    private static final byte GL_TEX = 1;
    private int textureId;
    private static final byte NONE = 0;
    private final int samplerId;
    private a<Object> customUploader;
    private byte valueType = 0;
    private GlTexture glTexture;
    private GlTextureView glTextureView;
    private static final byte CUSTOM = 5;
    private static final byte TEXTURE_ID = 4;
    private Object customTexture;
    private static final byte GL_TEXTURE_VIEW = 2;
    private GlTex glTex;
    private static final byte GL_TEXTURE = 3;

    public void set(GlTexture texture) {
        this.valueType = (byte)3;
        this.glTexture = texture;
        this.program.addUpdatedUniform(this);
    }

    @Override
    public void upload() {
        if (this.valueType == 0) {
            return;
        }
        GL20.glUniform1i((int)this.location, (int)this.getSamplerId());
        switch (this.valueType) {
            case 1: {
                GlStateManager._activeTexture((int)(33984 + this.samplerId));
                GlStateManager._bindTexture((int)this.glTex.getTexId());
                break;
            }
            case 2: {
                int target;
                GlStateManager._activeTexture((int)(33984 + this.samplerId));
                GlTexture texture = this.glTextureView.texture();
                if ((texture.usage() & 0x10) != 0) {
                    target = 34067;
                    GL11.glBindTexture((int)target, (int)texture.getGlId());
                } else {
                    target = 3553;
                    GlStateManager._bindTexture((int)texture.getGlId());
                }
                GlStateManager._texParameter((int)target, (int)33084, (int)this.glTextureView.baseMipLevel());
                GlStateManager._texParameter((int)target, (int)33085, (int)(this.glTextureView.baseMipLevel() + this.glTextureView.mipLevels() - 1));
                break;
            }
            case 3: {
                GlStateManager._activeTexture((int)(33984 + this.samplerId));
                if ((this.glTexture.usage() & 0x10) != 0) {
                    GL11.glBindTexture((int)34067, (int)this.glTexture.getGlId());
                    break;
                }
                GlStateManager._bindTexture((int)this.glTexture.getGlId());
                break;
            }
            case 4: {
                GlStateManager._activeTexture((int)(33984 + this.samplerId));
                GlStateManager._bindTexture((int)this.textureId);
                break;
            }
            case 5: {
                if (this.customUploader == null) break;
                this.customUploader.uploadConsumer().accept(this, this.customTexture);
                break;
            }
        }
    }

    public SamplerUniform(String name, int location, GlProgram glProgram) {
        super(name, location, glProgram);
        this.samplerId = glProgram.getSamplersAmount() + 1;
        glProgram.setSamplersAmount(this.samplerId);
    }

    public void set(GlTextureView textureView) {
        this.valueType = (byte)2;
        this.glTextureView = textureView;
        this.program.addUpdatedUniform(this);
    }

    @Generated
    public int getSamplerId() {
        return this.samplerId;
    }

    public void set(int textureId) {
        this.valueType = (byte)4;
        this.textureId = textureId;
        this.program.addUpdatedUniform(this);
    }

    public void set(GlTex texture) {
        this.valueType = 1;
        this.glTex = texture;
        this.program.addUpdatedUniform(this);
    }

    public <T> void set(a<T> applier, T texture) {
        this.setUnchecked(applier, texture);
    }

    private <T> void setUnchecked(a<T> uploader, T texture) {
        this.valueType = (byte)5;
        this.customUploader = uploader;
        this.customTexture = texture;
        this.program.addUpdatedUniform(this);
    }
}

