package com.example.projectXX.repository;


import com.example.projectXX.enums.Mark;
import com.example.projectXX.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface UserRep  extends JpaRepository<User,Long> {
//    @Query(value = "select comment from Comment " +
//            "c inner join c.user u where u.id = :user_id " +
//            "and c.mark <> com.example.projectXX.enums.Mark.LIKE")
//    List<Comment> getLikeComments(@Param("user_id") Long user_id);
//
//    @Query(value = "select p from Comment " +
//            "p inner join p.user c where c.id = :user_id " +
//            "and p.status  in :mark")
//    List<Comment> getUserComments(@Param("user_id") Long user_id,
//                                    @Param ("mark")List<Mark> status);

}
