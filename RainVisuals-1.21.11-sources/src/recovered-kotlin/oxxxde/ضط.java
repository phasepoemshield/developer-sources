package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ضط extends زح<Integer> {
   @Override
   public void upload() {
      GL20.glUniform1i(this.getLocation(), this.value);
   }

   public ضط(String name, int location, GlProgram glProgram) {
      super(name, location, glProgram);
   }
}
