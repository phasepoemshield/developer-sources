/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.option.OptionSet
 *  net.irisshaders.iris.shaderpack.option.Profile
 *  net.irisshaders.iris.shaderpack.option.ProfileSet
 *  net.irisshaders.iris.shaderpack.option.ProfileSet$ProfileResult
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuProfileElement
 *  net.irisshaders.iris.shaderpack.option.values.OptionValues
 */
package net.irisshaders.iris.gui.element.widget;

import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.widget.BaseOptionElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.Profile;
import net.irisshaders.iris.shaderpack.option.ProfileSet;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuProfileElement;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class ProfileElementWidget
extends BaseOptionElementWidget<OptionMenuProfileElement> {
    private static final class05216 PROFILE_LABEL = class00392.L((String)"options.iris.profile");
    private static final class05216 PROFILE_CUSTOM = class00392.L((String)"options.iris.profile.custom").N(class06541.field_1054);
    private Profile next;
    private Profile previous;
    private class00392 profileLabel;

    public ProfileElementWidget(OptionMenuProfileElement optionMenuProfileElement) {
        super(optionMenuProfileElement);
    }

    @Override
    public void init(ShaderPackScreen shaderPackScreen, NavigationController navigationController) {
        super.init(shaderPackScreen, navigationController);
        this.setLabel(PROFILE_LABEL);
        ProfileSet profileSet = ((OptionMenuProfileElement)this.element).profiles;
        OptionSet optionSet = ((OptionMenuProfileElement)this.element).options;
        OptionValues optionValues = ((OptionMenuProfileElement)this.element).getPendingOptionValues();
        ProfileSet.ProfileResult profileResult = profileSet.scan(optionSet, optionValues);
        this.next = profileResult.next;
        this.previous = profileResult.previous;
        Optional<String> optional = profileResult.current.map(profile -> profile.name);
        this.profileLabel = (class00392)optional.map(string -> GuiUtil.translateOrDefault(class00392.y((String)string), "profile." + string, new Object[0])).orElse(PROFILE_CUSTOM);
    }

    @Override
    public void render(class01054 class010542, int n, int n2, float f, boolean bl) {
        this.updateRenderParams(this.bounds.M() - (((class01590)class06202.Nq().i_3).N((class05936)PROFILE_LABEL) + 16));
        this.renderOptionWithValue(class010542, bl || this.method_25370());
    }

    @Override
    protected class00392 createValueLabel() {
        return this.profileLabel;
    }

    @Override
    public boolean applyOriginalValue() {
        return false;
    }

    @Override
    public boolean applyNextValue() {
        if (this.next == null) {
            return false;
        }
        Iris.queueShaderPackOptionsFromProfile((Profile)this.next);
        return true;
    }

    @Override
    public String getCommentKey() {
        return "profile.comment";
    }

    @Override
    public boolean applyPreviousValue() {
        if (this.previous == null) {
            return false;
        }
        Iris.queueShaderPackOptionsFromProfile((Profile)this.previous);
        return true;
    }

    @Override
    public boolean isValueModified() {
        return false;
    }

    @Override
    public Optional<class00392> getCommentTitle() {
        return Optional.of(PROFILE_LABEL);
    }
}

