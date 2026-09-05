/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.ConfigScreen
 *  me.shedaniel.clothconfig2.api.Modifier
 *  me.shedaniel.clothconfig2.api.ModifierKeyCode
 *  me.shedaniel.clothconfig2.api.TickableWidget
 *  me.shedaniel.clothconfig2.api.Tooltip
 *  me.shedaniel.math.Color
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class00647
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04648
 *  minecraft.class04654
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class05733
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.ConfigScreen;
import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import me.shedaniel.clothconfig2.api.TickableWidget;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.clothconfig2.gui.AbstractConfigScreen$QuitSaveConsumer;
import me.shedaniel.clothconfig2.gui.ClothRequiresRestartScreen;
import me.shedaniel.clothconfig2.gui.entries.KeyCodeEntry;
import me.shedaniel.math.Color;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class00647;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04648;
import minecraft.class04654;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08394;

public abstract class AbstractConfigScreen
extends class05096
implements ConfigScreen {
    protected static final class01894 CONFIG_TEX = class01894.N((String)"cloth-config2", (String)"textures/gui/cloth_config.png");
    private final class01894 backgroundLocation;
    protected boolean confirmSave;
    protected final class05096 parent;
    private boolean alwaysShowTabs = false;
    private boolean transparentBackground = false;
    private class00392 defaultFallbackCategory = null;
    public int selectedCategoryIndex = 0;
    private boolean editable = true;
    private KeyCodeEntry focusedBinding;
    private ModifierKeyCode startedKeyCode = null;
    private final List<Tooltip> tooltips = Lists.newArrayList();
    private Runnable savingRunnable = null;
    protected Consumer<class05096> afterInitConsumer = null;

    static /* synthetic */ class06202 access$000(AbstractConfigScreen abstractConfigScreen) {
        return abstractConfigScreen.field_22787;
    }

    static /* synthetic */ class06202 access$100(AbstractConfigScreen abstractConfigScreen) {
        return abstractConfigScreen.field_22787;
    }

    protected AbstractConfigScreen(class05096 class050962, class00392 class003922, class01894 class018942) {
        super(class003922);
        this.parent = class050962;
        this.backgroundLocation = class018942;
    }

    public void save() {
        Optional.ofNullable(this.savingRunnable).ifPresent(Runnable::run);
    }

    public void setEditable(boolean bl) {
        this.editable = bl;
    }

    public void setAlwaysShowTabs(boolean bl) {
        this.alwaysShowTabs = bl;
    }

    public boolean isAlwaysShowTabs() {
        return this.alwaysShowTabs;
    }

    public void setSavingRunnable(Runnable runnable) {
        this.savingRunnable = runnable;
    }

    public boolean method_25404(class06601 class066012) {
        block17: {
            block18: {
                if (this.focusedBinding == null) break block17;
                if (this.focusedBinding.isAllowKey()) break block18;
                if (class066012.v() != 256) break block17;
            }
            if (class066012.v() != 256) {
                if (this.startedKeyCode.isUnknown()) {
                    this.startedKeyCode.setKeyCode(class04655.N((class06601)class066012));
                } else if (this.focusedBinding.isAllowModifiers()) {
                    if (this.startedKeyCode.getType() == class04648.field_1668) {
                        int n = this.startedKeyCode.getKeyCode().y();
                        if (class066012.m()) {
                            Modifier modifier = this.startedKeyCode.getModifier();
                            this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)true, (boolean)modifier.hasShift()));
                            this.startedKeyCode.setKeyCode(class04655.N((class06601)class066012));
                            return true;
                        }
                        if (class066012.W()) {
                            Modifier modifier = this.startedKeyCode.getModifier();
                            this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)modifier.hasControl(), (boolean)true));
                            this.startedKeyCode.setKeyCode(class04655.N((class06601)class066012));
                            return true;
                        }
                        if (class066012.E()) {
                            Modifier modifier = this.startedKeyCode.getModifier();
                            this.startedKeyCode.setModifier(Modifier.of((boolean)true, (boolean)modifier.hasControl(), (boolean)modifier.hasShift()));
                            this.startedKeyCode.setKeyCode(class04655.N((class06601)class066012));
                            return true;
                        }
                    }
                    if (class066012.m()) {
                        Modifier modifier = this.startedKeyCode.getModifier();
                        this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)true, (boolean)modifier.hasShift()));
                        return true;
                    }
                    if (class066012.W()) {
                        Modifier modifier = this.startedKeyCode.getModifier();
                        this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)modifier.hasControl(), (boolean)true));
                        return true;
                    }
                    if (class066012.E()) {
                        Modifier modifier = this.startedKeyCode.getModifier();
                        this.startedKeyCode.setModifier(Modifier.of((boolean)true, (boolean)modifier.hasControl(), (boolean)modifier.hasShift()));
                        return true;
                    }
                }
            } else {
                this.focusedBinding.setValue(ModifierKeyCode.unknown());
                this.setFocusedBinding(null);
            }
            return true;
        }
        if (this.focusedBinding != null && !class066012.i()) {
            return true;
        }
        if (class066012.i() && this.method_25422()) {
            return this.quit();
        }
        return super.method_25404(class066012);
    }

    public void method_25393() {
        super.method_25393();
        boolean bl = this.isEdited();
        Optional.ofNullable(this.getQuitButton()).ifPresent(class064782 -> class064782.method_25355((class00392)(bl ? class00392.L((String)"text.cloth-config.cancel_discard") : class00392.L((String)"gui.cancel"))));
        for (class04654 class046542 : this.method_25396()) {
            if (!(class046542 instanceof TickableWidget)) continue;
            TickableWidget tickableWidget = (TickableWidget)class046542;
            tickableWidget.tick();
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        for (Tooltip tooltip : this.tooltips) {
            class010542.y((class01590)class06202.Nq().i_3, tooltip.getText(), tooltip.getX(), tooltip.getY());
        }
        this.tooltips.clear();
    }

    public boolean method_25406(class06613 class066132) {
        if (this.focusedBinding != null && this.startedKeyCode != null && !this.startedKeyCode.isUnknown() && this.focusedBinding.isAllowMouse()) {
            this.focusedBinding.setValue(this.startedKeyCode);
            this.setFocusedBinding(null);
            return true;
        }
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.focusedBinding != null && this.startedKeyCode != null && this.focusedBinding.isAllowMouse()) {
            if (this.startedKeyCode.isUnknown()) {
                this.startedKeyCode.setKeyCode(class04648.field_1672.N(class066132.v()));
            } else if (this.focusedBinding.isAllowModifiers() && this.startedKeyCode.getType() == class04648.field_1668) {
                int n = this.startedKeyCode.getKeyCode().y();
                if (class066132.m()) {
                    Modifier modifier = this.startedKeyCode.getModifier();
                    this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)true, (boolean)modifier.hasShift()));
                    this.startedKeyCode.setKeyCode(class04648.field_1672.N(class066132.v()));
                    return true;
                }
                if (class066132.W()) {
                    Modifier modifier = this.startedKeyCode.getModifier();
                    this.startedKeyCode.setModifier(Modifier.of((boolean)modifier.hasAlt(), (boolean)modifier.hasControl(), (boolean)true));
                    this.startedKeyCode.setKeyCode(class04648.field_1672.N(class066132.v()));
                    return true;
                }
                if (class066132.E()) {
                    Modifier modifier = this.startedKeyCode.getModifier();
                    this.startedKeyCode.setModifier(Modifier.of((boolean)true, (boolean)modifier.hasControl(), (boolean)modifier.hasShift()));
                    this.startedKeyCode.setKeyCode(class04648.field_1672.N(class066132.v()));
                    return true;
                }
            }
            return true;
        }
        if (this.focusedBinding != null) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        if (this.focusedBinding != null && this.startedKeyCode != null && this.focusedBinding.isAllowKey()) {
            this.focusedBinding.setValue(this.startedKeyCode);
            this.setFocusedBinding(null);
            return true;
        }
        return super.method_16803(class066012);
    }

    public static void handleClickEvent(class00647 class006472, class06202 class062022, class05096 class050962) {
        class05096.method_71847((class00647)class006472, (class06202)class062022, (class05096)class050962);
    }

    public boolean isEditable() {
        return this.editable;
    }

    public List<class04654> childrenL() {
        return super.method_25396();
    }

    protected final boolean quit() {
        if (this.confirmSave && this.isEdited()) {
            this.field_22787.N((class05096)new class05733((BooleanConsumer)new AbstractConfigScreen$QuitSaveConsumer(this), (class00392)class00392.L((String)"text.cloth-config.quit_config"), (class00392)class00392.L((String)"text.cloth-config.quit_config_sure"), (class00392)class00392.L((String)"text.cloth-config.quit_discard"), (class00392)class00392.L((String)"gui.cancel")));
        } else {
            this.field_22787.N(this.parent);
        }
        return true;
    }

    public void saveAll(boolean bl) {
        for (List list : Lists.newArrayList(this.getCategorizedEntries().values())) {
            for (AbstractConfigEntry abstractConfigEntry : list) {
                abstractConfigEntry.save();
            }
        }
        this.save();
        if (bl) {
            if (this.isRequiresRestart()) {
                this.field_22787.N((class05096)new ClothRequiresRestartScreen(this.parent));
            } else {
                this.field_22787.N(this.parent);
            }
        }
    }

    public boolean isEdited() {
        for (List<AbstractConfigEntry<?>> list : this.getCategorizedEntries().values()) {
            for (AbstractConfigEntry<?> abstractConfigEntry : list) {
                if (!abstractConfigEntry.isEdited()) continue;
                return true;
            }
        }
        return false;
    }

    public void addTooltip(Tooltip tooltip) {
        this.tooltips.add(tooltip);
    }

    public boolean isRequiresRestart() {
        for (List<AbstractConfigEntry<?>> list : this.getCategorizedEntries().values()) {
            for (AbstractConfigEntry<?> abstractConfigEntry : list) {
                if (!abstractConfigEntry.getConfigError().isEmpty() || !abstractConfigEntry.isEdited() || !abstractConfigEntry.isRequiresRestart()) continue;
                return true;
            }
        }
        return false;
    }

    public KeyCodeEntry getFocusedBinding() {
        return this.focusedBinding;
    }

    public void setConfirmSave(boolean bl) {
        this.confirmSave = bl;
    }

    @Deprecated
    protected void overlayBackground(class01054 class010542, Rectangle rectangle, int n, int n2, int n3, int n4) {
        class010542.N(class08394.Na, this.getBackgroundLocation(), rectangle.getMinX(), rectangle.getMinY(), (float)rectangle.getMaxX(), (float)rectangle.getMaxY(), rectangle.getWidth(), rectangle.getHeight(), rectangle.getWidth(), rectangle.getHeight(), 32, 32, Color.ofRGBA((int)n, (int)n2, (int)n3, (int)n4).getColor());
    }

    public void setFocusedBinding(KeyCodeEntry keyCodeEntry) {
        this.focusedBinding = keyCodeEntry;
        if (keyCodeEntry != null) {
            this.startedKeyCode = this.focusedBinding.getValue();
            this.startedKeyCode.setKeyCodeAndModifier(class04655.yI, Modifier.none());
        } else {
            this.startedKeyCode = null;
        }
    }

    public boolean isShowingTabs() {
        return this.isAlwaysShowTabs() || this.getCategorizedEntries().size() > 1;
    }

    protected class06478 getQuitButton() {
        return null;
    }

    public void setFallbackCategory(class00392 class003922) {
        this.defaultFallbackCategory = class003922;
        ArrayList arrayList = Lists.newArrayList(this.getCategorizedEntries().keySet());
        for (int i = 0; i < arrayList.size(); ++i) {
            class00392 class003923 = (class00392)arrayList.get(i);
            if (!class003923.equals((Object)this.getFallbackCategory())) continue;
            this.selectedCategoryIndex = i;
            break;
        }
    }

    public void setAfterInitConsumer(Consumer<class05096> consumer) {
        this.afterInitConsumer = consumer;
    }

    public void setTransparentBackground(boolean bl) {
        this.transparentBackground = bl;
    }

    public class01894 getBackgroundLocation() {
        return this.backgroundLocation;
    }

    public boolean isTransparentBackground() {
        return this.transparentBackground;
    }

    public abstract Map<class00392, List<AbstractConfigEntry<?>>> getCategorizedEntries();

    public class00392 getFallbackCategory() {
        if (this.defaultFallbackCategory != null) {
            return this.defaultFallbackCategory;
        }
        return this.getCategorizedEntries().keySet().iterator().next();
    }
}

