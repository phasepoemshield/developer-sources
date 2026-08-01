package ru.sterford;

public final class AuthContext {

    private final String uid;
    private final String user;
    private final String role;
    private final String hwid;
    private final String subscription;
    private final long premium;
    private final long issuedAt;
    private final long expiresAt;

    public AuthContext(
            String uid,
            String user,
            String role,
            String hwid,
            String subscription,
            long premium,
            long issuedAt,
            long expiresAt
    ) {
        this.uid = uid;
        this.user = user;
        this.role = role;
        this.hwid = hwid;
        this.subscription = subscription;
        this.premium = premium;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
    }

    public String getUid() { return uid; }
    public String getUser() { return user; }
    public String getRole() { return role; }
    public String getHwid() { return hwid; }
    public String getSubscription() { return subscription; }
    public long getPremium() { return premium; }
    public long getIssuedAt() { return issuedAt; }
    public long getExpiresAt() { return expiresAt; }

    public boolean isExpired(long now) {
        return expiresAt > 0L && now >= expiresAt;
    }

    public boolean hasIdentity() {
        return notBlank(uid) && notBlank(user) && notBlank(role) && notBlank(hwid);
    }

    private static boolean notBlank(String value) {
        return value != null && !value.isBlank();
    }
}
