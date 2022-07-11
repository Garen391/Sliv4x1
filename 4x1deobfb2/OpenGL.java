/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.matrix.MatrixStack
 *  net.minecraft.client.gui.IngameGui
 *  org.lwjgl.opengl.GL11
 */
import com.mojang.blaze3d.matrix.MatrixStack;
import java.awt.Color;
import net.minecraft.client.gui.IngameGui;
import org.lwjgl.opengl.GL11;

public class Class27 {
    private static long IIlIlIlllIIIIIIlIIIIIIIIIIIllIlIIIlllIIIIlllIlllIllIlIlllIllllIIIIIlIIIlllIIllIIllIlIIIllIlIIlIlIIIllIIIlIllIIllIIlllIlIlIlllIllIllllIlIlIIIlIIlIlIllllIIIIlIlllIIIlIIIlIlIIIIIllIIIIIlIIIIIlIlIIlIlIlIl = -4982641583476078460L;

    public static String Deobfuscated_by_tenonteam() {
        return "Deobfuscated by tenonteam";
    }

    public static void lllIIllllIllllIIlIIIIlllIlllIIIIllIlllIlIlIIllIlIlIIlIIIIllIIlIlIIIlIlIlIlIlIllIIlIlIllIlIIllIlIIIIIIIlIlllllIIIlIIIlIIllIlllIlIIllIIllllIlllIllIllIIlIllllIIlIIIlIIllIlIIIIIlIlllllIIllIIIlIllIlIIlIIll(MatrixStack matrixStack, float f, float f2, float f3, float f4, int n) {
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        IngameGui.func_238467_a_((MatrixStack)matrixStack, (int)((int)f), (int)((int)f2), (int)((int)f3), (int)((int)f4), (int)n);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        IngameGui.func_238467_a_((MatrixStack)matrixStack, (int)((int)(f * 2.0f - 1.0f)), (int)((int)(f2 * 2.0f)), (int)((int)(f * 2.0f)), (int)((int)(f4 * 2.0f - 1.0f)), (int)n);
        IngameGui.func_238467_a_((MatrixStack)matrixStack, (int)((int)(f * 2.0f)), (int)((int)(f2 * 2.0f - 1.0f)), (int)((int)(f3 * 2.0f)), (int)((int)(f2 * 2.0f)), (int)n);
        IngameGui.func_238467_a_((MatrixStack)matrixStack, (int)((int)(f3 * 2.0f)), (int)((int)(f2 * 2.0f)), (int)((int)(f3 * 2.0f + 1.0f)), (int)((int)(f4 * 2.0f - 1.0f)), (int)n);
        IngameGui.func_238467_a_((MatrixStack)matrixStack, (int)((int)(f * 2.0f)), (int)((int)(f4 * 2.0f - 1.0f)), (int)((int)(f3 * 2.0f)), (int)((int)(f4 * 2.0f)), (int)n);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void IlIIllIlIllIlllIIlIIIIllIlllIlllllIIIIIlIIlIlIIlIlIlllIllIlllIllIlIlIlIIlIllIIIIlIIIIllIllIllllIIIIlIIlllIlIlllIlIIlIIllllIlIllIlIllIIlIIIllIllllIIllllIlIlllllIllIlIIlIIIIIllIllIIllIllIlllIIIIIllIIlII(int n, int n2, float f, Color color) {
        int n3 = 50;
        double d = Math.PI * 2 / (double)50;
        GL11.glPushAttrib((int)8192);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)6);
        for (int i = 0; i < n3; ++i) {
            float f2 = (float)((double)f * Math.sin((double)i * d));
            float f3 = (float)((double)f * Math.cos((double)i * d));
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
            GL11.glVertex2f((float)((float)n + f2), (float)((float)n2 + f3));
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnd();
        GL11.glPopAttrib();
    }
}

