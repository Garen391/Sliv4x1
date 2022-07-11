/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.client.event.InputEvent$KeyInputEvent
 *  net.minecraftforge.client.event.RenderPlayerEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Class23
extends Class17 {
    public static long IIllllIlIlIlIIIlIlIlllIIIlIIlIIIlIIllIlIIIlllIIIIlllllIIlIlIlIlIIIlIlllIIIlIlIllIllllIlllIllllIlIlllIlllIlIIIIIIIIlIIIlIllIlIllIlIlIIllIIlIIIIIIIlIllllIIIIIIIIlIlIIlIIllIIlIllIllllIIIlIllllIIIIlIllIII = -6647686077558532286L;
    public static double lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl = 0.5;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    @SubscribeEvent
    public void llIlIIIllllIlIIlIIlIlIIlIIIlIIIlIIllIllIlIIIlIlllIIllIIlIllIIIllIlllllIIllIIlIlIIlllIIIllIIlIIIllIlIIlIllIlIIIIlIlIIlIIIIIllIllIIIllIlIIIllllIIIIlIIlIlIIlIIllIIlIlIlIllllllllIIIIIlllIIIIlllllllIllIllI(InputEvent.KeyInputEvent keyInputEvent) {
        if (keyInputEvent.getKey() == 264 && keyInputEvent.getAction() == 1) {
            lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl -= 0.05;
        }
        if (keyInputEvent.getKey() == 265 && keyInputEvent.getAction() == 1) {
            lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl += 0.05;
        }
    }

    @Override
    public void IlIIIllIlllIllllIIllIllIIIlIlIIIllIlIIllllllIllIlIIIIlllllIIllIlllIIlIIIIIIlIllIIIIIlIIIIllIIlIIlIlIIllIIlIlIlIllIlllIIllllIllIIllIIIllIIlIIIlllIlIlIllIlIIIllIIIlIIIlllIlllIlIlIIIllIIlIlIIIIlIIIIIIllI() {
        System.out.println(this.llIlllIlIllIllIIlIIIIIIIlIIlIIIlIllllIIllIIlIlllllIlllIlllIIIlIlIlllllIlIlIIIllIlIlllllIlIIlIlIIlIlIIlIIllIIIIIIlIlllIIIlIIlllIlIIIlIIlIlllllIlIllIllllIIIIlIIIIllIlIlIlIIllIIIIIIllIIlIIIlIllIIlllIllIl);
        super.IlIIIllIlllIllllIIllIllIIIlIlIIIllIlIIllllllIllIlIIIIlllllIIllIlllIIlIIIIIIlIllIIIIIlIIIIllIIlIIlIlIIllIIlIlIlIllIlllIIllllIllIIllIIIllIIlIIIlllIlIlIllIlIIIllIIIlIIIlllIlllIlIlIIIllIIlIlIIIIlIIIIIIllI();
    }

    public Class23() {
        super("HitBox", 0, Class44.IlIllIllIIlIIlllllIIlIlllIlllIlIIllIIIIIIIIlIlIIIIIIlIlIIIllIllllIlIIlIllIIIlIIlIIlIlIIIlIIIlIlIIlIIlllIllIlllIlIlIIIIlIlllIIllIIIIIlIIllIlllllIlIlIIlIIlIlllIIlIllllIlllIlIIllllllIIlIlIlIllIIlIlIIIlII);
        Class45.IIIllIlIIlIIllIlllllIIIlIIIlIIIlIIllIllIIlllllIllllIlIllIIlIlIlllIIIlllIlIlIIllIIIllIIlllllIlIlIllIlllIIlIlIllllIlIllIlIIIllIIIlIlllIIIlIlIIIlIllIllIIIIllIlllllIlllllIIIllllIIIIlIlIlIIlIlIlllIIIlIIIIl.lIlIlllIlIlIIlIlIllIIIlIllIlllllIlllIIIllIIlIlIlllIllIllIllIIIlIIIllIIIIlIIIIllIIIllIlIIllIllIllIIlIlIllIlIllIlllllIIllIlIIllIlIIlIIIlIIIIIIlIIIlIllllIllllIlIllIllllllIIIIIIIIIIlIlIlIIlIIlIlIIIIllIIll.lIllIIllIllIlIIIIllIIIIIlIlIlIIlllllIllIIIIllIllIlIIlIIllllIlllIIlIlIlIllIlIIlIIllIIlllllIIlllIIlllIlIlIlllIlIllIlllIlllIllIIlIIlllIIlIllllIIIIIlllIllIllIIIlllllIlIlllIlIIIIllllIllIllIlIllIIIllllIllII(new Class13("Size", this, 1.0, 0.1, 4.0, false));
    }

    @SubscribeEvent
    public void lIllIlIlIlIlIIlIlllIlIlIllllIIIlIIlIlIllllllllIIIIIIllllIlIllllIlIlIlIIllIllIllIIllIIlIllllIIllIlIIIlIlIlIllllIIlIlllIlIllIIIIlIlIIlIllllIIlllIllIIIIllllIIIIIIlIlIIIIIllIlIllIIIlIlIIlllIlllIIIlIlIlIIl(RenderPlayerEvent renderPlayerEvent) {
        Entity entity = renderPlayerEvent.getEntity();
        if (entity != Minecraft.func_71410_x().field_71439_g) {
            entity.func_174826_a(new AxisAlignedBB(entity.func_226277_ct_() - lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl, entity.func_174813_aQ().field_72338_b, entity.func_226281_cx_() - lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl, entity.func_226277_ct_() + lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl, entity.func_174813_aQ().field_72337_e, entity.func_226281_cx_() + lIllIIIlllIlIIllllIllIllIIllIlIllllIIIlIIllIIlIIlIIlIIIlIlIllIIIIIIIlIlIlllllIIIIIlIlIlllIIIIIIIllIllIlIllllIlIlllIlIlIIIlIllIIlIIlIlIlIllIIIlIIIIlIllIlIIIlIllIlllIllIIlIIllllllIIlIIIIIIIlIIlIlIlIlIIl));
        }
    }

    @Override
    public void llIIIIIIIIllIlIlIIlIIllllIlIIIllIlIIlIllIIIlIIlIlIlllIIIlIllIllIlIIIlIIIllIIIIIIIIIllIIIIIIIIlIllllIlIlIllllllIIIIIlIIlIIIlIllIIlIIIIIlllllllIlIllIllIIlIlllIIIIIllllllllIIIllllIIlllIIIlIllllIIllIIlIll() {
        super.llIIIIIIIIllIlIlIIlIIllllIlIIIllIlIIlIllIIIlIIlIlIlllIIIlIllIllIlIIIlIIIllIIIIIIIIIllIIIIIIIIlIllllIlIlIllllllIIIIIlIIlIIIlIllIIlIIIIIlllllllIlIllIllIIlIlllIIIIIllllllllIIIllllIIlllIIIlIllllIIllIIlIll();
    }
}

