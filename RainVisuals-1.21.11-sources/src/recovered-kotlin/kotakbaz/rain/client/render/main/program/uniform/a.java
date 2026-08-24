package kotakbaz.rain.client.render.main.program.uniform;

import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import org.apache.commons.lang3.function.TriFunction;
import oxxxde.اغ;
import oxxxde.دط;
import oxxxde.دق;
import oxxxde.ذء;
import oxxxde.ره;
import oxxxde.صآ;
import oxxxde.صإ;
import oxxxde.صٍ;
import oxxxde.ضئ;
import oxxxde.ضط;
import oxxxde.ضم;
import oxxxde.طي;
import oxxxde.طَ;

// $VF: Compiled from heavy
public record a<T extends طي>(Class<T> clazz, TriFunction<String, Integer, GlProgram, طي> uniformCreator) {
   public static final a<ضم> INT_ARRAY = new a<>(ضم.class, ضم::new);
   public static final a<طَ> IVEC4 = new a<>(طَ.class, طَ::new);
   public static final a<SamplerUniform> SAMPLER = new a<>(SamplerUniform.class, SamplerUniform::new);
   public static final a<ره> VEC4 = new a<>(ره.class, ره::new);
   public static final a<دط> VEC2 = new a<>(دط.class, دط::new);
   public static final a<اغ> VEC3 = new a<>(اغ.class, اغ::new);
   public static final a<ضط> INT = new a<>(ضط.class, ضط::new);
   public static final a<صآ> FLOAT_ARRAY = new a<>(صآ.class, صآ::new);
   public static final a<ضئ> MATRIX = new a<>(ضئ.class, ضئ::new);
   public static final a<دق> BUFFER = new a<>(دق.class, دق::new);
   public static final a<صٍ> IVEC3 = new a<>(صٍ.class, صٍ::new);
   public static final a<ذء> FLOAT = new a<>(ذء.class, ذء::new);
   public static final a<صإ> IVEC2 = new a<>(صإ.class, صإ::new);
}
