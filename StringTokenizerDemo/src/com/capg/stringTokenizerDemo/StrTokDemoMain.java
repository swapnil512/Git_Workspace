package com.capg.stringTokenizerDemo;

import java.util.StringTokenizer;

public class StrTokDemoMain {

	public static void main(String[] args) {

		String exportSystem = "SMD, CRM";
		String externalSystem;

		final StringTokenizer strTok = new StringTokenizer(exportSystem, ",");
		while (strTok.hasMoreTokens()) {
			externalSystem = strTok.nextToken().trim();
			if ("DMS".equalsIgnoreCase(externalSystem)) {
				System.out.println("Inside DMs");
			} else if ("SMD".equalsIgnoreCase(externalSystem)) {
				System.out.println("Inside sMD");
			} else if ("CRM".equalsIgnoreCase(externalSystem)) {
				System.out.println("Inside CRM");
			}

			/*
			 * switch (externalSystem) { case "DMS":
			 * System.out.println("INSIDE DMS export"); break; case "SMD":
			 * System.out.println("INSIDE SMD export"); break; case "CRM":
			 * System.out.println("INSIDE CRM export"); break; }
			 */

		}
	}
}
