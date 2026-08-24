package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ضم extends زح<int[]> {
   public ضم(String glProgram, int name, GlProgram location) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform1iv(this.getLocation(), this.value);
   }
}
