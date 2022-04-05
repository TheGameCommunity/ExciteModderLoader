package com.wildermods.wilderloader;

import java.util.Iterator;
import java.util.ServiceLoader;

public interface CrashLogService {

	public void logCrash(Throwable t);
	
	public static Iterator<CrashLogService> obtain() {
		ServiceLoader<CrashLogService> crashServices = ServiceLoader.load(CrashLogService.class);
		return crashServices.iterator();
	}
	
}
