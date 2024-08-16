package io.github.cichlidmc.annotations;

/**
 * The available distributions of Minecraft.
 */
public enum Dist {
	CLIENT,
	SERVER,
	/**
	 * The bundler is a distribution method used for modern versions of the Minecraft server.
	 * It contains one main class that un-bundles the real server and all dependencies at runtime.
	 */
	BUNDLER
}
