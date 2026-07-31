package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;

@FunctionAdd(
        name = "RotationRender",
        alias = "Rotation Render",
        category = Category.Render,
        needPremium = true,
        description = "Скрывает визуальное вращение модели в F5 (аура не наводится)"
)
public class RotationRender extends Function {
}
