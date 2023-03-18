package com.example.hw_6_serverapi.repository;

import com.example.hw_6_serverapi.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
