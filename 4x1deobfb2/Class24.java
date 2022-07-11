/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraftforge.client.event.InputEvent$KeyInputEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class24 {
    static long IlIIIllIIllIIllIllIlIIIIIIIIlIIIIlIIIIlIIlIlIlIlIlIlIIlllIIllIlIIIlIlIlllIlIIIIIllIlIlIIIIlllIlIIIIlIIllIIllIlllIIllIllIIllIllllIIllllIIIllIllIllllllIIIllllIIlIlIllIIIIIlIIIIIIllIIllIlIlIIIIlIIIIIlllI = 1258239850101363250L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @SubscribeEvent
    public void lIIlIlIIIllllIlIllIIIlIIlIlllIIlIIllllIlIlIIlllIllllIIllllIIIlIllIlIlIlIllIIllIIllIllIIllIIlIIlIIlIIlllIlllIlIIIIllIllIIlIIIIIllllIlIIIIlIIlIlIIllIlllllIllIIIIlIlIlIlIIllIIllIlIlIIIIIlIIlIlIlIIIIlIllI(InputEvent.KeyInputEvent keyInputEvent) {
        if (keyInputEvent.getKey() == 344 && keyInputEvent.getAction() == 1 && Minecraft.func_71410_x().field_71462_r == null) {
            if (Class16.IIlIIlllllIIlIIlllIlllIlllIIIIIlIlIllllIllllIllIlIIllIllllIlIIlIlIllIlIIIIllIIIlIIIllIIIIlIlllIIlIIllIIlIlllIIIIlIIIIlIIllIllIIllllllIlIllllIIIIllIlIlIIIIlllIlllIIIlllllIIlIlllllllIlIIlIlIIlIlllIIlIII) {
                Minecraft.func_71410_x().func_147108_a((Screen)new Class33());
            }
            if (!(Class39.lIIlIIIIIIIIIIlIlIIIIIIlllIlllIlllllllllIlllIlIIlIlIIlIIllllllIIlllllIllIllIlIIlIlIlllllIIIIlIlllIIIlIllIIlIIIIIIIIIllIllllIlIIIlIIlIIlIIlIIIlIIIlIIlIIlIIIIIlIIIlIlllIlIlIllIIllllIIIIIIIIIllIIlIlIllIl.exists() || Class39.IIllIllIIIlIlIIIIIlllIlIIIlIllIIIIIllIIIIlIlllIlIIIIllIlIlllIllllIIllIllIllIlIlIlIIllIlllIlllIllIllIllllIlllIIlIllllIIlllIIlIIIIIIllIIIlIIIIlIlllllIllIllIIllIIllIllllIIlIIIIIIlIlIlIIlllIlIIllIlIIIllII || Class16.IIlIIlllllIIlIIlllIlllIlllIIIIIlIlIllllIllllIllIlIIllIllllIlIIlIlIllIlIIIIllIIIlIIIllIIIIlIlllIIlIIllIIlIlllIIIIlIIIIlIIllIllIIllllllIlIllllIIIIllIlIlIIIIlllIlllIIIlllllIIlIlllllllIlIIlIlIIlIlllIIlIII)) {
                Minecraft.func_71410_x().func_147108_a((Screen)new Class47());
            }
        }
        Class34.lllIIlIIIllIIIllIllllIlIIlIlIlIlIIlIlIIlIllllllIlIlIIllIllllllllIIlIlIlIIIIIIIlllllIIIlIlIlllIIIlIIIlIIIlllIIIlllIIlllllIIlIIIlIIlIIIIlllIllllIIIlllIIllIIllIlIlIIIIlIIIIIIIIIllIlIIlIllIllIlIlIllIlIlll(keyInputEvent.getKey(), keyInputEvent.getAction());
    }
}

