package sky.core.util.render.shader;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public class ShaderRegistry {
    private final Map<String, ShaderProgram> programs = Maps.newLinkedHashMap();

    public void register(String name, ShaderProgram program) {
        this.programs.put(name, program);
    }

    public Optional<ShaderProgram> find(String name) {
        return Optional.ofNullable(this.programs.get(name));
    }
}
