/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 *  net.lenni0451.commons.httpclient.HttpClient
 *  net.raphimc.minecraftauth.MinecraftAuth
 *  net.raphimc.minecraftauth.bedrock.BedrockAuthManager
 *  net.raphimc.minecraftauth.util.MinecraftAuth4To5Migrator
 */
package com.viaversion.viafabricplus.save.impl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.save.AbstractSave;
import com.viaversion.viafabricplus.save.impl.AccountsSave$AccountConsumer;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import net.lenni0451.commons.httpclient.HttpClient;
import net.raphimc.minecraftauth.MinecraftAuth;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.util.MinecraftAuth4To5Migrator;

public final class AccountsSave
extends AbstractSave {
    private BedrockAuthManager bedrockAccount;
    private CCAccount classicubeAccount;

    public AccountsSave() {
        super("accounts");
    }

    @Override
    public void write(JsonObject jsonObject) {
        if (this.bedrockAccount != null) {
            jsonObject.add("bedrockV3", (JsonElement)BedrockAuthManager.toJson((BedrockAuthManager)this.bedrockAccount));
        }
        if (this.classicubeAccount != null) {
            jsonObject.add("classicube", (JsonElement)this.classicubeAccount.asJson());
        }
    }

    @Override
    public void read(JsonObject jsonObject2) {
        this.handleAccount("bedrockV2", jsonObject2, jsonObject -> {
            JsonObject jsonObject2 = MinecraftAuth4To5Migrator.migrateBedrockSave((JsonObject)jsonObject);
            this.bedrockAccount = BedrockAuthManager.fromJson((HttpClient)MinecraftAuth.createHttpClient(), (String)"1.26.10", (JsonObject)jsonObject2);
            this.bedrockAccount.getMinecraftMultiplayerToken().refreshIfExpired();
        });
        this.handleAccount("bedrockV3", jsonObject2, jsonObject -> {
            this.bedrockAccount = BedrockAuthManager.fromJson((HttpClient)MinecraftAuth.createHttpClient(), (String)"1.26.10", (JsonObject)jsonObject);
        });
        this.handleAccount("classicube", jsonObject2, jsonObject -> {
            this.classicubeAccount = CCAccount.fromJson((JsonObject)jsonObject);
        });
    }

    public void setBedrockAccount(BedrockAuthManager bedrockAuthManager) {
        this.bedrockAccount = bedrockAuthManager;
    }

    public BedrockAuthManager getBedrockAccount() {
        return this.bedrockAccount;
    }

    private void handleAccount(String string, JsonObject jsonObject, AccountsSave$AccountConsumer accountsSave$AccountConsumer) {
        if (jsonObject.has(string)) {
            try {
                accountsSave$AccountConsumer.accept(jsonObject.get(string).getAsJsonObject());
            }
            catch (Exception exception) {
                ViaFabricPlusImpl.INSTANCE.getLogger().error("Failed to read {} account!", (Object)string, (Object)exception);
            }
        }
    }

    public void setClassicubeAccount(CCAccount cCAccount) {
        this.classicubeAccount = cCAccount;
    }

    public CCAccount getClassicubeAccount() {
        return this.classicubeAccount;
    }
}

