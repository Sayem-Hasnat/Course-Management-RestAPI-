package com.synesisit.courseManagement.repository;

import com.synesisit.courseManagement.entity.Role;
import com.synesisit.courseManagement.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
