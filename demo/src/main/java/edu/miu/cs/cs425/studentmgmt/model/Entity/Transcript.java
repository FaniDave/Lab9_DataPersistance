package edu.miu.cs.cs425.studentmgmt.model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transcript_id")
    private Long transcriptId;
    @Column(name = "degree_title")
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript")
    private Student student;
}
