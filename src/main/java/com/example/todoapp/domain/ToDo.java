package com.example.todoapp.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "ToDo")
@Table(name = "todo")
@AllArgsConstructor //모든걸 받아들이는 생성자 만들어 줄거다
@NoArgsConstructor // 아무것도 안받아들이는 생성자 만들어 줄거다
@Setter
@Getter
public class ToDo {
    @Id //primary키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 증가하는 값이다 -> auto_increment 값
    private Long id;

    @NotNull
    private String todo;
}
