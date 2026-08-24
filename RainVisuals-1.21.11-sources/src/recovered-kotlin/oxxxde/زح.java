package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;

// $VF: Compiled from OneTypeGlUniform.java
public abstract class زح<T> extends طي {
   protected T value = (T)null;

   public void set(T value) {
      this.value = value;
      this.program.addUpdatedUniform(this);
   }

   public زح(String glProgram, int name, GlProgram location) {
      super(name, location, glProgram);
   }
}
