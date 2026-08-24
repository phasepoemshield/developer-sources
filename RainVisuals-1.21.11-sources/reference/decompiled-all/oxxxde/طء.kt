package oxxxde

// $VF: Compiled from Renderable.kt
public abstract class طء {
   @JvmStatic
   private java.lang.String SHADER_CORE_PATH = "${طء.SHADER_PATH}core/";
   @JvmStatic
   public سي Companion = سي(null);
   @JvmStatic
   private java.lang.String SHADER_PATH = "assets/${CLIENT_ID}/shaders/";
   @JvmStatic
   private java.lang.String SHADER_INCLUDE_PATH = "${SHADER_PATH}include/";

   public final var glProgram: خر?
      private set

   public open fun renderBatch(mesh: طأ?, state: Any?) {
      this.setGlobalProgram(this.glProgram)
      this.initMatrix()
      ِ.draw(mesh)
   }

   public fun initMatrix() {
      ِ.initMatrix()
   }

   public fun createShaderBuilder(name: String?, fsh: String?, vsh: String?): حخ<*> {
      val var5: حخ = رس.IN_JAR
         .createProgramBuilder(ِ.matrixSnippet)
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
      ِ.setGlobalProgram(globalProgram)
   }

   public abstract fun load() {
   }

   public open fun canBatchWith(other: طء): Boolean {
      return this === other
   }

   public abstract fun drawMode(): شم? {
   }

   fun setGlProgram(`<set-?>`: خر?) {
      this.glProgram = `<set-?>`
   }

   fun getGlProgram(): خر? {
      this.glProgram
   }
}
