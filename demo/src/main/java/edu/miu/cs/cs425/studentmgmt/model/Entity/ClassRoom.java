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
@Table(name = "ClassRooms")
public class ClassRoom {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "classRoom_Id")
    private Long classRoomId;
     @Column(name="building_name")
     private String buildingName;
     @Column(name = "room_number")
     private String roomNumber;
}
