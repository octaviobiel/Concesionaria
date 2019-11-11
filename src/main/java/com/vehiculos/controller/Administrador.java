package com.vehiculos.controller;

import java.util.HashMap;

public class Administrador {

	private static HashMap<String, String> admin;
	static {
		admin = new HashMap<String, String>();
		admin.put("chile", "123");
		admin.put("octa", "hola");
	}
	public static HashMap<String, String> getAdmin() {
		return admin;
	}
	public static void setAdmin(HashMap<String, String> admin) {
		Administrador.admin = admin;
	}
	
}
