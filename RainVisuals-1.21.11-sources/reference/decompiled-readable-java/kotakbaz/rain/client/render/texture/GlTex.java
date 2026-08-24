/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture;

public interface GlTex {
    public void unBind();

    public int getHeight();

    public int getTexId();

    public int getWidth();

    public void delete();

    public void bind();
}

