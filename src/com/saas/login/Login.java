package com.saas.login;

public class Login {
	
	private static String tenantId;

	public static String getTenantId() {
		return tenantId;
	}

	public static void setTenantId(String myTenantId) {
		tenantId = myTenantId;
	}

}
