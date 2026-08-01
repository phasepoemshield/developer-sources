package fun.nexisdlc.client.utils.irc;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

/**
 * Представление IRC сообщения
 */
@Getter
@Setter
public class IRCMessage {
    private String type;
    private int userId;
    private String username;
    private String role;
    private String message;
    private String timestamp;

    public IRCMessage() {}

    public IRCMessage(String type, int userId, String username, String role, String message, String timestamp) {
        this.type = type;
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.message = message;
        this.timestamp = timestamp;
    }

    public static IRCMessage fromJson(JsonObject json) {
        IRCMessage msg = new IRCMessage();
        msg.type = json.has("type") ? json.get("type").getAsString() : "message";
        msg.userId = json.has("user_id") ? json.get("user_id").getAsInt() : 0;
        msg.username = json.has("username") ? json.get("username").getAsString() : "Unknown";
        msg.role = json.has("role") ? json.get("role").getAsString() : "";
        msg.message = json.has("message") ? json.get("message").getAsString() : "";
        msg.timestamp = json.has("timestamp") ? json.get("timestamp").getAsString() : "";
        return msg;
    }

    public boolean isBroadcast() {
        return "broadcast".equals(type);
    }

    public boolean isRegularMessage() {
        return "message".equals(type);
    }

    @Override
    public String toString() {
        return String.format("[%s] @%s (%s): %s", type, username, role, message);
    }
}
