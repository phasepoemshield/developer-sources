/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07529
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 */
package com.terraformersmc.modmenu.util;

import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.util.VersionUtil;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import minecraft.class07529;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class HttpUtil {
    private static final String USER_AGENT;
    private static final HttpClient HTTP_CLIENT;

    private HttpUtil() {
    }

    private static String getModMenuVersion() {
        Optional optional = FabricLoader.getInstance().getModContainer("modmenu");
        if (optional.isEmpty()) {
            throw new RuntimeException("Unable to find Modmenu's own mod container!");
        }
        return VersionUtil.removeBuildMetadata(((ModContainer)optional.get()).getMetadata().getVersion().getFriendlyString());
    }

    private static String buildUserAgent() {
        String string = ModMenu.DEV_ENVIRONMENT ? "/development" : "";
        String string2 = ModMenu.RUNNING_QUILT ? "quilt" : "fabric";
        String string3 = HttpUtil.getModMenuVersion();
        String string4 = class07529.y().comp_4025();
        return "%s/%s (%s/%s%s)".formatted(new Object[]{"TerraformersMC/ModMenu", string3, string4, string2, string});
    }

    public static <T> HttpResponse<T> request(HttpRequest.Builder builder, HttpResponse.BodyHandler<T> bodyHandler) throws IOException, InterruptedException {
        builder.setHeader("User-Agent", USER_AGENT);
        return HTTP_CLIENT.send(builder.build(), bodyHandler);
    }
}

