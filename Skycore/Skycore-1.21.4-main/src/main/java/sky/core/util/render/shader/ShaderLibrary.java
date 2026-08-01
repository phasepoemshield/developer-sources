package sky.core.util.render.shader;

import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sky.core.util.ResourceUtil;

public final class ShaderLibrary {
    private static final Logger LOGGER = LoggerFactory.getLogger("Skycore");
    private static final ShaderRegistry REGISTRY = new ShaderRegistry();

    private ShaderLibrary() {
    }

    public static ShaderRegistry getRegistry() {
        return REGISTRY;
    }

    public static void loadDefaultShaders() {
        registerIfMissing("round_rect", "fragment/round_rect.fsh");
        registerIfMissing("round_rect_outline", "fragment/round_rect_outline.fsh");
        registerIfMissing("gradient", "fragment/gradient.fsh");
        registerIfMissing("circle", "fragment/circle.fsh");
        registerIfMissing("round_texture", "fragment/round_texture.fsh");
    }

    private static void registerIfMissing(String name, String fragmentPath) {
        if (REGISTRY.find(name).isPresent()) {
            return;
        }
        ShaderProgram program = buildProgram(fragmentPath);
        if (program.isLinked()) {
            REGISTRY.register(name, program);
        }
    }

    private static ShaderProgram buildProgram(String fragmentPath) {
        return ShaderBuilder.create()
                .attach("vertex/passthrough.vsh", 35633)
                .attach(fragmentPath, 35632)
                .link()
                .build();
    }

    private static String readShader(String path) {
        InputStream stream = ShaderLibrary.class.getResourceAsStream("/assets/skycore/shaders/" + path);
        if (stream == null) {
            LOGGER.error("Shader not found: /assets/skycore/shaders/{}", path);
            return "";
        }
        return ResourceUtil.readText(stream);
    }
}
