/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.class_2960
 *  net.minecraft.class_3298
 *  net.minecraft.class_3300
 */
package com.holdmylua.source.lua_runtime.resource_controller;

import com.holdmylua.source.global.GlobalsStorage;
import com.holdmylua.source.lua_runtime.LuaScriptCache;
import com.holdmylua.source.lua_runtime.ModelScriptCache;
import com.holdmylua.source.lua_runtime.ScriptHolder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_3298;
import net.minecraft.class_3300;

public class LuaAnimationResourceLoader
implements SimpleSynchronousResourceReloadListener {
    public class_2960 getFabricId() {
        return class_2960.method_60655((String)"holdmyitems", (String)"lua_animation_loader");
    }

    private String preprocessScript(String script) {
        if (script == null || script.isEmpty()) {
            return script;
        }
        Pattern globalPattern = Pattern.compile("global\\.(\\w+)\\s*=\\s*([^;]+)\\s*;");
        Pattern placeholderPattern = Pattern.compile("\\$\\{(\\w+)\\}");
        HashSet<String> persistVars = new HashSet<String>();
        StringBuilder processed = new StringBuilder();
        boolean respackoptsLoaded = FabricLoader.getInstance().isModLoaded("respackopts");
        for (String line : script.split("\\r?\\n")) {
            if (!respackoptsLoaded) {
                Matcher placeholderMatcher = placeholderPattern.matcher(line);
                StringBuffer placeholderBuffer = new StringBuffer();
                while (placeholderMatcher.find()) {
                    placeholderMatcher.appendReplacement(placeholderBuffer, "0");
                }
                placeholderMatcher.appendTail(placeholderBuffer);
                line = placeholderBuffer.toString();
            }
            Matcher globalMatcher = globalPattern.matcher(line);
            StringBuffer lineBuffer = new StringBuffer();
            boolean found = false;
            while (globalMatcher.find()) {
                String varName = globalMatcher.group(1);
                String value = globalMatcher.group(2).trim();
                persistVars.add(varName);
                globalMatcher.appendReplacement(lineBuffer, "local " + varName + " = registry:getOrDefault('" + varName + "', " + value + ")");
                found = true;
            }
            globalMatcher.appendTail(lineBuffer);
            if (found) {
                processed.append(lineBuffer.toString());
            } else {
                processed.append(line);
            }
            processed.append("\n");
        }
        if (!persistVars.isEmpty()) {
            processed.append("\n-- PERSIST VARIABLES\n");
            for (String varName : persistVars) {
                processed.append("registry:put('").append(varName).append("', ").append(varName).append(")\n");
            }
        }
        return processed.toString();
    }

    public void method_14491(class_3300 manager) {
        GlobalsStorage.renderAsBlock.clear();
        GlobalsStorage.translateItem.clear();
        GlobalsStorage.registry.clear();
        GlobalsStorage.useDuration.clear();
        GlobalsStorage.applyBlockRotation.clear();
        this.loadSingle(manager, "holdmyitems/hand_pose.lua", script -> {
            try {
                ScriptHolder.handScriptCache = new LuaScriptCache((String)script);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        this.loadSingle(manager, "holdmyitems/item_pose.lua", script -> {
            try {
                ScriptHolder.itemScriptCache = new LuaScriptCache((String)script);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        this.loadSingle(manager, "holdmyitems/hand_relative_pose.lua", script -> {
            try {
                ScriptHolder.handRelativeScriptCache = new LuaScriptCache((String)script);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        this.loadSingle(manager, "holdmyitems/item_model.lua", script -> {
            try {
                ScriptHolder.itemModelCache = new ModelScriptCache((String)script);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ScriptHolder.handAddonsCache = this.loadMultiple(manager, "holdmyitems/hand_addon.lua");
        ScriptHolder.handRelativeAddonsCache = this.loadMultiple(manager, "holdmyitems/hand_relative_addon.lua");
        ScriptHolder.itemAddonsCache = this.loadMultiple(manager, "holdmyitems/item_addon.lua");
        ScriptHolder.itemModelAddonsCache = this.loadMultipleModel(manager, "holdmyitems/item_model_addon.lua");
    }

    private void loadSingle(class_3300 manager, String path, Consumer<String> consumer) {
        class_2960 id = class_2960.method_60655((String)"minecraft", (String)path);
        try {
            class_3298 resource = manager.method_14486(id).orElse(null);
            if (resource == null) {
                consumer.accept("");
                return;
            }
            try (InputStream stream = resource.method_14482();){
                String content = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                content = this.preprocessScript(content);
                consumer.accept(content);
            }
        }
        catch (Exception e) {
            consumer.accept("");
            e.printStackTrace();
        }
    }

    private ArrayList<LuaScriptCache> loadMultiple(class_3300 manager, String path) {
        class_2960 id = class_2960.method_60655((String)"minecraft", (String)path);
        ArrayList<LuaScriptCache> caches = new ArrayList<LuaScriptCache>();
        try {
            List resources = manager.method_14489(id);
            for (class_3298 resource : resources) {
                InputStream stream = resource.method_14482();
                try {
                    String content = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                    content = this.preprocessScript(content);
                    caches.add(new LuaScriptCache(content));
                }
                finally {
                    if (stream == null) continue;
                    stream.close();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return caches;
    }

    private ArrayList<ModelScriptCache> loadMultipleModel(class_3300 manager, String path) {
        class_2960 id = class_2960.method_60655((String)"minecraft", (String)path);
        ArrayList<ModelScriptCache> caches = new ArrayList<ModelScriptCache>();
        try {
            List resources = manager.method_14489(id);
            for (class_3298 resource : resources) {
                InputStream stream = resource.method_14482();
                try {
                    String content = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                    content = this.preprocessScript(content);
                    caches.add(new ModelScriptCache(content));
                }
                finally {
                    if (stream == null) continue;
                    stream.close();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return caches;
    }
}

