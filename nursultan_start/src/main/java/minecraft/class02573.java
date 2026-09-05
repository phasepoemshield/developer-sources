/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.microsoft.aad.msal4j.ClientCredentialFactory
 *  com.microsoft.aad.msal4j.ClientCredentialParameters
 *  com.microsoft.aad.msal4j.ConfidentialClientApplication
 *  com.microsoft.aad.msal4j.ConfidentialClientApplication$Builder
 *  com.microsoft.aad.msal4j.IAuthenticationResult
 *  com.microsoft.aad.msal4j.IClientCertificate
 *  com.microsoft.aad.msal4j.IClientCredential
 *  minecraft.class05001
 *  minecraft.class06068
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCertificate;
import com.microsoft.aad.msal4j.IClientCredential;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import minecraft.class02571;
import minecraft.class02588;
import minecraft.class02593;
import minecraft.class05001;
import minecraft.class06068;
import org.jspecify.annotations.Nullable;

public class class02573
extends class02593 {
    private final ConfidentialClientApplication N;
    private final ClientCredentialParameters y;
    private final Set<String> L;
    private final int u;

    private class02573(URL uRL, class02571 class025712, class02588 class025882, ExecutorService executorService, ConfidentialClientApplication confidentialClientApplication, ClientCredentialParameters clientCredentialParameters, Set<String> set, int n) {
        super(uRL, class025712, class025882, executorService);
        this.N = confidentialClientApplication;
        this.y = clientCredentialParameters;
        this.L = set;
        this.u = n;
    }

    private IAuthenticationResult y() {
        return (IAuthenticationResult)this.N.acquireToken(this.y).join();
    }

    @Override
    protected int N() {
        return this.u;
    }

    @Override
    protected class06068 N(String string, class02588 class025882, JsonObject jsonObject) {
        JsonObject jsonObject2 = class05001.N((JsonObject)jsonObject, (String)"result", null);
        if (jsonObject2 == null) {
            return class06068.y((String)string);
        }
        if (!class05001.N((JsonObject)jsonObject2, (String)"filtered", (boolean)true)) {
            return class06068.N((String)string);
        }
        Iterator var7 = class05001.N((JsonObject)jsonObject2, (String)"events", (JsonArray)new JsonArray()).iterator();
        while (var7.hasNext()) {
            String string2 = class05001.N((JsonObject)((JsonElement)var7.next()).getAsJsonObject(), (String)"id", (String)"");
            if (!this.L.contains(string2)) continue;
            return class06068.y((String)string);
        }
        JsonArray jsonArray = class05001.N((JsonObject)jsonObject2, (String)"redactedTextIndex", (JsonArray)new JsonArray());
        return new class06068(string, this.N(string, jsonArray, class025882));
    }

    @Override
    protected void N(HttpURLConnection httpURLConnection) {
        IAuthenticationResult iAuthenticationResult = this.y();
        httpURLConnection.setRequestProperty("Authorization", "Bearer " + iAuthenticationResult.accessToken());
    }

    public static @Nullable class02593 N(String string) {
        IClientCertificate iClientCertificate;
        InputStream inputStream;
        URL uRL;
        JsonObject jsonObject = class05001.N((String)string);
        URI uRI = URI.create(class05001.Z((JsonObject)jsonObject, (String)"apiServer"));
        String string2 = class05001.Z((JsonObject)jsonObject, (String)"apiPath");
        String string4 = class05001.Z((JsonObject)jsonObject, (String)"scope");
        String string5 = class05001.N((JsonObject)jsonObject, (String)"serverId", (String)"");
        String string6 = class05001.Z((JsonObject)jsonObject, (String)"applicationId");
        String string7 = class05001.Z((JsonObject)jsonObject, (String)"tenantId");
        String string8 = class05001.N((JsonObject)jsonObject, (String)"roomId", (String)"Java:Chat");
        String string9 = class05001.Z((JsonObject)jsonObject, (String)"certificatePath");
        String string10 = class05001.N((JsonObject)jsonObject, (String)"certificatePassword", (String)"");
        int n = class05001.N((JsonObject)jsonObject, (String)"hashesToDrop", (int)-1);
        int n2 = class05001.N((JsonObject)jsonObject, (String)"maxConcurrentRequests", (int)7);
        JsonArray jsonArray = class05001.t((JsonObject)jsonObject, (String)"fullyFilteredEvents");
        HashSet<String> hashSet = new HashSet<String>();
        jsonArray.forEach(jsonElement -> hashSet.add(class05001.N((JsonElement)jsonElement, (String)"filteredEvent")));
        int n3 = class05001.N((JsonObject)jsonObject, (String)"connectionReadTimeoutMs", (int)2000);
        try {
            uRL = uRI.resolve(string2).toURL();
        }
        catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        }
        class02571 class025712 = (gameProfile, string3) -> {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("userId", gameProfile.id().toString());
            jsonObject.addProperty("userDisplayName", gameProfile.name());
            jsonObject.addProperty("server", string5);
            jsonObject.addProperty("room", string8);
            jsonObject.addProperty("area", "JavaChatRealms");
            jsonObject.addProperty("data", string3);
            jsonObject.addProperty("language", "*");
            return jsonObject;
        };
        class02588 class025882 = class02588.y(n);
        ExecutorService executorService = class02573.N(n2);
        try {
            inputStream = Files.newInputStream(Path.of(string9, new String[0]), new OpenOption[0]);
            try {
                iClientCertificate = ClientCredentialFactory.createFromCertificate((InputStream)inputStream, (String)string10);
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (Exception exception) {
            i.warn("Failed to open certificate file");
            return null;
        }
        try {
            inputStream = ((ConfidentialClientApplication.Builder)((ConfidentialClientApplication.Builder)ConfidentialClientApplication.builder((String)string6, (IClientCredential)iClientCertificate).sendX5c(true).executorService(executorService)).authority(String.format(Locale.ROOT, "https://login.microsoftonline.com/%s/", string7))).build();
        }
        catch (Exception exception) {
            i.warn("Failed to create confidential client application");
            return null;
        }
        ClientCredentialParameters clientCredentialParameters = ClientCredentialParameters.builder(Set.of(string4)).build();
        return new class02573(uRL, class025712, class025882, executorService, (ConfidentialClientApplication)inputStream, clientCredentialParameters, hashSet, n3);
    }
}

