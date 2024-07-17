package edu.xmu.blogsystem.dao;

import edu.xmu.blogsystem.entity.BlogComment;

import java.util.List;
import java.util.Map;

public interface BlogCommentMapper {
    Boolean addComment(BlogComment comment);
    List<BlogComment> findBlogCommentList(Integer blogId);
    int getTotalBlogComments(Map map);
    int checkDone(Integer[] ids);
    int deleteBatch(Integer[] ids);
    BlogComment selectByPrimaryKey(Integer commentId);
    int updateByPrimaryKeySelective(BlogComment blogComment);
}