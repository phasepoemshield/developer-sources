/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06366
 *  minecraft.class06478
 *  org.quiltmc.config.api.Config
 *  org.quiltmc.config.api.Configs
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.Constraint$Range
 *  org.quiltmc.config.api.values.TrackedValue
 *  org.quiltmc.config.api.values.ValueTreeNode
 *  org.quiltmc.config.api.values.ValueTreeNode$Section
 */
package page.langeweile.ok_zoomer.config.screen;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06366;
import minecraft.class06478;
import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.Configs;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueTreeNode;
import page.langeweile.ok_zoomer.config.ConfigEnums$ConfigEnum;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomPresets;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;
import page.langeweile.ok_zoomer.config.screen.ConfigTextUtils;
import page.langeweile.ok_zoomer.config.screen.ZoomPresets;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerFloatSlider;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerIntegerSlider;
import page.langeweile.ok_zoomer.config.screen.components.OkZoomerSelectionList;
import page.langeweile.ok_zoomer.utils.ModUtils;

public class OkZoomerConfigScreen
extends class05096 {
    private final class01894 configId;
    private final class05096 parent;
    private ConfigTextUtils configTextUtils;
    private final class03686 layout = new class03686((class05096)this);
    private OkZoomerSelectionList selectionList;
    private final Map<TrackedValue<Object>, Object> newValues;
    private final Set<TrackedValue<Object>> invalidValues;
    private class06478 buttonBuffer = null;

    public OkZoomerConfigScreen(class05096 class050962) {
        super(ConfigTextUtils.getConfigTitle(ModUtils.id("config")));
        this.configId = ModUtils.id("config");
        this.parent = class050962;
        this.newValues = new Reference2ObjectArrayMap();
        this.invalidValues = new ObjectArraySet();
    }

    public void method_25426() {
        Object object2;
        Config config = Configs.getConfig((String)this.configId.y(), (String)this.configId.N());
        this.configTextUtils = new ConfigTextUtils(config);
        this.selectionList = new OkZoomerSelectionList(this.field_22787, this.field_22789, this.field_22790 - 64, 32, this);
        this.selectionList.addCategory((class00392)class00392.L((String)"config.ok_zoomer.presets"));
        class06366 class063663 = class06366.N(configEnums$ZoomPresets -> class00392.L((String)String.format("config.ok_zoomer.presets.preset.%s", configEnums$ZoomPresets.toString().toLowerCase(Locale.ROOT))), (Object)ConfigEnums$ZoomPresets.CAMERA).N((Object[])ConfigEnums$ZoomPresets.values()).N(configEnums$ZoomPresets -> class04141.N((class00392)class00392.L((String)String.format("config.ok_zoomer.presets.preset.%s.tooltip", configEnums$ZoomPresets.toString().toLowerCase(Locale.ROOT))))).N(0, 0, 150, 20, (class00392)class00392.L((String)"config.ok_zoomer.presets.preset"));
        class05362 class053623 = class05362.method_46430((class00392)class00392.L((String)"config.ok_zoomer.presets.apply_preset"), class053622 -> this.resetToPreset((ConfigEnums$ZoomPresets)class063663.y())).N(class04141.N((class00392)class00392.L((String)"config.ok_zoomer.presets.apply_preset.tooltip"))).N();
        this.selectionList.addButton((class06478)class063663, (class06478)class053623);
        for (Object object2 : config.nodes()) {
            if (!(object2 instanceof ValueTreeNode.Section)) continue;
            ValueTreeNode.Section section = (ValueTreeNode.Section)object2;
            this.selectionList.addCategory(this.configTextUtils.getCategoryText(section.key().toString()));
            for (ValueTreeNode valueTreeNode : section) {
                Object object3;
                TrackedValue trackedValue;
                WidgetSize$Size widgetSize$Size = (WidgetSize$Size)((Object)valueTreeNode.metadata(WidgetSize.TYPE));
                if (!(valueTreeNode instanceof TrackedValue)) continue;
                TrackedValue trackedValue2 = trackedValue = (TrackedValue)valueTreeNode;
                this.newValues.putIfAbsent((TrackedValue<Object>)trackedValue2, trackedValue.getRealValue());
                if (trackedValue.value() instanceof Boolean) {
                    object3 = class06366.N((boolean)((Boolean)this.newValues.get(trackedValue2))).N(bl -> class04141.N((class00392)this.configTextUtils.getOptionTextTooltip(trackedValue))).N(0, 0, 150, 20, this.configTextUtils.getOptionText(trackedValue), (class063662, bl) -> this.newValues.replace((TrackedValue<Object>)trackedValue2, bl));
                    this.addOptionToList((class06478)object3, widgetSize$Size);
                    continue;
                }
                if (trackedValue.value() instanceof Float) {
                    if (((Boolean)OkZoomerConfigManager.CONFIG.tweaks.numericSliders.value()).booleanValue()) {
                        object3 = new OkZoomerFloatSlider((TrackedValue<Float>)trackedValue2, this.configTextUtils.getOptionText(trackedValue2), 0, 0, 150, 20, ((Float)this.newValues.get(trackedValue2)).floatValue(), f -> this.newValues.replace((TrackedValue<Object>)trackedValue2, f));
                        object3.method_47400(class04141.N((class00392)this.configTextUtils.getOptionTextTooltip(trackedValue)));
                        this.addOptionToList((class06478)object3, widgetSize$Size);
                        continue;
                    }
                    object3 = new class04927(this.field_22793, 0, 0, 150, 20, this.configTextUtils.getOptionText(trackedValue));
                    object3.method_1852(((Float)this.newValues.get(trackedValue2)).toString());
                    object3.method_1863(arg_0 -> this.lambda$init$6(trackedValue, trackedValue2, (class04927)object3, arg_0));
                    object3.method_47400(class04141.N((class00392)class05220.y((class00392[])new class00392[]{this.configTextUtils.getOptionText(trackedValue), this.configTextUtils.getOptionTextTooltip(trackedValue)})));
                    this.addOptionToList((class06478)object3, widgetSize$Size);
                    continue;
                }
                if (trackedValue.value() instanceof Integer) {
                    if (((Boolean)OkZoomerConfigManager.CONFIG.tweaks.numericSliders.value()).booleanValue()) {
                        object3 = new OkZoomerIntegerSlider((TrackedValue<Integer>)trackedValue2, this.configTextUtils.getOptionText(trackedValue2), 0, 0, 150, 20, (Integer)this.newValues.get(trackedValue2), n -> this.newValues.replace((TrackedValue<Object>)trackedValue2, n));
                        object3.method_47400(class04141.N((class00392)this.configTextUtils.getOptionTextTooltip(trackedValue)));
                        this.addOptionToList((class06478)object3, widgetSize$Size);
                        continue;
                    }
                    object3 = new class04927(this.field_22793, 0, 0, 150, 20, this.configTextUtils.getOptionText(trackedValue));
                    object3.method_1852(((Integer)this.newValues.get(trackedValue2)).toString());
                    object3.method_1863(arg_0 -> this.lambda$init$8(trackedValue, trackedValue2, (class04927)object3, arg_0));
                    object3.method_47400(class04141.N((class00392)class05220.y((class00392[])new class00392[]{this.configTextUtils.getOptionText(trackedValue), this.configTextUtils.getOptionTextTooltip(trackedValue)})));
                    this.addOptionToList((class06478)object3, widgetSize$Size);
                    continue;
                }
                object3 = trackedValue.value();
                if (!(object3 instanceof ConfigEnums$ConfigEnum)) continue;
                ConfigEnums$ConfigEnum configEnums$ConfigEnum2 = (ConfigEnums$ConfigEnum)object3;
                object3 = class06366.N(configEnums$ConfigEnum -> this.configTextUtils.getEnumOptionText((TrackedValue<?>)trackedValue, (ConfigEnums$ConfigEnum)configEnums$ConfigEnum), (Object)((ConfigEnums$ConfigEnum)this.newValues.get(trackedValue2))).N((Object[])((ConfigEnums$ConfigEnum[])((Enum)((Object)configEnums$ConfigEnum2)).getDeclaringClass().getEnumConstants())).N(configEnums$ConfigEnum -> class04141.N((class00392)this.configTextUtils.getEnumOptionTextTooltip((TrackedValue<?>)trackedValue, (ConfigEnums$ConfigEnum)configEnums$ConfigEnum))).N(0, 0, 150, 20, this.configTextUtils.getOptionText(trackedValue), (class063662, configEnums$ConfigEnum) -> this.newValues.replace((TrackedValue<Object>)trackedValue2, configEnums$ConfigEnum));
                this.addOptionToList((class06478)object3, widgetSize$Size);
            }
            if (this.buttonBuffer == null) continue;
            this.selectionList.addButton(this.buttonBuffer, null);
            this.buttonBuffer = null;
        }
        this.method_37063((class04654)this.selectionList);
        this.layout.N(this.field_22785, this.field_22793);
        class01885 class018852 = (class01885)this.layout.y((class02102)class01885.i().N(8));
        class018852.N((class02102)class05362.method_46430((class00392)class00392.L((String)"config.ok_zoomer.discard_changes"), class053622 -> this.resetNewValues()).N(150).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(150).N());
        object2 = this;
        this.layout.method_48206(arg_0 -> OkZoomerConfigScreen.lambda$init$14((OkZoomerConfigScreen)((Object)object2), arg_0));
        this.method_48640();
    }

    public void method_48640() {
        this.layout.N();
        this.selectionList.method_57712(this.field_22789, this.layout);
    }

    public void method_25432() {
        this.newValues.forEach((trackedValue, object) -> {
            if (!this.invalidValues.contains(trackedValue)) {
                trackedValue.setValue(object, false);
            }
        });
        OkZoomerConfigManager.CONFIG.save();
    }

    public void method_25419() {
        this.field_22787.N(this.parent);
    }

    private void refresh() {
        double d = this.selectionList.method_44387();
        this.method_41843();
        this.selectionList.method_44382(d);
    }

    public void resetToPreset(ConfigEnums$ZoomPresets configEnums$ZoomPresets) {
        this.newValues.clear();
        this.invalidValues.clear();
        for (TrackedValue trackedValue : OkZoomerConfigManager.CONFIG.values()) {
            this.newValues.put((TrackedValue<Object>)trackedValue, ZoomPresets.PRESET_ENUM_TO_PRESET.get(configEnums$ZoomPresets).getOrDefault(trackedValue, trackedValue.getDefaultValue()));
        }
        this.refresh();
    }

    private void addOptionToList(class06478 class064782, WidgetSize$Size widgetSize$Size) {
        if (widgetSize$Size == WidgetSize$Size.HALF) {
            if (this.buttonBuffer == null) {
                this.buttonBuffer = class064782;
            } else {
                this.selectionList.addButton(this.buttonBuffer, class064782);
                this.buttonBuffer = null;
            }
        } else {
            if (this.buttonBuffer != null) {
                this.selectionList.addButton(this.buttonBuffer, null);
                this.buttonBuffer = null;
            }
            this.selectionList.addButton(class064782);
        }
    }

    private static /* synthetic */ void lambda$init$14(OkZoomerConfigScreen okZoomerConfigScreen, class06478 class064782) {
        okZoomerConfigScreen.method_37063((class04654)class064782);
    }

    private void resetNewValues() {
        this.newValues.clear();
        for (TrackedValue trackedValue : OkZoomerConfigManager.CONFIG.values()) {
            if (trackedValue.getRealValue() == null) continue;
            this.newValues.put((TrackedValue<Object>)trackedValue, trackedValue.getRealValue());
        }
        this.refresh();
    }

    private /* synthetic */ void lambda$init$6(TrackedValue trackedValue, TrackedValue trackedValue2, class04927 class049272, String string) {
        try {
            float f = Float.NEGATIVE_INFINITY;
            float f2 = Float.POSITIVE_INFINITY;
            for (Constraint constraint : trackedValue.constraints()) {
                if (!(constraint instanceof Constraint.Range)) continue;
                Constraint.Range range = (Constraint.Range)constraint;
                f = Math.max(((Float)range.min()).floatValue(), f);
                f2 = Math.min(((Float)range.max()).floatValue(), f2);
            }
            float f3 = Float.parseFloat(string);
            if (f3 < f || f3 > f2) {
                throw new IndexOutOfBoundsException();
            }
            this.newValues.replace((TrackedValue<Object>)trackedValue2, Float.valueOf(f3));
            this.invalidValues.remove(trackedValue2);
            class049272.method_1868(-2039584);
        }
        catch (IndexOutOfBoundsException | NumberFormatException runtimeException) {
            this.invalidValues.add((TrackedValue<Object>)trackedValue2);
            class049272.method_1868(-65536);
        }
    }

    private /* synthetic */ void lambda$init$8(TrackedValue trackedValue, TrackedValue trackedValue2, class04927 class049272, String string) {
        try {
            int n = Integer.MIN_VALUE;
            int n2 = Integer.MAX_VALUE;
            for (Constraint constraint : trackedValue.constraints()) {
                if (!(constraint instanceof Constraint.Range)) continue;
                Constraint.Range range = (Constraint.Range)constraint;
                n = Math.max((Integer)range.min(), n);
                n2 = Math.min((Integer)range.max(), n2);
            }
            int n3 = Integer.parseInt(string);
            if (n3 < n || n3 > n2) {
                throw new IndexOutOfBoundsException();
            }
            this.newValues.replace((TrackedValue<Object>)trackedValue2, n3);
            this.invalidValues.remove(trackedValue2);
            class049272.method_1868(-2039584);
        }
        catch (IndexOutOfBoundsException | NumberFormatException runtimeException) {
            this.invalidValues.add((TrackedValue<Object>)trackedValue2);
            class049272.method_1868(-65536);
        }
    }
}

