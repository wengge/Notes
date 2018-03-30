package com.newer.service;

import com.newer.bean.Note;

import java.util.List;

public interface NoteService {
    int addNote(Note note);
    int updateNote(Note note);
    int deleteNote(int id);
    Note findById(int id);
    List<Note> findAll();
}
