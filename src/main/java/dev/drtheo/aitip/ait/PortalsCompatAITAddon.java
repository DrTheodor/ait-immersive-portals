package dev.drtheo.aitip.ait;

import loqor.ait.api.AITModInitializer;

public class PortalsCompatAITAddon implements AITModInitializer {

    @Override
    public void onInitializeAIT() {
        PortalsHandler.init();
    }
}
