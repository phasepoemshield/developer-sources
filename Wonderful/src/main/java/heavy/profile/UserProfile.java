package heavy.profile;

import heavy.NativeEngine;

public class UserProfile {
    private static UserProfile instance = null;
    private int uid;
    private String username;
    private String role;
    private String avatar;
    private boolean loaded = false;

    public static UserProfile getInstance() {
        if (instance == null) {
            instance = new UserProfile();
        }
        return instance;
    }

    public UserProfile load() {
        if (this.loaded) {
            return this;
        }
        try {
            NativeEngine engine = NativeEngine.getInstance();
            this.uid = engine.getUid();
            this.username = engine.getUsername();
            this.role = engine.getRole();
            this.avatar = engine.getAvatar();
            this.loaded = true;
        }
        catch (Exception e2) {
            System.err.println("Failed to load user profile: " + e2.getMessage());
        }
        return this;
    }

    public int getUid() {
        if (!this.loaded) {
            this.load();
        }
        return this.uid;
    }

    public String getUsername() {
        if (!this.loaded) {
            this.load();
        }
        return this.username != null ? this.username : "Unknown";
    }

    public String getRole() {
        if (!this.loaded) {
            this.load();
        }
        return this.role != null ? this.role : "Unknown";
    }

    public String getAvatar() {
        if (!this.loaded) {
            this.load();
        }
        return this.avatar != null ? this.avatar : "";
    }

    public boolean isValid() {
        return this.getUid() > 0;
    }

    public boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.getRole());
    }

    public void refresh() {
        this.loaded = false;
        this.load();
    }

    public String getDisplayName() {
        return this.getUsername() + " (#" + this.getUid() + ")";
    }

    public String toString() {
        return String.format("User: %s | Role: %s | UID: %d", this.getUsername(), this.getRole(), this.getUid());
    }
}