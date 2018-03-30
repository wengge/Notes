package com.newer.controller;

import com.newer.bean.Note;
import com.newer.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;
    @RequestMapping("/add")
    public String addNote(Note note){
        noteService.addNote(note);
        return "redirect:/note/findAll";

    }
    @RequestMapping("/findAll")
    public String findAll(ModelMap map){
        List<Note> list=noteService.findAll();
        map.put("list",list);
        return "list";
    }

    @RequestMapping("/findById")
    public String findById(int id,ModelMap map){
        Note note =noteService.findById(id);
        map.put("note" ,note);
        return "update";

    }

    @RequestMapping("/update")
    public String updateNote(Note note){
        System.out.println(note.getId());

        noteService.updateNote(note);
        return "redirect:/note/findAll";
    }

    @RequestMapping("/delete")
    public String deleteNote(int id){
        noteService.deleteNote(id);
        return "redirect:/note/findAll";

    }



}
