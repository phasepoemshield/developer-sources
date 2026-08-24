package kotakbaz.rain.client.util.render.engine

import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder
import kotakbaz.rain.client.render.main.program.GlProgram
import oxxxde.حآ
import oxxxde.حخ
import oxxxde.خر
import oxxxde.رس
import oxxxde.سا
import oxxxde.سي
import oxxxde.شم
import oxxxde.طء
import oxxxde.طأ

// $VF: Compiled from Renderable.kt
public abstract class Renderable {
   @JvmStatic
   private java.lang.String SHADER_CORE_PATH = "${Renderable.SHADER_PATH}core/";
   @JvmStatic
   public سي Companion = سي(null);
   @JvmStatic
   private java.lang.String SHADER_PATH = "assets/${CLIENT_ID}/shaders/";
   @JvmStatic
   private java.lang.String SHADER_INCLUDE_PATH = "${SHADER_PATH}include/";
   private GlProgram glProgram;

   public open fun renderBatch(mesh: طأ?, state: Any?) {
      this.setGlobalProgram(this.glProgram)
      this.initMatrix()
      ChromaRenderer.draw(mesh)
   }

   public fun initMatrix() {
      ChromaRenderer.initMatrix()
   }

   public fun createShaderBuilder(name: String?, fsh: String?, vsh: String?): حخ<*> {
      val var5: GlProgramBuilder = رس.IN_JAR
         .createProgramBuilder(ChromaRenderer.matrixSnippet)
         .name(name)
         .shader(رس.IN_JAR.createGlslFileEntry("$name-vertex", "${SHADER_CORE_PATH}$vsh.vsh"), حآ.Vertex)
         .shader(رس.IN_JAR.createGlslFileEntry("$name-fragment", "${SHADER_CORE_PATH}$fsh.fsh"), حآ.Fragment)
         return var5
   }

   public abstract fun vertexFormat(): سا? {
   }

   public abstract fun shader(): String {
   }

   public open fun isBatchCompatible(oldState: Any?, newState: Any?): Boolean {
      return oldState == newState
   }

   public abstract fun name(): String {
   }

   public fun setGlobalProgram(globalProgram: خر?) {
      ChromaRenderer.setGlobalProgram(globalProgram)
   }

   public abstract fun load() {
   }

   public open fun canBatchWith(other: طء): Boolean {
      return this === other
   }

   public abstract fun drawMode(): شم? {
   }

   public final var glProgram: خر?
}
