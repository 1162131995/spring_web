package cn.et.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.et.bean.News;
import cn.et.dao.NewsDao;

@Repository
public class NewsDaoImpl implements NewsDao {
	@Autowired
	JdbcTemplate jdbc;
	
	public List<News> query(String sql) {
		return jdbc.query(sql, new RowMapper<News>(){

			public News mapRow(ResultSet rs, int rowNum) throws SQLException {
				News news = new News();
				news.setNewsId(rs.getString("newsid"));
				news.setTitle(rs.getString("title"));
				news.setContent(rs.getString("content"));
				news.setHtmlPath(rs.getString("htmlpath"));
				news.setCreateTile(rs.getString("createtime"));
				return news;
			}
		});
		
	}

	public void insertNews(String sql) {
		// TODO Auto-generated method stub
		jdbc.execute(sql);
	}

}
