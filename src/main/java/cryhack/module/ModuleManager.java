package cryhack.module;

import cryhack.module.movement.Flight;
import cryhack.module.movement.Sprint;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public static final ModuleManager INSTANCE = new ModuleManager();
    private List<Mod> modules = new ArrayList<>();

    public ModuleManager() {
        addModules();
    }

    public List<Mod> getModules() {
        return modules;
    }

    public List<Mod> getEnabledModules() {
        List<Mod> enabled = new ArrayList<>();
         for (Mod module : modules) {
             if (module.isEnabled()) enabled.add(module);
         }

         return enabled;
    }

    private void addModules() {
        modules.add(new Flight());
        modules.add(new Sprint());
    }
}
