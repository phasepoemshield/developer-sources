package ru.destra.fix;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class KeybindFix implements ClientModInitializer {
    private static boolean wasRightShiftDown = false;
    private static final boolean DEV_AUTO_OPEN_GUI = Boolean.getBoolean("destra.dev.auto_open_gui");
    private static boolean devAutoOpenDone = false;
    private static int devAutoOpenDelayTicks = 40;
    private static Object fallbackVisibleSetting;
    private static int guiDebugPrintedTicks;
    private static boolean guiBoundsDebugPrinted;
    private static int guiBoundsLogAttempts;
    private static int guiLogSkipTicks;

    private static int configSaveTickCounter = 0;
    private static boolean wasGuiOpen = false;

    @Override
    public void onInitializeClient() {
        if (DEV_AUTO_OPEN_GUI) {
            // System.err.println("[Destra Fix] DEV_AUTO_OPEN_GUI enabled");
        }
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (DEV_AUTO_OPEN_GUI && !devAutoOpenDone && client.getWindow() != null && canAutoOpenGui(client)) {
                if (devAutoOpenDelayTicks > 0) {
                    devAutoOpenDelayTicks--;
                } else {
                    openClickGui(client);
                    devAutoOpenDone = true;
                }
            }

            boolean guiOpen = isOriginalClickGui(client.currentScreen);
            if (guiOpen) {
                repairOpenClickGui(client.currentScreen);
            } else if (client.currentScreen == null) {
                guiAnimationInitialized = false;
            }

            if (wasGuiOpen && !guiOpen) {
                forceConfigSave();
            }
            wasGuiOpen = guiOpen;

            configSaveTickCounter++;
            if (configSaveTickCounter >= 200) {
                configSaveTickCounter = 0;
                forceConfigSave();
            }

            if (client.currentScreen == null && client.getWindow() != null) {
                long handle = client.getWindow().getHandle();
                boolean isDown = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;

                if (isDown && !wasRightShiftDown) {
                    openClickGui(client);
                }
                wasRightShiftDown = isDown;
            } else if (client.currentScreen != null) {
                wasRightShiftDown = false;
            }
        });
    }

    private static void forceConfigSave() {
        try {
            Class<?> destraClientClass = Class.forName("ru.destra.core.DestraClient");
            Object instance = destraClientClass.getMethod("getInstance").invoke(null);
            Field cmField = destraClientClass.getDeclaredField("configManager");
            cmField.setAccessible(true);
            Object configManager = cmField.get(instance);
            if (configManager == null) return;
            java.lang.reflect.Method saveMethod = configManager.getClass().getMethod("saveToAutosave");
            saveMethod.invoke(configManager);
        } catch (Exception ignored) {}
    }

    private static boolean canAutoOpenGui(MinecraftClient client) {
        if (client.player != null && client.world != null && client.currentScreen == null) {
            return true;
        }
        return client.currentScreen != null;
    }

    private static boolean isOriginalClickGui(Screen screen) {
        return screen != null && "ru.destra.gui.ClickGuiScreen".equals(screen.getClass().getName());
    }

    private static void repairOpenClickGui(Screen screen) {
        try {
            initAnimationFields();
            fixModuleNames();
            fixHudBlur();
            forceGuiOpened(screen);
            sanitizeGuiElements(screen);
            fixHudModuleTimers();
            logGuiState(screen);
        } catch (Exception e) {
            // System.err.println("[Destra Fix] Failed to repair open ClickGui:");
            // e.printStackTrace();
        }
    }

    private static Object unsafeInstance;

    private static Object getUnsafe() throws Exception {
        if (unsafeInstance != null) return unsafeInstance;
        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        Field f = unsafeClass.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        unsafeInstance = f.get(null);
        return unsafeInstance;
    }

    private static void unsafePutObject(Object obj, Field field, Object value) throws Exception {
        Object unsafe = getUnsafe();
        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        long offset = (Long) unsafeClass.getMethod("objectFieldOffset", Field.class).invoke(unsafe, field);
        unsafeClass.getMethod("putObject", Object.class, long.class, Object.class).invoke(unsafe, obj, offset, value);
    }

    private static void debugLog(String content) {
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            if (mc == null || mc.runDirectory == null) return;
            java.nio.file.Path logFile = mc.runDirectory.toPath().resolve("destra_debug.log");
            java.nio.file.Files.writeString(logFile, content,
                java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
        } catch (Exception ignored) {}
    }

    private static void fixHudBlur() {
        try {
            Class<?> destraClientClass = Class.forName("ru.destra.core.DestraClient");
            Object instance = destraClientClass.getMethod("getInstance").invoke(null);
            Object moduleManager = destraClientClass.getMethod("getModuleManager").invoke(instance);

            Field themesField = moduleManager.getClass().getDeclaredField("themes");
            themesField.setAccessible(true);
            Object themes = themesField.get(moduleManager);
            if (themes == null) { debugLog("fixHudBlur: themes is null\n"); return; }

            Field blurField = themes.getClass().getDeclaredField("hudBlurEnabled");
            blurField.setAccessible(true);
            Object blurSetting = blurField.get(themes);
            if (blurSetting == null) { debugLog("fixHudBlur: blurSetting is null\n"); return; }

            Field valueField = blurSetting.getClass().getSuperclass().getDeclaredField("value");
            valueField.setAccessible(true);
            Object before = valueField.get(blurSetting);
            unsafePutObject(blurSetting, valueField, Boolean.FALSE);
            Object after = valueField.get(blurSetting);
            debugLog("fixHudBlur: value before=" + before + " after=" + after + "\n");
        } catch (Exception e) {
            debugLog("fixHudBlur FAILED: " + e + "\n");
        }
    }

    private static void fixModuleNames() {
        try {
            Class<?> destraClientClass = Class.forName("ru.destra.core.DestraClient");
            Object instance = destraClientClass.getMethod("getInstance").invoke(null);
            Object moduleManager = destraClientClass.getMethod("getModuleManager").invoke(instance);
            Field modulesField = moduleManager.getClass().getDeclaredField("modules");
            modulesField.setAccessible(true);
            List<?> modules = (List<?>) modulesField.get(moduleManager);

            Class<?> moduleClass = Class.forName("ru.destra.core.Module");
            Field nameField = moduleClass.getDeclaredField("name");
            nameField.setAccessible(true);

            java.util.Map<String, String> nameCorrections = new java.util.HashMap<>();
            nameCorrections.put("PlayerInfoHud", "Player Info");
            nameCorrections.put("InventoryDisplayModule", "Inventory Display");
            nameCorrections.put("ArmorDurabilityHud", "Armor Durability");
            nameCorrections.put("BindsHud", "Binds");
            nameCorrections.put("CoordinatesHud", "Coordinates");
            nameCorrections.put("TargetInfoHud", "Target Info");
            nameCorrections.put("CooldownsHudModule", "Cooldowns");
            nameCorrections.put("PotionsHudModule", "Potions");
            nameCorrections.put("ScoreboardHudModule", "Scoreboard");

            StringBuilder log = new StringBuilder();
            log.append("\n=== fixModuleNames ===\n");
            log.append("Module count: ").append(modules.size()).append("\n");

            int fixed = 0;
            for (Object module : modules) {
                if (module == null) continue;
                try {
                    String className = module.getClass().getSimpleName();
                    String currentName = (String) nameField.get(module);
                    log.append("  ").append(className).append(" -> name=").append(currentName).append("\n");
                    String correctName = nameCorrections.get(className);
                    if (correctName != null && !correctName.equals(currentName)) {
                        unsafePutObject(module, nameField, correctName);
                        String verifyName = (String) nameField.get(module);
                        log.append("    FIXED -> ").append(verifyName).append("\n");
                        fixed++;
                    }
                } catch (Throwable t) {
                    log.append("    ERROR: ").append(t).append("\n");
                }
            }
            log.append("Total fixed: ").append(fixed).append("\n");
            debugLog(log.toString());
        } catch (Exception e) {
            debugLog("fixModuleNames FAILED: " + e + "\n");
        }
    }

    private static void fixHudModuleTimers() {
        try {
            Class<?> destraClientClass = Class.forName("ru.destra.core.DestraClient");
            Object instance = destraClientClass.getMethod("getInstance").invoke(null);
            java.lang.reflect.Method getModuleManager = destraClientClass.getMethod("getModuleManager");
            Object moduleManager = getModuleManager.invoke(instance);
            java.lang.reflect.Field modulesField = moduleManager.getClass().getDeclaredField("modules");
            modulesField.setAccessible(true);
            List<?> modules = (List<?>) modulesField.get(moduleManager);

            Class<?> hudModuleClass = Class.forName("ru.destra.module.HudModule");
            Class<?> timedAnimationClass = Class.forName("ru.destra.animation.TimedAnimation");
            Class<?> cooldownTimerClass = Class.forName("ru.destra.util.CooldownTimer");

            for (Object module : modules) {
                if (module == null) continue;
                if (!hudModuleClass.isInstance(module)) continue;
                try {
                    Class<?> moduleClass = module.getClass();
                    for (java.lang.reflect.Field f : moduleClass.getDeclaredFields()) {
                        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                            f.setAccessible(true);
                            Object anim = f.get(module);
                            if (anim != null && timedAnimationClass.isAssignableFrom(anim.getClass())) {
                                Class<?> animClass = anim.getClass();
                                while (animClass != null) {
                                    for (java.lang.reflect.Field af : animClass.getDeclaredFields()) {
                                        if (af.getType() == cooldownTimerClass) {
                                            af.setAccessible(true);
                                            if (af.get(anim) == null) {
                                                Object timer = cooldownTimerClass.getDeclaredConstructor().newInstance();
                                                af.set(anim, timer);
                                            }
                                        }
                                    }
                                    animClass = animClass.getSuperclass();
                                }
                            }
                        }
                    }
                } catch (Throwable ignored) {}
            }
        } catch (Exception ignored) {}
    }

    private static boolean guiAnimationInitialized = false;

    private static void forceGuiOpened(Object gui) throws Exception {
        Class<?> guiClass = gui.getClass();
        Field isGuiOpenedField = guiClass.getDeclaredField("isGuiOpened");
        isGuiOpenedField.setAccessible(true);
        boolean isGuiOpened = isGuiOpenedField.getBoolean(gui);

        Field isClosingField = guiClass.getDeclaredField("isClosing");
        isClosingField.setAccessible(true);
        boolean isClosing = isClosingField.getBoolean(gui);

        if (isClosing) {
            guiAnimationInitialized = false;
            return;
        }

        if (!isGuiOpened) {
            isGuiOpenedField.setBoolean(gui, true);
            guiAnimationInitialized = false;
            // System.err.println("[Destra Fix] Forced isGuiOpened=true");
        }

        if (!guiAnimationInitialized) {
            setAnimationValue(guiClass, "openCloseScale", 0.75);
            setAnimationValue(guiClass, "openCloseAlpha", 1.0);
            try {
                Field f1 = guiClass.getDeclaredField("smoothScrollOffsetModules");
                f1.setAccessible(true);
                f1.setFloat(gui, 0f);
                Field f2 = guiClass.getDeclaredField("targetScrollOffsetModules");
                f2.setAccessible(true);
                f2.setFloat(gui, 0f);
                Field f3 = guiClass.getDeclaredField("maxScrollOffsetModules");
                f3.setAccessible(true);
                f3.setFloat(gui, 0f);
            } catch (Exception ignored) {}
            guiAnimationInitialized = true;
        }
    }

    private static void setAnimationValue(Class<?> guiClass, String fieldName, double value) throws Exception {
        Field field = guiClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        Object anim = field.get(null);
        if (anim == null) return;
        Class<?> animClass = anim.getClass();
        for (String f : new String[]{"currentValue", "targetValue", "fromValue", "storedTarget"}) {
            try {
                Field fld = animClass.getDeclaredField(f);
                fld.setAccessible(true);
                fld.setDouble(anim, value);
            } catch (NoSuchFieldException ignored) {}
        }
        Field fin = animClass.getDeclaredField("finished");
        fin.setAccessible(true);
        fin.setBoolean(anim, true);
        Field st = animClass.getDeclaredField("startTime");
        st.setAccessible(true);
        st.setLong(anim, 0);
    }

    private static void initAnimationFields() {
        try {
            Class<?> guiClass = Class.forName("ru.destra.gui.ClickGuiScreen");
            Field alphaField = guiClass.getDeclaredField("openCloseAlpha");
            Field scaleField = guiClass.getDeclaredField("openCloseScale");
            alphaField.setAccessible(true);
            scaleField.setAccessible(true);

            initGuiStaticFinalField(guiClass, "moduleNameComparator", (Comparator<Object>) (left, right) -> 0);
            initGuiStaticFinalField(guiClass, "logoTexture", Identifier.of("destra", "images/logoup.png"));
            initGuiStaticFinalField(guiClass, "unknownServerIconTexture", Identifier.of("minecraft", "textures/misc/unknown_server.png"));
            initGuiStaticFinalField(guiClass, "friendServerClient", Class.forName("ru.destra.social.FriendServerClient").getDeclaredConstructor().newInstance());

            boolean initialized = alphaField.get(null) != null && scaleField.get(null) != null;
            if (!initialized) {
                Class<?> easingTypeClass = Class.forName("ru.destra.animation.EasingType");
                Object linear = easingTypeClass.getDeclaredField("LINEAR").get(null);

                Class<?> animValueClass = Class.forName("ru.destra.animation.AnimationValue");
                Constructor<?> ctor = animValueClass.getDeclaredConstructor(easingTypeClass, long.class, float.class);
                ctor.setAccessible(true);

                Object alpha = ctor.newInstance(linear, 300L, 0.0f);
                Object scale = ctor.newInstance(linear, 300L, 0.0f);

                alphaField.set(null, alpha);
                scaleField.set(null, scale);
            }

            if (alphaField.get(null) != null && scaleField.get(null) != null) {
                Field showOthers = guiClass.getDeclaredField("showOthersWaypoints");
                showOthers.setAccessible(true);
                showOthers.set(null, true);

                Field showUnknown = guiClass.getDeclaredField("showUnknownEvents");
                showUnknown.setAccessible(true);
                showUnknown.set(null, true);

                Field showActive = guiClass.getDeclaredField("showActiveEvents");
                showActive.setAccessible(true);
                showActive.set(null, true);

                Field showOtherEvents = guiClass.getDeclaredField("showOtherEvents");
                showOtherEvents.setAccessible(true);
                showOtherEvents.set(null, true);

                Field fastPoint = guiClass.getDeclaredField("fastPointMouseButton");
                fastPoint.setAccessible(true);
                fastPoint.set(null, -1);

                Field secondaryKey = guiClass.getDeclaredField("secondaryKeyCode");
                secondaryKey.setAccessible(true);
                secondaryKey.set(null, -1);

                Field pendingTooltip = guiClass.getDeclaredField("pendingTooltipText");
                pendingTooltip.setAccessible(true);
                pendingTooltip.set(null, "");

                Field logoTextureFilterApplied = guiClass.getDeclaredField("logoTextureFilterApplied");
                logoTextureFilterApplied.setAccessible(true);
                logoTextureFilterApplied.set(null, false);
            }
        } catch (Exception e) {
            // System.err.println("[Destra Fix] Failed to init animation fields:");
            // e.printStackTrace();
        }
    }

    private static void initGuiStaticFinalField(Class<?> owner, String fieldName, Object value) throws Exception {
        Field field = owner.getDeclaredField(fieldName);
        field.setAccessible(true);
        if (field.get(null) != null) {
            return;
        }

        Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
        Field unsafeField = unsafeClass.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Object unsafe = unsafeField.get(null);

        Method staticFieldBase = unsafeClass.getMethod("staticFieldBase", Field.class);
        Method staticFieldOffset = unsafeClass.getMethod("staticFieldOffset", Field.class);
        Method putObject = unsafeClass.getMethod("putObject", Object.class, long.class, Object.class);

        Object base = staticFieldBase.invoke(unsafe, field);
        long offset = (Long) staticFieldOffset.invoke(unsafe, field);
        putObject.invoke(unsafe, base, offset, value);
    }

    private static void openClickGui(MinecraftClient client) {
        try {
            initAnimationFields();
            fixModuleNames();
            fixHudBlur();

            Class<?> destraClass = Class.forName("ru.destra.core.DestraClient");
            Object instance = destraClass.getMethod("getInstance").invoke(null);
            Field guiField = destraClass.getDeclaredField("clickGuiScreen");
            guiField.setAccessible(true);
            Object gui = guiField.get(instance);
            sanitizeGuiElements(gui);
            logGuiState(gui);
            if (gui instanceof Screen guiScreen) {
                client.setScreen(guiScreen);
            }
        } catch (Exception e) {
            // System.err.println("[Destra Fix] Failed to open ClickGui:");
            // e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void sanitizeGuiElements(Object gui) throws Exception {
        if (gui == null) {
            return;
        }

        Field moduleElementsField = gui.getClass().getDeclaredField("moduleElements");
        moduleElementsField.setAccessible(true);
        Object moduleElements = moduleElementsField.get(gui);
        if (!(moduleElements instanceof List<?> elements)) {
            return;
        }

        Class<?> guiTextInputClass = Class.forName("ru.destra.gui.GuiTextInput");
        Field settingField = guiTextInputClass.getDeclaredField("setting");
        settingField.setAccessible(true);

        for (Object element : elements) {
            if (element == null) {
                continue;
            }

            Field childElementsField = element.getClass().getDeclaredField("childElements");
            childElementsField.setAccessible(true);
            Object childElements = childElementsField.get(element);
            if (!(childElements instanceof List<?> children)) {
                continue;
            }

            Object module = null;
            try {
                Field moduleField = element.getClass().getDeclaredField("module");
                moduleField.setAccessible(true);
                module = moduleField.get(element);
            } catch (NoSuchFieldException ignored) {
            }

            for (Object child : children) {
                if (child == null || !guiTextInputClass.isInstance(child)) {
                    continue;
                }

                Object current = settingField.get(child);
                Object real = resolveSubclassSetting(child);
                // ModeChangeScreen2 height needs the real ModeSetting on GuiTextInput.setting.
                // A dummy fallback makes instanceof ModeSetting fail → height 0 → modes invisible.
                if (real != null && (current == null || isFallbackSetting(current))) {
                    settingField.set(child, real);
                } else if (current == null) {
                    settingField.set(child, createFallbackVisibleSetting(module));
                }
            }
        }
    }

    /**
     * Recovered GUI widgets store the real Setting on a shadow field {@code й}
     * (and typed helpers like {@code modeSetting}/{@code settingGroup}) instead of
     * {@link ru.destra.gui.GuiTextInput#setting}. Prefer those over a dummy fallback.
     */
    private static Object resolveSubclassSetting(Object child) throws Exception {
        Class<?> settingClass = Class.forName("ru.destra.setting.Setting");
        String[] preferred = {"modeSetting", "settingGroup", "booleanSetting", "й", "setting"};
        Class<?> type = child.getClass();
        while (type != null && type != Object.class) {
            for (String name : preferred) {
                try {
                    Field field = type.getDeclaredField(name);
                    if (!settingClass.isAssignableFrom(field.getType())) {
                        continue;
                    }
                    // Skip the inherited GuiTextInput.setting — we want the shadow copy.
                    if ("setting".equals(name) && "ru.destra.gui.GuiTextInput".equals(type.getName())) {
                        continue;
                    }
                    field.setAccessible(true);
                    Object value = field.get(child);
                    if (value != null && settingClass.isInstance(value) && !isFallbackSetting(value)) {
                        return value;
                    }
                } catch (NoSuchFieldException ignored) {
                }
            }
            type = type.getSuperclass();
        }
        return null;
    }

    private static boolean isFallbackSetting(Object setting) {
        if (setting == null) {
            return false;
        }
        if (setting == fallbackVisibleSetting) {
            return true;
        }
        try {
            Field nameField = setting.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            Object name = nameField.get(setting);
            return "gui_fix_visible".equals(name);
        } catch (ReflectiveOperationException e) {
            return false;
        }
    }

    private static Object createFallbackVisibleSetting(Object module) throws Exception {
        if (fallbackVisibleSetting != null) {
            return fallbackVisibleSetting;
        }

        Class<?> settingClass = Class.forName("ru.destra.setting.Setting");
        Class<?> moduleClass = Class.forName("ru.destra.core.Module");
        Constructor<?> ctor = settingClass.getDeclaredConstructor(String.class, Object.class, moduleClass);
        ctor.setAccessible(true);
        Object setting = ctor.newInstance("gui_fix_visible", Boolean.TRUE, module);

        Field visibilityConditionField = settingClass.getDeclaredField("visibilityCondition");
        visibilityConditionField.setAccessible(true);
        visibilityConditionField.set(setting, (Supplier<Boolean>) () -> Boolean.TRUE);

        fallbackVisibleSetting = setting;
        return setting;
    }

    private static void logGuiState(Object gui) {
        if (gui == null) return;
        guiLogSkipTicks++;
        if (guiLogSkipTicks < 20) return;
        guiLogSkipTicks = 0;
        if (guiDebugPrintedTicks > 0) return;
        try {
            Class<?> guiClass = gui.getClass();
            Class<?> gtiClass = Class.forName("ru.destra.gui.GuiTextInput");
            Class<?> kseClass = Class.forName("ru.destra.gui.KeybindSettingElement");

            Field xF = gtiClass.getDeclaredField("x"); xF.setAccessible(true);
            Field yF = gtiClass.getDeclaredField("y"); yF.setAccessible(true);
            Field wF = gtiClass.getDeclaredField("width"); wF.setAccessible(true);
            Field hF = gtiClass.getDeclaredField("height"); hF.setAccessible(true);

            Field lcF = guiClass.getDeclaredField("leftColumnModules"); lcF.setAccessible(true);
            Field rcF = guiClass.getDeclaredField("rightColumnModules"); rcF.setAccessible(true);
            List<?> lc = (List<?>) lcF.get(gui);
            List<?> rc = (List<?>) rcF.get(gui);

            Field scaleF = guiClass.getDeclaredField("openCloseScale"); scaleF.setAccessible(true);
            Object scaleAnim = scaleF.get(null);
            double scaleVal = 0;
            if (scaleAnim != null) {
                Field cv = scaleAnim.getClass().getDeclaredField("currentValue"); cv.setAccessible(true);
                scaleVal = cv.getDouble(scaleAnim);
            }
            Field alphaF = guiClass.getDeclaredField("openCloseAlpha"); alphaF.setAccessible(true);
            Object alphaAnim = alphaF.get(null);
            double alphaVal = 0;
            if (alphaAnim != null) {
                Field cv = alphaAnim.getClass().getDeclaredField("currentValue"); cv.setAccessible(true);
                alphaVal = cv.getDouble(alphaAnim);
            }

            Field scrollF = guiClass.getDeclaredField("smoothScrollOffsetModules"); scrollF.setAccessible(true);
            float scroll = scrollF.getFloat(gui);
            Field targetScrollF = guiClass.getDeclaredField("targetScrollOffsetModules"); targetScrollF.setAccessible(true);
            float targetScroll = targetScrollF.getFloat(gui);
            Field maxScrollF = guiClass.getDeclaredField("maxScrollOffsetModules"); maxScrollF.setAccessible(true);
            float maxScroll = maxScrollF.getFloat(gui);

            MinecraftClient mc = MinecraftClient.getInstance();
            int fbW = mc.getWindow().getFramebufferWidth();
            int fbH = mc.getWindow().getFramebufferHeight();
            int sw = ru.destra.render.ScaledResolution.getScaledWidth(2);
            int sh = ru.destra.render.ScaledResolution.getScaledHeight(2);

            float guiW = 406.25f, guiH = 281.25f, sidebarW = 125.0f, topbarH = 28.0f;
            float var13 = (float)(1.75 - scaleVal);
            float var9 = sw / 2.0f - guiW / 2.0f;
            float var10 = sh / 2.0f - guiH / 2.0f;
            float var16 = (var9 - sw / 2.0f) * var13 + sw / 2.0f;
            float var17 = (var10 - sh / 2.0f) * var13 + sh / 2.0f;
            float scissorX = var16 + sidebarW * var13;
            float scissorY = var17 + topbarH * var13;
            float scissorW = (guiW - sidebarW) * var13;
            float scissorH = (guiH - topbarH) * var13;
            float colW = (guiW - sidebarW) / 2.0f;

            java.util.List<Field> kseFloats = new java.util.ArrayList<>();
            for (Field f : kseClass.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && f.getType() == float.class) {
                    f.setAccessible(true);
                    kseFloats.add(f);
                }
            }
            Field moduleF = kseClass.getDeclaredField("module"); moduleF.setAccessible(true);
            java.lang.reflect.Method getNameM = null;
            for (java.lang.reflect.Method m : moduleF.getType().getDeclaredMethods()) {
                if (m.getParameterCount() == 0 && (m.getReturnType() == String.class || m.getReturnType().getName().contains("Text"))) {
                    getNameM = m; getNameM.setAccessible(true); break;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("=== TICK ").append(guiDebugPrintedTicks).append(" ===\n");
            sb.append("SCREEN: fb=").append(fbW).append("x").append(fbH).append(" scaled=").append(sw).append("x").append(sh).append("\n");
            sb.append("ANIM: scale=").append(scaleVal).append(" alpha=").append(alphaVal).append(" var13=").append(var13).append("\n");
            sb.append("GUI: guiX=").append(var9).append(" guiY=").append(var10).append(" guiW=").append(guiW).append(" guiH=").append(guiH).append("\n");
            sb.append("SCISSOR: x=").append(scissorX).append(" y=").append(scissorY).append(" w=").append(scissorW).append(" h=").append(scissorH).append("\n");
            sb.append("SCROLL: smooth=").append(scroll).append(" target=").append(targetScroll).append(" max=").append(maxScroll).append("\n");
            sb.append("COLS: colWidth=").append(colW).append(" left=").append(lc.size()).append(" right=").append(rc.size()).append("\n");

            for (int i = 0; i < Math.min(lc.size(), 5); i++) {
                Object e = lc.get(i);
                sb.append("L[").append(i).append("] GTI:x=").append(xF.getFloat(e))
                  .append(",y=").append(yF.getFloat(e))
                  .append(",w=").append(wF.getFloat(e))
                  .append(",h=").append(hF.getFloat(e));
                for (Field kf : kseFloats) {
                    sb.append(" ").append(kf.getName()).append("=").append(kf.getFloat(e));
                }
                if (moduleF != null && getNameM != null) {
                    try { Object mod = moduleF.get(e);
                        if (mod != null) sb.append(" name=").append(getNameM.invoke(mod));
                    } catch (Throwable ignored) {}
                }
                sb.append("\n");
            }
            for (int i = 0; i < Math.min(rc.size(), 3); i++) {
                Object e = rc.get(i);
                sb.append("R[").append(i).append("] GTI:x=").append(xF.getFloat(e))
                  .append(",y=").append(yF.getFloat(e))
                  .append(",w=").append(wF.getFloat(e))
                  .append(",h=").append(hF.getFloat(e));
                for (Field kf : kseFloats) {
                    sb.append(" ").append(kf.getName()).append("=").append(kf.getFloat(e));
                }
                if (moduleF != null && getNameM != null) {
                    try { Object mod = moduleF.get(e);
                        if (mod != null) sb.append(" name=").append(getNameM.invoke(mod));
                    } catch (Throwable ignored) {}
                }
                sb.append("\n");
            }

            java.nio.file.Path logFile = mc.runDirectory.toPath().resolve("destra_debug.log");
            java.nio.file.Files.writeString(logFile, sb.toString(),
                java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
            guiDebugPrintedTicks++;
        } catch (Exception e) { }
    }

    private static void logFirstChildBounds(Object moduleElement, Class<?> guiTextInputClass) {
        try {
            Field childElementsField = moduleElement.getClass().getDeclaredField("childElements");
            childElementsField.setAccessible(true);
            Object childElements = childElementsField.get(moduleElement);
            if (!(childElements instanceof List<?> children) || children.isEmpty()) {
                return;
            }

            Object firstChild = children.getFirst();
            Field xField = guiTextInputClass.getDeclaredField("x");
            Field yField = guiTextInputClass.getDeclaredField("y");
            Field widthField = guiTextInputClass.getDeclaredField("width");
            Field heightField = guiTextInputClass.getDeclaredField("height");
            xField.setAccessible(true);
            yField.setAccessible(true);
            widthField.setAccessible(true);
            heightField.setAccessible(true);

            // Removed console spam
            logDuplicateBounds("[Destra Fix] First child duplicate bounds", firstChild);
        } catch (Exception ignored) {
        }
    }

    private static void logDuplicateBounds(String prefix, Object instance) {
        try {
            List<Field> floats = new ArrayList<>();
            for (Field field : instance.getClass().getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && field.getType() == float.class) {
                    field.setAccessible(true);
                    floats.add(field);
                }
            }

            if (floats.size() < 4) {
                return;
            }

            int start = Math.max(0, floats.size() - 4);
            StringBuilder builder = new StringBuilder(prefix);
            for (int i = start; i < floats.size(); i++) {
                Field field = floats.get(i);
                builder.append(i == start ? ": " : ", ")
                    .append(field.getName())
                    .append("=")
                    .append(field.getFloat(instance));
            }
            // Removed console spam
        } catch (Exception ignored) {
        }
    }
}
