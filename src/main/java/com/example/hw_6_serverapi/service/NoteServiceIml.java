package com.example.hw_6_serverapi.service;

import com.example.hw_6_serverapi.entity.Note;
import com.example.hw_6_serverapi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceIml  implements NoteService {
    @Autowired
    private NoteRepository noteRepository;
    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note saveOrUpdateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note getNoteById(int id) {
        return noteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteNoteById(int id) {
        noteRepository.deleteById(id);
    }
}
