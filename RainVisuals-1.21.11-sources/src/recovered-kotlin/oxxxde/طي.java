package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import lombok.Generated;

// $VF: Compiled from GlUniform.java
public abstract class طي implements AutoCloseable {
   protected final String name;
   protected final int location;
   protected final GlProgram program;

   public طي(String program, int name, GlProgram location) {
      this.name = name;
      this.location = location;
      this.program = program;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public int getLocation() {
      return this.location;
   }

   public abstract void upload();

   @Override
   public void close() {
   }

   @Generated
   public GlProgram getProgram() {
      return this.program;
   }
}
