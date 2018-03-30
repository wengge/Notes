package com.newer.test;

import com.newer.bean.Note;
import com.newer.service.NoteService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;

public class NoteTest {
    @Test
    public void testAdd(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService=ctx.getBean("noteService",NoteService.class);
        Note note=new Note();
        note.setTitle("西游记");
        note.setContent("真假美猴王");
        note.setTime(Date.valueOf("2017-03-18"));
        noteService.addNote(note);


    }


    @Test
    public void testUpdate(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService=ctx.getBean("noteService",NoteService.class);
        Note note=new Note();
        note.setId(2);
        note.setContent("大闹天空");
        note.setTitle("大闹天空");
        note.setTime(Date.valueOf("2018-03-15"));
        noteService.updateNote(note);



    }

    @Test
    public void testFindById(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService=ctx.getBean("noteService",NoteService.class);
        Note note=noteService.findById(2);
        System.out.println("标题:"+note.getTitle()+"  内容:"+note.getContent()+"   时间："+note.getTime());

    }

    @Test
    public void testFindAll(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService=ctx.getBean("noteService",NoteService.class);
        List<Note> list=noteService.findAll();
        for(Note note:list){
            System.out.println("标题:"+note.getTitle()+"  内容:"+note.getContent()+"   时间："+note.getTime());
        }



    }

    @Test
    public void testDelete(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteService noteService=ctx.getBean("noteService",NoteService.class);
      System.out.println( noteService.deleteNote(1));
    }


}
