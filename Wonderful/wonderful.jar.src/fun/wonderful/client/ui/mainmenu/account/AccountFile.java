package fun.wonderful.client.ui.mainmenu.account;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import fun.wonderful.api.QClient;
import fun.wonderful.client.ui.mainmenu.account.Account;
import fun.wonderful.client.ui.mainmenu.account.AccountManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Objects;

public record AccountFile(File file) implements QClient
{
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public AccountFile {
        Objects.requireNonNull(file, "file");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean read(AccountManager accounts) {
        if (!this.file.exists()) {
            return false;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file));){
            JsonObject jsonObject = (JsonObject)GSON.fromJson((Reader)reader, JsonObject.class);
            if (jsonObject == null) {
                boolean bl = false;
                return bl;
            }
            JsonArray array = jsonObject.getAsJsonArray("accounts");
            if (array != null) {
                for (JsonElement element : array) {
                    try {
                        JsonObject accountObject = element.getAsJsonObject();
                        String name = accountObject.get("name").getAsString();
                        LocalDateTime creationDate = LocalDateTime.parse(accountObject.get("creationDate").getAsString());
                        boolean favorite = accountObject.has("favorite") && accountObject.get("favorite").getAsBoolean();
                        Account account = new Account(creationDate, name);
                        account.favorite(favorite);
                        if (accounts.isAccount(name)) continue;
                        accounts.add(account);
                    }
                    catch (JsonParseException | IllegalStateException | DateTimeParseException throwable) {}
                }
            }
            boolean bl = true;
            return bl;
        }
        catch (IOException ignored) {
            return false;
        }
    }

    public boolean write(AccountManager accounts) {
        boolean bl;
        File parent = this.file.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs()) {
            return false;
        }
        JsonObject json = new JsonObject();
        JsonArray array = new JsonArray();
        for (Account account : accounts) {
            JsonObject accountObject = new JsonObject();
            accountObject.addProperty("name", account.name());
            accountObject.addProperty("creationDate", account.creationDate().toString());
            accountObject.addProperty("favorite", Boolean.valueOf(account.favorite()));
            array.add((JsonElement)accountObject);
        }
        json.add("accounts", (JsonElement)array);
        json.addProperty("last", mc.getSession() == null ? "" : mc.getSession().getUsername());
        FileWriter writer = new FileWriter(this.file);
        try {
            GSON.toJson((JsonElement)json, (Appendable)writer);
            bl = true;
        }
        catch (Throwable throwable) {
            try {
                try {
                    writer.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException ignored) {
                return false;
            }
        }
        writer.close();
        return bl;
    }

    public boolean writeLastSelected(AccountManager accounts, String lastName) {
        boolean bl;
        File parent = this.file.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs()) {
            return false;
        }
        JsonObject json = new JsonObject();
        JsonArray array = new JsonArray();
        for (Account account : accounts) {
            JsonObject accountObject = new JsonObject();
            accountObject.addProperty("name", account.name());
            accountObject.addProperty("creationDate", account.creationDate().toString());
            accountObject.addProperty("favorite", Boolean.valueOf(account.favorite()));
            array.add((JsonElement)accountObject);
        }
        json.add("accounts", (JsonElement)array);
        json.addProperty("last", lastName == null ? "" : lastName);
        FileWriter writer = new FileWriter(this.file);
        try {
            GSON.toJson((JsonElement)json, (Appendable)writer);
            bl = true;
        }
        catch (Throwable throwable) {
            try {
                try {
                    writer.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException ignored) {
                return false;
            }
        }
        writer.close();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getLast() {
        if (!this.file.exists()) {
            return "";
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file));){
            JsonObject jsonObject = (JsonObject)GSON.fromJson((Reader)reader, JsonObject.class);
            if (jsonObject == null) return "";
            if (!jsonObject.has("last")) return "";
            String string = jsonObject.get("last").getAsString();
            return string;
        }
        catch (Exception exception) {
            
        }
        return "";
    }
}