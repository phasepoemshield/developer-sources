package oxxxde;

import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class صآ extends زح<float[]> {
   public صآ(String location, int glProgram, خر name) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform1fv(this.getLocation(), this.value);
   }
}
