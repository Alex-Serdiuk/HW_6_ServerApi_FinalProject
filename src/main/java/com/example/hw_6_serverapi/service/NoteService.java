package com.example.hw_6_serverapi.service;

import com.example.hw_6_serverapi.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note>getAllNotes();

    Note saveOrUpdateNote(Note note);

    Note getNoteById(int id);

    void deleteNoteById(int id);
}
