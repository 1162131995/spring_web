package cn.et.bean;

public class News {
	String newsId;
	String title;
	String content;
	String htmlPath;
	String createTile;
	public News(){
		
	}
	public News(String newsId, String title, String content, String htmlPath, String createTile) {
		this.newsId = newsId;
		this.title = title;
		this.content = content;
		this.htmlPath = htmlPath;
		this.createTile = createTile;
	}
	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHtmlPath() {
		return htmlPath;
	}
	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}
	public String getCreateTile() {
		return createTile;
	}
	public void setCreateTile(String createTile) {
		this.createTile = createTile;
	}
	
}
