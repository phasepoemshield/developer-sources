package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class دط extends زح<Vector2f> {
   @Override
   public void upload() {
      GL20.glUniform2f(this.getLocation(), this.value.x, this.value.y);
   }

   public دط(String glProgram, int location, GlProgram name) {
      super(name, location, glProgram);
   }
}
