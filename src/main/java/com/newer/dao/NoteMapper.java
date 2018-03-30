package com.newer.dao;

import com.newer.bean.Note;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("noteMapper")
public interface NoteMapper {
    @Insert("insert into note(title,content,time)" +
            " values(#{title},#{content},#{time})")
    int addNote(Note note);
    @Update("update note set title=#{title},content=#{content},time=#{time}" +
            " where id=#{id}")
    int updateNote(Note note);
    @Delete("delete from note where id=#{id}")
    int deleteNote(int id);
    @Select("select * from note where id=#{id}")
    Note findById(int id);
    @Select("select * from note")
    List<Note> findAll();
}
