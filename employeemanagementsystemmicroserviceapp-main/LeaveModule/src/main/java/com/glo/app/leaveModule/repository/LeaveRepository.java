package com.glo.app.leaveModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glo.app.leaveModule.model.Leave;


public interface LeaveRepository extends JpaRepository<Leave,Long> {
}

