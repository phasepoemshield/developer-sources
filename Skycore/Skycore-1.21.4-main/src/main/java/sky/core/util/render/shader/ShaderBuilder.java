package sky.core.util.render.shader;

import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sky.core.util.ResourceUtil;

public final class ShaderBuilder {
    private static final Logger LOGGER = LoggerFactory.getLogger("Skycore");
    private final ShaderProgram program = new ShaderProgram();

    private ShaderBuilder() {
    }

    public static ShaderBuilder create() {
        return new ShaderBuilder();
    }

    public ShaderBuilder attach(String path, int type) {
        InputStream stream = ShaderBuilder.class.getResourceAsStream("/assets/skycore/shaders/" + path);
        if (stream == null) {
            LOGGER.error("Shader not found: /assets/skycore/shaders/{}", path);
            return this;
        }
        this.program.attachSource(ResourceUtil.readText(stream), type);
        return this;
    }

    public ShaderBuilder link() {
        this.program.link();
        return this;
    }

    public ShaderProgram build() {
        return this.program;
    }
}
