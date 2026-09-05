/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06541
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuBooleanOptionElement
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElementScreen
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuLinkElement
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuMainElementScreen
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuProfileElement
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuSubElementScreen
 */
package net.irisshaders.iris.gui.element.widget;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class06541;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.GuiUtil;
import net.irisshaders.iris.gui.NavigationController;
import net.irisshaders.iris.gui.element.ShaderPackOptionList;
import net.irisshaders.iris.gui.element.screen.ElementWidgetScreenData;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.gui.element.widget.BooleanElementWidget;
import net.irisshaders.iris.gui.element.widget.LinkElementWidget;
import net.irisshaders.iris.gui.element.widget.OptionMenuConstructor$ScreenDataProvider;
import net.irisshaders.iris.gui.element.widget.OptionMenuConstructor$WidgetProvider;
import net.irisshaders.iris.gui.element.widget.ProfileElementWidget;
import net.irisshaders.iris.gui.element.widget.SliderElementWidget;
import net.irisshaders.iris.gui.element.widget.StringElementWidget;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuBooleanOptionElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElementScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuLinkElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuMainElementScreen;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuProfileElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuSubElementScreen;

public final class OptionMenuConstructor {
    private static final Map<Class<? extends OptionMenuElement>, OptionMenuConstructor$WidgetProvider<OptionMenuElement>> WIDGET_CREATORS = new HashMap<Class<? extends OptionMenuElement>, OptionMenuConstructor$WidgetProvider<OptionMenuElement>>();
    private static final Map<Class<? extends OptionMenuElementScreen>, OptionMenuConstructor$ScreenDataProvider<OptionMenuElementScreen>> SCREEN_DATA_CREATORS = new HashMap<Class<? extends OptionMenuElementScreen>, OptionMenuConstructor$ScreenDataProvider<OptionMenuElementScreen>>();

    private OptionMenuConstructor() {
    }

    static {
        OptionMenuConstructor.registerScreen(OptionMenuMainElementScreen.class, optionMenuMainElementScreen -> new ElementWidgetScreenData((class00392)class00392.y((String)Iris.getCurrentPackName()).i(Iris.isFallback() ? " (fallback)" : "").N(class06541.field_1067), false));
        OptionMenuConstructor.registerScreen(OptionMenuSubElementScreen.class, optionMenuSubElementScreen -> new ElementWidgetScreenData((class00392)GuiUtil.translateOrDefault(class00392.y((String)optionMenuSubElementScreen.screenId), "screen." + optionMenuSubElementScreen.screenId, new Object[0]), true));
        OptionMenuConstructor.registerWidget(OptionMenuBooleanOptionElement.class, BooleanElementWidget::new);
        OptionMenuConstructor.registerWidget(OptionMenuProfileElement.class, ProfileElementWidget::new);
        OptionMenuConstructor.registerWidget(OptionMenuLinkElement.class, LinkElementWidget::new);
        OptionMenuConstructor.registerWidget(OptionMenuStringOptionElement.class, optionMenuStringOptionElement -> optionMenuStringOptionElement.slider ? new SliderElementWidget((OptionMenuStringOptionElement)optionMenuStringOptionElement) : new StringElementWidget((OptionMenuStringOptionElement)optionMenuStringOptionElement));
    }

    public static <T extends OptionMenuElement> void registerWidget(Class<T> clazz, OptionMenuConstructor$WidgetProvider<T> optionMenuConstructor$WidgetProvider) {
        WIDGET_CREATORS.put(clazz, optionMenuConstructor$WidgetProvider);
    }

    public static <T extends OptionMenuElementScreen> void registerScreen(Class<T> clazz, OptionMenuConstructor$ScreenDataProvider<T> optionMenuConstructor$ScreenDataProvider) {
        SCREEN_DATA_CREATORS.put(clazz, optionMenuConstructor$ScreenDataProvider);
    }

    public static ElementWidgetScreenData createScreenData(OptionMenuElementScreen optionMenuElementScreen2) {
        return SCREEN_DATA_CREATORS.getOrDefault(optionMenuElementScreen2.getClass(), optionMenuElementScreen -> ElementWidgetScreenData.EMPTY).create(optionMenuElementScreen2);
    }

    public static AbstractElementWidget<? extends OptionMenuElement> createWidget(OptionMenuElement optionMenuElement2) {
        return WIDGET_CREATORS.getOrDefault(optionMenuElement2.getClass(), optionMenuElement -> AbstractElementWidget.EMPTY).create(optionMenuElement2);
    }

    public static void constructAndApplyToScreen(OptionMenuContainer optionMenuContainer, ShaderPackScreen shaderPackScreen, ShaderPackOptionList shaderPackOptionList, NavigationController navigationController) {
        OptionMenuElementScreen optionMenuElementScreen = optionMenuContainer.mainScreen;
        if (navigationController.getCurrentScreen() != null && optionMenuContainer.subScreens.containsKey(navigationController.getCurrentScreen())) {
            optionMenuElementScreen = (OptionMenuElementScreen)optionMenuContainer.subScreens.get(navigationController.getCurrentScreen());
        }
        ElementWidgetScreenData elementWidgetScreenData = OptionMenuConstructor.createScreenData(optionMenuElementScreen);
        shaderPackOptionList.addHeader(elementWidgetScreenData.heading(), elementWidgetScreenData.backButton());
        shaderPackOptionList.addWidgets(optionMenuElementScreen.getColumnCount(), optionMenuElementScreen.elements.stream().map(optionMenuElement -> {
            AbstractElementWidget<? extends OptionMenuElement> abstractElementWidget = OptionMenuConstructor.createWidget(optionMenuElement);
            abstractElementWidget.init(shaderPackScreen, navigationController);
            return abstractElementWidget;
        }).collect(Collectors.toList()));
    }
}

