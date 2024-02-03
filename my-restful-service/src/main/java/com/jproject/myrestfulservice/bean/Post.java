package com.jproject.myrestfulservice.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩, 사용자 데이터를 조회할 때 즉시 가져오는 것이 아니라 필요한 시점에 가져온다.
    @JsonIgnore
    private User user;
}
