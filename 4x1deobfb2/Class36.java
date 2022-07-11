/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Class36 {
    static long IllIlIlIIlllIllIllIllIlIIlIlIIIIIlllllIIlIIllllIllllIllIIIIlIlIIlIllIIllllIlIlllIlIIlIllllIIllllIIlllllIIlIllIlIllIllIIllIlIIIIllllIlllIIlIlllIIIIlIlllIlIIlIllIlIIllIllIIIlllllllIlllIIIIlIlIlIlIllIlIl = 957122213646698039L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public static String llIllIIIIIlIIIlIllIlIlIlIlIlllIlIIlIlIlIllllllIlllIlIllIIllIIllIlllIIlIIlllIlIIlllIIlIlIlIIIlIIlIIIIlllllIlIllllIIllIlIllIIIIIIlIlIlllllIIIlIlIllIIlIllllIlllIIlIllllllIllIlIIIIlllllIIlIllIIIIlIlIlllII() {
        return Class36.lIlIlIlIIIIlllIlIIIIIlllIlllIIlIlllIIIIlIlIIlIlllIlIllllllIlIllllIIllllIlIIIIIllIlllllllIlIllIIlllllIIIlIIlIIlllIIllIIlIIIllllIlIlllllIIlllllIIllIIIllllIlllIlllIIlIIlIlllIIllIIIIIIllllllIllIlIlIlIIllI(System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("COMPUTERNAME") + System.getProperty("user.name")).trim();
    }

    public static String lIlIlIlIIIIlllIlIIIIIlllIlllIIlIlllIIIIlIlIIlIlllIlIllllllIlIllllIIllllIlIIIIIllIlllllllIlIllIIlllllIIIlIIlIIlllIIllIIlIIIllllIlIlllllIIlllllIIllIIIllllIlllIlllIIlIIlIlllIIllIIIIIIllllllIllIlIlIlIIllI(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] byArray = messageDigest.digest(string.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < byArray.length; ++i) {
                stringBuffer.append(Integer.toHexString(byArray[i] & 0xFF | 0x100).substring(1, 3));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
    }
}

