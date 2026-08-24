/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.render.main.program.compile.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;
import oxxxde.\u062b\u064e;
import oxxxde.\u062f\u0642;
import oxxxde.\u062f\u0646;
import oxxxde.\u0632\u0632;
import oxxxde.\u0634\u0647;
import oxxxde.\u0635\u062c;
import oxxxde.\u0637\u064a;

public class GlProgram
implements \u0632\u0632,
Closeable,
\u0634\u0647 {
    private final int id;
    private final HashSet<a> snippets;
    private final List<\u0637\u064a> updatedUniforms;
    public static GlProgram ACTIVE_PROGRAM = null;
    private int samplersAmount = 0;
    private final HashMap<String, \u0637\u064a> uniformsByName = new HashMap();
    private final String name;
    private final List<SamplerUniform> samplers = new ArrayList<SamplerUniform>();
    private int buffersIndexAmount = 0;

    public void addUpdatedUniform(\u0637\u064a uniform) {
        this.updatedUniforms.add(uniform);
    }

    /*
     * WARNING - void declaration
     */
    public SamplerUniform getSampler(int samplerId) {
        void var2_2;
        SamplerUniform sampler = this.getSamplerNullable(samplerId);
        if (sampler == null) {
            \u062f\u0646.printAndExit(new \u062b\u064e("Sampler[" + samplerId + "]", this.name));
        }
        return var2_2;
    }

    @Override
    public void bind() {
        if (ACTIVE_PROGRAM != this) {
            GL20.glUseProgram((int)this.getId());
            ACTIVE_PROGRAM = this;
        }
        if (!this.updatedUniforms.isEmpty()) {
            for (\u0637\u064a glUniform : this.updatedUniforms) {
                glUniform.upload();
            }
            this.updatedUniforms.clear();
        }
    }

    public SamplerUniform getSamplerNullable(int samplerId) {
        return this.samplers.get(samplerId);
    }

    @Generated
    public HashSet<a> getSnippets() {
        return this.snippets;
    }

    @Generated
    public void setSamplersAmount(int samplersAmount) {
        this.samplersAmount = samplersAmount;
    }

    @Generated
    public int getSamplersAmount() {
        return this.samplersAmount;
    }

    @Override
    public A getCompileResult() {
        \u0635\u062c status;
        return new A(status, (status = \u0635\u062c.fromStatusId(GL20.glGetProgrami((int)this.getId(), (int)35714))) == \u0635\u062c.FAILURE ? StringUtils.trim((String)GL20.glGetProgramInfoLog((int)this.getId())) : "");
    }

    public <T extends \u0637\u064a> void consumeIfUniformPresent(String name, kotakbaz.rain.client.render.main.program.uniform.a<T> type, Consumer<T> consumer) {
        T uniform = this.getUniformNullable(name, type);
        if (uniform != null) {
            consumer.accept(uniform);
        }
    }

    public <T extends \u0637\u064a> T getUniformNullable(String name, kotakbaz.rain.client.render.main.program.uniform.a<T> type) {
        return (T)this.uniformsByName.get(name);
    }

    public GlProgram(String name, int id, HashSet<a> snippets, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
        this.updatedUniforms = new ArrayList<\u0637\u064a>();
        this.name = name;
        this.id = id;
        this.snippets = snippets;
        for (Map.Entry<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniformEntry : uniforms.entrySet()) {
            \u0637\u064a uniform = (\u0637\u064a)uniformEntry.getValue().uniformCreator().apply((Object)uniformEntry.getKey(), (Object)GL20.glGetUniformLocation((int)this.id, (CharSequence)uniformEntry.getKey()), (Object)this);
            if (uniform.getLocation() == -1 && !(uniform instanceof \u062f\u0642)) {
                \u062f\u0646.printAndExit(new \u062b\u064e(uniform.getName(), this.name));
            }
            this.uniformsByName.put(uniformEntry.getKey(), uniform);
            if (!(uniform instanceof SamplerUniform)) continue;
            SamplerUniform sampler = (SamplerUniform)uniform;
            this.samplers.add(sampler);
        }
    }

    public void consumerIfSamplerPresent(int samplerId, Consumer<SamplerUniform> consumer) {
        SamplerUniform sampler = this.getSamplerNullable(samplerId);
        if (sampler != null) {
            consumer.accept(sampler);
        }
    }

    @Generated
    public int getBuffersIndexAmount() {
        return this.buffersIndexAmount;
    }

    @Generated
    public void setBuffersIndexAmount(int buffersIndexAmount) {
        this.buffersIndexAmount = buffersIndexAmount;
    }

    @Generated
    public int getId() {
        return this.id;
    }

    @Override
    public void close() {
        this.uniformsByName.values().forEach(\u0637\u064a::close);
        GL20.glDeleteProgram((int)this.getId());
        this.updatedUniforms.clear();
        this.uniformsByName.clear();
        this.samplers.clear();
    }

    @Generated
    public String getName() {
        return this.name;
    }

    /*
     * WARNING - void declaration
     */
    public <T extends \u0637\u064a> T getUniform(String name, kotakbaz.rain.client.render.main.program.uniform.a<T> type) {
        void var3_3;
        T uniform = this.getUniformNullable(name, type);
        if (uniform == null) {
            \u062f\u0646.printAndExit(new \u062b\u064e(name, this.name));
        }
        return var3_3;
    }

    @Override
    public void unbind() {
        if (ACTIVE_PROGRAM == this) {
            GL20.glUseProgram((int)0);
        }
        ACTIVE_PROGRAM = null;
    }
}

