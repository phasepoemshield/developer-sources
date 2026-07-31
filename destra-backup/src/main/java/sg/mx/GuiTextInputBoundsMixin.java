package sg.mx;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.gui.GuiTextInput;

@Mixin(GuiTextInput.class)
public abstract class GuiTextInputBoundsMixin {
    @Shadow public float x;
    @Shadow public float y;
    @Shadow public float width;
    @Shadow public float height;

    @Unique
    private static final Map<Class<?>, BoundsLayout> destra$boundsLayouts = new ConcurrentHashMap<>();
    @Inject(method = "setBounds", at = @At("TAIL"), remap = false)
    private void destra$syncDuplicateBounds(float x, float y, float width, float height, CallbackInfo ci) {
        Object self = this;
        Class<?> type = self.getClass();
        if (type == GuiTextInput.class) {
            return;
        }
        if ("ru.destra.gui.KeybindSettingElement".equals(type.getName())) {
            return;
        }

        BoundsLayout layout = destra$boundsLayouts.computeIfAbsent(type, GuiTextInputBoundsMixin::destra$resolveLayout);
        if (layout != null) {
            layout.apply(self, this.x, this.y, this.width, this.height);
        }
    }

    @Unique
    private static BoundsLayout destra$resolveLayout(Class<?> type) {
        List<Field> instanceFields = new ArrayList<>();
        for (Field field : type.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                instanceFields.add(field);
            }
        }

        BoundsLayout explicit = destra$resolveExplicitLayout(type, instanceFields);
        if (explicit != null) {
            return explicit;
        }

        for (int i = 0; i < instanceFields.size(); i++) {
            Field field = instanceFields.get(i);
            if ("ru.destra.gui.ClickGuiScreen".equals(field.getType().getName())) {
                Field heightField = destra$findNearestFloatBefore(instanceFields, i);
                List<Field> trailingFloats = destra$findTrailingFloats(instanceFields, i + 1, 3);
                if (heightField != null && trailingFloats.size() == 3) {
                    return new BoundsLayout(trailingFloats.get(0), trailingFloats.get(1), trailingFloats.get(2), heightField);
                }
            }
        }

        for (int i = 0; i < instanceFields.size(); i++) {
            Field field = instanceFields.get(i);
            if ("ru.destra.setting.Setting".equals(field.getType().getName())) {
                List<Field> trailingFloats = destra$findTrailingFloats(instanceFields, i + 1, 4);
                if (trailingFloats.size() == 4) {
                    return new BoundsLayout(trailingFloats.get(1), trailingFloats.get(2), trailingFloats.get(0), trailingFloats.get(3));
                }
            }
        }

        return null;
    }

    @Unique
    private static BoundsLayout destra$resolveExplicitLayout(Class<?> type, List<Field> instanceFields) {
        List<Field> trailingFloats = null;
        for (int i = 0; i < instanceFields.size(); i++) {
            Field field = instanceFields.get(i);
            if ("ru.destra.setting.Setting".equals(field.getType().getName())) {
                trailingFloats = destra$findTrailingFloats(instanceFields, i + 1, 4);
                break;
            }
        }

        if (trailingFloats == null || trailingFloats.size() != 4) {
            return null;
        }

        String name = type.getName();
        if ("ru.destra.gui.CommandInputElement".equals(name) || "ru.destra.gui.ModeChangeElement".equals(name)) {
            return new BoundsLayout(trailingFloats.get(1), trailingFloats.get(2), trailingFloats.get(0), trailingFloats.get(3));
        }
        if ("ru.destra.misc.ModeChangeScreen2".equals(name)) {
            return new BoundsLayout(trailingFloats.get(0), trailingFloats.get(1), trailingFloats.get(2), trailingFloats.get(3));
        }
        if ("ru.destra.misc.ColorPickerPanel".equals(name)) {
            return new BoundsLayout(trailingFloats.get(1), trailingFloats.get(3), trailingFloats.get(2), trailingFloats.get(0));
        }

        return null;
    }

    @Unique
    private static Field destra$findNearestFloatBefore(List<Field> fields, int indexExclusive) {
        for (int i = indexExclusive - 1; i >= 0; i--) {
            Field field = fields.get(i);
            if (field.getType() == float.class) {
                return field;
            }
        }
        return null;
    }

    @Unique
    private static List<Field> destra$findTrailingFloats(List<Field> fields, int startIndex, int count) {
        List<Field> floats = new ArrayList<>(count);
        for (int i = startIndex; i < fields.size() && floats.size() < count; i++) {
            Field field = fields.get(i);
            if (field.getType() == float.class) {
                floats.add(field);
            }
        }
        return floats;
    }

    @Unique
    private record BoundsLayout(
        Field xField,
        Field yField,
        Field widthField,
        Field heightField
    ) {
        void apply(Object instance, float x, float y, float width, float height) {
            try {
                this.xField.setFloat(instance, x);
                this.yField.setFloat(instance, y);
                this.widthField.setFloat(instance, width);
                this.heightField.setFloat(instance, height);
            } catch (IllegalAccessException ignored) {
            }
        }
    }
}
