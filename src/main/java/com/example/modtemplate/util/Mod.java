package com.example.modtemplate.util;

import com.example.modtemplate.platform.Platform;
import net.minecraft.resources.Identifier;

import static com.example.modtemplate.ModTemplate.*;

public class Mod {
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	public static Identifier id(String namespace, String path) {
		return Identifier.fromNamespaceAndPath(namespace, path);
	}

	public static Platform xplat() {
		return PLATFORM;
	}
}
