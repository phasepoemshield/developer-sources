package kotakbaz.rain.client.render.main.program;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import kotakbaz.rain.client.render.main.program.compile.A;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;
import oxxxde.ثَ;
import oxxxde.دق;
import oxxxde.دن;
import oxxxde.زز;
import oxxxde.شه;
import oxxxde.صج;
import oxxxde.طي;

// $VF: Compiled from heavy
public class GlProgram implements زز, Closeable, شه {
   private final int id;
   private final HashSet<a> snippets;
   private final List<طي> updatedUniforms;
   public static GlProgram ACTIVE_PROGRAM = null;
   private int samplersAmount;
   private final HashMap<String, طي> uniformsByName = new HashMap<>();
   private final String name;
   private final List<SamplerUniform> samplers = new ArrayList<>();
   private int buffersIndexAmount;

   public void addUpdatedUniform(طي uniform) {
      this.updatedUniforms.add(uniform);
   }

   public SamplerUniform getSampler(int samplerId) {
      SamplerUniform sampler = this.getSamplerNullable(samplerId);
      if (sampler == null) {
         دن.printAndExit(new ثَ("Sampler[" + samplerId + "]", this.name));
      }

      return sampler;
   }

   @Override
   public void bind() {
      if (ACTIVE_PROGRAM != this) {
         GL20.glUseProgram(this.getId());
         ACTIVE_PROGRAM = this;
      }

      if (!this.updatedUniforms.isEmpty()) {
         for (طي glUniform : this.updatedUniforms) {
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
      صج status = صج.fromStatusId(GL20.glGetProgrami(this.getId(), 35714));
      return new A(status, status == صج.FAILURE ? StringUtils.trim(GL20.glGetProgramInfoLog(this.getId())) : "");
   }

   public <T extends طي> void consumeIfUniformPresent(String consumer, kotakbaz.rain.client.render.main.program.uniform.a<T> type, Consumer<T> name) {
      T uniform = this.getUniformNullable(name, type);
      if (uniform != null) {
         consumer.accept(uniform);
      }
   }

   public <T extends طي> T getUniformNullable(String name, kotakbaz.rain.client.render.main.program.uniform.a<T> type) {
      return (T)this.uniformsByName.get(name);
   }

   public GlProgram(String snippets, int name, HashSet<a> id, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
      this.samplersAmount = 0;
      this.buffersIndexAmount = 0;
      this.updatedUniforms = new ArrayList<>();
      this.name = name;
      this.id = id;
      this.snippets = snippets;

      for (Entry<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniformEntry : uniforms.entrySet()) {
         طي uniform = (طي)((kotakbaz.rain.client.render.main.program.uniform.a)uniformEntry.getValue())
            .uniformCreator()
            .apply((String)uniformEntry.getKey(), GL20.glGetUniformLocation(this.id, (CharSequence)uniformEntry.getKey()), this);
         if (uniform.getLocation() == -1 && !(uniform instanceof دق)) {
            دن.printAndExit(new ثَ(uniform.getName(), this.name));
         }

         this.uniformsByName.put((String)uniformEntry.getKey(), uniform);
         if (uniform instanceof SamplerUniform sampler) {
            this.samplers.add(sampler);
         }
      }
   }

   public void consumerIfSamplerPresent(int consumer, Consumer<SamplerUniform> samplerId) {
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
      this.uniformsByName.values().forEach(طي::close);
      GL20.glDeleteProgram(this.getId());
      this.updatedUniforms.clear();
      this.uniformsByName.clear();
      this.samplers.clear();
   }

   @Generated
   public String getName() {
      return this.name;
   }

   public <T extends طي> T getUniform(String name, kotakbaz.rain.client.render.main.program.uniform.a<T> type) {
      T uniform = this.getUniformNullable(name, type);
      if (uniform == null) {
         دن.printAndExit(new ثَ(name, this.name));
      }

      return (T)uniform;
   }

   @Override
   public void unbind() {
      if (ACTIVE_PROGRAM == this) {
         GL20.glUseProgram(0);
      }

      ACTIVE_PROGRAM = null;
   }
}
