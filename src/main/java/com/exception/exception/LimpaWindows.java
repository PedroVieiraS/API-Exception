package com.exception.exception;

public class LimpaWindows {
    
    public static void limpa_windows() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.println("Este comando só funciona no Windows.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
