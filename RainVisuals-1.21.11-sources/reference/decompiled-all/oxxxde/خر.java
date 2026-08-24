package oxxxde;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class خر implements زز, Closeable, شه {
   private final int id;
   private final HashSet<بِ> snippets;
   private final List<طي> updatedUniforms;
   public static خر ACTIVE_PROGRAM = null;
   private int samplersAmount;
   private final HashMap<String, طي> uniformsByName = new HashMap<>();
   private final String name;
   private final List<خة> samplers = new ArrayList<>();
   private int buffersIndexAmount;

   public void addUpdatedUniform(طي uniform) {
      this.updatedUniforms.add(uniform);
   }

   public خة getSampler(int samplerId) {
      خة sampler = this.getSamplerNullable(samplerId);
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

   public خة getSamplerNullable(int samplerId) {
      return this.samplers.get(samplerId);
   }

   @Generated
   public HashSet<بِ> getSnippets() {
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
   public اا getCompileResult() {
      صج status = صج.fromStatusId(GL20.glGetProgrami(this.getId(), 35714));
      return new اا(status, status == صج.FAILURE ? StringUtils.trim(GL20.glGetProgramInfoLog(this.getId())) : "");
   }

   public <T extends طي> void consumeIfUniformPresent(String consumer, جد<T> type, Consumer<T> name) {
      T uniform = this.getUniformNullable(name, type);
      if (uniform != null) {
         consumer.accept(uniform);
      }
   }

   public <T extends طي> T getUniformNullable(String name, جد<T> type) {
      return (T)this.uniformsByName.get(name);
   }

   public خر(String snippets, int name, HashSet<بِ> id, HashMap<String, جد<?>> uniforms) {
      this.samplersAmount = 0;
      this.buffersIndexAmount = 0;
      this.updatedUniforms = new ArrayList<>();
      this.name = name;
      this.id = id;
      this.snippets = snippets;

      for (Entry<String, جد<?>> uniformEntry : uniforms.entrySet()) {
         طي uniform = (طي)((جد)uniformEntry.getValue())
            .uniformCreator()
            .apply((String)uniformEntry.getKey(), GL20.glGetUniformLocation(this.id, (CharSequence)uniformEntry.getKey()), this);
         if (uniform.getLocation() == -1 && !(uniform instanceof دق)) {
            دن.printAndExit(new ثَ(uniform.getName(), this.name));
         }

         this.uniformsByName.put((String)uniformEntry.getKey(), uniform);
         if (uniform instanceof خة sampler) {
            this.samplers.add(sampler);
         }
      }
   }

   public void consumerIfSamplerPresent(int consumer, Consumer<خة> samplerId) {
      خة sampler = this.getSamplerNullable(samplerId);
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

   public <T extends طي> T getUniform(String name, جد<T> type) {
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
