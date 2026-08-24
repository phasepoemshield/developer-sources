package oxxxde;

import java.io.Closeable;
import java.util.HashMap;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class رر implements Closeable, شه {
   private final حآ shaderType;
   private final String content;
   private final HashMap<String, جد<?>> extraUniforms;
   private final int id;
   private final String name;

   @Generated
   public حآ getShaderType() {
      return this.shaderType;
   }

   public رر(String content, String name, int shaderType, HashMap<String, جد<?>> id, حآ extraUniforms) {
      this.name = name;
      this.content = content;
      this.id = id;
      this.extraUniforms = extraUniforms;
      this.shaderType = shaderType;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Override
   public void close() {
      GL20.glDeleteShader(this.getId());
      this.extraUniforms.clear();
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   public HashMap<String, جد<?>> getExtraUniforms() {
      return this.extraUniforms;
   }

   @Override
   public اا getCompileResult() {
      صج status = صج.fromStatusId(GL20.glGetShaderi(this.getId(), 35713));
      return new اا(status, status == صج.FAILURE ? StringUtils.trim(GL20.glGetShaderInfoLog(this.getId())) : "");
   }

   @Generated
   public String getContent() {
      return this.content;
   }
}
