package pulse.auth;

import java.util.List;
import java.util.Set;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONObject;
import pulse.config.CloudConfigRepository;
import pulse.player.PlayerListTracker;

public class AccountServiceClient extends WebSocketListener implements Runnable, AccountServiceListener {
    private static volatile AccountServiceClient instance;
    public final PlayerListTracker a = new PlayerListTracker();
    public final CloudConfigRepository b = new CloudConfigRepository(this);

    private AccountServiceClient() {
    }

    public static AccountServiceClient getInstance() {
        instance = new AccountServiceClient();
        return instance;
    }

    public static AccountServiceClient A() {
        return getInstance();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public PlayerListTracker g() {
        return this.a;
    }

    public JSONArray h() {
        return new JSONArray();
    }

    public JSONArray i() {
        return new JSONArray();
    }

    public JSONArray j() {
        return new JSONArray();
    }

    public long k() {
        return 0L;
    }

    public long l() {
        return 0L;
    }

    public String m() {
        return "Local";
    }

    public String n() {
        return "offline";
    }

    public String o() {
        return "local";
    }

    public String p() {
        return "";
    }

    public byte[] q() {
        return new byte[0];
    }

    public long r() {
        return System.currentTimeMillis();
    }

    public String s() {
        return "Local";
    }

    public String t() {
        return "Pulse Local";
    }

    public boolean a(String str, String str2) {
        return false;
    }

    @Override
    public void run() {
    }

    public void b(String str, String str2) {
    }

    public void u() {
    }

    public void v() {
    }

    public void a(String str) {
    }

    public void b(String str) {
    }

    public void w() {
    }

    public void x() {
    }

    public boolean c(String str) {
        return false;
    }

    public Integer c(String str, String str2) {
        return null;
    }

    public void y() {
    }

    public void d(String str) {
    }

    public void z() {
    }

    public JSONObject a(int i, int i2, JSONObject jSONObject) {
        return null;
    }

    @Override
    public void a(int i, Set<String> set) {
    }

    @Override
    public void a(int i, long j, List<AccountServiceRecord> list) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }

    public void onMessage(WebSocket webSocket, String str) {
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
    }
}
