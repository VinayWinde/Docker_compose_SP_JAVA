package com.DocCompose.Compose;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Book,Integer> {
}
