package cn.et.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.bean.News;
import cn.et.dao.NewsDao;
import cn.et.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao dao;
	
	public List<News> queryAll() {
		String sql = "select * from news";
		return dao.query(sql);
	}

	public List<News> queryNewsByContent(String content) {
		if(content == null){
			content = "";
		}
		String sql = "select * from news where content like '%"+content+"%'";
		return dao.query(sql);
	}

	public void insertNews(String title, String content, String htmlpath, String createtime) {
		if(title == null | content == null | createtime == null){
			return;
		}
		String sql = "INSERT INTO news(title,content,htmlpath,createtime) VALUES('"+title+"','"+content+"','"+htmlpath+"','"+createtime+"')";
		dao.insertNews(sql);
	}

}
