package co.uk.odysseius.alma.config;

import co.uk.odysseius.alma.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_MODULES = "modules";
    public static final String CATEGORY_INTEGRATION = "integration";

    public static boolean debugMode = false;
    public static boolean module1 = true;
    public static boolean tConIntegration = true;

    public static void readConfig() {
        Configuration config = CommonProxy.config;

        try {
            config.load();
            generalConfig(config);
            modulesConfig(config);
            integrationConfig(config);
        } catch (Exception event) {
            System.out.println("Problem loading config file!");
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }

    private static void generalConfig (Configuration config) {
        config.addCustomCategoryComment(CATEGORY_GENERAL, "Main Settings");
        debugMode = config.getBoolean("debugMode", CATEGORY_GENERAL, debugMode, "Set to true to enable debug Mode");
    }

    private static void modulesConfig (Configuration config) {
        config.addCustomCategoryComment(CATEGORY_MODULES, "Module Settings");
        module1 = config.getBoolean("module1", CATEGORY_MODULES, module1, "Set to false to disable Module 1");
    }

    private static void integrationConfig (Configuration config) {
        config.addCustomCategoryComment(CATEGORY_INTEGRATION, "Integration Settings");
        tConIntegration = config.getBoolean("tConIntegration", CATEGORY_INTEGRATION, tConIntegration, "Set to false to disable Tinker's Construct integration manually");
    }
}
