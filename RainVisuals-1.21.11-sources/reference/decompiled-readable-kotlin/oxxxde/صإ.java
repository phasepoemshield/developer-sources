package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector2i;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class صإ extends زح<Vector2i> {
   public صإ(String glProgram, int location, GlProgram name) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform2i(this.getLocation(), this.value.x, this.value.y);
   }
}
