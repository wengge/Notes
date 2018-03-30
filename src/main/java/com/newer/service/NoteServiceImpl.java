package com.newer.service;

import com.newer.bean.Note;
import com.newer.dao.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("noteService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteMapper noteMapper;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int addNote(Note note) {
        return this.noteMapper.addNote(note);
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int updateNote(Note note) {
        return this.noteMapper.updateNote(note);
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int deleteNote(int id) {
        return this.noteMapper.deleteNote(id);
    }

    public Note findById(int id) {
        return this.noteMapper.findById(id);
    }

    public List<Note> findAll() {
        return this.noteMapper.findAll();
    }
}
