package oxxxde;

// $VF: Compiled from OneTypeGlUniform.java
public abstract class زح<T> extends طي {
   protected T value = (T)null;

   public void set(T value) {
      this.value = value;
      this.program.addUpdatedUniform(this);
   }

   public زح(String glProgram, int name, خر location) {
      super(name, location, glProgram);
   }
}
