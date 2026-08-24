/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.stb.STBImage
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.texture.texture;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Random;
import kotakbaz.rain.client.render.texture.GlTex;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryUtil;
import oxxxde.\u062c\u0634;
import oxxxde.\u0630\u0646;
import oxxxde.\u0632\u0622;
import oxxxde.\u0634\u0623;
import oxxxde.\u0636\u0648;
import oxxxde.\u0636\u0651;

public class GLTexture
implements GlTex {
    protected int width;
    protected \u0632\u0622 filtering;
    protected \u0636\u0648 colorMode;
    protected \u062c\u0634 wrapping;
    protected final String name;
    protected int height;
    protected int texId;

    public GLTexture subTexture(float u1, float v1, float u2, float v2) {
        \u0636\u0651 controller = \u0634\u0623.getGlController();
        Object[] objectArray = new Object[1];
        objectArray[0] = new Random().nextInt();
        GLTexture texture = new GLTexture(this.name.concat(String.format("_sub_%s", objectArray)));
        controller.run(() -> {
            void var7_7;
            void var2_2;
            void var1_1;
            texture.texId = controller.genTexId();
            int fbo = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer((int)36160, (int)fbo);
            GL30.glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)this.texId, (int)0);
            if (GL30.glCheckFramebufferStatus((int)36160) != 36053) {
                Object[] objectArray = new Object[1];
                objectArray[0] = texture.getName();
                throw new RuntimeException(String.format("An error occurred while creating FrameBuffer for subtexture '%s'.", objectArray));
            }
            texture.width = (int)((u2 - u1) * (float)this.width);
            texture.height = (int)((v2 - v1) * (float)this.height);
            controller.bindTexture(texture.texId);
            controller.texParameter(3553, 33085, 0);
            controller.texParameter(3553, 33082, 0);
            controller.texParameter(3553, 33083, 0);
            controller.texParameter(3553, 34049, 0.0f);
            texture.applyFiltering(controller, this.filtering);
            texture.applyWrapping(controller, this.wrapping);
            texture.colorMode = this.colorMode;
            controller.texImage2D(3553, 0, texture.colorMode.glId, texture.width, texture.height, 0, texture.colorMode.glId, 5121, null);
            controller.pixelStore(3314, 0);
            controller.pixelStore(3316, 0);
            controller.pixelStore(3315, 0);
            controller.pixelStore(3317, 4);
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)((int)(u1 * (float)this.width)), (int)((int)(v1 * (float)this.height)), (int)var1_1.width, (int)var1_1.height);
            var2_2.bindTexture(0);
            GL30.glBindFramebuffer((int)36160, (int)0);
            GL30.glDeleteFramebuffers((int)var7_7);
        });
        return texture;
    }

    private void applyFiltering(\u0636\u0651 controller, \u0632\u0622 textureFiltering) {
        controller.texParameter(3553, 10240, textureFiltering.id);
        controller.texParameter(3553, 10241, textureFiltering.id);
        this.filtering = textureFiltering;
    }

    @Override
    public void bind() {
        \u0634\u0623.getGlController().bindTexture(this.getTexId());
    }

    @Override
    public void delete() {
        \u0634\u0623.getGlController().deleteTexture(this.texId);
        \u0634\u0623.removeTexture(this);
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    private GLTexture create(\u0630\u0646 glTextureInfo) {
        \u0636\u0651 controller = \u0634\u0623.getGlController();
        controller.run(() -> {
            void var2_2;
            this.texId = controller.genTexId();
            long bufferAddress = MemoryUtil.memAddress((ByteBuffer)glTextureInfo.getPixels());
            this.width = glTextureInfo.getWidth();
            this.height = glTextureInfo.getHeight();
            controller.bindTexture(this.texId);
            controller.texParameter(3553, 33085, 0);
            controller.texParameter(3553, 33082, 0);
            controller.texParameter(3553, 33083, 0);
            controller.texParameter(3553, 34049, 0.0f);
            this.applyFiltering(controller, glTextureInfo.getFiltering());
            this.applyWrapping(controller, glTextureInfo.getWrapping());
            this.colorMode = glTextureInfo.getColorMode();
            controller.texImage2D(3553, 0, glTextureInfo.getColorMode().glId, this.width, this.height, 0, glTextureInfo.getColorMode().glId, 5121, null);
            controller.pixelStore(3314, 0);
            controller.pixelStore(3316, 0);
            controller.pixelStore(3315, 0);
            controller.pixelStore(3317, 4);
            controller.texSubImage2D(3553, 0, 0, 0, this.width, this.height, glTextureInfo.getColorMode().glId, 5121, bufferAddress);
            controller.bindTexture(0);
            if (var2_2.isUsingStb()) {
                void var3_3;
                STBImage.nstbi_image_free((long)var3_3);
            } else {
                MemoryUtil.memFree((Buffer)var2_2.getPixels());
            }
        });
        return this;
    }

    private void applyWrapping(\u0636\u0651 controller, \u062c\u0634 textureWrapping) {
        controller.texParameter(3553, 10242, textureWrapping.id);
        controller.texParameter(3553, 10243, textureWrapping.id);
        this.wrapping = textureWrapping;
    }

    protected GLTexture(String name) {
        this.name = name;
        \u0634\u0623.addTexture(this);
    }

    @Override
    public void unBind() {
        \u0634\u0623.getGlController().bindTexture(0);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getTexId() {
        return this.texId;
    }

    public static GLTexture of(String name, \u0630\u0646 glTextureInfo) {
        return new GLTexture(name).create(glTextureInfo);
    }
}

