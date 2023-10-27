package com.lulu.Lulu02_Mono_recap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.Lulu02_Mono_recap.Entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {

}
