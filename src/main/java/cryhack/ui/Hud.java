package cryhack.ui;

import cryhack.module.Mod;
import cryhack.module.ModuleManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

import java.util.Comparator;
import java.util.List;

public class Hud {

    public static MinecraftClient mc = MinecraftClient.getInstance();

    public static void render(MatrixStack matrices, float tickDelta) {
        renderArrayList(matrices);
    }

    public static void renderArrayList(MatrixStack matrices) {
        int index = 0;
        int screenWidth = mc.getWindow().getScaledWidth();
        int screenHeight = mc.getWindow().getScaledHeight();

        List<Mod> enabled = ModuleManager.INSTANCE.getEnabledModules();

        enabled.sort(Comparator.comparingInt(m -> mc.textRenderer.getWidth(((Mod)m).getDisplayName())).reversed());
        for (Mod mod : enabled) {
            mc.textRenderer.drawWithShadow(matrices, mod.getDisplayName(), (screenWidth - 4) - mc.textRenderer.getWidth(mod.getDisplayName()), 10 + (index * mc.textRenderer.fontHeight), -1);
            index++;
        }
    }
}
