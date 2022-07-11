/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.StringTextComponent
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Class25
extends Class17 {
    public static long IIIIlllIllIIllIIlIlIllIIIllIlllIIIIIIlllIIllIllIllIIIIlIIlllIIllllllIIIIIlIIIlIIlIlIIllIlllIlIlIIIlIlllIllllllIlIIlllllIIlIIlIllIIIIIlIlIIIIIIlllllllIlIIlIlIIllIIllIlllIllIIIIIlIlIlIIlIIIIlllIllllIIIl = 3118108730564114758L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public Class25() {
        super("Parser", 0, Class44.IIlIllIlIlIIIlIlIIlIIlllIIlIlllIllIlllIlllIlIlIlIlIlIIllIIlIIlIlllIIIIllIllIIIIlIllIlIlllllIIlIIlIlIllIllIlIlIIlllIIIlIIIllIlIIIIIIIlIllIllIlIlIIlIllIllIIIIlllIllIIllIlIIIlIllllllIIlIIlIlIlIIIllIIllIl);
    }

    @Override
    public void IlIIIllIlllIllllIIllIllIIIlIlIIIllIlIIllllllIllIlIIIIlllllIIllIlllIIlIIIIIIlIllIIIIIlIIIIllIIlIIlIlIIllIIlIlIlIllIlllIIllllIllIIllIIIllIIlIIIlllIlIlIllIlIIIllIIIlIIIlllIlllIlIlIIIllIIlIlIIIIlIIIIIIllI() {
        File file = new File(this.IIIlIlIlIlIllIlIlIlIIlllIlIIlIllIIlIIIIIIlllIlIIlIllIllIIlIlIllllIllIllIIlIllIIllIllIIIIlIIIlIIIllIIIlllllIlIlIIIIlIlIlllIllIIllIlIIllIlIllllIIlIIlIIIIIIIIlllIlIIIIIllIllIllIlIllllIIIIIIlIIlIlIIlIIlIl.field_71412_D, "Parser.txt");
        Collection collection = Objects.requireNonNull(Minecraft.func_71410_x().func_147114_u()).func_175106_d();
        collection.forEach(networkPlayerInfo -> {
            String string = networkPlayerInfo.func_178845_a().getName();
            if (!file.exists()) {
                try {
                    file.createNewFile();
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
            try {
                Files.write(Paths.get(file.getPath(), new String[0]), "\n".getBytes(), StandardOpenOption.APPEND);
                Files.write(Paths.get(file.getPath(), new String[0]), string.getBytes(), StandardOpenOption.APPEND);
                return;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        });
        Minecraft.func_71410_x().field_71439_g.func_145747_a((ITextComponent)new StringTextComponent("Saved in: " + file.getAbsolutePath()), Minecraft.func_71410_x().field_71439_g.func_110124_au());
    }

    @Override
    public void llIIIIIIIIllIlIlIIlIIllllIlIIIllIlIIlIllIIIlIIlIlIlllIIIlIllIllIlIIIlIIIllIIIIIIIIIllIIIIIIIIlIllllIlIlIllllllIIIIIlIIlIIIlIllIIlIIIIIlllllllIlIllIllIIlIlllIIIIIllllllllIIIllllIIlllIIIlIllllIIllIIlIll() {
    }
}

