/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.InputEvent$MouseInputEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class1
extends Class17 {
    private static long lIllllllllIllIllllIIIlllIIIIlIlIIIIIIlIIIlllIIllllIllIlIIllIIllIIllIIllIlIllIIIllIlllIIIIllIIIlIIIlIlIllIlIlIIlIllIlIIlllllIIlllllIIIlIlIIllIIIIlIIIIIIlIlIllIlIIlIllIlllIIIIIllIlIlIlIllIIllIIIllllIlll = 5446396914697698729L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public Class1() {
        super("MiddleClickPearl", 0, Class44.IlllIlllIIlllIIIIllIIIIlIlllIIIlIlIIlIlllIlIlIlllIIIlIllllIIIlllIlIlIIlllllllIllIllllllIIllIllIIIIIlllllIllllIllIIIIlllIlllIlIlllIllllllIlIIllllllIllllIlIIIllIlllllIIllIlIIllIIlIllIIIlIlllIllIlIllllII);
    }

    @SubscribeEvent
    public void llllIlIIIIIIllIIllIllllIIIIIIIlIIIIIlIIlIllIlIIIIlIlIIIIlIIlIlllIIIIlIIlIlIlIllIllIIIlIIlllIlIIIlIIIlllIlllIllllIIIlIlIlIlIIlIlIIlIllIlllIIllIlIIlllIIllllllIIlIIllllIIllllIIIIIIlIIIIllllIlllIIIIIlIIII(InputEvent.MouseInputEvent mouseInputEvent) {
        if (mouseInputEvent.getButton() == 2) {
            mouseInputEvent.getAction();
        }
    }
}

