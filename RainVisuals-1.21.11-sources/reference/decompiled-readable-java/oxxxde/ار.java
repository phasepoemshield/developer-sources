/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.client.render.texture.GlTex;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import oxxxde.\u0630\u0635;

public class \u0627\u0631
implements GlTex {
    private long lastTime;
    private final String name;
    private int updateDelayMillis;
    private GLTexture currentTexture;
    private final List<GLTexture> textures = new ArrayList<GLTexture>();
    private Iterator<GLTexture> iterator;

    protected \u0627\u0631(String name) {
        this.name = name;
    }

    @Override
    public void unBind() {
        this.currentTexture.unBind();
    }

    @Override
    public void bind() {
        this.currentTexture.bind();
    }

    @Override
    public int getWidth() {
        return this.currentTexture.getWidth();
    }

    public void setUpdateDelayMillis(int updateDelayMillis) {
        this.updateDelayMillis = updateDelayMillis;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getTexId() {
        return this.currentTexture.getTexId();
    }

    protected \u0627\u0631 create(\u0630\u0635 info) {
        this.lastTime = System.currentTimeMillis();
        this.updateDelayMillis = info.getDelay();
        for (int i = 0; i < info.getTextures().size(); ++i) {
            this.textures.add(GLTexture.of(this.name.concat("_").concat(String.valueOf(i)), info.getTextures().get(i)));
        }
        this.iterator = this.textures.iterator();
        if (!this.textures.isEmpty()) {
            this.currentTexture = this.textures.get(0);
        }
        return this;
    }

    @Override
    public void delete() {
        for (GLTexture glTexture : this.textures) {
            glTexture.delete();
        }
        this.textures.clear();
    }

    public int getUpdateDelayMillis() {
        return this.updateDelayMillis;
    }

    public void update() {
        if (System.currentTimeMillis() - this.lastTime >= (long)this.updateDelayMillis) {
            if (!this.iterator.hasNext()) {
                this.iterator = this.textures.iterator();
            }
            this.currentTexture = this.iterator.next();
            this.lastTime = System.currentTimeMillis();
        }
    }

    @Override
    public int getHeight() {
        return this.currentTexture.getHeight();
    }

    public static \u0627\u0631 of(String name, \u0630\u0635 info) {
        return new \u0627\u0631(name).create(info);
    }
}

