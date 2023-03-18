package com.example.hw_6_serverapi.controller;

import com.example.hw_6_serverapi.entity.Note;
import com.example.hw_6_serverapi.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping()
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable int id){
        return  noteService.getNoteById(id);
    }

    @PostMapping()
    public Note addNote(@RequestBody Note note) {
        return noteService.saveOrUpdateNote(note);
    }

    @PutMapping()
    public Note updateNote(@RequestBody Note note){
        return noteService.saveOrUpdateNote(note);
    }

    @DeleteMapping("/{id}")
    public String deleteNoteById(@PathVariable int id){
        String result;

        if(noteService.getNoteById(id)!=null){
            noteService.deleteNoteById(id);
            if(noteService.getNoteById(id)==null){
                result = "Note was deleted";
            }else {
                result = "Note was not deleted";
            }
        }else {
            result = "The id is not in the database";
        }
        return result;
    }


}
