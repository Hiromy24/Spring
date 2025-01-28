package org.hiromy.springpersonalweb.repository;

import org.hiromy.springpersonalweb.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
