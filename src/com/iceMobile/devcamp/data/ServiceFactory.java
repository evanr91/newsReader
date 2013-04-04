package com.iceMobile.devcamp.data;

public class ServiceFactory {
	private final static NewsService newsService = new StaticNewsService();
	
	public static NewsService getNewsService(){
		return newsService;
	}
}
