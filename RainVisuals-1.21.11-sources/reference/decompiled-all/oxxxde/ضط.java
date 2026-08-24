package oxxxde;

import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ضط extends زح<Integer> {
   @Override
   public void upload() {
      GL20.glUniform1i(this.getLocation(), this.value);
   }

   public ضط(String name, int location, خر glProgram) {
      super(name, location, glProgram);
   }
}
