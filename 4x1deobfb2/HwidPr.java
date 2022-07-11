/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.client.Minecraft;

public class Class31 {
    public static long llIlllIllIlIlIlIIIlIllIIIIlIIIlIIlIIllIIIlllIlIlIIllIIIIlIlllIlIIlIlIIlIIIllllIlIIIIlIlIIlIllIllIllIIIlIlIlIIIIIlIIIlIlllIIlIIIlllIlIllIlIIlIIllIIlIlllIIllIllIlIlIlIllllIIIIIllIIllIllIlIlIIIIllIIlIlIl = -5058086127088017073L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public void llIllIlIIIlIIllIlIlIllIlIIlIIlllIllIllIllIlIllllllIllllllllIlIIlllIlIllIIIIllIIIlIIllllIIIIIIlllllIIllllIllllllIlIIIIIIIIIIIIllIIllIlIllIlIlIlIIlllIlllIIIllllllllIlIllIIlIllIllllIIllIlllIllIlIlIllllll() {
        try {
            String string;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL("https://pastebin.com/raw/TK27igAn").openConnection();
            httpsURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.157 Safari/537.36");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.equals(Class36.llIllIIIIIlIIIlIllIlIlIlIlIlllIlIIlIlIlIllllllIlllIlIllIIllIIllIlllIIlIIlllIlIIlllIIlIlIlIIIlIIlIIIIlllllIlIllllIIllIlIllIIIIIIlIlIlllllIIIlIlIllIIlIllllIlllIIlIllllllIllIlIIIIlllllIIlIllIIIIlIlIlllII())) continue;
                return;
            }
            this.IllIIllllIlIIIIIIlllIIIIlIlIIIlIIIIIIIIIlIlIIIlIIIIlIIIIlIlIIIIlIIlIlllIIIIIlllIlIIlIIlIlIlllIlIlIlIIlIIIlIIIlIlIIlIlIIlIIllllIllIlIIllllllIIIlIllIllllIIlIIlIlIIlIlllllIlIlllIllllIIlllIllIIIlIllllIlII();
            return;
        }
        catch (Exception exception) {
            this.IllIIllllIlIIIIIIlllIIIIlIlIIIlIIIIIIIIIlIlIIIlIIIIlIIIIlIlIIIIlIIlIlllIIIIIlllIlIIlIIlIlIlllIlIlIlIIlIIIlIIIlIlIIlIlIIlIIllllIllIlIIllllllIIIlIllIllllIIlIIlIlIIlIlllllIlIlllIllllIIlllIllIIIlIllllIlII();
            return;
        }
    }

    public void IllIIllllIlIIIIIIlllIIIIlIlIIIlIIIIIIIIIlIlIIIlIIIIlIIIIlIlIIIIlIIlIlllIIIIIlllIlIIlIIlIlIlllIlIlIlIIlIIIlIIIlIlIIlIlIIlIIllllIllIlIIllllllIIIlIllIllllIIlIIlIlIIlIlllllIlIlllIllllIIlllIllIIIlIllllIlII() {
        Minecraft.func_71410_x().func_71400_g();
        System.exit(-1);
        Runtime.getRuntime().halt(1);
    }
}

