package pulse.render.shader;

import java.io.InputStream;
import ru.pulse.Pulse;
import pulse.util.ResourceTextReader;

public class PulseShaderBuilder {
    private final PulseShaderProgram program = new PulseShaderProgram();

    public enum Stage {
        VERTEX(35633),
        FRAGMENT(35632);

        private final int glType;

        public int glType() {
            return this.glType;
        }

        Stage(int i) {
            this.glType = i;
        }
    }

    private PulseShaderBuilder() {
    }

    public static PulseShaderBuilder create() {
        return new PulseShaderBuilder();
    }

    public PulseShaderBuilder attach(String str, Stage stage) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/assets/pulse/shaders/".concat(str));
        if (resourceAsStream == null) {
            Pulse.getLOGGER().error("Shader file not found: /assets/pulse/shaders/{}", str);
            return this;
        }
        this.program.a(ResourceTextReader.a(resourceAsStream), stage.glType());
        return this;
    }

    public PulseShaderBuilder link() {
        this.program.c();
        return this;
    }

    public PulseShaderProgram build() {
        return this.program;
    }
}
