package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmpolyeeSkills;

public interface EmployeeSkillRepository extends JpaRepository<EmpolyeeSkills, Integer> {
	
	
	@Query(nativeQuery = true,
value = "select * from punnya_empskills where skill_name=:skillName and skill_experience=:skillExperiance")
	public List<EmpolyeeSkills> getBySkillNameAndExperience(@Param("skillName") String skillName,@Param("skillExperiance") double experience);
	
	
	@Query(nativeQuery = true,
			value = "select * from punnya_empskills where emp_id=:empId , approved_by=:approvedBy andskill_status=:status ")
				public List<EmpolyeeSkills> getByIdapprovedAndStatus(@Param("empId") int empId,@Param("approvedBy") String approvedBy,@Param("status") String status);
	
}
