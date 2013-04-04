package com.iceMobile.devcamp.data;

import java.util.ArrayList;
import java.util.List;



public class StaticNewsService implements NewsService {
	private List <NewsItem> newsItems = new ArrayList<NewsItem>();
	
	public StaticNewsService(){
		for(int i = 0; i < 10; i++){
			newsItems.add(new NewsItem("headline " + i, null));
		}
	}
	
	/* (non-Javadoc)
	 * @see data.NewsSerivce#getNewsItems()
	 */
	@Override
	public List <NewsItem> getNewsItems(){
		return newsItems;
	}
}
