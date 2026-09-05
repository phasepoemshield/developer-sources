/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 */
package com.holdmylua.source.global;

import com.holdmylua.source.model.ModelPartAnimator;
import com.holdmylua.source.patricles.Particle;
import com.holdmylua.source.scripting.custom_api.DebugTextRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.class_1799;
import net.minecraft.class_1802;

public class GlobalsStorage {
    public static HashMap<String, Boolean> renderAsBlock = new HashMap();
    public static HashMap<String, Boolean> translateItem = new HashMap();
    public static HashMap<String, Boolean> applyBlockRotation = new HashMap();
    public static HashMap<String, Integer> itemSwingSpeed = new HashMap();
    public static HashMap<String, Object> useDuration = new HashMap();
    public static HashMap<String, Boolean> usingItem = new HashMap();
    public static final HashMap<String, Object> registry = new HashMap();
    public static final List<Particle> particles = new ArrayList<Particle>();
    public static final ModelPartAnimator modelPartAnimator = new ModelPartAnimator();
    public static final DebugTextRenderer debugTextRenderer = new DebugTextRenderer();
    public static class_1799 mainHandItem = class_1802.field_8162.method_7854();
    public static class_1799 offHandItem = class_1802.field_8162.method_7854();
    public static class_1799 renderedStack = class_1802.field_8162.method_7854();
}

